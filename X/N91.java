package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: N91.class */
public final class N91 implements Runnable {
    public static final String __redex_internal_original_name = "MessagingInBlueInteractionStore$hasInitiated$1";
    public final /* synthetic */ N2E A00;

    public N91(N2E n2e) {
        this.A00 = n2e;
    }

    public static long A00(FbSharedPreferences fbSharedPreferences, 1G2 r302) {
        return fbSharedPreferences.Av1(r302, Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL));
    }

    public static 1G9 A01(C00i c00i, C00i c00i2, 1G9 r303) {
        return 1G9.A05(r303.A0F(0Pz.A0W((String) c00i.get(), "/")), (String) c00i2.get());
    }

    @Override // java.lang.Runnable
    public final void run() {
        N2E n2e = this.A00;
        synchronized (n2e) {
            C00j.A05("MessagingInBlueInteractionStore.initializeStore", 352419616);
            try {
                N1G n1g = n2e.A00;
                if (n1g != null) {
                    synchronized (n1g) {
                        C00i c00i = n1g.A0Z;
                        FbSharedPreferences A0R = 1BK.A0R(c00i);
                        1G9 r0 = C5p0.A0B;
                        C00i c00i2 = n1g.A0Y;
                        n1g.A0W = A0R.A3a(1G9.A05(r0, MRl.A0M(c00i2)), ConstantsKt.CAMERA_ID_FRONT);
                        FbSharedPreferences A0R2 = 1BK.A0R(c00i);
                        1G9 r02 = C5p0.A0F;
                        C00i c00i3 = n1g.A0X;
                        long A00 = A00(A0R2, 1G9.A05(r02.A0F(0Pz.A0W(MRl.A0M(c00i3), "/")), MRl.A0M(c00i2)));
                        Long valueOf = Long.valueOf(A00);
                        Long l = null;
                        if (A00 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf = null;
                        }
                        n1g.A0F = valueOf;
                        n1g.A0O = valueOf;
                        long A002 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0Y));
                        Long valueOf2 = Long.valueOf(A002);
                        if (A002 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf2 = null;
                        }
                        n1g.A0V = valueOf2;
                        n1g.A0U = valueOf2;
                        Boolean valueOf3 = Boolean.valueOf(1BK.A0R(c00i).AZn(A01(c00i3, c00i2, C5p0.A0X), false));
                        n1g.A0B = valueOf3;
                        n1g.A08 = valueOf3;
                        Boolean asBooleanObject = 1BK.A0R(c00i).AZo(A01(c00i3, c00i2, C5p0.A0I)).asBooleanObject();
                        n1g.A01 = asBooleanObject;
                        n1g.A04 = asBooleanObject;
                        Boolean asBooleanObject2 = 1BK.A0R(c00i).AZo(A01(c00i3, c00i2, C5p0.A0K)).asBooleanObject();
                        n1g.A02 = asBooleanObject2;
                        n1g.A05 = asBooleanObject2;
                        Boolean asBooleanObject3 = 1BK.A0R(c00i).AZo(A01(c00i3, c00i2, C5p0.A07)).asBooleanObject();
                        n1g.A00 = asBooleanObject3;
                        n1g.A03 = asBooleanObject3;
                        Boolean asBooleanObject4 = 1BK.A0R(c00i).AZo(A01(c00i3, c00i2, C5p0.A0V)).asBooleanObject();
                        n1g.A09 = asBooleanObject4;
                        n1g.A06 = asBooleanObject4;
                        Boolean asBooleanObject5 = 1BK.A0R(c00i).AZo(A01(c00i3, c00i2, C5p0.A0W)).asBooleanObject();
                        n1g.A0A = asBooleanObject5;
                        n1g.A07 = asBooleanObject5;
                        long A003 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0J));
                        Long valueOf4 = Long.valueOf(A003);
                        if (A003 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf4 = null;
                        }
                        n1g.A0I = valueOf4;
                        n1g.A0R = valueOf4;
                        long A004 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0C));
                        Long valueOf5 = Long.valueOf(A004);
                        if (A004 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf5 = null;
                        }
                        n1g.A0C = valueOf5;
                        n1g.A0L = valueOf5;
                        long A005 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0L));
                        Long valueOf6 = Long.valueOf(A005);
                        if (A005 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf6 = null;
                        }
                        n1g.A0J = valueOf6;
                        n1g.A0S = valueOf6;
                        long A006 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0D));
                        Long valueOf7 = Long.valueOf(A006);
                        if (A006 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf7 = null;
                        }
                        n1g.A0D = valueOf7;
                        n1g.A0M = valueOf7;
                        long A007 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0E));
                        Long valueOf8 = Long.valueOf(A007);
                        if (A007 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf8 = null;
                        }
                        n1g.A0E = valueOf8;
                        n1g.A0N = valueOf8;
                        long A008 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0G));
                        Long valueOf9 = Long.valueOf(A008);
                        if (A008 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf9 = null;
                        }
                        n1g.A0G = valueOf9;
                        n1g.A0P = valueOf9;
                        long A009 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0H));
                        Long valueOf10 = Long.valueOf(A009);
                        if (A009 == Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            valueOf10 = null;
                        }
                        n1g.A0H = valueOf10;
                        n1g.A0Q = valueOf10;
                        long A0010 = A00(1BK.A0R(c00i), A01(c00i3, c00i2, C5p0.A0O));
                        Long valueOf11 = Long.valueOf(A0010);
                        if (A0010 != Long.parseLong(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL)) {
                            l = valueOf11;
                        }
                        n1g.A0K = l;
                        n1g.A0T = l;
                    }
                }
                C00j.A01(-501262829);
            } catch (Throwable th) {
                C00j.A01(-1697389669);
                throw th;
            }
        }
    }
}
