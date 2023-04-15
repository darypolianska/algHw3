public class Char {
    public static void main(String[] args) {
        char[] arr = {'6', 'x','[', '0', 'd', '1', 'a', '8'};
        char[] result = bubbleSort(arr);
        outputResult(result);

    }

    static char[] bubbleSort(char[] arr){
        int size = arr.length;

        for(int step = 0; step < size-1; step++){
            for (int i = 0; i < size - step - 1; i++){
                if (arr[i] > arr[i+1]){
                    char temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

    static void outputResult(char[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
