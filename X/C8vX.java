package X;

import android.content.Context;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.8vX, reason: invalid class name */
/* loaded from: 8vX.class */
public final class C8vX extends 8AL implements 6yJ, 6yM {
    public final 1Br A00;
    public final ThreadThemeInfo A01;

    public C8vX(ThreadViewColorScheme threadViewColorScheme, ThreadThemeInfo threadThemeInfo) {
        super(threadViewColorScheme, threadViewColorScheme.A0D);
        this.A01 = threadThemeInfo;
        this.A00 = 1BK.A0C();
    }

    public static final int A01(C8vX c8vX) {
        int i;
        ThreadThemeInfo threadThemeInfo = c8vX.A01;
        return (threadThemeInfo.A0T == ((long) (-1)) || (i = threadThemeInfo.A08) == 0) ? ((8AL) c8vX).A00.A0F.Ah8() : i;
    }

    public static final List A02(C8vX c8vX) {
        ImmutableList immutableList = c8vX.A01.A0c;
        11T.A0A(immutableList);
        return (!1Br.A07(c8vX.A00).AZk(36316439571540053L) || immutableList.isEmpty()) ? C0ty.A00 : immutableList;
    }

    public int AV0(Context context) {
        return BDs(context);
    }

    public int AVF(Context context) {
        return ((8AL) this).A00.A0F.AjC();
    }

    public int AVH(Context context) {
        return ((8AL) this).A00.A0F.B4i();
    }

    public int AgK(Context context) {
        return ((8AL) this).A00.A0F.Atv();
    }

    public int Agp(Context context) {
        ThreadThemeInfo threadThemeInfo = this.A01;
        ImmutableList immutableList = threadThemeInfo.A0a;
        11T.A0A(immutableList);
        if (immutableList.isEmpty()) {
            int i = threadThemeInfo.A08;
            return (i == 0 || i == -1) ? 1Br.A07(this.A00).AZk(36316439571736664L) ? ((8AL) this).A00.A0F.AZc() : context.getColor(2132214429) : i;
        }
        Object A0F = 0QD.A0F(immutableList);
        11T.A0A(A0F);
        return AnonymousClass001.A03(A0F);
    }

    public int AjS(Context context) {
        return ((8AL) this).A00.A0F.BEj();
    }

    public int AkV(Context context) {
        return ((8AL) this).A00.A0F.B6U();
    }

    public int Ap3(Context context) {
        return ((8AL) this).A00.A05;
    }

    public int Ap4(Context context) {
        return ((8AL) this).A00.A0F.BEj();
    }

    public int Avb(Context context) {
        return ((8AL) this).A00.A0F.AZO();
    }

    public int Avc(Context context) {
        return ((8AL) this).A00.A0F.BKh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (X.6Bl.A04(((X.5gP) r303).A01) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Awu(android.content.Context r302, X.C5fv r303) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vX.Awu(android.content.Context, X.5fv):int");
    }

    public int Ax9(Context context, C5fv c5fv) {
        ThreadViewColorScheme threadViewColorScheme = ((8AL) this).A00;
        return 1tG.A05(threadViewColorScheme.A05, threadViewColorScheme.A09);
    }

    public int AxA(Context context, C5fv c5fv) {
        return ((8AL) this).A00.A0F.B4i();
    }

    public int AxC(Context context, C5fv c5fv) {
        return ((8AL) this).A00.A0F.B9Q();
    }

    public int Azn(Context context) {
        return BDs(context);
    }

    public int Azt(Context context) {
        boolean A1Y = 7zS.A1Y();
        MigColorScheme migColorScheme = ((8AL) this).A00.A0F;
        return A1Y ? migColorScheme.B9Q() : migColorScheme.BEj();
    }

    public int B62(Context context) {
        return ((8AL) this).A00.A0F.B9O();
    }

    public int B65(Context context) {
        return ((8AL) this).A00.A0F.Abp();
    }

    public int B66(Context context) {
        return ((8AL) this).A00.A0F.Abp();
    }

    public int B67(Context context, Integer num, boolean z) {
        int intValue;
        4YV.A1N(context, num);
        if (num != 0S2.A01) {
            Number number = (Number) 0QD.A0G(A02(this));
            return number != null ? number.intValue() : ((8AL) this).A00.A05;
        }
        if (z) {
            intValue = 1tG.A05(A01(this), 77);
        } else {
            ImmutableList immutableList = this.A01.A0c;
            11T.A0A(immutableList);
            Number number2 = (Number) 0QD.A0E(immutableList);
            if (number2 == null || number2.intValue() == 0) {
                number2 = Integer.valueOf(((8AL) this).A00.A05);
            }
            intValue = number2.intValue();
            if (BDm(context) == intValue) {
                return 8AL.A00(context, this);
            }
        }
        return intValue;
    }

    public int B68(Context context) {
        11T.A0F(context, 0);
        return BDm(context);
    }

    public int B69(Context context, Integer num, boolean z) {
        4YV.A1N(context, num);
        if (num == 0S2.A01) {
            return z ? 1tG.A04(1291845632, A01(this)) : ((8AL) this).A00.A0F.B9Q();
        }
        MigColorScheme migColorScheme = ((8AL) this).A00.A0F;
        return z ? migColorScheme.B4i() : migColorScheme.BEj();
    }

    public int B9h(Context context) {
        return ((8AL) this).A00.A0F.B9e();
    }

    public int B9l(Context context) {
        return ((8AL) this).A00.A07;
    }

    public int BBU(Context context) {
        boolean A1Y = 7zS.A1Y();
        MigColorScheme migColorScheme = ((8AL) this).A00.A0F;
        return A1Y ? migColorScheme.B9Q() : migColorScheme.BEj();
    }
}
