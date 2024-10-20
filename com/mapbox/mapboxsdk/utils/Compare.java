package com.mapbox.mapboxsdk.utils;

/* loaded from: Compare.class */
public class Compare {
    public static int compare(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = 1;
            if (i == i2) {
                return 0;
            }
        }
        return i3;
    }

    public static int compare(boolean z, boolean z2) {
        int i;
        if (z == z2) {
            i = 0;
        } else {
            i = -1;
            if (z) {
                return 1;
            }
        }
        return i;
    }
}
