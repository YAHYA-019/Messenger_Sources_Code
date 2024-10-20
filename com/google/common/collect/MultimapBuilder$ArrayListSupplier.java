package com.google.common.collect;

import X.AnonymousClass001;
import com.google.common.base.Supplier;
import java.io.Serializable;

/* loaded from: MultimapBuilder$ArrayListSupplier.class */
public final class MultimapBuilder$ArrayListSupplier implements Supplier, Serializable {
    public final int expectedValuesPerKey = 2;

    @Override // com.google.common.base.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        return AnonymousClass001.A0t(this.expectedValuesPerKey);
    }
}
