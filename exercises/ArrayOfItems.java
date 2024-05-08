package exercises;

import java.util.Arrays;

public class ArrayOfItems {
  private int[] items;
  private int count = 0;

  public ArrayOfItems(int length) {
    items = new int [length];

  }

  private void throwIndexError (int index) {
    if(index >= count || index < 0)
      throw new IllegalArgumentException();
  }
  public void printArray () {
    //Two options
//    for(int i = 0; i< count; i++){
//      System.out.println(items[i]);
//    }
    System.out.println(Arrays.toString(items));
  }
  public void insert (int num) {
    if(items.length == count) {
      int[] newArray = new int[count*2];
            for (int i = 0; i <count; i++) {
        newArray[i] = items[i];
      }
        items = newArray;
    }
    items[count++] = num;
  }
  public void removeAt (int index) {
    throwIndexError(index);
    for(int i = index;i < count - 1; i++){
      items[i] = items[i+1];
    }
    count--;
  }

  public int indexOf (int item) {
    for (int i = 0; i < count; i++)
      if (items[i] == item)
        return i;
      return -1;
    }

    public int max () {
    //o(n)
    int maxNum = 0;
    for(int i = 0; i<count; i++ ){
      if(maxNum < items[i])
        maxNum = items[i];
      }
      return maxNum;
    }

    public ArrayOfItems intersect (ArrayOfItems itemsToCompare) {
      ArrayOfItems commonItems = new ArrayOfItems(count);
     for(int i = 0; i< count; i++){
         if(itemsToCompare.indexOf(items[i]) >= 0){
           commonItems.insert(items[i]);
         }
     }
     return commonItems;
    }

    public ArrayOfItems reverse () {
    ArrayOfItems reversedItems = new ArrayOfItems(count);
    for(int i = count -1; i >= 0; i--){
      reversedItems.insert(items[i]);
    }
    return reversedItems;
    }

    public void insertAt (int index, int num){
      throwIndexError(index);
      if(items.length == count) {
        int[] newArray = new int[count*2];
        for (int i = 0; i <count; i++) {
          newArray[i] = items[i];
        }
        items = newArray;
      }
        for (int i = count - 1; i >= index; i--)
          items[i + 1] = items[i];

        items[index] = num;
        count++;
    }
}
