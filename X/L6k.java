package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: L6k.class */
public abstract class L6k {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v111, types: [int] */
    /* JADX WARN: Type inference failed for: r0v119, types: [int] */
    /* JADX WARN: Type inference failed for: r0v140, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.MCx r301, java.lang.StringBuilder r302, int r303) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L6k.A00(X.MCx, java.lang.StringBuilder, int):void");
    }

    public static void A01(Object obj, String str, StringBuilder sb, int i) {
        K5U k5u;
        if (obj instanceof List) {
            Iterator A1G = GOn.A1G(obj);
            while (A1G.hasNext()) {
                A01(A1G.next(), str, sb, i);
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            Iterator A0y = AnonymousClass001.A0y((java.util.Map) obj);
            while (A0y.hasNext()) {
                A01(A0y.next(), str, sb, i);
            }
            return;
        }
        sb.append('\n');
        int i2 = i;
        while (true) {
            int i3 = i2;
            if (i3 <= 0) {
                break;
            }
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(A00, 0, i4);
            i2 = i3 - i4;
        }
        if (!str.isEmpty()) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(Character.toLowerCase(JQx.A00(str)));
            int i5 = 1;
            while (true) {
                int i6 = i5;
                if (i6 >= str.length()) {
                    break;
                }
                A0k.append(Character.toLowerCase(JR1.A01(str, A0k, i6)));
                i5 = i6 + 1;
            }
            str = A0k.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            Lj3 lj3 = Lj3.A00;
            k5u = new K5U(((String) obj).getBytes(KdB.A03));
        } else {
            if (!(obj instanceof Lj3)) {
                if (obj instanceof K5Q) {
                    sb.append(" {");
                    A00((Ld7) obj, sb, i + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                } else {
                    int i7 = i + 2;
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    A01(entry.getKey(), "key", sb, i7);
                    A01(entry.getValue(), "value", sb, i7);
                }
                sb.append("\n");
                while (i > 0) {
                    int i8 = 80;
                    if (i <= 80) {
                        i8 = i;
                    }
                    sb.append(A00, 0, i8);
                    i -= i8;
                }
                sb.append("}");
                return;
            }
            sb.append(": \"");
            k5u = (Lj3) obj;
        }
        sb.append(KYA.A00(k5u));
        sb.append('\"');
    }
}
