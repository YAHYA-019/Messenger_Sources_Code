package com.facebook.videocodec.effects.model;

import android.graphics.Color;

/* loaded from: SolidColorData.class */
public final class SolidColorData {
    public final int A00 = Color.parseColor("white");

    public boolean equals(Object obj) {
        SolidColorData solidColorData;
        return this == obj || ((obj instanceof SolidColorData) && (solidColorData = (SolidColorData) obj) != null && solidColorData.A00 == this.A00);
    }

    public int hashCode() {
        return this.A00;
    }
}
