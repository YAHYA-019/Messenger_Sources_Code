package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.04r, reason: invalid class name */
/* loaded from: 04r.class */
public final class C04r extends 0QO implements java.util.Map {
    public 0CQ A00;
    public 0EK A01;
    public 0K5 A02;

    public C04r() {
        super(0);
    }

    public C04r(0QO r302) {
        super(0);
        A09(r302);
    }

    public boolean A0A(Collection collection) {
        int size = size();
        boolean z = true;
        int i = size - 1;
        while (true) {
            int i2 = i;
            if (i2 < 0) {
                break;
            }
            if (!collection.contains(A04(i2))) {
                A05(i2);
            }
            i = i2 - 1;
        }
        if (size == size()) {
            z = false;
        }
        return z;
    }

    @Override // java.util.Map
    public Set entrySet() {
        0CQ r302 = this.A00;
        if (r302 == null) {
            r302 = new 0CQ(this);
            this.A00 = r302;
        }
        return r302;
    }

    @Override // java.util.Map
    public Set keySet() {
        0EK r302 = this.A01;
        if (r302 == null) {
            r302 = new 0EK(this);
            this.A01 = r302;
        }
        return r302;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        A08(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        0K5 r302 = this.A02;
        if (r302 == null) {
            r302 = new 0K5(this);
            this.A02 = r302;
        }
        return r302;
    }
}
