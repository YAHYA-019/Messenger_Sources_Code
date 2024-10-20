package X;

import java.util.HashMap;

/* renamed from: X.67s, reason: invalid class name */
/* loaded from: 67s.class */
public final class C67s {
    public static final String[] A09 = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    public 68S[] A02;
    public 68S[] A03;
    public 68S[] A04;
    public final AnonymousClass251 A05;
    public final boolean A06;
    public final boolean A07;
    public final 3pW[] A08 = new 3pW[11];
    public int A00 = 0;
    public boolean A01 = false;

    public C67s(AnonymousClass253 anonymousClass253, AnonymousClass251 anonymousClass251) {
        this.A05 = anonymousClass251;
        this.A06 = anonymousClass253.A07();
        this.A07 = anonymousClass253.A09(AnonymousClass260.A0K);
    }

    public static 24S A00(C27T c27t, C67s c67s, 3pW r303, 68S[] r304) {
        if (!c67s.A01 || r303 == null) {
            return null;
        }
        int i = 0;
        if (r304 != null) {
            int length = r304.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (r304[i2] == null) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        AnonymousClass253 anonymousClass253 = c27t._config;
        24S A0H = r303.A0H(i);
        AnonymousClass248 A02 = anonymousClass253.A02();
        if (A02 != null) {
            68H A0I = r303.A0I(i);
            Object A0a = A02.A0a(A0I);
            if (A0a == null) {
                return A02.A0D(A0H, anonymousClass253, A0I);
            }
            A0H = A0H.A0H(c27t.A0K(A0a));
        }
        return A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0109, code lost:
    
        if ("valueOf".equals(r0.A05()) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003b, code lost:
    
        if ((!r304) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C67s r301, X.3pW r302, int r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67s.A01(X.67s, X.3pW, int, boolean):boolean");
    }

    public void A02(3pW r302, 68S[] r303, int i, boolean z) {
        if (r302.A0H(i) instanceof C31a) {
            if (A01(this, r302, 10, z)) {
                this.A02 = r303;
            }
        } else if (A01(this, r302, 8, z)) {
            this.A03 = r303;
        }
    }

    public void A03(3pW r302, 68S[] r303, boolean z) {
        Integer valueOf;
        Object put;
        if (A01(this, r302, 9, z)) {
            int length = r303.length;
            if (length > 1) {
                HashMap A0u = AnonymousClass001.A0u();
                int i = 0;
                do {
                    String str = r303[i]._propName._simpleName;
                    if ((!str.isEmpty() || r303[i].A0B() == null) && (put = A0u.put(str, (valueOf = Integer.valueOf(i)))) != null) {
                        throw 1BK.A0f("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{str, put, valueOf, 27C.A06(this.A05.A05._class)});
                    }
                    i++;
                } while (i < length);
            }
            this.A04 = r303;
        }
    }
}
