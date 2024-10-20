package X;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.13w, reason: invalid class name */
/* loaded from: 13w.class */
public final class C13w {
    public final C13s A00;
    public final 13C A01;
    public final TreeSet A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
    public C13w(C13s c13s, 13C r303, Set set) {
        TreeSet treeSet = new TreeSet((Comparator) new Object());
        this.A02 = treeSet;
        treeSet.addAll(set);
        this.A01 = r303;
        this.A00 = c13s;
    }
}
