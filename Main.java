import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      String command;
      System.out.println("すごろくゲーム");
      System.out.println("ちょうど50になるとゴールです。");
      System.out.println("50を過ぎると、その分戻ります");
      System.out.println("Enterを押すとダイスを投げます。「exit」と入力してからEnterを押すと終了します。");
      int step = 0;

      do {
        command = sc.nextLine();
        int n = dice();
        System.out.println("Dice:" + n);

        step += n;
        if(step == 50) {
          System.out.println("GOAL!!");
          break;
        } else if(step > 50) {
          step = 50 - (step - 50);
        }
        System.out.println("Step:" + step);
      } while(!(command.equals("exit")));


      sc.close();
    }

    static int dice() {
      return 1;
    }
}
