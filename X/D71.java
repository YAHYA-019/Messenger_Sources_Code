package X;

import com.facebook.xapp.messaging.clockskew.ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration;

/* loaded from: D71.class */
public final class D71 implements Runnable {
    public static final String __redex_internal_original_name = "ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration$1";
    public final /* synthetic */ ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration A00;

    public D71(ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration clockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration) {
        this.A00 = clockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration;
    }

    @Override // java.lang.Runnable
    public void run() {
        0fH.A0j("com.facebook.xapp.messaging.clockskew.ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration", "Running immediate clock skew check");
        try {
            ((CHG) this.A00.A01.get()).A00();
        } catch (BPR e) {
            0fH.A0r("com.facebook.xapp.messaging.clockskew.ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration", "Exception in clock skew check", e);
        }
    }
}
