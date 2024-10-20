package com.facebook.rsys.overlayconfigmanager;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEM;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: OverlayConfigManagerHolder.class */
public class OverlayConfigManagerHolder {
    public static final OverlayConfigLayerInterface[] EMPTY_OVERLAYCONFIG_LAYER_ARRAY;
    public final NativeHolder mNativeHolder;

    static {
        if (!HEM.A00) {
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysoverlayconfigmanagerjniStaging" : "rsysoverlayconfigmanagerjniLatest");
            HEM.A00 = true;
        }
        EMPTY_OVERLAYCONFIG_LAYER_ARRAY = new OverlayConfigLayerInterface[0];
    }

    public OverlayConfigManagerHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public OverlayConfigManagerHolder(ArrayList arrayList) {
        this.mNativeHolder = initNativeHolder((OverlayConfigLayerInterface[]) arrayList.toArray(EMPTY_OVERLAYCONFIG_LAYER_ARRAY));
    }

    public static native NativeHolder initNativeHolder(OverlayConfigLayerInterface[] overlayConfigLayerInterfaceArr);

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OverlayConfigManagerHolder)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native boolean fetchParameterBoolean(int i, boolean z);

    public native int fetchParameterInt32(int i, boolean z);

    public native int hashCode();

    public native void logExposure(int i);
}
