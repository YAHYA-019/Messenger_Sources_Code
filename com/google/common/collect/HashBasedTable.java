package com.google.common.collect;

import X.C1my;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* loaded from: HashBasedTable.class */
public class HashBasedTable extends StandardTable {
    public static final long serialVersionUID = 0;

    /* loaded from: HashBasedTable$Factory.class */
    public class Factory implements Supplier, Serializable {
        public static final long serialVersionUID = 0;
        public final int expectedSize = 0;

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ Object get() {
            return new LinkedHashMap(C1my.A00(this.expectedSize));
        }
    }
}
