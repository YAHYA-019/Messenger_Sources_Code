package X;

import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.2gl, reason: invalid class name */
/* loaded from: 2gl.class */
public abstract class C2gl implements Map.Entry {
    public int A00 = -1;
    public int A01;
    public int A02;
    public final /* synthetic */ C1qN A03;

    public C2gl(C1qN c1qN) {
        this.A03 = c1qN;
        this.A01 = c1qN.A00;
        this.A02 = c1qN.A05(-1);
    }

    public void A00() {
        int i = this.A01;
        C1qN c1qN = this.A03;
        if (i != c1qN.A00) {
            throw new ConcurrentModificationException();
        }
        int i2 = this.A02;
        if (i2 < 0) {
            throw new NoSuchElementException();
        }
        this.A00 = i2;
        this.A02 = c1qN.A05(i2);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object key2 = getKey();
            if (key != null ? key.equals(key2) : key2 == null) {
                Object value = entry.getValue();
                Object value2 = getValue();
                if (value != null ? value.equals(value2) : value2 == null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        int i = this.A00;
        if (i >= 0) {
            return this.A03.A06(i);
        }
        throw AnonymousClass001.A0N("Iterator not pointing to any element.");
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        int i = this.A00;
        if (i >= 0) {
            return this.A03.A07(i);
        }
        throw AnonymousClass001.A0N("Iterator not pointing to any element.");
    }

    public boolean hasNext() {
        boolean z = false;
        if (this.A02 >= 0) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int A02 = AnonymousClass001.A02(key);
        if (value != null) {
            i = value.hashCode();
        }
        return A02 ^ i;
    }

    public void remove() {
        int i = this.A00;
        if (i < 0) {
            throw AnonymousClass001.A0N("Iterator not pointing to any element.");
        }
        int i2 = this.A01;
        C1qN c1qN = this.A03;
        if (i2 != c1qN.A00) {
            throw new ConcurrentModificationException();
        }
        this.A01 = i2 + 1;
        c1qN.remove(c1qN.A06(i));
        Object[] objArr = c1qN.A03;
        int i3 = this.A00;
        if (objArr[i3 << 1] != null) {
            this.A02 = i3;
        }
        this.A00 = -1;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        int i = this.A00;
        if (i < 0) {
            throw AnonymousClass001.A0N("Iterator not pointing to any element.");
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.A03.A03;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
