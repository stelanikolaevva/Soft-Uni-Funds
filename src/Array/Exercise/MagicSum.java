    package Array.Exercise;

    import java.util.Arrays;
    import java.util.Scanner;

    public class MagicSum {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int givenNumber=Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < numbers.length-1; i++) {
                int sum=0;
                for (int j = i+1; j < numbers.length; j++) {
                    int pair=numbers[i]+numbers[j];
                    if(pair==givenNumber){
                        System.out.printf("%d %d%n",numbers[i],numbers[j]);
                    }
                }

            }
        }
    }
