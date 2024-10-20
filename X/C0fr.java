package X;

import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: X.0fr, reason: invalid class name */
/* loaded from: 0fr.class */
public abstract class C0fr extends AbstractCollection implements Collection, C18t {
    public abstract int A00();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return A00();
    }
}
