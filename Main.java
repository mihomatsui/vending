public class Main {
    public static void main(String[] args) {
        System.out.println("お金を投入してください。");
        // お金を入れる処理
        int money = new java.util.Scanner(System.in).nextInt();
        while ( money < 160 ) {
            System.out.println("お金が足りません。");
            System.out.println("お金を入れなおしてください。");
            money = new java.util.Scanner(System.in).nextInt();
        }

        // お釣りの計算の処理
        int change = money - 160;
        // お釣りを表示する
        System.out.println("投入金額は" + money + "円なので、お釣りは" + change + "円です。");
        System.out.println("お買い上げありがとうございました！");
    }
}
