package com.google.common.base;

import X.AnonymousClass001;
import X.JQy;
import java.io.Serializable;

/* loaded from: Functions$ConstantFunction.class */
public class Functions$ConstantFunction implements Function, Serializable {
    public static final long serialVersionUID = 0;
    public final Object value = null;

    public Functions$ConstantFunction(Object obj) {
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        return this.value;
    }

    @Override // com.google.common.base.Function
    public boolean equals(Object obj) {
        if (obj instanceof Functions$ConstantFunction) {
            return Objects.equal(this.value, ((Functions$ConstantFunction) obj).value);
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.value);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Functions.constant(");
        return JQy.A0r(this.value, A0k);
    }
}
