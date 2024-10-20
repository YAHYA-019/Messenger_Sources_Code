package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: B12.class */
public final class B12 extends C1rj {
    public static final ImmutableList A09 = ImmutableList.of();
    public Drawable A00;
    public View.OnClickListener A01;
    public JDp A02;
    public ImmutableList A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    public B12() {
        super("SecondarySheetHeaderComponent");
        this.A07 = false;
        this.A03 = A09;
    }

    public static AwR A00(1Iw r301) {
        return new AwR(r301, new B12());
    }

    public static void A01(C1rs c1rs, 2RH r302, C26z c26z) {
        c1rs.A27(c26z, 2RH.A07.A00());
        c1rs.A1F(-r302.A00());
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), this.A01, this.A04, this.A03, this.A02, this.A05, this.A00, this.A06};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rh A0d;
        String str = this.A06;
        String str2 = this.A05;
        Drawable drawable = this.A00;
        boolean z = this.A07;
        boolean z2 = this.A08;
        String str3 = this.A04;
        View.OnClickListener onClickListener = this.A01;
        Context context = r302.A0D;
        CH4 ch4 = (CH4) 1Bn.A0E(context, (1BY) null, 85039);
        MigColorScheme A0o = AbF.A0o(context, 16980);
        Object A04 = 1Lo.A04(context, 4YV.A0D(context), (1BY) null, 99475);
        int dimension = (int) context.getResources().getDimension(2132279312);
        2KD A0f = 7zR.A0f(r302, str, false);
        A0f.A2f();
        A0f.A2b();
        A0f.A2x(A0o);
        A0f.A2M(true);
        A0f.A2S(str);
        C26z c26z = C26z.HORIZONTAL;
        float f = 0.0f;
        if (z) {
            f = dimension;
        }
        A0f.A24(c26z, f);
        2K3 A2W = A0f.A2W();
        if (str2 == null) {
            A0d = null;
        } else {
            C1rq A01 = C1rg.A01(r302, null, 0);
            A01.A2b();
            A01.A0r(48.0f);
            A01.A2b();
            if (drawable != null) {
                C1rq A012 = C1rg.A01(r302, null, 0);
                A012.A0k(0.0f);
                A012.A0r(48.0f);
                A012.A0N();
                A012.A2b();
                C2cq A00 = C2cp.A00(r302, 0);
                A00.A2a(drawable);
                A012.A2e(A00);
                A01.A2f(A012.A00);
            }
            2cM A013 = 2cK.A01(r302, (String) null, 0);
            A013.A19(0.0f);
            A013.A1A(0.0f);
            A013.A14(0.0f);
            2KD A0Y = 7zN.A0Y(r302, false);
            7zQ.A1T(A0Y, str2);
            A0Y.A2q(1);
            A0Y.A2Z();
            A0Y.A2x(A0o);
            A0Y.A2M(true);
            A0Y.A2S(str2);
            4YU.A1K(A013, A0Y);
            7zQ.A1C(A013);
            A01.A2f(A013.A00);
            C1rq A014 = C1rg.A01(r302, null, 0);
            4YU.A1O(A014, 2RH.A06, c26z);
            7zO.A1E(A014, 2RH.A07);
            A0d = 7zL.A0d(A01.A00, A014);
        }
        2cM A0e = AbG.A0e(r302);
        A0e.A2b();
        2RH r0 = 2RH.A09;
        7zO.A1F(A0e, r0);
        if (z) {
            Resources resources = context.getResources();
            int dimension2 = (int) resources.getDimension(2132279312);
            C2cm A002 = C2cl.A00(r302);
            A002.A2b(7zP.A0S(ch4.A02).A08(C1u3.A0U, resources.getColor(2132213766, null)));
            A002.A1L(dimension2);
            A002.A0C(dimension2);
            A002.A2c(ImageView.ScaleType.FIT_CENTER);
            7zM.A1H(A002, A0o);
            A002.A2N(true);
            A002.A2T(1LI.A0C(r302, B12.class, "SecondarySheetHeaderComponent", new Object[]{A04}, 1991993034));
            7zL.A1J(A002);
            A002.A1J(2131965578);
            A002.A0c();
            C26z c26z2 = C26z.START;
            A01(A002, r0, c26z2);
            AbK.A1L(A002, A0o, dimension2, 0);
            7zO.A1M(A002, 2RH.A03, c26z2);
            A0e.A2e(7zL.A0J(A002));
        }
        2cM A0e2 = AbG.A0e(r302);
        A0e2.A2b();
        A0e2.A2e(A2W);
        if (A0d != null) {
            A0e2.A2e(A0d);
        }
        7zL.A1G(A0e2, A0e);
        if (z2) {
            if (!TextUtils.isEmpty(str3)) {
                throw AnonymousClass001.A0L("Can't show menu and tertiary button at same time");
            }
            Resources resources2 = context.getResources();
            int dimension3 = (int) resources2.getDimension(2132279312);
            C2cm A003 = C2cl.A00(r302);
            A003.A2b(7zP.A0S(ch4.A02).A08(C1u3.A2Q, resources2.getColor(2132213766, null)));
            A003.A1L(dimension3);
            A003.A0C(dimension3);
            A003.A2c(ImageView.ScaleType.FIT_CENTER);
            7zM.A1H(A003, A0o);
            A003.A2N(true);
            7zN.A1D(A003, r302, B12.class, "SecondarySheetHeaderComponent", 593942866);
            7zL.A1J(A003);
            A003.A1J(2131965579);
            A003.A0c();
            C26z c26z3 = C26z.END;
            A01(A003, r0, c26z3);
            AbK.A1L(A003, A0o, dimension3, 0);
            7zO.A1M(A003, 2RH.A03, c26z3);
            A0e.A2e(7zL.A0J(A003));
        }
        if (!TextUtils.isEmpty(str3)) {
            AwU A015 = B11.A01(r302);
            A015.A2Z(str3);
            A015.A2Y(A0o);
            A015.A0c();
            A01(A015, r0, C26z.END);
            A015.A2X(1LI.A0C(r302, B12.class, "SecondarySheetHeaderComponent", new Object[]{onClickListener}, 857377513));
            A0e.A2e(A015.A2W());
        }
        return A0e.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 593942866:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                View view = ((3xC) obj).A00;
                B12 b12 = (B12) r02;
                ImmutableList immutableList = b12.A03;
                JDp jDp = b12.A02;
                8Ca r04 = new 8Ca(r03.A0D, view);
                LQD lqd = ((7QJ) r04).A04;
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    RSX rsx = (RSX) it.next();
                    lqd.add(0, rsx.A00, 0, rsx.A01);
                }
                ((7QJ) r04).A01 = jDp;
                r04.A00();
                return null;
            case 857377513:
                ((View.OnClickListener) r302.A03[0]).onClick(((3xC) obj).A00);
                return null;
            case 1991993034:
                GR1 gr1 = (JOS) r302.A03[0];
                JOL jol = gr1.A08;
                if (jol == null) {
                    return null;
                }
                if (jol.Cxh(gr1.A0G)) {
                    Iterator it2 = gr1.A0h.iterator();
                    while (it2.hasNext()) {
                        ((JLm) it2.next()).CJk();
                    }
                    return null;
                }
                int type = jol.getType();
                if (type == 10) {
                    ((CJA) 1Br.A0B(gr1.A0U)).A07();
                    return null;
                }
                if (type != 9) {
                    gr1.ChU("cross");
                    return null;
                }
                Iterator it3 = gr1.A0h.iterator();
                while (it3.hasNext()) {
                    ((JLm) it3.next()).CJk();
                }
                GR1.A03(gr1);
                return null;
            default:
                return null;
        }
    }
}
