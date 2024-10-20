package X;

import java.util.RandomAccess;

/* renamed from: X.0fi, reason: invalid class name */
/* loaded from: 0fi.class */
public final class C0fi extends C00v implements RandomAccess {
    public final /* synthetic */ int[] A00;

    public C0fi(int[] iArr) {
        this.A00 = iArr;
    }

    @Override // X.C00w
    public int A08() {
        return this.A00.length;
    }

    @Override // X.C00w, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return 02L.A0D(this.A00, AnonymousClass001.A03(obj));
    }

    @Override // X.C00v, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(this.A00[i]);
    }

    @Override // X.C00v, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int A03 = AnonymousClass001.A03(obj);
            int[] iArr = this.A00;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                i = i2;
                if (i >= length) {
                    break;
                }
                if (A03 == iArr[i]) {
                    break;
                }
                i2 = i + 1;
            }
            return i;
        }
        i = -1;
        return i;
    }

    @Override // X.C00w, java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.A00.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r306 >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        r0 = r306 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r0 == r0[r306]) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r306 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 >= 0) goto L15;
     */
    @Override // X.C00v, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ int lastIndexOf(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3c
            r0 = r302
            int r0 = X.AnonymousClass001.A03(r0)
            r304 = r0
            r0 = r301
            int[] r0 = r0.A00
            r305 = r0
            r0 = r305
            int r0 = r0.length
            r303 = r0
            r0 = r303
            r1 = -1
            int r0 = r0 + r1
            r306 = r0
            r0 = r306
            if (r0 < 0) goto L3c
        L22:
            r0 = r306
            r1 = -1
            int r0 = r0 + r1
            r307 = r0
            r0 = r305
            r1 = r306
            r0 = r0[r1]
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L3f
            r0 = r307
            r306 = r0
            r0 = r307
            if (r0 >= 0) goto L22
        L3c:
            r0 = -1
            r306 = r0
        L3f:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0fi.lastIndexOf(java.lang.Object):int");
    }
}
