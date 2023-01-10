import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) throws Exception {
      Integer initialValue = 1;

      Scanner input = new Scanner(System.in);
      System.out.println("Digite o número desejado para realizar a pirâmide:");
      Integer userInt = Integer.parseInt(input.next());

      while(initialValue <= userInt) {
        String result = "";
        for(int j = 1; j <= initialValue; j++) {
          result += Integer.toString(initialValue);
        }
        System.out.println(result);
        initialValue++;
      }

      input.close();
    }
}
