import java.util.ArrayList; 

 
public class HashNode<K, V> { 

    K key; 

    Integer value; 


    HashNode<K, V> next; 

    public HashNode(K key, Integer value) 

    { 

        this.key = key; 

        this.value = value; 

    } 

} 

  


class Map<K, V> 

{
    private ArrayList<HashNode<K, V>> bucketArray; 

    private int numBuckets; 

    private int size; 

 
    public Map() 

    { 

        bucketArray = new ArrayList<>(); 

     //   numBuckets = 30; 

       // size = 0; 
        //for (int i = 0; i < numBuckets; i++) 

          //  bucketArray.add(null); 

    } 

   

    public int size() { return size; } 

    public boolean isEmpty() { return size() == 0; } 

    private int getBucketIndex(K key) 

    { 

        int hashCode = key.hashCode(); 

        int index = hashCode % numBuckets; 

        return index; 

    } 
public void PrintArray() {
System.out.println(bucketArray);
}
public void add(K key,Integer value) 

    { 
        int bucketIndex = getBucketIndex(key); 

        HashNode<K, V> head = bucketArray.get(bucketIndex); 

 
        while (head != null) 

        { 

            if (head.key.equals(key)) 

            { 

                head.value = (value%10+5)%30; 

                return; 

            } 

            head = head.next; 

        } 

        size++; 

        head = bucketArray.get(bucketIndex); 

        HashNode<K, V> newNode = new HashNode<K, V>(key, value); 

        newNode.next = head; 

        bucketArray.set(bucketIndex, newNode); 
        if ((1.0*size)/numBuckets >= 0.7) 

        { 

            ArrayList<HashNode<K, V>> temp = bucketArray; 

            bucketArray = new ArrayList<>(); 

            numBuckets = 2 * numBuckets; 

            size = 0; 

            for (int i = 0; i < numBuckets; i++) 

                bucketArray.add(null); 

            for (HashNode<K, V> headNode : temp) 

            { 

                while (headNode != null) 

                { 

                    add(headNode.key, headNode.value); 

                    headNode = headNode.next; 

                } 

            } 

        } 

    }
}