package X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.6b1, reason: invalid class name */
/* loaded from: 6b1.class */
public final class C6b1 {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C6b1(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A05 = z;
        this.A07 = z2;
        this.A04 = z3;
        this.A08 = z4;
        this.A06 = z5;
        this.A09 = "video".equals(C6ac.A04(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        return new X.C6b1(r301, r302, r303, r304, r305, r306, r310, r311, r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r301.isFeatureSupported("secure-playback") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r312 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        if (r301 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r301.isFeatureSupported(X.GOm.A00(188)) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        r311 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r301.isFeatureSupported("tunneled-playback") != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r311 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r301 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r312 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C6b1 A00(android.media.MediaCodecInfo.CodecCapabilities r301, java.lang.String r302, java.lang.String r303, java.lang.String r304, boolean r305, boolean r306) {
        /*
            r0 = r301
            r307 = r0
            r0 = r301
            if (r0 == 0) goto L1f
            r0 = 188(0xbc, float:2.63E-43)
            java.lang.String r0 = X.GOm.A00(r0)
            r308 = r0
            r0 = r301
            r1 = r308
            boolean r0 = r0.isFeatureSupported(r1)
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 != 0) goto L26
        L1f:
            r0 = 0
            r310 = r0
            r0 = r301
            if (r0 == 0) goto L3a
        L26:
            java.lang.String r0 = "tunneled-playback"
            r308 = r0
            r0 = r301
            r1 = r308
            boolean r0 = r0.isFeatureSupported(r1)
            r309 = r0
            r0 = 1
            r311 = r0
            r0 = r309
            if (r0 != 0) goto L41
        L3a:
            r0 = 0
            r311 = r0
            r0 = r301
            if (r0 == 0) goto L71
        L41:
            java.lang.String r0 = "secure-playback"
            r308 = r0
            r0 = r301
            r1 = r308
            boolean r0 = r0.isFeatureSupported(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L71
            r0 = 1
            r312 = r0
        L55:
            X.6b1 r0 = new X.6b1
            r308 = r0
            r0 = r308
            r1 = r307
            r2 = r302
            r3 = r303
            r4 = r304
            r5 = r305
            r6 = r306
            r7 = r310
            r8 = r311
            r9 = r312
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r308
            return r0
        L71:
            r0 = 0
            r312 = r0
            r0 = 0
            r301 = r0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b1.A00(android.media.MediaCodecInfo$CodecCapabilities, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):X.6b1");
    }

    public static void A01(C6b1 c6b1, String str) {
        5My.A01("MediaCodecInfo", 0Pz.A15("NoSupport [", str, "] [", c6b1.A03, ", ", c6b1.A02, "] [", Util.A02, "]"));
    }

    public static boolean A02(MediaCodecInfo.VideoCapabilities videoCapabilities, double d, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (r308 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r310 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(X.6Yl r301, X.C6b1 r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b1.A03(X.6Yl, X.6b1, boolean):boolean");
    }

    public Point A04(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        Point point = null;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            int widthAlignment = videoCapabilities.getWidthAlignment();
            int heightAlignment = videoCapabilities.getHeightAlignment();
            point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        }
        return point;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f9, code lost:
    
        if (r302.A01(r303) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Krr A05(X.6Yl r302, X.6Yl r303) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b1.A05(X.6Yl, X.6Yl):X.Krr");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r307 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06() {
        /*
            r301 = this;
            int r0 = com.google.android.exoplayer2.util.Util.A00
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = 29
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 < r1) goto L69
            r0 = r301
            java.lang.String r0 = r0.A02
            r305 = r0
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            r306 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L69
            r0 = r301
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3c
            r0 = r306
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L42
        L3c:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
            r307 = r0
        L42:
            r0 = r307
            int r0 = r0.length
            r308 = r0
            r0 = 0
            r309 = r0
        L4a:
            r0 = r309
            r1 = r308
            if (r0 >= r1) goto L69
            r0 = r307
            r1 = r309
            r0 = r0[r1]
            r306 = r0
            r0 = r306
            int r0 = r0.profile
            r302 = r0
            r0 = 16384(0x4000, float:2.2959E-41)
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L6b
            r0 = 1
            r303 = r0
        L69:
            r0 = r303
            return r0
        L6b:
            r0 = r309
            r1 = 1
            int r0 = r0 + r1
            r309 = r0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b1.A06():boolean");
    }

    public boolean A07(int i) {
        String A0T;
        int i2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A0T = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                A0T = "channelCount.aCaps";
            } else {
                String str = this.A03;
                String str2 = this.A02;
                int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !GOm.A00(18).equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    if ("audio/ac3".equals(str2)) {
                        i2 = 6;
                    } else {
                        i2 = 30;
                        if ("audio/eac3".equals(str2)) {
                            i2 = 16;
                        }
                    }
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("AssumedMaxChannelAdjustment: ");
                    A0k.append(str);
                    A0k.append(", [");
                    A0k.append(maxInputChannelCount);
                    A0k.append(" to ");
                    A0k.append(i2);
                    5My.A04("MediaCodecInfo", AnonymousClass001.A0d("]", A0k));
                    maxInputChannelCount = i2;
                }
                if (maxInputChannelCount >= i) {
                    return true;
                }
                A0T = 0Pz.A0T("channelCount.support, ", i);
            }
        }
        A01(this, A0T);
        return false;
    }

    public boolean A08(int i) {
        String A0T;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A0T = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                A0T = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i)) {
                    return true;
                }
                A0T = 0Pz.A0T("sampleRate.support, ", i);
            }
        }
        A01(this, A0T);
        return false;
    }

    public boolean A09(int i, int i2, double d) {
        String obj;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            obj = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (Util.A00 >= 29) {
                    int A00 = 6pY.A00(videoCapabilities, d, i, i2);
                    if (A00 != 2) {
                        if (A00 == 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("sizeAndRate.cover, ");
                            sb.append(i);
                            sb.append("x");
                            sb.append(i2);
                            sb.append("@");
                            sb.append(d);
                            obj = sb.toString();
                        }
                    }
                    return true;
                }
                if (!A02(videoCapabilities, d, i, i2)) {
                    if (i < i2) {
                        String str = this.A03;
                        if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Util.A01)) && A02(videoCapabilities, d, i2, i)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("sizeAndRate.rotated, ");
                            sb2.append(i);
                            sb2.append("x");
                            sb2.append(i2);
                            sb2.append("@");
                            sb2.append(d);
                            5My.A01("MediaCodecInfo", 0Pz.A15("AssumedSupport [", sb2.toString(), "] [", str, ", ", this.A02, "] [", Util.A02, "]"));
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("sizeAndRate.support, ");
                    sb3.append(i);
                    sb3.append("x");
                    sb3.append(i2);
                    sb3.append("@");
                    sb3.append(d);
                    obj = sb3.toString();
                }
                return true;
            }
            obj = "sizeAndRate.vCaps";
        }
        A01(this, obj);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r0.equals(X.C6ay.A02(r302)) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0A(X.6Yl r302) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b1.A0A(X.6Yl):boolean");
    }

    public boolean A0B(6Yl r302) {
        boolean z;
        if (this.A09) {
            z = this.A04;
        } else {
            Pair A00 = C6ay.A00(r302);
            if (A00 == null) {
                return false;
            }
            z = true;
            if (((Number) A00.first).intValue() != 42) {
                return false;
            }
        }
        return z;
    }

    public String toString() {
        return this.A03;
    }
}
