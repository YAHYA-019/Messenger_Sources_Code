package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: X.4Ji, reason: invalid class name */
/* loaded from: 4Ji.class */
public final class C4Ji implements C4Jj {
    public static final String A0B = 4IS.A01("Processor");
    public Context A00;
    public WorkDatabase A02;
    public C4Ii A03;
    public 4IX A08;
    public java.util.Map A04 = new HashMap();
    public java.util.Map A05 = new HashMap();
    public Set A07 = new HashSet();
    public final List A0A = new ArrayList();
    public PowerManager.WakeLock A01 = null;
    public final Object A09 = new Object();
    public java.util.Map A06 = new HashMap();

    public C4Ji(Context context, 4IX r303, WorkDatabase workDatabase, C4Ii c4Ii) {
        this.A00 = context;
        this.A08 = r303;
        this.A03 = c4Ii;
        this.A02 = workDatabase;
    }

    public static C4Kp A00(C4Ji c4Ji, String str) {
        C4Kp c4Kp = (C4Kp) c4Ji.A05.remove(str);
        boolean z = true;
        if (c4Kp == null) {
            z = false;
            c4Kp = (C4Kp) c4Ji.A04.remove(str);
        }
        c4Ji.A06.remove(str);
        if (!z) {
            return c4Kp;
        }
        synchronized (c4Ji.A09) {
            if (!(!r0.isEmpty())) {
                Context context = c4Ji.A00;
                Intent intent = new Intent(context, (Class<?>) ServiceC3019Jgi.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    context.startService(intent);
                } catch (Throwable th) {
                    4IS.A00();
                    android.util.Log.e(A0B, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = c4Ji.A01;
                if (wakeLock != null) {
                    0Iz.A01(wakeLock);
                    c4Ji.A01 = null;
                }
            }
        }
        return c4Kp;
    }

    public static boolean A01(C4Kp c4Kp, String str, int i) {
        if (c4Kp == null) {
            4IS.A00().A02(A0B, 0Pz.A0W("WorkerWrapper could not be found for ", str));
            return false;
        }
        c4Kp.A0H = i;
        C4Kp.A03(c4Kp);
        C4Ks c4Ks = c4Kp.A0F;
        c4Ks.cancel(true);
        if (c4Kp.A03 == null || !c4Ks.isCancelled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("WorkSpec ");
            sb.append(c4Kp.A08);
            sb.append(" is already done. Not interrupting.");
            4IS.A00().A02(C4Kp.A0I, sb.toString());
        } else {
            c4Kp.A03.stop(i);
        }
        4IS.A00().A02(A0B, 0Pz.A0W("WorkerWrapper interrupted for ", str));
        return true;
    }

    public void A02(4IR r302) {
        synchronized (this.A09) {
            this.A0A.add(r302);
        }
    }

    public void A03(4IR r302) {
        synchronized (this.A09) {
            this.A0A.remove(r302);
        }
    }

    public boolean A04(C4Kl c4Kl, C4Km c4Km) {
        C4Kl c4Kl2;
        final C4Ki c4Ki = c4Km.A00;
        String str = c4Ki.A01;
        ArrayList arrayList = new ArrayList();
        WorkDatabase workDatabase = this.A02;
        C4Kf c4Kf = (C4Kf) workDatabase.A04(new C4Xd(this, arrayList, str, 0));
        if (c4Kf == null) {
            4IS.A00();
            android.util.Log.w(A0B, AnonymousClass001.A0Z(c4Ki, "Didn't find WorkSpec for id ", AnonymousClass001.A0k()));
            ((C4Ih) this.A03).A02.execute(new Runnable() { // from class: X.4Wy
                public static final String __redex_internal_original_name = "Processor$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    C4Ji c4Ji = C4Ji.this;
                    C4Ki c4Ki2 = c4Ki;
                    synchronized (c4Ji.A09) {
                        Iterator it = c4Ji.A0A.iterator();
                        while (it.hasNext()) {
                            ((4IR) it.next()).Bwy(c4Ki2, false);
                        }
                    }
                }
            });
            return false;
        }
        synchronized (this.A09) {
            if (A05(str)) {
                Set set = (Set) this.A06.get(str);
                if (((C4Km) set.iterator().next()).A00.A00 == c4Ki.A00) {
                    set.add(c4Km);
                    4IS A00 = 4IS.A00();
                    String str2 = A0B;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Work ");
                    sb.append(c4Ki);
                    sb.append(" is already enqueued for processing");
                    A00.A02(str2, sb.toString());
                    return false;
                }
            } else if (c4Kf.A0K == c4Ki.A00) {
                Context context = this.A00;
                4IX r0 = this.A08;
                C4Ii c4Ii = this.A03;
                new C4Kl();
                Context applicationContext = context.getApplicationContext();
                if (c4Kl != null) {
                    c4Kl2 = c4Kl;
                }
                final C4Kp c4Kp = new C4Kp(applicationContext, r0, c4Kl2, workDatabase, this, c4Kf, c4Ii, arrayList);
                final C4Ks c4Ks = c4Kp.A0A;
                Runnable runnable = new Runnable() { // from class: X.4L0
                    public static final String __redex_internal_original_name = "Processor$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        C4Ji c4Ji = C4Ji.this;
                        ListenableFuture listenableFuture = c4Ks;
                        C4Kp c4Kp2 = c4Kp;
                        try {
                            z = ((Boolean) listenableFuture.get()).booleanValue();
                        } catch (InterruptedException | ExecutionException unused) {
                            z = true;
                        }
                        synchronized (c4Ji.A09) {
                            C4Ki A002 = C4Kh.A00(c4Kp2.A08);
                            String str3 = A002.A01;
                            C4Kp c4Kp3 = (C4Kp) c4Ji.A05.get(str3);
                            if (c4Kp3 == null) {
                                c4Kp3 = (C4Kp) c4Ji.A04.get(str3);
                            }
                            if (c4Kp3 == c4Kp2) {
                                C4Ji.A00(c4Ji, str3);
                            }
                            4IS A003 = 4IS.A00();
                            String str4 = C4Ji.A0B;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c4Ji.getClass().getSimpleName());
                            sb2.append(" ");
                            sb2.append(str3);
                            sb2.append(" executed; reschedule = ");
                            sb2.append(z);
                            A003.A02(str4, sb2.toString());
                            Iterator it = c4Ji.A0A.iterator();
                            while (it.hasNext()) {
                                ((4IR) it.next()).Bwy(A002, z);
                            }
                        }
                    }
                };
                C4Ih c4Ih = (C4Ih) c4Ii;
                c4Ks.addListener(runnable, c4Ih.A02);
                this.A04.put(str, c4Kp);
                HashSet hashSet = new HashSet();
                hashSet.add(c4Km);
                this.A06.put(str, hashSet);
                c4Ih.A01.execute(c4Kp);
                4IS A002 = 4IS.A00();
                String str3 = A0B;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getClass().getSimpleName());
                sb2.append(": processing ");
                sb2.append(c4Ki);
                A002.A02(str3, sb2.toString());
                return true;
            }
            ((C4Ih) this.A03).A02.execute(new Runnable() { // from class: X.4Wy
                public static final String __redex_internal_original_name = "Processor$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    C4Ji c4Ji = C4Ji.this;
                    C4Ki c4Ki2 = c4Ki;
                    synchronized (c4Ji.A09) {
                        Iterator it = c4Ji.A0A.iterator();
                        while (it.hasNext()) {
                            ((4IR) it.next()).Bwy(c4Ki2, false);
                        }
                    }
                }
            });
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (((X.C4Kp) r301.A04.get(r302)) != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = r0.A09
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            r0 = r301
            java.util.Map r0 = r0.A05     // Catch: java.lang.Throwable -> L44
            r304 = r0
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L44
            r304 = r0
            r0 = r304
            X.4Kp r0 = (X.C4Kp) r0     // Catch: java.lang.Throwable -> L44
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3c
            r0 = r301
            java.util.Map r0 = r0.A04     // Catch: java.lang.Throwable -> L44
            r304 = r0
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L44
            r305 = r0
            r0 = r305
            X.4Kp r0 = (X.C4Kp) r0     // Catch: java.lang.Throwable -> L44
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L3f
        L3c:
            r0 = 1
            r306 = r0
        L3f:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r0 = r306
            return r0
        L44:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Ji.A05(java.lang.String):boolean");
    }
}
