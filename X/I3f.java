package X;

/* loaded from: I3f.class */
public final class I3f {
    public final 8Lt A00;
    public final GjN A01;
    public final GjR A02;
    public final GjO A03;
    public final Integer A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I3f() {
        /*
            r301 = this;
            java.lang.Integer r0 = X.0S2.A00
            r302 = r0
            X.8Lt r0 = new X.8Lt
            r303 = r0
            r0 = r303
            r0.<init>()
            X.GjO r0 = new X.GjO
            r304 = r0
            r0 = r304
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            X.GjN r0 = new X.GjN
            r305 = r0
            r0 = r305
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r306 = r0
            X.GjR r0 = new X.GjR
            r307 = r0
            r0 = r307
            r1 = r306
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r301
            r1 = r303
            r2 = r305
            r3 = r307
            r4 = r304
            r5 = r302
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3f.<init>():void");
    }

    public I3f(8Lt r302, GjN gjN, GjR gjR, GjO gjO, Integer num) {
        7zT.A1W(num, r302, gjO, gjN);
        this.A04 = num;
        this.A00 = r302;
        this.A03 = gjO;
        this.A01 = gjN;
        this.A02 = gjR;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.video.groot.integration.profile.base.PlayerProfileConfig");
            I3f i3f = (I3f) obj;
            if (!11T.A0O(this.A00, i3f.A00) || !11T.A0O(this.A03, i3f.A03) || !11T.A0O(this.A01, i3f.A01) || !11T.A0O(this.A02, i3f.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "UNIFIED_PLAYER_VDD";
                break;
            case 2:
                str = "STORIES";
                break;
            case 3:
                str = "MARKETPLACE";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return 1BK.A03(this.A02, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A03, AnonymousClass002.A05(this.A00, (str.hashCode() + intValue) * 31))));
    }
}
