package com.facebook.rtc.views.omnigrid;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.DKH;
import java.util.List;

/* loaded from: GridLayoutInput.class */
public final class GridLayoutInput extends C04v {
    public final GridLayoutConfigForLayoutInput config;
    public final int height;
    public final List items;
    public final int width;

    public GridLayoutInput(List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2) {
        1BL.A1F(list, gridLayoutConfigForLayoutInput);
        this.items = list;
        this.config = gridLayoutConfigForLayoutInput;
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ GridLayoutInput copy$default(GridLayoutInput gridLayoutInput, List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = gridLayoutInput.items;
        }
        if ((i3 & 2) != 0) {
            gridLayoutConfigForLayoutInput = gridLayoutInput.config;
        }
        if ((i3 & 4) != 0) {
            i = gridLayoutInput.width;
        }
        if ((i3 & 8) != 0) {
            i2 = gridLayoutInput.height;
        }
        11T.A0H(list, gridLayoutConfigForLayoutInput);
        return new GridLayoutInput(list, gridLayoutConfigForLayoutInput, i, i2);
    }

    public final List component1() {
        return this.items;
    }

    public final GridLayoutConfigForLayoutInput component2() {
        return this.config;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final GridLayoutInput copy(List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2) {
        11T.A0H(list, gridLayoutConfigForLayoutInput);
        return new GridLayoutInput(list, gridLayoutConfigForLayoutInput, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GridLayoutInput)) {
                return false;
            }
            GridLayoutInput gridLayoutInput = (GridLayoutInput) obj;
            if (!11T.A0O(this.items, gridLayoutInput.items) || !11T.A0O(this.config, gridLayoutInput.config) || this.width != gridLayoutInput.width || this.height != gridLayoutInput.height) {
                return false;
            }
        }
        return true;
    }

    public final GridLayoutConfigForLayoutInput getConfig() {
        return this.config;
    }

    public final int getHeight() {
        return this.height;
    }

    public final List getItems() {
        return this.items;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.config, 1BL.A03(this.items)) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GridLayoutInput(items=");
        A0k.append(this.items);
        A0k.append(", config=");
        A0k.append(this.config);
        A0k.append(", width=");
        A0k.append(this.width);
        A0k.append(", height=");
        return DKH.A0p(A0k, this.height);
    }
}
