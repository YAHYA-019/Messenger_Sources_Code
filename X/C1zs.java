package X;

import java.util.NoSuchElementException;

/* renamed from: X.1zs, reason: invalid class name */
/* loaded from: 1zs.class */
public abstract class C1zs {
    public static final Integer A00(Integer num) {
        Integer num2;
        if (num != null) {
            Integer[] A00 = 0S2.A00(3);
            int length = A00.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    throw new NoSuchElementException(DKB.A00(6));
                }
                num2 = A00[i2];
                if (C1zt.A00(num2) == num.intValue()) {
                    break;
                }
                i = i2 + 1;
            }
        } else {
            num2 = 0S2.A0C;
        }
        return num2;
    }
}
