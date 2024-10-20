package X;

import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* renamed from: X.3qA, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3qA.class */
public final class C01173qA extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener {
    public final /* synthetic */ 2DH A00;

    @Override // android.telephony.TelephonyCallback.SignalStrengthsListener
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        2DH.A0S(signalStrength, this.A00);
    }
}
