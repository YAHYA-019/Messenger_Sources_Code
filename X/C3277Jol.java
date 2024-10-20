package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Jol, reason: case insensitive filesystem */
/* loaded from: Jol.class */
public final class C3277Jol extends 01G {
    public final int A00;
    public final Object A01;

    public C3277Jol(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A3f(Message message, 0KL r303, String str) {
        try {
            switch (this.A00) {
                case 0:
                    4eU r0 = (4eU) this.A01;
                    if (r0.A00 || (message.what == 137 && r0.A03)) {
                        Handler.Callback callback = r303.A00;
                        if (callback == null || !callback.handleMessage(message)) {
                            r303.A01.handleMessage(message);
                            return;
                        }
                        return;
                    }
                    return;
                case 8:
                    int i = message.what;
                    if (i == 115 || i == 116 || i == 159) {
                        Handler.Callback callback2 = r303.A00;
                        if (callback2 == null || !callback2.handleMessage(message)) {
                            r303.A01.handleMessage(message);
                        }
                        4kS.A00((4kS) this.A01);
                        return;
                    }
                    return;
                default:
                    super.A3f(message, r303, "ActivityThread");
                    return;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0133, code lost:
    
        if (r0.endsWith("-loghandler") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0327, code lost:
    
        if (r0[5] == android.content.IntentFilter.class) goto L83;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass028 Aal(X.C01c r302, java.lang.String r303, java.lang.reflect.Method r304, java.lang.Object[] r305) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3277Jol.Aal(X.01c, java.lang.String, java.lang.reflect.Method, java.lang.Object[]):X.028");
    }

    public void Bwx(Object obj, String str, Method method, Object[] objArr, long j) {
        AtomicInteger atomicInteger;
        switch (this.A00) {
            case 2:
                if (!"audio".equals(str) || obj == null) {
                    return;
                }
                String name = method.getName();
                if (name.equals("getStreamVolume")) {
                    atomicInteger = ((C06094fw) this.A01).A03;
                } else if (!name.equals("getStreamMaxVolume")) {
                    return;
                } else {
                    atomicInteger = ((C06094fw) this.A01).A02;
                }
                if (method.getParameterTypes().length == 1) {
                    Class<?> cls = method.getParameterTypes()[0];
                    Class<?> cls2 = Integer.TYPE;
                    if (cls == cls2 && method.getReturnType() == cls2 && objArr != null && AnonymousClass001.A03(objArr[0]) == 3) {
                        atomicInteger.set(AnonymousClass001.A03(obj));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if ("notification".equals(str) && method.getName().equals("enqueueNotificationWithTag")) {
                    C05864f6 c05864f6 = (C05864f6) this.A01;
                    c05864f6.A01 = Thread.currentThread().getStackTrace();
                    c05864f6.A00 = SystemClock.uptimeMillis();
                    return;
                }
                return;
            case 4:
            default:
                super.Bwx(obj, str, method, objArr, j);
                return;
            case 5:
                if ("activity".equals(str)) {
                    if (!method.getName().equals("startService") || objArr.length != 6 || method.getParameterTypes()[3] != Boolean.TYPE) {
                        if (method.getName().equals("setServiceForeground")) {
                            ((C05784ey) this.A01).A02 = SystemClock.uptimeMillis();
                            return;
                        }
                        return;
                    } else {
                        if (AnonymousClass001.A1V(objArr[3])) {
                            C05784ey c05784ey = (C05784ey) this.A01;
                            c05784ey.A05 = Thread.currentThread().getStackTrace();
                            c05784ey.A03 = SystemClock.uptimeMillis();
                            c05784ey.A04 = method.getParameterTypes()[1] == Intent.class ? (Intent) objArr[1] : null;
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    public boolean C6l(Message message, 0KL r303, String str) {
        boolean z;
        switch (this.A00) {
            case 0:
                4eU r0 = (4eU) this.A01;
                z = true;
                if (!r0.A00) {
                    int i = message.what;
                    if (i == 130) {
                        00F.A01("The systems asks the app to exit.");
                        return false;
                    }
                    if (i == 137) {
                        return r0.A03;
                    }
                    if (i != 119 || !r0.A02) {
                        return false;
                    }
                    r0.A01.post(new LpP(Message.obtain(message), r303, this));
                    return true;
                }
                return z;
            case 5:
                int i2 = message.what;
                if (i2 == 114) {
                    ((C05784ey) this.A01).A00 = SystemClock.uptimeMillis();
                    return false;
                }
                if (i2 != 115) {
                    return false;
                }
                ((C05784ey) this.A01).A01 = SystemClock.uptimeMillis();
                return false;
            case 8:
                int i3 = message.what;
                if (i3 != 115 && i3 != 116 && i3 != 159) {
                    return false;
                }
                4kS.A00((4kS) this.A01);
                return true;
            default:
                z = super.C6l(message, r303, "ActivityThread");
                return z;
        }
    }
}
