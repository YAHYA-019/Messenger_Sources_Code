package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B0u.class */
public final class B0u extends C1rj {
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public View.OnClickListener A05;
    public View.OnClickListener A06;
    public MigColorScheme A07;
    public CharSequence A08;
    public CharSequence A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public String A0H;

    static {
        2RH r0 = 2RH.A05;
        A0L = r0.A00();
        2RH r02 = 2RH.A04;
        A0I = r02.A00();
        2RH r03 = 2RH.A06;
        A0N = r03.A00();
        A0K = r0.A00();
        A0J = r02.A00() * 2;
        A0M = r03.A00();
    }

    public B0u() {
        super("BusinessInboxNuxComponent");
    }

    public static C1rh A00(Drawable drawable, 1Iw r302, MigColorScheme migColorScheme, CharSequence charSequence, CharSequence charSequence2) {
        C1rq A01 = C1rg.A01(r302, null, 0);
        float f = A0J;
        A01.A16(f);
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A2Y();
        A00.A2a(C1uu.A00(4YU.A0E(r302), drawable, migColorScheme.Azp()));
        A01.A2f(A00.A2W());
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        2KD A0f = 7zR.A0f(r302, charSequence, false);
        A0f.A2x(migColorScheme);
        A0f.A2f();
        A0f.A2b();
        4YU.A1K(A012, A0f);
        2KD A013 = 2K3.A01(r302, 0);
        A013.A32(true);
        A013.A2z(charSequence2);
        A013.A2x(migColorScheme);
        A013.A2l();
        A013.A2d();
        4YU.A1K(A012, A013);
        A012.A12(A0K);
        A012.A11(f);
        return 7zL.A0d(A012.A00, A01);
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, this.A00, this.A08, this.A09, this.A0A, this.A01, this.A02, this.A03, this.A0B, this.A0C, this.A0D, this.A0E, this.A04, this.A05, this.A06, this.A0F, this.A0G, this.A0H};
    }

    /* JADX WARN: Type inference failed for: r0v171, types: [X.2qQ, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2K3 r311;
        String str = this.A0H;
        CharSequence charSequence = this.A0B;
        CharSequence charSequence2 = this.A0C;
        CharSequence charSequence3 = this.A0D;
        CharSequence charSequence4 = this.A08;
        CharSequence charSequence5 = this.A09;
        CharSequence charSequence6 = this.A0A;
        Drawable drawable = this.A01;
        Drawable drawable2 = this.A02;
        Drawable drawable3 = this.A03;
        CharSequence charSequence7 = this.A0F;
        Drawable drawable4 = this.A04;
        Drawable drawable5 = this.A00;
        MigColorScheme migColorScheme = this.A07;
        CharSequence charSequence8 = this.A0G;
        CharSequence charSequence9 = this.A0E;
        1Bi.A03(66893);
        boolean A1T = AnonymousClass001.A1T(charSequence8);
        boolean A1T2 = AnonymousClass001.A1T(charSequence9);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        7zM.A1O(A01, migColorScheme);
        A01.A0R();
        boolean z = 4YU.A0E(r302).getBoolean(2131034116);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        C1ro c1ro = C1ro.CENTER;
        A012.A2g(c1ro);
        if (z) {
            ?? obj = new Object();
            ((2qQ) obj).A01 = drawable4;
            ((2qQ) obj).A00 = drawable5;
            Drawable drawable6 = (Drawable) migColorScheme.Ci4(obj.A00());
            C2cq A00 = C2cp.A00(r302, 0);
            A00.A2a(drawable6);
            A00.A17(A0M);
            A00.A0z(360.0f);
            A00.A0l(192.0f);
            7zN.A1B(A012, A00);
        }
        2KD A0f = 7zR.A0f(r302, str, false);
        A0f.A2x(migColorScheme);
        7zU.A1U(A0f);
        A0f.A17(A0L);
        C26z c26z = C26z.HORIZONTAL;
        AbN.A18(A012, A0f, c26z, A0J);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A0S();
        A013.A17(A0I);
        float f = A0N;
        A013.A25(c26z, f);
        A013.A2e(A00(drawable, r302, migColorScheme, charSequence, charSequence4));
        A013.A2e(A00(drawable2, r302, migColorScheme, charSequence2, charSequence5));
        7zO.A1C(A013, A012, A00(drawable3, r302, migColorScheme, charSequence3, charSequence6));
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        Dud A015 = Dzc.A01(r302);
        A015.A1y(c1ro);
        A014.A2e(7zM.A0w(A012.A00, A015));
        A014.A2h(z ? C1rp.FLEX_START : C1rp.CENTER);
        A014.A0R();
        7zL.A1G(A014, A01);
        2cL r313 = null;
        if (A1T2) {
            2KD A0n = 7zQ.A0n(r302, migColorScheme, charSequence9, 0);
            A0n.A2d();
            A0n.A2i();
            A0n.A2q(1);
            A0n.A2X();
            2RH r0 = 2RH.A05;
            4YU.A1N(A0n, r0);
            7zO.A1M(A0n, r0, c26z);
            r311 = A0n.A2W();
        } else {
            r311 = null;
        }
        A01.A2e(r311);
        2cM A016 = 2cK.A01(r302, (String) null, 0);
        A016.A0S();
        A016.A25(c26z, f);
        8TZ A002 = C8nr.A00(r302);
        A002.A0S();
        A002.A2b(charSequence7);
        A002.A2a(migColorScheme);
        7zN.A1D(A002, r302, B0u.class, "BusinessInboxNuxComponent", 1446261331);
        A016.A2e(A002.A2W());
        4YU.A1N(A016, A1T2 ? 2RH.A05 : 2RH.A06);
        if (!A1T) {
            4YU.A1M(A016, 2RH.A06);
        }
        7zL.A1G(A016, A01);
        if (A1T) {
            2cM A017 = 2cK.A01(r302, (String) null, 0);
            A017.A0S();
            A017.A25(c26z, f);
            8TU A003 = C8nm.A00(r302);
            A003.A2Z(charSequence8);
            A003.A2Y(migColorScheme);
            7zO.A1I(A003, 2RH.A05);
            7zN.A1D(A003, r302, B0u.class, "BusinessInboxNuxComponent", 1731297249);
            r313 = 7zL.A0V(A017, A003.A2W());
        }
        return 7zL.A0V(A01, r313);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        View view;
        View.OnClickListener onClickListener;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 1446261331) {
            1Is r0 = r302.A00.A01;
            view = ((3xC) obj).A00;
            onClickListener = ((B0u) r0).A05;
        } else {
            if (i != 1731297249) {
                return null;
            }
            1Is r02 = r302.A00.A01;
            view = ((3xC) obj).A00;
            onClickListener = ((B0u) r02).A06;
        }
        onClickListener.onClick(view);
        return null;
    }
}
