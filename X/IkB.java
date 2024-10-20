package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Process;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: IkB.class */
public final class IkB implements JNA {
    public int A00;
    public long A01;
    public Hqj A02;
    public I8v A03;
    public Hpy A04;
    public HFO A05;
    public J7e A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final Context A0F;
    public final JO9 A0G;
    public final I51 A0H;
    public final JGy A0I;
    public final JKb A0J;
    public final Hkg A0K;
    public final JJJ A0L;
    public final JH6 A0M;
    public final ExecutorService A0N;
    public volatile long A0O;
    public volatile JNX A0P;
    public volatile JN9 A0Q;
    public volatile Future A0R;
    public volatile boolean A0S;
    public volatile boolean A0T;
    public volatile boolean A0U;

    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.concurrent.locks.ReentrantLock, X.J7e] */
    public IkB(Context context, JO9 jo9, I51 i51, JGy jGy, JKb jKb, Hkg hkg, JJJ jjj, JH6 jh6, ExecutorService executorService, boolean z) {
        this.A0F = context;
        this.A0N = executorService;
        this.A0K = hkg;
        this.A0M = jh6;
        this.A0I = jGy;
        this.A0G = jo9;
        this.A0J = jKb;
        this.A0H = i51;
        this.A0L = jjj;
        this.A0C = z;
        this.A0E = (int) TimeUnit.MILLISECONDS.toMicros(z ? 10 : 250L);
        I9e i9e = hkg.A0A;
        this.A07 = i9e.A0y();
        this.A08 = i9e.A0z();
        boolean A14 = i9e.A14();
        ?? reentrantLock = new ReentrantLock();
        reentrantLock.mEnableThreadLockSync = A14;
        this.A06 = reentrantLock;
        this.A09 = i9e.A13();
        this.A01 = i9e.A0n();
        this.A03 = hkg.A06;
    }

    private long A00(long j) {
        HFO hfo = this.A05;
        if (hfo != null && j >= 0) {
            if (!hfo.A04) {
                hfo.A00 = hfo.A03.A00(TimeUnit.MICROSECONDS, j);
                hfo.A04 = true;
            }
            hfo.A01 = ((float) hfo.A01) + (((float) (j - hfo.A02)) / hfo.A00);
            hfo.A00 = hfo.A03.A00(TimeUnit.MICROSECONDS, j);
            hfo.A02 = j;
            j = hfo.A01;
        }
        return j;
    }

    private Hpy A01() {
        Hkg hkg = this.A0K;
        I9d i9d = hkg.A08;
        if (i9d == null) {
            return null;
        }
        Hpy hpy = new Hpy(i9d, hkg.A0A.A1d());
        HAy hAy = HAy.A03;
        int i = this.A00;
        hpy.A00 = hAy;
        Huc A04 = hpy.A04.A04(hAy, i);
        hpy.A01 = A04;
        if (A04 == null) {
            throw AnonymousClass001.A0L("Requested Track is not available");
        }
        Iterator A1D = GOp.A1D(A04.A06);
        hpy.A03 = A1D;
        hpy.A02 = (A1D == null || !A1D.hasNext()) ? null : (JLS) hpy.A03.next();
        return hpy;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.HFO, java.lang.Object] */
    private HFO A02() {
        Hkg hkg = this.A0K;
        I9d i9d = hkg.A08;
        if (i9d == null) {
            return null;
        }
        Htt htt = new Htt(i9d, hkg.A0A.A1d());
        htt.A01(HAy.A03, this.A00);
        ?? obj = new Object();
        ((HFO) obj).A04 = false;
        ((HFO) obj).A00 = 1.0f;
        ((HFO) obj).A02 = 0L;
        ((HFO) obj).A01 = 0L;
        ((HFO) obj).A03 = htt;
        return obj;
    }

    public static final String A03() {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator A0x = AnonymousClass001.A0x(0rQ.A05);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append(0DY.A0K(AnonymousClass001.A0j(A0z), 10));
            A0k2.append('=');
            A0k2.append(AnonymousClass001.A03(A0z.getValue()));
            A0k2.append('|');
            1BK.A1R(A0k, A0k2);
        }
        return 11T.A02(A0k);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IkB.A04():void");
    }

    private void A05() {
        if (this.A0C || this.A0D) {
            return;
        }
        I6I.A02("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not started", AnonymousClass001.A1Z());
        throw new Exception("VideoDemuxDecodeWrapper not started");
    }

    private void A06(MediaFormat mediaFormat) {
        int i;
        int i2;
        I8v i8v = this.A03;
        if (i8v == null || this.A02 == null || !this.A0K.A0A.A12()) {
            return;
        }
        Hqj hqj = this.A02;
        boolean A1N = AnonymousClass001.A1N(hqj.A04 % 180);
        int i3 = hqj.A05;
        int i4 = hqj.A03;
        if (i4 <= -1 || i3 <= -1) {
            return;
        }
        int i5 = i3;
        int i6 = i4;
        if (A1N) {
            i5 = i4;
            i6 = i3;
        }
        if (i8v.A0B % 180 != 0) {
            i = i8v.A0A;
            i2 = i8v.A0C;
        } else {
            i = i8v.A0C;
            i2 = i8v.A0A;
        }
        int i7 = i3 * i4;
        int i8 = i * i2;
        if (i7 >= i8) {
            i5 = i;
        }
        if (i7 >= i8) {
            i6 = i2;
        }
        int i9 = i5;
        if (A1N) {
            i9 = i6;
        }
        mediaFormat.setInteger(Property.ICON_TEXT_FIT_WIDTH, i9);
        if (!A1N) {
            i5 = i6;
        }
        mediaFormat.setInteger(Property.ICON_TEXT_FIT_HEIGHT, i5);
    }

    private void A07(MediaFormat mediaFormat, JN9 jn9, int i, boolean z, boolean z2) {
        long j;
        Hqj hqj;
        if (jn9 != null && mediaFormat != null) {
            Exception e = null;
            ArrayList A0s = AnonymousClass001.A0s();
            if (z2) {
                I8v i8v = this.A03;
                if (i8v != null && (hqj = this.A02) != null) {
                    I9e i9e = this.A0K.A0A;
                    if (i9e.A0G()) {
                        boolean A1N = AnonymousClass001.A1N(hqj.A04 % 180);
                        int i2 = hqj.A05;
                        int i3 = hqj.A03;
                        int A0A = i9e.A0A();
                        int A09 = i9e.A09();
                        if (i3 > -1 && i2 > -1 && A0A > -1 && A09 > -1) {
                            int i4 = A09;
                            if (i8v.A0B % 180 == 0) {
                                i4 = A0A;
                                A0A = A09;
                            }
                            if (i4 * A0A < i2 * i3) {
                                int i5 = i4;
                                if (A1N) {
                                    i5 = A0A;
                                }
                                mediaFormat.setInteger(Property.ICON_TEXT_FIT_WIDTH, i5);
                                int i6 = A0A;
                                if (A1N) {
                                    i6 = i4;
                                }
                                mediaFormat.setInteger(Property.ICON_TEXT_FIT_HEIGHT, i6);
                                i8v.A0C = i4;
                                i8v.A0A = A0A;
                            }
                        }
                    }
                }
            } else {
                A06(mediaFormat);
            }
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 >= 4) {
                    break;
                }
                try {
                    jn9.CYo(mediaFormat, this.A0K.A0A, A0s, i, z);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    if (!(e instanceof IllegalStateException)) {
                        break;
                    }
                    if (e.getMessage() != null && e.getMessage().startsWith("codec name:")) {
                        A0s.add(e.getMessage().substring(11));
                    } else if (!this.A0K.A0A.A1M()) {
                        break;
                    }
                    i7 = i8 + 1;
                    String A02 = e instanceof MediaCodec.CodecException ? IFX.A02((MediaCodec.CodecException) e) : "null";
                    ActivityManager activityManager = (ActivityManager) this.A0F.getSystemService("activity");
                    if (activityManager != null) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        activityManager.getMemoryInfo(memoryInfo);
                        j = memoryInfo.availMem;
                    } else {
                        j = -1;
                    }
                    long j2 = 0rQ.A03;
                    long j3 = 0rQ.A02;
                    long j4 = 0rQ.A04;
                    long j5 = 0rQ.A01;
                    I6I.A02("VideoDemuxDecodeWrapperTag", "prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, availMem=%s, successCreateCodecs=%d, requestReleaseCodecs=%d, successReleaseCodecs=%d, failedReleaseCodecs=%d, badThreads=%s, mediaCodecException=%s, Exception=%s", mediaFormat, Integer.valueOf(i8), Arrays.toString(A0s.toArray()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), A03(), A02, e);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("media format:");
                    A0k.append(mediaFormat);
                    A0k.append(", number of retries:");
                    A0k.append(i8);
                    A0k.append(", avail mem:");
                    A0k.append(j);
                    A0k.append(", successCreateCodecs:");
                    A0k.append(j2);
                    A0k.append(", requestReleaseCodecs:");
                    A0k.append(j3);
                    A0k.append(", successReleaseCodecs:");
                    A0k.append(j4);
                    A0k.append(", failedReleaseCodecs:");
                    A0k.append(j5);
                    A0k.append(", badThreads:");
                    A0k.append(A03());
                    A0k.append(", blacklisted decoders:");
                    A0k.append(Arrays.toString(A0s.toArray()));
                    throw new IllegalStateException(1BL.A0u(" mediaCodecException: ", A02, A0k), e);
                }
            }
        }
        throw AnonymousClass001.A0Q("videoDecoder or mediaFormat is null");
    }

    public void AHI(int i) {
        Hqj hqj;
        int i2;
        int i3;
        I6I.A02("VideoDemuxDecodeWrapperTag", "configure", new Object[0]);
        this.A00 = i;
        JGy jGy = this.A0I;
        JO9 jo9 = this.A0G;
        JKb jKb = this.A0J;
        Hkg hkg = this.A0K;
        I9e i9e = hkg.A0A;
        this.A0P = jGy.AIg(jo9, jKb, i9e);
        this.A0Q = this.A0L.AJT();
        Hw1.A01(this.A0P, hkg);
        this.A0P.CkM(HAy.A03, i);
        if (!IFS.A0A(hkg)) {
            Hqj AwH = this.A0P.AwH();
            this.A02 = AwH;
            I8v i8v = hkg.A06;
            i8v.A08 = AwH.A05;
            i8v.A06 = AwH.A03;
            i8v.A07 = AwH.A04;
        }
        if (i9e.A1K()) {
            try {
                A07(this.A0P.B8a(), this.A0Q, i, false, false);
            } catch (Throwable th) {
                th = th;
                if (i9e.A0t() && (hqj = this.A02) != null) {
                    boolean A1N = AnonymousClass001.A1N(hqj.A04 % 180);
                    int i4 = hqj.A05;
                    int i5 = hqj.A03;
                    try {
                        i2 = hqj.A02;
                    } catch (Exception unused) {
                    }
                    if (i2 != 6 && i2 != 7) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            MediaFormat B8a = this.A0P.B8a();
                            B8a.getClass();
                            i3 = (int) B8a.getFloat("frame-rate", 0.0f);
                        } else {
                            i3 = 0;
                        }
                        float f = 0.0f / 0.0f;
                        if (i5 > -1 && i4 > -1 && i3 > 0) {
                            if (A1N) {
                                i4 = i5;
                            }
                            if (i4 <= i9e.A0m() && i3 <= i9e.A0l()) {
                                if (i9e.A1R()) {
                                    A07(this.A0P.B8a(), this.A0Q, i, true, false);
                                }
                                throw th;
                            }
                        }
                    }
                }
                if (i9e.A0G()) {
                    A07(this.A0P.B8a(), this.A0Q, i, false, true);
                }
                throw th;
            }
            this.A05 = A02();
            this.A04 = A01();
            I51 i51 = this.A0H;
            i51.A0H = this.A0Q.Agm();
            i51.A0G = this.A0Q.Agk();
            this.A0A = true;
            I6I.A02("VideoDemuxDecodeWrapperTag", "configure: mIsConfigured done", new Object[0]);
        }
        JN9 jn9 = this.A0Q;
        MediaFormat B8a2 = this.A0P.B8a();
        if (jn9 != null && B8a2 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            A06(B8a2);
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                if (i6 >= 4) {
                    break;
                }
                try {
                    jn9.CYo(B8a2, i9e, A0s, i, false);
                    break;
                } catch (Throwable th2) {
                    if (!(th2 instanceof IllegalStateException) || i7 > 4) {
                        break;
                    }
                    if (th2.getMessage() != null && th2.getMessage().startsWith("codec name:")) {
                        A0s.add(th2.getMessage().substring(11));
                    } else if (!i9e.A1M()) {
                        break;
                    }
                    i6 = i7;
                    String A02 = th2 instanceof MediaCodec.CodecException ? IFX.A02(th2) : "null";
                    I6I.A02("VideoDemuxDecodeWrapperTag", "prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, mediaCodecException=%s, Exception=%s", B8a2, Integer.valueOf(i7), Arrays.toString(A0s.toArray()), A02, th2);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("media format:");
                    A0k.append(B8a2);
                    A0k.append(", number of retries:");
                    A0k.append(i7);
                    A0k.append(", blacklisted decoders:");
                    A0k.append(Arrays.toString(A0s.toArray()));
                    th = new IllegalStateException(1BL.A0u(" mediaCodecException: ", A02, A0k), th2);
                    throw th;
                }
            }
        }
        this.A05 = A02();
        this.A04 = A01();
        I51 i512 = this.A0H;
        i512.A0H = this.A0Q.Agm();
        i512.A0G = this.A0Q.Agk();
        this.A0A = true;
        I6I.A02("VideoDemuxDecodeWrapperTag", "configure: mIsConfigured done", new Object[0]);
    }

    public long ALy() {
        HvA.A01("VideoDemuxDecodeWrapper.decodeFrameAndAdvance");
        A05();
        this.A0B = false;
        long j = this.A0O;
        try {
            JN9 jn9 = this.A0Q;
            long j2 = this.A0E;
            long AM0 = jn9.AM0(j2) + j;
            while (AM0 < 0 && !this.A0Q.BWq() && !this.A0S) {
                HvA.A01("VideoDemuxDecodeWrapper.decodeFrameAndAdvanceLoop");
                AM0 = this.A0O + this.A0Q.AM0(j2);
                HvA.A00();
            }
            if (this.A0R.isDone() && !this.A0T) {
                this.A0R.get();
                this.A0T = true;
            }
            if (this.A0Q.BWq() && !this.A0T) {
                if (this.A08) {
                    I6I.A02("VideoDemuxDecodeWrapperTag", "decodeFrameAndAdvance mEnableCancelDecoderExtractFuture", new Object[0]);
                    A04();
                } else {
                    this.A0R.get();
                }
            }
            long A00 = A00(AM0);
            HvA.A00();
            return A00;
        } catch (IllegalStateException e) {
            throw new IllegalStateException(AnonymousClass001.A0h(AnonymousClass001.A0n("Previous Enqueue Buffer: "), j), e);
        }
    }

    public void ALz(long j) {
        A05();
        while (Agj() <= j && !this.A0Q.BWq() && !this.A0S) {
            ALy();
        }
    }

    public long Agj() {
        Huc huc;
        long Agj = this.A0Q.Agj() + this.A0O;
        Hpy hpy = this.A04;
        return (hpy == null || (huc = hpy.A01) == null || 1BK.A17(huc.A06).isEmpty()) ? A00(Agj) : this.A04.A00(Agj, TimeUnit.MICROSECONDS);
    }

    public Hts Aw5() {
        return this.A0P.Aw5();
    }

    public boolean BRd() {
        return this.A0Q.BWq();
    }

    public void CkA(long j) {
        float f;
        long j2;
        Huc huc;
        I6I.A02("VideoDemuxDecodeWrapperTag", "seekTo: ptsUs=%s", Long.valueOf(j));
        if (!this.A0A) {
            I6I.A02("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", new Object[0]);
            throw new Exception("VideoDemuxDecodeWrapper not configured");
        }
        boolean z = this.A0C;
        if (!z && this.A0D) {
            I6I.A02("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper has already started", new Object[0]);
            throw new Exception("VideoDemuxDecodeWrapper has already started");
        }
        Hpy hpy = this.A04;
        if (hpy == null || (huc = hpy.A01) == null || 1BK.A17(huc.A06).isEmpty()) {
            float f2 = (float) j;
            Hkg hkg = this.A0K;
            I9d i9d = hkg.A08;
            if (i9d != null) {
                Htt htt = new Htt(i9d, hkg.A0A.A1d());
                htt.A01(HAy.A03, this.A00);
                f = htt.A00(TimeUnit.MICROSECONDS, j);
            } else {
                f = 1.0f;
            }
            j2 = f2 * f;
        } else {
            Hpy A01 = A01();
            this.A04 = A01;
            j2 = A01.A00(j, TimeUnit.MICROSECONDS);
        }
        long j3 = 0;
        if (!z) {
            if (j2 >= 0) {
                this.A0P.CkA(j2);
            }
        } else {
            if (this.A0B && j2 == 0) {
                return;
            }
            this.A0B = false;
            I6I.A02("VideoDemuxDecodeWrapperTag", "seekTo mIsRealtime", new Object[0]);
            A04();
            this.A0Q.flush();
            this.A0P.CkA(j2);
            if (this.A0P.B8b() > 0) {
                j3 = this.A0P.B8b();
            }
            this.A0O = j3;
            this.A05 = A02();
            start();
        }
    }

    public void D8I(I9V i9v) {
        I6I.A02("VideoDemuxDecodeWrapperTag", "updateTrim", new Object[0]);
        A04();
        this.A0P.D8L(i9v);
        this.A0B = false;
    }

    public void DAG() {
        HvA.A01("VideoDemuxDecodeWrapper.warmup");
        A05();
        while (this.A0Q.Agj() + this.A0O < 0 && !this.A0Q.BWq() && !this.A0S) {
            this.A0Q.AM0(this.A0E);
        }
        this.A0B = true;
        HvA.A00();
    }

    public void cancel() {
        I6I.A02("VideoDemuxDecodeWrapperTag", "cancel", AnonymousClass001.A1Z());
        this.A0S = true;
        A04();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.I3R] */
    public void release() {
        I6I.A02("VideoDemuxDecodeWrapperTag", "release", AnonymousClass001.A1Z());
        if (this.A07) {
            cancel();
        }
        ?? obj = new Object();
        new H3f((I3R) obj, this.A0P).A00();
        JN9 jn9 = this.A0Q;
        if (jn9 != null) {
            try {
                jn9.finish();
            } catch (Throwable th) {
                I3R.A00((I3R) obj, th);
            }
        }
        obj.A02();
    }

    public void start() {
        if (!this.A0A) {
            I6I.A02("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", AnonymousClass001.A1Z());
            throw new Exception("VideoDemuxDecodeWrapper not configured");
        }
        int threadPriority = Process.getThreadPriority(Process.myTid());
        I6I.A02("VideoDemuxDecodeWrapperTag", "start", new Object[0]);
        this.A0U = false;
        this.A0R = this.A0N.submit(new J4z(threadPriority, 12, this));
        this.A0D = true;
    }
}
