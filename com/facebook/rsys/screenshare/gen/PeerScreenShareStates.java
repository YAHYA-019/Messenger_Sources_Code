package com.facebook.rsys.screenshare.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

/* loaded from: PeerScreenShareStates.class */
public class PeerScreenShareStates {
    public static 2JQ CONVERTER = IR0.A00(ActionId.WAIT_FOR_BLOCKERS);
    public static long sMcfTypeId;
    public final HashSet screenSharingPeers;
    public final Map screenSharingSourcePerUserId;

    public PeerScreenShareStates(HashSet hashSet, Map map) {
        hashSet.getClass();
        this.screenSharingPeers = hashSet;
        this.screenSharingSourcePerUserId = map;
    }

    public static native PeerScreenShareStates createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PeerScreenShareStates)) {
                return false;
            }
            PeerScreenShareStates peerScreenShareStates = (PeerScreenShareStates) obj;
            if (!this.screenSharingPeers.equals(peerScreenShareStates.screenSharingPeers)) {
                return false;
            }
            Map map = this.screenSharingSourcePerUserId;
            Map map2 = peerScreenShareStates.screenSharingSourcePerUserId;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A08 = AbstractC2327GOs.A08(this.screenSharingPeers);
        Map map = this.screenSharingSourcePerUserId;
        return A08 + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PeerScreenShareStates{screenSharingPeers=");
        A0k.append(this.screenSharingPeers);
        A0k.append(",screenSharingSourcePerUserId=");
        return AbstractC2327GOs.A0U(this.screenSharingSourcePerUserId, A0k);
    }
}
