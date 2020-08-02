/*
Design a HashSet without using any built-in hash table libraries.

To be specific, your design should include these functions:

add(value): Insert a value into the HashSet. 
contains(value) : Return whether the value exists in the HashSet or not.
remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.

Note:

All values will be in the range of [0, 1000000].
The number of operations will be in the range of [1, 10000].
Please do not use the built-in HashSet library.
*/
class Aug2ndMyHashSet 
{
    boolean[] arr = new boolean[100];// starting with 100 elements, can start with any number of elements
    /** Initialize your data structure here. */
    public MyHashSet() 
    {
        //Just to make things easy, global datastructures used    
    }
    
    public void add(int key) 
    {
        if(key>=arr.length) // if array is too small to accomodate key, extend it.
            extend(key);
        arr[key]=true;//else added
    }

    public void remove(int key) 
    {
        if(key<arr.length) // If length small than only can exist
            arr[key]=false;
    }

    public boolean contains(int key) 
    {
        if(key>=arr.length) // key cannot be in array if array's length < key
            return false;
        return arr[key];//return if found
    }
    
    public void extend(int key)
    {
        arr= Arrays.copyOf(arr, key+2);  // extend array to one more item than necessary, we need "key" items. 
									     // we give "key+1" items to reduce collisions.
    }
}




// Can be done using datastructures like arraylist also, but operations like contains are done in constant time for hashset,while arraylist would take O(n)

// import java.util.ArrayList;
// class MyHashSet 
// {
//     ArrayList<Integer> list;
//     /** Initialize your data structure here. */
    
//     public MyHashSet() 
//     {
//         list = new ArrayList<Integer>();
//     }
    
//     public void add(int key) 
//     {
//         if(!list.contains(key))
//         {
//             list.add(key);
//         }
//     }
    
//     public void remove(int key) 
//     {
//         System.out.println("In remove");
//         if(list.contains(key))
//         {
//             list.remove( new Integer(key));
//         }
//     }
    
//     /** Returns true if this set contains the specified element */
//     public boolean contains(int key) 
//     {
//         if(list.contains(key))
//         {
            
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }
// }
