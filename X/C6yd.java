package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.6yd, reason: invalid class name */
/* loaded from: 6yd.class */
public final class C6yd implements 6yJ, 6yM {
    public final 5zF A02;
    public final C5yf A03;
    public final ThreadViewColorScheme A04;
    public final ThreadThemeInfo A05;
    public final 1Br A01 = 1Bu.A00(66207);
    public final 1Br A00 = 1Bu.A00(67782);

    public C6yd(C5yf c5yf, ThreadViewColorScheme threadViewColorScheme, ThreadThemeInfo threadThemeInfo) {
        this.A05 = threadThemeInfo;
        this.A04 = threadViewColorScheme;
        this.A03 = c5yf;
        this.A02 = new 5zF(c5yf, threadViewColorScheme, threadThemeInfo);
    }

    private final Integer A00(C5fv c5fv) {
        Integer num;
        if (c5fv instanceof 5wJ) {
            num = 0S2.A0Y;
        } else {
            if (c5fv.AxW(C5lx.A00) != null) {
                return 0S2.A01;
            }
            5uQ AxW = c5fv.AxW(5mB.A00);
            if (AxW != null && AxW.A04) {
                return 0S2.A0N;
            }
            6By AxW2 = c5fv.AxW(6Bx.A00);
            Integer num2 = null;
            if (AxW2 != null) {
                num2 = AxW2.A00;
            }
            num = 0S2.A00;
            if (num2 == num) {
                return 0S2.A0u;
            }
        }
        return num;
    }

    public int AV0(Context context) {
        return this.A02.A00;
    }

    public int AVF(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.AjC();
    }

    public int AVH(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.B4i();
    }

    public int AW3(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.B4i();
    }

    public int AYq(Context context) {
        int i;
        if (11T.A0O(this.A05.A02(), "THEME")) {
            return 1tG.A05(this.A04.A05, ActionId.APPLY_FINISHED_LIST);
        }
        5zF r0 = this.A02;
        r0.A08.get();
        ThreadThemeInfo threadThemeInfo = r0.A07;
        MigColorScheme migColorScheme = r0.A06.A0F;
        11T.A0F(migColorScheme, 1);
        return (threadThemeInfo == null || (i = threadThemeInfo.A0O) == 0) ? migColorScheme.AYp() : i;
    }

    public int AgK(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.Atv();
    }

    public int Agp(Context context) {
        Integer num = 0S2.A00;
        return this.A02.Aa2(this.A03, num, num);
    }

    public int AjS(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.BEj();
    }

    public int AkV(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.AkX();
    }

    public List Ao4(Context context) {
        return this.A02.Ao3();
    }

    public int Ap3(Context context) {
        5zF r0 = this.A02;
        return r0.Aa3(r0.A05, 0S2.A01);
    }

    public int Ap4(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.BEj();
    }

    public int Avb(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.AZO();
    }

    public int Avc(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.BKh();
    }

    public 7Gu Awn(Context context, C5fv c5fv) {
        5aU r0;
        11T.A0F(context, 0);
        11T.A0F(c5fv, 1);
        5vF AxW = c5fv.AxW(C5gH.A00);
        boolean z = false;
        if (AxW != null && (r0 = AxW.A01) != null && (r0.isAvatarType || r0 == 5aU.A0C || r0 == 5aU.A0D)) {
            z = true;
        }
        7Gu r311 = null;
        if (!z) {
            Integer A00 = A00(c5fv);
            5zF r02 = this.A02;
            Integer num = ((C5fu) c5fv).A0H ? 0S2.A00 : 0S2.A01;
            Integer num2 = 0S2.A01;
            if (A00 == num2) {
                num = num2;
            }
            int intValue = num.intValue();
            r02.A08.get();
            ThreadThemeInfo threadThemeInfo = r02.A07;
            7Gu A01 = intValue != 0 ? C5ye.A01(threadThemeInfo) : C5ye.A02(threadThemeInfo);
            if (A01 != null) {
                return A01;
            }
            int intValue2 = A00.intValue();
            if (intValue2 != 4 && intValue2 != 2 && intValue2 != 6) {
                return null;
            }
            Resources resources = context.getResources();
            11T.A0A(resources);
            11T.A0A(context.getResources());
            int A05 = 3yG.A05(resources, r0.getDimensionPixelSize(2132279351));
            MigColorScheme migColorScheme = this.A04.A0F;
            11T.A0A(migColorScheme);
            r311 = new 7Gu(A05, migColorScheme.B9e());
        }
        return r311;
    }

    public int Awu(Context context, C5fv c5fv) {
        11T.A0F(c5fv, 1);
        if ((c5fv instanceof 5gP) && 6Bl.A04(((5gP) c5fv).A01)) {
            return this.A02.ApT(this.A03);
        }
        return this.A02.Aa2(this.A03, ((C5fu) c5fv).A0H ? 0S2.A00 : 0S2.A01, A00(c5fv));
    }

    public List Awy(Context context, C5fv c5fv) {
        ImmutableList Ao3;
        Number number;
        11T.A0F(c5fv, 1);
        if (((C5fu) c5fv).A0H || ((c5fv instanceof 5gP) && 6Bl.A04(((5gP) c5fv).A01))) {
            Ao3 = this.A02.Ao3();
            11T.A0D(Ao3);
        } else {
            Ao3 = this.A05.A0c;
            11T.A0A(Ao3);
        }
        return (Ao3.size() < 2 || ((number = (Number) 0QD.A0D(Ao3)) != null && number.intValue() == 0)) ? C0ty.A00 : Ao3;
    }

    public int Ax0(Context context, C5fv c5fv) {
        11T.A0F(context, 0);
        11T.A0F(c5fv, 1);
        if (((C5fu) c5fv).A0H) {
            return BEr(context, c5fv);
        }
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.AqM();
    }

    public int Ax9(Context context, C5fv c5fv) {
        11T.A0F(c5fv, 1);
        return 1tG.A05(this.A02.Aa2(this.A03, ((C5fu) c5fv).A0H ? 0S2.A00 : 0S2.A01, 0S2.A01), this.A04.A09);
    }

    public int AxA(Context context, C5fv c5fv) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.B4i();
    }

    public int AxC(Context context, C5fv c5fv) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.B9Q();
    }

    public /* synthetic */ int AzK(Context context) {
        11T.A0F(context, 1);
        return context.getColor(2132214563);
    }

    public int Azn(Context context) {
        return this.A02.A00;
    }

    public int Azt(Context context) {
        boolean A00 = ((C1pD) 1Bi.A03(66708)).A00();
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return A00 ? migColorScheme.B9Q() : migColorScheme.BEj();
    }

    public /* synthetic */ int B2h() {
        return 0;
    }

    public int B2k(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.Awo();
    }

    public int B62(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.B9O();
    }

    public int B65(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.Abp();
    }

    public int B66(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.Abp();
    }

    public int B67(Context context, Integer num, boolean z) {
        int Aa2;
        11T.A0F(context, 0);
        11T.A0F(num, 2);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                throw 1BK.A1F();
            }
            this.A01.A00.get();
            ThreadThemeInfo threadThemeInfo = this.A05;
            Aa2 = this.A02.Aa2(this.A03, 0S2.A01, 0S2.A00);
            int i = threadThemeInfo.A0L;
            if (i != 0) {
                return i;
            }
        } else {
            if (z) {
                int i2 = this.A05.A08;
                if (i2 == 0) {
                    MigColorScheme migColorScheme = this.A04.A0F;
                    11T.A0A(migColorScheme);
                    i2 = migColorScheme.Ah8();
                }
                return 1tG.A05(i2, 77);
            }
            Integer num2 = 0S2.A01;
            Integer num3 = 0S2.A00;
            5zF r0 = this.A02;
            C5yf c5yf = this.A03;
            Aa2 = r0.Aa2(c5yf, num2, num3);
            if (Aa2 == r0.A03) {
                return r0.Aa2(c5yf, num3, num3);
            }
        }
        return Aa2;
    }

    public int B68(Context context) {
        11T.A0F(context, 0);
        return this.A02.A03;
    }

    public int B69(Context context, Integer num, boolean z) {
        11T.A0F(context, 0);
        11T.A0F(num, 2);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                throw 1BK.A1F();
            }
            MigColorScheme migColorScheme = this.A04.A0F;
            11T.A0A(migColorScheme);
            return z ? migColorScheme.B4i() : migColorScheme.BEj();
        }
        if (!z) {
            MigColorScheme migColorScheme2 = this.A04.A0F;
            11T.A0A(migColorScheme2);
            return migColorScheme2.B9Q();
        }
        int i = this.A05.A08;
        if (i == 0) {
            MigColorScheme migColorScheme3 = this.A04.A0F;
            11T.A0A(migColorScheme3);
            i = migColorScheme3.Ah8();
        }
        return 1tG.A04(1291845632, i);
    }

    public int B9h(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.B9e();
    }

    public int B9l(Context context) {
        return this.A04.A07;
    }

    public int BBU(Context context) {
        boolean A00 = ((C1pD) 1Bi.A03(66708)).A00();
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return A00 ? migColorScheme.B9Q() : migColorScheme.BEj();
    }

    public int BDm(Context context) {
        return this.A02.A03;
    }

    public int BDs(Context context) {
        return this.A02.A00;
    }

    public int BDv(Context context) {
        return this.A02.A04;
    }

    public int BEr(Context context, C5fv c5fv) {
        5aU r0;
        11T.A0F(c5fv, 1);
        5vF AxW = c5fv.AxW(C5gH.A00);
        if (AxW == null || (r0 = AxW.A01) == null || !(r0 == 5aU.A0C || r0 == 5aU.A0D)) {
            return this.A02.AzP(((C5fu) c5fv).A0H ? 0S2.A00 : 0S2.A01, A00(c5fv));
        }
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.BKh();
    }

    public int BGB(Context context) {
        return this.A05.A0P;
    }

    public int BGF(Context context) {
        MigColorScheme migColorScheme = this.A04.A0F;
        11T.A0A(migColorScheme);
        return migColorScheme.B9N();
    }

    public int BIW(Context context, C5fv c5fv) {
        11T.A0F(c5fv, 1);
        if ((c5fv instanceof 5gP) && 6Bl.A04(((5gP) c5fv).A01)) {
            return this.A02.ApT(this.A03);
        }
        Integer num = 0S2.A00;
        return this.A02.Aa2(this.A03, num, num);
    }
}
