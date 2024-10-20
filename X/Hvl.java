package X;

/* loaded from: Hvl.class */
public abstract class Hvl {
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        android.util.Log.e(r312, r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d1, code lost:
    
        r312 = "ExifUtil";
        r313 = "Invalid length";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(byte[] r301) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hvl.A00(byte[]):int");
    }

    public static int A01(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (bArr[i] & 255) | (i4 << 8);
            i += i3;
            i2 = i5;
        }
    }
}
