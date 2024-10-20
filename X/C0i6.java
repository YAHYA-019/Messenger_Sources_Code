package X;

import android.text.TextUtils;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* renamed from: X.0i6, reason: invalid class name */
/* loaded from: 0i6.class */
public final class C0i6 implements C0iO {
    public static final C0ij A07 = new C0ij() { // from class: X.0i9
        @Override // X.C0ij
        public boolean A3j(Thread thread, Throwable th) {
            return true;
        }
    };
    public C0ij A00;
    public 0Wl A01;
    public int A02;
    public boolean A03;
    public final 0gK A04;
    public final C0ij A05;
    public final 0jH A06;
    public byte[] mOomReservation;

    public C0i6(0gK r302, C0ij c0ij, C0ij c0ij2, 0jH r305, 0Wl r306, int i, boolean z) {
        this.A06 = r305;
        this.A04 = r302;
        this.A03 = z;
        this.A02 = i;
        this.A01 = r306;
        this.A00 = c0ij;
        this.A05 = c0ij2;
    }

    public static Throwable A00(C0qh c0qh, Thread thread, Throwable th) {
        String A0W;
        String A01;
        try {
            StringWriter stringWriter = 04A.A01;
            synchronized (04A.class) {
                if (04A.A01 != null) {
                    PrintWriter printWriter = 04A.A00;
                    if (printWriter != null) {
                        th.printStackTrace(printWriter);
                        04A.A00.close();
                        A01 = 04A.A01.toString();
                        04A.A00 = null;
                        04A.A01 = null;
                    }
                }
                A01 = 04A.A01(th);
            }
            A0W = "No stack trace";
            if (A01.length() >= 10 || !TextUtils.isEmpty(A01.trim())) {
                A0W = 04A.A00(A01, 20000);
            } else {
                0fH.A0n("lacrima", A0W);
            }
        } catch (Throwable th2) {
            A0W = 0Pz.A0W(th.toString(), ": truncated trace");
            C0iy.A00().Bwu("JavaDetectorStacktrace", th2, null);
        }
        c0qh.A05(C0g6.A6L, A0W);
        c0qh.A05(C0g6.A6N, AnonymousClass001.A0Y(th));
        c0qh.A05(C0g6.A6O, th.getMessage());
        c0qh.A05(C0g6.A6P, thread == null ? "unknown" : String.valueOf(thread.getName()));
        while (th.getCause() != null) {
            th = th.getCause();
        }
        c0qh.A05(C0g6.A6G, AnonymousClass001.A0Y(th));
        if (!C0gp.A02) {
            c0qh.A05(C0g6.A6I, 04A.A01(th));
        }
        c0qh.A05(C0g6.A6H, th.getMessage());
        return th;
    }

    public static void A01(0gG r301, 0gK r302, C0gq c0gq) {
        C0iO A072 = r302.A07(C0i6.class);
        if (A072 != null) {
            r302.A08(r301, c0gq, A072);
            return;
        }
        C0iy.A00().Bwu("JavaCrashDetector.addExtraCollector", AnonymousClass001.A0T("Unable to add extra collector to JavaCrashDetector"), 0gG.A00(r301, c0gq));
        0fH.A0n("lacrima", "Cannot find registered detector");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(java.lang.Thread r302, java.lang.Throwable r303) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0i6.A02(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // X.C0iO
    public /* synthetic */ int getHealthEventSamplingRate() {
        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
    }

    @Override // X.C0iO
    public /* synthetic */ C0l0 getLimiter() {
        return null;
    }

    @Override // X.C0iO
    public 0iP getName() {
        return 0iP.A0G;
    }

    @Override // X.C0iO
    public void start() {
        C0ix.A00("JavaCrashDetector");
        if (0cQ.A01() != null) {
            0cQ.A03(new C0cS() { // from class: X.0i8
                @Override // X.C0cS
                public int BMm(0cI r302, Thread thread, Throwable th) {
                    C0i6 c0i6 = C0i6.this;
                    c0i6.A00.A3j(thread, th);
                    c0i6.A02(thread, th);
                    return 0;
                }
            }, 100);
        } else {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0ii
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    C0i6 c0i6 = C0i6.this;
                    c0i6.A00.A3j(thread, th);
                    c0i6.A02(thread, th);
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
        this.mOomReservation = new byte[65536];
    }
}
