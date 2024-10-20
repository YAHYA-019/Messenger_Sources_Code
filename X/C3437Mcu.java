package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Mcu, reason: case insensitive filesystem */
/* loaded from: Mcu.class */
public final class C3437Mcu extends C23s implements NBD {
    public C3437Mcu() {
        super(-1680962178);
    }

    public C3437Mcu(int i) {
        super(i);
    }

    @Override // X.NBD
    public ImmutableList AY9() {
        return A09("authentication_tickets(fbids:$fbids)", C3435Mcs.class, 1);
    }

    @Override // X.NBD
    public NB4 Am3() {
        return (NB4) A04(C3436Mct.class, "fbpay_pin");
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRl.A0B(new N9a[]{MRw.A00(), MRw.A01()});
    }
}
