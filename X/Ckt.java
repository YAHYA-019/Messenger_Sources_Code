package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Ckt.class */
public final class Ckt implements DGx {
    public final /* synthetic */ B7A A00;

    public Ckt(B7A b7a) {
        this.A00 = b7a;
    }

    @Override // X.DGx
    public void Coj(String str) {
        B7A b7a = this.A00;
        b7a.A06 = str;
        B7A.A07(b7a);
    }

    @Override // X.DGx
    public void Cwf(ImmutableList immutableList) {
        this.A00.A0E.addAll(immutableList);
    }
}
