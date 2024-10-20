package X;

import java.util.Collections;

/* renamed from: X.42d, reason: invalid class name */
/* loaded from: 42d.class */
public final class C42d {
    public final int A00;
    public final java.util.Map A01;

    public C42d(int i, java.util.Map map) {
        this.A00 = i;
        java.util.Map unmodifiableMap = Collections.unmodifiableMap(map);
        11T.A0A(unmodifiableMap);
        this.A01 = unmodifiableMap;
    }
}
