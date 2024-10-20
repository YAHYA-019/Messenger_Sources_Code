package X;

/* renamed from: X.9vq, reason: invalid class name */
/* loaded from: 9vq.class */
public final class C9vq implements C3lu {
    public final /* synthetic */ 8Gf A00;

    public C9vq(8Gf r302) {
        this.A00 = r302;
    }

    @Override // X.C3lu
    public void BiW() {
        0fH.A0j("HighlightsClassicFragment", "onAfterSessionStart");
        8Gf r0 = this.A00;
        9Zd r02 = r0.A0H;
        if (r02 != null) {
            r02.A04.A00();
            9Zd r03 = r0.A0H;
            if (r03 != null) {
                r03.A03.A02();
                return;
            }
        }
        11T.A0L("viewpointAgent");
        throw 0Q8.createAndThrow();
    }

    @Override // X.C3lu
    public void BlK(long j) {
        0fH.A0j("HighlightsClassicFragment", "onBeforeSessionEnd");
        8Gf r0 = this.A00;
        9Zd r02 = r0.A0H;
        if (r02 != null) {
            r02.A03.A05(Long.valueOf(1Br.A01(r02.A02) - j));
            9Zd r03 = r0.A0H;
            if (r03 != null) {
                r03.A04.A01();
                return;
            }
        }
        11T.A0L("viewpointAgent");
        throw 0Q8.createAndThrow();
    }
}
