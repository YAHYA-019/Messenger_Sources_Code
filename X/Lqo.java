package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: Lqo.class */
public final class Lqo implements Runnable {
    public static final String __redex_internal_original_name = "WorkForegroundUpdater$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ KtB A01;
    public final /* synthetic */ JRp A02;
    public final /* synthetic */ C4Ks A03;
    public final /* synthetic */ UUID A04;

    public Lqo(Context context, KtB ktB, JRp jRp, C4Ks c4Ks, UUID uuid) {
        this.A02 = jRp;
        this.A03 = c4Ks;
        this.A04 = uuid;
        this.A01 = ktB;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        IllegalStateException th;
        try {
            C4Ks c4Ks = this.A03;
            if (!c4Ks.isCancelled()) {
                String obj = this.A04.toString();
                JRp jRp = this.A02;
                C4Kf BKy = jRp.A01.BKy(obj);
                if (BKy == null || BKy.A0E.A00()) {
                    th = AnonymousClass001.A0N("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    C4Jj c4Jj = jRp.A00;
                    KtB ktB = this.A01;
                    C4Ji c4Ji = (C4Ji) c4Jj;
                    synchronized (c4Ji.A09) {
                        try {
                            4IS.A00();
                            android.util.Log.i(C4Ji.A0B, 0Pz.A0j("Moving WorkSpec (", obj, ") to the foreground"));
                            C4Kp c4Kp = (C4Kp) c4Ji.A04.remove(obj);
                            if (c4Kp != null) {
                                if (c4Ji.A01 == null) {
                                    PowerManager.WakeLock A00 = KxF.A00(c4Ji.A00, "ProcessorForegroundLck");
                                    c4Ji.A01 = A00;
                                    0Iz.A00(A00);
                                }
                                c4Ji.A05.put(obj, c4Kp);
                                Context context = c4Ji.A00;
                                C4Ki A002 = C4Kh.A00(c4Kp.A08);
                                Intent A0D = C3o5.A0D(context, ServiceC3019Jgi.class);
                                A0D.setAction("ACTION_START_FOREGROUND");
                                A0D.putExtra("KEY_WORKSPEC_ID", A002.A01);
                                A0D.putExtra("KEY_GENERATION", A002.A00);
                                A0D.putExtra("KEY_NOTIFICATION_ID", ktB.A01);
                                A0D.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ktB.A00);
                                A0D.putExtra("KEY_NOTIFICATION", ktB.A02);
                                11T.A0F(context, 0);
                                ComponentName startForegroundService = context.startForegroundService(A0D);
                                Iterator it = C01w.A00.iterator();
                                while (it.hasNext()) {
                                    ((C01f) it.next()).D1k(startForegroundService, A0D);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Context context2 = this.A00;
                    C4Ki A003 = C4Kh.A00(BKy);
                    Intent A0D2 = C3o5.A0D(context2, ServiceC3019Jgi.class);
                    A0D2.setAction("ACTION_NOTIFY");
                    A0D2.putExtra("KEY_NOTIFICATION_ID", ktB.A01);
                    A0D2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ktB.A00);
                    A0D2.putExtra("KEY_NOTIFICATION", ktB.A02);
                    A0D2.putExtra("KEY_WORKSPEC_ID", A003.A01);
                    A0D2.putExtra("KEY_GENERATION", A003.A00);
                    context2.startService(A0D2);
                }
                throw th;
            }
            c4Ks.A06(null);
        } catch (Throwable th3) {
            this.A03.A07(th3);
        }
    }
}
