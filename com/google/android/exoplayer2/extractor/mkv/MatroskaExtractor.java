package com.google.android.exoplayer2.extractor.mkv;

import X.0Pz;
import X.4YU;
import X.6DP;
import X.6Zo;
import X.6aJ;
import X.6aM;
import X.6aO;
import X.6aP;
import X.AnonymousClass001;
import X.C6a5;
import X.DKC;
import X.JQx;
import X.KLu;
import X.KrS;
import X.Ktk;
import X.L12;
import X.L2F;
import X.Lai;
import X.Laj;
import X.MCk;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: MatroskaExtractor.class */
public class MatroskaExtractor implements 6aM {
    public static final Map A0s;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public SparseArray A0P;
    public 6Zo A0Q;
    public L12 A0R;
    public KrS A0S;
    public KrS A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public ByteBuffer A0d;
    public boolean A0e;
    public final MCk A0f;
    public final L2F A0g;
    public final 6aO A0h;
    public final 6aO A0i;
    public final 6aO A0j;
    public final 6aO A0k;
    public final 6aO A0l;
    public final 6aO A0m;
    public final 6aO A0n;
    public final 6aO A0o;
    public final 6aO A0p;
    public final 6aO A0q;
    public final boolean A0r;
    public static final byte[] A0w = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] A0u = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(Charsets.UTF_8);
    public static final byte[] A0v = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A0x = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID A0t = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put("htc_video_rotA-000", 4YU.A0k());
        A0u2.put("htc_video_rotA-090", 90);
        A0u2.put("htc_video_rotA-180", 180);
        A0u2.put("htc_video_rotA-270", 270);
        A0s = Collections.unmodifiableMap(A0u2);
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        Laj laj = new Laj();
        long j = -1;
        this.A0M = j;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = j;
        this.A0L = j;
        this.A0G = -9223372036854775807L;
        this.A0f = laj;
        laj.A03 = new Lai(this);
        this.A0r = AnonymousClass001.A1O(i & 1);
        this.A0g = new L2F();
        this.A0P = DKC.A0E();
        this.A0m = new 6aO(4);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(-1);
        this.A0q = new 6aO(allocate.array());
        this.A0n = new 6aO(4);
        this.A0k = new 6aO(6aP.A01);
        this.A0j = new 6aO(4);
        this.A0l = new 6aO();
        this.A0o = new 6aO();
        this.A0h = new 6aO(8);
        this.A0i = new 6aO();
        this.A0p = new 6aO();
        this.A0c = new int[1];
    }

    public static int A00(6aJ r301, L12 l12, MatroskaExtractor matroskaExtractor, int i) {
        int CjE;
        int CjE2;
        int i2;
        int i3;
        byte[] bArr;
        String str = l12.A0e;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0w;
        } else if ("S_TEXT/ASS".equals(str)) {
            bArr = A0v;
        } else {
            if (!"S_TEXT/WEBVTT".equals(str)) {
                C6a5 c6a5 = l12.A0c;
                boolean z = true;
                if (!matroskaExtractor.A0V) {
                    if (l12.A0k) {
                        matroskaExtractor.A02 &= -1073741825;
                        int i4 = 128;
                        if (!matroskaExtractor.A0Y) {
                            6aO r0 = matroskaExtractor.A0m;
                            r301.readFully(r0.A02, 0, 1);
                            matroskaExtractor.A08++;
                            byte b = r0.A02[0];
                            if ((b & 128) == 128) {
                                throw KLu.A02("Extension bit is set in signal byte", (Throwable) null);
                            }
                            matroskaExtractor.A00 = b;
                            matroskaExtractor.A0Y = true;
                        }
                        byte b2 = matroskaExtractor.A00;
                        if ((b2 & 1) == 1) {
                            boolean A1Q = AnonymousClass001.A1Q(b2 & 2, 2);
                            matroskaExtractor.A02 |= 1073741824;
                            if (!matroskaExtractor.A0W) {
                                6aO r02 = matroskaExtractor.A0h;
                                r301.readFully(r02.A02, 0, 8);
                                matroskaExtractor.A08 += 8;
                                matroskaExtractor.A0W = true;
                                6aO r03 = matroskaExtractor.A0m;
                                byte[] bArr2 = r03.A02;
                                if (!A1Q) {
                                    i4 = 0;
                                }
                                bArr2[0] = (byte) (i4 | 8);
                                r03.A0P(0);
                                c6a5.CjA(r03, 1, 1);
                                matroskaExtractor.A09++;
                                r02.A0P(0);
                                c6a5.CjA(r02, 8, 1);
                                matroskaExtractor.A09 += 8;
                            }
                            if (A1Q) {
                                if (!matroskaExtractor.A0X) {
                                    6aO r04 = matroskaExtractor.A0m;
                                    r301.readFully(r04.A02, 0, 1);
                                    matroskaExtractor.A08++;
                                    r04.A0P(0);
                                    matroskaExtractor.A0B = r04.A07();
                                    matroskaExtractor.A0X = true;
                                }
                                int i5 = matroskaExtractor.A0B * 4;
                                6aO r05 = matroskaExtractor.A0m;
                                r05.A0N(i5);
                                r301.readFully(r05.A02, 0, i5);
                                matroskaExtractor.A08 += i5;
                                short s = (short) ((matroskaExtractor.A0B / 2) + 1);
                                int i6 = (s * 6) + 2;
                                ByteBuffer byteBuffer = matroskaExtractor.A0d;
                                if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                    matroskaExtractor.A0d = ByteBuffer.allocate(i6);
                                }
                                matroskaExtractor.A0d.position(0);
                                matroskaExtractor.A0d.putShort(s);
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    i2 = i8;
                                    i3 = matroskaExtractor.A0B;
                                    if (i7 >= i3) {
                                        break;
                                    }
                                    int A09 = r05.A09();
                                    int i9 = i7 % 2;
                                    ByteBuffer byteBuffer2 = matroskaExtractor.A0d;
                                    int i10 = A09 - i2;
                                    if (i9 == 0) {
                                        byteBuffer2.putShort((short) i10);
                                    } else {
                                        byteBuffer2.putInt(i10);
                                    }
                                    i7++;
                                    i8 = A09;
                                }
                                int i11 = (i - matroskaExtractor.A08) - i2;
                                int i12 = i3 % 2;
                                ByteBuffer byteBuffer3 = matroskaExtractor.A0d;
                                if (i12 == 1) {
                                    byteBuffer3.putInt(i11);
                                } else {
                                    byteBuffer3.putShort((short) i11);
                                    matroskaExtractor.A0d.putInt(0);
                                }
                                6aO r06 = matroskaExtractor.A0i;
                                r06.A0R(matroskaExtractor.A0d.array(), i6);
                                c6a5.CjA(r06, i6, 1);
                                matroskaExtractor.A09 += i6;
                            }
                        }
                    } else {
                        byte[] bArr3 = l12.A0o;
                        if (bArr3 != null) {
                            matroskaExtractor.A0l.A0R(bArr3, bArr3.length);
                        }
                    }
                    if (l12.A0O > 0) {
                        matroskaExtractor.A02 |= 268435456;
                        matroskaExtractor.A0p.A0N(0);
                        int i13 = (matroskaExtractor.A0l.A00 + i) - matroskaExtractor.A08;
                        6aO r07 = matroskaExtractor.A0m;
                        r07.A0N(4);
                        byte[] bArr4 = r07.A02;
                        JQx.A17(i13 >> 24, bArr4, 0);
                        JQx.A17(i13 >> 16, bArr4, 1);
                        JQx.A17(i13 >> 8, bArr4, 2);
                        JQx.A17(i13, bArr4, 3);
                        c6a5.CjA(r07, 4, 2);
                        matroskaExtractor.A09 += 4;
                    }
                    matroskaExtractor.A0V = true;
                }
                6aO r08 = matroskaExtractor.A0l;
                int i14 = r08.A00;
                int i15 = i + i14;
                String str2 = l12.A0e;
                if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                    Ktk ktk = l12.A0d;
                    if (ktk != null) {
                        if (i14 != 0) {
                            z = false;
                        }
                        6DP.A04(z);
                        ktk.A00(r301);
                    }
                    while (true) {
                        int i16 = matroskaExtractor.A08;
                        if (i16 >= i15) {
                            break;
                        }
                        int i17 = i15 - i16;
                        int i18 = r08.A00 - r08.A01;
                        if (i18 > 0) {
                            CjE2 = Math.min(i17, i18);
                            c6a5.Cj9(r08, CjE2);
                        } else {
                            CjE2 = c6a5.CjE(r301, i17, 0, false);
                        }
                        matroskaExtractor.A08 += CjE2;
                        matroskaExtractor.A09 += CjE2;
                    }
                } else {
                    6aO r09 = matroskaExtractor.A0j;
                    byte[] bArr5 = r09.A02;
                    bArr5[0] = 0;
                    bArr5[1] = 0;
                    bArr5[2] = 0;
                    int i19 = l12.A0R;
                    int i20 = 4 - i19;
                    while (matroskaExtractor.A08 < i15) {
                        int i21 = matroskaExtractor.A0A;
                        int i22 = r08.A00;
                        int i23 = r08.A01;
                        if (i21 == 0) {
                            int A0D = JQx.A0D(i22, i23, i19);
                            r301.readFully(bArr5, i20 + A0D, i19 - A0D);
                            if (A0D > 0) {
                                r08.A0S(bArr5, i20, A0D);
                            }
                            matroskaExtractor.A08 += i19;
                            r09.A0P(0);
                            matroskaExtractor.A0A = r09.A09();
                            6aO r010 = matroskaExtractor.A0k;
                            r010.A0P(0);
                            c6a5.Cj9(r010, 4);
                            matroskaExtractor.A09 += 4;
                        } else {
                            int i24 = i22 - i23;
                            if (i24 > 0) {
                                CjE = Math.min(i21, i24);
                                c6a5.Cj9(r08, CjE);
                            } else {
                                CjE = c6a5.CjE(r301, i21, 0, false);
                            }
                            matroskaExtractor.A08 += CjE;
                            matroskaExtractor.A09 += CjE;
                            matroskaExtractor.A0A -= CjE;
                        }
                    }
                }
                if ("A_VORBIS".equals(l12.A0e)) {
                    6aO r011 = matroskaExtractor.A0q;
                    r011.A0P(0);
                    c6a5.Cj9(r011, 4);
                    matroskaExtractor.A09 += 4;
                }
                int i25 = matroskaExtractor.A09;
                matroskaExtractor.A08 = 0;
                matroskaExtractor.A09 = 0;
                matroskaExtractor.A0A = 0;
                matroskaExtractor.A0V = false;
                matroskaExtractor.A0Y = false;
                matroskaExtractor.A0X = false;
                matroskaExtractor.A0B = 0;
                matroskaExtractor.A00 = (byte) 0;
                matroskaExtractor.A0W = false;
                matroskaExtractor.A0l.A0N(0);
                return i25;
            }
            bArr = A0x;
        }
        int length = bArr.length;
        int i26 = length + i;
        6aO r012 = matroskaExtractor.A0o;
        byte[] bArr6 = r012.A02;
        if (bArr6.length < i26) {
            byte[] copyOf = Arrays.copyOf(bArr, i26 + i);
            r012.A0R(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr6, 0, length);
        }
        r301.readFully(r012.A02, length, i);
        r012.A0P(0);
        r012.A0O(i26);
        int i252 = matroskaExtractor.A09;
        matroskaExtractor.A08 = 0;
        matroskaExtractor.A09 = 0;
        matroskaExtractor.A0A = 0;
        matroskaExtractor.A0V = false;
        matroskaExtractor.A0Y = false;
        matroskaExtractor.A0X = false;
        matroskaExtractor.A0B = 0;
        matroskaExtractor.A00 = (byte) 0;
        matroskaExtractor.A0W = false;
        matroskaExtractor.A0l.A0N(0);
        return i252;
    }

    public static long A01(MatroskaExtractor matroskaExtractor, long j) {
        long j2 = matroskaExtractor.A0O;
        if (j2 != -9223372036854775807L) {
            return Util.A0E(j, j2, 1000L);
        }
        throw KLu.A02("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    public static void A02(6aJ r301, MatroskaExtractor matroskaExtractor, int i) {
        6aO r0 = matroskaExtractor.A0m;
        if (r0.A00 < i) {
            int length = r0.A02.length;
            if (length < i) {
                r0.A0M(Math.max(length * 2, i));
            }
            byte[] bArr = r0.A02;
            int i2 = r0.A00;
            r301.readFully(bArr, i2, i - i2);
            r0.A0O(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0155. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.L12 r301, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r302, int r303, int r304, int r305, long r306) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A03(X.L12, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor, int, int, int, long):void");
    }

    public static void A04(MatroskaExtractor matroskaExtractor, int i) {
        if (matroskaExtractor.A0R == null) {
            throw KLu.A02(0Pz.A0d("Element ", " must be in a TrackEntry", i), (Throwable) null);
        }
    }

    public static byte[] A05(String str, long j, long j2) {
        6DP.A03(AnonymousClass001.A1N((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))).getBytes(Charsets.UTF_8);
    }

    public final void BOq(6Zo r302) {
        this.A0Q = r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0723, code lost:
    
        r0 = X.4YT.A00(868);
        r0 = X.4YT.A00(869);
        r0 = X.4YT.A00(870);
        r325 = ". Setting mimeType to ";
        r330 = "audio/raw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0769, code lost:
    
        switch(r351) {
            case 0: goto L312;
            case 1: goto L312;
            case 2: goto L281;
            case 3: goto L280;
            case 4: goto L238;
            case 5: goto L236;
            case 6: goto L235;
            case 7: goto L187;
            case 8: goto L186;
            case 9: goto L312;
            case 10: goto L185;
            case 11: goto L184;
            case 12: goto L183;
            case 13: goto L182;
            case 14: goto L181;
            case 15: goto L180;
            case 16: goto L179;
            case 17: goto L178;
            case 18: goto L177;
            case 19: goto L176;
            case 20: goto L175;
            case 21: goto L180;
            case 22: goto L171;
            case 23: goto L168;
            case 24: goto L165;
            case 25: goto L164;
            case 26: goto L163;
            case 27: goto L162;
            case 28: goto L161;
            case 29: goto L160;
            case 30: goto L159;
            case 31: goto L158;
            case 32: goto L157;
            default: goto L954;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0ab8, code lost:
    
        r309 = X.AnonymousClass001.A0t(3);
        r309.add(X.L12.A00(r0, r0));
        r0 = java.nio.ByteBuffer.allocate(8);
        r0 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r0 = r0.order(r0);
        r0.putLong(r0.A0Y);
        r309.add(r0.array());
        r0 = java.nio.ByteBuffer.allocate(8).order(r0);
        r0.putLong(r0.A0Z);
        r309.add(r0.array());
        r330 = "audio/opus";
        r325 = null;
        r350 = 5760;
        r309 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x11c3, code lost:
    
        r319 = -1;
        r0 = 0.0f / 0.0f;
        r309 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x11cb, code lost:
    
        r0 = r0.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x11d4, code lost:
    
        if (r0 == null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x11d7, code lost:
    
        r0 = X.C7tf.A00(new X.6aO(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x11ec, code lost:
    
        if (r0 == null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x11ef, code lost:
    
        r325 = r0.A00;
        r330 = "video/dolby-vision";
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x11fb, code lost:
    
        r0 = r0.A0h;
        r364 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x1211, code lost:
    
        if (r0.A0i == false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x1214, code lost:
    
        r364 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x1217, code lost:
    
        r0 = r364 | (r0 ? 1 : 0);
        r0 = new X.6Zr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x123f, code lost:
    
        if ("audio".equals(X.C6ac.A04(r330)) == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x1242, code lost:
    
        r0.A04 = r0.A0F;
        r0.A0E = r0.A0U;
        r0.A0A = r319;
        r333 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x1268, code lost:
    
        r0 = r0.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x1271, code lost:
    
        if (r0 == null) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x1286, code lost:
    
        if (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0s.containsKey(r0) != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x1289, code lost:
    
        r0.A0S = r0.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x1297, code lost:
    
        r0.A0R = java.lang.Integer.toString(r0);
        r0.A0U = r330;
        r0.A09 = r350;
        r0.A0T = r0.A0f;
        r0.A0F = r0;
        r0.A0V = r309;
        r0.A0P = r325;
        r0.A00(r0.A0a);
        r0 = new X.6Yl(r0);
        r0 = r0.D4h(r0.A0S, r333);
        r0.A0c = r0;
        r0.ATn(r0);
        r0.A0P.put(r0.A0S, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x134d, code lost:
    
        if ("video".equals(X.C6ac.A04(r330)) == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x1359, code lost:
    
        if (r0.A0L != 0) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x135c, code lost:
    
        r308 = r0.A0M;
        r333 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x136a, code lost:
    
        if (r308 != (-1)) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x136d, code lost:
    
        r308 = r0.A0X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x1374, code lost:
    
        r0.A0M = r308;
        r308 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x1386, code lost:
    
        if (r308 != (-1)) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x1389, code lost:
    
        r308 = r0.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x1390, code lost:
    
        r0.A0K = r308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x1397, code lost:
    
        r367 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x13ac, code lost:
    
        if (r0.A0M == r333) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x13ba, code lost:
    
        if (r0.A0K == r333) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x13bd, code lost:
    
        r367 = (r0.A0N * r0) / (r0.A0X * r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x13e7, code lost:
    
        if (r0.A0j == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x1404, code lost:
    
        if (r0.A06 == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x1417, code lost:
    
        if (r0.A07 == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x142a, code lost:
    
        if (r0.A04 == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x143d, code lost:
    
        if (r0.A05 == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x1450, code lost:
    
        if (r0.A02 == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x1463, code lost:
    
        if (r0.A03 == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x1476, code lost:
    
        if (r0.A0B == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x1489, code lost:
    
        if (r0.A0C == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x149c, code lost:
    
        if (r0.A00 == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x14af, code lost:
    
        if (r0.A01 == (-1.0f)) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x14b2, code lost:
    
        r0 = new byte[25];
        r368 = r0;
        r0 = java.nio.ByteBuffer.wrap(r0).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r0.put((byte) 0);
        r0.putShort((short) ((r0.A06 * 50000.0f) + 0.5f));
        X.JR0.A1K(r0, r0.A07);
        X.JR0.A1K(r0, r0.A04);
        X.JR0.A1K(r0, r0.A05);
        X.JR0.A1K(r0, r0.A02);
        X.JR0.A1K(r0, r0.A03);
        X.JR0.A1K(r0, r0.A0B);
        X.JR0.A1K(r0, r0.A0C);
        r0.putShort((short) (r0.A00 + 0.5f));
        r0.putShort((short) (r0.A01 + 0.5f));
        r0.putShort((short) r0.A0P);
        r0.putShort((short) r0.A0Q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x15b0, code lost:
    
        r370 = new com.google.android.exoplayer2.video.ColorInfo(r0.A0H, r0.A0G, r0.A0I, r368);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x15e3, code lost:
    
        r0 = r0.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x15ec, code lost:
    
        if (r0 == null) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x15ef, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x1601, code lost:
    
        if (r0.containsKey(r0) == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x1604, code lost:
    
        r333 = X.JQy.A0F(r0.A0g, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x161d, code lost:
    
        if (r0.A0T != 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x163a, code lost:
    
        if (java.lang.Float.compare(r0.A0A, 0.0f) != 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x163d, code lost:
    
        r0 = r0.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x164e, code lost:
    
        if (java.lang.Float.compare(r0, 0.0f) != 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x1662, code lost:
    
        if (java.lang.Float.compare(r0.A09, 0.0f) != 0) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x1665, code lost:
    
        r333 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x16d6, code lost:
    
        if (java.lang.Float.compare(r0, 90.0f) != 0) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x16d9, code lost:
    
        r333 = 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x16f0, code lost:
    
        if (java.lang.Float.compare(r0, -180.0f) == 0) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x1703, code lost:
    
        if (java.lang.Float.compare(r0, 180.0f) == 0) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x1716, code lost:
    
        if (java.lang.Float.compare(r0, -90.0f) != 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x1719, code lost:
    
        r333 = 270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x1721, code lost:
    
        r333 = 180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x166b, code lost:
    
        r0.A0J = r0.A0X;
        r0.A08 = r0.A0N;
        r0.A01 = r367;
        r0.A0D = r333;
        r0.A0W = r0.A0n;
        r0.A0G = r0.A0V;
        r0.A0O = r370;
        r333 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x1729, code lost:
    
        r368 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x172f, code lost:
    
        r370 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x1735, code lost:
    
        r333 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x1746, code lost:
    
        if ("application/x-subrip".equals(r330) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x1758, code lost:
    
        if ("text/x-ssa".equals(r330) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x176a, code lost:
    
        if ("text/vtt".equals(r330) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x177c, code lost:
    
        if (r0.equals(r330) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x178e, code lost:
    
        if (r0.equals(r330) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x17a0, code lost:
    
        if (r0.equals(r330) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x17aa, code lost:
    
        throw X.KLu.A02("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0b40, code lost:
    
        r309 = java.util.Collections.singletonList(X.L12.A00(r0, r0));
        r330 = "audio/flac";
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x11ba, code lost:
    
        r325 = null;
        r309 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x11c0, code lost:
    
        r350 = -1;
        r309 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0b58, code lost:
    
        r330 = "audio/eac3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x119a, code lost:
    
        r309 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0b60, code lost:
    
        r330 = "video/mpeg2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0b68, code lost:
    
        r330 = "application/x-subrip";
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0b6f, code lost:
    
        r330 = "text/vtt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0b76, code lost:
    
        r0 = X.C7u3.A00(new X.6aO(X.L12.A00(r0, r0)));
        r309 = r0.A06;
        r0.A0R = r0.A04;
        r325 = r0.A05;
        r330 = "video/hevc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0bb6, code lost:
    
        r309 = X.6Xe.A01((java.lang.Object[]) new byte[]{com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0u, X.L12.A00(r0, r0)});
        r330 = "text/x-ssa";
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0be2, code lost:
    
        r350 = r0.A0D;
        r319 = com.google.android.exoplayer2.util.Util.A02(r350);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0bf2, code lost:
    
        if (r319 != 0) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0bf5, code lost:
    
        r330 = X.AnonymousClass001.A0k();
        r306 = "Unsupported little endian PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x111e, code lost:
    
        r330.append(r306);
        r330.append(r350);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x1184, code lost:
    
        X.5My.A04("MatroskaExtractor", X.1BL.A0u(r325, "audio/x-unknown", r330));
        r330 = "audio/x-unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x114b, code lost:
    
        r309 = null;
        r325 = null;
        r350 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0c02, code lost:
    
        r319 = r0.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0c0d, code lost:
    
        if (r319 != 8) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0c10, code lost:
    
        r309 = null;
        r325 = null;
        r350 = -1;
        r319 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x113e, code lost:
    
        if (r319 != 16) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x1141, code lost:
    
        r319 = 268435456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x115d, code lost:
    
        r330 = X.AnonymousClass001.A0k();
        r306 = "Unsupported big endian PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x1167, code lost:
    
        r330.append(r306);
        r330.append(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0c2a, code lost:
    
        r319 = r0.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0c3d, code lost:
    
        if (r319 != 32) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0c40, code lost:
    
        r309 = null;
        r325 = null;
        r350 = -1;
        r319 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0c59, code lost:
    
        r330 = X.AnonymousClass001.A0k();
        r306 = "Unsupported floating point PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0c66, code lost:
    
        r330 = "video/x-unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0c6e, code lost:
    
        r330 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0c75, code lost:
    
        r330 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0c7d, code lost:
    
        r330 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0c85, code lost:
    
        r330 = "video/av01";
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0c8d, code lost:
    
        r330 = X.4YT.A00(880);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0ca1, code lost:
    
        r330 = "audio/ac3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0ca9, code lost:
    
        r309 = java.util.Collections.singletonList(X.L12.A00(r0, r0));
        r0 = X.C6af.A01(new X.C6ae(r0.A0l), false);
        r0.A0U = r0.A01;
        r0.A0F = r0.A00;
        r325 = r0.A02;
        r330 = "audio/mp4a-latm";
        r350 = -1;
        r319 = -1;
        r0 = 0.0f / 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0d06, code lost:
    
        r330 = X.4YT.A00(881);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0d1a, code lost:
    
        r309 = X.6Xe.A01((java.lang.Object[]) new byte[]{X.L12.A00(r0, r0)});
        r330 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0d3c, code lost:
    
        r0 = X.6pS.A00(new X.6aO(X.L12.A00(r0, r0)));
        r309 = r0.A05;
        r0.A0R = r0.A02;
        r325 = r0.A04;
        r330 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0d7c, code lost:
    
        r0 = new byte[4];
        java.lang.System.arraycopy(X.L12.A00(r0, r0), 0, r0, 0, 4);
        r309 = X.6Xe.A01((java.lang.Object[]) new byte[]{r0});
        r330 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0dae, code lost:
    
        r0 = new X.6aO(X.L12.A00(r0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0dce, code lost:
    
        r0.A0Q(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0dd5, code lost:
    
        r0 = r0.A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0de8, code lost:
    
        if (r0 != 1482049860) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0df2, code lost:
    
        r306 = X.GOn.A0G("video/divx", (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0ee1, code lost:
    
        r330 = (java.lang.String) r306.first;
        r309 = (java.util.List) r306.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0e09, code lost:
    
        if (r0 != 859189832) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0e13, code lost:
    
        r306 = X.GOn.A0G("video/3gpp", (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0e2a, code lost:
    
        if (r0 != 826496599) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0e34, code lost:
    
        r348 = r0.A01 + 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0e3b, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0e42, code lost:
    
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0e52, code lost:
    
        if (r348 >= (r0 - 4)) goto L950;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0e5e, code lost:
    
        if (r0[r348] != 0) goto L973;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0e70, code lost:
    
        if (r0[r348 + 1] != 0) goto L974;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0e84, code lost:
    
        if (r0[r348 + 2] != 1) goto L975;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0ea1, code lost:
    
        if (r0[r348 + 3] != 15) goto L976;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0ebd, code lost:
    
        r306 = X.GOn.A0G("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r0, r348, r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0ec7, code lost:
    
        r348 = r348 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x3559, code lost:
    
        throw X.KLu.A02("Failed to find FourCC VC1 initialization data", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0ed0, code lost:
    
        X.5My.A04("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        r306 = X.GOn.A0G("video/x-unknown", (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x3561, code lost:
    
        throw X.KLu.A02("Error parsing FourCC private data", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0ef8, code lost:
    
        r330 = "audio/mpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0f05, code lost:
    
        r309 = null;
        r325 = null;
        r350 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0f00, code lost:
    
        r330 = "audio/mpeg-L2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0f19, code lost:
    
        r0 = X.L12.A00(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0f31, code lost:
    
        if (r0[0] != 2) goto L953;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0f34, code lost:
    
        r348 = 1;
        r350 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0f3f, code lost:
    
        r0 = r0[r348];
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0f55, code lost:
    
        if ((r0 & 255) != 255) goto L977;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0f58, code lost:
    
        r350 = r350 + 255;
        r348 = r348 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0f69, code lost:
    
        r351 = r348 + 1;
        r0 = r350 + (r0 & 255);
        r328 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0f85, code lost:
    
        r0 = r0[r351];
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0f96, code lost:
    
        if ((r0 & 255) != 255) goto L978;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0f99, code lost:
    
        r328 = r328 + 255;
        r351 = r351 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0faa, code lost:
    
        r0 = r351 + 1;
        r0 = r328 + (r0 & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0fc9, code lost:
    
        if (r0[r0] != 1) goto L956;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0fcc, code lost:
    
        r0 = new byte[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0fd9, code lost:
    
        java.lang.System.arraycopy(r0, r0, r0, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0fe0, code lost:
    
        r0 = r0 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0ff0, code lost:
    
        if (r0[r0] != 3) goto L958;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0ff3, code lost:
    
        r0 = r0 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x100d, code lost:
    
        if (r0[r0] != 5) goto L919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x1015, code lost:
    
        r0 = r0.length - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x1018, code lost:
    
        r0 = new byte[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x1025, code lost:
    
        java.lang.System.arraycopy(r0, r0, r0, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x102c, code lost:
    
        r309 = X.AnonymousClass001.A0t(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x1033, code lost:
    
        r309.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x103b, code lost:
    
        r309.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x1043, code lost:
    
        r330 = X.GOm.A00(18);
        r325 = null;
        r350 = 8192;
        r309 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x356c, code lost:
    
        throw X.KLu.A02("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x3577, code lost:
    
        throw X.KLu.A02("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x3582, code lost:
    
        throw X.KLu.A02("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x358d, code lost:
    
        throw X.KLu.A02("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x3594, code lost:
    
        throw X.KLu.A02("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x105f, code lost:
    
        r0.A0d = new X.Ktk();
        r330 = X.4YT.A00(879);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x1084, code lost:
    
        r0 = new X.6aO(X.L12.A00(r0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x1099, code lost:
    
        r0 = r0.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x10a4, code lost:
    
        if (r0 == 1) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x10b5, code lost:
    
        if (r0 != ((char) (-2))) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x10c3, code lost:
    
        r0.A0P(24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x10ca, code lost:
    
        r0 = r0.A0D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x10cf, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x10e4, code lost:
    
        if (r0 != r0.getMostSignificantBits()) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x10fe, code lost:
    
        if (r0.A0D() != r0.getLeastSignificantBits()) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x117a, code lost:
    
        r330 = X.AnonymousClass001.A0k();
        r325 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x1101, code lost:
    
        r350 = r0.A0D;
        r319 = com.google.android.exoplayer2.util.Util.A02(r350);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x1111, code lost:
    
        if (r319 != 0) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x1114, code lost:
    
        r330 = X.AnonymousClass001.A0k();
        r306 = "Unsupported PCM bit depth: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x3595, code lost:
    
        r306 = "Error parsing MS/ACM codec private";
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x11a3, code lost:
    
        r0 = r0.A0l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x11ac, code lost:
    
        if (r0 != null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x11af, code lost:
    
        r309 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x11b5, code lost:
    
        r330 = "video/mp4v-es";
        r309 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x17ab, code lost:
    
        r309 = java.util.Collections.singletonList(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0803, code lost:
    
        throw X.KLu.A02("Unrecognized codec identifier.", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0ab2, code lost:
    
        if (r308 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x208f, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x209e, code lost:
    
        if (r319 == 2) goto L692;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x20ad, code lost:
    
        if (r319 == 3) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x20b4, code lost:
    
        if (r319 == 4) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x20c3, code lost:
    
        if (r319 != 5) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x20c6, code lost:
    
        r315 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x20da, code lost:
    
        if (r315 == 4) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x20e6, code lost:
    
        if (r315 == r0) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x20e9, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "Invalid float size: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x20f3, code lost:
    
        r323.append(r318);
        r323.append(r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x210c, code lost:
    
        throw X.KLu.A02(r323.toString(), (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x210d, code lost:
    
        r0 = (int) r315;
        r350 = 0;
        r302.readFully(r0.A06, 0, r0);
        r313 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x2136, code lost:
    
        if (r350 >= r0) goto L998;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x2139, code lost:
    
        r313 = (r313 << 8) | (r0[r350] & 255);
        r350 = r350 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x2169, code lost:
    
        if (r0 != 4) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x216c, code lost:
    
        r344 = java.lang.Float.intBitsToFloat((int) r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x217d, code lost:
    
        r0 = ((X.Lai) r0).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x2195, code lost:
    
        if (r0 == 181) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x21a6, code lost:
    
        if (r0 == 17545) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x21ab, code lost:
    
        switch(r0) {
            case 21969: goto L558;
            case 21970: goto L559;
            case 21971: goto L560;
            case 21972: goto L561;
            case 21973: goto L562;
            case 21974: goto L563;
            case 21975: goto L564;
            case 21976: goto L565;
            case 21977: goto L566;
            case 21978: goto L567;
            default: goto L551;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x21e2, code lost:
    
        switch(r0) {
            case 30323: goto L555;
            case 30324: goto L556;
            case 30325: goto L557;
            default: goto L827;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x2209, code lost:
    
        X.JQz.A0Y(r0, r0).A0A = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x2221, code lost:
    
        X.JQz.A0Y(r0, r0).A08 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x2239, code lost:
    
        X.JQz.A0Y(r0, r0).A09 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x2251, code lost:
    
        X.JQz.A0Y(r0, r0).A06 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x2269, code lost:
    
        X.JQz.A0Y(r0, r0).A07 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x2281, code lost:
    
        X.JQz.A0Y(r0, r0).A04 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x2299, code lost:
    
        X.JQz.A0Y(r0, r0).A05 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x22b1, code lost:
    
        X.JQz.A0Y(r0, r0).A02 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x22c9, code lost:
    
        X.JQz.A0Y(r0, r0).A03 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x22e1, code lost:
    
        X.JQz.A0Y(r0, r0).A0B = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x22f9, code lost:
    
        X.JQz.A0Y(r0, r0).A0C = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x2311, code lost:
    
        X.JQz.A0Y(r0, r0).A00 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x2329, code lost:
    
        X.JQz.A0Y(r0, r0).A01 = (float) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x2341, code lost:
    
        r0.A0I = (long) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x2350, code lost:
    
        X.JQz.A0Y(r0, 181).A0U = (int) r344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x21ff, code lost:
    
        r344 = java.lang.Double.longBitsToDouble(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x2368, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r323.append("Invalid element type ");
        r323.append(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x35fb, code lost:
    
        r311 = "EBML lacing sample size out of range.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x328b, code lost:
    
        r315 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x32a0, code lost:
    
        if (r315 > 2147483647L) goto L937;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x32a3, code lost:
    
        r322 = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x32aa, code lost:
    
        if (r322 != 0) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x32ad, code lost:
    
        r311 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x32b2, code lost:
    
        r0 = ((X.Lai) r0).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x32ce, code lost:
    
        if (r0 == 134) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x32df, code lost:
    
        if (r0 == 17026) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x32f0, code lost:
    
        if (r0 == 17827) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x3301, code lost:
    
        if (r0 == 21358) goto L828;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x3312, code lost:
    
        if (r0 != 2274716) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x3315, code lost:
    
        X.JQz.A0Y(r0, 2274716).A0f = r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x332e, code lost:
    
        X.JQz.A0Y(r0, 21358).A0g = r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x3351, code lost:
    
        if ("webm".equals(r311) != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x3364, code lost:
    
        if ("matroska".equals(r311) != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x3367, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r323.append("DocType ");
        r323.append(r311);
        r323.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x338d, code lost:
    
        X.JQz.A0Y(r0, com.facebook.acra.constants.ActionId.APP_MAIN).A0e = r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x33a0, code lost:
    
        r0 = new byte[r322];
        r302.readFully(r0, 0, r322);
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x33b8, code lost:
    
        if (r322 <= 0) goto L1011;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x33bb, code lost:
    
        r0 = r322 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x33ca, code lost:
    
        if (r0[r0] != 0) goto L1012;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x33cd, code lost:
    
        r322 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x33d4, code lost:
    
        r311 = new java.lang.String(r0, 0, r322);
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x33e6, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "String element size: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x2bdb, code lost:
    
        r315 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x2beb, code lost:
    
        if (r315 > r0) goto L946;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x2bee, code lost:
    
        r0 = (int) r315;
        r333 = 0;
        r302.readFully(r0.A06, 0, r0);
        r315 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x2c1a, code lost:
    
        if (r333 >= r0) goto L1013;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x2c1d, code lost:
    
        r315 = (r315 << 8) | (r0[r333] & 255);
        r333 = r333 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x2c49, code lost:
    
        r0 = ((X.Lai) r0).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x2c66, code lost:
    
        if (r0 == 20529) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x2c7a, code lost:
    
        if (r0 == 20530) goto L801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x2c7d, code lost:
    
        r333 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x2c88, code lost:
    
        switch(r0) {
            case 131: goto L759;
            case 136: goto L760;
            case 155: goto L721;
            case 159: goto L764;
            case 176: goto L765;
            case 179: goto L781;
            case 186: goto L766;
            case 215: goto L767;
            case 231: goto L722;
            case 238: goto L723;
            case 241: goto L724;
            case 251: goto L731;
            case 16871: goto L768;
            case 16980: goto L786;
            case 17029: goto L789;
            case 17143: goto L795;
            case 18401: goto L798;
            case 18408: goto L807;
            case 21420: goto L732;
            case 21432: goto L733;
            case 21680: goto L769;
            case 21682: goto L770;
            case 21690: goto L771;
            case 21930: goto L772;
            case 21998: goto L776;
            case 22186: goto L777;
            case 22203: goto L778;
            case 25188: goto L779;
            case 30114: goto L745;
            case 30321: goto L746;
            case 2352003: goto L780;
            case 2807729: goto L758;
            default: goto L704;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x2d99, code lost:
    
        switch(r0) {
            case 21945: goto L707;
            case 21946: goto L713;
            case 21947: goto L716;
            case 21948: goto L719;
            case 21949: goto L720;
            default: goto L827;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x2dbf, code lost:
    
        A04(r0, r0);
        r0 = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x2dcf, code lost:
    
        if (r0 == 1) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x2dd6, code lost:
    
        if (r0 != 2) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x2dd9, code lost:
    
        r0.A0R.A0G = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x2dea, code lost:
    
        r0.A0R.A0G = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x2dfb, code lost:
    
        A04(r0, r0);
        r0 = com.google.android.exoplayer2.video.ColorInfo.A01((int) r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x2e12, code lost:
    
        if (r0 == (-1)) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x2e15, code lost:
    
        r0.A0R.A0I = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x2e26, code lost:
    
        r0 = X.JQz.A0Y(r0, r0);
        r0.A0j = true;
        r0 = com.google.android.exoplayer2.video.ColorInfo.A00((int) r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x2e46, code lost:
    
        if (r0 == (-1)) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x2e49, code lost:
    
        r0.A0H = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x2e53, code lost:
    
        X.JQz.A0Y(r0, r0).A0P = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x2e6b, code lost:
    
        X.JQz.A0Y(r0, r0).A0Q = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x2e83, code lost:
    
        r0.A0D = A01(r0, r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x2e96, code lost:
    
        r0.A0G = A01(r0, r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x2ea9, code lost:
    
        r0.A01 = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x2ec1, code lost:
    
        if (r0.A0a != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x2ecd, code lost:
    
        if (r0.A0T == null) goto L951;
     */
    /* JADX WARN: Code restructure failed: missing block: B:897:0x2ed0, code lost:
    
        r0 = r0.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:898:0x2ed9, code lost:
    
        if (r0 == null) goto L952;
     */
    /* JADX WARN: Code restructure failed: missing block: B:899:0x2edc, code lost:
    
        r0.A01(r315);
        r0.A0a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x3616, code lost:
    
        throw X.KLu.A02(X.0Pz.A0d("Element ", " must be in a Cues", r0), (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:904:0x2eed, code lost:
    
        r0.A0U = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x2ef7, code lost:
    
        r0.A0K = r315 + r0.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:906:0x2f0f, code lost:
    
        r0 = (int) r315;
        A04(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x2f1d, code lost:
    
        if (r0 == 0) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x2f24, code lost:
    
        if (r0 == 1) goto L743;
     */
    /* JADX WARN: Code restructure failed: missing block: B:911:0x2f2b, code lost:
    
        if (r0 == 3) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x2f3b, code lost:
    
        if (r0 != 15) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x2f3e, code lost:
    
        r0.A0R.A0V = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x2f4f, code lost:
    
        r0.A0R.A0V = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:916:0x2f60, code lost:
    
        r0.A0R.A0V = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x2f71, code lost:
    
        r0.A0R.A0V = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:918:0x2f81, code lost:
    
        r0.A0E = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:919:0x2f8b, code lost:
    
        A04(r0, r0);
        r0 = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:920:0x2f99, code lost:
    
        if (r0 == 0) goto L757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:922:0x2fa0, code lost:
    
        if (r0 == 1) goto L756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x2fa7, code lost:
    
        if (r0 == 2) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x2fae, code lost:
    
        if (r0 != 3) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x2fb1, code lost:
    
        r0.A0R.A0T = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:928:0x2fc2, code lost:
    
        r0.A0R.A0T = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:929:0x2fd3, code lost:
    
        r0.A0R.A0T = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:930:0x2fe4, code lost:
    
        r0.A0R.A0T = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:931:0x2ff4, code lost:
    
        r0.A0O = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:932:0x2ffe, code lost:
    
        X.JQz.A0Y(r0, r0).A0W = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:933:0x3016, code lost:
    
        r0 = X.JQz.A0Y(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:934:0x3028, code lost:
    
        if (r315 != 1) goto L763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:935:0x302b, code lost:
    
        r333 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x302e, code lost:
    
        r0.A0h = r333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:937:0x3038, code lost:
    
        X.JQz.A0Y(r0, r0).A0F = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:938:0x3050, code lost:
    
        X.JQz.A0Y(r0, r0).A0X = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:939:0x3068, code lost:
    
        X.JQz.A0Y(r0, r0).A0N = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:940:0x3080, code lost:
    
        X.JQz.A0Y(r0, r0).A0S = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x3098, code lost:
    
        X.JQz.A0Y(r0, r0).A0E = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:942:0x30b0, code lost:
    
        X.JQz.A0Y(r0, r0).A0M = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:943:0x30c8, code lost:
    
        X.JQz.A0Y(r0, r0).A0L = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:944:0x30e0, code lost:
    
        X.JQz.A0Y(r0, r0).A0K = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x30f8, code lost:
    
        r0 = X.JQz.A0Y(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x310a, code lost:
    
        if (r315 != 1) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:947:0x310d, code lost:
    
        r333 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:948:0x3110, code lost:
    
        r0.A0i = r333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:949:0x311a, code lost:
    
        X.JQz.A0Y(r0, r0).A0O = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:950:0x3132, code lost:
    
        X.JQz.A0Y(r0, r0).A0Y = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:951:0x3145, code lost:
    
        X.JQz.A0Y(r0, r0).A0Z = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:952:0x3158, code lost:
    
        X.JQz.A0Y(r0, r0).A0D = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:953:0x3170, code lost:
    
        X.JQz.A0Y(r0, r0).A0J = (int) r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:954:0x3188, code lost:
    
        r0 = r0.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:955:0x3191, code lost:
    
        if (r0 == null) goto L923;
     */
    /* JADX WARN: Code restructure failed: missing block: B:957:0x319d, code lost:
    
        if (r0.A0S == null) goto L924;
     */
    /* JADX WARN: Code restructure failed: missing block: B:958:0x31a0, code lost:
    
        r0.A01(A01(r0, r315));
     */
    /* JADX WARN: Code restructure failed: missing block: B:962:0x31c0, code lost:
    
        if (r315 == 3) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:964:0x31c3, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "ContentCompAlgo ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:965:0x327d, code lost:
    
        X.4YU.A1T(r318, " not supported", r323, r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:967:0x31d9, code lost:
    
        if (r315 < 1) goto L926;
     */
    /* JADX WARN: Code restructure failed: missing block: B:969:0x31e9, code lost:
    
        if (r315 > 2) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:971:0x31ef, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "DocTypeReadVersion ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:974:0x3205, code lost:
    
        if (r315 == 1) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:976:0x3208, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "EBMLReadVersion ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:978:0x3222, code lost:
    
        if (r315 == 5) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:980:0x3225, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "ContentEncAlgo ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:982:0x3270, code lost:
    
        if (r315 == 1) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:984:0x3273, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "AESSettingsCipherMode ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:986:0x323b, code lost:
    
        if (r315 == 1) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:988:0x323e, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "ContentEncodingScope ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:990:0x3257, code lost:
    
        if (r315 == 0) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:992:0x325a, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "ContentEncodingOrder ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:994:0x33f3, code lost:
    
        r323 = X.AnonymousClass001.A0k();
        r318 = "Invalid integer size: ";
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:112:0x03c3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:584:0x1af5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x3507  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x34ea A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1903, types: [java.lang.Object[], byte[]] */
    /* JADX WARN: Type inference failed for: r0v1924, types: [java.lang.Object[], byte[]] */
    /* JADX WARN: Type inference failed for: r0v2023, types: [java.lang.Object[], byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Cap(X.6aJ r302, X.6aB r303) {
        /*
            Method dump skipped, instructions count: 13949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Cap(X.6aJ, X.6aB):int");
    }

    public void Ck6(long j, long j2) {
        this.A0G = -9223372036854775807L;
        int i = 0;
        this.A05 = 0;
        Laj laj = (Laj) this.A0f;
        laj.A01 = 0;
        laj.A05.clear();
        L2F l2f = laj.A04;
        l2f.A01 = 0;
        l2f.A00 = 0;
        L2F l2f2 = this.A0g;
        l2f2.A01 = 0;
        l2f2.A00 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0V = false;
        this.A0Y = false;
        this.A0X = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0W = false;
        this.A0l.A0N(0);
        while (true) {
            SparseArray sparseArray = this.A0P;
            if (i >= sparseArray.size()) {
                return;
            }
            Ktk ktk = ((L12) sparseArray.valueAt(i)).A0d;
            if (ktk != null) {
                ktk.A01 = false;
                ktk.A00 = 0;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x037b, code lost:
    
        return r315;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D0t(X.6aJ r302) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.D0t(X.6aJ):boolean");
    }
}
