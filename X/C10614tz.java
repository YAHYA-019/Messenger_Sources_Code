package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4tz.class */
public class C10614tz extends AbstractC10624u0 {
    public final 1Mu A00;

    public C10614tz(1Mu r302) {
        this.A00 = r302;
    }

    @Override // X.C4u1
    public int AIN(Object obj) {
        Object obj2;
        java.util.Map AAK = this.A00.AAK();
        AAK.getClass();
        try {
            obj2 = AAK.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    @Override // X.AbstractC10624u0, X.C4u1
    public Set APB() {
        return this.A00.keySet();
    }

    @Override // X.AbstractC10624u0, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.A00.clear();
    }

    @Override // X.AbstractC10624u0, java.util.AbstractCollection, java.util.Collection, X.C4u1
    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, X.C4u1
    public Iterator iterator() {
        return new 1nF(this.A00.AQp().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public int size() {
        return this.A00.size();
    }
}
