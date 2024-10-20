package X;

import android.text.Layout;

/* renamed from: X.8nz, reason: invalid class name */
/* loaded from: 8nz.class */
public final class C8nz extends C1rj {
    public static final Layout.Alignment A05 = Layout.Alignment.ALIGN_CENTER;
    public int A00;
    public Layout.Alignment A01;
    public CharSequence A02;
    public Runnable A03;
    public boolean A04;

    public C8nz() {
        super("DefaultEmptyComponent");
        this.A01 = A05;
    }

    public static 8Sm A00(1Iw r301) {
        return new 8Sm(r301, new C8nz());
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, null, Boolean.valueOf(this.A04), this.A01, Integer.valueOf(this.A00)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A02;
        boolean z = this.A04;
        Layout.Alignment alignment = this.A01;
        int i = this.A00;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0S();
        A01.A2f(C1ro.FLEX_START);
        A01.A2c();
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A3C(false);
        A0L.A3A(charSequence);
        A0L.A32(2132279367);
        A0L.A2x(i);
        A0L.A35(alignment);
        A0L.A0S();
        A0L.A0L();
        A0L.A1c(2132279314);
        A01.A2d(A0L);
        if (z) {
            3yF A0L2 = 2KZ.A0L(r302, 0);
            A0L2.A3C(false);
            A0L2.A3A(r302.A0D.getString(2131957329));
            A0L2.A32(2132279515);
            A0L2.A2y(2130969918);
            A0L2.A0S();
            7zN.A1C(A0L2, r302, C8nz.class, "DefaultEmptyComponent");
            A0L2.A0L();
            A01.A2W(A0L2);
        }
        return A01.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 262644498145293L);
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        Runnable runnable = ((C8nz) r302.A00.A01).A03;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
