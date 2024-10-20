package X;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;

/* renamed from: X.3Oe, reason: invalid class name */
/* loaded from: 3Oe.class */
public final class C3Oe {
    public int A00 = 0;
    public final String A01;

    public C3Oe(String str) {
        this.A01 = str;
    }

    public char A00() {
        Preconditions.checkState(A04());
        return this.A01.charAt(this.A00);
    }

    public String A01(CharMatcher charMatcher) {
        int i = this.A00;
        String A02 = A02(charMatcher);
        boolean z = false;
        if (this.A00 != i) {
            z = true;
        }
        Preconditions.checkState(z);
        return A02;
    }

    public String A02(CharMatcher charMatcher) {
        Preconditions.checkState(A04());
        int i = this.A00;
        CharMatcher negate = charMatcher.negate();
        String str = this.A01;
        int indexIn = negate.indexIn(str, i);
        this.A00 = indexIn;
        return A04() ? str.substring(i, indexIn) : str.substring(i);
    }

    public void A03(char c) {
        Preconditions.checkState(A04());
        Preconditions.checkState(AnonymousClass001.A1Q(A00(), c));
        this.A00++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0 >= r301.A01.length()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 < 0) goto L1b
            r0 = r301
            java.lang.String r0 = r0.A01
            r303 = r0
            r0 = r303
            int r0 = r0.length()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r304
            if (r0 < r1) goto L20
        L1b:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L20:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Oe.A04():boolean");
    }
}
