package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.push.annotations.IsPreRegPushTokenRegistrationEnabled;
import com.facebook.push.fcm.FcmListenerService;

/* renamed from: X.4Ac, reason: invalid class name */
/* loaded from: 4Ac.class */
public final class C4Ac implements C49j {
    public final C00i A03 = 1Bi.A02(C4Ad.class, (Class) null);
    public final C0et A02 = (C0et) 1Bi.A05(C0et.class, (Class) null);
    public final 4AX A05 = (4AX) 1Bi.A05(4AX.class, (Class) null);
    public final 45J A00 = (45J) 1Bi.A05(45J.class, (Class) null);
    public final C00i A04 = 1Bi.A02(1P8.class, (Class) null);
    public final Context A01 = 1Bn.A00();

    private boolean A00(FbUserSession fbUserSession) {
        if (!((1G1) fbUserSession).A07) {
            return true;
        }
        C0et c0et = C0et.A0P;
        C0et c0et2 = this.A02;
        if (c0et.equals(c0et2) || C0et.A0C.equals(c0et2)) {
            return ((TriState) 1Bi.A05(TriState.class, IsPreRegPushTokenRegistrationEnabled.class)).asBoolean(false);
        }
        return false;
    }

    @Override // X.C49j
    public void AEv() {
        1PB A00 = ((1P8) this.A04.get()).A00("notification_instance");
        if (!BWQ()) {
            A00.BZR("FCM", "Service not available (checkRegistration)");
            return;
        }
        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0F(this.A01, 1EZ.class, (Class) null));
        if (!A00(A04)) {
            A00.BZR("FCM", "Check registration not valid");
            0fH.A0A(C4Ac.class, "checkRegistration conditions are not valid");
        } else {
            0fH.A0A(C4Ac.class, "checking registration status");
            A00.BZR("FCM", "Check Registration");
            ((C4Ad) this.A03.get()).A06(A04, false);
        }
    }

    @Override // X.C49j
    public void APP() {
        boolean BWQ = BWQ();
        1PB A00 = ((1P8) this.A04.get()).A00("notification_instance");
        if (!BWQ) {
            A00.BZR("FCM", "Service not available (enableIfServiceSupported)");
            return;
        }
        A00.BZR("FCM", "Ensure firebase initialized");
        ((1OQ) ((C4Ad) this.A03.get()).A02.get()).AQU();
        this.A00.A04((String) null, new Class[]{FcmListenerService.class});
    }

    @Override // X.C49j
    public void ATj() {
        if (BWQ()) {
            if (!A00(1Fw.A06(1Bn.A0F(this.A01, 1EZ.class, (Class) null)))) {
                0fH.A0A(C4Ac.class, "scheduleForceTokenRefresh conditions are not valid");
            } else {
                0fH.A0A(C4Ac.class, "scheduleForceTokenRefresh");
                ((C4Ad) this.A03.get()).A04(0);
            }
        }
    }

    @Override // X.C49j
    public 1OZ BAD() {
        return 1OZ.A04;
    }

    @Override // X.C49j
    public boolean BWQ() {
        return this.A00.A05(1OZ.A04);
    }

    @Override // X.C49j
    public void Ccb() {
        1PB A00 = ((1P8) this.A04.get()).A00("notification_instance");
        if (!BWQ()) {
            A00.BZR("FCM", "Service not available (registerPush)");
            return;
        }
        A00.BZR("FCM", "Register Push");
        ((C4Ad) this.A03.get()).A06(1Fw.A04((1EZ) 1Bn.A0F(this.A01, 1EZ.class, (Class) null)), true);
    }

    @Override // X.C49j
    public boolean CgY(String str) {
        if (!BWQ()) {
            return false;
        }
        if (!A00(1Fw.A04((1EZ) 1Bn.A0F(this.A01, 1EZ.class, (Class) null)))) {
            0fH.A0A(C4Ac.class, "reportRegistrationFailure conditions are not valid");
            return false;
        }
        0fH.A0A(C4Ac.class, "reportRegistrationFailure");
        C4Ad c4Ad = (C4Ad) this.A03.get();
        1P5 r0 = c4Ad.A07;
        4Ye r02 = c4Ad.A06;
        int A02 = r0.A02(str, r02.A01, r02.A00);
        boolean z = false;
        if ((A02 & 1) != 0) {
            z = true;
        }
        ((FbSharedPreferences) ((4Yd) c4Ad.A03.get()).A00.get()).edit().putBoolean(4Yd.A01, z).commit();
        return A02 != 0;
    }

    @Override // X.C49j
    public void D67(String str, boolean z) {
        if (BWQ()) {
            if (str == null) {
                str = "";
            }
            this.A05.A08(1OZ.A04, str, z);
        }
    }
}
