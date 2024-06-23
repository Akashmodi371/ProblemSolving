public class heapInsert {

    public static int[] swap(int parent, int child, int[] heap) {
        int temp = heap[parent];
        heap[parent] = heap[child];
        heap[child] = temp;
        return heap;
    }

    public static int[] insert(int value, int size, int[] heap) {
        if (size == heap.length - 1) {
            System.out.println("Heap is full");
        } else {
            size = size + 1;
            heap[size] = value;

            int child = size;
            int parent = child / 2;

            while (parent >= 1 && heap[parent] > heap[child]) {
                heap = swap(parent, child, heap);
                child = parent;
                parent = child / 2;
            }
        }

        return heap;
    }

    public static void main(String[] args) {
        int[] heap = {0, 5, 25, 26, 100, 125, 150, 200}; // Added 0 as a placeholder for the root.
        int size = heap.length - 1;
        heap = insert(10, size, heap);

        for (int i = 1; i <= size; i++) {
            System.out.println(heap[i]);
        }
    }
}
