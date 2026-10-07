public class Program1_CountFlips {
  public static void main(String[] args) {
    Coin myCoin = new Coin();
    int headsCount = 0;
    int tailsCount = 0;
    for (int Count = 1;Count <= 100;Count++){
      myCoin.flip();
      if (myCoin.isHeads()) {
        headsCount++;
      } else {
        tailsCount++;
      }
    }
    System.out.println("Heads:" + headsCount);
    System.out.println("Tails:" + tailsCount);
  }
}
