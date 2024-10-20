package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.2ce, reason: invalid class name */
/* loaded from: 2ce.class */
public final class C2ce extends C1rj {
    public MigColorScheme A00;
    public ImmutableList A01;

    public C2ce() {
        super("NavigationButtons");
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2cL A2W;
        ImmutableList immutableList = this.A01;
        MigColorScheme migColorScheme = this.A00;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        2Rd r0 = (2Rd) 1Bi.A03(66609);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            2Ro r02 = (2Ro) it.next();
            if (!r02.A08) {
                if (r0.A01()) {
                    Drawable A00 = 2dG.A00(r302.A0D, r02.A01, r02.A02, migColorScheme);
                    2cM A012 = 2cK.A01(r302, (String) null, 0);
                    A012.A2S(r02.A06);
                    A012.A2T(1LI.A0C(r302, C2ce.class, "NavigationButtons", new Object[]{r02}, -1306401257));
                    A012.A1q(1LI.A0C(r302, C2ce.class, "NavigationButtons", new Object[]{r02}, -547357317));
                    A012.A2K(0Pz.A0W("navbutton_", r02.A07));
                    A012.A1w(r02.A00);
                    A012.A1v(1LI.A0C(r302, C2ce.class, "NavigationButtons", new Object[]{r02}, -1714935487));
                    A012.A1p(1LI.A0C(r302, C2ce.class, "NavigationButtons", new Object[]{r02}, 1743782076));
                    2zF r03 = new 2zF(r302, new 2Kf());
                    r03.A01.A07 = 1019025348;
                    BitSet bitSet = r03.A02;
                    bitSet.set(0);
                    r03.A0z(32.0f);
                    r03.A0l(32.0f);
                    int B4h = migColorScheme.B4h();
                    2Kf r04 = r03.A01;
                    r04.A00 = B4h;
                    r04.A01 = 0;
                    bitSet.set(1);
                    r03.A01.A02 = migColorScheme.B9e();
                    bitSet.set(2);
                    r03.A0c();
                    C1rs.A03(bitSet, r03.A03);
                    r03.A0J();
                    A012.A2e(r03.A01);
                    C2cm A002 = C2cl.A00(r302);
                    A002.A2b(A00);
                    C1p8 c1p8 = r02.A05;
                    A002.A2X(c1p8 != null ? migColorScheme.Chx(c1p8) : migColorScheme.B4h());
                    A002.A2c(ImageView.ScaleType.CENTER_INSIDE);
                    A002.A0z(32.0f);
                    A002.A0l(32.0f);
                    A012.A2d(A002);
                    A2W = A012.A00;
                } else {
                    2zC A003 = 2cT.A00(r302);
                    2zB A004 = 2cP.A00(r302);
                    A004.A2a(migColorScheme);
                    A004.A2Z(r02.A02.A04);
                    A004.A2X(36.0f);
                    A004.A2S(r02.A06);
                    Object[] objArr = {r02};
                    Integer num = 0S2.A01;
                    A004.A2T(1LI.A02(r302, C2ce.class, num, "NavigationButtons", objArr, -1306401257));
                    A004.A1q(1LI.A02(r302, C2ce.class, num, "NavigationButtons", new Object[]{r02}, -547357317));
                    A004.A2K(0Pz.A0W("navbutton_", r02.A07));
                    A004.A2Q(true);
                    A004.A1w(r02.A00);
                    A004.A1v(1LI.A02(r302, C2ce.class, num, "NavigationButtons", new Object[]{r02}, -1714935487));
                    A004.A1p(1LI.A02(r302, C2ce.class, num, "NavigationButtons", new Object[]{r02}, 1743782076));
                    C1p8 c1p82 = r02.A05;
                    if (c1p82 != null) {
                        2cP r05 = A004.A01;
                        r05.A0A = true;
                        r05.A04 = c1p82;
                    }
                    A003.A2a(A004.A2W());
                    A003.A2b(r02.A01);
                    A003.A2c(migColorScheme);
                    A003.A2Y(36.0f);
                    A2W = A003.A2W();
                }
                builder.m11011add((Object) A2W);
            }
        }
        ImmutableList build = builder.build();
        C2yw A005 = 2dA.A00(r302);
        A005.A0k(0.0f);
        A005.A25(C26z.START, 16.0f);
        A005.A2Y(build);
        A005.A2W(16.0f);
        A005.A0J();
        A01.A2e(A005.A01);
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1714935487:
                ((2Ro) r302.A03[0]).A04.CUq(r302.A00.A00);
                return null;
            case -1306401257:
                2Ro r0 = (2Ro) r302.A03[0];
                View view = ((3xC) obj).A00;
                2dS r02 = (2dS) 1Bi.A03(17047);
                r02.A01 = Integer.valueOf(r0.A01.A01);
                r0.A03.onClick(view);
                r02.A01 = null;
                r02.A00 = null;
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -547357317:
                return Boolean.valueOf(((2Ro) r302.A03[0]).A03.C57());
            case 1743782076:
                ((2Ro) r302.A03[0]).A04.C2L(r302.A00.A00);
                return null;
            default:
                return null;
        }
    }
}
