public class New {
    public static void main(String[] args) {
        String[] arr = {"new", "bird", "apple", "to", "fifty"};
        String[] result = bubbleSort(arr);
        outputResult(result);

    }

    static String[] bubbleSort(String[] arr){
        int size = arr.length;

        for(int step = 0; step < size-1; step++){
            for (int i = 0; i < size - step - 1; i++){
                if (arr[i].compareTo(arr[i+1]) > 0){
                    String temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

    static void outputResult(String[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
