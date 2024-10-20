package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Fxn.class */
public final class Fxn implements GHF {
    public final Ebp A00;
    public final FyG A01;
    public final Eh3 A02;

    public Fxn(Eh3 eh3, Ebp ebp, FyG fyG) {
        this.A01 = fyG;
        this.A00 = ebp;
        this.A02 = eh3;
    }

    public void ARF(FFD ffd, DLG dlg) {
        Eh3 eh3 = this.A02;
        Set set = (Set) eh3.A01.A01.get(eh3.A00);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                DLQ A0s = DKC.A0s(it);
                11T.A0F(A0s, 0);
                String A0t = DKD.A0t(A0s, "", 38);
                List list = A0s.A0A;
                if (F2Z.A00(A0s, 51, true) && list != null && !list.isEmpty()) {
                    String A00 = F2U.A00(0S2.A01, list);
                    11T.A0A(A00);
                    A0t = F2U.A01(A0t, A00);
                    11T.A0D(A0t);
                }
                Ebp ebp = this.A00;
                11T.A0F(A0t, 0);
                FbSharedPreferences fbSharedPreferences = ebp.A00;
                1G2 r0 = 1G0.A04;
                1G3 A0D = r0.A0D("bloks/impression-time-tracker/");
                11T.A0A(A0D);
                boolean A1N = AnonymousClass001.A1N((fbSharedPreferences.Av1(1G3.A00(A0D, A0t), 2147483648L) > 2147483648L ? 1 : (fbSharedPreferences.Av1(1G3.A00(A0D, A0t), 2147483648L) == 2147483648L ? 0 : -1)));
                1G3 A0D2 = r0.A0D("bloks/impression-time-tracker/");
                11T.A0A(A0D2);
                EkY ekY = new EkY(ffd, dlg, Long.valueOf(fbSharedPreferences.Av1(1G3.A00(A0D2, A0t), 2147483648L)), A1N);
                GJj A08 = A0s.A08();
                if (dlg.A02(ffd) == 0S2.A00 && A08 != null) {
                    1Ql edit = fbSharedPreferences.edit();
                    1G3 A0D3 = r0.A0D("bloks/impression-time-tracker/");
                    11T.A0A(A0D3);
                    edit.CaH(1G3.A00(A0D3, A0t), System.currentTimeMillis());
                    edit.commit();
                    Set<1G2> Asu = fbSharedPreferences.Asu(1G3.A00(r0, "bloks/impression-time-tracker/"));
                    if (Asu.size() > 200) {
                        int min = Math.min(Asu.size() - 150, 500);
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        1Ql edit2 = fbSharedPreferences.edit();
                        11T.A0A(edit2);
                        int i = 0;
                        for (1G2 r02 : Asu) {
                            Object BIj = fbSharedPreferences.BIj(r02);
                            11T.A0I(BIj, "null cannot be cast to non-null type kotlin.Long");
                            Number number = (Number) BIj;
                            if (11T.A01(number.longValue(), currentTimeMillis) > 0) {
                                edit2.Cdj(r02);
                                i++;
                            } else {
                                A0s2.add(number);
                            }
                        }
                        if (min > i) {
                            Collections.sort(A0s2);
                            Object obj = A0s2.get((min - i) - 1);
                            11T.A0A(obj);
                            long A05 = AnonymousClass001.A05(obj);
                            for (1G2 r03 : Asu) {
                                Object BIj2 = fbSharedPreferences.BIj(r03);
                                11T.A0I(BIj2, "null cannot be cast to non-null type kotlin.Long");
                                if (11T.A01(AnonymousClass001.A05(BIj2), A05) <= 0) {
                                    edit2.Cdj(r03);
                                }
                            }
                        }
                        edit2.commit();
                    }
                    DKM A02 = DKM.A02(ekY);
                    FyG fyG = this.A01;
                    A02.A0I(fyG);
                    DKM.A0D(A0s, fyG, A02, A08);
                }
                GJj A07 = A0s.A07();
                if (A07 != null && dlg.A02(ffd) == 0S2.A0C) {
                    DKM A022 = DKM.A02(ekY);
                    FyG fyG2 = this.A01;
                    A022.A0I(fyG2);
                    DKM.A0D(A0s, fyG2, A022, A07);
                }
                GJj A0u = DKC.A0u(A0s);
                if (A0u != null && dlg.A02(ffd) == 0S2.A01) {
                    DKM A023 = DKM.A02(ekY);
                    FyG fyG3 = this.A01;
                    A023.A0I(fyG3);
                    DKM.A0D(A0s, fyG3, A023, A0u);
                }
            }
        }
    }
}
