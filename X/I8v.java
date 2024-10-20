package X;

import android.graphics.RectF;
import java.util.HashMap;
import java.util.List;

/* loaded from: I8v.class */
public final class I8v {
    public static final RectF A0P = GOq.A0M();
    public float A00;
    public int A01;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public Hce A0F;
    public I4o A0G;
    public Integer A0H;
    public String A0I;
    public List A0J;
    public java.util.Map A0K;
    public java.util.Map A0L;
    public boolean A0M;
    public boolean A0O;
    public boolean A0N = false;
    public RectF A0E = A0P;
    public int A04 = -1;
    public int A02 = 30;
    public int A03 = 10;
    public int A0D = -1;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r303.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.I8v A00(X.Hqj r301, X.I7N r302, java.util.List r303) {
        /*
            r0 = r303
            if (r0 == 0) goto L12
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L15
        L12:
            r0 = 0
            r305 = r0
        L15:
            X.I8v r0 = new X.I8v
            r306 = r0
            r0 = r306
            r0.<init>()
            r0 = r301
            int r0 = r0.A05
            r307 = r0
            r0 = r306
            r1 = r307
            r0.A08 = r1
            r0 = r301
            int r0 = r0.A03
            r308 = r0
            r0 = r306
            r1 = r308
            r0.A06 = r1
            r0 = r301
            int r0 = r0.A04
            r309 = r0
            r0 = r306
            r1 = r309
            r0.A07 = r1
            r0 = r306
            r1 = 30
            r0.A02 = r1
            r0 = r302
            int r0 = r0.A02
            r304 = r0
            r0 = r306
            r1 = r304
            r0.A03 = r1
            r0 = r306
            r1 = r303
            r0.A0J = r1
            r0 = r309
            r1 = 180(0xb4, float:2.52E-43)
            int r0 = r0 % r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L85
            r0 = r305
            if (r0 == 0) goto L85
            r0 = r306
            r1 = r308
            r0.A0C = r1
            r0 = r306
            r1 = r307
            r0.A0A = r1
            r0 = r306
            r1 = 0
            r0.A0B = r1
            r0 = r306
            return r0
        L85:
            r0 = r306
            r1 = r307
            r0.A0C = r1
            r0 = r306
            r1 = r308
            r0.A0A = r1
            r0 = r306
            r1 = r309
            r0.A0B = r1
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I8v.A00(X.Hqj, X.I7N, java.util.List):X.I8v");
    }

    public int A01() {
        0fH.A0g(this.A0G, "MediaTranscodeParams", "transcode profile level: %s");
        I4o i4o = this.A0G;
        if (i4o != null) {
            HBJ hbj = HBJ.A0B;
            HBJ hbj2 = i4o.A04;
            if (hbj.equals(hbj2) || 1 != i4o.A03 || !HBJ.A0A.equals(hbj2)) {
                int i = this.A04;
                if (i == -1) {
                    int i2 = this.A01;
                    i = Math.min(Math.max((int) (i2 * 0.85d), 655000), i2);
                    this.A04 = i;
                }
                0fH.A0g(Integer.valueOf(i), "MediaTranscodeParams", "using main/high bitrate: %s");
                return this.A04;
            }
        }
        0fH.A0g(Integer.valueOf(this.A01), "MediaTranscodeParams", "using baseline bitrate: %s");
        return this.A01;
    }

    public String toString() {
        Integer valueOf;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("sourceWidth", Integer.valueOf(this.A08));
        A0u.put("sourceHeight", Integer.valueOf(this.A06));
        A0u.put("sourceRotationDegreesClockwise", Integer.valueOf(this.A07));
        A0u.put("targetWidth", Integer.valueOf(this.A0C));
        A0u.put("targetHeight", Integer.valueOf(this.A0A));
        A0u.put("outputAspectRatio", Float.valueOf(this.A00));
        A0u.put("shouldRetainAspectRatio", Boolean.valueOf(this.A0O));
        A0u.put("targetRotationDegreesClockwise", Integer.valueOf(this.A0B));
        A0u.put("outputRotationDegreesClockwise", Integer.valueOf(this.A05));
        A0u.put("cropRectangle", this.A0E);
        Integer num = this.A0H;
        if (num == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(1 - num.intValue() != 0 ? 0 : 1);
        }
        A0u.put("videoMirroringMode", valueOf);
        A0u.put("baselineBitRate", Integer.valueOf(this.A01));
        A0u.put("mainHighBitRate", Integer.valueOf(this.A04));
        A0u.put("frameRate", Integer.valueOf(this.A02));
        A0u.put(4YT.A00(1163), Integer.valueOf(this.A03));
        A0u.put("videoBitrateMode", Integer.valueOf(this.A0D));
        A0u.put("videoTranscodeProfileLevelParams", this.A0G);
        A0u.put("glRenderers", this.A0J);
        A0u.put("debugStats", this.A0I);
        A0u.put("forceAvcEncoding", Boolean.valueOf(this.A0M));
        return IFX.A03(I8v.class, A0u);
    }
}
