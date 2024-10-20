package X;

import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: K0g.class */
public final class K0g extends Lb0 {
    public static final MFy A01 = new MFy() { // from class: X.Lb1
        @Override // X.MFy
        public final boolean AQx(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    };
    public final MFy A00;

    public K0g() {
        this(null);
    }

    public K0g(MFy mFy) {
        this.A00 = mFy;
    }

    public static int A00(byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4 = i;
        while (true) {
            i3 = i4;
            length = bArr.length;
            if (i3 >= length) {
                i3 = length;
                break;
            }
            if (bArr[i3] == 0) {
                break;
            }
            i4 = i3 + 1;
        }
        if (i2 == 0 || i2 == 3) {
            return i3;
        }
        while (i3 < length - 1) {
            if ((i3 - i) % 2 != 0 || bArr[i3 + 1] != 0) {
                while (true) {
                    i3++;
                    if (i3 >= length) {
                        i3 = length;
                        break;
                    }
                    if (bArr[i3] == 0) {
                        break;
                    }
                }
            } else {
                return i3;
            }
        }
        return length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x03ea, code lost:
    
        if (r0 == 3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0655, code lost:
    
        if (r0 == 3) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x06f0, code lost:
    
        if (r0 == 67) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0712, code lost:
    
        r0 = r302.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0719, code lost:
    
        r0 = A04(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0720, code lost:
    
        r0 = r315 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0726, code lost:
    
        r0 = new byte[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0737, code lost:
    
        r302.A0S(r0, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0744, code lost:
    
        if (r303 != 2) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0764, code lost:
    
        r337 = X.0Pz.A0W("image/", com.google.common.base.Ascii.toLowerCase(X.JQx.A0y(com.google.common.base.Charsets.ISO_8859_1, r0, 0, 3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0782, code lost:
    
        if (X.AbstractC00603o4.A00(191).equals(r337) == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0785, code lost:
    
        r337 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0789, code lost:
    
        r311 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x07fa, code lost:
    
        r0 = r0[r311 + 1] & 255;
        r0 = r311 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x080c, code lost:
    
        r0 = A00(r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0820, code lost:
    
        r0 = X.JQx.A0y(r0, r0, r0, r0 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0829, code lost:
    
        if (r0 == 0) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x082c, code lost:
    
        r315 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0836, code lost:
    
        if (r0 != 3) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x083c, code lost:
    
        r0 = r0 + r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0847, code lost:
    
        if (r0 > r0) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0851, code lost:
    
        r333 = java.util.Arrays.copyOfRange(r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x086d, code lost:
    
        new com.google.android.exoplayer2.metadata.id3.ApicFrame(r0, r333, r337, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x085b, code lost:
    
        r333 = com.google.android.exoplayer2.util.Util.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0839, code lost:
    
        r315 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x078f, code lost:
    
        r311 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0799, code lost:
    
        if (r311 >= r0) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x07a5, code lost:
    
        if (r0[r311] == 0) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x07a8, code lost:
    
        r311 = r311 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x07c6, code lost:
    
        r337 = com.google.common.base.Ascii.toLowerCase(X.JQx.A0y(com.google.common.base.Charsets.ISO_8859_1, r0, 0, r311));
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x07e1, code lost:
    
        if (r337.indexOf(47) != (-1)) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x07e6, code lost:
    
        r337 = X.0Pz.A0W("image/", r337);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x07b1, code lost:
    
        r311 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0919, code lost:
    
        if (r0 == 3) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x070f, code lost:
    
        if (r313 == 67) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e1, code lost:
    
        if (r0 == 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x097d, code lost:
    
        if (r319 != null) goto L25;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026b  */
    /* JADX WARN: Type inference failed for: r0v87, types: [X.6ae, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame A01(X.MFy r301, X.6aO r302, int r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 3474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0g.A01(X.MFy, X.6aO, int, int, boolean):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r310.isEmpty() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.collect.ImmutableList A02(byte[] r301, int r302, int r303) {
        /*
            r0 = r301
            int r0 = r0.length
            r304 = r0
            java.lang.String r0 = ""
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 >= r1) goto L62
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            r306 = r0
        L11:
            r0 = r301
            r1 = r303
            r2 = r302
            int r0 = A00(r0, r1, r2)
            r307 = r0
            r0 = r303
            r1 = r307
            if (r0 >= r1) goto L51
            r0 = r307
            r1 = r303
            int r0 = r0 - r1
            r308 = r0
            r0 = r302
            java.nio.charset.Charset r0 = A04(r0)
            r1 = r301
            r2 = r303
            r3 = r308
            java.lang.String r0 = X.JQx.A0y(r0, r1, r2, r3)
            r309 = r0
            r0 = r306
            r1 = r309
            com.google.common.collect.ImmutableList$Builder r0 = r0.m11011add(r1)
            r0 = r302
            if (r0 == 0) goto L47
            r0 = 3
            r304 = r0
            r0 = 2
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L49
        L47:
            r0 = 1
            r303 = r0
        L49:
            r0 = r303
            r1 = r307
            int r0 = r0 + r1
            r303 = r0
            goto L11
        L51:
            r0 = r306
            com.google.common.collect.ImmutableList r0 = r0.build()
            r310 = r0
            r0 = r310
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L69
        L62:
            r0 = r305
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            r310 = r0
        L69:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0g.A02(byte[], int, int):com.google.common.collect.ImmutableList");
    }

    public static String A03(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr;
        String str;
        Locale locale = Locale.US;
        if (i == 2) {
            objArr = JQy.A1a(i2, i3, i4);
            str = "%c%c%c";
        } else {
            objArr = new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            str = "%c%c%c%c";
        }
        return String.format(locale, str, objArr);
    }

    public static Charset A04(int i) {
        return i != 1 ? i != 2 ? i != 3 ? Charsets.ISO_8859_1 : Charsets.UTF_8 : Charsets.UTF_16BE : Charsets.UTF_16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0162, code lost:
    
        r301.A0P(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0169, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(X.6aO r301, int r302, int r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0g.A05(X.6aO, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.6aO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.metadata.Metadata A06(byte[] r302, int r303) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0g.A06(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }
}
