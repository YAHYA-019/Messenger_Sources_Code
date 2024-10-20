package com.facebook.wearable.common.comms.hera.shared.engine;

import X.11T;
import X.1BL;
import X.7zL;
import X.DKE;
import X.JHD;
import X.JHE;
import X.JJN;
import X.JO6;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CallCoordinationBroadcaster.class */
public final class CallCoordinationBroadcaster implements JJN {
    public final Set connectedRemoteIds;
    public JO6 onCoordinationCallback;
    public final JHE remoteManagementEndpoint;
    public final JJN remoteRtcEndpoint;

    public CallCoordinationBroadcaster(JJN jjn, JHE jhe) {
        1BL.A1F(jjn, jhe);
        this.remoteRtcEndpoint = jjn;
        this.remoteManagementEndpoint = jhe;
        this.connectedRemoteIds = 7zL.A15();
        jjn.setOnCoordinationCallback(new JO6() { // from class: com.facebook.wearable.common.comms.hera.shared.engine.CallCoordinationBroadcaster.1
            @Override // X.JO6
            public final void onCoordination(int i, int i2, ByteBuffer byteBuffer) {
                11T.A0F(byteBuffer, 2);
                JO6 jo6 = CallCoordinationBroadcaster.this.onCoordinationCallback;
                if (jo6 != null) {
                    jo6.onCoordination(0, i2, byteBuffer);
                }
            }
        });
        jhe.setOnRemoteAvailability(new JHD() { // from class: com.facebook.wearable.common.comms.hera.shared.engine.CallCoordinationBroadcaster.2
            @Override // X.JHD
            public final void onRemoteAvailability(int i, boolean z) {
                CallCoordinationBroadcaster.this.onRemoteAvailability(i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoteAvailability(int i, boolean z) {
        synchronized (this.connectedRemoteIds) {
            if (z) {
                this.connectedRemoteIds.add(Integer.valueOf(i));
            } else {
                this.connectedRemoteIds.remove(Integer.valueOf(i));
            }
        }
    }

    public JO6 getOnCoordinationCallback() {
        return this.onCoordinationCallback;
    }

    public void sendCoordinationUpdate(int i, int i2, ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 2);
        synchronized (this.connectedRemoteIds) {
            Iterator it = this.connectedRemoteIds.iterator();
            while (it.hasNext()) {
                this.remoteRtcEndpoint.sendCoordinationUpdate(DKE.A0F(it), i2, byteBuffer);
            }
        }
    }

    public void setOnCoordinationCallback(JO6 jo6) {
        this.onCoordinationCallback = jo6;
    }
}
