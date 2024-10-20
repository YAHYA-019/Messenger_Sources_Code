package com.google.common.collect;

import X.KzK;
import java.io.Serializable;

/* loaded from: DiscreteDomain$IntegerDomain.class */
public final class DiscreteDomain$IntegerDomain extends KzK implements Serializable {
    public static final DiscreteDomain$IntegerDomain A00 = new KzK(true);
    public static final long serialVersionUID = 0;

    public DiscreteDomain$IntegerDomain() {
        super(true);
    }

    private Object readResolve() {
        return A00;
    }

    public String toString() {
        return "DiscreteDomain.integers()";
    }
}
