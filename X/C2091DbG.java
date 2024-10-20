package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.zero.common.zerobalance.ZeroBalanceConfigs;
import com.facebook.zero.zerobalance.ping.ZeroBalancePingController;
import com.google.common.base.Optional;

/* renamed from: X.DbG, reason: case insensitive filesystem */
/* loaded from: DbG.class */
public final class C2091DbG extends 1Ni {
    public final C00i A00;

    public C2091DbG() {
        super(1BQ.A02(49218), (C02w) 1Bi.A03(0));
        this.A00 = 1BQ.A02(16931);
    }

    public /* bridge */ /* synthetic */ void A02(Context context, Intent intent, Object obj) {
        int i;
        String A04;
        int i2;
        C07324jj c07324jj = (C07324jj) obj;
        C00j.A05("ZeroBalanceResultForAutoFlexController.LocalZeroBalanceRedirectControllerReceiverRegistration.onReceive", 1181712733);
        if (intent == null) {
            i = -743786594;
        } else {
            try {
                if ("com.facebook.zero.ZERO_BALANCE_UPGRADE".equals(intent.getAction()) && ((ZeroBalancePingController) this.A00.get()).A05()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("zero_balance_upgrade_result");
                        ZeroBalanceConfigs A00 = ((C2C5) c07324jj.A09.get()).A00();
                        if (A00 == null) {
                            0fH.A0j(c07324jj.A0G, "handleZeroBalanceUpgrade: config is null");
                        } else {
                            if ("full_balance".equals(string) && 4YU.A0d(c07324jj.A04).A04("zero_balance_auto_switch")) {
                                A04 = DKF.A0i(c07324jj.A0C).A04("zboff_auto_paid_snackbar", context.getString(2131953062));
                                i2 = 2132213765;
                            } else if ("zero_balance".equals(string)) {
                                A04 = 4YU.A0d(c07324jj.A04).A04("zero_balance_auto_switch") ? DKF.A0i(c07324jj.A0C).A04("zboff_upgrade_failed", context.getString(2131953063)) : A00.mFailureMessage;
                                C00i c00i = c07324jj.A03;
                                if (DKG.A05(c00i) == null) {
                                    1vK A0K = 4YU.A0K(c00i);
                                    Fd9 fd9 = new Fd9(c07324jj, A04);
                                    Optional optional = A0K.A01;
                                    if (optional.isPresent()) {
                                        ((1vJ) optional.get()).A03.add(fd9);
                                    }
                                } else {
                                    i2 = 2132214263;
                                }
                            }
                            C07324jj.A00(c07324jj, A04, i2);
                        }
                    }
                }
                i = -240424327;
            } catch (Throwable th) {
                C00j.A01(-1601529517);
                throw th;
            }
        }
        C00j.A01(i);
    }
}
