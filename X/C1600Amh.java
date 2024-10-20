package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Amh, reason: case insensitive filesystem */
/* loaded from: Amh.class */
public final class C1600Amh extends 1IG {
    public MigColorScheme A00;
    public final Context A01;
    public final C00i A04;
    public final CCI A08;
    public final CCI A09;
    public final CCI A0A;
    public final CCI A0B;
    public final CCI A0C;
    public final CCI A0D;
    public final CCI A0E;
    public final CCI A0F;
    public final CCI A0G;
    public final CCI A0H;
    public final CCI A0I;
    public final CCI A0J;
    public final CCI A0K;
    public final C1599Amg A0L;
    public final ImmutableList A0M;
    public final C00i A0R;
    public final C00i A05 = AbH.A0R();
    public final BcI A06 = (BcI) 1Bn.A0A(82666);
    public final C5yr A07 = (C5yr) 1Bi.A03(68198);
    public final Boolean A0N = (Boolean) 1Bn.A0A(33058);
    public final C00i A0Q = 1BV.A00(83711);
    public final C00i A0P = 1BV.A00(66371);
    public final C00i A0O = 1BQ.A02(66798);
    public final C00i A02 = 1BQ.A02(17012);
    public final C00i A03 = 1BV.A00(83654);
    public final BhS A0S = new BhS(this);
    public final 7yD A0T = new CsQ(this);

    public C1600Amh(Context context, Fragment fragment, 06Z r304, FbUserSession fbUserSession, 1pI r306, DFp dFp, MigColorScheme migColorScheme) {
        1BV A00 = 1BV.A00(83707);
        this.A0R = A00;
        this.A04 = 7zL.A0R(context, 83590);
        this.A01 = context;
        this.A00 = migColorScheme;
        Bit bit = (Bit) A00.get();
        View requireView = fragment.requireView();
        ArV arV = bit.A00;
        1pI A002 = 1vD.A00(requireView);
        Context A01 = FbInjector.A01();
        AbL.A0y(arV);
        try {
            C1599Amg c1599Amg = new C1599Amg(context, fragment, fbUserSession, A002, dFp);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0L = c1599Amg;
            CCI A003 = CCI.A00(context, r304, fbUserSession, r306, dFp, "EphemeralSection");
            this.A0C = A003;
            CCI A004 = CCI.A00(context, r304, fbUserSession, r306, dFp, "BumpedAccountsSection");
            this.A0A = A004;
            CCI A005 = CCI.A00(context, r304, fbUserSession, r306, dFp, "TopSection");
            this.A0K = A005;
            CCI A006 = CCI.A00(context, r304, fbUserSession, r306, dFp, "ForFamiliesSection");
            this.A0D = A006;
            CCI A007 = CCI.A00(context, r304, fbUserSession, r306, dFp, "MessengerKidsSection");
            this.A0G = A007;
            CCI A008 = CCI.A00(context, r304, fbUserSession, r306, dFp, "BusinessToolsSection");
            this.A0B = A008;
            CCI A009 = CCI.A00(context, r304, fbUserSession, r306, dFp, "ProfileSection");
            this.A0I = A009;
            CCI A0010 = CCI.A00(context, r304, fbUserSession, r306, dFp, "ServicesSection");
            this.A0J = A0010;
            CCI A0011 = CCI.A00(context, r304, fbUserSession, r306, dFp, "PreferenceSection");
            this.A0H = A0011;
            CCI A0012 = CCI.A00(context, r304, fbUserSession, r306, dFp, "AccountSection");
            this.A08 = A0012;
            CCI A0013 = CCI.A00(context, r304, fbUserSession, r306, dFp, "AlsoFromFacebookSection");
            this.A09 = A0013;
            CCI A0014 = CCI.A00(context, r304, fbUserSession, r306, dFp, "InternalSection");
            this.A0F = A0014;
            CCI A0015 = CCI.A00(context, r304, fbUserSession, r306, dFp, "ForMsplitSettingsSection");
            this.A0E = A0015;
            ImmutableList of = ImmutableList.of(A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015);
            this.A0M = of;
            1Du it = of.iterator();
            while (it.hasNext()) {
                CCI cci = (CCI) it.next();
                2CP r0 = (2CP) this.A0P.get();
                11T.A0F(cci, 0);
                r0.A01(new C1598Amf(cci));
            }
            ((2CP) this.A0P.get()).A01(this.A0L);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static ImmutableList A00(C1600Amh c1600Amh, ImmutableList immutableList, int i) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!immutableList.isEmpty()) {
            builder.m11011add((Object) new AnonymousClass570(c1600Amh.A00, c1600Amh.A01.getString(i)));
        }
        return AbG.A0y(builder, immutableList);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.C1600Amh r301, X.CCI r302, com.google.common.collect.ImmutableList.Builder r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600Amh.A01(X.Amh, X.CCI, com.google.common.collect.ImmutableList$Builder, java.lang.String):void");
    }

    public static void A02(C1600Amh c1600Amh, CCI cci, ImmutableList.Builder builder, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            A01(c1600Amh, cci, builder, strArr[i2]);
            i = i2 + 1;
        }
    }

    public void A05() {
        ((2CP) this.A0P.get()).A00();
    }
}
