package X;

import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rollcall.presentation.nux.RollCallNuxConfig;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import kotlin.enums.EnumEntries;

/* renamed from: X.9kt, reason: invalid class name */
/* loaded from: 9kt.class */
public final class C9kt {
    public final 1Br A00 = 1BK.A0E();
    public final 1Br A01 = 1Bq.A00(68021);
    public static final 1G2 A03 = 1NK.A3f;
    public static final 1G2 A04 = 1NK.A3g;
    public static final 1G2 A02 = 1NK.A3e;

    public static final RollCallNuxConfig A00(boolean z, boolean z2, boolean z3) {
        1BQ A022 = 1BQ.A02(68021);
        if (z) {
            if (!C61c.A00((C61c) A022.get()).AZk(36323096768104692L)) {
                return RollCallNuxConfig.A02;
            }
            boolean AZk = C61c.A00((C61c) A022.get()).AZk(36323096768104692L);
            if (z3) {
                if (AZk) {
                    return RollCallNuxConfig.A03;
                }
            } else if (AZk) {
                return RollCallNuxConfig.A04;
            }
        }
        return z2 ? z3 ? RollCallNuxConfig.A05 : RollCallNuxConfig.A06 : z3 ? RollCallNuxConfig.A07 : RollCallNuxConfig.A08;
    }

    public final void A01(06Z r302, ThreadKey threadKey, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C00i c00i;
        0D2 baseMigBottomSheetDialogFragment;
        1Ql A0U;
        11T.A0F(r302, 0);
        if (z2) {
            c00i = this.A00.A00;
            if (!(!1BK.A0S(c00i).AZn(A02, false))) {
                return;
            }
        } else {
            1G2 r310 = z4 ? A03 : A04;
            c00i = this.A00.A00;
            if (1BK.A0S(c00i).ArU(r310, 0) >= (z4 ? 1 : (int) C61c.A00((C61c) 1Br.A0B(this.A01)).Av9(1GD.A07, 36602265348806434L))) {
                return;
            }
        }
        C00i c00i2 = this.A01.A00;
        if (!2yD.A03(C61c.A00((C61c) c00i2.get()), 36320790371319502L) || ((C61c) c00i2.get()).A04().length() == 0) {
            baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
            EnumEntries enumEntries = RollCallNuxConfig.A00;
            RollCallNuxConfig A00 = A00(z2, z3, z4);
            Bundle A05 = 1BK.A05();
            A05.putBoolean("force_dark_mode_param", z);
            A05.putParcelable("config_param", A00);
            if (threadKey != null) {
                A05.putLong("arg_thread_id", threadKey.A04);
            }
            baseMigBottomSheetDialogFragment.setArguments(A05);
            if (str == null) {
                str = "RollCallNuxFragment";
            }
        } else {
            baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
            EnumEntries enumEntries2 = RollCallNuxConfig.A00;
            RollCallNuxConfig A002 = A00(z2, z3, z4);
            Bundle A052 = 1BK.A05();
            A052.putBoolean("force_dark_mode", z);
            A052.putParcelable("config_param", A002);
            baseMigBottomSheetDialogFragment.setArguments(A052);
            if (str == null) {
                str = "RollCallVideoNuxFragment";
            }
        }
        baseMigBottomSheetDialogFragment.A0m(r302, str);
        if (z2) {
            A0U = 1BL.A0U(c00i).putBoolean(A02, true);
        } else {
            1G2 r314 = z4 ? A03 : A04;
            int ArU = 1BK.A0S(c00i).ArU(r314, 0) + 1;
            A0U = 1BL.A0U(c00i);
            A0U.CaE(r314, ArU);
        }
        A0U.commit();
    }
}
