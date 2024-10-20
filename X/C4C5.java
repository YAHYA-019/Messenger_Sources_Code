package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4C5, reason: invalid class name */
/* loaded from: 4C5.class */
public final class C4C5 implements Iterable {
    public final List A00 = new LinkedList();
    public final java.util.Map A01 = new HashMap();

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Collections.unmodifiableList(this.A00).iterator();
    }

    public String toString() {
        return this.A00.toString();
    }
}
