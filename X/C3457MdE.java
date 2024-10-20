package X;

import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableList;

/* renamed from: X.MdE, reason: case insensitive filesystem */
/* loaded from: MdE.class */
public final class C3457MdE extends C23s implements SzB {
    public C3457MdE() {
        super(-1723539684);
    }

    public C3457MdE(int i) {
        super(i);
    }

    public Qtv AXD() {
        return A0A(Qtv.A07, AnonymousClass000.A00(ActionId.VIDEO_DISPLAYED), 0);
    }

    public ImmutableList AcR() {
        return A09("child_native_feature_configs", C3456MdD.class, 3);
    }

    public EnumC3491Mfm Acl() {
        return (EnumC3491Mfm) A0A(EnumC3491Mfm.A1e, "client_native_feature_id", 2);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRw.A01()});
    }
}
