package X;

/* renamed from: X.0A9, reason: invalid class name */
/* loaded from: 0A9.class */
public class C0A9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final 0AB A06;
    public final 0AA A07;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0AB, java.lang.Object] */
    public C0A9(int i) {
        this.A02 = i;
        if (i <= 0) {
            KTq.A00("maxSize <= 0");
            throw 0Q8.createAndThrow();
        }
        this.A07 = new 0AA(0);
        this.A06 = new Object();
    }

    private final int A00(Object obj, Object obj2) {
        int A02 = A02(obj, obj2);
        if (A02 >= 0) {
            return A02;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Negative size: ");
        A0k.append(obj);
        A0k.append('=');
        String A0a = AnonymousClass001.A0a(obj2, A0k);
        11T.A0F(A0a, 0);
        throw AnonymousClass001.A0N(A0a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d7, code lost:
    
        throw X.AnonymousClass001.A0N("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.C0A9 r301, int r302) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0A9.A01(X.0A9, int):void");
    }

    public int A02(Object obj, Object obj2) {
        return 1;
    }

    public final Object A03(Object obj) {
        11T.A0F(obj, 0);
        synchronized (this.A06) {
            Object obj2 = this.A07.A00.get(obj);
            if (obj2 != null) {
                this.A01++;
                return obj2;
            }
            this.A03++;
            return null;
        }
    }

    public final void A04(Object obj, Object obj2) {
        Object put;
        11T.A0F(obj, 0);
        11T.A0F(obj2, 1);
        synchronized (this.A06) {
            this.A04++;
            this.A05 += A00(obj, obj2);
            put = this.A07.A00.put(obj, obj2);
            if (put != null) {
                this.A05 -= A00(obj, put);
            }
        }
        if (put != null) {
            A05(false, obj, put, obj2);
        }
        A01(this, this.A02);
    }

    public void A05(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public String toString() {
        String A0d;
        synchronized (this.A06) {
            int i = this.A01;
            int i2 = this.A03;
            int i3 = i2 + i;
            int i4 = i3 != 0 ? (i * 100) / i3 : 0;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("LruCache[maxSize=");
            A0k.append(this.A02);
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
