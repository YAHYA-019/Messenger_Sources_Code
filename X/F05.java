package X;

/* loaded from: F05.class */
public abstract class F05 {
    public static Integer A00(String str) {
        Integer num;
        Integer[] A1a = DKD.A1a();
        int length = A1a.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                num = 0S2.A00;
                break;
            }
            num = A1a[i2];
            if (A01(num).equals(str)) {
                break;
            }
            i = i2 + 1;
        }
        return num;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "fade";
            case 2:
                return "none";
            default:
                return "default";
        }
    }
}
