package org.webrtc;

import X.0Pz;

/* loaded from: Size.class */
public class Size {
    public int height;
    public int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        return 0Pz.A0B(this.width, this.height, "x");
    }
}
