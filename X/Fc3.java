package X;

/* loaded from: Fc3.class */
public final class Fc3 implements GHd {
    public final /* synthetic */ EoZ A00;
    public final /* synthetic */ GHd A01;

    public Fc3(EoZ eoZ, GHd gHd) {
        this.A00 = eoZ;
        this.A01 = gHd;
    }

    @Override // X.GHd
    public void Bxi(Throwable th, boolean z) {
        this.A01.Bxi(th, z);
    }

    @Override // X.GHd
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        EZm eZm = (EZm) obj;
        this.A00.A04 = eZm;
        this.A01.onSuccess(eZm);
    }
}
