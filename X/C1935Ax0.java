package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ax0, reason: case insensitive filesystem */
/* loaded from: Ax0.class */
public final class C1935Ax0 extends 1LH {
    public final C87w A00;
    public final 9Wi A01;
    public final MigColorScheme A02;

    public C1935Ax0(C87w c87w, 9Wi r303, MigColorScheme migColorScheme) {
        7zR.A1N(c87w, migColorScheme);
        this.A00 = c87w;
        this.A01 = r303;
        this.A02 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        Long l;
        C84j A00;
        int i;
        Long l2;
        Long l3;
        11T.A0F(c2k5, 0);
        2kW r0 = new 2kW();
        r0.A07 = new 2kZ(new 2XL((C02A) null, (C2kk) null, (2XO) null, (Boolean) null, (Integer) null, 2.0f, 0, 0, false, false, false, false, false, true), (1cU) null, (Integer) null, false, false);
        C2ke A002 = r0.A00();
        8OH A003 = C8m6.A00(c2k5.A05);
        MigColorScheme migColorScheme = this.A02;
        A003.A1H(migColorScheme.AjC());
        7zQ.A1C(A003);
        A003.A0e();
        ImmutableList.Builder A0h = 4YU.A0h();
        C87w c87w = this.A00;
        for (C1768As2 c1768As2 : (List) c87w.A03) {
            String str2 = c1768As2.A08;
            if (str2 != null && str2.length() != 0) {
                AnonymousClass557 A0V = 7zU.A0V(migColorScheme);
                A0V.A08(str2);
                Integer num = c1768As2.A01;
                if (num != 0S2.A00 || (l3 = c1768As2.A02) == null) {
                    if (num == 0S2.A01 && (l2 = c1768As2.A03) != null) {
                        A00 = COM.A01(l2.longValue());
                        i = 2131952606;
                    } else if (num != 0S2.A0C || (l = c1768As2.A04) == null) {
                        str = "";
                    } else {
                        A00 = COM.A00(l.longValue());
                        i = 2131952581;
                    }
                    str = 3yH.A0B(c2k5, new Object[]{A00.A00, A00.A01}, i);
                } else {
                    str = 3yH.A0A(c2k5, COM.A02("h:mm a", COM.A03(l3.longValue())), 2131952597);
                }
                A0V.A07(str);
                A0V.A01();
                Cvm.A00(A0V, c1768As2, this, 5);
                if (c87w.A01) {
                    7zN.A1W(A0V, new 5A0(new Cx2(this, c1768As2, 0), migColorScheme, ((Set) c87w.A00).contains(c1768As2)));
                }
                A0h.m11011add((Object) AbG.A0q(A0V));
            }
        }
        A003.A2W(1Fj.A01(A0h));
        A003.A01.A01 = A002;
        return AbH.A0s(A003);
    }
}
