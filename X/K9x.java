package X;

import java.util.Set;

/* loaded from: K9x.class */
public final class K9x extends KA3 {
    public final java.util.Map A00;

    public K9x(java.util.Map map) {
        this.A00 = map;
    }

    public /* bridge */ /* synthetic */ Object A01() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (super.containsKey(r302) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsKey(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L10
            r0 = r301
            r1 = r302
            boolean r0 = super.containsKey(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L12
        L10:
            r0 = 0
            r304 = r0
        L12:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K9x.containsKey(java.lang.Object):boolean");
    }

    public Set entrySet() {
        return C1n3.A07(new D3K(6), super.entrySet());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            return (obj instanceof java.util.Map) && entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.get(obj);
    }

    public int hashCode() {
        return C1n3.A00(entrySet());
    }

    public boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey((Object) null));
    }

    public Set keySet() {
        return C1n3.A07(new D3K(5), super.keySet());
    }

    public int size() {
        return super.size() - (super.containsKey((Object) null) ? 1 : 0);
    }
}
