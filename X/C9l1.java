package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.9l1, reason: invalid class name */
/* loaded from: 9l1.class */
public final class C9l1 {
    public int A00;
    public int A01;
    public 9HQ A02;
    public Runnable A03;
    public String A04;
    public final C9cY A07;
    public String A05 = "";
    public String A06 = "";
    public final List A08 = AnonymousClass001.A0s();
    public final Handler A09 = AnonymousClass001.A07();

    public C9l1(C9cY c9cY) {
        this.A07 = c9cY;
    }

    private final void A00() {
        9HQ r0 = this.A02;
        if (r0 != null) {
            r0.A00.A02("");
        }
        this.A05 = "";
        this.A06 = "";
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = null;
        this.A03 = null;
        this.A08.clear();
    }

    public static final void A01(C9l1 c9l1) {
        c9l1.A04 = null;
        int i = c9l1.A00;
        if (i >= 0) {
            List list = c9l1.A08;
            if (i < list.size()) {
                int i2 = c9l1.A00;
                int A03 = AnonymousClass001.A03(list.get(i2));
                int A032 = i2 < AnonymousClass001.A04(list) ? AnonymousClass001.A03(list.get(i2 + 1)) : c9l1.A05.length();
                String str = c9l1.A05;
                if (A03 >= str.length() || A03 >= A032) {
                    return;
                }
                String A1C = 7zM.A1C(A03, A032, str);
                9HQ r0 = c9l1.A02;
                if (r0 != null) {
                    r0.A00.A02(A1C);
                }
                c9l1.A04 = A1C;
                c9l1.A01 = A032;
                String substring = c9l1.A05.substring(A032);
                11T.A0A(substring);
                c9l1.A06 = substring;
                c9l1.A00++;
                Runnable aej = new AEJ(c9l1);
                c9l1.A03 = aej;
                c9l1.A09.postDelayed(aej, c9l1.A07.A02 * 4YU.A19(A1C, " ", 0).size());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0119, code lost:
    
        if (java.lang.Character.isWhitespace(r0.codePointAt(r316)) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011c, code lost:
    
        r0 = r301.A08;
        r0 = java.lang.Integer.valueOf(r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0132, code lost:
    
        if (r0.contains(r0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0135, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0150, code lost:
    
        if (r316 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0153, code lost:
    
        r0 = r316 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x016b, code lost:
    
        if (java.lang.Character.isWhitespace(r301.A05.codePointAt(r0)) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016e, code lost:
    
        r316 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014b, code lost:
    
        if ((-1) >= r0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9l1.A02(java.lang.String):void");
    }
}
