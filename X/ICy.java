package X;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.List;

/* loaded from: ICy.class */
public abstract class ICy {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.media.MediaCodecInfo.CodecCapabilities A00() {
        /*
            java.lang.String r0 = "video/avc"
            r301 = r0
            r0 = 1
            r302 = r0
            android.media.MediaCodecList r0 = new android.media.MediaCodecList
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            r0 = r303
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
            r304 = r0
            r0 = r304
            int r0 = r0.length
            r305 = r0
            r0 = 0
            r306 = r0
        L1a:
            r0 = r306
            r1 = r305
            if (r0 >= r1) goto L77
            r0 = r304
            r1 = r306
            r0 = r0[r1]
            r307 = r0
            r0 = r307
            boolean r0 = r0.isEncoder()
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L66
            r0 = r307
            java.lang.String[] r0 = r0.getSupportedTypes()
            r309 = r0
            r0 = r309
            int r0 = r0.length
            r310 = r0
            r0 = 0
            r311 = r0
        L42:
            r0 = r311
            r1 = r310
            if (r0 >= r1) goto L66
            r0 = r309
            r1 = r311
            r0 = r0[r1]
            r312 = r0
            r0 = r312
            r1 = r301
            boolean r0 = r0.equalsIgnoreCase(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L6f
            r0 = r311
            r1 = 1
            int r0 = r0 + r1
            r311 = r0
            goto L42
        L66:
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L1a
        L6f:
            r0 = r307
            r1 = r312
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r1)
            return r0
        L77:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ICy.A00():android.media.MediaCodecInfo$CodecCapabilities");
    }

    public static Range A01(int i) {
        MediaCodecInfo.CodecCapabilities A00 = A00();
        return (A00 == null || A00.getVideoCapabilities() == null) ? Range.create(32, 720) : A00.getVideoCapabilities().getSupportedWidthsFor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x0901, code lost:
    
        if (r321 == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.I8v A02(X.Hqj r301, X.I8v r302, X.I7N r303, X.I9d r304, boolean r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 3030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ICy.A02(X.Hqj, X.I8v, X.I7N, X.I9d, boolean, boolean):X.I8v");
    }

    public static I8v A03(Hqj hqj, I7N i7n, List list, boolean z) {
        int i;
        int i2;
        int i3;
        I8v A00 = I8v.A00(hqj, i7n, list);
        int max = Math.max(hqj.A05, hqj.A03);
        int i4 = i7n.A01;
        int min = Math.min(max, i4);
        float f = A00.A0C / A00.A0A;
        if (f > 1.0f) {
            A00.A0C = min;
            i2 = min;
            i = (int) (min / f);
            A00.A0A = i;
        } else {
            A00.A0A = min;
            i = min;
            i2 = (int) (min * f);
            A00.A0C = i2;
        }
        if (z) {
            int i5 = i2;
            int i6 = i2 % 16;
            if (i6 != 0) {
                i5 = i2 + (16 - i6);
            }
            i = (int) (i * (i5 / i2));
            A00.A0A = i;
            A00.A0C = i5;
            i2 = i5;
            int i7 = i % 16;
            if (i7 != 0) {
                i += 16 - i7;
            }
            A00.A0A = i;
        }
        if (min >= i4) {
            i3 = i7n.A00;
        } else {
            i3 = ((int) (((((i2 * i) * A00.A02) * 1.3f) * 0.07d) / 1000.0d)) * 1024;
        }
        A00.A01 = i3;
        return A00;
    }

    public static boolean A04(int i, int i2) {
        MediaCodecInfo.CodecCapabilities A00 = A00();
        if (A00 == null || A00.getVideoCapabilities() == null) {
            return true;
        }
        return A00.getVideoCapabilities().isSizeSupported(i, i2);
    }
}
