package com.google.common.base;

import X.AnonymousClass001;
import java.io.Serializable;

/* loaded from: Functions$FunctionComposition.class */
public class Functions$FunctionComposition implements Function, Serializable {
    public static final long serialVersionUID = 0;
    public final Function f;
    public final Function g;

    public Functions$FunctionComposition(Function function, Function function2) {
        function.getClass();
        this.g = function;
        this.f = function2;
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        return this.g.apply(this.f.apply(obj));
    }

    @Override // com.google.common.base.Function
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Functions$FunctionComposition) {
            Functions$FunctionComposition functions$FunctionComposition = (Functions$FunctionComposition) obj;
            if (this.f.equals(functions$FunctionComposition.f) && this.g.equals(functions$FunctionComposition.g)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return this.f.hashCode() ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.g);
        A0k.append("(");
        A0k.append(this.f);
        return AnonymousClass001.A0d(")", A0k);
    }
}
