import java.util.Scanner;

    class onlineBankingss{
        float balance = 0;

        public void menu() {
            System.out.println("********** Welcome My Online Banking ***********");
            System.out.println("Enter Your Choice ✅✅");
            System.out.println("1. Check Balance A/C ✔");
            System.out.println("2. Deposit Money 👈");
            System.out.println("3. Withdrawal Money 👈");
            System.out.println("4. Exit 🙏");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    checkBallence();
                    break;
                case 2:
                    Deposit();
                    break;
                case 3:
                    Withdrawal();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter vailed Choice");
            }
        }

        public  void checkBallence() {
            System.out.println("Your Current Balance is " + " ₹" +balance);
            System.out.println("__________________******************____________________");
            menu();

        }

        public  void Deposit() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Amount for Deposit");
            float depNum = sc.nextFloat();
            balance +=depNum;
            System.out.println("Your Amount " + " ₹"+ depNum + " is successfully deposit");
            System.out.println("__________________******************____________________");
            menu();
        }

        public  void Withdrawal() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Amount for Withdrawal");
            float withNum = sc.nextFloat();
            if (balance < withNum){
                System.out.println("Insufficient Balance:");
            }else {
            balance-=withNum;
            System.out.println("Your Amount " + " ₹" + withNum + " is successfully Withdrawal");
            }
            System.out.println("__________________******************____________________");
            menu();
        }
    }
    public class OnlineBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        onlineBankingss on = new onlineBankingss();
            on.menu();
    }
}
