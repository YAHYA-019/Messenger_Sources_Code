package X;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: X.26I, reason: invalid class name */
/* loaded from: 26I.class */
public final class C26I extends C26K implements Serializable {
    public static final C26I A01 = new C26I(Collections.emptyMap());
    public static final Object A02 = new Object();
    public static final long serialVersionUID = 1;
    public transient java.util.Map A00;
    public final java.util.Map _shared;

    public C26I(java.util.Map map) {
        this._shared = map;
        this.A00 = null;
    }

    public C26I(java.util.Map map, java.util.Map map2) {
        this._shared = map;
        this.A00 = map2;
    }
}
