package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: H8l.class */
public final class H8l extends FilterInputStream {
    public int A00;
    public boolean A01;
    public final int A02;
    public final byte[] A03;

    public H8l(InputStream inputStream) {
        super(inputStream);
        this.A03 = new byte[16];
        this.A02 = 16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read;
        byte[] bArr = new byte[1];
        do {
            read = read(bArr, 0, 1);
        } while (read == 0);
        int i = -1;
        if (read != -1) {
            i = bArr[0] & 255;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r0 = r0 - r304;
        r0 = r301.A03;
        java.lang.System.arraycopy(r0, 0, r302, r303, r304);
        java.lang.System.arraycopy(r0, r304, r0, 0, r0);
        r0 = ((java.io.FilterInputStream) r301).in;
        r0 = r301.A02;
        r0 = r0.read(r0, r0, r0 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r0 != (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r0 = r0 + r0;
        r0 = r0 - r0;
        r306 = java.lang.Math.max(0, r304 - r0) + r303;
        r0 = java.lang.Math.min(r0, r304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a3, code lost:
    
        if (r0 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a8, code lost:
    
        if (r0 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        java.lang.System.arraycopy(r0, 0, r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b7, code lost:
    
        java.lang.System.arraycopy(r302, r306, r0, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c2, code lost:
    
        r305 = r0 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
    
        r301.A00 = r305;
        r306 = r306 - r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        if (r306 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        java.lang.System.arraycopy(r0, 0, r0, r304, r0);
        java.lang.System.arraycopy(r302, r303, r0, 0, r304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        r301.A01 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        r0 = ((java.io.FilterInputStream) r301).in.read(r302, r301.A00 + r303, r304 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0113, code lost:
    
        if (r0 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0116, code lost:
    
        r0 = r301.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011e, code lost:
    
        if (r0 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0121, code lost:
    
        java.lang.System.arraycopy(r301.A03, 0, r302, r303, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
    
        r0 = r301.A00 + r0;
        r0 = ((java.io.FilterInputStream) r301).in;
        r0 = r301.A03;
        r0 = r301.A02;
        r0 = r0.read(r0, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015c, code lost:
    
        if (r0 != (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015f, code lost:
    
        r301.A01 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0165, code lost:
    
        r0 = r0 - r314;
        r306 = java.lang.Math.max(0, r0 - r0) + r303;
        r0 = java.lang.Math.min(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x018b, code lost:
    
        if (r0 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0190, code lost:
    
        if (r314 <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0193, code lost:
    
        java.lang.System.arraycopy(r0, 0, r0, r0, r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019f, code lost:
    
        java.lang.System.arraycopy(r302, r306, r0, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
    
        r305 = r0 + r314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b4, code lost:
    
        r314 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r304 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        return r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00da, code lost:
    
        r0 = r301.A00;
        r314 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ec, code lost:
    
        if (r304 < r0) goto L8;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8l.read(byte[], int, int):int");
    }
}
