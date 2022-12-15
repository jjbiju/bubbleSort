public class BubbleSorter {
    public static void main(String[] args){

        int[] a = {1, 1, 1, 1, 1};

        System.out.println("Array a conclusion: ");
        sortArray(a);


        int[] b = {1, -9, 1, 18, 1};

        System.out.println("Array b conclusion: ");
        sortArray(b);





        int[] c = {100, -90, 10, 180, -1};

        System.out.println("Array c conclusion: ");
        sortArray(c);

        System.out.println("\n\nResult of sorting a");

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\nResult of sorting b");

        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }

        System.out.println("\nResult of sorting c");

        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }



    }


    /*
    Bubble sort function, which uses the following logic: take two pointers and make them start out pointing to the 0th
    and first index respectively. Compare, and swap if necessary. Then, increment both pointers such that they
    point to 1st and second element. Compare and swap if necessary. Repeat. At the end of each pass through, we will
    "bubble up" the largest element in the unsorted portion.

    It is important to note that each pass through the elements, the function will keep a numSwap tracker such that it will
    increment numSwaps each time a swap is performed. Thus, if we pass through all of the elements without swapping,
    this means that the list is already sorted. Best case: O(n). This best case is achieved when the list is already sorted.
    For example, if the list is 1 2 3, then 1 will be compared to 2 and 2 will be compared to 3 such that at the end of this pass through
    numSwaps = 0. Thus, the list is sorted and we are done. Note that in any unsorted list, there will be at least one swap, so we can conclude
    if there are no swaps in a pass-through then the list is sorted.
     */
    public static void sortArray(int[] array){
        int size = array.length;
        int pointerLeft = 0;
        int pointerRight = 1;
        int numSwaps = 1;
        int lastValidIndex = size - 1;
        int numberOfPasses = 0;

        if(array.length == 0){
            return;
        }

        if(array.length == 1){
            return;
        }

        else{
            while(numSwaps > 0){
                // System.out.println("Iterating...\n");

                //Reset numSwaps for the current pass-through of elements and reset the pointers
                numSwaps = 0;
                pointerLeft = 0;
                pointerRight = 1;

                // Pass through each adjacent pair and bubble left item to the right if it is bigger
                while(pointerRight <= lastValidIndex){
                    // System.out.println("We are comparing adjacent elements " + array[pointerLeft] + " " + array[pointerRight]);
                    if(array[pointerLeft] > array[pointerRight]){
                        // Swap here and increment swap count

                        int temp = array[pointerLeft];
                        array[pointerLeft] = array[pointerRight];
                        array[pointerRight] = temp;

                        // System.out.println("We have swapped " + array[pointerLeft] + " " + array[pointerRight]);
                        numSwaps++;
                    }

                    // Increment pointers after comparison and possible swap
                    pointerLeft++;
                    pointerRight++;
                }
                lastValidIndex--;
                numberOfPasses++;
            }

            System.out.printf("took %d passes through the list to sort using bubble sort\n", numberOfPasses);
        }

    }
}
