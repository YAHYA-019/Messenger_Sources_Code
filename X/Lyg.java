package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: Lyg.class */
public final class Lyg extends LinkedHashMap {
    public static final Lyg A00;
    public boolean isMutable = true;

    static {
        Lyg lyg = new Lyg();
        A00 = lyg;
        lyg.isMutable = false;
    }

    public static int A00(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof MDc) {
                throw AnonymousClass001.A0p();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = KdF.A04;
        int length = bArr.length;
        int i = length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                break;
            }
            i = (i * 31) + bArr[i3];
            i2 = i3 + 1;
        }
        if (i == 0) {
            i = 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, X.Lyg] */
    public Lyg A01() {
        if (isEmpty()) {
            return new Lyg();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.isMutable = true;
        return linkedHashMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (!this.isMutable) {
            throw AnonymousClass001.A0p();
        }
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator A0x = AnonymousClass001.A0x(this);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            if (!map.containsKey(A0z.getKey())) {
                return false;
            }
            Object value = A0z.getValue();
            Object obj2 = map.get(A0z.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        Iterator A0x = AnonymousClass001.A0x(this);
        int i = 0;
        while (true) {
            int i2 = i;
            if (!A0x.hasNext()) {
                return i2;
            }
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            i = i2 + (A00(A0z.getValue()) ^ A00(A0z.getKey()));
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (!this.isMutable) {
            throw AnonymousClass001.A0p();
        }
        Charset charset = KdF.A04;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map map) {
        if (!this.isMutable) {
            throw AnonymousClass001.A0p();
        }
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            Object next = A1B.next();
            Charset charset = KdF.A04;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (this.isMutable) {
            return super.remove(obj);
        }
        throw AnonymousClass001.A0p();
    }
}
