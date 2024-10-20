package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Mbt, reason: case insensitive filesystem */
/* loaded from: Mbt.class */
public final class C3400Mbt extends C23s implements NBK {
    public C3400Mbt() {
        super(78638575);
    }

    public C3400Mbt(int i) {
        super(i);
    }

    @Override // X.NBK
    public ImmutableList B1v() {
        return A07(QtJ.A01, DKB.A00(494), 2);
    }

    @Override // X.NBK
    public QtK B23() {
        return A0A(QtK.A01, "payment_mode", 3);
    }

    @Override // X.NBK
    public String B9V() {
        return A0C("security_origin");
    }

    @Override // X.NBK
    public ImmutableList BDg() {
        return A07(QtL.A01, DKB.A00(544), 1);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRr.A0A(mRt, MRr.A02(mRt), MRr.A01(), MRr.A01());
    }
}
