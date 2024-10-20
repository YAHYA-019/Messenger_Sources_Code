package X;

import java.util.StringTokenizer;

/* renamed from: X.3k6, reason: invalid class name */
/* loaded from: 3k6.class */
public final class C3k6 extends StringTokenizer {
    public int A00;
    public String A01;
    public final String A02;

    public C3k6(String str) {
        super(str, "<,>", true);
        this.A02 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (super.hasMoreTokens() != false) goto L6;
     */
    @Override // java.util.StringTokenizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasMoreTokens() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L16
            r0 = r301
            boolean r0 = super.hasMoreTokens()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L16:
            r0 = 1
            r304 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3k6.hasMoreTokens():boolean");
    }

    @Override // java.util.StringTokenizer
    public String nextToken() {
        String str = this.A01;
        if (str != null) {
            this.A01 = null;
            return str;
        }
        String nextToken = super.nextToken();
        this.A00 += nextToken.length();
        return nextToken.trim();
    }
}
