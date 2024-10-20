package X;

import com.google.common.base.Objects;

/* loaded from: C9o.class */
public abstract class C9o {
    public static Integer A00(String str) {
        Integer num;
        Integer[] A00 = 0S2.A00(2);
        int length = A00.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                num = 0S2.A00;
                break;
            }
            num = A00[i2];
            if (Objects.equal(A01(num), str)) {
                break;
            }
            i = i2 + 1;
        }
        return num;
    }

    public static String A01(Integer num) {
        return 1 - num.intValue() != 0 ? "DEFAULT" : "OPEN_GRAPH";
    }
}
