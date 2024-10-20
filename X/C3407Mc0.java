package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Mc0, reason: case insensitive filesystem */
/* loaded from: Mc0.class */
public final class C3407Mc0 extends C23s implements MQB {
    public C3407Mc0() {
        super(-263311296);
    }

    public C3407Mc0(int i) {
        super(i);
    }

    @Override // X.MQB
    public String Ael() {
        return A0C("country_code");
    }

    @Override // X.MQB
    public MP3 AfV() {
        return (MP3) A05(C3403Mbw.class, DKB.A00(14), 1);
    }

    @Override // X.MQB
    public ImmutableList B4c() {
        return A09("price_items", C3404Mbx.class, 2);
    }

    @Override // X.MQB
    public ImmutableList B4z() {
        return A09("product_items", C3406Mbz.class, 3);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRl.A0B(new N9a[]{MRr.A00(), MRw.A00(), MRw.A01(), MRw.A01(), MRw.A00()});
    }
}
