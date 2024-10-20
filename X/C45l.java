package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.45l, reason: invalid class name */
/* loaded from: 45l.class */
public abstract class C45l implements Iterator {
    public int A00;
    public int A01 = -1;
    public 1vG A02;
    public MapMakerInternalMap.Segment A03;
    public C45n A04;
    public C45n A05;
    public AtomicReferenceArray A06;
    public final /* synthetic */ MapMakerInternalMap A07;

    public C45l(MapMakerInternalMap mapMakerInternalMap) {
        this.A07 = mapMakerInternalMap;
        this.A00 = mapMakerInternalMap.A06.length - 1;
        A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C45l r301) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45l.A00(X.45l):void");
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.45n] */
    private boolean A01(1vG r302) {
        boolean z;
        try {
            final Object key = r302.getKey();
            final MapMakerInternalMap mapMakerInternalMap = this.A07;
            if (r302.getKey() != null) {
                final Object value = r302.getValue();
                if (value != null) {
                    this.A05 = new 2Ix(key, value) { // from class: X.45n
                        public Object A00;
                        public final Object A01;

                        {
                            this.A01 = key;
                            this.A00 = value;
                        }

                        public boolean equals(Object obj) {
                            boolean z2 = false;
                            if (obj instanceof Map.Entry) {
                                Map.Entry entry = (Map.Entry) obj;
                                if (this.A01.equals(entry.getKey()) && this.A00.equals(entry.getValue())) {
                                    z2 = true;
                                }
                            }
                            return z2;
                        }

                        public Object getKey() {
                            return this.A01;
                        }

                        public Object getValue() {
                            return this.A00;
                        }

                        public int hashCode() {
                            return this.A01.hashCode() ^ this.A00.hashCode();
                        }

                        public Object setValue(Object obj) {
                            Object put = MapMakerInternalMap.this.put(this.A01, obj);
                            this.A00 = obj;
                            return put;
                        }
                    };
                    z = true;
                    this.A03.A07();
                    return z;
                }
            }
            z = false;
            this.A03.A07();
            return z;
        } catch (Throwable th) {
            this.A03.A07();
            throw th;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = false;
        if (this.A05 != null) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this instanceof C45k) {
            C45n c45n = this.A05;
            if (c45n == null) {
                throw new NoSuchElementException();
            }
            this.A04 = c45n;
            A00(this);
            return getKey();
        }
        boolean z = this instanceof 4RG;
        C45n c45n2 = this.A05;
        if (z) {
            if (c45n2 == null) {
                throw new NoSuchElementException();
            }
            this.A04 = c45n2;
            A00(this);
            return getValue();
        }
        if (c45n2 == null) {
            throw new NoSuchElementException();
        }
        this.A04 = c45n2;
        A00(this);
        return this.A04;
    }

    @Override // java.util.Iterator
    public void remove() {
        Preconditions.checkState(AnonymousClass001.A1T(this.A04), 4YT.A00(408));
        this.A07.remove(getKey());
        this.A04 = null;
    }
}
