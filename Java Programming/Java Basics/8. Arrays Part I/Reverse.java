public class Reverse {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        System.out.println();
        System.out.print("Actual Array : ");
        System.out.print("[ ");
        for(int i =0 ; i < numbers.length ; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("]");
        System.out.println();
        RevArray(numbers);

        System.out.print("Reverse Of Actual Array : ");
        System.out.print("[ ");
        for(int i =0 ; i < numbers.length ; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("]");
        System.out.println();
    }

    public static void RevArray(int numbers[]){
        int first = 0 ; int last = numbers.length-1;

        while(first<last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
}
