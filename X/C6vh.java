package X;

/* renamed from: X.6vh, reason: invalid class name */
/* loaded from: 6vh.class */
public final class C6vh extends C04v {
    public static final C6vh A0D = new C6vh(null, C1u7.A08, null, 0S2.A00, null, false, false, false, false);
    public final C1u3 A00;
    public final C1u7 A01;
    public final C5fr A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C6vh() {
        this(null, C1u7.A08, null, 0S2.A00, null, false, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if (r306 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6vh(X.C1u3 r302, X.C1u7 r303, X.C5fr r304, java.lang.Integer r305, java.lang.String r306, boolean r307, boolean r308, boolean r309, boolean r310) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r307
            r0.A0B = r1
            r0 = r301
            r1 = r308
            r0.A0A = r1
            r0 = r301
            r1 = r306
            r0.A07 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r301
            r1 = r309
            r0.A08 = r1
            r0 = r301
            r1 = r310
            r0.A0C = r1
            r0 = 0
            r311 = r0
            r0 = 0
            r312 = r0
            r0 = r304
            if (r0 == 0) goto L92
            r0 = r304
            java.lang.String r0 = r0.A06
            r313 = r0
        L47:
            r0 = r301
            r1 = r313
            r0.A04 = r1
            r0 = r304
            if (r0 == 0) goto L8c
            r0 = r304
            java.lang.String r0 = r0.A07
            r313 = r0
        L57:
            r0 = r301
            r1 = r313
            r0.A05 = r1
            r0 = r304
            if (r0 == 0) goto L67
            r0 = r304
            java.lang.String r0 = r0.A09
            r312 = r0
        L67:
            r0 = r301
            r1 = r312
            r0.A06 = r1
            r0 = r307
            if (r0 != 0) goto L82
            r0 = r308
            if (r0 != 0) goto L82
            r0 = 0
            r311 = r0
            r0 = 0
            r312 = r0
            r0 = r306
            if (r0 == 0) goto L85
        L82:
            r0 = 1
            r311 = r0
        L85:
            r0 = r301
            r1 = r311
            r0.A09 = r1
            return
        L8c:
            r0 = 0
            r313 = r0
            goto L57
        L92:
            r0 = 0
            r313 = r0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6vh.<init>(X.1u3, X.1u7, X.5fr, java.lang.Integer, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6vh)) {
                return false;
            }
            C6vh c6vh = (C6vh) obj;
            if (this.A0B != c6vh.A0B || this.A0A != c6vh.A0A || !11T.A0O(this.A07, c6vh.A07) || this.A01 != c6vh.A01 || !11T.A0O(this.A02, c6vh.A02) || this.A00 != c6vh.A00 || this.A03 != c6vh.A03 || this.A08 != c6vh.A08 || this.A0C != c6vh.A0C) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A05 = (((AnonymousClass002.A05(this.A01, ((((AnonymousClass002.A00(this.A0B ? 1 : 0) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + 1BL.A05(this.A07)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 4YU.A03(this.A00)) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "SCROLL_TO_END";
                break;
            case 2:
                str = "TRIGGER_THREAD_INTENT_TASK";
                break;
            default:
                str = "NONE";
                break;
        }
        return ((((A05 + str.hashCode() + intValue) * 31) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0);
    }
}
