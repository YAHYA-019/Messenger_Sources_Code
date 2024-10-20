package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8np, reason: invalid class name */
/* loaded from: 8np.class */
public final class C8np extends C1rj {
    public static final CallerContext A07 = CallerContext.A0B("BasePickerOptionComponentSpec");
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public Uri A04;
    public MigColorScheme A05;
    public boolean A06;

    public C8np() {
        super("BasePickerOptionComponent");
        this.A00 = 20;
        this.A02 = 66;
    }

    public static 8TO A00(1Iw r301) {
        return new 8TO(r301, new C8np());
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, Integer.valueOf(this.A00), this.A03, Integer.valueOf(this.A01), Boolean.valueOf(this.A06), this.A04, Integer.valueOf(this.A02), 1BK.A0d()};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5BG A2W;
        Drawable A00;
        Drawable drawable = this.A03;
        int i = this.A01;
        boolean z = this.A06;
        MigColorScheme migColorScheme = this.A05;
        int i2 = this.A02;
        int i3 = this.A00;
        Uri uri = this.A04;
        1BK.A1K(r302, 0, migColorScheme);
        int A002 = C0A8.A00(7zL.A0A(r302), i3);
        float f = i;
        C1rq A003 = C1rg.A00(r302);
        float f2 = i2;
        A003.A0z(f2);
        A003.A0l(f2);
        A003.A2c();
        C1ro c1ro = C1ro.CENTER;
        A003.A2h(c1ro);
        A003.A2g(c1ro);
        7zL.A1J(A003);
        if (uri == null) {
            C2cq A004 = C2cp.A00(r302, 0);
            A004.A0z(f);
            A004.A0l(f);
            A004.A2a(drawable);
            A2W = A004.A2W();
        } else if (1iQ.A00()) {
            5BH A0B = 7zN.A0B(uri, r302);
            A0B.A0z(f);
            A0B.A0l(f);
            C07004ik A005 = C06984ii.A00();
            A005.A06(drawable);
            ((C07014il) A005).A04 = 5BK.A06;
            A005.A00(InterfaceC07034in.A01);
            ((C07014il) A005).A06 = AbstractC02343uw.A00(i);
            C06984ii.A01(A0B, A005);
            A2W = 7zO.A0P(A0B, A07);
        } else {
            C5bd A006 = C5bc.A00(r302);
            A006.A2W(uri);
            A006.A0z(f);
            A006.A0l(f);
            C07004ik A007 = C06984ii.A00();
            A007.A06(drawable);
            ((C07014il) A007).A04 = 5BK.A06;
            A007.A00(InterfaceC07034in.A01);
            ((C07014il) A007).A06 = AbstractC02343uw.A00(i);
            A006.A00.A04 = 7zL.A0L(A007);
            A006.A2X(A07);
            A006.A0J();
            A2W = A006.A00;
        }
        11T.A0D(A2W);
        A003.A2f(A2W);
        if (z) {
            A00 = C2cn.A02(A002, migColorScheme.B9e());
        } else {
            A00 = C2cn.A00(A002, 0, migColorScheme.AmV());
        }
        A003.A0D(A00);
        return A003.A00;
    }
}
