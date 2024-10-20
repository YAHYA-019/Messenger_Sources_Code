package com.meta.common.monad.railway;

import X.AnonymousClass001;
import X.AnonymousClass002;

/* loaded from: Result.class */
public final class Result {
    public final Object A00;
    public final boolean A01;

    public Result(boolean z, Object obj) {
        this.A01 = z;
        this.A00 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (X.11T.A0O(r0, r305) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.meta.common.monad.railway.Result
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L43
            r0 = r301
            boolean r0 = r0.A01
            r304 = r0
            r0 = r302
            com.meta.common.monad.railway.Result r0 = (com.meta.common.monad.railway.Result) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A01
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L43
            r0 = 0
            r305 = r0
            r0 = r301
            java.lang.Object r0 = r0.A00
            r306 = r0
            r0 = r302
            java.lang.Object r0 = r0.A00
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L35
            r0 = r307
            r305 = r0
        L35:
            r0 = r306
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L48
        L43:
            r0 = 0
            r303 = r0
            r0 = 0
            r307 = r0
        L48:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.common.monad.railway.Result.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass002.A04(this.A00);
    }

    public String toString() {
        boolean z = this.A01;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(z ? "Success(" : "Failure(");
        A0k.append(this.A00);
        return AnonymousClass001.A0g(A0k, ')');
    }
}
