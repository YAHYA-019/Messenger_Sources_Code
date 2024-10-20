package X;

/* loaded from: Hob.class */
public final class Hob {
    public final C00i A00;
    public final C00i A01;
    public final 1CO A02;

    public Hob() {
        1BQ A00 = 1BQ.A00();
        this.A01 = A00;
        this.A00 = AbH.A0S();
        this.A02 = (1CO) A00.get();
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [X.Hga, java.lang.Object] */
    public Hga A00() {
        int A00;
        1CO r0;
        1G2 r02 = 5Jq.A0V;
        boolean z = false;
        int i = 0;
        C00i c00i = this.A00;
        String BD0 = 1BK.A0R(c00i).BD0(r02);
        if (!1JF.A0B(BD0)) {
            i = Integer.parseInt(BD0);
        }
        int i2 = 0;
        String BD02 = 1BK.A0R(c00i).BD0(5Jq.A0U);
        if (!1JF.A0B(BD02)) {
            i2 = Integer.parseInt(BD02);
        }
        if (i <= 0 || i2 <= 0) {
            1CO r03 = this.A02;
            if (2yD.A00(r03, 36593924520871609L) > 0) {
                i = 2yD.A00(r03, 36593924521068220L);
                i2 = 2yD.A00(r03, 36593924521002683L);
                A00 = 2yD.A00(r03, 36593924520937146L);
                if (i > 0 || i2 <= 0) {
                    i = 640;
                    i2 = 360;
                }
                r0 = this.A02;
                if (r0.Auy(36593924520871609L) == 1 && r0.Auy(36593924521133757L) == 1) {
                    z = true;
                }
                ?? obj = new Object();
                obj.A02 = i;
                obj.A01 = i2;
                obj.A00 = A00;
                obj.A03 = z;
                return obj;
            }
        }
        A00 = -1;
        if (i > 0) {
        }
        i = 640;
        i2 = 360;
        r0 = this.A02;
        if (r0.Auy(36593924520871609L) == 1) {
            z = true;
        }
        ?? obj2 = new Object();
        obj2.A02 = i;
        obj2.A01 = i2;
        obj2.A00 = A00;
        obj2.A03 = z;
        return obj2;
    }
}
