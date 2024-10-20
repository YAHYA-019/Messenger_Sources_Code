package X;

/* renamed from: X.7l0, reason: invalid class name */
/* loaded from: 7l0.class */
public abstract class C7l0 {
    public static final Integer A00(int i) {
        Integer num;
        Integer[] A00 = 0S2.A00(3);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                num = 0S2.A0C;
                break;
            }
            num = A00[i3];
            if (C7l1.A00(num) == i) {
                break;
            }
            i2 = i3 + 1;
        }
        return num;
    }
}
