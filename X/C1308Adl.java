package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.Adl, reason: case insensitive filesystem */
/* loaded from: Adl.class */
public final class C1308Adl implements DFg {
    public int A00;
    public int A01;
    public BP5 A02;
    public HashMap A03;
    public final Context A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final D2x A08;
    public final 2YJ A09;
    public final 2YJ A0A;
    public final 53M A0B;
    public final DJ0 A0C;
    public final AeL A0D;
    public final BhP A0E = (BhP) 1Bi.A03(84043);
    public final 1Ih A0F;
    public final WeakReference A0G;

    public C1308Adl(Context context, FbUserSession fbUserSession, 2YJ r304, 2YJ r305, DIT dit, BP5 bp5, 53M r308, DJ0 dj0, HashMap hashMap) {
        1BQ A0X = AbH.A0X();
        this.A06 = A0X;
        this.A04 = context;
        1Bn.A0E(context, (1BY) null, 147892);
        this.A0D = new AeL(context, fbUserSession);
        this.A0F = (1Ih) 7zM.A19();
        1Bn.A0E(context, (1BY) null, 148050);
        this.A08 = new D2x(fbUserSession, context);
        this.A0C = dj0;
        this.A0G = 7zL.A14(dit);
        this.A09 = r304;
        this.A0A = r305;
        this.A0B = r308;
        this.A03 = hashMap;
        this.A02 = bp5;
        this.A05 = 1Lo.A00(context, fbUserSession, 84246);
        this.A07 = 1Lo.A00(context, fbUserSession, 84248);
        this.A01 = 2yD.A00(AbJ.A0f(A0X), 36606242489834889L);
    }

    private C55c A00(Integer num) {
        Resources resources;
        String string;
        BP5 bp5;
        BVx bVx = BVx.$redex_init_class;
        int intValue = num.intValue();
        String str = "";
        if (intValue != 1) {
            resources = this.A0F;
            if (intValue != 3) {
                string = resources.getString(2131962597);
                bp5 = BP5.A0F;
            } else {
                string = resources.getString(2131962603);
                bp5 = BP5.A0N;
            }
        } else {
            resources = this.A0F;
            string = resources.getString(2131962607);
            bp5 = BP5.A0X;
        }
        if (string != null && bp5 != BP5.A0R) {
            str = resources.getString(2131962613);
        }
        9pY r0 = new 9pY(this, bp5, string, 4);
        C1302Adf A01 = C1302Adf.A01(this.A0D, string);
        A01.A05 = str;
        A01.A02 = r0;
        return A01.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0082, code lost:
    
        if (r0 != X.53M.A01) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0191, code lost:
    
        if (r0.A0A == X.53N.A0Q) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x08ff, code lost:
    
        if (X.4YU.A1Y(r0, 76) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x091a, code lost:
    
        if (X.4YU.A1Y(r0, 83) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x091d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r312);
        r8 = r317;
        r342 = new X.55L(r0, new X.C57x(r0, r0, r0, r0, r0, r0, r0, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0991, code lost:
    
        r312 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0907, code lost:
    
        if (r0 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x06ef, code lost:
    
        if (r320 != null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0797 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x06a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0664 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.common.collect.ImmutableList A01(final X.EnumC1297Ada r302, X.C1317Adv r303, com.google.common.collect.ImmutableList r304, final int r305) {
        /*
            Method dump skipped, instructions count: 2508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1308Adl.A01(X.Ada, X.Adv, com.google.common.collect.ImmutableList, int):com.google.common.collect.ImmutableList");
    }

    private ImmutableList A02(EnumC1297Ada enumC1297Ada, C1317Adv c1317Adv, ImmutableList immutableList, int i, boolean z) {
        CYv cYv;
        if (immutableList.isEmpty()) {
            return ImmutableList.of();
        }
        int i2 = 3;
        if (z) {
            i2 = 5;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        1Ih r0 = this.A0F;
        String string = r0.getString(2131962617);
        String str = null;
        if (C1gb.A01(this.A06).AZk(36319227003025112L)) {
            str = r0.getString(2131962613);
            cYv = new CYv(this, string, i, 1, z);
        } else {
            cYv = null;
        }
        A05(cYv, this, builder, string, str);
        if (immutableList.size() >= i2) {
            immutableList = immutableList.subList(0, i2);
        }
        return AbG.A0y(builder, A01(enumC1297Ada, c1317Adv, immutableList, i));
    }

    private ImmutableList A03(EnumC1297Ada enumC1297Ada, C1317Adv c1317Adv, ImmutableList immutableList, int i, boolean z) {
        if (immutableList.isEmpty()) {
            return ImmutableList.of();
        }
        int i2 = 3;
        if (z) {
            i2 = 5;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        1Ih r0 = this.A0F;
        String string = r0.getString(2131962612);
        A05(new CYv(this, string, i, 2, z), this, builder, string, r0.getString(2131962613));
        if (immutableList.size() >= i2) {
            immutableList = immutableList.subList(0, i2);
        }
        return AbG.A0y(builder, A01(enumC1297Ada, c1317Adv, immutableList, i));
    }

    private ImmutableList A04(EnumC1297Ada enumC1297Ada, C1317Adv c1317Adv, ImmutableList immutableList, int i, boolean z) {
        if (immutableList.isEmpty()) {
            return ImmutableList.of();
        }
        int i2 = 3;
        if (z) {
            i2 = 5;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        1Ih r0 = this.A0F;
        String string = r0.getString(2131962626);
        A05(new CYv(this, string, i, 0, z), this, builder, string, r0.getString(2131962613));
        if (immutableList.size() >= i2) {
            immutableList = immutableList.subList(0, i2);
        }
        return AbG.A0y(builder, A01(enumC1297Ada, c1317Adv, immutableList, i));
    }

    public static void A05(View.OnClickListener onClickListener, C1308Adl c1308Adl, ImmutableList.Builder builder, String str, String str2) {
        C1302Adf A01 = c1308Adl.A0D.A01();
        A01.A01 = str.hashCode();
        A01.A07 = str;
        A01.A05 = str2;
        A01.A02 = onClickListener;
        builder.m11011add((Object) A01.A02());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r313 != X.EnumC1297Ada.A0X) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00b3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06b2  */
    @Override // X.DFg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList D4u(X.ByH r302, com.google.common.collect.ImmutableList r303) {
        /*
            Method dump skipped, instructions count: 2742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1308Adl.D4u(X.ByH, com.google.common.collect.ImmutableList):com.google.common.collect.ImmutableList");
    }
}
