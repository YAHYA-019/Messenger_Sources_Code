package X;

import java.util.Collections;
import java.util.List;

/* loaded from: F6c.class */
public final class F6c {
    public final Exo A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final java.util.Map A06;
    public final java.util.Map A07;

    public F6c() {
        this(null, null, null, null, null, null, null, null);
    }

    public F6c(Exo exo, List list, List list2, List list3, List list4, List list5, java.util.Map map, java.util.Map map2) {
        this.A05 = list == null ? Collections.emptyList() : list;
        this.A06 = map == null ? Collections.emptyMap() : map;
        this.A02 = list2 == null ? Collections.emptyList() : list2;
        this.A01 = list3 == null ? Collections.emptyList() : list3;
        this.A03 = list4 == null ? Collections.emptyList() : list4;
        this.A00 = exo;
        this.A07 = map2 == null ? Collections.emptyMap() : map2;
        this.A04 = list5 == null ? Collections.emptyList() : list5;
    }
}
