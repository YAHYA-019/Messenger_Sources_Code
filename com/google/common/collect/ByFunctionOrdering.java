package com.google.common.collect;

import X.AnonymousClass001;
import X.C1zA;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: ByFunctionOrdering.class */
public final class ByFunctionOrdering extends C1zA implements Serializable {
    public static final long serialVersionUID = 0;
    public final Function function;
    public final C1zA ordering;

    public ByFunctionOrdering(Function function, C1zA c1zA) {
        this.function = function;
        c1zA.getClass();
        this.ordering = c1zA;
    }

    @Override // X.C1zA, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.ordering.compare(this.function.apply(obj), this.function.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ByFunctionOrdering)) {
                return false;
            }
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (!this.function.equals(byFunctionOrdering.function) || !this.ordering.equals(byFunctionOrdering.ordering)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.ordering);
        A0k.append(".onResultOf(");
        A0k.append(this.function);
        return AnonymousClass001.A0d(")", A0k);
    }
}
