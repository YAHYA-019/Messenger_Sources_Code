package com.google.common.collect;

import X.L5M;
import com.facebook.base.activity.DeliverOnNewIntentWhenFinishing;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Map;

/* loaded from: StandardTable.class */
public class StandardTable extends L5M implements Serializable {
    public static final long serialVersionUID = 0;
    public transient Map A00;
    public final Map backingMap;
    public final Supplier factory;

    public StandardTable(Supplier supplier, Map map) {
        this.backingMap = map;
        this.factory = supplier;
    }

    @Override // X.L5M
    public Object A02(Object obj, Object obj2) {
        if (obj != null) {
            return super.A02(obj, DeliverOnNewIntentWhenFinishing.class);
        }
        return null;
    }
}
