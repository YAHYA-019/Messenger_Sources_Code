package X;

import android.telephony.ServiceState;
import android.telephony.TelephonyCallback;

/* renamed from: X.3qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3qB.class */
public final class C01183qB extends TelephonyCallback implements TelephonyCallback.ServiceStateListener {
    public final /* synthetic */ 2DH A00;

    @Override // android.telephony.TelephonyCallback.ServiceStateListener
    public void onServiceStateChanged(ServiceState serviceState) {
        2DH.A0R(serviceState, this.A00);
    }
}
