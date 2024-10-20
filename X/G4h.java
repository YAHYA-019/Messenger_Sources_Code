package X;

import android.app.Activity;
import com.facebook.acra.constants.ActionId;

/* loaded from: G4h.class */
public final class G4h implements Runnable {
    public static final String __redex_internal_original_name = "ZeroBalanceResultForFreemiumController$2";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C07354jm A01;
    public final /* synthetic */ boolean A02;

    public G4h(Activity activity, C07354jm c07354jm, boolean z) {
        this.A01 = c07354jm;
        this.A02 = z;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        String str;
        Ezh A0j;
        String str2;
        C07354jm c07354jm = this.A01;
        C00i c00i = c07354jm.A0A;
        String A0t = DKE.A0t(c00i);
        String A0M = DKI.A0M(DKC.A0i(c00i), c07354jm.A0B);
        C00i c00i2 = c07354jm.A01;
        Long valueOf = Long.valueOf(DKF.A0j(c00i2).A00(A0t, A0M, "ZeroOlympusOptin"));
        boolean z2 = this.A02;
        String str3 = C07354jm.A0C;
        if (!z2) {
            0fH.A0j(str3, "onDetectionFinished: handle zero balance scenario");
            Activity activity = this.A00;
            C00i c00i3 = c07354jm.A03;
            if (DKE.A1X(c00i3)) {
                z = false;
            } else {
                4YU.A0K(c00i3).A0J("switch_to_free_mode");
                0fH.A0j(str3, "handleZeroBalanceScenario: dialtone enabled, user dialtone state changed set to true");
                DKF.A0j(c00i2).A03("switch_to_free", valueOf);
                z = true;
            }
            C00i c00i4 = c07354jm.A05;
            if (4YU.A0d(c00i4).A05("autoflex_to_olympus_transition_nux")) {
                ((Ev1) c07354jm.A09.get()).A00(activity, F3V.A00("autoflex_to_olympus_transition_nux", 238958692), "autoflex_to_olympus_transition_nux");
                0fH.A0j(str3, "handleZeroBalanceScenario: launching autoflex to olympus transition nux");
                A0j = DKF.A0j(c00i2);
                str2 = "autoflex_to_freemium_transition";
            } else {
                if (!z) {
                    0fH.A0j(str3, "handleZeroBalanceScenario: userDialtoneStateChanged is false, exit");
                    DKF.A0j(c00i2).A03("user_already_in_free", valueOf);
                    return;
                }
                if (4YU.A0d(c00i4).A04(1BJ.A00(ActionId.ABORTED))) {
                    DKF.A0j(c00i2).A01("should_show_optin_instead", valueOf);
                    0fH.A0j(str3, "handleZeroBalanceScenario: optin flow start");
                    1BK.A0U(c07354jm.A07).markerStart(238953789);
                    ((F8d) c07354jm.A00.get()).A01(valueOf, true);
                }
                if (!4YU.A0d(c00i4).A04(1BJ.A00(185))) {
                    return;
                }
                1Ky A0w = DKG.A0w();
                C00i c00i5 = c07354jm.A04;
                if (1BK.A1T(1BK.A0R(c00i5), DKC.A0b(A0w.A0A)) || 1BL.A0A(1BK.A0R(c00i5), DKC.A0b(A0w.A0P)) <= 1BL.A08(c07354jm.A02)) {
                    DKF.A0j(c00i2).A03("should_show_zbd_dialog", valueOf);
                    0fH.A0j(str3, "handleZeroBalanceScenario: zbd dialog start");
                    try {
                        activity.runOnUiThread(new G5S(activity, new FiS(c07354jm, 1BK.A0N(c07354jm.A06).AZk(36310675732956043L)), c07354jm, valueOf));
                        return;
                    } catch (Exception e) {
                        e = e;
                        str = "Failed to show Freemium ZBD Dialog on Zero Balance: %s";
                    }
                } else {
                    A0j = DKF.A0j(c00i2);
                    str2 = "in_zbd_cooldown";
                }
            }
            A0j.A01(str2, valueOf);
            return;
        }
        0fH.A0j(str3, "onDetectionFinished: handle data balance scenario");
        Activity activity2 = this.A00;
        if (!DKE.A1X(c07354jm.A03)) {
            return;
        }
        0fH.A0j(str3, "handleDataBalanceScenario: dialtone enabled, user dialtone state changed set to true");
        if (!4YU.A0d(c07354jm.A05).A04("freemium_models_free_to_paid_transition_interstitial")) {
            return;
        }
        0fH.A0j(str3, "handleDataBalanceScenario: show free to paid interstitial");
        try {
            activity2.runOnUiThread(new G3D(activity2, c07354jm));
            return;
        } catch (Exception e2) {
            e = e2;
            str = "Failed to show Free to Paid interstitial: %s";
        }
        0fH.A0w(str3, str, e);
    }
}
