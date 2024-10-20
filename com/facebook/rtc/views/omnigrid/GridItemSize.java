package com.facebook.rtc.views.omnigrid;

import X.0Pz;
import X.C04v;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: GridItemSize.class */
public final class GridItemSize extends C04v {
    public final int height;
    public final int width;

    public GridItemSize() {
        this(-1, -1);
    }

    public GridItemSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public /* synthetic */ GridItemSize(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
    }

    public static /* synthetic */ GridItemSize copy$default(GridItemSize gridItemSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = gridItemSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = gridItemSize.height;
        }
        return new GridItemSize(i, i2);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final GridItemSize copy(int i, int i2) {
        return new GridItemSize(i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GridItemSize)) {
                return false;
            }
            GridItemSize gridItemSize = (GridItemSize) obj;
            if (this.width != gridItemSize.width || this.height != gridItemSize.height) {
                return false;
            }
        }
        return true;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        return 0Pz.A0b("GridItemSize(width=", ", height=", ')', this.width, this.height);
    }
}
