package X;

import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.wearable.common.comms.hera.shared.connectivity.RemoteRtcEndpointsMux;

/* loaded from: Ikq.class */
public final class Ikq implements JHD {
    public final /* synthetic */ HeraMessengerPluginImplementation A00;

    public Ikq(HeraMessengerPluginImplementation heraMessengerPluginImplementation) {
        this.A00 = heraMessengerPluginImplementation;
    }

    @Override // X.JHD
    public final void onRemoteAvailability(int i, boolean z) {
        if (i == 50) {
            JN7 jn7 = this.A00.A03;
            if (z) {
                if (jn7 != null) {
                    jn7.BtW();
                }
            } else if (jn7 != null) {
                jn7.BtX();
            }
        } else {
            0fH.A0n("Hera.MsgrPluginImpl", 0Pz.A0f("Availability changed for unsupported device ", ": ", i, z));
        }
        HeraMessengerPluginImplementation heraMessengerPluginImplementation = this.A00;
        JHD jhd = heraMessengerPluginImplementation.A0J.A00;
        if (jhd != null) {
            jhd.onRemoteAvailability(i, z);
        }
        RemoteRtcEndpointsMux remoteRtcEndpointsMux = heraMessengerPluginImplementation.A07;
        if (remoteRtcEndpointsMux == null) {
            11T.A0L("rtcMux");
            throw 0Q8.createAndThrow();
        }
        remoteRtcEndpointsMux.setEndpointAvailability(0, i, z);
    }
}
