package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.18y, reason: invalid class name */
/* loaded from: 18y.class */
public final class C18y {
    public final Integer A00;
    public final java.util.Map A01 = AnonymousClass001.A0u();

    public C18y(Integer num) {
        this.A00 = num;
    }

    public static Iterator A00(16Z r301, C16b c16b, java.util.Map map, byte b) {
        A01(r301, c16b);
        List list = (List) map.get(c16b);
        r301.A02(b, list.size());
        return list.iterator();
    }

    public static void A01(16Z r301, C16b c16b) {
        int i;
        byte b = c16b.A00;
        short s = c16b.A01;
        if (b == 2) {
            r301.A00 = Short.valueOf(s);
            return;
        }
        byte b2 = 16Z.A05[b];
        short s2 = r301.A02;
        if (s <= s2 || (i = s - s2) > 15) {
            r301.A03.write(b2);
            16Z.A00(r301, (s >> 31) ^ (s << 1));
        } else {
            r301.A03.write((byte) ((i << 4) | b2));
        }
        r301.A02 = s;
    }

    public static void A02(16Z r301, C16b c16b, java.util.Map map) {
        if (!map.containsKey(c16b) || map.get(c16b) == null) {
            return;
        }
        A01(r301, c16b);
        int intValue = ((Number) map.get(c16b)).intValue();
        16Z.A00(r301, (intValue >> 31) ^ (intValue << 1));
    }

    public static void A03(16Z r301, C16b c16b, java.util.Map map) {
        if (!map.containsKey(c16b) || map.get(c16b) == null) {
            return;
        }
        A01(r301, c16b);
        r301.A04((String) map.get(c16b));
    }

    public static void A04(16Z r301, C16b c16b, java.util.Map map) {
        int i;
        if (!map.containsKey(c16b) || map.get(c16b) == null) {
            return;
        }
        A01(r301, c16b);
        boolean booleanValue = ((Boolean) map.get(c16b)).booleanValue();
        Short sh = r301.A00;
        int i2 = 1;
        if (sh == null) {
            if (!booleanValue) {
                i2 = 2;
            }
            r301.A03.write(i2);
            return;
        }
        short shortValue = sh.shortValue();
        if (!booleanValue) {
            i2 = 2;
        }
        short s = r301.A02;
        if (shortValue <= s || (i = shortValue - s) > 15) {
            r301.A03.write(i2);
            16Z.A00(r301, (shortValue >> 31) ^ (shortValue << 1));
        } else {
            r301.A03.write((byte) ((i << 4) | i2));
        }
        r301.A02 = shortValue;
        r301.A00 = null;
    }

    public static void A05(16Z r301, C16b c16b, java.util.Map map) {
        if (!map.containsKey(c16b) || map.get(c16b) == null) {
            return;
        }
        A01(r301, c16b);
        r301.A03(((Number) map.get(c16b)).longValue());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(X.16Z r302) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18y.A06(X.16Z):void");
    }
}
