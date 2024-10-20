package com.facebook.rsys.mosaicgrid.gen;

import X.0Pz;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AnonymousClass000;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: FrameSize.class */
public class FrameSize {
    public static 2JQ CONVERTER = IR0.A00(ActionId.MESSENGER_THREAD_LIST_LOADED);
    public static long sMcfTypeId;
    public final int height;
    public final int width;

    public FrameSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static native FrameSize createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof FrameSize)) {
                return false;
            }
            FrameSize frameSize = (FrameSize) obj;
            if (this.width == frameSize.width && this.height == frameSize.height) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.width) + this.height;
    }

    public String toString() {
        return 0Pz.A0o("FrameSize{width=", AnonymousClass000.A00(ActionId.APP_DID_FINISH_LAUNCHING), "}", this.width, this.height);
    }
}
