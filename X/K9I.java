package X;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.Multisets$ImmutableEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: K9I.class */
public final class K9I extends 1nD {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;

    public K9I(3Cm r302) {
        this.A02 = r302;
        this.A01 = r302.A00.iterator();
    }

    public K9I(KAe kAe) {
        this.A02 = kAe;
        this.A01 = AnonymousClass001.A0y(kAe.A00.A00.A01.AAK());
    }

    public K9I(ConcurrentHashMultiset concurrentHashMultiset) {
        this.A02 = concurrentHashMultiset;
        this.A01 = AnonymousClass001.A0y(concurrentHashMultiset.A00);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ Object A01() {
        Map.Entry A0z;
        int i;
        Object key;
        Collection A00;
        Object next;
        switch (this.A00) {
            case 0:
                do {
                    Iterator it = (Iterator) this.A01;
                    if (!it.hasNext()) {
                        ((1nD) this).A00 = 0S2.A0C;
                        return null;
                    }
                    A0z = AnonymousClass001.A0z(it);
                    i = ((AtomicInteger) A0z.getValue()).get();
                } while (i == 0);
                return new Multisets$ImmutableEntry(A0z.getKey(), i);
            case 1:
                do {
                    Iterator it2 = (Iterator) this.A01;
                    if (!it2.hasNext()) {
                        ((1nD) this).A00 = 0S2.A0C;
                        return null;
                    }
                    Map.Entry A0z2 = AnonymousClass001.A0z(it2);
                    key = A0z2.getKey();
                    A00 = K9W.A00(new Lf5(((KAe) this.A02).A00.A00, key), (Collection) A0z2.getValue());
                } while (A00.isEmpty());
                return new ImmutableEntry(key, A00);
            default:
                do {
                    Iterator it3 = (Iterator) this.A01;
                    if (!it3.hasNext()) {
                        ((1nD) this).A00 = 0S2.A0C;
                        return null;
                    }
                    next = it3.next();
                } while (!((3Cm) this.A02).A01.contains(next));
                return next;
        }
    }
}
