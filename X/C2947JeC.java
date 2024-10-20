package X;

/* renamed from: X.JeC, reason: case insensitive filesystem */
/* loaded from: JeC.class */
public final class C2947JeC extends LPZ {
    public static C2947JeC A00;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (A02().charAt(r302 - 1) == '\n') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        if (r302 < r0) goto L9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x006e -> B:8:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] ATU(int r302) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2947JeC.ATU(int):int[]");
    }

    public int[] CYJ(int i) {
        int i2;
        int A01 = LPZ.A01(this);
        if (A01 <= 0 || i <= 0) {
            return null;
        }
        if (i > A01) {
            i = A01;
        }
        do {
            i2 = i - 1;
            if (A02().charAt(i2) != '\n' || (i > 0 && A02().charAt(i2) != '\n' && (i == LPZ.A01(this) || A02().charAt(i) == '\n'))) {
                while (i2 > 0 && (A02().charAt(i2) == '\n' || A02().charAt(i2 - 1) != '\n')) {
                    i2--;
                }
                return A03(i2, i);
            }
            i = i2;
        } while (i2 > 0);
        return null;
    }
}
