package com.facebook.wearable.common.comms.rtc.hera.video.util;

import X.03Y;
import X.04S;
import X.0DR;
import X.0Ds;
import X.0OI;
import X.0Pz;
import X.0Ro;
import X.0Xs;
import X.11T;
import X.1BK;
import X.7zL;
import X.7zR;
import X.AVX;
import X.AW5;
import X.AW6;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C13m;
import X.GOp;
import X.I0b;
import X.I6K;
import X.Il0;
import X.Iuh;
import X.J5U;
import X.JBV;
import X.JDd;
import X.JOP;
import X.Q05;
import X.QV8;
import X.R3r;
import X.RHU;
import X.RSd;
import X.S9d;
import X.S9f;
import X.SCK;
import X.SCL;
import X.SCM;
import X.SCN;
import X.SDn;
import android.os.Handler;
import android.view.Surface;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;

/* loaded from: RawVideoFrameDistributor.class */
public final class RawVideoFrameDistributor implements IRawVideoSource {
    public IRawVideoSource.SurfaceOutput A00;
    public Function2 A01;
    public final JDd A02;
    public final Object A03;
    public final Map A04;
    public final Map A05;
    public final Set A06;
    public final 0Xs A07;
    public final int[] A08;
    public final Il0 A09;

    public RawVideoFrameDistributor() {
        this(null, true);
    }

    public RawVideoFrameDistributor(JDd jDd, boolean z) {
        this.A02 = jDd;
        this.A03 = AnonymousClass001.A0R();
        this.A05 = 1BK.A1C();
        this.A06 = 7zL.A15();
        this.A08 = z ? JOP.A04 : JOP.A03;
        this.A07 = new 0Ro(1BK.A0d());
        this.A04 = 1BK.A1C();
        Il0 il0 = new Il0(new JBV(this, 42));
        il0.setOnSinkParamsChanged(new AW5(this, 37));
        this.A09 = il0;
    }

    private final void A00(IRawVideoSource.FrameOutput frameOutput) {
        synchronized (this.A03) {
            this.A04.remove(frameOutput);
            A02(this);
            this.A06.remove(frameOutput);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r303v0 */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v2, types: [X.SCN, java.lang.Runnable] */
    private final void A01(IRawVideoSource.SurfaceOutput surfaceOutput) {
        I0b i0b;
        surfaceOutput.onOutputParams = null;
        ?? r303 = this.A03;
        synchronized (r303) {
            try {
                this.A04.remove(surfaceOutput);
                A02(this);
                i0b = (I0b) this.A05.remove(surfaceOutput);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i0b != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Iuh iuh = new Iuh(countDownLatch);
            r303 = i0b.A0E;
            synchronized (r303) {
                ((SCN) r303).A00 = null;
            }
            Object obj = i0b.A0J;
            synchronized (obj) {
                ?? r0 = i0b.A09;
                if (r0 != 0) {
                    r0.removeCallbacks(r303);
                    i0b.A09.postAtFrontOfQueue(new SCK(i0b, iuh));
                } else {
                    iuh.run();
                }
            }
            surfaceOutput.onBitmapFrameListenerAdded = null;
            boolean z = false;
            while (true) {
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                AnonymousClass001.A13();
            }
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            synchronized (obj) {
                Handler handler = i0b.A09;
                if (handler == null) {
                    return;
                }
                handler.removeCallbacks(i0b.A0M);
                i0b.A09.postAtFrontOfQueue(new SCL(i0b, countDownLatch2));
                i0b.A09.post(new SCM(i0b.A09.getLooper(), i0b));
                i0b.A09 = null;
                boolean z2 = false;
                while (true) {
                    try {
                        countDownLatch2.await();
                        break;
                    } catch (InterruptedException unused2) {
                        z2 = true;
                    }
                }
                if (z2) {
                    AnonymousClass001.A13();
                }
                synchronized (i0b.A0I) {
                    RSd rSd = i0b.A0C;
                    if (rSd != null) {
                        rSd.A01.release();
                        i0b.A0C = null;
                    }
                }
            }
        }
    }

    public static final void A02(RawVideoFrameDistributor rawVideoFrameDistributor) {
        Function2 function2;
        0OI A1B = C13m.A1B();
        Map map = rawVideoFrameDistributor.A04;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            Object obj = ((03Y) A1A.next()).second;
            if (obj != null) {
                A1B.add(obj);
            }
        }
        0OI A1C = C13m.A1C(A1B);
        Iterator A1A2 = 1BK.A1A(map);
        Number number = null;
        while (A1A2.hasNext()) {
            03Y r0 = (03Y) A1A2.next();
            if (number == null || number.intValue() < 7zR.A05((Number) r0.first)) {
                number = (Number) r0.first;
            }
        }
        synchronized (rawVideoFrameDistributor.A03) {
            function2 = rawVideoFrameDistributor.A01;
        }
        if (function2 != null) {
            function2.invoke(number, A1C);
        }
    }

    public final void A03(RSd rSd) {
        boolean z;
        if (AnonymousClass001.A1V(this.A07.getValue())) {
            synchronized (this.A03) {
                Iterator A0y = AnonymousClass001.A0y(this.A05);
                while (A0y.hasNext()) {
                    I0b i0b = (I0b) GOp.A15(A0y);
                    Object obj = i0b.A0L;
                    synchronized (obj) {
                        try {
                            i0b.A02++;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    synchronized (i0b.A0J) {
                        try {
                            if (i0b.A09 != null) {
                                synchronized (i0b.A0I) {
                                    RSd rSd2 = i0b.A0C;
                                    z = false;
                                    if (rSd2 != null) {
                                        z = true;
                                        rSd2.A01.release();
                                    }
                                    i0b.A0C = rSd;
                                    rSd.A01.retain();
                                    i0b.A09.post(new S9d(i0b));
                                }
                                if (z) {
                                    synchronized (obj) {
                                        try {
                                            i0b.A01++;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    ((IRawVideoSource.FrameOutput) it.next()).onFrame.invoke(new RHU(rSd));
                }
            }
        }
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void addOutput(IRawVideoSource.Output output) {
        Runnable runnable;
        11T.A0F(output, 0);
        if (!(output instanceof IRawVideoSource.SurfaceOutput)) {
            if (output instanceof IRawVideoSource.FrameOutput) {
                synchronized (this.A03) {
                    this.A06.add(output);
                }
                output.onOutputParams = new AW6(output, this, 26);
                return;
            }
            return;
        }
        IRawVideoSource.SurfaceOutput surfaceOutput = (IRawVideoSource.SurfaceOutput) output;
        synchronized (this.A03) {
            Map map = this.A05;
            if (!map.containsKey(surfaceOutput)) {
                I0b i0b = new I0b(0Pz.A0O("VDist-", ' ', surfaceOutput.hashCode()));
                JDd jDd = this.A02;
                int[] iArr = this.A08;
                QV8 qv8 = new QV8();
                Object obj = i0b.A0J;
                synchronized (obj) {
                    try {
                        if (i0b.A09 != null) {
                            throw 1BK.A0i(i0b.A0N, "Already initialized");
                        }
                        i0b.A0B = qv8;
                        Q05 q05 = new Q05(AnonymousClass002.A09(0Pz.A0W(i0b.A0N, "EglRenderer")), new S9f(i0b));
                        i0b.A09 = q05;
                        R3r.A00(q05, new J5U(new SDn(jDd, i0b, iArr), 38));
                        Handler handler = i0b.A09;
                        runnable = i0b.A0E;
                        handler.post(runnable);
                        I0b.A00(i0b, System.nanoTime());
                        i0b.A09.postDelayed(i0b.A0M, TimeUnit.SECONDS.toMillis(4));
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                Surface surface = surfaceOutput.surface;
                synchronized (runnable) {
                    try {
                        ((SCN) runnable).A00 = surface;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                synchronized (obj) {
                    try {
                        Handler handler2 = i0b.A09;
                        if (handler2 != null) {
                            handler2.post(runnable);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                surfaceOutput.onBitmapFrameListenerAdded = new AW5(i0b, 36);
                map.put(surfaceOutput, i0b);
                surfaceOutput.onOutputParams = new AVX(13, i0b, this, surfaceOutput);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object release(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.rtc.hera.video.util.RawVideoFrameDistributor.release(X.0DR):java.lang.Object");
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void releaseBlocking() {
        I6K.releaseBlocking(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void removeOutput(IRawVideoSource.Output output) {
        11T.A0F(output, 0);
        if (output instanceof IRawVideoSource.SurfaceOutput) {
            A01((IRawVideoSource.SurfaceOutput) output);
        } else if (output instanceof IRawVideoSource.FrameOutput) {
            A00((IRawVideoSource.FrameOutput) output);
        }
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public Object start(0DR r302) {
        Object emit = this.A07.emit(AnonymousClass001.A0K(), r302);
        if (emit != 0Ds.A02) {
            emit = 04S.A00;
        }
        return emit;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void startBlocking() {
        I6K.startBlocking(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public Object stop(0DR r302) {
        Object emit = this.A07.emit(1BK.A0d(), r302);
        if (emit != 0Ds.A02) {
            emit = 04S.A00;
        }
        return emit;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void stopBlocking() {
        I6K.stopBlocking(this);
    }
}
