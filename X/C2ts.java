package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2ts, reason: invalid class name */
/* loaded from: 2ts.class */
public final class C2ts {
    public final int A00;
    public final int A01;
    public final C2tq A02;
    public final Integer A03;
    public final Set A04;
    public final boolean A05;

    public C2ts(C2tq c2tq, Integer num, Set set, int i, int i2, boolean z) {
        this.A05 = z;
        this.A03 = num;
        this.A02 = c2tq;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = Collections.unmodifiableSet(new HashSet(set));
    }
}
