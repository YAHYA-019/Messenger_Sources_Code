package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableMap;
import java.util.BitSet;
import java.util.List;

/* loaded from: Gl9.class */
public final class Gl9 extends C1rj {
    public JOL A00;
    public Gqw A01;
    public MigColorScheme A02;
    public List A03;

    public Gl9() {
        super("BottomNavComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A02, this.A03, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        8T5 r319;
        Resources A0C;
        C1u3 c1u3;
        8mC r305;
        MigColorScheme migColorScheme = this.A02;
        List<JOL> list = this.A03;
        JOL jol = this.A00;
        boolean A1X = 1BL.A1X(r302, migColorScheme);
        11T.A0F(list, 2);
        Context context = r302.A0D;
        CH4 ch4 = (CH4) 7zN.A0k(context, 85039);
        C1rq A00 = C1rg.A00(r302);
        A00.A0R();
        A00.A1I(2132410508);
        A00.A2c();
        A00.A2h(C1ro.FLEX_START);
        A00.A19(62.0f);
        for (JOL jol2 : list) {
            boolean A0O = 11T.A0O(jol2, jol);
            1Im A0C2 = 1LI.A0C(r302, Gl9.class, "BottomNavComponent", new Object[]{jol2}, -1321154314);
            String A0W = 0Pz.A0W("BottomNavComponent", jol2.Ayj());
            int type = jol2.getType();
            if (type == 4) {
                r319 = new 8T5(r302, new 8mC());
                8mC r0 = r319.A01;
                r0.A01 = migColorScheme;
                BitSet bitSet = r319.A02;
                bitSet.set(0);
                r0.A03 = r302.A0D(2131953485);
                bitSet.set(2);
                A0C = 4YU.A0C(context);
                c1u3 = C1u3.A6i;
            } else if (type == 5) {
                r319 = new 8T5(r302, new 8mC());
                8mC r02 = r319.A01;
                r02.A01 = migColorScheme;
                BitSet bitSet2 = r319.A02;
                bitSet2.set(0);
                r02.A03 = r302.A0D(2131953487);
                bitSet2.set(2);
                A0C = 4YU.A0C(context);
                c1u3 = C1u3.A5g;
            } else if (type == 7) {
                r319 = new 8T5(r302, new 8mC());
                8mC r03 = r319.A01;
                r03.A01 = migColorScheme;
                BitSet bitSet3 = r319.A02;
                bitSet3.set(0);
                r03.A03 = r302.A0D(2131953486);
                bitSet3.set(2);
                A0C = 4YU.A0C(context);
                c1u3 = C1u3.A0F;
            } else if (type != 11) {
                r305 = null;
                A00.A2f(r305);
            } else {
                r319 = new 8T5(r302, new 8mC());
                8mC r04 = r319.A01;
                r04.A01 = migColorScheme;
                BitSet bitSet4 = r319.A02;
                bitSet4.set(0);
                r04.A03 = r302.A0D(2131953484);
                bitSet4.set(2);
                A0C = 4YU.A0C(context);
                c1u3 = C1u3.A3L;
            }
            C1uu c1uu = (C1uu) 1Br.A0B(ch4.A00);
            int Amg = migColorScheme.Amg();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Amg);
            gradientDrawable.setShape(A1X ? 1 : 0);
            gradientDrawable.setSize(A0C.getDimensionPixelSize(2132279303), A0C.getDimensionPixelSize(2132279303));
            IZH izh = new IZH(gradientDrawable);
            int BKg = migColorScheme.BKg();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(BKg);
            gradientDrawable2.setShape(A1X ? 1 : 0);
            gradientDrawable2.setSize(A0C.getDimensionPixelSize(2132279303), A0C.getDimensionPixelSize(2132279303));
            IZH izh2 = new IZH(gradientDrawable2);
            CpE A002 = CpE.A00(2132411012, 0);
            CpE A0a = AbM.A0a(c1u3, 7zP.A0S(ch4.A02));
            Drawable A02 = CPw.A02(A0C, c1uu, izh, A002, izh2, A002, A0a, A0a, A0a, A0a, R.attr.state_selected, false, false, A1X);
            r305 = r319.A01;
            r305.A00 = A02;
            BitSet bitSet5 = r319.A02;
            bitSet5.set(A1X ? 1 : 0);
            r319.A2T(A0C2);
            r319.A2W(A0O);
            r319.A2K(A0W);
            C1rs.A02(bitSet5, r319.A03);
            r319.A0J();
            A00.A2f(r305);
        }
        return A00.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1321154314) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        JOL jol = (JOL) r302.A03[0];
        Gqw gqw = ((Gl9) r02).A01;
        11T.A0F(r03, 0);
        1BL.A1F(jol, gqw);
        Context context = r03.A0D;
        1Br A0g = 7zM.A0g(context, 114982);
        1Br A0C = 1BK.A0C();
        1Br A00 = 1Lm.A00(context, 4YV.A0E(context), 99477);
        1Br r04 = gqw.A02;
        JOL jol2 = GOp.A0Q(r04).A08;
        if (jol2 != null && jol2.BT9() && !jol.equals(GOp.A0Q(r04).A08)) {
            IZI A0h = GOp.A0h(gqw.A06);
            String Ayj = jol.Ayj();
            IZI izi = A0h;
            11T.A0F(Ayj, 0);
            AbN.A0X(izi).A01(izi.A01, new Ifc("halo_nav_button_tap", ImmutableMap.of((Object) "plugin_name", (Object) Ayj)), "halo_nav_button_tap");
            int type = jol.getType();
            if (type != 4) {
                if (type == 11) {
                    C6J A02 = ((CNQ) 1Br.A0B(gqw.A04)).A02(BOk.A01, gqw.A01);
                    A02.A01 = BOX.A0E;
                    A02.A00 = BOh.A04;
                    A02.A00();
                }
                GOp.A0Q(r04).D0D(type);
            } else {
                ((I27) 1Br.A0B(gqw.A05)).A01("drawer_pager");
            }
        }
        if (jol.getType() != 5 || !1Br.A07(A0C).AZk(36316048726828739L)) {
            return null;
        }
        ((IED) 1Br.A0B(A00)).A06(context, (HuL) 1Br.A0B(A0g));
        return null;
    }
}
