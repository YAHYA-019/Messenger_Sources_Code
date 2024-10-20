package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Display;
import android.view.Surface;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: K0b.class */
public abstract class K0b extends K0P {
    public static boolean A0l;
    public static boolean A0m;
    public static final int[] A0n = {1920, 1600, 1440, 1280, 960, 854, HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT, 540, 480};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public Surface A0F;
    public LG7 A0G;
    public PlaceholderSurface A0H;
    public 6Yr A0I;
    public 6WV A0J;
    public 6WV A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int A0Y;
    public int A0Z;
    public KjX A0a;
    public boolean A0b;
    public final long A0c;
    public final Context A0d;
    public final KmD A0e;
    public final 6WN A0f;
    public final 6WT A0g;
    public final boolean A0h;
    public final int A0i;
    public final 6Vz A0j;
    public final boolean A0k;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00f7, code lost:
    
        if (com.google.android.exoplayer2.util.Util.A04.startsWith("Pixel ") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public K0b(android.content.Context r302, android.os.Handler r303, X.6Vz r304, X.MFv r305, X.6W2 r306, X.6Vr r307, int r308, int r309, int r310, long r311) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0b.<init>(android.content.Context, android.os.Handler, X.6Vz, X.MFv, X.6W2, X.6Vr, int, int, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x012d, code lost:
    
        r319 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0130, code lost:
    
        r320 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        if (r315.A0B(r302) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
    
        r320 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0145, code lost:
    
        r317 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0151, code lost:
    
        if (r315.A05 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0154, code lost:
    
        r317 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
    
        if (X.5N4.A02(X.5N3.A17) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0169, code lost:
    
        r317 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016c, code lost:
    
        r314 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0174, code lost:
    
        if (r318 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0177, code lost:
    
        r314 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018b, code lost:
    
        if ("video/dolby-vision".equals(r0) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0196, code lost:
    
        if (A0A(r301) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0199, code lost:
    
        r314 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ac, code lost:
    
        if (X.5N4.A02(X.5N3.A19) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01af, code lost:
    
        r314 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b7, code lost:
    
        if (r316 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ba, code lost:
    
        r0 = A03(r301, r302, r303, r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d1, code lost:
    
        if (r0.isEmpty() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d4, code lost:
    
        r0 = (X.C6b1) X.C6ay.A03(r302, r0).get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f1, code lost:
    
        if (r0.A0A(r302) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fe, code lost:
    
        if (r0.A0B(r302) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0201, code lost:
    
        r309 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0213, code lost:
    
        return (((r319 | r320) | r309) | r317) | r314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0225, code lost:
    
        if (r316 != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.content.Context r301, X.6Yl r302, X.6W2 r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0b.A00(android.content.Context, X.6Yl, X.6W2, boolean):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(X.6Yl r301, X.C6b1 r302) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0b.A01(X.6Yl, X.6b1):int");
    }

    public static int A02(6Yl r301, C6b1 c6b1) {
        int i = r301.A0B;
        if (i == -1) {
            return A01(r301, c6b1);
        }
        List list = r301.A0X;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    public static List A03(Context context, 6Yl r302, 6W2 r303, boolean z, boolean z2) {
        String str = r302.A0W;
        if (str == null) {
            return ImmutableList.of();
        }
        if ("video/dolby-vision".equals(str) && !A0A(context)) {
            String A02 = C6ay.A02(r302);
            List of = A02 == null ? ImmutableList.of() : r303.Agl(A02, z, z2);
            if (!of.isEmpty()) {
                return of;
            }
        }
        List Agl = r303.Agl(str, z, z2);
        String A022 = C6ay.A02(r302);
        List of2 = A022 == null ? ImmutableList.of() : r303.Agl(A022, z, z2);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(Agl);
        builder.addAll(of2);
        return builder.build();
    }

    public static void A04(6bI r301, K0b k0b, int i) {
        5LG.A01("skipVideoBuffer");
        r301.Ccr(i, false);
        5LG.A00();
        ((K0P) k0b).A0F.A0B++;
    }

    public static void A05(6bI r301, K0b k0b, int i, long j) {
        5LG.A01("releaseOutputBuffer");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r301.Ccq(i, j);
        ((K0P) k0b).A09 += JQx.A0O(elapsedRealtime);
        5LG.A00();
        ((K0P) k0b).A0F.A09++;
        k0b.A0Y = 0;
        k0b.A0C = SystemClock.elapsedRealtime() * 1000;
        6WV r0 = k0b.A0J;
        if (!r0.equals(6WV.A04) && !r0.equals(k0b.A0K)) {
            k0b.A0K = r0;
            k0b.A0g.A04(r0);
        }
        k0b.A0V = true;
        if (!k0b.A0W) {
            k0b.A0W = true;
            k0b.A0g.A05(k0b.A0F);
            k0b.A0Q = true;
        }
        6VN r02 = ((K0P) k0b).A0F;
        long j2 = ((K0P) k0b).A09;
        int i2 = r02.A09;
        r02.A01 = i2 == 0 ? -1 : (int) (j2 / i2);
    }

    public static void A06(K0b k0b) {
        6bI r0;
        k0b.A0W = false;
        if (!k0b.A0X || (r0 = ((K0P) k0b).A0J) == null) {
            return;
        }
        k0b.A0G = new LG7(r0, k0b);
    }

    public static void A07(K0b k0b, int i, int i2) {
        6VN r0 = ((K0P) k0b).A0F;
        r0.A05 += i;
        int i3 = i + i2;
        r0.A04 += i3;
        k0b.A01 += i3;
        int i4 = k0b.A0Y + i3;
        k0b.A0Y = i4;
        r0.A07 = Math.max(i4, r0.A07);
    }

    public static void A08(K0b k0b, long j) {
        6VN r0 = ((K0P) k0b).A0F;
        r0.A0F += j;
        r0.A0D++;
        k0b.A0E += j;
        k0b.A05++;
    }

    public static boolean A0A(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        boolean z = false;
        if (displayManager != null && (display = displayManager.getDisplay(0)) != null && display.isHdr()) {
            int[] supportedHdrTypes = display.getHdrCapabilities().getSupportedHdrTypes();
            int length = supportedHdrTypes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (supportedHdrTypes[i] == 1) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        return z;
    }

    public static boolean A0B(C6b1 c6b1, K0b k0b) {
        if (!k0b.A0T || k0b.A0X || A0D(c6b1.A03)) {
            return false;
        }
        return !c6b1.A06 || PlaceholderSurface.A01();
    }

    public static boolean A0C(K0b k0b) {
        int i = k0b.A0i;
        boolean z = false;
        if (i > 0) {
            long j = k0b.A07;
            if (j == -9223372036854775807L || System.currentTimeMillis() - j <= i) {
                z = true;
            }
            if (j == -9223372036854775807L) {
                5My.A04("MCVR3", "Render output failed");
                k0b.A07 = System.currentTimeMillis();
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0120, code lost:
    
        if (r0.equals(r302) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0174, code lost:
    
        r303 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016a, code lost:
    
        if (r0.equals(r302) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0b.A0D(java.lang.String):boolean");
    }

    public void A0L() {
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A06 = SystemClock.elapsedRealtime();
        this.A0C = SystemClock.elapsedRealtime() * 1000;
        this.A0E = 0L;
        this.A05 = 0;
        this.A0f.A04();
    }

    public void A0M() {
        this.A09 = -9223372036854775807L;
        int i = this.A01;
        if (i > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A0g.A00(i, elapsedRealtime - this.A06);
            this.A01 = 0;
            this.A06 = elapsedRealtime;
        }
        int i2 = this.A05;
        if (i2 != 0) {
            6WT r0 = this.A0g;
            long j = this.A0E;
            Handler handler = r0.A00;
            if (handler != null) {
                handler.post(new Lpx(r0, i2, j));
            }
            this.A0E = 0L;
            this.A05 = 0;
        }
        this.A0f.A05();
    }

    @Override // X.K0P
    public void A0N() {
        try {
            super.A0N();
        } finally {
            PlaceholderSurface placeholderSurface = this.A0H;
            if (placeholderSurface != null) {
                if (this.A0F == placeholderSurface) {
                    this.A0F = null;
                }
                placeholderSurface.release();
                this.A0H = null;
            }
        }
    }

    @Override // X.K0P
    public void A0O() {
        this.A0K = null;
        A06(this);
        this.A0Q = false;
        this.A0G = null;
        this.A02 = 0;
        this.A03 = 0;
        try {
            super.A0O();
        } finally {
            JQy.A1K(super.A0F, this.A0g);
        }
    }

    @Override // X.K0P
    public void A0P(long j, boolean z) {
        super.A0P(j, z);
        A06(this);
        6WN r0 = this.A0f;
        r0.A02 = 0L;
        long j2 = -1;
        r0.A03 = j2;
        r0.A04 = j2;
        this.A02 = 0;
        this.A03 = 0;
        long j3 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0Y = 0;
        if (z) {
            long j4 = this.A0c;
            j3 = JQy.A0K((j4 > 0L ? 1 : (j4 == 0L ? 0 : -1)), j4);
        }
        this.A09 = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r301.A0Z != 0) goto L6;
     */
    @Override // X.K0P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Q(boolean r302, boolean r303) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            super.A0Q(r1, r2)
            r0 = r301
            X.6Y8 r0 = r0.A03
            r304 = r0
            r0 = r304
            java.lang.Class r0 = r0.getClass()
            r0 = r304
            boolean r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2b
            r0 = r301
            int r0 = r0.A0Z
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L2e
        L2b:
            r0 = 1
            r307 = r0
        L2e:
            r0 = r307
            X.6DP.A04(r0)
            r0 = r301
            boolean r0 = r0.A0X
            r307 = r0
            r0 = r307
            r1 = r305
            if (r0 == r1) goto L4a
            r0 = r301
            r1 = r305
            r0.A0X = r1
            r0 = r301
            r0.A0W()
        L4a:
            r0 = r301
            X.6WT r0 = r0.A0g
            r308 = r0
            r0 = r301
            X.6VN r0 = r0.A0F
            r309 = r0
            r0 = r308
            android.os.Handler r0 = r0.A00
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L75
            X.6pZ r0 = new X.6pZ
            r304 = r0
            r0 = r304
            r1 = r309
            r2 = r308
            r0.<init>(r1, r2)
            r0 = r310
            r1 = r304
            boolean r0 = r0.post(r1)
        L75:
            r0 = r301
            r1 = r303
            r0.A0U = r1
            r0 = r301
            r1 = 0
            r0.A0V = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0b.A0Q(boolean, boolean):void");
    }

    @Override // X.K0P
    public Krr A0T(6Yl r302, 6Yl r303, C6b1 c6b1) {
        int i;
        String str;
        int i2;
        if (A0i(super.A0D) && r302.A0W.equals(r303.A0W) && r302.A0F == r303.A0F) {
            str = c6b1.A03;
            i2 = 3;
            i = 0;
        } else {
            Krr A05 = c6b1.A05(r302, r303);
            i = A05.A00;
            int i3 = r303.A0L;
            KjX kjX = this.A0a;
            if (i3 > kjX.A02 || r303.A0A > kjX.A00) {
                i |= 256;
            }
            if (A02(r303, c6b1) > this.A0a.A01) {
                i |= 64;
            }
            str = c6b1.A03;
            i2 = i != 0 ? 0 : A05.A01;
        }
        return new Krr(r302, r303, str, i2, i);
    }

    @Override // X.K0P
    public Krr A0U(6WB r302) {
        Krr A0U = super.A0U(r302);
        this.A0g.A02(r302.A00, A0U);
        return A0U;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x032f, code lost:
    
        if (r0.isFeatureSupported("low-latency") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0451, code lost:
    
        if (r335.A0A == (-1)) goto L93;
     */
    @Override // X.K0P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Kl8 A0V(android.media.MediaCrypto r302, X.6Yl r303, X.C6b1 r304, float r305) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0b.A0V(android.media.MediaCrypto, X.6Yl, X.6b1, float):X.Kl8");
    }

    @Override // X.K0P
    public void A0Z() {
        super.A0Z();
        this.A00 = 0;
    }

    @Override // X.K0P
    public void A0b(long j) {
        super.A0b(j);
        if (this.A0X) {
            return;
        }
        this.A00--;
    }

    @Override // X.K0P
    public void A0e(6WD r302) {
        if (this.A0b) {
            ByteBuffer byteBuffer = r302.A03;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        6bI r0 = super.A0J;
                        Bundle A05 = 1BK.A05();
                        A05.putByteArray("hdr10-plus-info", bArr);
                        r0.CsH(A05);
                    }
                }
            }
        }
    }

    @Override // X.K0P
    public void A0f(6WD r302) {
        if (this.A0X) {
            return;
        }
        this.A00++;
    }

    @Override // X.K0P
    public void A0g(Kl8 kl8, String str, long j, long j2) {
        6WT r0 = this.A0g;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new Lqk(r0, str, j, j2));
        }
        this.A0N = A0D(str);
        C6b1 c6b1 = super.A0K;
        c6b1.getClass();
        this.A0b = c6b1.A06();
        int i = Util.A00;
        if (this.A0X) {
            6bI r02 = super.A0J;
            r02.getClass();
            this.A0G = new LG7(r02, this);
        }
        if (this.A0h) {
            Context context = this.A0e.A05.A0d;
            if (i >= 29) {
                context.getApplicationContext().getApplicationInfo();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x025b, code lost:
    
        if (r303 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x024f, code lost:
    
        if (r0 == 2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012e, code lost:
    
        if (r303 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
    
        if (BVE() == false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [android.view.Surface] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BME(int r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0b.BME(int, java.lang.Object):void");
    }

    public boolean BSB() {
        return super.A0a;
    }

    @Override // X.K0P
    public boolean BVE() {
        PlaceholderSurface placeholderSurface;
        PlaceholderSurface placeholderSurface2;
        if (super.BVE() && !this.A0W && (((placeholderSurface2 = this.A0H) == null || this.A0F != placeholderSurface2) && super.A0J != null && !this.A0X)) {
            ((6W7) this).A0A = 0S2.A0Y;
        }
        if (super.BVE() && (this.A0W || (((placeholderSurface = this.A0H) != null && this.A0F == placeholderSurface) || super.A0J == null || this.A0X))) {
            this.A09 = -9223372036854775807L;
        } else {
            long j = this.A09;
            if (j == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= j) {
                this.A09 = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // X.K0P
    public void CfO(long j, long j2) {
        super.CfO(j, j2);
    }

    @Override // X.K0P
    public void Csp(float f, float f2) {
        super.Csp(f, f2);
        6WN r0 = this.A0f;
        r0.A00 = f;
        r0.A02 = 0L;
        long j = -1;
        r0.A03 = j;
        r0.A04 = j;
        6WN.A02(r0, false);
    }
}
