package com.mapbox.mapboxsdk.style.layers;

import X.JQz;
import com.google.gson.JsonElement;
import com.mapbox.mapboxsdk.LibraryLoader;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.types.Formatted;

/* loaded from: Layer.class */
public abstract class Layer {
    public static final String TAG = "Mbgl-Layer";
    public boolean detached;
    public boolean invalidated;
    public long nativePtr;

    static {
        LibraryLoader.load();
    }

    public Layer() {
        JQz.A0y();
    }

    public Layer(long j) {
        JQz.A0y();
        this.nativePtr = j;
    }

    private Object convertValue(Object obj) {
        if (obj instanceof Expression) {
            return ((Expression) obj).toArray();
        }
        if (obj instanceof Formatted) {
            obj = ((Formatted) obj).toArray();
        }
        return obj;
    }

    public void checkThread() {
        JQz.A0y();
    }

    public native void finalize();

    public String getId() {
        JQz.A0y();
        return nativeGetId();
    }

    public float getMaxZoom() {
        JQz.A0y();
        return nativeGetMaxZoom();
    }

    public float getMinZoom() {
        JQz.A0y();
        return nativeGetMinZoom();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public PropertyValue getVisibility() {
        JQz.A0y();
        return JQz.A0d(nativeGetVisibility(), "visibility");
    }

    public boolean isDetached() {
        return this.detached;
    }

    public native JsonElement nativeGetFilter();

    public native String nativeGetId();

    public native float nativeGetMaxZoom();

    public native float nativeGetMinZoom();

    public native String nativeGetSourceId();

    public native String nativeGetSourceLayer();

    public native Object nativeGetVisibility();

    public native void nativeSetFilter(Object[] objArr);

    public native void nativeSetLayoutProperty(String str, Object obj);

    public native void nativeSetMaxZoom(float f);

    public native void nativeSetMinZoom(float f);

    public native void nativeSetPaintProperty(String str, Object obj);

    public native void nativeSetSourceLayer(String str);

    public void setDetached() {
        this.detached = true;
    }

    public void setMaxZoom(float f) {
        JQz.A0y();
        nativeSetMaxZoom(f);
    }

    public void setMinZoom(float f) {
        JQz.A0y();
        nativeSetMinZoom(f);
    }

    public void setProperties(PropertyValue... propertyValueArr) {
        if (this.detached) {
            return;
        }
        JQz.A0y();
        int length = propertyValueArr.length;
        if (length != 0) {
            int i = 0;
            do {
                PropertyValue propertyValue = propertyValueArr[i];
                Object convertValue = convertValue(propertyValue.value);
                boolean z = propertyValue instanceof PaintPropertyValue;
                String str = propertyValue.name;
                if (z) {
                    nativeSetPaintProperty(str, convertValue);
                } else {
                    nativeSetLayoutProperty(str, convertValue);
                }
                i++;
            } while (i < length);
        }
    }
}
