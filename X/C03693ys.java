package X;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import java.util.List;

/* renamed from: X.3ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ys.class */
public final class C03693ys extends PhoneStateListener {
    public final /* synthetic */ 2Fc A00;

    public C03693ys(2Fc r302) {
        this.A00 = r302;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellInfoChanged(List list) {
        2DH.A0b(this.A00.A01, list);
    }

    @Override // android.telephony.PhoneStateListener
    public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        2DH.A0U(telephonyDisplayInfo, this.A00.A01);
    }

    @Override // android.telephony.PhoneStateListener
    public void onServiceStateChanged(ServiceState serviceState) {
        2DH.A0R(serviceState, this.A00.A01);
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        2DH.A0S(signalStrength, this.A00.A01);
    }
}
