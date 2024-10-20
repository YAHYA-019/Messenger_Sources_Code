package X;

/* loaded from: N8b.class */
public final class N8b implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public N8b(NAP nap, BrA brA, int i) {
        this.A00 = i;
        this.A01 = brA;
        this.A02 = nap;
    }

    public void onFailure(Throwable th) {
        NAP nap = (NAP) this.A02;
        if (nap != null) {
            nap.onFailure(th);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        NAP nap = (NAP) this.A02;
        if (nap != null) {
            nap.onSuccess();
        }
    }
}
