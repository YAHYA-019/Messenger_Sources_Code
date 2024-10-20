package com.facebook.rsys.grid.gen;

import X.0Pz;
import X.2JQ;
import X.AbstractC2326GOr;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: GridDisplayEligibleStates.class */
public class GridDisplayEligibleStates {
    public static 2JQ CONVERTER = IR0.A00(ActionId.HEADER_DATA_LOADED);
    public static long sMcfTypeId;
    public final boolean isConnectedEligible;
    public final boolean isConnectingEligible;

    public GridDisplayEligibleStates(boolean z, boolean z2) {
        this.isConnectingEligible = z;
        this.isConnectedEligible = z2;
    }

    public static native GridDisplayEligibleStates createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof GridDisplayEligibleStates)) {
                return false;
            }
            GridDisplayEligibleStates gridDisplayEligibleStates = (GridDisplayEligibleStates) obj;
            if (this.isConnectingEligible == gridDisplayEligibleStates.isConnectingEligible && this.isConnectedEligible == gridDisplayEligibleStates.isConnectedEligible) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.isConnectingEligible ? 1 : 0) + (this.isConnectedEligible ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A18("GridDisplayEligibleStates{isConnectingEligible=", ",isConnectedEligible=", "}", this.isConnectingEligible, this.isConnectedEligible);
    }
}
