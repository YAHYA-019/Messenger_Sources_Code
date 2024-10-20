package X;

import java.util.Comparator;

/* loaded from: Ls3.class */
public final class Ls3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return obj.getClass().getCanonicalName().compareTo(obj2.getClass().getCanonicalName());
    }
}
