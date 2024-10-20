package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: Lk3.class */
public final class Lk3 implements Runnable {
    public static final String __redex_internal_original_name = "SystemAlarmDispatcher$1";
    public final /* synthetic */ LRm A00;

    public Lk3(LRm lRm) {
        this.A00 = lRm;
    }

    @Override // java.lang.Runnable
    public void run() {
        4IS A00;
        StringBuilder A0k;
        List<C4Km> A02;
        Executor executor;
        Runnable runnable;
        LRm lRm = this.A00;
        List list = lRm.A0A;
        synchronized (list) {
            lRm.A00 = (Intent) list.get(0);
        }
        Intent intent = lRm.A00;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = lRm.A00.getIntExtra("KEY_START_ID", 0);
            4IS A002 = 4IS.A00();
            String str = LRm.A0B;
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("Processing command ");
            A0k2.append(lRm.A00);
            A002.A02(str, AnonymousClass001.A0e(", ", A0k2, intExtra));
            Context context = lRm.A03;
            StringBuilder A0n = AnonymousClass001.A0n(action);
            A0n.append(" (");
            A0n.append(intExtra);
            PowerManager.WakeLock A003 = KxF.A00(context, AnonymousClass001.A0d(")", A0n));
            try {
                4IS A004 = 4IS.A00();
                StringBuilder A0k3 = AnonymousClass001.A0k();
                A0k3.append("Acquiring operation wake lock (");
                A0k3.append(action);
                A004.A02(str, AnonymousClass001.A0Z(A003, ") ", A0k3));
                0Iz.A00(A003);
                LRl lRl = lRm.A07;
                Intent intent2 = lRm.A00;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    4IS.A00().A02(LRl.A05, AnonymousClass001.A0Z(intent2, "Handling constraints changed ", AnonymousClass001.A0k()));
                    Context context2 = lRl.A00;
                    4IU r0 = lRm.A06;
                    C4Jw c4Jw = new C4Jw(r0.A09);
                    ArrayList B8v = r0.A04.A0E().B8v();
                    Iterator it = B8v.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (it.hasNext()) {
                        C4Ke c4Ke = ((C4Kf) it.next()).A0B;
                        z |= c4Ke.A04;
                        z2 |= c4Ke.A05;
                        z3 |= c4Ke.A07;
                        z4 |= 1BK.A1V(c4Ke.A02, 0S2.A00);
                        if (z && z2 && z3 && z4) {
                            break;
                        }
                    }
                    Intent A0A = 4YU.A0A("androidx.work.impl.background.systemalarm.UpdateProxies");
                    A0A.setComponent(new ComponentName(context2, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    A0A.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
                    context2.sendBroadcast(A0A);
                    ArrayList A10 = 1BL.A10(B8v);
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it2 = B8v.iterator();
                    while (it2.hasNext()) {
                        C4Kf c4Kf = (C4Kf) it2.next();
                        if (currentTimeMillis >= c4Kf.A00() && (!7zL.A1X(C4Ke.A08, c4Kf.A0B) || c4Jw.A00(c4Kf))) {
                            A10.add(c4Kf);
                        }
                    }
                    Iterator it3 = A10.iterator();
                    while (it3.hasNext()) {
                        C4Kf c4Kf2 = (C4Kf) it3.next();
                        String str2 = c4Kf2.A0M;
                        C4Ki A005 = C4Kh.A00(c4Kf2);
                        Intent A0D = C3o5.A0D(context2, SystemAlarmService.class);
                        A0D.setAction("ACTION_DELAY_MET");
                        LRl.A00(A0D, A005);
                        4IS.A00().A02(Ka3.A00, 0Pz.A0j("Creating a delay_met command for workSpec with id (", str2, ")"));
                        LrV.A00(A0D, lRm, ((C4Ih) lRm.A09).A02, intExtra);
                    }
                } else if ("ACTION_RESCHEDULE".equals(action2)) {
                    4IS A006 = 4IS.A00();
                    String str3 = LRl.A05;
                    StringBuilder A0k4 = AnonymousClass001.A0k();
                    A0k4.append("Handling reschedule ");
                    A0k4.append(intent2);
                    A006.A02(str3, AnonymousClass001.A0e(", ", A0k4, intExtra));
                    lRm.A06.A05();
                } else {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                        4IS.A00();
                        android.util.Log.e(LRl.A05, 0Pz.A0z("Invalid request for ", action2, " , requires ", "KEY_WORKSPEC_ID", " ."));
                    } else if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                        C4Ki c4Ki = new C4Ki(intent2.getStringExtra("KEY_WORKSPEC_ID"), intent2.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                        4IS A007 = 4IS.A00();
                        String str4 = LRl.A05;
                        A007.A02(str4, AnonymousClass001.A0Z(c4Ki, "Handling schedule work for ", AnonymousClass001.A0k()));
                        WorkDatabase workDatabase = lRm.A06.A04;
                        workDatabase.A07();
                        try {
                            C4Kf BKy = workDatabase.A0E().BKy(c4Ki.A01);
                            if (BKy == null) {
                                4IS.A00();
                                android.util.Log.w(str4, AnonymousClass001.A0d(AbstractC00603o4.A00(319), AnonymousClass001.A0m(c4Ki, "Skipping scheduling ")));
                            } else if (BKy.A0E.A00()) {
                                4IS.A00();
                                android.util.Log.w(str4, AnonymousClass001.A0d("because it is finished.", AnonymousClass001.A0m(c4Ki, "Skipping scheduling ")));
                            } else {
                                long A008 = BKy.A00();
                                if (7zL.A1X(C4Ke.A08, BKy.A0B)) {
                                    4IS A009 = 4IS.A00();
                                    StringBuilder A0k5 = AnonymousClass001.A0k();
                                    JR0.A1D(c4Ki, "Opportunistically setting an alarm for ", "at ", A0k5);
                                    A009.A02(str4, AnonymousClass001.A0h(A0k5, A008));
                                    Context context3 = lRl.A00;
                                    L6P.A00(context3, workDatabase, c4Ki, A008);
                                    Intent A0D2 = C3o5.A0D(context3, SystemAlarmService.class);
                                    A0D2.setAction("ACTION_CONSTRAINTS_CHANGED");
                                    LrV.A00(A0D2, lRm, ((C4Ih) lRm.A09).A02, intExtra);
                                } else {
                                    4IS A0010 = 4IS.A00();
                                    StringBuilder A0k6 = AnonymousClass001.A0k();
                                    JR0.A1D(c4Ki, "Setting up Alarms for ", "at ", A0k6);
                                    A0010.A02(str4, AnonymousClass001.A0h(A0k6, A008));
                                    L6P.A00(lRl.A00, workDatabase, c4Ki, A008);
                                }
                                workDatabase.A08();
                            }
                            C4Il.A01(workDatabase);
                        } catch (Throwable th) {
                            th = th;
                            C4Il.A01(workDatabase);
                            throw th;
                        }
                    } else if ("ACTION_DELAY_MET".equals(action2)) {
                        synchronized (lRl.A02) {
                            try {
                                C4Ki c4Ki2 = new C4Ki(intent2.getStringExtra("KEY_WORKSPEC_ID"), intent2.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                                4IS A0011 = 4IS.A00();
                                String str5 = LRl.A05;
                                A0011.A02(str5, AnonymousClass001.A0Z(c4Ki2, "Handing delay met for ", AnonymousClass001.A0k()));
                                java.util.Map map = lRl.A03;
                                if (map.containsKey(c4Ki2)) {
                                    4IS A0012 = 4IS.A00();
                                    StringBuilder A0k7 = AnonymousClass001.A0k();
                                    A0k7.append("WorkSpec ");
                                    A0k7.append(c4Ki2);
                                    A0012.A02(str5, AnonymousClass001.A0d(" is is already being handled for ACTION_DELAY_MET", A0k7));
                                } else {
                                    final LRo lRo = new LRo(lRl.A00, lRl.A01.A01(c4Ki2), lRm, intExtra);
                                    map.put(c4Ki2, lRo);
                                    String str6 = lRo.A08.A01;
                                    Context context4 = lRo.A04;
                                    int i = lRo.A03;
                                    StringBuilder A0n2 = AnonymousClass001.A0n(str6);
                                    A0n2.append(" (");
                                    A0n2.append(i);
                                    lRo.A01 = KxF.A00(context4, AnonymousClass001.A0d(")", A0n2));
                                    4IS A0013 = 4IS.A00();
                                    String str7 = LRo.A0E;
                                    StringBuilder A0k8 = AnonymousClass001.A0k();
                                    A0k8.append("Acquiring wakelock ");
                                    A0k8.append(lRo.A01);
                                    A0013.A02(str7, 1BL.A0u("for WorkSpec ", str6, A0k8));
                                    0Iz.A00(lRo.A01);
                                    C4Kf BKy2 = lRo.A06.A06.A04.A0E().BKy(str6);
                                    if (BKy2 == null) {
                                        executor = lRo.A0A;
                                        new Lk1(lRo);
                                    } else {
                                        boolean A1X = 7zL.A1X(C4Ke.A08, BKy2.A0B);
                                        lRo.A02 = A1X;
                                        if (A1X) {
                                            lRo.A0D = KxE.A00(lRo, lRo.A07, BKy2, lRo.A0B);
                                        } else {
                                            4IS.A00().A02(str7, 0Pz.A0W("No constraints for ", str6));
                                            executor = lRo.A0A;
                                            new Runnable() { // from class: X.Lk2
                                                public static final String __redex_internal_original_name = "DelayMetCommandHandler$$ExternalSyntheticLambda1";

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    LRo lRo2 = lRo;
                                                    if (lRo2.A00 != 0) {
                                                        4IS A0014 = 4IS.A00();
                                                        String str8 = LRo.A0E;
                                                        StringBuilder A0k9 = AnonymousClass001.A0k();
                                                        A0k9.append("Already started work for ");
                                                        A0014.A02(str8, AnonymousClass001.A0a(lRo2.A08, A0k9));
                                                        return;
                                                    }
                                                    lRo2.A00 = 1;
                                                    4IS A0015 = 4IS.A00();
                                                    String str9 = LRo.A0E;
                                                    StringBuilder A0k10 = AnonymousClass001.A0k();
                                                    A0k10.append("onAllConstraintsMet for ");
                                                    C4Ki c4Ki3 = lRo2.A08;
                                                    A0015.A02(str9, AnonymousClass001.A0a(c4Ki3, A0k10));
                                                    LRm lRm2 = lRo2.A06;
                                                    if (!lRm2.A04.A04(null, lRo2.A05)) {
                                                        LRo.A00(lRo2);
                                                        return;
                                                    }
                                                    L2L l2l = lRm2.A08;
                                                    synchronized (l2l.A01) {
                                                        4IS.A00().A02(L2L.A04, AnonymousClass001.A0Z(c4Ki3, "Starting timer for ", AnonymousClass001.A0k()));
                                                        l2l.A00(c4Ki3);
                                                        Lmj lmj = new Lmj(c4Ki3, l2l);
                                                        l2l.A03.put(c4Ki3, lmj);
                                                        l2l.A02.put(c4Ki3, lRo2);
                                                        l2l.A00.Cjo(lmj, 600000L);
                                                    }
                                                }
                                            };
                                        }
                                    }
                                    executor.execute(runnable);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } else if ("ACTION_STOP_WORK".equals(action2)) {
                        Bundle extras2 = intent2.getExtras();
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                            int i2 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                            ArrayList A0t = AnonymousClass001.A0t(1);
                            C4Km A0014 = lRl.A01.A00(new C4Ki(string, i2));
                            A02 = A0t;
                            if (A0014 != null) {
                                A0t.add(A0014);
                                A02 = A0t;
                            }
                        } else {
                            A02 = lRl.A01.A02(string);
                        }
                        for (C4Km c4Km : A02) {
                            4IS.A00().A02(LRl.A05, 0Pz.A0W("Handing stopWork work for ", string));
                            C4Jr c4Jr = lRm.A05;
                            11T.A0F(c4Km, 1);
                            c4Jr.D31(c4Km, -512);
                            Context context5 = lRl.A00;
                            WorkDatabase workDatabase2 = lRm.A06.A04;
                            C4Ki c4Ki3 = c4Km.A00;
                            4JV A0B = workDatabase2.A0B();
                            C4Kj BE5 = A0B.BE5(c4Ki3);
                            if (BE5 != null) {
                                L6P.A01(context5, c4Ki3, BE5.A01);
                                4IS A0015 = 4IS.A00();
                                String str8 = L6P.A00;
                                StringBuilder A0k9 = AnonymousClass001.A0k();
                                A0k9.append("Removing SystemIdInfo for workSpecId (");
                                A0k9.append(c4Ki3);
                                A0015.A02(str8, AnonymousClass001.A0d(")", A0k9));
                                String str9 = c4Ki3.A01;
                                int i3 = c4Ki3.A00;
                                C4K9 c4k9 = (C4K9) A0B;
                                C4Il c4Il = c4k9.A00;
                                c4Il.A06();
                                4KB r02 = c4k9.A01;
                                4KS A0016 = r02.A00();
                                A0016.ACG(1, str9);
                                A0016.ACB(2, i3);
                                c4Il.A07();
                                try {
                                    A0016.ARM();
                                    c4Il.A08();
                                    C4Il.A01(c4Il);
                                    r02.A02(A0016);
                                } catch (Throwable th3) {
                                    th = th3;
                                    C4Il.A01(c4Il);
                                    r02.A02(A0016);
                                    throw th;
                                }
                            }
                            lRm.Bwy(c4Ki3, false);
                        }
                    } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                        C4Ki c4Ki4 = new C4Ki(intent2.getStringExtra("KEY_WORKSPEC_ID"), intent2.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                        boolean z5 = intent2.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                        4IS A0017 = 4IS.A00();
                        String str10 = LRl.A05;
                        StringBuilder A0k10 = AnonymousClass001.A0k();
                        A0k10.append("Handling onExecutionCompleted ");
                        A0k10.append(intent2);
                        A0017.A02(str10, AnonymousClass001.A0e(", ", A0k10, intExtra));
                        lRl.Bwy(c4Ki4, z5);
                    } else {
                        4IS.A00();
                        android.util.Log.w(LRl.A05, AnonymousClass001.A0Z(intent2, "Ignoring intent ", AnonymousClass001.A0k()));
                    }
                }
                A00 = 4IS.A00();
                A0k = AnonymousClass001.A0k();
                AnonymousClass001.A1D("Releasing operation wake lock (", action, ") ", A0k);
            } catch (Throwable th4) {
                try {
                    4IS.A00();
                    android.util.Log.e(str, "Unexpected error in onHandleIntent", th4);
                    A00 = 4IS.A00();
                    A0k = AnonymousClass001.A0k();
                    A0k.append("Releasing operation wake lock (");
                    A0k.append(action);
                    A0k.append(") ");
                } catch (Throwable th5) {
                    4IS A0018 = 4IS.A00();
                    StringBuilder A0k11 = AnonymousClass001.A0k();
                    A0k11.append("Releasing operation wake lock (");
                    A0k11.append(action);
                    A0018.A02(str, AnonymousClass001.A0Z(A003, ") ", A0k11));
                    0Iz.A01(A003);
                    ((C4Ih) lRm.A09).A02.execute(new Lk4(lRm));
                    throw th5;
                }
            }
            A00.A02(str, AnonymousClass001.A0a(A003, A0k));
            0Iz.A01(A003);
            ((C4Ih) lRm.A09).A02.execute(new Lk4(lRm));
        }
    }
}
