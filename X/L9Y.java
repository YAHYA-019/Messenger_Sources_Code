package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.nio.ByteBuffer;

/* loaded from: L9Y.class */
public abstract class L9Y {
    public static final int[] A00 = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH};

    public static int A00(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return A01(new C6ae(bArr)).A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if (r301.A0A() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        r0 = r301.A02(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r301.A0A() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r301.A02(3) <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        r301.A06(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        r310 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r301.A0A() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        r310 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        r0 = r301.A02(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        if (r310 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (r0 != 13) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        r313 = X.L9Y.A00[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        return new X.KjM(r310, r304, r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0146, code lost:
    
        r313 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        if (r310 != 48000) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        r0 = X.L9Y.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (r0 >= 14) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        r313 = r0[r0];
        r0 = r0 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
    
        if (r0 == 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:
    
        if (r0 == 2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
    
        if (r0 == 3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        if (r0 != 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
    
        if (r0 == 3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        if (r0 == 8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        if (r0 != 11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
    
        r313 = r313 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        if (r0 == 8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0130, code lost:
    
        if (r0 != 11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:
    
        if (r0 == 3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0140, code lost:
    
        if (r0 != 8) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if (r301.A02(2) == 3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        r301.A02(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.KjM A01(X.C6ae r301) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9Y.A01(X.6ae):X.KjM");
    }

    public static void A02(6aO r301, int i) {
        r301.A0N(7);
        byte[] bArr = r301.A02;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }
}
