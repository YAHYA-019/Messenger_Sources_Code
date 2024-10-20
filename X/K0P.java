package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.Util;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.UUID;
import org.webrtc.legacy.MediaCodecVideoDecoder;

/* loaded from: K0P.class */
public abstract class K0P extends 6W7 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public MediaFormat A0A;
    public 6ZU A0B;
    public 6Yl A0C;
    public 6Yl A0D;
    public 6Yl A0E;
    public 6VN A0F;
    public C7ys A0G;
    public C7ys A0H;
    public 7sT A0I;
    public 6bI A0J;
    public C6b1 A0K;
    public KQq A0L;
    public L0B A0M;
    public ByteBuffer A0N;
    public ArrayDeque A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public float A0f;
    public float A0g;
    public long A0h;
    public long A0i;
    public long A0j;
    public MediaCrypto A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public final int A0p;
    public final MediaCodec.BufferInfo A0q;
    public final 6WD A0r;
    public final 6WD A0s;
    public final 7hO A0t;
    public final 6W2 A0u;
    public final ArrayDeque A0v;
    public final ArrayList A0w;
    public final boolean A0x;
    public final float A0y;
    public final int A0z;
    public final 6WD A10;
    public final MFv A11;
    public final boolean A12;

    public K0P(MFv mFv, 6W2 r303, float f, int i, int i2, int i3, boolean z) {
        super(i);
        this.A0d = false;
        this.A0Z = false;
        this.A0i = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A11 = mFv;
        this.A0u = r303;
        this.A0x = z;
        this.A0y = f;
        this.A0z = i2;
        this.A0p = i3;
        this.A10 = new 6WD(0);
        this.A0r = new 6WD(0);
        this.A0s = new 6WD(2);
        7hO r0 = new 7hO();
        this.A0t = r0;
        this.A0w = AnonymousClass001.A0s();
        this.A0q = new MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A0g = 1.0f;
        this.A0v = new ArrayDeque();
        A06(L0B.A03);
        r0.A02(0);
        ((6WD) r0).A02.order(ByteOrder.nativeOrder());
        this.A0f = -1.0f;
        this.A03 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A0h = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0j = -9223372036854775807L;
        this.A02 = 0;
        this.A01 = 0;
        this.A12 = 5N4.A02(5N3.A1C);
    }

    private void A00() {
        this.A0P = false;
        this.A0t.A00();
        this.A0s.A00();
        this.A0R = false;
        this.A0Q = false;
    }

    private void A01() {
        if (this.A0V) {
            this.A02 = 1;
            this.A01 = 3;
        } else {
            A0W();
            A0a();
        }
    }

    private void A02() {
        try {
            this.A0J.flush();
        } finally {
            A0Z();
        }
    }

    private void A03() {
        int i = this.A01;
        if (i == 1) {
            A02();
            return;
        }
        if (i == 2) {
            A02();
            A04();
        } else if (i != 3) {
            this.A0a = true;
            A0X();
        } else {
            A0W();
            A0a();
        }
    }

    private void A04() {
        LaK Af6 = this.A0H.Af6();
        if (Af6 instanceof LaK) {
            try {
                this.A0k.setMediaDrmSession(Af6.A02);
            } catch (MediaCryptoException e) {
                throw A0J(this.A0D, e, 6006, false);
            }
        }
        C7ys c7ys = this.A0H;
        7mQ.A00(this.A0G, c7ys);
        this.A0G = c7ys;
        this.A02 = 0;
        this.A01 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x025f, code lost:
    
        if (X.4YT.A00(914).equals(r0) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0160, code lost:
    
        if (r316.A0h != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x048b, code lost:
    
        if (r0 == 6) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b7  */
    /* JADX WARN: Type inference failed for: r0v141, types: [java.lang.Object, X.7sT] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(android.media.MediaCrypto r302, X.C6b1 r303) {
        /*
            Method dump skipped, instructions count: 1537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.A05(android.media.MediaCrypto, X.6b1):void");
    }

    private void A06(L0B l0b) {
        this.A0M = l0b;
        if (l0b.A01 != -9223372036854775807L) {
            this.A0o = true;
        }
    }

    private boolean A07() {
        boolean z = true;
        if (this.A0J != null && this.A01 != 3 && ((6W7) this).A01 != 0) {
            float f = this.A0g;
            6Yl[] r0 = ((6W7) this).A06;
            r0.getClass();
            float A0S = A0S(r0, f);
            float f2 = this.A0f;
            if (f2 != A0S) {
                if (A0S == -1.0f) {
                    A01();
                    z = false;
                } else if (f2 != -1.0f || A0S > this.A0y) {
                    Bundle A05 = 1BK.A05();
                    A05.putFloat("operating-rate", A0S);
                    this.A0J.CsH(A05);
                    this.A0f = A0S;
                    return true;
                }
            }
        }
        return z;
    }

    private boolean A08(int i) {
        6WB r0 = ((6W7) this).A0C;
        r0.A01 = null;
        r0.A00 = null;
        6WD r02 = this.A10;
        r02.A00();
        int A0I = A0I(r0, r02, i | 4);
        if (A0I == -5) {
            A0U(r0);
            return true;
        }
        if (A0I != -4 || (((6WE) r02).A00 & 4) != 4) {
            return false;
        }
        this.A0W = true;
        A03();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0.A0D) < 500) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A09(X.K0P r301) {
        /*
            r0 = r301
            X.6bI r0 = r0.A0J
            r302 = r0
            r0 = r302
            if (r0 == 0) goto La8
            r0 = r301
            int r0 = r0.A01
            r303 = r0
            r0 = 3
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L9e
            r0 = r301
            boolean r0 = r0.A0l
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2a
            r0 = r301
            boolean r0 = r0.A0S
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L9e
        L2a:
            r0 = r301
            boolean r0 = r0 instanceof X.K0b
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L68
            r0 = r301
            r306 = r0
            r0 = r301
            X.K0b r0 = (X.K0b) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.A0M
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L68
            long r0 = android.os.SystemClock.elapsedRealtime()
            r307 = r0
            r0 = r306
            long r0 = r0.A0D
            r309 = r0
            r0 = r307
            r1 = r309
            long r0 = r0 - r1
            r307 = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r311 = r0
            r0 = r307
            r1 = r311
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = r304
            if (r0 < 0) goto L9e
        L68:
            r0 = 2
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L95
            r0 = r301
            X.K0P r0 = (X.K0P) r0     // Catch: X.6ZU -> L79
            r0.A04()     // Catch: X.6ZU -> L79
            goto L95
        L79:
            r313 = move-exception
            r0 = 616(0x268, float:8.63E-43)
            java.lang.String r0 = X.4YT.A00(r0)
            r302 = r0
            java.lang.String r0 = "MCR3"
            r1 = r302
            r2 = r313
            X.5My.A06(r0, r1, r2)
            r0 = r301
            X.K0P r0 = (X.K0P) r0
            r0.A0W()
            r0 = r305
            return r0
        L95:
            r0 = r301
            X.K0P r0 = (X.K0P) r0
            r0.A02()
            r0 = 0
            return r0
        L9e:
            r0 = r301
            X.K0P r0 = (X.K0P) r0
            r0.A0W()
            r0 = r305
            return r0
        La8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.A09(X.K0P):boolean");
    }

    private float A0S(6Yl[] r302, float f) {
        float f2;
        if (this instanceof K0b) {
            f2 = -1.0f;
            float f3 = -1.0f;
            for (6Yl r0 : r302) {
                float f4 = r0.A01;
                if (f4 != -1.0f) {
                    f3 = Math.max(f3, f4);
                }
            }
            if (f3 != -1.0f) {
                return f3 * f;
            }
        } else {
            int i = -1;
            float f5 = 0.0f / 0.0f;
            for (6Yl r02 : r302) {
                int i2 = r02.A0G;
                if (i2 != -1) {
                    i = Math.max(i, i2);
                }
            }
            if (i != -1) {
                return f * i;
            }
            f2 = -1.0f;
        }
        return f2;
    }

    private void A0X() {
        if (this instanceof K0c) {
            K0c k0c = (K0c) this;
            try {
                k0c.A0D.CXf();
            } catch (KQj e) {
                throw k0c.A0J(e.format, e, 5002, e.isRecoverable);
            }
        }
    }

    private void A0d(MediaFormat mediaFormat, 6Yl r303) {
        int A02;
        int integer;
        int integer2;
        if (this instanceof K0b) {
            K0b k0b = (K0b) this;
            6bI r0 = ((K0P) k0b).A0J;
            if (r0 != null) {
                r0.CwO(k0b.A04);
            }
            if (k0b.A0X) {
                integer = r303.A0L;
                integer2 = r303.A0A;
            } else {
                mediaFormat.getClass();
                if (mediaFormat.containsKey(MediaCodecVideoDecoder.FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey(MediaCodecVideoDecoder.FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey("crop-top")) {
                    integer = (mediaFormat.getInteger(MediaCodecVideoDecoder.FORMAT_KEY_CROP_RIGHT) - mediaFormat.getInteger("crop-left")) + 1;
                    integer2 = (mediaFormat.getInteger(MediaCodecVideoDecoder.FORMAT_KEY_CROP_BOTTOM) - mediaFormat.getInteger("crop-top")) + 1;
                } else {
                    integer = mediaFormat.getInteger(Property.ICON_TEXT_FIT_WIDTH);
                    integer2 = mediaFormat.getInteger(Property.ICON_TEXT_FIT_HEIGHT);
                }
            }
            float f = r303.A02;
            int i = r303.A0F;
            if (i == 90 || i == 270) {
                f = 1.0f / f;
                int i2 = integer2;
                integer2 = integer;
                integer = i2;
            }
            k0b.A0J = new 6WV(f, integer, integer2, 0);
            k0b.A0f.A06(r303.A01);
            return;
        }
        K0c k0c = (K0c) this;
        6Yl r316 = k0c.A01;
        try {
            if (r316 == null) {
                if (k0c.A0J != null) {
                    if ("audio/raw".equals(r303.A0W)) {
                        A02 = r303.A0C;
                    } else if (mediaFormat.containsKey("pcm-encoding")) {
                        A02 = mediaFormat.getInteger("pcm-encoding");
                    } else {
                        String A00 = 4YT.A00(1566);
                        A02 = mediaFormat.containsKey(A00) ? Util.A02(mediaFormat.getInteger(A00)) : 2;
                    }
                    6Zr r02 = new 6Zr();
                    r02.A0U = "audio/raw";
                    r02.A0A = A02;
                    r02.A06 = r303.A08;
                    r02.A07 = r303.A09;
                    r02.A04 = mediaFormat.getInteger("channel-count");
                    r02.A0E = mediaFormat.getInteger("sample-rate");
                    r316 = new 6Yl(r02);
                }
                k0c.A0D.AHK(r303, (int[]) null, 0);
                return;
            }
            k0c.A0D.AHK(r303, (int[]) null, 0);
            return;
        } catch (C7hr e) {
            throw k0c.A0J(e.format, e, 5001, false);
        }
        r303 = r316;
    }

    private void A0h(Exception exc) {
        Handler handler;
        LoU loG;
        if (this instanceof K0b) {
            5My.A05("MCVR3", "Video codec error", exc);
            6WT r0 = ((K0b) this).A0g;
            handler = r0.A00;
            if (handler == null) {
                return;
            } else {
                loG = new LoU(r0, exc);
            }
        } else {
            5My.A05("MCAR3", 4YT.A00(527), exc);
            6Wx r02 = ((K0c) this).A0C;
            handler = r02.A00;
            if (handler == null) {
                return;
            } else {
                loG = new LoG(r02, exc);
            }
        }
        handler.post(loG);
    }

    private boolean A0j(6Yl r302, 6bI r303, ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2) {
        IllegalStateException e;
        6VN r324;
        int i4;
        float f;
        int A0H;
        if (this instanceof K0b) {
            K0b k0b = (K0b) this;
            r303.getClass();
            6bI r0 = ((K0P) k0b).A0J;
            if (r0 != null && !k0b.A0O && r0.BGW() > 30) {
                6Yl r02 = ((K0P) k0b).A0D;
                if (r02 != null) {
                    Pair B2T = r0.B2T();
                    if (AnonymousClass001.A05(B2T.first) > 0) {
                        6VN r03 = ((K0P) k0b).A0F;
                        r03.A00(B2T);
                        k0b.A0g.A01(r02, r03.A00);
                    }
                }
                k0b.A0O = true;
            }
            if (k0b.A08 == -9223372036854775807L) {
                k0b.A08 = j;
            }
            if (j3 != k0b.A0A) {
                k0b.A0f.A07(j3);
                k0b.A0A = j3;
            }
            long j4 = ((K0P) k0b).A0M.A01;
            long j5 = j3 - j4;
            if (!z || z2) {
                int i5 = ((6W7) k0b).A01;
                boolean A1Q = AnonymousClass001.A1Q(i5, 2);
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                double d = ((K0P) k0b).A00;
                long j6 = j3 - j;
                long j7 = (long) (j6 / d);
                if (A1Q) {
                    j7 -= elapsedRealtime - j2;
                }
                if (k0b.A0F == k0b.A0H) {
                    double d2 = 0.0d / 0.0d;
                    if (j7 >= -30000) {
                        return false;
                    }
                    K0b.A04(r303, k0b, i);
                    K0b.A08(k0b, j7);
                } else {
                    boolean A1Q2 = AnonymousClass001.A1Q(i5, 2);
                    boolean z3 = k0b.A0V ? !k0b.A0W : A1Q2 || k0b.A0U;
                    long elapsedRealtime2 = (SystemClock.elapsedRealtime() * 1000) - k0b.A0C;
                    try {
                        if (k0b.A09 != -9223372036854775807L || j < j4 || (!z3 && (!A1Q2 || j7 >= -30000 || elapsedRealtime2 <= 100000))) {
                            if (!A1Q || j == k0b.A08) {
                                return false;
                            }
                            long nanoTime = System.nanoTime();
                            long A03 = k0b.A0f.A03(nanoTime + (j7 * 1000));
                            long j8 = (A03 - nanoTime) / 1000;
                            boolean A1N = AnonymousClass001.A1N((k0b.A09 > (-9223372036854775807L) ? 1 : (k0b.A09 == (-9223372036854775807L) ? 0 : -1)));
                            if (j8 < 4294467296L && !z2 && (A0H = k0b.A0H(j)) != 0) {
                                6VN r04 = ((K0P) k0b).A0F;
                                if (A1N) {
                                    r04.A0A += A0H;
                                    r04.A0B += k0b.A00;
                                } else {
                                    r04.A06++;
                                    K0b.A07(k0b, A0H, k0b.A00);
                                }
                                if (!A09(k0b)) {
                                    return false;
                                }
                                k0b.A0a();
                                return false;
                            }
                            if (j8 < -30000 && !z2) {
                                if (A1N) {
                                    K0b.A04(r303, k0b, i);
                                } else {
                                    5LG.A01("dropVideoBuffer");
                                    r303.Ccr(i, false);
                                    5LG.A00();
                                    K0b.A07(k0b, 0, 1);
                                }
                                K0b.A08(k0b, j8);
                                return true;
                            }
                            if (j8 < 50000) {
                                if (A03 == k0b.A0B) {
                                    K0b.A04(r303, k0b, i);
                                } else {
                                    6Yr r05 = k0b.A0I;
                                    if (r05 != null) {
                                        r05.CU0(((K0P) k0b).A0A, r302, j5, A03);
                                    }
                                    K0b.A05(r303, k0b, i, A03);
                                    k0b.A07 = -9223372036854775807L;
                                }
                                K0b.A08(k0b, j8);
                                k0b.A0B = A03;
                                return true;
                            }
                            float f2 = r302.A01;
                            float f3 = 30.0f;
                            if (f2 != -1.0f) {
                                f3 = f2;
                            }
                            UUID uuid = 6Za.A04;
                            int A0C = (int) Util.A0C(j);
                            int A0C2 = (int) Util.A0C(j6);
                            if (A0C2 <= 1000 || A0C2 >= 10000) {
                                return false;
                            }
                            int i6 = A0C + A0C2;
                            int i7 = k0b.A02;
                            int i8 = i7 + k0b.A03;
                            if (i6 <= i8 + 1000) {
                                return false;
                            }
                            if (A0C <= i7 || A0C >= i8) {
                                if (A0C > i8) {
                                    r324 = ((K0P) k0b).A0F;
                                    i4 = r324.A0E;
                                    f = A0C2;
                                }
                                k0b.A02 = A0C;
                                k0b.A03 = A0C2;
                                return false;
                            }
                            r324 = ((K0P) k0b).A0F;
                            i4 = r324.A0E;
                            f = i6 - i8;
                            r324.A0E = i4 + ((int) ((f * f3) / 1000.0d));
                            k0b.A02 = A0C;
                            k0b.A03 = A0C2;
                            return false;
                        }
                        long nanoTime2 = System.nanoTime();
                        6Yr r06 = k0b.A0I;
                        if (r06 != null) {
                            r06.CU0(((K0P) k0b).A0A, r302, j5, nanoTime2);
                        }
                        K0b.A05(r303, k0b, i, nanoTime2);
                        K0b.A08(k0b, j7);
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (K0b.A0C(k0b)) {
                            return false;
                        }
                    }
                }
            } else {
                K0b.A04(r303, k0b, i);
            }
            k0b.A07 = -9223372036854775807L;
            return true;
        }
        K0c k0c = (K0c) this;
        byteBuffer.getClass();
        if (k0c.A01 != null && (i2 & 2) != 0) {
            r303.getClass();
            r303.Ccr(i, false);
            return true;
        }
        if (z) {
            if (r303 != null) {
                r303.Ccr(i, false);
            }
            k0c.A0F.A0B += i3;
            ((DefaultAudioSink) k0c.A0D).A0H = true;
            return true;
        }
        try {
            if (!k0c.A0D.BLk(byteBuffer, i3, j3)) {
                return false;
            }
            if (r303 != null) {
                r303.Ccr(i, false);
            }
            k0c.A0F.A09 += i3;
            return true;
        } catch (KQi e3) {
            e = k0c.A0J(k0c.A02, e3, 5001, e3.isRecoverable);
        } catch (KQj e4) {
            throw k0c.A0J(r302, e4, 5002, e4.isRecoverable);
        }
        throw e;
    }

    public void A0N() {
        try {
            A00();
            A0W();
        } finally {
            7mQ.A00(this.A0H, (C7ys) null);
            this.A0H = null;
        }
    }

    public void A0O() {
        this.A0D = null;
        A06(L0B.A03);
        this.A0v.clear();
        A09(this);
    }

    public void A0P(long j, boolean z) {
        int i;
        this.A0W = false;
        this.A0a = false;
        this.A0b = false;
        if (this.A0Q) {
            this.A0t.A00();
            this.A0s.A00();
            this.A0R = false;
        } else if (A09(this)) {
            A0a();
        }
        6WJ r0 = this.A0M.A02;
        synchronized (r0) {
            i = r0.A01;
        }
        if (i > 0) {
            this.A0e = true;
        }
        this.A0M.A02.A02();
        this.A0v.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6VN, java.lang.Object] */
    public void A0Q(boolean z, boolean z2) {
        this.A0F = new Object();
        this.A09 = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r0 >= r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0R(X.6Yl[] r302, long r303, long r305) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.A0R(X.6Yl[], long, long):void");
    }

    public abstract Krr A0T(6Yl r1, 6Yl r2, C6b1 c6b1);

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b9, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0241, code lost:
    
        if (A07() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02de, code lost:
    
        if (r0 != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Krr A0U(X.6WB r302) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.A0U(X.6WB):X.Krr");
    }

    public abstract Kl8 A0V(MediaCrypto mediaCrypto, 6Yl r2, C6b1 c6b1, float f);

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8 A[Catch: all -> 0x0120, TRY_ENTER, TryCatch #0 {all -> 0x0120, blocks: (B:52:0x00ec, B:55:0x00f8), top: B:51:0x00ec }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0W() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.A0W():void");
    }

    public void A0Y() {
        A0Z();
        this.A0B = null;
        this.A0I = null;
        this.A0O = null;
        this.A0K = null;
        this.A0C = null;
        this.A0A = null;
        this.A0U = false;
        this.A0S = false;
        this.A0f = -1.0f;
        this.A0l = false;
        this.A0T = false;
        this.A0m = false;
        this.A03 = 0;
        this.A0n = false;
        this.A0i = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
    }

    public void A0Z() {
        this.A04 = -1;
        this.A0r.A02 = null;
        this.A05 = -1;
        this.A0N = null;
        this.A0h = -9223372036854775807L;
        this.A0V = false;
        this.A0X = false;
        this.A0Y = false;
        this.A0w.clear();
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0j = -9223372036854775807L;
        7sT r0 = this.A0I;
        if (r0 != null) {
            r0.A00 = 0L;
            r0.A01 = 0L;
            r0.A02 = false;
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = this.A0m ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05fc A[Catch: KQq -> 0x06cc, TRY_ENTER, TryCatch #4 {KQq -> 0x06cc, blocks: (B:62:0x019c, B:63:0x01a4, B:64:0x01ad, B:211:0x01bb, B:212:0x01c4, B:216:0x01de, B:217:0x01e4, B:218:0x01eb, B:220:0x01fa, B:222:0x0203, B:223:0x020a, B:227:0x02f3, B:230:0x02fd, B:233:0x030b, B:234:0x0314, B:238:0x0325, B:239:0x032d, B:240:0x0336, B:242:0x0344, B:245:0x0350, B:249:0x0382, B:250:0x0387, B:252:0x038d, B:254:0x0396, B:258:0x03a5, B:260:0x03ac, B:262:0x03b6, B:265:0x03c4, B:267:0x03cf, B:269:0x03d9, B:272:0x0244, B:275:0x0252, B:276:0x0259, B:277:0x0260, B:279:0x026e, B:281:0x0277, B:282:0x027e, B:285:0x028a, B:287:0x0294, B:289:0x029d, B:291:0x02a4, B:292:0x02ac, B:294:0x02b5, B:296:0x02c0, B:298:0x02c9, B:299:0x02d1, B:301:0x02de, B:303:0x02ec, B:304:0x0361, B:305:0x0368, B:307:0x0375, B:309:0x0222, B:310:0x0228, B:312:0x0235, B:67:0x03e2, B:70:0x03f0, B:71:0x03f9, B:74:0x0409, B:75:0x0412, B:77:0x0430, B:79:0x0439, B:81:0x043f, B:82:0x0447, B:85:0x0453, B:86:0x045c, B:87:0x0463, B:90:0x0471, B:91:0x047a, B:92:0x0481, B:95:0x0496, B:96:0x049c, B:99:0x04a8, B:102:0x04b4, B:106:0x04c2, B:112:0x04ce, B:121:0x04ee, B:123:0x04f7, B:124:0x04fc, B:126:0x0501, B:130:0x051a, B:132:0x0520, B:136:0x0531, B:138:0x053b, B:140:0x0546, B:142:0x0551, B:144:0x0557, B:145:0x055f, B:147:0x0566, B:148:0x056e, B:150:0x0578, B:152:0x0581, B:154:0x0589, B:156:0x0590, B:158:0x059f, B:159:0x05a6, B:163:0x05bd, B:164:0x05c4, B:165:0x05cb, B:167:0x05db, B:169:0x05e6, B:171:0x05ef, B:174:0x05fc, B:176:0x0606, B:177:0x060e, B:181:0x061a, B:183:0x06cb, B:185:0x0626, B:186:0x062d, B:187:0x0634, B:188:0x063b, B:189:0x0642, B:190:0x0649, B:191:0x0650, B:193:0x0667, B:195:0x066d, B:199:0x052e, B:203:0x067e, B:205:0x0689, B:207:0x0696, B:209:0x06a1, B:314:0x06ab, B:316:0x06b8, B:318:0x06c4), top: B:61:0x019c, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x061a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0626 A[Catch: KQq -> 0x06cc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {KQq -> 0x06cc, blocks: (B:62:0x019c, B:63:0x01a4, B:64:0x01ad, B:211:0x01bb, B:212:0x01c4, B:216:0x01de, B:217:0x01e4, B:218:0x01eb, B:220:0x01fa, B:222:0x0203, B:223:0x020a, B:227:0x02f3, B:230:0x02fd, B:233:0x030b, B:234:0x0314, B:238:0x0325, B:239:0x032d, B:240:0x0336, B:242:0x0344, B:245:0x0350, B:249:0x0382, B:250:0x0387, B:252:0x038d, B:254:0x0396, B:258:0x03a5, B:260:0x03ac, B:262:0x03b6, B:265:0x03c4, B:267:0x03cf, B:269:0x03d9, B:272:0x0244, B:275:0x0252, B:276:0x0259, B:277:0x0260, B:279:0x026e, B:281:0x0277, B:282:0x027e, B:285:0x028a, B:287:0x0294, B:289:0x029d, B:291:0x02a4, B:292:0x02ac, B:294:0x02b5, B:296:0x02c0, B:298:0x02c9, B:299:0x02d1, B:301:0x02de, B:303:0x02ec, B:304:0x0361, B:305:0x0368, B:307:0x0375, B:309:0x0222, B:310:0x0228, B:312:0x0235, B:67:0x03e2, B:70:0x03f0, B:71:0x03f9, B:74:0x0409, B:75:0x0412, B:77:0x0430, B:79:0x0439, B:81:0x043f, B:82:0x0447, B:85:0x0453, B:86:0x045c, B:87:0x0463, B:90:0x0471, B:91:0x047a, B:92:0x0481, B:95:0x0496, B:96:0x049c, B:99:0x04a8, B:102:0x04b4, B:106:0x04c2, B:112:0x04ce, B:121:0x04ee, B:123:0x04f7, B:124:0x04fc, B:126:0x0501, B:130:0x051a, B:132:0x0520, B:136:0x0531, B:138:0x053b, B:140:0x0546, B:142:0x0551, B:144:0x0557, B:145:0x055f, B:147:0x0566, B:148:0x056e, B:150:0x0578, B:152:0x0581, B:154:0x0589, B:156:0x0590, B:158:0x059f, B:159:0x05a6, B:163:0x05bd, B:164:0x05c4, B:165:0x05cb, B:167:0x05db, B:169:0x05e6, B:171:0x05ef, B:174:0x05fc, B:176:0x0606, B:177:0x060e, B:181:0x061a, B:183:0x06cb, B:185:0x0626, B:186:0x062d, B:187:0x0634, B:188:0x063b, B:189:0x0642, B:190:0x0649, B:191:0x0650, B:193:0x0667, B:195:0x066d, B:199:0x052e, B:203:0x067e, B:205:0x0689, B:207:0x0696, B:209:0x06a1, B:314:0x06ab, B:316:0x06b8, B:318:0x06c4), top: B:61:0x019c, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0678  */
    /* JADX WARN: Type inference failed for: r0v157, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v194, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v216, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0a() {
        /*
            Method dump skipped, instructions count: 1975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.A0a():void");
    }

    public void A0b(long j) {
        this.A0j = j;
        while (true) {
            ArrayDeque arrayDeque = this.A0v;
            if (arrayDeque.isEmpty() || j < ((L0B) arrayDeque.peek()).A00) {
                return;
            }
            A06((L0B) arrayDeque.poll());
            if (this instanceof K0b) {
                K0b.A06((K0b) this);
            } else {
                ((DefaultAudioSink) ((K0c) this).A0D).A0H = true;
            }
        }
    }

    public final void A0c(long j) {
        6Yl r305 = (6Yl) this.A0M.A02.A01(j);
        if (r305 == null && this.A0o && this.A0A != null) {
            r305 = (6Yl) this.A0M.A02.A00();
        }
        if (r305 != null) {
            this.A0E = r305;
        } else {
            if (!this.A0U) {
                return;
            }
            r305 = this.A0E;
            if (r305 == null) {
                return;
            }
        }
        A0d(this.A0A, r305);
        this.A0U = false;
        this.A0o = false;
    }

    public void A0e(6WD r302) {
    }

    public abstract void A0f(6WD r1);

    public abstract void A0g(Kl8 kl8, String str, long j, long j2);

    public boolean A0i(6Yl r302) {
        boolean z = false;
        if (r302 != null && this.A0d && "video/av01".equalsIgnoreCase(r302.A0W)) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVE() {
        /*
            r301 = this;
            r0 = r301
            X.6Yl r0 = r0.A0D
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L50
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
        Ld:
            r0 = r301
            r1 = r302
            r0.A0A = r1
        L12:
            r0 = r301
            X.6Yl r0 = r0.A0D
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L69
            r0 = r301
            boolean r0 = r0.A0K()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4e
            r0 = r301
            int r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 >= 0) goto L4e
            r0 = r301
            long r0 = r0.A0h
            r304 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L69
            long r0 = android.os.SystemClock.elapsedRealtime()
            r306 = r0
            r0 = r306
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 >= 0) goto L69
        L4e:
            r0 = 1
            return r0
        L50:
            r0 = r301
            boolean r0 = r0.A0K()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L12
            r0 = r301
            int r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 >= 0) goto L12
            java.lang.Integer r0 = X.0S2.A0N
            r302 = r0
            goto Ld
        L69:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.BVE():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:604:0x0bf6
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0b14  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CfO(long r302, long r304) {
        /*
            Method dump skipped, instructions count: 3066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.CfO(long, long):void");
    }

    public void Csp(float f, float f2) {
        this.A00 = f;
        this.A0g = f2;
        A07();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (r0 == 2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int D3b(X.6Yl r302) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0P.D3b(X.6Yl):int");
    }

    public final int D3f() {
        return 8;
    }
}
