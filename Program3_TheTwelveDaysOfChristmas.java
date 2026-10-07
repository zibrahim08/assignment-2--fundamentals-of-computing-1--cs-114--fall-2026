public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    int day = 1;
    String suffix = "st";
    for( day = 1; day <= 12; day++) {
      switch (day) {
        case 12:
          suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 11:
          suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 10:
          suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 9: suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 8: suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 7: suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 6:
          suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 5:
          suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case 4:
          suffix = "th";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case (3):
          suffix = "rd";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case (2):
          suffix = "nd";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;

        case (1):
          suffix = "st";
          System.out.println("On the" + " " + day + suffix + " " + "day of Christmas my true love gave to me");
        break;
      }
    }
  }
}
