public class Main {
    public static void main(String[] args) {

        int []arr = {2,3,4,1,5,3,2,59};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is " +arr[index] +" at "+index);

    }

    public static int minValue(int []array){
        int min = array[0];
        int index =0;
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
                index=i;
            }
        }
        return index;
    }
}
