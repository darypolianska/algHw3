public class Main{
    public static void main(String[] args) {
        float[] arr = {435.9F, 77.9F, 7.89F, 7.56F,889.9F,-888.8F,-1.45F,1.8F};
        float[] result = selectionSort(arr);
        outputResult(result);
    }
    static float[] selectionSort(float[] arr){
        int size = arr.length;

        for(int step=0;step<size-1;step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i] < arr[min_idx]) {
                    min_idx = i;
                }
            }
            float temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;


        }
        return arr;

    }
    static void outputResult(float[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}