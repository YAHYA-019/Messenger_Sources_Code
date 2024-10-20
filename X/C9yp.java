package X;

import com.google.common.base.MoreObjects;
import java.util.List;

/* renamed from: X.9yp, reason: invalid class name */
/* loaded from: 9yp.class */
public final class C9yp implements 55B {
    public final CharSequence A00;
    public final List A01;

    public C9yp(CharSequence charSequence, List list) {
        11T.A0F(charSequence, 1);
        this.A00 = charSequence;
        this.A01 = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (X.11T.A0O(r301.A01, r0.A01) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVh(X.55B r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            boolean r0 = r0 instanceof X.C9yp
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L45
            r0 = r301
            java.lang.CharSequence r0 = r0.A00
            r305 = r0
            r0 = r302
            X.9yp r0 = (X.C9yp) r0
            r302 = r0
            r0 = r302
            java.lang.CharSequence r0 = r0.A00
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L45
            r0 = r301
            java.util.List r0 = r0.A01
            r305 = r0
            r0 = r302
            java.util.List r0 = r0.A01
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 1
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L49
        L45:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L49:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9yp.BVh(X.55B):boolean");
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("text", this.A00);
        stringHelper.add("profilePicUrls", this.A01.toString());
        return 11T.A02(stringHelper);
    }
}
