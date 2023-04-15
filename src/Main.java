
public class Main {
    public static void main(String[] args) {
        float[] arr = {67.9F, 32.9F, 1.98F, 7.5F, -6.89F};
        float[] result = bubbleSort(arr);
        outputResult(result);

    }

    static float[] bubbleSort(float[] arr){
        int size = arr.length;

        for(int step = 0; step < size-1; step++){
            for (int i = 0; i < size - step - 1; i++){
                if (arr[i] > arr[i+1]){
                    float temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

    static void outputResult(float[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}