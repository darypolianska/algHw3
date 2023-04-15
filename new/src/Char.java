public class Char {
    public static void main(String[] args) {
        char[] arr = {'6', 'x','[', '0', 'd', '1', 'a', '8'};
        char[] result = selectionSort(arr);
        outputResult(result);
    }
    static char[] selectionSort(char[] arr){
        int size = arr.length;

        for(int step=0;step<size-1;step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i] < arr[min_idx]) {
                    min_idx = i;
                }
            }
            char temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;


        }
        return arr;

    }
    static void outputResult(char[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
