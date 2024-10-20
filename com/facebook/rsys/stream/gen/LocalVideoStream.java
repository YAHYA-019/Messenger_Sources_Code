package com.facebook.rsys.stream.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.GOm;
import X.LVi;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: LocalVideoStream.class */
public class LocalVideoStream {
    public static 2JQ CONVERTER = LVi.A00(61);
    public static long sMcfTypeId;
    public final StreamInfo streamInfo;
    public final int streamState;

    public LocalVideoStream(StreamInfo streamInfo, int i) {
        streamInfo.getClass();
        this.streamInfo = streamInfo;
        this.streamState = i;
    }

    public static native LocalVideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LocalVideoStream)) {
                return false;
            }
            LocalVideoStream localVideoStream = (LocalVideoStream) obj;
            if (this.streamInfo.equals(localVideoStream.streamInfo) && this.streamState == localVideoStream.streamState) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2327GOs.A08(this.streamInfo) + this.streamState;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LocalVideoStream{streamInfo=");
        A0k.append(this.streamInfo);
        A0k.append(GOm.A00(ActionId.NEW_START_FOUND));
        return AbstractC2327GOs.A0W(A0k, this.streamState);
    }
}
