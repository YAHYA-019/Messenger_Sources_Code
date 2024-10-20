package X;

import com.facebook.acra.constants.ActionId;
import java.text.BreakIterator;

/* renamed from: X.15m, reason: invalid class name */
/* loaded from: 15m.class */
public abstract class C15m {
    public static void A00(String str, BreakIterator breakIterator) {
        int length = str.length();
        int current = breakIterator.current();
        if (current >= length || current == -1) {
            throw AnonymousClass001.A0L("Hex string must have 2 characters, found 0");
        }
        int codePointAt = str.codePointAt(current);
        if (!A01(codePointAt)) {
            throw AnonymousClass001.A0L(0Pz.A0j("First hex string character ", new String(new int[]{codePointAt}, 0, 1), " is not a valid hex digit"));
        }
        int next = breakIterator.next();
        if (next >= length || next == -1) {
            throw AnonymousClass001.A0L("Hex string must have 2 characters, found 1");
        }
        int codePointAt2 = str.codePointAt(next);
        if (!A01(codePointAt2)) {
            throw AnonymousClass001.A0L(0Pz.A0j("Second hex string character ", new String(new int[]{codePointAt2}, 0, 1), " is not a valid hex digit"));
        }
    }

    public static boolean A01(int i) {
        if (i < 48) {
            return false;
        }
        if (i <= 57) {
            return true;
        }
        if (i < 65) {
            return false;
        }
        if (i > 70) {
            return i >= 97 && i <= 102;
        }
        return true;
    }

    public static boolean A02(int i) {
        if (i == 33 || i == 36 || i == 59 || i == 61) {
            return true;
        }
        switch (i) {
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r301 > r302) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(int r301) {
        /*
            r0 = 65
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 < r1) goto L4c
            r0 = 90
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 <= r1) goto L20
            r0 = 97
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 < r1) goto L5a
            r0 = 122(0x7a, float:1.71E-43)
            r302 = r0
        L1b:
            r0 = r301
            r1 = r302
            if (r0 > r1) goto L5a
        L20:
            r0 = 1
            r302 = r0
        L22:
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L4a
            r0 = 45
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L4a
            r0 = 46
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L4a
            r0 = 95
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L4a
            r0 = 126(0x7e, float:1.77E-43)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L4a
            r0 = 0
            r303 = r0
        L4a:
            r0 = r303
            return r0
        L4c:
            r0 = 48
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 < r1) goto L5a
            r0 = 57
            r302 = r0
            goto L1b
        L5a:
            r0 = 0
            r302 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15m.A03(int):boolean");
    }
}
