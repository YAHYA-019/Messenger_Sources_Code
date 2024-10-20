package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import java.lang.reflect.Constructor;

/* renamed from: X.4f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4f6.class */
public final class C05864f6 extends AnonymousClass013 implements C0cS {
    public long A00;
    public StackTraceElement[] A01;
    public final Context A02;
    public final 01G A03;
    public final boolean A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006f, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642160352817L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C05864f6(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            r0.A01 = r1
            r0 = 0
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = 3
            r306 = r0
            X.Jol r0 = new X.Jol
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = r306
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r307
            r0.A03 = r1
            r0 = r302
            X.00z r0 = (X.C00z) r0
            r302 = r0
            r0 = r302
            android.content.Context r0 = r0.A01
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A02 = r1
            r0 = r301
            java.lang.Class<X.1Dn> r1 = X.1Dn.class
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L72
            r0 = r307
            X.00i r0 = r0.A02
            r307 = r0
            r0 = r307
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r308 = r0
            r0 = 36317642160352817(0x8106b4000c2e31, double:3.030761369389554E-306)
            r304 = r0
            r0 = r308
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L77
        L72:
            r0 = 0
            r303 = r0
            r0 = 0
            r307 = r0
        L77:
            r0 = r301
            r1 = r303
            r0.A04 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05864f6.<init>(X.010):void");
    }

    @Override // X.C0cS
    public int BMm(0cI r302, Thread thread, Throwable th) {
        AndroidRuntimeException androidRuntimeException;
        if (th == null || th.getMessage() == null || !th.getMessage().startsWith("Bad notification posted")) {
            return 0;
        }
        String message = th.getMessage();
        long uptimeMillis = SystemClock.uptimeMillis();
        StackTraceElement[] stackTraceElementArr = this.A01;
        if (stackTraceElementArr == null) {
            return 0;
        }
        long j = this.A00;
        long j2 = uptimeMillis - j;
        if (j2 > 120000) {
            return 0;
        }
        int length = stackTraceElementArr.length;
        int i = 6;
        int i2 = length - 6;
        if (i2 <= 0) {
            return 0;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i2];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i >= length) {
                break;
            }
            stackTraceElementArr2[i4] = stackTraceElementArr[i];
            i++;
            i3 = i4 + 1;
        }
        StringBuilder A0o = AnonymousClass001.A0o(message);
        A0o.append("\nCurrent UptimeMs=");
        A0o.append(uptimeMillis);
        A0o.append("\nLast UptimeMs for enqueueNotificationWithTag=");
        A0o.append(j);
        A0o.append("(+");
        A0o.append(j2);
        A0o.append("ms)");
        C7oy c7oy = C7oy.A01;
        if (c7oy == null) {
            c7oy = new C7oy();
            C7oy.A01 = c7oy;
        }
        String obj = A0o.toString();
        Constructor constructor = c7oy.A00;
        if (constructor == null) {
            androidRuntimeException = new AndroidRuntimeException(obj);
        } else {
            try {
                androidRuntimeException = (AndroidRuntimeException) constructor.newInstance(obj);
            } catch (Throwable unused) {
                androidRuntimeException = new AndroidRuntimeException(obj);
            }
        }
        androidRuntimeException.setStackTrace(stackTraceElementArr2);
        Throwable cause = th.getCause();
        if (cause != null) {
            androidRuntimeException.initCause(cause);
        }
        th.initCause(androidRuntimeException);
        return 0;
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "BadNotificationDebugger";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A04) {
            01Q.A01(this.A03);
            01Q.A00(this.A02, "notification");
            0cQ.A03(this, 100);
            A07();
        }
    }
}
