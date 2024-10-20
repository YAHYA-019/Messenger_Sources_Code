package com.google.android.exoplayer2.audio;

import X.0Pz;
import X.1NS;
import X.1PP;
import X.4YV;
import X.5LX;
import X.5My;
import X.5N3;
import X.5N4;
import X.6DP;
import X.6Vm;
import X.6WZ;
import X.6Wa;
import X.6Wb;
import X.6Wc;
import X.6We;
import X.6Wf;
import X.6Wg;
import X.6Wh;
import X.6Wi;
import X.6Wk;
import X.6Wl;
import X.6Wm;
import X.6Wo;
import X.6Wp;
import X.6Wq;
import X.6Wt;
import X.6Wu;
import X.6Wv;
import X.6Ww;
import X.6Wz;
import X.6YT;
import X.6Yl;
import X.6bW;
import X.6bZ;
import X.AnonymousClass001;
import X.C7hq;
import X.C7hr;
import X.C7ow;
import X.KQi;
import X.KQj;
import X.Krc;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: DefaultAudioSink.class */
public final class DefaultAudioSink implements 6Wk {
    public static int A0o;
    public static ExecutorService A0p;
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public AudioTrack A05;
    public 6Vm A06;
    public 6YT A07;
    public 6Wz A08;
    public 6Wu A09;
    public C7ow A0A;
    public 6bW A0B;
    public 6Wv A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public 6Wa[] A0J;
    public ByteBuffer[] A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public 6Wt A0R;
    public 6bW A0S;
    public 6Wv A0T;
    public Krc A0U;
    public ByteBuffer A0V;
    public ByteBuffer A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final 6WZ A0b;
    public final 6Wc A0c;
    public final 6Wo A0d;
    public final 6Wl A0e;
    public final ArrayDeque A0f;
    public final boolean A0g;
    public final 6Wp A0h;
    public final 6Wi A0i;
    public final 6Ww A0j;
    public final 6Ww A0k;
    public final 6Wq A0l;
    public final 6Wa[] A0m;
    public final 6Wa[] A0n;
    public static final Object A0r = new Object();
    public static AtomicInteger A0q = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r0v49, types: [X.6Wu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, X.6Ww] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, X.6Ww] */
    public DefaultAudioSink(6WZ r302, 6Wc r303, 6Wi r304) {
        this.A0b = r302;
        this.A0c = r303;
        this.A0i = r304;
        6Wl r0 = new 6Wl(5LX.A00);
        this.A0e = r0;
        r0.A03();
        this.A0d = new 6Wo(new 6Wm(this));
        6We r02 = new 6We();
        this.A0h = r02;
        6We r03 = new 6Wq();
        this.A0l = r03;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new 6We(), r02, r03);
        Collections.addAll(arrayList, ((6Wb) r303).A02);
        this.A0n = (6Wa[]) arrayList.toArray(new 6Wa[0]);
        this.A0m = new 6Wa[]{new 6We()};
        this.A00 = 1.0f;
        this.A0R = 6Wt.A03;
        this.A01 = 0;
        this.A09 = new Object();
        6Vm r04 = 6Vm.A03;
        this.A0C = new 6Wv(r04, 0L, 0L, false);
        this.A06 = r04;
        this.A0L = -1;
        this.A0J = new 6Wa[0];
        this.A0K = new ByteBuffer[0];
        this.A0f = new ArrayDeque();
        this.A0j = new Object();
        this.A0k = new Object();
        this.A0g = 5N4.A02(5N3.A05);
    }

    public static long A00(DefaultAudioSink defaultAudioSink) {
        return defaultAudioSink.A0B.A04 == 0 ? defaultAudioSink.A0Q / r0.A05 : defaultAudioSink.A0P;
    }

    private AudioTrack A01(6bW r302) {
        Throwable th;
        AudioTrack audioTrack;
        AtomicInteger atomicInteger;
        int state;
        try {
            boolean z = this.A0I;
            6Wt r0 = this.A0R;
            int i = this.A01;
            try {
                if (Util.A00 >= 29) {
                    audioTrack = 6bW.A01(r0, r302, i, z);
                } else {
                    AudioAttributes A00 = 6bW.A00(r0, z);
                    int i2 = r302.A06;
                    new AudioTrack(A00, new AudioFormat.Builder().setSampleRate(i2).setChannelMask(r302.A02).setEncoding(r302.A03).build(), r302.A00, 1, i);
                }
                atomicInteger = A0q;
                atomicInteger.incrementAndGet();
                state = audioTrack.getState();
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                new KQi(r302.A07, e, 0, r302.A06, r302.A02, r302.A00, A0q.get(), 4YV.A1U(r302.A04));
            }
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
                atomicInteger.decrementAndGet();
            } catch (Exception e2) {
                5My.A05("DefaultAudioSink", String.format("buildAudioTrack: state=%d, audioTrackAllocated.get()=%d", Integer.valueOf(state), Integer.valueOf(atomicInteger.get())), e2);
            }
            new KQi(r302.A07, (Exception) null, state, r302.A06, r302.A02, r302.A00, atomicInteger.get(), 4YV.A1V(r302.A04, 1));
            throw th;
        } catch (KQi e3) {
            6Wz r02 = this.A08;
            if (r02 != null) {
                r02.BkC(e3);
            }
            throw e3;
        }
    }

    public static 6Wv A02(DefaultAudioSink defaultAudioSink) {
        6Wv r302 = defaultAudioSink.A0T;
        if (r302 == null) {
            ArrayDeque arrayDeque = defaultAudioSink.A0f;
            if (arrayDeque.isEmpty()) {
                return defaultAudioSink.A0C;
            }
            r302 = (6Wv) arrayDeque.getLast();
        }
        return r302;
    }

    private void A03() {
        if (this.A0a) {
            return;
        }
        this.A0a = true;
        6Wo r0 = this.A0d;
        long A00 = A00(this);
        r0.A0I = 6Wo.A00(r0);
        r0.A0J = SystemClock.elapsedRealtime() * 1000;
        r0.A06 = A00;
        this.A05.stop();
    }

    private void A04() {
        this.A04 = 0L;
        this.A03 = 0L;
        this.A0Q = 0L;
        this.A0P = 0L;
        int i = 0;
        this.A0Z = false;
        this.A0M = 0;
        this.A0C = new 6Wv(A02(this).A02, 0L, 0L, A02(this).A03);
        this.A0O = 0L;
        this.A0T = null;
        this.A0f.clear();
        this.A0V = null;
        this.A0N = 0;
        this.A0W = null;
        this.A0a = false;
        this.A0Y = false;
        this.A0L = -1;
        this.A0l.A04 = 0L;
        while (true) {
            6Wa[] r0 = this.A0J;
            if (i >= r0.length) {
                return;
            }
            6Wa r02 = r0[i];
            r02.flush();
            this.A0K[i] = r02.B0e();
            i++;
        }
    }

    private void A05(long j) {
        6Vm r307;
        boolean z;
        if (this.A0I || !"audio/raw".equals(this.A0B.A07.A0W)) {
            r307 = 6Vm.A03;
        } else {
            6Wb r0 = this.A0c;
            r307 = A02(this).A02;
            6Wg r02 = r0.A01;
            float f = r307.A01;
            if (r02.A01 != f) {
                r02.A01 = f;
                r02.A07 = true;
            }
            float f2 = r307.A00;
            if (r02.A00 != f2) {
                r02.A00 = f2;
                r02.A07 = true;
            }
        }
        if (this.A0I || !"audio/raw".equals(this.A0B.A07.A0W)) {
            z = false;
        } else {
            6Wb r03 = this.A0c;
            z = A02(this).A03;
            r03.A00.A05 = z;
        }
        this.A0f.add(new 6Wv(r307, Math.max(0L, j), (A00(this) * 1000000) / this.A0B.A06, z));
        6Wa[] r04 = this.A0B.A09;
        ArrayList arrayList = new ArrayList();
        for (6Wa r05 : r04) {
            if (r05.BQN()) {
                arrayList.add(r05);
            } else {
                r05.flush();
            }
        }
        int size = arrayList.size();
        this.A0J = (6Wa[]) arrayList.toArray(new 6Wa[size]);
        this.A0K = new ByteBuffer[size];
        int i = 0;
        while (true) {
            6Wa[] r06 = this.A0J;
            if (i >= r06.length) {
                break;
            }
            6Wa r07 = r06[i];
            r07.flush();
            this.A0K[i] = r07.B0e();
            i++;
        }
        6Wz r08 = this.A08;
        if (r08 != null) {
            r08.CLo(z);
        }
    }

    private void A06(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0J.length;
        int i = length;
        do {
            if (i > 0) {
                byteBuffer = this.A0K[i - 1];
            } else {
                byteBuffer = this.A0V;
                if (byteBuffer == null) {
                    byteBuffer = 6Wa.A00;
                }
            }
            if (i == length) {
                A09(byteBuffer, j);
            } else {
                6Wa r0 = this.A0J[i];
                if (i > this.A0L) {
                    r0.Cac(byteBuffer);
                }
                ByteBuffer B0e = r0.B0e();
                this.A0K[i] = B0e;
                if (B0e.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        } while (i >= 0);
    }

    private void A07(AudioTrack audioTrack) {
        Krc krc = this.A0U;
        if (krc == null) {
            krc = new Krc(this);
            this.A0U = krc;
        }
        krc.A00(audioTrack);
    }

    public static void A08(6Vm r301, DefaultAudioSink defaultAudioSink, boolean z) {
        6Wv A02 = A02(defaultAudioSink);
        if (r301.equals(A02.A02) && z == A02.A03) {
            return;
        }
        6Wv r0 = new 6Wv(r301, -9223372036854775807L, -9223372036854775807L, z);
        if (defaultAudioSink.A05 != null) {
            defaultAudioSink.A0T = r0;
        } else {
            defaultAudioSink.A0C = r0;
        }
    }

    private void A09(ByteBuffer byteBuffer, long j) {
        int write;
        6Wz r0;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.A0W;
            boolean z = true;
            if (byteBuffer2 != null) {
                boolean z2 = false;
                if (byteBuffer2 == byteBuffer) {
                    z2 = true;
                }
                6DP.A03(z2);
            } else {
                this.A0W = byteBuffer;
            }
            int remaining = byteBuffer.remaining();
            if (this.A0I) {
                6DP.A04(AnonymousClass001.A1N((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
                write = this.A05.write(byteBuffer, remaining, 1, j * 1000);
            } else {
                write = this.A05.write(byteBuffer, remaining, 1);
            }
            this.A02 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((write != -6 && write != -32) || this.A0P <= 0) {
                    z = false;
                }
                KQj kQj = new KQj(this.A0B.A07, write, z);
                6Wz r02 = this.A08;
                if (r02 != null) {
                    r02.BkC(kQj);
                }
                if (kQj.isRecoverable) {
                    throw kQj;
                }
                this.A0k.A00(kQj);
                return;
            }
            this.A0k.A00 = null;
            AudioTrack audioTrack = this.A05;
            if (Util.A00 >= 29 && audioTrack.isOffloadedPlayback()) {
                if (this.A0P > 0) {
                    this.A0Z = false;
                }
                if (this.A0F && (r0 = this.A08) != null && write < remaining && !this.A0Z) {
                    r0.C9n();
                }
            }
            int i = this.A0B.A04;
            if (i == 0) {
                this.A0Q += write;
            }
            if (write == remaining) {
                if (i != 0) {
                    if (byteBuffer != this.A0V) {
                        z = false;
                    }
                    6DP.A04(z);
                    this.A0P += this.A0M * this.A0N;
                }
                this.A0W = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:4:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0A() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A0L
            r302 = r0
            r0 = -1
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L67
            r0 = r301
            r1 = 0
            r0.A0L = r1
            r0 = 0
            r302 = r0
        L15:
            r0 = 1
            r305 = r0
        L18:
            r0 = r301
            X.6Wa[] r0 = r0.A0J
            r306 = r0
            r0 = r306
            int r0 = r0.length
            r307 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r308 = r0
            r0 = r302
            r1 = r307
            if (r0 >= r1) goto L6d
            r0 = r306
            r1 = r302
            r0 = r0[r1]
            r310 = r0
            r0 = r305
            if (r0 == 0) goto L40
            r0 = r310
            r0.Cab()
        L40:
            r0 = r301
            r1 = r308
            r0.A06(r1)
            r0 = r310
            boolean r0 = r0.BSB()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L8b
            r0 = r301
            int r0 = r0.A0L
            r307 = r0
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0L = r1
            goto L15
        L67:
            r0 = 0
            r305 = r0
            goto L18
        L6d:
            r0 = r301
            java.nio.ByteBuffer r0 = r0.A0W
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L8d
            r0 = r301
            r1 = r310
            r2 = r308
            r0.A09(r1, r2)
            r0 = r301
            java.nio.ByteBuffer r0 = r0.A0W
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L8d
        L8b:
            r0 = 0
            return r0
        L8d:
            r0 = r301
            r1 = r303
            r0.A0L = r1
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.A0A():boolean");
    }

    public void AHK(6Yl r302, int[] iArr, int i) {
        6Wa[] r314;
        int i2;
        int A03;
        int A032;
        int i3;
        int i4;
        int i5;
        int max;
        int A00;
        long j;
        if ("audio/raw".equals(r302.A0W)) {
            int i6 = r302.A0C;
            6DP.A03(Util.A0M(i6));
            int i7 = r302.A06;
            i3 = Util.A03(i6, i7);
            r314 = this.A0n;
            6Wq r0 = this.A0l;
            int i8 = r302.A08;
            int i9 = r302.A09;
            r0.A03 = i8;
            r0.A02 = i9;
            6Wf r317 = new 6Wf(r302.A0G, i7, i6);
            for (6Wa r02 : r314) {
                try {
                    6Wf AHH = r02.AHH(r317);
                    if (r02.BQN()) {
                        r317 = AHH;
                    }
                } catch (C7hq e) {
                    throw new C7hr(r302, e);
                }
            }
            A03 = r317.A02;
            i2 = r317.A03;
            int i10 = r317.A01;
            A032 = Util.A00(i10);
            i4 = Util.A03(A03, i10);
            i5 = 0;
        } else {
            r314 = new 6Wa[0];
            i2 = r302.A0G;
            Pair A01 = this.A0b.A01(r302);
            if (A01 == null) {
                throw new C7hr(r302, AnonymousClass001.A0Z(r302, "Unable to configure passthrough for: ", AnonymousClass001.A0k()));
            }
            A03 = AnonymousClass001.A03(A01.first);
            A032 = AnonymousClass001.A03(A01.second);
            i3 = -1;
            i4 = -1;
            i5 = 2;
        }
        if (A03 == 0) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Invalid output encoding (mode=");
            A0k.append(i5);
            throw new C7hr(r302, AnonymousClass001.A0Z(r302, ") for: ", A0k));
        }
        if (A032 == 0) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("Invalid output channel config (mode=");
            A0k2.append(i5);
            throw new C7hr(r302, AnonymousClass001.A0Z(r302, ") for: ", A0k2));
        }
        6Wh r03 = this.A0i;
        int minBufferSize = AudioTrack.getMinBufferSize(i2, A032, A03);
        6DP.A04(minBufferSize != -2);
        int i11 = i4 != -1 ? i4 : 1;
        int i12 = r302.A05;
        6Wh r04 = r03;
        if (i5 != 0) {
            if (i5 != 1) {
                int i13 = A03 == 5 ? 500000 : 250000;
                A00 = i12 != -1 ? 1PP.A02(RoundingMode.CEILING, i12, 8) : 6Wh.A00(A03);
                j = i13;
            } else {
                A00 = 6Wh.A00(A03);
                j = 50000000;
            }
            max = 1NS.A00((j * A00) / 1000000);
        } else {
            int i14 = minBufferSize * r04.A01;
            long j2 = r04.A00;
            long j3 = i2;
            long j4 = j2 * j3;
            long j5 = i11;
            max = Math.max(1NS.A00((j4 * j5) / 1000000), Math.min(i14, 1NS.A00(((750000 * j3) * j5) / 1000000)));
        }
        this.A0E = false;
        6bW r05 = new 6bW(r302, r314, i3, i5, i4, i2, A032, A03, (((Math.max(minBufferSize, (int) (max * 1.0d)) + i11) - 1) / i11) * i11, this.A0I);
        if (this.A05 != null) {
            this.A0S = r05;
        } else {
            this.A0B = r05;
        }
    }

    public void APY() {
        6DP.A04(this.A0X);
        if (this.A0I) {
            return;
        }
        this.A0I = true;
        flush();
    }

    public void ARb() {
        this.A0k.A00 = null;
        this.A0j.A00 = null;
        if (this.A05 != null) {
            A04();
            6Wo r0 = this.A0d;
            AudioTrack audioTrack = r0.A0K;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.A05.pause();
            }
            this.A05.flush();
            6Wo.A01(r0);
            r0.A0K = null;
            r0.A0L = null;
            AudioTrack audioTrack2 = this.A05;
            6bW r02 = this.A0B;
            r0.A02(audioTrack2, r02.A03, r02.A05, r02.A00);
            this.A0G = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0227, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0231, code lost:
    
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0270, code lost:
    
        if (r0 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long Afp(boolean r302) {
        /*
            Method dump skipped, instructions count: 2445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.Afp(boolean):long");
    }

    public int AnG(6Yl r302) {
        if ("audio/raw".equals(r302.A0W)) {
            int i = r302.A0C;
            if (!Util.A0M(i)) {
                5My.A04("DefaultAudioSink", 0Pz.A0T("Invalid PCM encoding: ", i));
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        } else if (this.A0b.A01(r302) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x08a7, code lost:
    
        r319 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r302 == r0) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x05c0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x041b  */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.lang.Object, X.7Qs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BLk(java.nio.ByteBuffer r302, int r303, long r304) {
        /*
            Method dump skipped, instructions count: 2901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.BLk(java.nio.ByteBuffer, int, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (A00(r301) <= X.6Wo.A00(r301.A0d)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BNI() {
        /*
            r301 = this;
            r0 = r301
            android.media.AudioTrack r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L27
            r0 = r301
            X.6Wo r0 = r0.A0d
            r302 = r0
            r0 = r301
            long r0 = A00(r0)
            r303 = r0
            r0 = r302
            long r0 = X.6Wo.A00(r0)
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 > 0) goto L2c
        L27:
            r0 = 0
            r308 = r0
            r0 = 0
            r302 = r0
        L2c:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.BNI():boolean");
    }

    public boolean BSB() {
        if (this.A05 != null) {
            return this.A0Y && !BNI();
        }
        return true;
    }

    public void CXT() {
        this.A0F = true;
        if (this.A05 != null) {
            6bZ r0 = this.A0d.A0L;
            r0.getClass();
            r0.A00();
            this.A05.play();
        }
    }

    public void CXf() {
        if (this.A0Y || this.A05 == null || !A0A()) {
            return;
        }
        A03();
        this.A0Y = true;
    }

    public void Clw(6Wt r302) {
        if (this.A0R.equals(r302)) {
            return;
        }
        this.A0R = r302;
        if (this.A0I) {
            return;
        }
        flush();
    }

    public void Cm3(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            this.A0X = AnonymousClass001.A1N(i);
            flush();
        }
    }

    public void Cm6(6Wu r302) {
        if (this.A09.equals(r302)) {
            return;
        }
        this.A09 = r302;
    }

    public void Csk(6Vm r302) {
        6Vm r0 = 6Vm.A03;
        A08(new 6Vm(Math.max(0.1f, Math.min(r302.A01, 8.0f)), Math.max(0.1f, Math.min(r302.A00, 8.0f))), this, A02(this).A03);
    }

    public void Ct6(AudioDeviceInfo audioDeviceInfo) {
        C7ow c7ow = audioDeviceInfo == null ? null : new C7ow(audioDeviceInfo);
        this.A0A = c7ow;
        AudioTrack audioTrack = this.A05;
        if (audioTrack != null) {
            audioTrack.setPreferredDevice(c7ow == null ? null : c7ow.A00);
        }
    }

    public void Cwb(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            AudioTrack audioTrack = this.A05;
            if (audioTrack != null) {
                audioTrack.setVolume(f);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, X.7Qs] */
    public void flush() {
        if (this.A05 != null) {
            A04();
            6Wo r0 = this.A0d;
            AudioTrack audioTrack = r0.A0K;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.A05.pause();
            }
            AudioTrack audioTrack2 = this.A05;
            if (Util.A00 >= 29 && audioTrack2.isOffloadedPlayback()) {
                Krc krc = this.A0U;
                krc.getClass();
                krc.A01(this.A05);
            }
            final ?? obj = new Object();
            6bW r02 = this.A0S;
            if (r02 != null) {
                this.A0B = r02;
                this.A0S = null;
            }
            6Wo.A01(r0);
            r0.A0K = null;
            r0.A0L = null;
            final AudioTrack audioTrack3 = this.A05;
            final 6Wl r03 = this.A0e;
            final 6Wz r04 = this.A08;
            r03.A02();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (A0r) {
                ExecutorService executorService = A0p;
                if (executorService == null) {
                    executorService = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: X.7wk
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
                        }
                    });
                    A0p = executorService;
                }
                A0o++;
                executorService.execute(new Runnable() { // from class: X.Lr3
                    public static final String __redex_internal_original_name = "DefaultAudioSink$$ExternalSyntheticLambda0";

                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:58:0x00f0
                        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                        */
                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 265
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.Lr3.run():void");
                    }
                });
            }
            this.A05 = null;
        }
        this.A0k.A00 = null;
        this.A0j.A00 = null;
    }

    public void pause() {
        this.A0F = false;
        if (this.A05 != null) {
            6Wo r0 = this.A0d;
            6Wo.A01(r0);
            if (r0.A0J == -9223372036854775807L) {
                6bZ r02 = r0.A0L;
                r02.getClass();
                r02.A00();
                this.A05.pause();
            }
        }
    }

    public void reset() {
        flush();
        6Wa[] r0 = this.A0n;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            r0[i2].reset();
            i = i2 + 1;
        }
        6Wa[] r02 = this.A0m;
        int length2 = r02.length;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length2) {
                this.A0F = false;
                this.A0E = false;
                return;
            } else {
                r02[i4].reset();
                i3 = i4 + 1;
            }
        }
    }
}
