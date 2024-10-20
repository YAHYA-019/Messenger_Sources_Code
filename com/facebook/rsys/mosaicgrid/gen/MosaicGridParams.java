package com.facebook.rsys.mosaicgrid.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: MosaicGridParams.class */
public class MosaicGridParams {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ACTIVITY_START);
    public static long sMcfTypeId;
    public final FrameSize initialVideoSize;
    public final boolean isMosaicGridCapable;

    public MosaicGridParams(boolean z, FrameSize frameSize) {
        frameSize.getClass();
        this.isMosaicGridCapable = z;
        this.initialVideoSize = frameSize;
    }

    public static native MosaicGridParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof MosaicGridParams)) {
                return false;
            }
            MosaicGridParams mosaicGridParams = (MosaicGridParams) obj;
            if (this.isMosaicGridCapable == mosaicGridParams.isMosaicGridCapable && this.initialVideoSize.equals(mosaicGridParams.initialVideoSize)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.initialVideoSize, AbstractC2326GOr.A03(this.isMosaicGridCapable ? 1 : 0));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MosaicGridParams{isMosaicGridCapable=");
        A0k.append(this.isMosaicGridCapable);
        A0k.append(",initialVideoSize=");
        return AbstractC2327GOs.A0U(this.initialVideoSize, A0k);
    }
}
