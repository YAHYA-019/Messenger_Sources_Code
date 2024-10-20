package X;

import java.util.LinkedHashMap;

/* renamed from: X.9ec, reason: invalid class name */
/* loaded from: 9ec.class */
public abstract class C9ec {
    public static final java.util.Map A00;

    static {
        96Z[] values = 96Z.values();
        int length = values.length;
        int A002 = 02J.A00(length);
        if (A002 < 16) {
            A002 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A002);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A00 = linkedHashMap;
                return;
            } else {
                96Z r0 = values[i2];
                linkedHashMap.put(Integer.valueOf(r0.id), r0);
                i = i2 + 1;
            }
        }
    }

    public static final 2Zs A00(96Z r301) {
        int ordinal = r301.ordinal();
        if (ordinal == 0) {
            return 2Zo.A00();
        }
        if (ordinal == 1) {
            return 2Zo.A03(true);
        }
        if (ordinal == 2) {
            return 2Zo.A02(0S2.A01);
        }
        if (ordinal == 3) {
            return 2Zo.A04(false);
        }
        throw 1BK.A1F();
    }
}
