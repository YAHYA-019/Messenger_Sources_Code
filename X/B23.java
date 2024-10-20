package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: B23.class */
public final class B23 extends 2Yf {
    public B23() {
        super("Rooms2LiveAudiencePickerSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        String string;
        String string2;
        CH4 ch4;
        C1u3 c1u3;
        2hO r0;
        1Bn.A0A(148132);
        Context context = ((1Iw) c1qb).A0D;
        BmX bmX = (BmX) 1Bn.A0E(context, (1BY) null, 82170);
        MigColorScheme A0o = AbF.A0o(context, 16980);
        CJA A0O = AbN.A0O(context, "Rooms2LiveAudiencePickerSectionSpec");
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        A0I.A01.A03 = true;
        AwR A00 = B12.A00(c1qb);
        A00.A2Y(true);
        A00.A0D(7zL.A0j(((1Iw) c1qb).A0E.A04(2132213884)));
        A00.A2X(c1qb.A0D(2131966221));
        C26z c26z = C26z.BOTTOM;
        7zO.A1M(A00, 2RH.A07, c26z);
        A00.A0k(0.0f);
        A0I.A05(A00.A2W());
        AbG.A1O(A0l, A0I);
        boolean z = A0O.A09;
        ArrayList A03 = 1JW.A03(new Qp7[]{Qp7.A01, Qp7.A02, Qp7.A05, Qp7.A03});
        if (!z) {
            A03.add(0, Qp7.A04);
        }
        1Du it = ImmutableList.copyOf((Collection) A03).iterator();
        while (it.hasNext()) {
            Qp7 qp7 = (Qp7) it.next();
            Resources resources = context.getResources();
            int ordinal = qp7.ordinal();
            if (ordinal == 0) {
                string = resources.getString(2131966260);
                string2 = resources.getString(2131966255);
                ch4 = (CH4) bmX.A01.get();
                c1u3 = C1u3.A3W;
            } else if (ordinal == 1) {
                string = resources.getString(2131966257);
                string2 = resources.getString(2131966253);
                ch4 = (CH4) bmX.A01.get();
                c1u3 = C1u3.A3A;
            } else if (ordinal == 2) {
                string = resources.getString(2131966258);
                string2 = resources.getString(2131966254);
                ch4 = (CH4) bmX.A01.get();
                c1u3 = C1u3.A3B;
            } else if (ordinal != 3) {
                string2 = null;
                if (ordinal == 4) {
                    string = resources.getString(2131966259);
                    ch4 = (CH4) bmX.A01.get();
                    c1u3 = C1u3.A48;
                }
                r0 = null;
                A0l.A01(r0);
            } else {
                string = resources.getString(2131966261);
                string2 = resources.getString(2131966256);
                ch4 = (CH4) bmX.A01.get();
                c1u3 = C1u3.A3C;
            }
            CpE cpE = new CpE(2132411011, 0);
            CpE cpE2 = new CpE(2132410421, 0);
            CpE cpE3 = new CpE(2132410420, 0);
            CpE A0a = AbM.A0a(c1u3, 7zP.A0S(ch4.A02));
            C1790AsO c1790AsO = new C1790AsO(CPw.A03(resources, cpE, cpE3, cpE2, cpE3, A0a, A0a, A0a, A0a), string, string2);
            2K3 r323 = null;
            if (c1790AsO != null) {
                2hP A0I2 = 2hO.A0I(c1qb);
                ((2hQ) A0I2).A00.A07 = qp7.name();
                C1rq A01 = C1rg.A01(c1qb, null, 0);
                AbK.A1L(A01, A0o, 0.0f, 0);
                A01.A2N(true);
                A01.A2b();
                2RH r02 = 2RH.A03;
                4YU.A1L(A01, r02);
                A01.A1B(14.0f);
                A01.A2T(2Yg.A0B(c1qb, B23.class, "Rooms2LiveAudiencePickerSection", new Object[]{qp7}, -1755229903));
                C2cq A002 = C2cp.A00(c1qb, 0);
                A002.A2a((Drawable) c1790AsO.A00);
                7zO.A1J(A002, r02);
                A01.A2e(A002);
                C1rs A012 = 2cK.A01(c1qb, (String) null, 0);
                2KD A0X = 7zN.A0X(c1qb, A0o, 0);
                A0X.A2Y();
                A0X.A2z(c1790AsO.A02);
                A0X.A2e();
                A0X.A2l();
                4YU.A1O(A0X, 2RH.A09, c26z);
                4YU.A1K(A012, A0X);
                String str = c1790AsO.A01;
                if (str != null) {
                    2KD A013 = 2K3.A01(c1qb, 0);
                    A013.A2Y();
                    A013.A2x(A0o);
                    A013.A2z(str);
                    A013.A2d();
                    A013.A2i();
                    r323 = A013.A2W();
                }
                A012.A2e(r323);
                A01.A2e(A012);
                A0I2.A04(A01);
                r0 = A0I2.A02();
                A0l.A01(r0);
            }
            r0 = null;
            A0l.A01(r0);
        }
        return A0l.A00;
    }

    public Object A0e(1Im r302, Object obj) {
        QqI qqI;
        if (r302.A01 != -1755229903) {
            return null;
        }
        1Iw r0 = r302.A00.A00;
        Qp7 qp7 = (Qp7) r302.A03[0];
        CJA A0O = AbN.A0O(r0.A0D, "Rooms2LiveAudiencePickerSectionSpec");
        11T.A0F(qp7, 0);
        A0O.A00 = qp7;
        A0O.A06 = null;
        A0O.A04 = null;
        A0O.A07 = null;
        Iterator it = A0O.A0F.iterator();
        while (it.hasNext()) {
            B7l b7l = ((CCF) it.next()).A00;
            B7l.A00(b7l);
            B7l.A00(b7l);
        }
        CJA.A00(A0O);
        int ordinal = qp7.ordinal();
        if (ordinal == 3) {
            qqI = QqI.A02;
        } else {
            if (ordinal != 2) {
                A0O.A01();
                return null;
            }
            qqI = QqI.A01;
        }
        A0O.A02(qqI);
        return null;
    }

    public boolean A0i(2Yf r302, boolean z) {
        boolean z2 = true;
        if (this != r302 && (r302 == null || getClass() != r302.getClass())) {
            z2 = false;
        }
        return z2;
    }
}
