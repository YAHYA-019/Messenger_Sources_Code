package com.google.common.base;

import X.AnonymousClass001;
import X.JQw;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: Suppliers$SupplierOfInstance.class */
public class Suppliers$SupplierOfInstance implements Supplier, Serializable {
    public static final long serialVersionUID = 0;
    public final Object instance;

    public Suppliers$SupplierOfInstance(Object obj) {
        this.instance = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Suppliers$SupplierOfInstance) {
            return Objects.equal(this.instance, ((Suppliers$SupplierOfInstance) obj).instance);
        }
        return false;
    }

    @Override // com.google.common.base.Supplier
    public Object get() {
        return this.instance;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.instance});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(JQw.A00(194));
        A0k.append(this.instance);
        return AnonymousClass001.A0d(")", A0k);
    }
}
