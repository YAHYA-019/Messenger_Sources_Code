package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0jQ, reason: invalid class name */
/* loaded from: 0jQ.class */
public final class C0jQ implements Runnable {
    public static final String __redex_internal_original_name = "ProcessImportanceProvider";
    public long A00;
    public C0pj A01;
    public final ActivityManager.RunningAppProcessInfo A02;
    public final Context A04;
    public final Object A03 = AnonymousClass001.A0R();
    public final List A05 = new CopyOnWriteArrayList();

    public C0jQ(Context context) {
        this.A04 = context;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        this.A02 = runningAppProcessInfo;
        runningAppProcessInfo.importance = 0;
        this.A01 = null;
    }

    public static void A00(ActivityManager.RunningAppProcessInfo runningAppProcessInfo, ActivityManager.RunningAppProcessInfo runningAppProcessInfo2) {
        runningAppProcessInfo2.lastTrimLevel = runningAppProcessInfo.lastTrimLevel;
    }

    public static boolean A01(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        boolean z;
        synchronized (runningAppProcessInfo) {
            try {
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                z = true;
            } catch (RuntimeException e) {
                0fH.A0r(__redex_internal_original_name, "Could not get current importance", e);
                z = false;
            }
        }
        return z;
    }

    public static boolean A02(C0jQ c0jQ) {
        int i;
        boolean A01;
        int i2;
        byte[] bArr;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = c0jQ.A02;
        synchronized (runningAppProcessInfo) {
            i = runningAppProcessInfo.importance;
            A01 = A01(runningAppProcessInfo);
            if (A01) {
                c0jQ.A00 = SystemClock.uptimeMillis();
                i2 = runningAppProcessInfo.importance;
            } else {
                i2 = i;
            }
        }
        synchronized (c0jQ.A03) {
            C0pj c0pj = c0jQ.A01;
            if (c0pj != null) {
                C0pf c0pf = c0pj.A00;
                synchronized (c0pf) {
                    if (c0pf.A0D != null) {
                        if (!A01 || c0pf.A00 == i2) {
                            C0pf.A00(c0pf);
                        } else {
                            Integer num = (Integer) C0pf.A0I.get(Integer.valueOf(i2));
                            Integer num2 = num == null ? 0S2.A15 : 0S2.A0u;
                            if (num == null) {
                                bArr = new byte[2];
                                bArr[0] = (byte) (i2 >>> 8);
                                bArr[1] = (byte) i2;
                            } else {
                                bArr = new byte[1];
                                bArr[0] = num.byteValue();
                            }
                            C0pf.A02(c0pf, num2, bArr);
                            c0pf.A00 = i2;
                        }
                    }
                }
            }
        }
        if (A01 && i != i2) {
            Iterator it = c0jQ.A05.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onImportanceChanged");
            }
        }
        return A01;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            A02(this);
            try {
                Thread.sleep(0L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
