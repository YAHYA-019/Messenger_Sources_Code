package X;

import java.io.Serializable;

/* renamed from: X.25a, reason: invalid class name */
/* loaded from: 25a.class */
public final class C25a implements C24z, Serializable {
    public static final long serialVersionUID = 1;
    public java.util.Map _localMixIns;
    public final C24z _overrides = null;

    public boolean A00() {
        if (this._localMixIns != null) {
            return true;
        }
        C24z c24z = this._overrides;
        if (c24z == null) {
            return false;
        }
        if (c24z instanceof C25a) {
            return ((C25a) c24z).A00();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r303 == null) goto L5;
     */
    @Override // X.C24z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class ASt(java.lang.Class r302) {
        /*
            r301 = this;
            r0 = r301
            X.24z r0 = r0._overrides
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2a
            r0 = 0
            r303 = r0
        Lb:
            r0 = r301
            java.util.Map r0 = r0._localMixIns
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L28
            X.Liw r0 = new X.Liw
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            r0 = r304
            r1 = r303
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            r303 = r0
        L28:
            r0 = r303
            return r0
        L2a:
            r0 = r303
            r1 = r302
            java.lang.Class r0 = r0.ASt(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25a.ASt(java.lang.Class):java.lang.Class");
    }
}
