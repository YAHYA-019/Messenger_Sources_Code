package X;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.4Kp, reason: invalid class name */
/* loaded from: 4Kp.class */
public final class C4Kp implements Runnable {
    public Context A00;
    public 4IX A01;
    public C4Kl A04;
    public WorkDatabase A05;
    public C4Jj A06;
    public 4JT A07;
    public C4Kf A08;
    public 4JS A09;
    public C4Ii A0B;
    public String A0C;
    public List A0D;
    public C4Ia A0E;
    public final String A0G;
    public static final String __redex_internal_original_name = "WorkerWrapper";
    public static final String A0I = 4IS.A01(__redex_internal_original_name);
    public C4Kr A02 = new C4Kq();
    public C4Ks A0A = new Object();
    public final C4Ks A0F = new Object();
    public volatile int A0H = -256;
    public C4Ky A03 = null;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.4Ks] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.4Ks] */
    public C4Kp(Context context, 4IX r303, C4Kl c4Kl, WorkDatabase workDatabase, C4Jj c4Jj, C4Kf c4Kf, C4Ii c4Ii, List list) {
        this.A00 = context;
        this.A0B = c4Ii;
        this.A06 = c4Jj;
        this.A08 = c4Kf;
        this.A0G = c4Kf.A0M;
        this.A04 = c4Kl;
        this.A01 = r303;
        this.A0E = r303.A02;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A0E();
        this.A07 = this.A05.A09();
        this.A0D = list;
    }

    private void A00() {
        boolean z;
        4JS r0 = this.A09;
        String str = this.A0G;
        C4Kb BC8 = r0.BC8(str);
        C4Kb c4Kb = C4Kb.RUNNING;
        4IS A00 = 4IS.A00();
        String str2 = A0I;
        if (BC8 == c4Kb) {
            A00.A02(str2, 0Pz.A0j("Status for ", str, " is RUNNING; not doing any work and rescheduling for later execution"));
            z = true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Status for ");
            sb.append(str);
            sb.append(" is ");
            sb.append(BC8);
            sb.append(" ; not doing any work");
            A00.A02(str2, sb.toString());
            z = false;
        }
        A02(z);
    }

    private void A01() {
        WorkDatabase workDatabase = this.A05;
        workDatabase.A07();
        try {
            String str = this.A0G;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                4JS r0 = this.A09;
                if (r0.BC8(str2) != C4Kb.CANCELLED) {
                    r0.Cuo(C4Kb.FAILED, str2);
                }
                linkedList.addAll(this.A07.AhM(str2));
            }
            C4Kc c4Kc = ((C4Kq) this.A02).A00;
            4JS r02 = this.A09;
            r02.Cho(str, this.A08.A00);
            r02.Cs9(c4Kc, str);
            workDatabase.A08();
        } finally {
            C4Il.A01(workDatabase);
            A02(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    private void A02(boolean z) {
        WorkDatabase workDatabase = this.A05;
        workDatabase.A07();
        try {
            4KU A0E = workDatabase.A0E();
            boolean z2 = false;
            TreeMap treeMap = 4KC.A08;
            4KE A00 = 4KF.A00("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            C4Il c4Il = A0E.A02;
            c4Il.A06();
            Cursor A02 = c4Il.A02(A00);
            try {
                if (A02.moveToFirst()) {
                    if (A02.getInt(0) != 0) {
                        z2 = true;
                    }
                }
                A02.close();
                A00.A00();
                if (!z2) {
                    C4Jp.A00(this.A00, RescheduleReceiver.class, false);
                }
                if (z) {
                    4JS r0 = this.A09;
                    C4Kb c4Kb = C4Kb.ENQUEUED;
                    String str = this.A0G;
                    r0.Cuo(c4Kb, str);
                    r0.Cut(str, this.A0H);
                    r0.Bcd(str, -1);
                }
                workDatabase.A08();
                C4Il.A01(workDatabase);
                this.A0A.A06(Boolean.valueOf(z));
            } catch (Throwable th) {
                A02.close();
                A00.A00();
                throw th;
            }
        } catch (Throwable th2) {
            C4Il.A01(workDatabase);
            throw th2;
        }
    }

    public static boolean A03(C4Kp c4Kp) {
        if (c4Kp.A0H == -256) {
            return false;
        }
        4IS.A00().A02(A0I, 0Pz.A0W("Work interrupted for ", c4Kp.A0C));
        if (c4Kp.A09.BC8(c4Kp.A0G) == null) {
            c4Kp.A02(false);
            return true;
        }
        c4Kp.A02(!r0.A00());
        return true;
    }

    public void A04() {
        boolean z;
        C4Kf c4Kf;
        4KU r0;
        C4Il c4Il;
        4KB r324;
        4KD A00;
        if (A03(this)) {
            return;
        }
        WorkDatabase workDatabase = this.A05;
        workDatabase.A07();
        try {
            4KU r02 = this.A09;
            String str = this.A0G;
            C4Kb BC8 = r02.BC8(str);
            workDatabase.A0D().AMb(str);
            if (BC8 == null) {
                z = false;
            } else {
                if (BC8 != C4Kb.RUNNING) {
                    if (!BC8.A00()) {
                        this.A0H = -512;
                        workDatabase.A07();
                        z = true;
                        r02.Cuo(C4Kb.ENQUEUED, str);
                        r02.CqO(str, System.currentTimeMillis());
                        r02.Cho(str, this.A08.A00);
                    }
                    workDatabase.A08();
                }
                C4Kr c4Kr = this.A02;
                try {
                    if (c4Kr instanceof C4P3) {
                        4IS.A00();
                        String str2 = A0I;
                        android.util.Log.i(str2, 0Pz.A0W("Worker result SUCCESS for ", this.A0C));
                        c4Kf = this.A08;
                        if (c4Kf.A06 == 0) {
                            workDatabase.A07();
                            z = false;
                            r02.Cuo(C4Kb.SUCCEEDED, str);
                            r02.Cs9(((C4P3) this.A02).A00, str);
                            long currentTimeMillis = System.currentTimeMillis();
                            4JT r03 = this.A07;
                            Iterator it = r03.AhM(str).iterator();
                            while (it.hasNext()) {
                                String A0i = AnonymousClass001.A0i(it);
                                if (r02.BC8(A0i) == C4Kb.BLOCKED) {
                                    C4Kz c4Kz = (C4Kz) r03;
                                    boolean z2 = true;
                                    TreeMap treeMap = 4KC.A08;
                                    4KE A002 = 4KF.A00("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                    if (A0i == null) {
                                        A002.ACC(1);
                                    } else {
                                        A002.ACG(1, A0i);
                                    }
                                    C4Il c4Il2 = c4Kz.A01;
                                    c4Il2.A06();
                                    boolean z3 = false;
                                    Cursor A02 = c4Il2.A02(A002);
                                    try {
                                        if (A02.moveToFirst()) {
                                            if (A02.getInt(0) == 0) {
                                                z2 = false;
                                            }
                                            z3 = z2;
                                        }
                                        A02.close();
                                        A002.A00();
                                        if (z3) {
                                            4IS.A00();
                                            android.util.Log.i(str2, 0Pz.A0W("Setting status to enqueued for ", A0i));
                                            r02.Cuo(C4Kb.ENQUEUED, A0i);
                                            r02.CqO(A0i, currentTimeMillis);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        A02.close();
                                        A002.A00();
                                        throw th;
                                    }
                                }
                            }
                            workDatabase.A08();
                            C4Il.A01(workDatabase);
                        }
                    } else {
                        boolean z4 = c4Kr instanceof C3098Jj0;
                        4IS.A00();
                        String str3 = A0I;
                        if (z4) {
                            android.util.Log.i(str3, 0Pz.A0W("Worker result RETRY for ", this.A0C));
                            workDatabase.A07();
                            z = true;
                            r02.Cuo(C4Kb.ENQUEUED, str);
                            r02.CqO(str, System.currentTimeMillis());
                            r02.Cho(str, this.A08.A00);
                        } else {
                            android.util.Log.i(str3, 0Pz.A0W("Worker result FAILURE for ", this.A0C));
                            c4Kf = this.A08;
                            if (c4Kf.A06 == 0) {
                                A01();
                                workDatabase.A08();
                            }
                        }
                    }
                    A00.ARM();
                    c4Il.A08();
                    C4Il.A01(c4Il);
                    r324.A02(A00);
                    r02.Cho(str, c4Kf.A00);
                    c4Il.A06();
                    r324 = r0.A03;
                    A00 = r324.A00();
                    A00.ACG(1, str);
                    c4Il.A07();
                    A00.ARM();
                    c4Il.A08();
                    C4Il.A01(c4Il);
                    r324.A02(A00);
                } catch (Throwable th2) {
                    th = th2;
                    C4Il.A01(c4Il);
                    r324.A02(A00);
                    throw th;
                }
                workDatabase.A07();
                z = false;
                r02.CqO(str, System.currentTimeMillis());
                r02.Cuo(C4Kb.ENQUEUED, str);
                r0 = r02;
                c4Il = r0.A02;
                c4Il.A06();
                r324 = r0.A06;
                A00 = r324.A00();
                A00.ACG(1, str);
                c4Il.A07();
                r02.Bcd(str, -1);
                workDatabase.A08();
                C4Il.A01(workDatabase);
            }
            A02(z);
            workDatabase.A08();
        } catch (Throwable th3) {
            A02(z);
            throw th3;
        } finally {
            C4Il.A01(workDatabase);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        if (r0 > 0) goto L35;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.work.impl.WorkDatabase, X.4Il] */
    /* JADX WARN: Type inference failed for: r0v100, types: [int, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v101, types: [int, java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v102, types: [int, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v103, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.4Il] */
    /* JADX WARN: Type inference failed for: r0v110, types: [int, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.util.Iterator, X.4Kd, boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.Map$Entry, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object, X.4Kd] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Class<java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r0v133, types: [X.4Kd] */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v135, types: [java.lang.Class<java.lang.Byte>] */
    /* JADX WARN: Type inference failed for: r0v136, types: [java.lang.Class<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v137, types: [java.lang.Class<java.lang.Long>] */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.lang.Class<java.lang.Float>] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.Class<java.lang.Double>] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.4Kf, X.4Kb, X.4Il] */
    /* JADX WARN: Type inference failed for: r0v140, types: [java.lang.Class<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v141, types: [java.lang.Class<java.lang.Boolean[]>] */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.lang.Class<java.lang.Byte[]>] */
    /* JADX WARN: Type inference failed for: r0v143, types: [java.lang.Class<java.lang.Integer[]>] */
    /* JADX WARN: Type inference failed for: r0v144, types: [java.lang.Class<java.lang.Long[]>] */
    /* JADX WARN: Type inference failed for: r0v145, types: [java.lang.Class<java.lang.Float[]>] */
    /* JADX WARN: Type inference failed for: r0v146, types: [java.lang.Class<java.lang.Double[]>] */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.lang.Class<java.lang.String[]>] */
    /* JADX WARN: Type inference failed for: r0v151, types: [X.4Kc] */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v157, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v158, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v164, types: [X.4Kc] */
    /* JADX WARN: Type inference failed for: r0v169, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int, X.4Kf] */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v171, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v177, types: [X.4Kc] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.4Kf, long] */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v183, types: [int] */
    /* JADX WARN: Type inference failed for: r0v184, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v190, types: [X.4Kc] */
    /* JADX WARN: Type inference failed for: r0v195, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v196, types: [long] */
    /* JADX WARN: Type inference failed for: r0v197, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.StringBuilder, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v203, types: [X.4Kc] */
    /* JADX WARN: Type inference failed for: r0v208, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v209, types: [float] */
    /* JADX WARN: Type inference failed for: r0v210, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v214, types: [java.lang.StringBuilder, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v218, types: [X.4Kc] */
    /* JADX WARN: Type inference failed for: r0v223, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v224, types: [double] */
    /* JADX WARN: Type inference failed for: r0v225, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v228, types: [java.util.List, X.4Kd] */
    /* JADX WARN: Type inference failed for: r0v231, types: [java.util.Iterator, boolean] */
    /* JADX WARN: Type inference failed for: r0v235, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v236, types: [boolean, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v239, types: [java.util.AbstractCollection, java.lang.Object, X.4Kc] */
    /* JADX WARN: Type inference failed for: r0v248, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v250, types: [X.4Kl, X.4Kf] */
    /* JADX WARN: Type inference failed for: r0v251, types: [int, X.4Kf] */
    /* JADX WARN: Type inference failed for: r0v256, types: [X.4Ii, X.4Ic, androidx.work.impl.WorkDatabase] */
    /* JADX WARN: Type inference failed for: r0v258, types: [X.4Jj, X.4Ii, androidx.work.impl.WorkDatabase] */
    /* JADX WARN: Type inference failed for: r0v260, types: [java.util.Collection, androidx.work.WorkerParameters, java.lang.Object, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r0v261, types: [java.util.HashSet, X.4YH, X.4Kl, int, X.4Ii, java.util.concurrent.Executor, X.4Ic, androidx.work.WorkerParameters, java.util.Set, X.MEe] */
    /* JADX WARN: Type inference failed for: r0v266, types: [X.4Ky, X.4Il, boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272, types: [X.4Il] */
    /* JADX WARN: Type inference failed for: r0v276, types: [X.4Ky, androidx.work.WorkerParameters] */
    /* JADX WARN: Type inference failed for: r0v277, types: [android.content.Context, X.4Ky, X.4Ii, X.4Kf, X.MEe] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.4IS, java.lang.String, X.4Il, boolean] */
    /* JADX WARN: Type inference failed for: r0v280, types: [java.util.concurrent.Executor, java.lang.Runnable, X.JRq] */
    /* JADX WARN: Type inference failed for: r0v284, types: [com.google.common.util.concurrent.ListenableFuture, java.util.concurrent.Executor, java.lang.Object, X.4Kt, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v285, types: [com.google.common.util.concurrent.ListenableFuture, java.util.concurrent.Executor, java.lang.Runnable, X.4Od] */
    /* JADX WARN: Type inference failed for: r0v287, types: [X.4Ih, X.4Oe] */
    /* JADX WARN: Type inference failed for: r0v288, types: [X.4Ij, java.util.concurrent.Executor, X.4Kt, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.4Kf, X.4Il] */
    /* JADX WARN: Type inference failed for: r0v293, types: [int, X.4KB, X.4KD, X.4KS, java.lang.String, X.4Il] */
    /* JADX WARN: Type inference failed for: r0v296, types: [int, X.4JS, float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v298 */
    /* JADX WARN: Type inference failed for: r0v300, types: [X.4Kf, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v303, types: [android.content.Context, X.4Kf] */
    /* JADX WARN: Type inference failed for: r0v304, types: [android.content.Context, X.4Ic, androidx.work.WorkerParameters, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int, X.4Kf] */
    /* JADX WARN: Type inference failed for: r0v313, types: [X.4Kf, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v316, types: [X.4IS, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v320, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v321, types: [java.lang.StringBuilder, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v323 */
    /* JADX WARN: Type inference failed for: r0v324 */
    /* JADX WARN: Type inference failed for: r0v326 */
    /* JADX WARN: Type inference failed for: r0v329 */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.4Kf, X.4Ie] */
    /* JADX WARN: Type inference failed for: r0v330 */
    /* JADX WARN: Type inference failed for: r0v331 */
    /* JADX WARN: Type inference failed for: r0v332 */
    /* JADX WARN: Type inference failed for: r0v333 */
    /* JADX WARN: Type inference failed for: r0v334 */
    /* JADX WARN: Type inference failed for: r0v335 */
    /* JADX WARN: Type inference failed for: r0v336 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Class[], java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object[], java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.4Kf, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.AbstractCollection, java.lang.Object, X.4Kc] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v60, types: [int, java.util.TreeMap, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v61, types: [int, X.4KU, X.4KC, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v65, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.4KC, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Iterator, java.lang.StringBuilder, java.lang.Object, boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.util.AbstractCollection, java.util.Collection, X.4KC, boolean, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.Iterator, boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.util.Iterator, boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Class, java.lang.Object, boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [int, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.4Kp] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 2944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Kp.run():void");
    }
}
