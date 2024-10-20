package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.6ex, reason: invalid class name */
/* loaded from: 6ex.class */
public final class C6ex extends AbstractMap implements Serializable {
    public static final Comparator A00 = new Ls7(9);
    public final boolean allowNullValues;
    public final Comparator comparator;
    public C6f5 entrySet;
    public final C6ey header;
    public LyP keySet;
    public int modCount;
    public C6ey root;
    public int size;

    public C6ex() {
        Comparator comparator = A00;
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator;
        this.allowNullValues = true;
        this.header = new C6ey(true);
    }

    public C6ex(boolean z) {
        Comparator comparator = A00;
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator;
        this.allowNullValues = false;
        this.header = new C6ey(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:6:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C6ey A00(X.C6ex r301, java.lang.Object r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ex.A00(X.6ex, java.lang.Object, boolean):X.6ey");
    }

    private void A01(C6ey c6ey) {
        C6ey c6ey2 = c6ey.A01;
        C6ey c6ey3 = c6ey.A05;
        C6ey c6ey4 = c6ey3.A01;
        C6ey c6ey5 = c6ey3.A05;
        c6ey.A05 = c6ey4;
        if (c6ey4 != null) {
            c6ey4.A03 = c6ey;
        }
        A03(c6ey, c6ey3);
        c6ey3.A01 = c6ey;
        c6ey.A03 = c6ey3;
        int i = 0;
        int max = Math.max(c6ey2 != null ? c6ey2.A00 : 0, c6ey4 != null ? c6ey4.A00 : 0) + 1;
        c6ey.A00 = max;
        if (c6ey5 != null) {
            i = c6ey5.A00;
        }
        c6ey3.A00 = Math.max(max, i) + 1;
    }

    private void A02(C6ey c6ey) {
        C6ey c6ey2 = c6ey.A01;
        C6ey c6ey3 = c6ey.A05;
        C6ey c6ey4 = c6ey2.A01;
        C6ey c6ey5 = c6ey2.A05;
        c6ey.A01 = c6ey5;
        if (c6ey5 != null) {
            c6ey5.A03 = c6ey;
        }
        A03(c6ey, c6ey2);
        c6ey2.A05 = c6ey;
        c6ey.A03 = c6ey2;
        int i = 0;
        int max = Math.max(c6ey3 != null ? c6ey3.A00 : 0, c6ey5 != null ? c6ey5.A00 : 0) + 1;
        c6ey.A00 = max;
        if (c6ey4 != null) {
            i = c6ey4.A00;
        }
        c6ey2.A00 = Math.max(max, i) + 1;
    }

    private void A03(C6ey c6ey, C6ey c6ey2) {
        C6ey c6ey3 = c6ey.A03;
        c6ey.A03 = null;
        if (c6ey2 != null) {
            c6ey2.A03 = c6ey3;
        }
        if (c6ey3 == null) {
            this.root = c6ey2;
        } else if (c6ey3.A01 == c6ey) {
            c6ey3.A01 = c6ey2;
        } else {
            c6ey3.A05 = c6ey2;
        }
    }

    private void A04(C6ey c6ey, boolean z) {
        while (c6ey != null) {
            C6ey c6ey2 = c6ey.A01;
            C6ey c6ey3 = c6ey.A05;
            int i = 0;
            int i2 = c6ey2 != null ? c6ey2.A00 : 0;
            int i3 = c6ey3 != null ? c6ey3.A00 : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C6ey c6ey4 = c6ey3.A01;
                C6ey c6ey5 = c6ey3.A05;
                int i5 = c6ey5 != null ? c6ey5.A00 : 0;
                if (c6ey4 != null) {
                    i = c6ey4.A00;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    A02(c6ey3);
                }
                A01(c6ey);
            } else if (i4 == 2) {
                C6ey c6ey6 = c6ey2.A01;
                C6ey c6ey7 = c6ey2.A05;
                int i7 = c6ey7 != null ? c6ey7.A00 : 0;
                if (c6ey6 != null) {
                    i = c6ey6.A00;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    A01(c6ey2);
                }
                A02(c6ey);
            } else if (i4 == 0) {
                c6ey.A00 = i2 + 1;
            } else {
                c6ey.A00 = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                } else {
                    c6ey = c6ey.A03;
                }
            }
            if (z) {
                return;
            } else {
                c6ey = c6ey.A03;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public void A05(C6ey c6ey, boolean z) {
        int i;
        if (z) {
            C6ey c6ey2 = c6ey.A04;
            c6ey2.A02 = c6ey.A02;
            c6ey.A02.A04 = c6ey2;
        }
        C6ey c6ey3 = c6ey.A01;
        C6ey c6ey4 = c6ey.A05;
        C6ey c6ey5 = c6ey.A03;
        int i2 = 0;
        if (c6ey3 != null) {
            if (c6ey4 != null) {
                if (c6ey3.A00 > c6ey4.A00) {
                    C6ey c6ey6 = c6ey3.A05;
                    while (true) {
                        C6ey c6ey7 = c6ey6;
                        if (c6ey7 == null) {
                            break;
                        }
                        c6ey3 = c6ey7;
                        c6ey6 = c6ey7.A05;
                    }
                } else {
                    c6ey3 = c6ey4;
                    for (C6ey c6ey8 = c6ey4.A01; c6ey8 != null; c6ey8 = c6ey8.A01) {
                        c6ey3 = c6ey8;
                    }
                }
                A05(c6ey3, false);
                C6ey c6ey9 = c6ey.A01;
                if (c6ey9 != null) {
                    i = c6ey9.A00;
                    c6ey3.A01 = c6ey9;
                    c6ey9.A03 = c6ey3;
                    c6ey.A01 = null;
                } else {
                    i = 0;
                }
                C6ey c6ey10 = c6ey.A05;
                if (c6ey10 != null) {
                    i2 = c6ey10.A00;
                    c6ey3.A05 = c6ey10;
                    c6ey10.A03 = c6ey3;
                    c6ey.A05 = null;
                }
                c6ey3.A00 = Math.max(i, i2) + 1;
                A03(c6ey, c6ey3);
                return;
            }
            A03(c6ey, c6ey3);
            c6ey.A01 = null;
        } else if (c6ey4 != null) {
            A03(c6ey, c6ey4);
            c6ey.A05 = null;
        } else {
            A03(c6ey, null);
        }
        A04(c6ey5, false);
        this.size--;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C6ey c6ey = this.header;
        c6ey.A04 = c6ey;
        c6ey.A02 = c6ey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r303 == null) goto L8;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsKey(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L15
            r0 = 0
            r304 = r0
            r0 = r301
            r1 = r302
            r2 = 0
            X.6ey r0 = A00(r0, r1, r2)     // Catch: java.lang.ClassCastException -> L19
            r303 = r0
        Lf:
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L17
        L15:
            r0 = 0
            r304 = r0
        L17:
            r0 = r304
            return r0
        L19:
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ex.containsKey(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        C6f5 c6f5 = this.entrySet;
        if (c6f5 == null) {
            c6f5 = new C6f5(this);
            this.entrySet = c6f5;
        }
        return c6f5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        C6ey c6ey = null;
        if (obj != null) {
            try {
                c6ey = A00(this, obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c6ey != null) {
            return c6ey.A06;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        LyP lyP = this.keySet;
        if (lyP == null) {
            lyP = new LyP(this);
            this.keySet = lyP;
        }
        return lyP;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass001.A0Q("key == null");
        }
        if (obj2 == null && !this.allowNullValues) {
            throw AnonymousClass001.A0Q("value == null");
        }
        C6ey A002 = A00(this, obj, true);
        Object obj3 = A002.A06;
        A002.A06 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        C6ey c6ey = null;
        if (obj != null) {
            try {
                c6ey = A00(this, obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c6ey != null) {
            A05(c6ey, true);
        }
        if (c6ey != null) {
            return c6ey.A06;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }
}
