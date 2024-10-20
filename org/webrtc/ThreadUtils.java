package org.webrtc;

import X.AnonymousClass001;
import X.DKD;
import X.GOo;
import X.HZG;
import X.HZH;
import X.J2T;
import X.J5U;
import X.JDn;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: ThreadUtils.class */
public class ThreadUtils {
    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        boolean z;
        boolean z2 = false;
        while (true) {
            try {
                z = z2;
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z) {
            AnonymousClass001.A13();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r309 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch r301, long r302) {
        /*
            long r0 = android.os.SystemClock.elapsedRealtime()
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            r307 = r0
            r0 = 0
            r309 = r0
        Ld:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L24
            r310 = r0
            r0 = r301
            r1 = r307
            r2 = r310
            boolean r0 = r0.await(r1, r2)     // Catch: java.lang.InterruptedException -> L24
            r306 = r0
            r0 = r309
            if (r0 == 0) goto L47
            goto L44
        L24:
            r0 = 1
            r309 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r1 = r304
            long r0 = r0 - r1
            r311 = r0
            r0 = r302
            r1 = r311
            long r0 = r0 - r1
            r307 = r0
            r0 = 0
            r313 = r0
            r0 = r307
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r315 = r0
            r0 = r315
            if (r0 > 0) goto Ld
        L44:
            X.AnonymousClass001.A13()
        L47:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.ThreadUtils.awaitUninterruptibly(java.util.concurrent.CountDownLatch, long):boolean");
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != DKD.A10()) {
            throw AnonymousClass001.A0N("Not on main thread!");
        }
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length;
        int length2 = stackTraceElementArr2.length;
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[length + length2];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, length, length2);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(JDn jDn) {
        while (true) {
            try {
                throw AnonymousClass001.A0Q("run");
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    public static Object invokeAtFrontUninterruptibly(Handler handler, Callable callable) {
        ?? A11 = GOo.A11(handler);
        if (A11 == Thread.currentThread()) {
            try {
                A11 = callable.call();
                return A11;
            } catch (Exception unused) {
                throw AnonymousClass001.A0U(A11);
            }
        }
        HZH hzh = new HZH();
        HZG hzg = new HZG();
        CountDownLatch A112 = AnonymousClass001.A11();
        handler.post(new J2T(callable, A112, hzg, hzh));
        awaitUninterruptibly(A112);
        Exception exc = hzg.A00;
        if (exc == null) {
            return hzh.A00;
        }
        RuntimeException A0U = AnonymousClass001.A0U(exc);
        A0U.setStackTrace(concatStackTraces(hzg.A00.getStackTrace(), A0U.getStackTrace()));
        throw A0U;
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, (Callable) new J5U(runnable, 42));
    }

    public static void joinUninterruptibly(Thread thread) {
        boolean z;
        boolean z2 = false;
        while (true) {
            try {
                z = z2;
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z) {
            AnonymousClass001.A13();
        }
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        while (j2 > 0) {
            try {
                thread.join(j2);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            AnonymousClass001.A13();
        }
        return !thread.isAlive();
    }
}
