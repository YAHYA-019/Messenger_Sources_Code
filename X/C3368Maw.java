package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Maw, reason: case insensitive filesystem */
/* loaded from: Maw.class */
public final class C3368Maw extends C23s implements MQ0 {
    public C3368Maw() {
        super(1533005823);
    }

    public C3368Maw(int i) {
        super(i);
    }

    @Override // X.MQ0
    public ImmutableList AYH() {
        return A09("available_card_types_v2", C3367Mav.class, 2);
    }

    @Override // X.MQ0
    public EnumC3490Mfk Af1() {
        return (EnumC3490Mfk) A0A(EnumC3490Mfk.A07, "credential_type", 3);
    }

    @Override // X.MQ0
    public String BG6() {
        return A0B(5, "title");
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        N9a A01 = MRw.A01();
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{A01, MRr.A01(), MRw.A01(), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt)});
    }
}
