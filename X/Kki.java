package X;

import java.util.List;

/* loaded from: Kki.class */
public final class Kki {
    public int A00;
    public int A01;
    public final List A02;
    public final List[] A03;
    public final /* synthetic */ LNI A04;

    public Kki(LNI lni, List list) {
        this.A04 = lni;
        this.A02 = list;
        this.A03 = new List[list.size()];
        if (!1BK.A1Y(list)) {
            throw AnonymousClass001.A0L("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
