package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: L4i.class */
public final class L4i {
    public int A00;
    public int A01;
    public int A02;
    public int A04;
    public int A05;
    public final KV3 A06 = new Object();
    public int A03 = 16;
    public final HashMap A07 = new HashMap(0, 0.75f);
    public final LinkedHashSet A08 = 7zL.A15();

    private final int A00() {
        int i;
        synchronized (this.A06) {
            i = this.A01;
        }
        return i;
    }

    public final Object A01(Object obj) {
        synchronized (this.A06) {
            Object obj2 = this.A07.get(obj);
            if (obj2 == null) {
                this.A04++;
                return null;
            }
            LinkedHashSet linkedHashSet = this.A08;
            linkedHashSet.remove(obj);
            linkedHashSet.add(obj);
            this.A02++;
            return obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0163, code lost:
    
        r307 = X.AnonymousClass001.A0N("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4i.A02(java.lang.Object, java.lang.Object):void");
    }

    public String toString() {
        String A0d;
        synchronized (this.A06) {
            int i = this.A02;
            int i2 = this.A04;
            int i3 = i2 + i;
            int i4 = i3 != 0 ? (i * 100) / i3 : 0;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("LruCache[maxSize=");
            A0k.append(16);
            A0k.append(",hits=");
            A0k.append(i);
            A0k.append(",misses=");
            A0k.append(i2);
            A0k.append(",hitRate=");
            A0k.append(i4);
            A0d = AnonymousClass001.A0d("%]", A0k);
        }
        return A0d;
    }
}
