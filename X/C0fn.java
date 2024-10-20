package X;

import java.util.RandomAccess;

/* renamed from: X.0fn, reason: invalid class name */
/* loaded from: 0fn.class */
public final class C0fn extends C00v implements RandomAccess {
    public final /* synthetic */ byte[] A00;

    public C0fn(byte[] bArr) {
        this.A00 = bArr;
    }

    @Override // X.C00w
    public int A08() {
        return this.A00.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r307 < 0) goto L11;
     */
    @Override // X.C00w, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ boolean contains(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Byte
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r302
            java.lang.Number r0 = (java.lang.Number) r0
            r302 = r0
            r0 = r302
            byte r0 = r0.byteValue()
            r304 = r0
            r0 = r301
            byte[] r0 = r0.A00
            r305 = r0
            r0 = r305
            int r0 = r0.length
            r306 = r0
            r0 = 0
            r307 = r0
        L21:
            r0 = r307
            r1 = r306
            if (r0 >= r1) goto L3a
            r0 = r305
            r1 = r307
            r0 = r0[r1]
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L3e
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 >= 0) goto L3c
        L3a:
            r0 = 0
            r303 = r0
        L3c:
            r0 = r303
            return r0
        L3e:
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0fn.contains(java.lang.Object):boolean");
    }

    @Override // X.C00v, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return Byte.valueOf(this.A00[i]);
    }

    @Override // X.C00v, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        int i;
        if (obj instanceof Byte) {
            byte byteValue = ((Number) obj).byteValue();
            byte[] bArr = this.A00;
            int length = bArr.length;
            int i2 = 0;
            while (true) {
                i = i2;
                if (i >= length) {
                    break;
                }
                if (byteValue == bArr[i]) {
                    break;
                }
                i2 = i + 1;
            }
        }
        i = -1;
        return i;
    }

    @Override // X.C00w, java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.A00.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r306 >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        r0 = r306 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r0 == r0[r306]) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r306 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
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
            boolean r0 = r0 instanceof java.lang.Byte
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L41
            r0 = r302
            java.lang.Number r0 = (java.lang.Number) r0
            r302 = r0
            r0 = r302
            byte r0 = r0.byteValue()
            r304 = r0
            r0 = r301
            byte[] r0 = r0.A00
            r305 = r0
            r0 = r305
            int r0 = r0.length
            r303 = r0
            r0 = r303
            r1 = -1
            int r0 = r0 + r1
            r306 = r0
            r0 = r306
            if (r0 < 0) goto L41
        L27:
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
            if (r0 == r1) goto L44
            r0 = r307
            r306 = r0
            r0 = r307
            if (r0 >= 0) goto L27
        L41:
            r0 = -1
            r306 = r0
        L44:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0fn.lastIndexOf(java.lang.Object):int");
    }
}
