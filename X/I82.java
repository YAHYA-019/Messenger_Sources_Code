package X;

import android.graphics.Rect;
import android.hardware.Camera;
import java.util.List;

/* loaded from: I82.class */
public abstract class I82 {
    public static final HX7 A0P = A03(0);
    public static final HX7 A0R = A03(1);
    public static final HX7 A0W = A03(2);
    public static final HX7 A0Z = A03(3);
    public static final HX7 A0Y = A03(60);
    public static final HX7 A0X = A03(4);
    public static final HX7 A0U = A03(5);
    public static final HX7 A0M = A03(6);
    public static final HX7 A02 = A03(55);
    public static final HX7 A0T = A03(7);
    public static final HX7 A0r = A03(8);
    public static final HX7 A0D = A03(9);
    public static final HX7 A0B = A03(10);
    public static final HX7 A00 = A03(11);
    public static final HX7 A07 = A03(12);
    public static final HX7 A09 = A03(13);
    public static final HX7 A0a = A03(14);
    public static final HX7 A0b = A03(15);
    public static final HX7 A0h = A03(16);
    public static final HX7 A0i = A03(17);
    public static final HX7 A0m = A03(18);
    public static final HX7 A0o = A03(19);
    public static final HX7 A0w = A03(20);
    public static final HX7 A0g = A03(21);
    public static final HX7 A0x = A03(59);
    public static final HX7 A0L = A03(22);
    public static final HX7 A0s = A03(23);
    public static final HX7 A0z = A03(24);
    public static final HX7 A11 = A03(25);
    public static final HX7 A0t = A03(26);
    public static final HX7 A0I = A03(27);
    public static final HX7 A0E = A03(30);
    public static final HX7 A0G = A03(31);
    public static final HX7 A0F = A03(32);
    public static final HX7 A0q = A03(33);
    public static final HX7 A0k = A03(34);
    public static final HX7 A10 = A03(58);
    public static final HX7 A0y = A03(35);
    public static final HX7 A0c = A03(36);
    public static final HX7 A0C = A03(37);
    public static final HX7 A0f = A03(38);
    public static final HX7 A0n = A03(39);
    public static final HX7 A0p = A03(40);
    public static final HX7 A0j = A03(41);
    public static final HX7 A0H = A03(42);
    public static final HX7 A0u = A03(43);
    public static final HX7 A0S = A03(44);
    public static final HX7 A0N = A03(45);
    public static final HX7 A0A = A03(46);
    public static final HX7 A08 = A03(47);
    public static final HX7 A01 = A03(48);
    public static final HX7 A0O = A03(53);
    public static final HX7 A0d = A03(54);
    public static final HX7 A0Q = A03(56);
    public static final HX7 A0V = A03(57);
    public static final HX7 A0e = A03(65);
    public static final HX7 A03 = A03(66);
    public static final HX7 A0v = A03(62);
    public static final HX7 A0J = A03(63);
    public static final HX7 A0K = A03(64);
    public static final HX7 A04 = A03(49);
    public static final HX7 A05 = A03(50);
    public static final HX7 A06 = A03(51);
    public static final HX7 A0l = A03(52);

    public static HX7 A03(int i) {
        return new HX7(i);
    }

    public static String A04(List list) {
        if (list.isEmpty()) {
            return "()";
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append('(');
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return 4YV.A0x(A0k2);
            }
            Camera.Area area = (Camera.Area) list.get(i2);
            A0k2.append('[');
            Rect rect = area.rect;
            rect.getClass();
            A0k2.append(rect.flattenToString());
            A0k2.append(' ');
            A0k2.append(area.weight);
            A0k2.append("] ");
            i = i2 + 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a9, code lost:
    
        if (r0.A0X.intValue() == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02df, code lost:
    
        r307 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02de, code lost:
    
        return java.lang.Boolean.valueOf(r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02d6, code lost:
    
        if (X.GOq.A0D(X.I82.A0s, r0) == 17) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04b5, code lost:
    
        if (X.GOq.A0D(X.I82.A0s, r0) == 17) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04e8, code lost:
    
        if (r0.A0G.intValue() != 0) goto L204;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:140:0x0316. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0026. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A05(X.HX7 r302) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I82.A05(X.HX7):java.lang.Object");
    }
}
