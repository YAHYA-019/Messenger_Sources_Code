package com.google.common.base;

import X.AnonymousClass001;

/* loaded from: Suppliers$NonSerializableMemoizingSupplier.class */
public class Suppliers$NonSerializableMemoizingSupplier implements Supplier {
    public static final Supplier SUCCESSFULLY_COMPUTED = new Supplier() { // from class: com.google.common.base.Suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw new IllegalStateException();
        }
    };
    public volatile Supplier delegate;
    public Object value;

    public Suppliers$NonSerializableMemoizingSupplier(Supplier supplier) {
        this.delegate = supplier;
    }

    @Override // com.google.common.base.Supplier
    public Object get() {
        Supplier supplier = this.delegate;
        Supplier supplier2 = SUCCESSFULLY_COMPUTED;
        if (supplier != supplier2) {
            synchronized (this) {
                if (this.delegate != supplier2) {
                    Object obj = this.delegate.get();
                    this.value = obj;
                    this.delegate = supplier2;
                    return obj;
                }
            }
        }
        return this.value;
    }

    public String toString() {
        Object obj = this.delegate;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Suppliers.memoize(");
        if (obj == SUCCESSFULLY_COMPUTED) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("<supplier that returned ");
            A0k2.append(this.value);
            obj = AnonymousClass001.A0d(">", A0k2);
        }
        A0k.append(obj);
        return AnonymousClass001.A0d(")", A0k);
    }
}
