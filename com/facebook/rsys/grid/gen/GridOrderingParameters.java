package com.facebook.rsys.grid.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: GridOrderingParameters.class */
public class GridOrderingParameters {
    public static 2JQ CONVERTER = IR0.A00(ActionId.VIEW_DID_LOAD_BEGIN);
    public static long sMcfTypeId;
    public final boolean considerPinnedPeers;
    public final boolean considerRecentDominantSpeakers;
    public final boolean considerRecentlyConnectedPeers;
    public final boolean considerScreensharingPeers;
    public final boolean considerVideoStreamingPeers;
    public final GridDisplayEligibleStates displayEligibleStates;
    public final int maxPeersVisible;
    public final int orderingPreset;

    public GridOrderingParameters(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridDisplayEligibleStates gridDisplayEligibleStates, int i, int i2) {
        gridDisplayEligibleStates.getClass();
        this.considerRecentlyConnectedPeers = z;
        this.considerRecentDominantSpeakers = z2;
        this.considerScreensharingPeers = z3;
        this.considerPinnedPeers = z4;
        this.considerVideoStreamingPeers = z5;
        this.displayEligibleStates = gridDisplayEligibleStates;
        this.maxPeersVisible = i;
        this.orderingPreset = i2;
    }

    public static native GridOrderingParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof GridOrderingParameters)) {
                return false;
            }
            GridOrderingParameters gridOrderingParameters = (GridOrderingParameters) obj;
            if (this.considerRecentlyConnectedPeers == gridOrderingParameters.considerRecentlyConnectedPeers && this.considerRecentDominantSpeakers == gridOrderingParameters.considerRecentDominantSpeakers && this.considerScreensharingPeers == gridOrderingParameters.considerScreensharingPeers && this.considerPinnedPeers == gridOrderingParameters.considerPinnedPeers && this.considerVideoStreamingPeers == gridOrderingParameters.considerVideoStreamingPeers && this.displayEligibleStates.equals(gridOrderingParameters.displayEligibleStates) && this.maxPeersVisible == gridOrderingParameters.maxPeersVisible && this.orderingPreset == gridOrderingParameters.orderingPreset) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.displayEligibleStates, (((((((AbstractC2326GOr.A03(this.considerRecentlyConnectedPeers ? 1 : 0) + (this.considerRecentDominantSpeakers ? 1 : 0)) * 31) + (this.considerScreensharingPeers ? 1 : 0)) * 31) + (this.considerPinnedPeers ? 1 : 0)) * 31) + (this.considerVideoStreamingPeers ? 1 : 0)) * 31) + this.maxPeersVisible) * 31) + this.orderingPreset;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GridOrderingParameters{considerRecentlyConnectedPeers=");
        A0k.append(this.considerRecentlyConnectedPeers);
        A0k.append(",considerRecentDominantSpeakers=");
        A0k.append(this.considerRecentDominantSpeakers);
        A0k.append(",considerScreensharingPeers=");
        A0k.append(this.considerScreensharingPeers);
        A0k.append(",considerPinnedPeers=");
        A0k.append(this.considerPinnedPeers);
        A0k.append(",considerVideoStreamingPeers=");
        A0k.append(this.considerVideoStreamingPeers);
        A0k.append(",displayEligibleStates=");
        A0k.append(this.displayEligibleStates);
        A0k.append(",maxPeersVisible=");
        A0k.append(this.maxPeersVisible);
        A0k.append(",orderingPreset=");
        return AbstractC2327GOs.A0W(A0k, this.orderingPreset);
    }
}
