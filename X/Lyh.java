package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: Lyh.class */
public final class Lyh extends LinkedHashMap {
    public static final Lyh A00;
    public boolean isMutable = true;

    static {
        Lyh lyh = new Lyh();
        A00 = lyh;
        lyh.isMutable = false;
    }

    public static int A00(Object obj) {
        int hashCode;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = Kyu.A04;
            int length = bArr.length;
            hashCode = length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                hashCode = (hashCode * 31) + bArr[i2];
                i = i2 + 1;
            }
            if (hashCode == 0) {
                return 1;
            }
        } else {
            if (obj instanceof MGf) {
                throw AnonymousClass001.A0p();
            }
            hashCode = obj.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, X.Lyh] */
    public Lyh A01() {
        if (isEmpty()) {
            return new Lyh();
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
        Charset charset = Kyu.A04;
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
            Charset charset = Kyu.A04;
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
