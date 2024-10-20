package X;

import com.google.common.base.Supplier;

/* loaded from: Fvi.class */
public final class Fvi implements Supplier {
    public final /* synthetic */ F9H A00;
    public final /* synthetic */ String A01;

    public Fvi(F9H f9h, String str) {
        this.A00 = f9h;
        this.A01 = str;
    }

    @Override // com.google.common.base.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        return this.A00.A06.A02(this.A01);
    }
}
