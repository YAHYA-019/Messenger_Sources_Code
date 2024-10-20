package com.mapbox.mapboxsdk.maps;

/* loaded from: Image.class */
public class Image {
    public final byte[] buffer;
    public final int height;
    public final String name;
    public final float pixelRatio;
    public final boolean sdf;
    public final int width;

    public Image(byte[] bArr, float f, String str, int i, int i2, boolean z) {
        this.buffer = bArr;
        this.pixelRatio = f;
        this.name = str;
        this.width = i;
        this.height = i2;
        this.sdf = z;
    }
}
