package com.facebook.rsys.mosaicgrid.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: GridParticipantMediaInfo.class */
public class GridParticipantMediaInfo {
    public static 2JQ CONVERTER = IR0.A00(ActionId.MESSENGER_THREAD_LIST_DISPLAYED);
    public static long sMcfTypeId;
    public final boolean isMosaicGridCapable;
    public final FrameSize videoSize;

    public GridParticipantMediaInfo(boolean z, FrameSize frameSize) {
        frameSize.getClass();
        this.isMosaicGridCapable = z;
        this.videoSize = frameSize;
    }

    public static native GridParticipantMediaInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof GridParticipantMediaInfo)) {
                return false;
            }
            GridParticipantMediaInfo gridParticipantMediaInfo = (GridParticipantMediaInfo) obj;
            if (this.isMosaicGridCapable == gridParticipantMediaInfo.isMosaicGridCapable && this.videoSize.equals(gridParticipantMediaInfo.videoSize)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.videoSize, AbstractC2326GOr.A03(this.isMosaicGridCapable ? 1 : 0));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GridParticipantMediaInfo{isMosaicGridCapable=");
        A0k.append(this.isMosaicGridCapable);
        A0k.append(",videoSize=");
        return AbstractC2327GOs.A0U(this.videoSize, A0k);
    }
}
