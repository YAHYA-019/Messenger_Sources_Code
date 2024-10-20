package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ms, reason: invalid class name */
/* loaded from: 8ms.class */
public final class C8ms extends C1rj {
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final C9d5 A0K = new Object();
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public View.OnClickListener A04;
    public View.OnClickListener A05;
    public MigColorScheme A06;
    public CharSequence A07;
    public CharSequence A08;
    public CharSequence A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public String A0F;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9d5, java.lang.Object] */
    static {
        2RH r0 = 2RH.A04;
        A0J = r0.A00() * 2;
        A0G = 7zL.A03();
        A0I = r0.A00();
        A0H = r0.A00() * 2;
    }

    public C8ms() {
        super("BusinessRTCNuxComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, this.A08, this.A06, this.A09, this.A0A, this.A04, this.A0B, Integer.valueOf(this.A00), this.A0C, this.A0D, this.A0F, this.A01, this.A05, this.A0E, this.A02, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2cL r320;
        String str = this.A0F;
        int i = this.A00;
        CharSequence charSequence = this.A0D;
        CharSequence charSequence2 = this.A08;
        CharSequence charSequence3 = this.A0A;
        CharSequence charSequence4 = this.A0C;
        CharSequence charSequence5 = this.A07;
        CharSequence charSequence6 = this.A09;
        Drawable drawable = this.A01;
        Drawable drawable2 = this.A03;
        Drawable drawable3 = this.A02;
        CharSequence charSequence7 = this.A0E;
        CharSequence charSequence8 = this.A0B;
        MigColorScheme migColorScheme = this.A06;
        1BK.A1M(r302, str);
        7zT.A11(3, charSequence, charSequence2, charSequence3, charSequence4);
        7zS.A18(7, charSequence5, charSequence6, drawable);
        7zP.A1O(drawable2, 10, drawable3);
        7zP.A1Q(charSequence7, 12, migColorScheme);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        7zM.A1O(A01, migColorScheme);
        A01.A0R();
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        C1ro c1ro = C1ro.CENTER;
        A012.A2g(c1ro);
        8Sk A00 = 8oJ.A00(r302);
        A00.A2W(i);
        A00.A00.A06 = "business_rtc_nux";
        8Sk.A06(A00, 3);
        A00.A0z(275.0f);
        A00.A0l(180.0f);
        A00.A17(A0J);
        A00.A0J();
        8oJ r0 = A00.A00;
        11T.A0A(r0);
        A012.A2e(r0);
        2KD A0f = 7zR.A0f(r302, str, false);
        A0f.A2x(migColorScheme);
        7zU.A1U(A0f);
        float f = A0G;
        A0f.A17(f);
        C26z c26z = C26z.HORIZONTAL;
        A0f.A24(c26z, 58.0f);
        A0f.A2X();
        4YU.A1K(A012, A0f);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A0S();
        A013.A17(f);
        A013.A25(c26z, 26.0f);
        A013.A2e(C9d5.A00(drawable, r302, migColorScheme, charSequence, charSequence4));
        A013.A2e(C9d5.A00(drawable2, r302, migColorScheme, charSequence2, charSequence5));
        7zO.A1C(A013, A012, C9d5.A00(drawable3, r302, migColorScheme, charSequence3, charSequence6));
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        Dud A015 = Dzc.A01(r302);
        A015.A1y(c1ro);
        A014.A2e(7zM.A0w(A012.A00, A015));
        A014.A2h(C1rp.FLEX_START);
        A014.A0R();
        7zL.A1G(A014, A01);
        2cM A016 = 2cK.A01(r302, (String) null, 0);
        A016.A0S();
        A016.A25(c26z, 26.0f);
        8TZ A002 = C8nr.A00(r302);
        A002.A0S();
        A002.A2b(charSequence7);
        A002.A2a(migColorScheme);
        A002.A12(26.0f);
        7zN.A1D(A002, r302, C8ms.class, "BusinessRTCNuxComponent", 1446261331);
        7zO.A1C(A016, A01, A002.A2W());
        if (charSequence8 != null) {
            2cM A017 = 2cK.A01(r302, (String) null, 0);
            A017.A0S();
            A017.A25(c26z, 26.0f);
            8TU A003 = C8nm.A00(r302);
            A003.A2Z(charSequence8);
            A003.A2Y(migColorScheme);
            A003.A18(26.0f);
            7zN.A1D(A003, r302, C8ms.class, "BusinessRTCNuxComponent", 1583407601);
            r320 = 7zL.A0V(A017, A003.A2W());
        } else {
            r320 = null;
        }
        return 7zL.A0V(A01, r320);
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
            onClickListener = ((C8ms) r0).A05;
            11T.A0F(onClickListener, 1);
        } else {
            if (i != 1583407601) {
                return null;
            }
            1Is r02 = r302.A00.A01;
            view = ((3xC) obj).A00;
            onClickListener = ((C8ms) r02).A04;
            if (onClickListener == null) {
                return null;
            }
        }
        onClickListener.onClick(view);
        return null;
    }
}
