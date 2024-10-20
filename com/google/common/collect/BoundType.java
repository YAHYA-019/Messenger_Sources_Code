package com.google.common.collect;

/* loaded from: BoundType.class */
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    public final boolean inclusive;

    BoundType(boolean z) {
        this.inclusive = z;
    }
}
