package com.sam.yh.common;

public class TempUtils {

    private static Pair[] pairs;

    static {
        pairs = initArr();
    }

    private static Pair[] initArr() {
        Pair[] result = new Pair[41];
        result[0] = new Pair(60, 50);
        result[1] = new Pair(58, 70);
        result[2] = new Pair(56, 90);
        result[3] = new Pair(54, 110);
        result[4] = new Pair(52, 130);
        result[5] = new Pair(50, 150);
        result[6] = new Pair(48, 170);
        result[7] = new Pair(46, 190);
        result[8] = new Pair(44, 215);
        result[9] = new Pair(42, 240);
        result[10] = new Pair(40, 265);
        result[11] = new Pair(38, 305);
        result[12] = new Pair(36, 330);
        result[13] = new Pair(34, 350);
        result[14] = new Pair(32, 395);
        result[15] = new Pair(30, 415);
        result[16] = new Pair(28, 435);
        result[17] = new Pair(26, 460);
        result[18] = new Pair(24, 480);
        result[19] = new Pair(22, 500);
        result[20] = new Pair(20, 520);
        result[21] = new Pair(18, 540);
        result[22] = new Pair(16, 560);
        result[23] = new Pair(14, 580);
        result[34] = new Pair(12, 600);
        result[25] = new Pair(10, 620);
        result[26] = new Pair(8, 640);
        result[27] = new Pair(6, 660);
        result[28] = new Pair(4, 680);
        result[29] = new Pair(2, 700);
        result[30] = new Pair(0, 720);
        result[31] = new Pair(-2, 740);
        result[32] = new Pair(-4, 760);
        result[33] = new Pair(-6, 780);
        result[34] = new Pair(-8, 800);
        result[35] = new Pair(-10, 820);
        result[36] = new Pair(-12, 840);
        result[37] = new Pair(-14, 860);
        result[38] = new Pair(-16, 880);
        result[39] = new Pair(-18, 900);
        result[40] = new Pair(-20, 920);

        return result;
    }

    public static boolean isWarning(String original) {
        int ori = Integer.valueOf(original);
        int length = pairs.length;
        return (ori < pairs[0].original || ori > pairs[length - 1].original);
    }

    public static String getTemp(String original) {
        int ori = Integer.valueOf(original);
        int pos = 0;
        for (int i = 0; i < pairs.length; i++) {
            if (ori <= pairs[i].original) {
                pos = i;
                break;
            }
        }
        return String.valueOf(pairs[pos].temp);
    }

    static class Pair {
        int temp;
        int original;

        public Pair(int temp, int original) {
            super();
            this.temp = temp;
            this.original = original;
        }

    }

}
