package X;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: Lk4.class */
public final class Lk4 implements Runnable {
    public static final String __redex_internal_original_name = "SystemAlarmDispatcher$DequeueAndCheckForCompletion";
    public final LRm A00;

    public Lk4(LRm lRm) {
        this.A00 = lRm;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean A1O;
        boolean A1O2;
        LRm lRm = this.A00;
        4IS A00 = 4IS.A00();
        String str = LRm.A0B;
        A00.A02(str, "Checking if commands are complete.");
        LRm.A00();
        List list = lRm.A0A;
        synchronized (list) {
            if (lRm.A00 != null) {
                4IS A002 = 4IS.A00();
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Removing command ");
                A002.A02(str, AnonymousClass001.A0a(lRm.A00, A0k));
                if (!((Intent) list.remove(0)).equals(lRm.A00)) {
                    th = AnonymousClass001.A0N("Dequeue-d command is not the first.");
                    throw th;
                }
                lRm.A00 = null;
            }
            C4Ij c4Ij = ((C4Ih) lRm.A09).A01;
            LRl lRl = lRm.A07;
            synchronized (lRl.A02) {
                try {
                    A1O = AnonymousClass001.A1O(lRl.A03.isEmpty() ? 1 : 0);
                } catch (Throwable th) {
                    th = th;
                }
            }
            if (!A1O && list.isEmpty()) {
                synchronized (c4Ij.A01) {
                    try {
                        A1O2 = AnonymousClass001.A1O(c4Ij.A02.isEmpty() ? 1 : 0);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (!A1O2) {
                    4IS.A00().A02(str, "No more commands & intents.");
                    MC0 mc0 = lRm.A02;
                    if (mc0 != null) {
                        SystemAlarmService systemAlarmService = (SystemAlarmService) mc0;
                        systemAlarmService.A01 = true;
                        4IS.A00().A02(SystemAlarmService.A02, "All commands completed in dispatcher");
                        LinkedHashMap A1C = 1BK.A1C();
                        synchronized (KyC.A00) {
                            try {
                                A1C.putAll(KyC.A01);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        Iterator A0x = AnonymousClass001.A0x(A1C);
                        while (A0x.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0x);
                            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) A0z.getKey();
                            String A16 = 1BK.A16(A0z);
                            if (wakeLock != null && wakeLock.isHeld()) {
                                4IS.A00();
                                android.util.Log.w(KxF.A00, 0Pz.A0W("WakeLock held for ", A16));
                            }
                        }
                        systemAlarmService.stopSelf();
                    }
                }
            }
            if (!list.isEmpty()) {
                LRm.A01(lRm);
            }
        }
    }
}
