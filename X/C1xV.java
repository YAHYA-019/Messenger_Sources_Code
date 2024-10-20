package X;

import android.content.Context;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1xV, reason: invalid class name */
/* loaded from: 1xV.class */
public final class C1xV {
    public final 1Br A00 = 1Bq.A00(16385);
    public final 1De A01;

    public C1xV(1De r302) {
        this.A01 = r302;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "HARD_BLOCK_SCREEN_ELIGIBILITY";
            case 2:
                return "WAI_CONNECTION_DISABLED_ELIGIBILITY";
            default:
                return "INLINE_REPLY_BLOCK_ELIGIBILITY";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Throwable, com.facebook.msys.mci.PrivacyContext] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1xV.A01():boolean");
    }

    public final boolean A02(Integer num) {
        PrivacyContext privacyContext;
        String A00;
        String str;
        String str2;
        String str3;
        C00i c00i = this.A00.A00;
        2yD r0 = (2yD) c00i.get();
        1GD r02 = 1GD.A05;
        boolean AZr = r0.AZr(r02, 36319600664656059L);
        boolean AZr2 = ((2yD) c00i.get()).AZr(r02, 36319600665049279L);
        boolean AZr3 = ((2yD) c00i.get()).AZr(r02, 36319600664787133L);
        long Av9 = ((2yD) c00i.get()).Av9(r02, 36601075643389219L);
        1BQ r03 = new 1BQ(66191);
        0dC r04 = (0dC) 1Bn.A0E((Context) null, this.A01.A00, 43);
        long days = TimeUnit.MILLISECONDS.toDays(Calendar.getInstance().getTimeInMillis() - 0dC.A00(r04, r04.A01).A00);
        0fH.A0l("PeriodicDeprecationUtil", AnonymousClass001.A0h(AnonymousClass001.A0n("ageOfBuildInDays="), days));
        long j = 7;
        boolean z = true;
        boolean z2 = false;
        if (days <= Av9 * j) {
            z2 = true;
        }
        0fH.A0l("PeriodicDeprecationUtil", 0Pz.A1C("buildIsExemptFromHardBlock=", z2));
        if (AZr) {
            if (AZr2) {
                0fH.A0n("PeriodicDeprecationUtil", "isLemonBuildDeprecationEnabled=true");
                PrivacyContextCoding privacyContextCoding = PrivacyContextCoding.$redex_init_class;
                privacyContext = AbstractC10694uc.A00;
                r03.get();
                A00 = A00(num);
                if (z2) {
                    str2 = "LEMON_BUILD_NEW_BUILD_EXEMPT_FROM_HARD_BLOCK";
                    C3Pc.A00(privacyContext, A00, str2);
                    return false;
                }
                str = "LEMON_BUILD_DEPRECATION";
                C3Pc.A00(privacyContext, A00, str);
            } else if (AZr3) {
                long Auy = 1BK.A0M(c00i).Auy(36601075641619744L);
                0fH.A0j("PeriodicDeprecationUtil", AnonymousClass001.A0h(AnonymousClass001.A0n("hardBlockExpirationOlderThanWeeks="), Auy));
                if (days <= Auy * j) {
                    z = false;
                }
                0fH.A0l("PeriodicDeprecationUtil", 0Pz.A1C("buildHasExpired=", z));
                if (z) {
                    PrivacyContextCoding privacyContextCoding2 = PrivacyContextCoding.$redex_init_class;
                    privacyContext = AbstractC10694uc.A00;
                    r03.get();
                    A00 = A00(num);
                    if (z2) {
                        str2 = "ROLLING_DEPRECATION_NEW_BUILD_EXEMPT_FROM_HARD_BLOCK";
                        C3Pc.A00(privacyContext, A00, str2);
                        return false;
                    }
                    str = "BUILD_HAS_EXPIRED";
                    C3Pc.A00(privacyContext, A00, str);
                }
            } else {
                str3 = "appHardBlockerAfterExpirationEnabled=false";
            }
            return z;
        }
        str3 = "appFullScreenBlockerEnabled=false";
        0fH.A0l("PeriodicDeprecationUtil", str3);
        return false;
    }
}
