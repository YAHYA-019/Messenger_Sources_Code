package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dyu.class */
public final class Dyu extends C1rj {
    public static final int A0B = 2RH.A03.A00() * 2;
    public static final int A0C = 2RH.A04.A00() * 2;
    public int A00;
    public int A01;
    public Drawable A02;
    public View.OnClickListener A03;
    public View.OnClickListener A04;
    public View.OnClickListener A05;
    public View.OnClickListener A06;
    public MigColorScheme A07;
    public CharSequence A08;
    public String A09;
    public boolean A0A;

    public Dyu() {
        super("ContactUploadComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, Integer.valueOf(this.A00), this.A03, this.A08, Boolean.valueOf(this.A0A), this.A04, this.A02, Integer.valueOf(this.A01), this.A05, this.A09, this.A06};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Class cls;
        String str;
        int i;
        Drawable drawable = this.A02;
        String str2 = this.A09;
        boolean z = this.A0A;
        CharSequence charSequence = this.A08;
        MigColorScheme migColorScheme = this.A07;
        int i2 = this.A00;
        int i3 = this.A01;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        7zM.A1O(A01, migColorScheme);
        boolean z2 = 4YU.A0E(r302).getBoolean(2131034116);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        C1ro c1ro = C1ro.CENTER;
        A012.A2g(c1ro);
        if (z2) {
            C2cq A00 = C2cp.A00(r302, 0);
            A00.A2Y();
            A00.A0l(170.0f);
            A00.A17(52.0f);
            A00.A2a(drawable);
            7zN.A1B(A012, A00);
        }
        2KD A0e = 7zR.A0e(r302, migColorScheme, false);
        A0e.A2z(str2);
        A0e.A2y(2KE.A06);
        A0e.A2b();
        A0e.A17(A0B);
        C26z c26z = C26z.HORIZONTAL;
        float f = A0C;
        AbN.A18(A012, A0e, c26z, f);
        2KD A0e2 = 7zR.A0e(r302, migColorScheme, false);
        A0e2.A2z(charSequence);
        A0e2.A2l();
        A0e2.A2d();
        2RH r0 = 2RH.A05;
        4YU.A1N(A0e2, r0);
        AbN.A18(A012, A0e2, c26z, f);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        Dud A014 = Dzc.A01(r302);
        A014.A1y(c1ro);
        A014.A2c(A012.A00);
        A013.A2e(A014.A2V());
        A013.A2h(z2 ? C1rp.FLEX_START : C1rp.CENTER);
        A013.A0R();
        7zL.A1G(A013, A01);
        2cM A015 = 2cK.A01(r302, (String) null, 0);
        2RH r02 = 2RH.A06;
        4YU.A1O(A015, r02, c26z);
        A015.A0S();
        8TZ A002 = C8nr.A00(r302);
        if (z) {
            A002.A2a(migColorScheme);
            A002.A2Y(2131962373);
            4YU.A1N(A002, r02);
            cls = Dyu.class;
            str = "ContactUploadComponent";
            i = 1351407733;
        } else {
            A002.A2a(migColorScheme);
            A002.A2Y(i2);
            4YU.A1N(A002, r02);
            cls = Dyu.class;
            str = "ContactUploadComponent";
            i = -256462297;
        }
        7zN.A1D(A002, r302, cls, str, i);
        A015.A2e(A002.A2W());
        8TU A003 = C8nm.A00(r302);
        A003.A2X(i3);
        4YU.A1N(A003, r0);
        4YU.A1M(A003, r02);
        7zN.A1D(A003, r302, cls, str, -1760520986);
        A003.A2Y(migColorScheme);
        7zO.A1C(A015, A01, A003.A2W());
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        View view;
        View.OnClickListener onClickListener;
        switch (r302.A01) {
            case -1760520986:
                1Is r0 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((Dyu) r0).A05;
                break;
            case -1547653874:
                1Is r02 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((Dyu) r02).A04;
                break;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -256462297:
                1Is r03 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((Dyu) r03).A03;
                break;
            case 1351407733:
                1Is r04 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((Dyu) r04).A06;
                break;
            default:
                return null;
        }
        onClickListener.onClick(view);
        return null;
    }
}
