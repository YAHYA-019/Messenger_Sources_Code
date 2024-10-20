package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2tt, reason: invalid class name */
/* loaded from: 2tt.class */
public final class C2tt {
    public final C2tp A00;
    public final C2ts A01;
    public final Integer A02;
    public final List A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;

    public C2tt(C2tp c2tp, C2ts c2ts, Integer num, List list, Set set, boolean z, boolean z2) {
        this.A01 = c2ts;
        this.A00 = c2tp;
        this.A02 = num;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = Collections.unmodifiableSet(new HashSet(set));
        this.A03 = Collections.unmodifiableList(new ArrayList(list));
    }
}
