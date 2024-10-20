package com.facebook.spectrum.image;

/* loaded from: ImageFormat.class */
public class ImageFormat {
    public static final ImageFormat BITMAP = new ImageFormat("bitmap");
    public final String identifier;

    public ImageFormat(String str) {
        this.identifier = str;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (this == obj) {
                z = true;
            } else if (obj instanceof ImageFormat) {
                return this.identifier.equals(((ImageFormat) obj).identifier);
            }
        }
        return z;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public boolean isEncoded() {
        return false;
    }

    public String toString() {
        return this.identifier;
    }
}
