package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.3bs, reason: invalid class name */
/* loaded from: 3bs.class */
public final class C3bs implements C3lz {
    public final int A00;
    public final Object A01;

    public C3bs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3lz
    public C2md ABq(C2lo c2lo, Object obj, Object obj2) {
        Object invoke;
        if (this.A00 != 0) {
            11T.A0H(c2lo, obj);
            invoke = ((C0Bd) this.A01).invoke(c2lo, obj, obj2);
        } else {
            11T.A0F(c2lo, 1);
            11T.A0F(obj, 1);
            invoke = ((Function2) this.A01).invoke(c2lo, obj);
        }
        return (C2md) invoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (X.C28q.A02(r302, r303) == false) goto L8;
     */
    @Override // X.C3lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cyz(java.lang.Object r302, java.lang.Object r303, java.lang.Object r304, java.lang.Object r305) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L2d
            r0 = r304
            r1 = r305
            boolean r0 = X.C28q.A02(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L27
            r0 = r302
            r1 = r303
            boolean r0 = X.C28q.A02(r0, r1)
            r307 = r0
            r0 = 0
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L2a
        L27:
            r0 = 1
            r306 = r0
        L2a:
            r0 = r306
            return r0
        L2d:
            r0 = r302
            r1 = r303
            boolean r0 = X.C28q.A02(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3bs.Cyz(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
