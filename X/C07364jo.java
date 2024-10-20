package X;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jo.class */
public final class C07364jo implements 1vQ, 2Bs {
    public static final Set A07 = new HashSet(Arrays.asList("zero_fup_interstitial", "freemium_fup_interstitial", "freemium_non_dismissible_fup_interstitial"));
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;

    public C07364jo() {
        1BQ r0 = new 1BQ(99939);
        this.A01 = r0;
        this.A03 = new 1BQ(16922);
        this.A04 = new 1BQ(16385);
        this.A00 = new 1BQ(99390);
        this.A02 = new 1BQ(33013);
        this.A06 = new 1BV(98565);
        this.A05 = new 1BQ(98453);
        ((1vL) r0.get()).A0R(this);
    }

    public static void A00(C07364jo c07364jo, long j) {
        1Ql A0V = 1BL.A0V(c07364jo.A02);
        A0V.CaH((1G2) ((1Ky) c07364jo.A06.get()).A0U.getValue(), j);
        A0V.commit();
    }

    public void onAfterDialtoneStateChanged(boolean z, Context context) {
        A00(this, z ? 1BL.A08(this.A00) + (1BK.A0N(this.A04).Auy(36592812129321949L) * 60000) : Long.MAX_VALUE);
    }

    public void onBeforeDialtoneStateChanged(boolean z) {
    }

    public void onDetectionFinished(2C1 r302, String str, Context context) {
        C00i c00i = this.A01;
        Activity A08 = ((1vL) c00i.get()).A08();
        if (A08 == null || r302.equals(2C1.A03) || !((1vL) c00i.get()).A0S()) {
            return;
        }
        C00i c00i2 = this.A03;
        if (!4YU.A0d(c00i2).A04(1BJ.A00(185)) || 4YU.A0d(c00i2).A06(A07) || !1BK.A0N(this.A04).AZk(36311337152547573L) || 1BK.A0R(this.A02).Av1((1G2) ((1Ky) this.A06.get()).A0U.getValue(), Long.MAX_VALUE) > 1BL.A08(this.A00)) {
            return;
        }
        try {
            A08.runOnUiThread(new G4e(A08, new FiP(this), this));
        } catch (Exception e) {
            0fH.A0r("PeriodicZeroBalanceUpsellController", "Failed to show ZBDUpsellReminderDialog %s", e);
        }
    }
}
