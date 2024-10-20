package X;

import android.text.TextUtils;

/* renamed from: X.15D, reason: invalid class name */
/* loaded from: 15D.class */
public final class C15D {
    public final C14u A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C15D(C14u c14u, String str, String str2, String str3, String str4) {
        this.A04 = str4;
        this.A00 = c14u;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = str;
    }

    public static int A00(int[] iArr, int i) {
        int i2 = (-1) >>> 1;
        int i3 = (-1) >>> 1;
        for (int i4 : iArr) {
            if (i4 >= 0) {
                i3 = Math.min(i3, i4);
            }
        }
        return i3 != i2 ? i3 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x0708, code lost:
    
        if (r341 == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0713, code lost:
    
        if (r320 == 2) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0718, code lost:
    
        if (r314 > 0) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0728, code lost:
    
        throw X.AnonymousClass001.A0L("IPV6 address with zero elision must have at least one non-zero piece");
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0795, code lost:
    
        if (r0 < (r0.length() - 1)) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07a1, code lost:
    
        new X.C14u(r330, r322);
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0731, code lost:
    
        if (r314 == 8) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x073c, code lost:
    
        if (r320 == 1) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0747, code lost:
    
        if (r319 == 4) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x075f, code lost:
    
        throw X.0Pz.A06("IPV6 address with IPV4 ending must specify exactly 4 IPV4 octets, found ", " octets", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0775, code lost:
    
        throw X.0Pz.A06("IPV6 without zero elision must have have exactly 8 pieces, found ", " pieces", r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0783, code lost:
    
        throw X.AnonymousClass001.A0L("IPV6 must not end with a single colon");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ee, code lost:
    
        r318 = X.AnonymousClass001.A0L(X.0Pz.A0F(r0 - 1, "Scheme contains illegal character ", new java.lang.String(new int[]{r0}, 0, 1), " at code point offset "));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9 A[EDGE_INSN: B:59:0x01b9->B:60:0x01b9 BREAK  A[LOOP:0: B:41:0x012c->B:68:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v289, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v290, types: [X.14a] */
    /* JADX WARN: Type inference failed for: r0v307 */
    /* JADX WARN: Type inference failed for: r0v308 */
    /* JADX WARN: Type inference failed for: r0v348 */
    /* JADX WARN: Type inference failed for: r0v409, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v429, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v807 */
    /* JADX WARN: Type inference failed for: r0v808 */
    /* JADX WARN: Type inference failed for: r0v809 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C15D A01(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 3898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15D.A01(java.lang.String):X.15D");
    }

    public static IllegalArgumentException A02(String str, int[] iArr, int i) {
        return new IllegalArgumentException(0Pz.A0F(i, str, new String(iArr, 0, 1), " at string index "));
    }

    public String A03() {
        StringBuilder A0k = AnonymousClass001.A0k();
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            A0k.append(str);
            A0k.append(":");
        }
        C14u c14u = this.A00;
        if (c14u != null) {
            A0k.append("//");
            A0k.append(c14u.A01());
        }
        String str2 = this.A02;
        if (!TextUtils.isEmpty(str2)) {
            A0k.append(str2);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            A0k.append('?');
            A0k.append("<REDACTED>");
        }
        if (!TextUtils.isEmpty(this.A01)) {
            A0k.append('#');
            A0k.append("<REDACTED>");
        }
        return A0k.toString();
    }

    public String toString() {
        return A03();
    }
}
