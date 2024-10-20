package com.facebook.rsys.videorender.gen;

import X.2JQ;
import X.HNL;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: VideoRenderSurface.class */
public abstract class VideoRenderSurface {
    public static 2JQ CONVERTER = new IQz(20);

    /* loaded from: VideoRenderSurface$CProxy.class */
    public final class CProxy extends VideoRenderSurface {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNL.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoRenderSurface createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void addRenderItem(VideoRenderItem videoRenderItem);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderSurface)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void removeRenderItem(String str, StreamInfo streamInfo);

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void setRenderItems(ArrayList arrayList);
    }

    public abstract void addRenderItem(VideoRenderItem videoRenderItem);

    public abstract void removeRenderItem(String str, StreamInfo streamInfo);

    public abstract void setRenderItems(ArrayList arrayList);
}
