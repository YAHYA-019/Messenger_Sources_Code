package X;

/* loaded from: H3k.class */
public final class H3k extends I3g {
    public final /* synthetic */ ISe A00;
    public final /* synthetic */ IF5 A01;

    public H3k(ISe iSe, IF5 if5) {
        this.A01 = if5;
        this.A00 = iSe;
    }

    @Override // X.I3g
    public /* bridge */ /* synthetic */ void A00(Object obj, double d) {
        IF5 if5 = this.A01;
        ISe iSe = this.A00;
        Rb8 rb8 = iSe.A02;
        float f = (float) d;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        synchronized (if5) {
            if5.A0F.A01.CJz(rb8, f);
        }
        ISe.A01(iSe, (Exception) null, "onBytesUploaded segment=%s, bytes=%s", GOo.A1b(ISe.A00(iSe), iSe.A00));
    }
}
