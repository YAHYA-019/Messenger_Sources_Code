package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.webrtc.legacy.MediaCodecVideoDecoder;

/* loaded from: K0a.class */
public class K0a extends C6ax {
    public static boolean A0n;
    public static boolean A0o;
    public static final int[] A0p = {1920, 1600, 1440, 1280, 960, 854, HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT, 540, 480};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public Surface A0B;
    public LG6 A0C;
    public PlaceholderSurface A0D;
    public 6Yr A0E;
    public 6WV A0F;
    public 6WV A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public long A0V;
    public long A0W;
    public long A0X;
    public MFi A0Y;
    public KjW A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final long A0d;
    public final Context A0e;
    public final 6WN A0f;
    public final 6WT A0g;
    public final boolean A0h;
    public final int A0i;
    public final Kqm A0j;
    public final 6WK A0k;
    public final boolean A0l;
    public final boolean A0m;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0121, code lost:
    
        if (com.google.android.exoplayer2.util.Util.A04.startsWith("Pixel ") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public K0a(android.content.Context r302, android.os.Handler r303, X.MFi r304, X.6W4 r305, X.6Vz r306, X.MFv r307, X.6W2 r308, X.6Vr r309, java.lang.Object r310, int r311, int r312, int r313, long r314, boolean r316) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.<init>(android.content.Context, android.os.Handler, X.MFi, X.6W4, X.6Vz, X.MFv, X.6W2, X.6Vr, java.lang.Object, int, int, int, long, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x02dd, code lost:
    
        if (r324 != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.content.Context r301, X.MFi r302, X.6Yl r303, X.6W2 r304, boolean r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.A00(android.content.Context, X.MFi, X.6Yl, X.6W2, boolean, boolean):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0198, code lost:
    
        if (X.5N4.A02(X.5N3.A0M) != false) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x007b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(X.6Yl r301, X.C6b1 r302) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.A01(X.6Yl, X.6b1):int");
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
        if ("video/dolby-vision".equals(str) && !A0D(context)) {
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

    private void A04() {
        6bI r0;
        this.A0R = false;
        if (!this.A0c || (r0 = super.A0J) == null) {
            return;
        }
        this.A0C = new LG6(r0, this);
    }

    private void A05(int i, int i2) {
        6VN r0 = super.A0F;
        r0.A05 += i;
        int i3 = i + i2;
        r0.A04 += i3;
        this.A01 += i3;
        int i4 = this.A0S + i3;
        this.A0S = i4;
        r0.A07 = Math.max(i4, r0.A07);
    }

    private void A06(long j) {
        6VN r0 = super.A0F;
        r0.A0F += j;
        r0.A0D++;
        this.A0A += j;
        this.A04++;
    }

    public static void A07(MFi mFi, 6Yl r302, 6W2 r303, List list, int i, boolean z) {
        try {
            int A01 = 6W5.A01(r302, r303, z);
            if (A01 != (i & 63)) {
                List<C6b1> Agl = r303.Agl(r302.A0W, AnonymousClass001.A1T(r302.A0O), false);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("MCR1 returned 0b");
                A0k.append(Integer.toBinaryString(A01));
                A0k.append(" and MCR2 returned 0b");
                A0k.append(Integer.toBinaryString(i));
                JR0.A1D(r302, " for ", "\nMCR2 Codecs: \n", A0k);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6b1 c6b1 = (C6b1) it.next();
                    A0k.append("\t");
                    A0k.append(c6b1.A03);
                    A0k.append("\n");
                }
                A0k.append("MCR1 Codecs: \n");
                for (C6b1 c6b12 : Agl) {
                    A0k.append("\t");
                    A0k.append(c6b12.A03);
                    A0k.append("\n");
                }
                String obj = A0k.toString();
                5My.A04("MediaCodecVideoRenderer2", obj);
                if (mFi != null) {
                    mFi.Bbw(obj);
                }
            }
        } catch (C7ho e) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            JR0.A1D(e, "MCR1 threw an exception", " and MCR2 returned 0b", A0k2);
            A0k2.append(Integer.toBinaryString(i));
            JR0.A1D(r302, " for ", "\nMCR2 Codecs: \n", A0k2);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C6b1 c6b13 = (C6b1) it2.next();
                A0k2.append("\t");
                A0k2.append(c6b13.A03);
                A0k2.append("\n");
            }
            String obj2 = A0k2.toString();
            5My.A04("MediaCodecVideoRenderer2", obj2);
            if (mFi != null) {
                mFi.Bbw(obj2);
            }
        }
    }

    private void A08(6bI r302, int i) {
        5LG.A01("skipVideoBuffer");
        r302.Ccr(i, false);
        5LG.A00();
        super.A0F.A0B++;
    }

    private void A09(6bI r302, int i, long j) {
        5LG.A01("releaseOutputBuffer");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r302.Ccq(i, j);
        super.A09 += JQx.A0O(elapsedRealtime);
        5LG.A00();
        super.A0F.A09++;
        this.A0S = 0;
        this.A08 = SystemClock.elapsedRealtime() * 1000;
        6WV r0 = this.A0F;
        if (!r0.equals(6WV.A04) && !r0.equals(this.A0G)) {
            this.A0G = r0;
            this.A0g.A04(r0);
        }
        this.A0Q = true;
        if (!this.A0R) {
            this.A0R = true;
            this.A0g.A05(this.A0B);
            this.A0L = true;
        }
        6VN r02 = super.A0F;
        long j2 = super.A09;
        int i2 = r02.A09;
        r02.A01 = i2 == 0 ? -1 : (int) (j2 / i2);
    }

    public static void A0B(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6b1 c6b1 = (C6b1) it.next();
            sb.append("\t");
            sb.append(c6b1.A03);
            sb.append(":");
            sb.append(c6b1.A07 ? "sw" : "hw");
            sb.append(":");
            sb.append(c6b1.A05 ? "hwAcc" : "noHwAcc");
            sb.append(":");
            sb.append(c6b1.A04 ? "seamless" : "noSeamless");
            sb.append(":");
            sb.append(c6b1.A06 ? "secure" : "noSecure");
            sb.append("\n");
        }
    }

    private boolean A0C() {
        int i = this.A0i;
        boolean z = false;
        if (i > 0) {
            long j = this.A0V;
            if (j == -9223372036854775807L || System.currentTimeMillis() - j <= i) {
                z = true;
            }
            if (j == -9223372036854775807L) {
                5My.A04("MediaCodecVideoRenderer2", "Render output failed");
                this.A0V = System.currentTimeMillis();
            }
        }
        return z;
    }

    public static boolean A0D(Context context) {
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

    private boolean A0E(C6b1 c6b1) {
        if (!this.A0O || this.A0c || A0F(c6b1.A03)) {
            return false;
        }
        return !c6b1.A06 || PlaceholderSurface.A01();
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
    public static boolean A0F(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.A0F(java.lang.String):boolean");
    }

    public void A0L() {
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A05 = SystemClock.elapsedRealtime();
        this.A08 = SystemClock.elapsedRealtime() * 1000;
        this.A0A = 0L;
        this.A04 = 0;
        if (!this.A0h || this.A0m) {
            this.A0f.A04();
        }
    }

    public void A0M() {
        this.A07 = -9223372036854775807L;
        int i = this.A01;
        if (i > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A0g.A00(i, elapsedRealtime - this.A05);
            this.A01 = 0;
            this.A05 = elapsedRealtime;
        }
        int i2 = this.A04;
        if (i2 != 0) {
            6WT r0 = this.A0g;
            long j = this.A0A;
            Handler handler = r0.A00;
            if (handler != null) {
                handler.post(new Lpx(r0, i2, j));
            }
            this.A0A = 0L;
            this.A04 = 0;
        }
        if (!this.A0h || this.A0m) {
            this.A0f.A05();
        }
    }

    @Override // X.C6ax
    public void A0N() {
        try {
            super.A0N();
        } finally {
            PlaceholderSurface placeholderSurface = this.A0D;
            if (placeholderSurface != null) {
                if (this.A0B == placeholderSurface) {
                    this.A0B = null;
                }
                placeholderSurface.release();
                this.A0D = null;
            }
        }
    }

    @Override // X.C6ax
    public void A0O() {
        this.A0G = null;
        A04();
        if (this.A0h) {
            6WK r0 = this.A0k;
            if (r0.A09 != null) {
                DisplayManager.DisplayListener displayListener = r0.A0A;
                if (displayListener != null) {
                    ((6WL) displayListener).A00.unregisterDisplayListener(displayListener);
                }
                r0.A0B.A02.sendEmptyMessage(2);
            }
        }
        this.A0L = false;
        this.A0C = null;
        this.A02 = 0;
        this.A03 = 0;
        try {
            super.A0O();
        } finally {
            JQy.A1K(super.A0F, this.A0g);
        }
    }

    @Override // X.C6ax
    public void A0P(long j, boolean z) {
        super.A0P(j, z);
        A04();
        if (!this.A0h) {
            6WN r0 = this.A0f;
            r0.A02 = 0L;
            long j2 = -1;
            r0.A03 = j2;
            r0.A04 = j2;
        }
        this.A02 = 0;
        this.A03 = 0;
        long j3 = -9223372036854775807L;
        this.A0W = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A0S = 0;
        if (z) {
            long j4 = this.A0d;
            j3 = JQy.A0K((j4 > 0L ? 1 : (j4 == 0L ? 0 : -1)), j4);
        }
        this.A07 = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r301.A0U != 0) goto L6;
     */
    @Override // X.C6ax
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
            int r0 = r0.A0U
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
            boolean r0 = r0.A0c
            r307 = r0
            r0 = r307
            r1 = r305
            if (r0 == r1) goto L4a
            r0 = r301
            r1 = r305
            r0.A0c = r1
            r0 = r301
            r0.A0a()
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
            boolean r0 = r0.A0h
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L89
            r0 = r301
            X.6WK r0 = r0.A0k
            r304 = r0
            r0 = r304
            r0.A02()
        L89:
            r0 = r301
            r1 = r303
            r0.A0P = r1
            r0 = r301
            r1 = 0
            r0.A0Q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.A0Q(boolean, boolean):void");
    }

    @Override // X.C6ax
    public float A0S(6Yl r302, 6Yl[] r303, float f) {
        float f2 = -1.0f;
        for (6Yl r0 : r303) {
            float f3 = r0.A01;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        return f2 != -1.0f ? f2 * f : -1.0f;
    }

    @Override // X.C6ax
    public int A0T(6Yl r302, 6W2 r303) {
        if (A0s(r302)) {
            return 20;
        }
        return A00(this.A0e, this.A0Y, r302, r303, super.A0d, super.A0a);
    }

    @Override // X.C6ax
    public Krr A0U(6Yl r302, 6Yl r303, C6b1 c6b1) {
        int i;
        String str;
        int i2;
        if (A0s(super.A0D) && r302.A0W.equals(r303.A0W) && r302.A0F == r303.A0F) {
            str = c6b1.A03;
            i2 = 3;
            i = 0;
        } else {
            Krr A05 = c6b1.A05(r302, r303);
            i = A05.A00;
            int i3 = r303.A0L;
            KjW kjW = this.A0Z;
            if (i3 > kjW.A02 || r303.A0A > kjW.A00) {
                i |= 256;
            }
            if (A02(r303, c6b1) > this.A0Z.A01) {
                i |= 64;
            }
            str = c6b1.A03;
            i2 = i != 0 ? 0 : A05.A01;
        }
        return new Krr(r302, r303, str, i2, i);
    }

    @Override // X.C6ax
    public Krr A0V(6WB r302) {
        Krr A0V = super.A0V(r302);
        this.A0g.A02(r302.A00, A0V);
        return A0V;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x031f, code lost:
    
        if (r0.isFeatureSupported("low-latency") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0441, code lost:
    
        if (r335.A0A == (-1)) goto L91;
     */
    @Override // X.C6ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Kl8 A0W(android.media.MediaCrypto r302, X.6Yl r303, X.C6b1 r304, float r305) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.A0W(android.media.MediaCrypto, X.6Yl, X.6b1, float):X.Kl8");
    }

    @Override // X.C6ax
    public K0Y A0X(C6b1 c6b1, Throwable th) {
        return new K0X(this.A0B, c6b1, th);
    }

    @Override // X.C6ax
    public ArrayList A0Y(6Yl r302, 6W2 r303, boolean z) {
        ArrayList A03 = C6ay.A03(r302, A03(this.A0e, r302, r303, z, this.A0c));
        if (5N4.A02(5N3.A0f)) {
            String str = r302.A0W;
            List emptyList = str == null ? Collections.emptyList() : Collections.unmodifiableList(r303.Agl(str, z, false));
            if (emptyList.size() == A03.size()) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= emptyList.size()) {
                        break;
                    }
                    if (!((C6b1) emptyList.get(i2)).A03.equals(((C6b1) A03.get(i2)).A03)) {
                        break;
                    }
                    i = i2 + 1;
                }
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("MCR1 supported decoders differs from MCR2 supported decoders for ");
            A0k.append(r302);
            A0k.append("\nMCR1 Decoders:\n");
            A0B(A0k, emptyList);
            A0k.append("MCR2 Decoders:\n");
            A0B(A0k, A03);
            String obj = A0k.toString();
            5My.A04("MediaCodecVideoRenderer2", obj);
            MFi mFi = this.A0Y;
            if (mFi != null) {
                mFi.Bbw(obj);
            }
        }
        return A03;
    }

    @Override // X.C6ax
    public void A0Z() {
        A04();
    }

    @Override // X.C6ax
    public void A0c() {
        super.A0c();
        this.A00 = 0;
    }

    @Override // X.C6ax
    public void A0e(long j) {
        super.A0e(j);
        if (this.A0c) {
            return;
        }
        this.A00--;
    }

    @Override // X.C6ax
    public void A0g(MediaFormat mediaFormat, 6Yl r303) {
        int integer;
        int integer2;
        6bI r0 = super.A0J;
        if (r0 != null) {
            r0.CwO(this.A0T);
        }
        if (this.A0c) {
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
        this.A0F = new 6WV(f, integer, integer2, 0);
        this.A0f.A06(r303.A01);
    }

    @Override // X.C6ax
    public void A0h(6Yl r302) {
        int A00;
        if (A0s(r302) || ((A00 = 5N4.A00(5N5.A07)) > 0 && r302.A0L > A00)) {
            this.A0j.A02 = false;
        }
    }

    @Override // X.C6ax
    public void A0i(6Yl r302) {
        if (this.A0m) {
            this.A0j.A00(r302);
        }
    }

    @Override // X.C6ax
    public void A0j(6Yl r302, String str) {
        this.A0g.A06(str);
        this.A0j.A00(r302);
    }

    @Override // X.C6ax
    public void A0k(6WD r302) {
        if (this.A0a) {
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

    @Override // X.C6ax
    public void A0l(6WD r302) {
        if (this.A0c) {
            return;
        }
        this.A00++;
    }

    @Override // X.C6ax
    public void A0m(Kl8 kl8, String str, long j, long j2) {
        6WT r0 = this.A0g;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new Lqk(r0, str, j, j2));
        }
        this.A0I = A0F(str);
        C6b1 c6b1 = super.A0K;
        c6b1.getClass();
        this.A0a = c6b1.A06();
        int i = Util.A00;
        if (this.A0c) {
            6bI r02 = super.A0J;
            r02.getClass();
            this.A0C = new LG6(r02, this);
        }
        if (this.A0m) {
            Context context = this.A0j.A05.A0e;
            if (i >= 29) {
                context.getApplicationContext().getApplicationInfo();
            }
        }
    }

    @Override // X.C6ax
    public void A0n(Exception exc) {
        5My.A05("MediaCodecVideoRenderer2", "Video codec error", exc);
        6WT r0 = this.A0g;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new LoU(r0, exc));
        }
    }

    @Override // X.C6ax
    public void A0o(String str) {
        this.A0g.A06(str);
    }

    @Override // X.C6ax
    public void A0p(String str) {
        6WT r0 = this.A0g;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new LoS(r0, str));
        }
    }

    @Override // X.C6ax
    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r301.A09) >= 500) goto L6;
     */
    @Override // X.C6ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0r() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0b
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r303 = r0
            r0 = r301
            long r0 = r0.A09
            r305 = r0
            r0 = r303
            r1 = r305
            long r0 = r0 - r1
            r303 = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r307 = r0
            r0 = r303
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r302 = r0
            r0 = r309
            if (r0 < 0) goto L2c
        L2a:
            r0 = 0
            r302 = r0
        L2c:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.A0r():boolean");
    }

    @Override // X.C6ax
    public boolean A0t(6Yl r302, 6bI r303, ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2) {
        6VN r367;
        int i4;
        float f;
        int A0H;
        r303.getClass();
        6bI r0 = super.A0J;
        if (r0 != null && !this.A0J && r0.BGW() > 30) {
            6Yl r02 = super.A0D;
            if (r02 != null) {
                Pair B2T = r0.B2T();
                if (AnonymousClass001.A05(B2T.first) > 0) {
                    6VN r03 = super.A0F;
                    r03.A00(B2T);
                    this.A0g.A01(r02, r03.A00);
                }
            }
            this.A0J = true;
        }
        if (this.A06 == -9223372036854775807L) {
            this.A06 = j;
        }
        if (j3 != this.A0W) {
            this.A0f.A07(j3);
            this.A0W = j3;
        }
        long j4 = super.A0M.A01;
        long j5 = j3 - j4;
        if (!z || z2) {
            int i5 = ((6W7) this).A01;
            boolean A1Q = AnonymousClass001.A1Q(i5, 2);
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j6 = j3 - j;
            long j7 = (long) (j6 / super.A00);
            if (A1Q) {
                j7 -= elapsedRealtime - j2;
            }
            if (this.A0B == this.A0D) {
                double d = 0.0d / 0.0d;
                if (j7 >= -30000) {
                    return false;
                }
                A08(r303, i);
                A06(j7);
            } else {
                boolean A1Q2 = AnonymousClass001.A1Q(i5, 2);
                boolean z3 = this.A0Q ? !this.A0R : A1Q2 || this.A0P;
                long elapsedRealtime2 = (SystemClock.elapsedRealtime() * 1000) - this.A08;
                try {
                    if (this.A07 != -9223372036854775807L || j < j4 || (!z3 && (!A1Q2 || j7 >= -30000 || elapsedRealtime2 <= 100000))) {
                        if (!A1Q || j == this.A06) {
                            return false;
                        }
                        long nanoTime = System.nanoTime();
                        long j8 = nanoTime + (j7 * 1000);
                        long A01 = this.A0h ? this.A0k.A01(j3, j8) : this.A0f.A03(j8);
                        long j9 = (A01 - nanoTime) / 1000;
                        boolean A1N = AnonymousClass001.A1N((this.A07 > (-9223372036854775807L) ? 1 : (this.A07 == (-9223372036854775807L) ? 0 : -1)));
                        if (j9 < 4294467296L && !z2 && (A0H = A0H(j)) != 0) {
                            6VN r04 = super.A0F;
                            if (A1N) {
                                r04.A0A += A0H;
                                r04.A0B += this.A00;
                            } else {
                                r04.A06++;
                                A05(A0H, this.A00);
                            }
                            if (!C6ax.A0A(this)) {
                                return false;
                            }
                            A0d();
                            return false;
                        }
                        if (j9 < -30000 && !z2) {
                            if (A1N) {
                                A08(r303, i);
                            } else {
                                5LG.A01("dropVideoBuffer");
                                r303.Ccr(i, false);
                                5LG.A00();
                                A05(0, 1);
                            }
                            A06(j9);
                            return true;
                        }
                        if (j9 < 50000) {
                            if (A01 == this.A0X) {
                                A08(r303, i);
                            } else {
                                6Yr r05 = this.A0E;
                                if (r05 != null) {
                                    r05.CU0(super.A0A, r302, j5, A01);
                                }
                                A09(r303, i, A01);
                                this.A0V = -9223372036854775807L;
                            }
                            A06(j9);
                            this.A0X = A01;
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
                        int i7 = this.A02;
                        int i8 = i7 + this.A03;
                        if (i6 <= i8 + 1000) {
                            return false;
                        }
                        if (A0C <= i7 || A0C >= i8) {
                            if (A0C > i8) {
                                r367 = super.A0F;
                                i4 = r367.A0E;
                                f = A0C2;
                            }
                            this.A02 = A0C;
                            this.A03 = A0C2;
                            return false;
                        }
                        r367 = super.A0F;
                        i4 = r367.A0E;
                        f = i6 - i8;
                        r367.A0E = i4 + ((int) ((f * f3) / 1000.0d));
                        this.A02 = A0C;
                        this.A03 = A0C2;
                        return false;
                    }
                    long nanoTime2 = System.nanoTime();
                    6Yr r06 = this.A0E;
                    if (r06 != null) {
                        r06.CU0(super.A0A, r302, j5, nanoTime2);
                    }
                    A09(r303, i, nanoTime2);
                    A06(j7);
                } catch (IllegalStateException e) {
                    if (A0C()) {
                        return false;
                    }
                    throw e;
                }
            }
        } else {
            A08(r303, i);
        }
        this.A0V = -9223372036854775807L;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (A0E(r302) != false) goto L10;
     */
    @Override // X.C6ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0u(X.C6b1 r302) {
        /*
            r301 = this;
            r0 = r301
            android.view.Surface r0 = r0.A0B
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r301
            boolean r0 = r0.A0H
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L29
            r0 = r303
            boolean r0 = r0.isValid()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L29
        L1b:
            r0 = r301
            r1 = r302
            boolean r0 = r0.A0E(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L2b
        L29:
            r0 = 1
            r304 = r0
        L2b:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.A0u(X.6b1):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0266, code lost:
    
        if (r303 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025a, code lost:
    
        if (r0 == 2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012e, code lost:
    
        if (r303 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cc, code lost:
    
        if (BVE() == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126, types: [android.view.Surface] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BME(int r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0a.BME(int, java.lang.Object):void");
    }

    public boolean BSB() {
        return super.A0b;
    }

    @Override // X.C6ax
    public boolean BVE() {
        PlaceholderSurface placeholderSurface;
        PlaceholderSurface placeholderSurface2;
        if (super.BVE() && !this.A0R && (((placeholderSurface2 = this.A0D) == null || this.A0B != placeholderSurface2) && super.A0J != null && !this.A0c)) {
            ((6W7) this).A0A = 0S2.A0Y;
        }
        if (super.BVE() && (this.A0R || (((placeholderSurface = this.A0D) != null && this.A0B == placeholderSurface) || super.A0J == null || this.A0c))) {
            this.A07 = -9223372036854775807L;
        } else {
            long j = this.A07;
            if (j == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= j) {
                this.A07 = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // X.C6ax
    public void CfO(long j, long j2) {
        super.CfO(j, j2);
    }

    @Override // X.C6ax
    public void Csp(float f, float f2) {
        super.Csp(f, f2);
        if (this.A0h) {
            return;
        }
        6WN r0 = this.A0f;
        r0.A00 = f;
        r0.A02 = 0L;
        long j = -1;
        r0.A03 = j;
        r0.A04 = j;
        6WN.A02(r0, false);
    }

    public String getName() {
        return "MediaCodecVideoRenderer2";
    }
}
