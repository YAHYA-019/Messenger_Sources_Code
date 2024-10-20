package X;

/* renamed from: X.Acw, reason: case insensitive filesystem */
/* loaded from: Acw.class */
public abstract class AbstractC1290Acw {
    public static final Integer A00(Integer num) {
        Integer[] A00 = 0S2.A00(2);
        int length = A00.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return 0S2.A00;
            }
            Integer num2 = A00[i2];
            int i3 = 1 - num2.intValue() != 0 ? 0 : 1;
            if (num != null && num.intValue() == i3) {
                return num2;
            }
            i = i2 + 1;
        }
    }
}
