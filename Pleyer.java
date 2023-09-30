public class Pleyer {

    public static void main(String[] args) {
        System.out.println("-----All Betsman Name-----");
        System.out.println();
        Batsman bat = new Batsman();
        bat.get();
        System.out.println();
        System.out.println("-----All Bowler Name-----");
        System.out.println();
        Bowler boll = new Bowler();
        boll.show();
    }

}

class CricketPlayer {
    String a = "Kohli";
    String b = " Sharma";
    String c = " Pandya";
    String d = " Rahul";
    String e = "Mohammed";
    String f = "Bumra";
    String g = "Shubhamn ";
    String h = "paras hakur";
    String i = "ashish";
    String j = " Ashwin";
    String k = "MS Dhoni";
    String l = "Shikhar";
}

class Batsman extends CricketPlayer {
    void get() {
        System.out.println("Batsman = " + k);
        System.out.println("Batsman = " + b);
        System.out.println("Batsman = " + a);
        System.out.println("Batsman = " + c);
        System.out.println("Batsman = " + d);
        System.out.println("Batsman = " + g);
        System.out.println("Batsman = " + i);
    }
}

class Bowler extends CricketPlayer {
    void show() {
        System.out.println("Bowler = " + e);
        System.out.println("Bowler = " + f);
        System.out.println("Bowler = " + h);
        System.out.println("Bowler = " + i);
        System.out.println("Bowler = " + j);
    }
}