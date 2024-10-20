package com.facebook.wearable.common.comms.hera.shared.connectivity;

import X.0Q8;
import X.11T;
import X.7zL;
import X.AnonymousClass001;
import X.C0s8;
import X.JHD;
import X.JHE;
import X.JJN;
import X.JO6;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: RemoteRtcEndpointsMux.class */
public final class RemoteRtcEndpointsMux implements JJN, JHE {
    public final List availableNodesForEndpoints;
    public final List endpoints;
    public JO6 onCoordinationCallback;
    public JHD onRemoteAvailability;

    public RemoteRtcEndpointsMux(List list) {
        11T.A0F(list, 1);
        this.endpoints = list;
        int size = list.size();
        ArrayList A0t = AnonymousClass001.A0t(size);
        for (int i = 0; i < size; i++) {
            A0t.add(7zL.A15());
        }
        this.availableNodesForEndpoints = A0t;
        Iterator it = this.endpoints.iterator();
        while (it.hasNext()) {
            ((JJN) it.next()).setOnCoordinationCallback(new JO6() { // from class: com.facebook.wearable.common.comms.hera.shared.connectivity.RemoteRtcEndpointsMux$1$1
                @Override // X.JO6
                public final void onCoordination(int i2, int i3, ByteBuffer byteBuffer) {
                    11T.A0F(byteBuffer, 2);
                    JO6 jo6 = RemoteRtcEndpointsMux.this.onCoordinationCallback;
                    if (jo6 != null) {
                        jo6.onCoordination(i2, i3, byteBuffer);
                    }
                }
            });
        }
    }

    private final boolean isRemoteNodeIdAvailable(int i) {
        Iterator it = this.availableNodesForEndpoints.iterator();
        while (it.hasNext()) {
            if (((Set) it.next()).contains(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    private final void onRemoteAvailability(int i, boolean z) {
        JHD jhd = this.onRemoteAvailability;
        if (jhd != null) {
            jhd.onRemoteAvailability(i, z);
        }
    }

    public JO6 getOnCoordinationCallback() {
        return this.onCoordinationCallback;
    }

    public JHD getOnRemoteAvailability() {
        return this.onRemoteAvailability;
    }

    public void sendCoordinationUpdate(int i, int i2, ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 2);
        Iterator it = this.availableNodesForEndpoints.iterator();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            if (((Set) next).contains(Integer.valueOf(i))) {
                ((JJN) this.endpoints.get(i4)).sendCoordinationUpdate(i, i2, byteBuffer);
                return;
            }
            i3 = i5;
        }
    }

    public final void setEndpointAvailability(int i, int i2, boolean z) {
        boolean z2;
        boolean isRemoteNodeIdAvailable = isRemoteNodeIdAvailable(i2);
        Set set = (Set) this.availableNodesForEndpoints.get(i);
        Integer valueOf = Integer.valueOf(i2);
        if (z) {
            set.add(valueOf);
            if (isRemoteNodeIdAvailable) {
                return;
            } else {
                z2 = true;
            }
        } else {
            set.remove(valueOf);
            if (isRemoteNodeIdAvailable == isRemoteNodeIdAvailable(i2)) {
                return;
            } else {
                z2 = false;
            }
        }
        onRemoteAvailability(i2, z2);
    }

    public void setOnCoordinationCallback(JO6 jo6) {
        this.onCoordinationCallback = jo6;
    }

    @Override // X.JHE
    public void setOnRemoteAvailability(JHD jhd) {
        this.onRemoteAvailability = jhd;
    }
}
