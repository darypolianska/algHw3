public class Stri {
    public static void main(String[] args) {
        String[] arr = {"new", "bird", "apple", "to", "fifty"};
        String[] result = selectionSort(arr);
        outputResult(result);
    }
    static String[] selectionSort(String[] arr){
        int size = arr.length;

        for(int step=0;step<size-1;step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i].compareTo(arr[min_idx]) < 0) {
                    min_idx = i;
                }
            }
            String temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;


        }
        return arr;

    }
    static void outputResult(String[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
