package com.facebook.messaging.encryptedbackups.hsm.reminder.fragment;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.0Xs;
import X.11T;
import X.1BM;
import X.1Iw;
import X.1LH;
import X.1LI;
import X.4YV;
import X.7zL;
import X.7zN;
import X.7zO;
import X.8Kt;
import X.8Z4;
import X.8dE;
import X.96B;
import X.9De;
import X.9IP;
import X.9hC;
import X.AJd;
import X.AQv;
import X.C2iw;
import X.C8Wv;
import X.C8Ww;
import X.C9ga;
import X.C9oI;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: PinReminderFragment.class */
public final class PinReminderFragment extends MigBottomSheetDialogFragment {
    public C9ga A00;
    public 9hC A01;
    public String A02;
    public final C2iw A03 = 7zL.A0Z();

    public static final 1LH A05(PinReminderFragment pinReminderFragment) {
        C9ga c9ga = pinReminderFragment.A00;
        if (c9ga != null) {
            if (c9ga.A0C.getValue() == 96B.A06) {
                pinReminderFragment.A08("PIN_VALIDATED_IMPRESSION");
                return new C8Ww(pinReminderFragment.A1F(), AQv.A01(pinReminderFragment, 13), AQv.A01(pinReminderFragment, 10));
            }
            C9ga c9ga2 = pinReminderFragment.A00;
            if (c9ga2 != null) {
                if (c9ga2.A0C.getValue() == 96B.A05) {
                    pinReminderFragment.A08("PIN_VALIDATION_IMPRESSION");
                    C9ga c9ga3 = pinReminderFragment.A00;
                    if (c9ga3 != null) {
                        8Kt r0 = (8Kt) c9ga3.A0D.getValue();
                        MigColorScheme A1F = pinReminderFragment.A1F();
                        boolean z = r0.A03;
                        return new 8dE(pinReminderFragment.A03, new 9IP(pinReminderFragment), A1F, r0.A01, AQv.A01(pinReminderFragment, 10), r0.A00, z);
                    }
                } else {
                    C9ga c9ga4 = pinReminderFragment.A00;
                    if (c9ga4 != null) {
                        if (c9ga4.A0C.getValue() == 96B.A07) {
                            pinReminderFragment.A08("PIN_RESET_IMPRESSION");
                            return new 8Z4(pinReminderFragment.A1F(), AQv.A01(pinReminderFragment, 12), AQv.A01(pinReminderFragment, 9), AQv.A01(pinReminderFragment, 10));
                        }
                        pinReminderFragment.A08("PIN_REMINDER_INTRO_IMPRESSION");
                        return new C8Wv(pinReminderFragment.A1F(), AQv.A01(pinReminderFragment, 11), AQv.A01(pinReminderFragment, 10));
                    }
                }
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }

    private final void A08(String str) {
        if (!11T.A0O(this.A02, str)) {
            9hC r0 = this.A01;
            if (r0 == null) {
                11T.A0L("logger");
                throw 0Q8.createAndThrow();
            }
            r0.A01(str);
        }
        this.A02 = str;
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return A05(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1402448993);
        super.onCreate(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A00 = (C9ga) 7zN.A0n(this, A01, 68387);
        this.A01 = (9hC) 7zN.A0n(this, A01, 68797);
        C9ga c9ga = this.A00;
        if (c9ga == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        if (bundle != null) {
            0Xs r0 = c9ga.A0B;
            int i = bundle.getInt("KEY_ATTEMPT_COUNT", 0);
            r0.Cvx(new 8Kt(bundle.getString("KEY_ERROR_MESSAGE", ""), bundle.getBoolean("KEY_IS_LOADING", false), false, i));
            c9ga.A00 = bundle.getString("KEY_PIN", "");
        }
        0FI.A08(-1639633887, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        9hC r0 = this.A01;
        if (r0 == null) {
            str = "logger";
        } else {
            C9ga c9ga = this.A00;
            if (c9ga != null) {
                boolean z = c9ga.A01;
                if (r0.A00) {
                    r0.A00 = false;
                    UserFlowLogger A0Z = 4YV.A0Z(r0.A03);
                    long j = r0.A01;
                    A0Z.flowMarkPoint(j, "DISMISS");
                    UserFlowLogger A0Z2 = 4YV.A0Z(r0.A03);
                    if (z) {
                        A0Z2.flowEndSuccess(j);
                        return;
                    } else {
                        A0Z2.flowEndCancel(j, CancelReason.USER_CANCELLED);
                        return;
                    }
                }
                return;
            }
            str = "viewData";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        C9ga c9ga = this.A00;
        if (c9ga == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        0Xs r0 = c9ga.A0B;
        bundle.putBoolean("KEY_IS_LOADING", ((8Kt) r0.getValue()).A03);
        bundle.putInt("KEY_ATTEMPT_COUNT", ((8Kt) r0.getValue()).A00);
        bundle.putString("KEY_ERROR_MESSAGE", ((8Kt) r0.getValue()).A01);
        bundle.putString("KEY_PIN", c9ga.A00);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setOnKeyListener(new C9oI(this, 0));
        }
        AJd.A03(this, 7zO.A0J(this), 34);
        AJd.A03(this, 7zO.A0J(this), 35);
    }
}
