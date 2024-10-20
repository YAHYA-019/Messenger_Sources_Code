package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Maa, reason: case insensitive filesystem */
/* loaded from: Maa.class */
public final class C3351Maa extends C23s implements MQP {
    public C3351Maa() {
        super(-14546548);
    }

    public C3351Maa(int i) {
        super(i);
    }

    public MOP AjI() {
        return A05(MaT.class, "email_form_field_config", 3);
    }

    public ImmutableList AjL() {
        return A09("emails", MaU.class, 0);
    }

    public MOR Anh() {
        return A05(MaV.class, "full_name_field_config", 5);
    }

    public MOS B0F() {
        return A05(MaW.class, "one_time_email", 6);
    }

    public String B0G() {
        return A0B(8, "one_time_payer_name");
    }

    public MOT B0H() {
        return A05(MaX.class, "one_time_phone", 7);
    }

    public String B1p() {
        return A0B(2, "payer_name");
    }

    public MOU B2b() {
        return A05(MaY.class, "phone_form_field_config", 4);
    }

    public ImmutableList B2c() {
        return A09(JQw.A00(327), MaZ.class, 1);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        N9a A01 = MRw.A01();
        N9a A012 = MRw.A01();
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{A01, A012, MRr.A02(mRt), MRw.A00(), MRw.A00(), MRw.A00(), MRw.A00(), MRw.A00(), MRr.A02(mRt)});
    }
}
