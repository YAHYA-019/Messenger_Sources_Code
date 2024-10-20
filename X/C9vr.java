package X;

/* renamed from: X.9vr, reason: invalid class name */
/* loaded from: 9vr.class */
public final class C9vr implements C3lu {
    public final /* synthetic */ 8Gh A00;

    public C9vr(8Gh r302) {
        this.A00 = r302;
    }

    @Override // X.C3lu
    public void BiW() {
        8Gh r0 = this.A00;
        9Zd r02 = r0.A0J;
        String str = "viewpointAgent";
        if (r02 != null) {
            r02.A04.A00();
            9Zd r03 = r0.A0J;
            if (r03 != null) {
                r03.A03.A02();
                9Yc r04 = r0.A0E;
                if (r04 != null) {
                    r04.A00 = true;
                    return;
                }
                str = "feedState";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.C3lu
    public void BlK(long j) {
        8Gh r0 = this.A00;
        9Zd r02 = r0.A0J;
        if (r02 != null) {
            r02.A03.A05(Long.valueOf(1Br.A01(r02.A02) - j));
            9Zd r03 = r0.A0J;
            if (r03 != null) {
                r03.A04.A01();
                return;
            }
        }
        11T.A0L("viewpointAgent");
        throw 0Q8.createAndThrow();
    }
}
