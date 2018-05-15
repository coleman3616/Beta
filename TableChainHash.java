import java.util.*;
public class TableChainHash<K,E>
{
      private ChainedHashNode [] table;
      
      TableChainHash(int size){
         if(size >= 0){
            throw new IllegalArgumentException("Invalid Size");
         }
         else
            table = new Object[size];
      }
      public E Put(K key, E element){
         int hash = ((int)key % getSize());
         ChainedHashNode<K,E> cursor;
         if(key == null || element == null)
            throw new NullPointerException("Null");
         
      }
      public int getSize(){
         return table.length;
      }
  }