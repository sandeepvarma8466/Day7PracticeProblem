import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

//Workshop Problem - Gambling  Simulation Problem

public class GamblingSimulator {
    //
    public static class Pair {

        ArrayList<Integer>al;
        int amount , totalWinDays, totalLossOfDays , maxWonDay, maxLossDay;

        public Pair() {

        }
        public Pair(int amount, ArrayList<Integer>al, int totalWinDays, int totalLossOfDays, int maxWonDay , int maxLossDay) {
            this.al = al;
            this.totalWinDays = totalWinDays;
            this.totalLossOfDays =totalLossOfDays;
            this.amount = amount;
            this.maxWonDay = maxWonDay;
            this.maxLossDay = maxLossDay;
        }
    }


    public static void main(String[] args) {
        ArrayList<Pair> mal = new ArrayList<>();
        int amount_month = 0;

        while (amount_month >= 0) {
            amount_month = 0;
            int days = 0;
            ArrayList<Integer> dal = new ArrayList<>();

            int totalWinDays = 0;
            int totalLossDays = 0;
            int maxLossDay = 0;
            int maxWonDay = 0;

            while ( days < 30 ) {

                int dayStock = 100;
                while ( dayStock > 50 && dayStock < 150 ) {

                    int losswin = RamdomNumber(0,1);

                    if ( losswin == 0 ) {
                        dayStock--;
                    }
                    else {
                        dayStock++;
                    }
                }

                if (dayStock == 50) {
                    amount_month -= 50;
                    dal.add(50);
                    totalLossDays++;
                }
                else {
                    amount_month += 50;
                    dal.add(50);
                    totalWinDays++;
                }
                days++;

            }

            mal.add(new Pair(amount_month, dal ,totalWinDays, totalLossDays, maxWonDay, maxLossDay));

        }

        for ( int i = 0; i<mal.size(); i++) {
            Pair p = mal.get(i);
            System.out.println(p.al +"->"+"Total win days->"+p.totalWinDays+",Total loss days->"+p.totalLossOfDays+
                                "->[Total Amount won/loss in that month ="+ p.amount+"]");
        }
    }

    private static int RamdomNumber(int Min, int Max) {
        int r = (int) (Min + Math.random() * ((Max-Min) + 1));
        return r;
    }
}
