package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import java.lang.reflect.Constructor;

/* renamed from: X.4ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ey.class */
public final class C05784ey extends AnonymousClass013 implements C0cS {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Intent A04;
    public StackTraceElement[] A05;
    public final Context A06;
    public final 01G A07;
    public final boolean A08;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0082, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642160418354L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C05784ey(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            r0.A05 = r1
            r0 = 0
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A03 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = r301
            r1 = 0
            r0.A04 = r1
            r0 = 5
            r306 = r0
            X.Jol r0 = new X.Jol
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = r306
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r307
            r0.A07 = r1
            r0 = r302
            X.00z r0 = (X.C00z) r0
            r302 = r0
            r0 = r302
            android.content.Context r0 = r0.A01
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A06 = r1
            r0 = r301
            java.lang.Class<X.1Dn> r1 = X.1Dn.class
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L85
            r0 = r307
            X.00i r0 = r0.A02
            r307 = r0
            r0 = r307
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r303 = r0
            r0 = 36317642160418354(0x8106b4000d2e32, double:3.030761369431E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 1
            r308 = r0
            r0 = r306
            if (r0 != 0) goto L8b
        L85:
            r0 = 0
            r308 = r0
            r0 = 0
            r307 = r0
        L8b:
            r0 = r301
            r1 = r308
            r0.A08 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05784ey.<init>(X.010):void");
    }

    @Override // X.C0cS
    public int BMm(0cI r302, Thread thread, Throwable th) {
        AndroidRuntimeException androidRuntimeException;
        if (th == null || th.getMessage() == null || !th.getMessage().startsWith("Context.startForegroundService()")) {
            return 0;
        }
        String message = th.getMessage();
        long uptimeMillis = SystemClock.uptimeMillis();
        StackTraceElement[] stackTraceElementArr = this.A05;
        if (stackTraceElementArr == null) {
            return 0;
        }
        long j = this.A03;
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
        while (i < length) {
            stackTraceElementArr2[i3] = stackTraceElementArr[i];
            i++;
            i3++;
        }
        StringBuilder A0o = AnonymousClass001.A0o(message);
        A0o.append("\nCurrent UptimeMs=");
        A0o.append(uptimeMillis);
        A0o.append("\nLast UptimeMs for startService=");
        A0o.append(j);
        A0o.append("(+");
        A0o.append(j2);
        A0o.append("ms)");
        long j3 = this.A00;
        if (j3 > j) {
            4YU.A1T(", onCreate=", "(+", A0o, j3);
            A0o.append(uptimeMillis - j3);
            A0o.append("ms)");
        }
        long j4 = this.A01;
        if (j4 > j) {
            4YU.A1T(", onStartCommand=", "(+", A0o, j4);
            A0o.append(uptimeMillis - j4);
            A0o.append("ms)");
        }
        long j5 = this.A02;
        if (j5 > j) {
            4YU.A1T(", setServiceForeground=", "(+", A0o, j5);
            A0o.append(uptimeMillis - j5);
            A0o.append("ms)");
        }
        Intent intent = this.A04;
        if (intent != null) {
            A0o.append("\nIntent action=");
            A0o.append(intent.getAction());
            A0o.append(1BJ.A00(240));
            A0o.append(this.A04.getComponent());
        }
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
        Intent intent2 = this.A04;
        if (intent2 != null && intent2.getComponent() != null) {
            ComponentName component = this.A04.getComponent();
            RuntimeException runtimeException = new RuntimeException();
            String className = component.getClassName();
            String shortClassName = component.getShortClassName();
            int lastIndexOf = shortClassName.lastIndexOf(46);
            if (lastIndexOf != -1) {
                shortClassName = AnonymousClass001.A0W(lastIndexOf, shortClassName);
            }
            runtimeException.setStackTrace(new StackTraceElement[]{new StackTraceElement(className, "startForeground", 0Pz.A0W(shortClassName, ".java"), -1)});
            androidRuntimeException.initCause(runtimeException);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            androidRuntimeException.initCause(cause);
        }
        th.initCause(androidRuntimeException);
        return 0;
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "ForegroundServiceDebugger";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A08) {
            01Q.A01(this.A07);
            01Q.A00(this.A06, "activity");
            0cQ.A03(this, 100);
            A07();
        }
    }
}
