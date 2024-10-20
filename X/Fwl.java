package X;

import android.os.Handler;
import android.util.SparseArray;

/* loaded from: Fwl.class */
public final class Fwl implements GJ1 {
    public static final Handler A04 = AnonymousClass001.A07();
    public final FJ9 A00;
    public final FAd A01;
    public final FwX A02;
    public final GCq A03;

    public Fwl(GCq gCq, FAd fAd, FwX fwX, F71 f71) {
        this.A02 = fwX;
        this.A03 = gCq;
        this.A01 = fAd;
        this.A00 = new FJ9(f71);
    }

    public GCq A00(Class cls) {
        GCq gCq = this.A03;
        if (!cls.isInstance(gCq)) {
            gCq = null;
        }
        return gCq;
    }

    public void A01() {
        this.A02.A01.get();
    }

    @Override // X.GJ1
    public SparseArray AKW() {
        return DKC.A0E();
    }

    @Override // X.GJ1
    public GKA AZU() {
        return this.A02;
    }
}
