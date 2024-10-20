package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Ma3, reason: case insensitive filesystem */
/* loaded from: Ma3.class */
public final class C3344Ma3 extends C23s implements MPy {
    public C3344Ma3() {
        super(1580624846);
    }

    public C3344Ma3(int i) {
        super(i);
    }

    @Override // X.MPy
    public int AkN() {
        return A02(0, TraceFieldType.ErrorCode);
    }

    @Override // X.MPy
    public String AkO() {
        return A0B(1, TraceFieldType.Error);
    }

    @Override // X.MPy
    public String AkZ() {
        return A0B(2, "error_title");
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRr A02 = MRr.A02(MRs.A00);
        MRt mRt = MRt.A00;
        return MRr.A08(mRt, A02, MRr.A02(mRt));
    }
}
