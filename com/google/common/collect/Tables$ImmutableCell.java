package com.google.common.collect;

import X.Kuf;
import java.io.Serializable;

/* loaded from: Tables$ImmutableCell.class */
public final class Tables$ImmutableCell extends Kuf implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object columnKey;
    public final Object rowKey;
    public final Object value;

    public Tables$ImmutableCell(Object obj, Object obj2, Object obj3) {
        this.rowKey = obj;
        this.columnKey = obj2;
        this.value = obj3;
    }
}
