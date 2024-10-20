package X;

import android.content.Context;
import com.facebook.wearable.common.comms.hera.shared.host.mwa.MwaExistance;

/* renamed from: X.4ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ge.class */
public abstract class AbstractC06294ge {
    public static Boolean A00;

    public static final boolean A00(Context context) {
        11T.A0F(context, 0);
        1Br r0 = C06404gp.A00;
        C00i c00i = r0.A00;
        boolean z = false;
        if (!((2yD) c00i.get()).AZk(36322675862554384L)) {
            0fH.A0n("HeraAdvancedChecker", "Hera plugin is disabled by kill switch");
            return false;
        }
        if (A00 == null) {
            A00 = Boolean.valueOf(MwaExistance.isMwaInstalled(context, false));
        }
        if (((2yD) c00i.get()).AZk(36322675861636867L)) {
            0fH.A0l("HeraAdvancedChecker", "Bypassing MWA installation check: [MC passed for isDeveloper].");
        } else if (11T.A0O(A00, false)) {
            0fH.A0l("HeraAdvancedChecker", "MWA is not installed, skipping.");
            return false;
        }
        boolean AZk = 1BK.A0M(c00i).AZk(36322675862619921L);
        boolean AZk2 = 1Br.A07(r0).AZk(36322675862685458L);
        0fH.A0l("HeraAdvancedChecker", 0Pz.A1A("icaEnabled: ", ", hnvcEnabled: ", AZk, AZk2));
        if (AZk || AZk2) {
            z = true;
        }
        return z;
    }
}
