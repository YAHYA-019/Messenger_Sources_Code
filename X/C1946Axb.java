package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Axb, reason: case insensitive filesystem */
/* loaded from: Axb.class */
public final class C1946Axb extends 1LH {
    public final Hmb A00;
    public final AtA A01;
    public final MigColorScheme A02;
    public final String A03;
    public final 2lO A04;

    public C1946Axb(2lO r302, Hmb hmb, AtA atA, MigColorScheme migColorScheme, String str) {
        7zS.A17(1, str, migColorScheme, hmb);
        this.A03 = str;
        this.A04 = r302;
        this.A01 = atA;
        this.A02 = migColorScheme;
        this.A00 = hmb;
    }

    public 1LI A0s(C2k5 c2k5) {
        8cE r305;
        C58c c58c;
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        FbUserSession A01 = 1Fw.A01(r0.A0D);
        2lQ r02 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, new 2lT(0S2.A01, 1.0f));
        Integer num = 0S2.A0C;
        2lO A00 = 7zQ.A0X(A0g, num, 1.0f).A00(this.A04);
        C2sn A0U = 7zQ.A0U(r0);
        AwR A002 = B12.A00(A0U.AeS());
        A002.A2X(3yH.A09(A0U, 2131964947));
        4YU.A1M(A002, 2RH.A03);
        A0U.A00(A002.A2W());
        AtA atA = this.A01;
        C2629Gje c2629Gje = atA.A00;
        if (c2629Gje.A02) {
            Bt0 bt0 = new Bt0(3vP.A00(A0U), this.A02, this.A03);
            boolean z = c2629Gje.A01;
            J9u j9u = new J9u(this, 48);
            J9u j9u2 = new J9u(this, 49);
            11T.A0F(A01, 0);
            ImmutableList immutableList = ((Bgq) 1Br.A0B(bt0.A01)).A00;
            r305 = new 8cE(new Coz(j9u), new Cp4(A01, bt0), bt0.A02, immutableList, new J9u(j9u2, 46), z);
        } else {
            r305 = null;
        }
        A0U.A00(r305);
        8OH A003 = C8m6.A00(A0U.A00);
        A003.A0k(1.0f);
        A003.A0j(1.0f);
        A003.A01.A03 = true;
        ImmutableList.Builder builder = ImmutableList.builder();
        List list = atA.A05;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                if (atA.A06) {
                    LightColorScheme.A00();
                    MigColorScheme migColorScheme = this.A02;
                    builder.m11011add((Object) new 55Y(migColorScheme, 0, 20, 0, 0));
                    builder.m11011add((Object) new C56m(migColorScheme));
                }
                A003.A2W(1Fj.A01(builder));
                A003.A0J();
                return 7zM.A0l(A003.A01, A0U, c2k5, A00);
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            List<C1788AsM> A0S = 0QD.A0S((Iterable) ((8Ls) next).A00);
            ArrayList A0z = 1BL.A0z(A0S);
            boolean z2 = false;
            for (C1788AsM c1788AsM : A0S) {
                AnonymousClass557 A0p = 7zL.A0p();
                MigColorScheme migColorScheme2 = this.A02;
                A0p.A05(migColorScheme2);
                Number number = (Number) c1788AsM.A03;
                A0p.A00 = number.intValue();
                CJh.A02(A0p, c1788AsM.A04);
                2MQ r03 = (2MQ) c1788AsM.A02;
                if (r03 != null) {
                    migColorScheme2.getClass();
                    num.getClass();
                    c58c = new C58c(r03, null, null, migColorScheme2, num);
                } else {
                    c58c = null;
                }
                A0p.A05 = c58c;
                ImmutableList.Builder A0h = 4YU.A0h();
                Number number2 = (Number) c1788AsM.A01;
                if (number2 != null) {
                    A0h.m11011add((Object) BXX.A00(migColorScheme2, (CharSequence) null, number2.intValue()));
                }
                A0p.A06(1Fj.A01(A0h));
                Cvm cvm = new Cvm(c1788AsM, this, 32);
                String str = c1788AsM.A05;
                A0p.A02(C5wy.A00(cvm, null, migColorScheme2, str, "android.widget.Button", false, false));
                if (number == 0S2.A1J) {
                    A0p.A03(5OL.A01(str, migColorScheme2.AkX()));
                } else {
                    A0p.A08(str);
                }
                AbG.A1R(A0p, builder);
                A0z.add(builder);
                z2 = true;
            }
            if (i2 != list.size() - 1 && z2) {
                MigColorScheme migColorScheme3 = this.A02;
                LightColorScheme.A00();
                builder.m11011add((Object) new 55Y(migColorScheme3, 7, 0, 0, 0));
            }
            i = i3;
        }
    }
}
