package com.facebook.rtc.views.omnigrid;

import X.11T;
import X.1BL;
import X.7zQ;
import X.7zR;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.HNS;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: GridLayoutInputItem.class */
public final class GridLayoutInputItem extends C04v {
    public final Object extras;
    public final long id;
    public final boolean isSelf;
    public final boolean isVideoOff;
    public final GridItemType itemType;
    public final int priority;
    public final GridItemSize videoSize;

    public GridLayoutInputItem(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj) {
        7zR.A1O(gridItemType, gridItemSize);
        this.id = j;
        this.itemType = gridItemType;
        this.videoSize = gridItemSize;
        this.isVideoOff = z;
        this.priority = i;
        this.extras = obj;
        this.isSelf = AnonymousClass001.A1W(gridItemType, GridItemType.SELF_VIEW);
    }

    public /* synthetic */ GridLayoutInputItem(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, gridItemType, (i2 & 4) != 0 ? HNS.A00 : gridItemSize, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : obj);
    }

    public static /* synthetic */ GridLayoutInputItem copy$default(GridLayoutInputItem gridLayoutInputItem, long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj, int i2, Object obj2) {
        Object obj3 = obj;
        int i3 = i;
        boolean z2 = z;
        GridItemSize gridItemSize2 = gridItemSize;
        GridItemType gridItemType2 = gridItemType;
        long j2 = j;
        if ((i2 & 1) != 0) {
            j2 = gridLayoutInputItem.id;
        }
        if ((i2 & 2) != 0) {
            gridItemType2 = gridLayoutInputItem.itemType;
        }
        if ((i2 & 4) != 0) {
            gridItemSize2 = gridLayoutInputItem.videoSize;
        }
        if ((i2 & 8) != 0) {
            z2 = gridLayoutInputItem.isVideoOff;
        }
        if ((i2 & 16) != 0) {
            i3 = gridLayoutInputItem.priority;
        }
        if ((i2 & 32) != 0) {
            obj3 = gridLayoutInputItem.extras;
        }
        1BL.A1F(gridItemType2, gridItemSize2);
        return new GridLayoutInputItem(j2, gridItemType2, gridItemSize2, z2, i3, obj3);
    }

    public final long component1() {
        return this.id;
    }

    public final GridItemType component2() {
        return this.itemType;
    }

    public final GridItemSize component3() {
        return this.videoSize;
    }

    public final boolean component4() {
        return this.isVideoOff;
    }

    public final int component5() {
        return this.priority;
    }

    public final Object component6() {
        return this.extras;
    }

    public final GridLayoutInputItem copy(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj) {
        1BL.A1F(gridItemType, gridItemSize);
        return new GridLayoutInputItem(j, gridItemType, gridItemSize, z, i, obj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GridLayoutInputItem)) {
                return false;
            }
            GridLayoutInputItem gridLayoutInputItem = (GridLayoutInputItem) obj;
            if (this.id != gridLayoutInputItem.id || this.itemType != gridLayoutInputItem.itemType || !11T.A0O(this.videoSize, gridLayoutInputItem.videoSize) || this.isVideoOff != gridLayoutInputItem.isVideoOff || this.priority != gridLayoutInputItem.priority || !11T.A0O(this.extras, gridLayoutInputItem.extras)) {
                return false;
            }
        }
        return true;
    }

    public final Object getExtras() {
        return this.extras;
    }

    public final long getId() {
        return this.id;
    }

    public final GridItemType getItemType() {
        return this.itemType;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final GridItemSize getVideoSize() {
        return this.videoSize;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.videoSize, AnonymousClass002.A05(this.itemType, 7zQ.A02(this.id))) + AnonymousClass002.A00(this.isVideoOff ? 1 : 0)) * 31) + this.priority) * 31) + AnonymousClass001.A02(this.extras);
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public final boolean isVideoOff() {
        return this.isVideoOff;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GridLayoutInputItem(id=");
        A0k.append(this.id);
        A0k.append(", itemType=");
        A0k.append(this.itemType);
        A0k.append(", videoSize=");
        A0k.append(this.videoSize);
        A0k.append(", isVideoOff=");
        A0k.append(this.isVideoOff);
        A0k.append(", priority=");
        A0k.append(this.priority);
        A0k.append(", extras=");
        return AnonymousClass002.A0K(this.extras, A0k);
    }
}
