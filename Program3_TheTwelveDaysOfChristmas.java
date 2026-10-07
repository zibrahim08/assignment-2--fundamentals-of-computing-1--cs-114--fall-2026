public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    int day = 1;
    String suffix = "st";
    for( day = 1; day <= 12; day++) {
      switch (day) {
        case (1):
          suffix = "st";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case (2):
          suffix = "nd";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case (3):
          suffix = "rd";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 12:
        case 11:
        case 10:
        case 9:
        case 8:
        case 7:
        case 6:
        case 5:
        case 4:
          suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;
      }
    }
  }
}
