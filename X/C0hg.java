package X;

import android.app.Application;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0hg, reason: invalid class name */
/* loaded from: 0hg.class */
public final class C0hg {
    public static C0hg A0p;
    public static final String A0q = C0jF.A00("mobile", "reliability_event_log_upload").toString();
    public 0gK A00;
    public 0jH A01;
    public C15h A03;
    public C15h A04;
    public C15h A05;
    public C15h A06;
    public C15h A08;
    public C15h A09;
    public C15h A0A;
    public C15h A0B;
    public C15h A0C;
    public C15h A0D;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final Application A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final C15h A0O;
    public final C15h A0P;
    public final C15h A0Q;
    public final C15h A0R;
    public final C15h A0S;
    public final C15h A0T;
    public final C15h A0U;
    public final C15h A0V;
    public final C15h A0Y;
    public final C15h A0Z;
    public final C15h A0a;
    public final C15h A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0k;
    public final boolean A0l;
    public final 0WF A0m;
    public final List A0n;
    public final boolean A0o;
    public Integer A02 = null;
    public final C15h A0b = new C0u5(this, 7);
    public final C15h A0X = new C0u5(this, 8);
    public final C15h A0W = new C0u7(1);
    public C15h A07 = null;
    public final boolean A0j = true;
    public final int A0E = 3;

    public C0hg(Application application, 0WF r303, List list, List list2, List list3, List list4, C15h c15h, C15h c15h2, C15h c15h3, C15h c15h4, C15h c15h5, C15h c15h6, C15h c15h7, C15h c15h8, C15h c15h9, C15h c15h10, C15h c15h11, C15h c15h12, C15h c15h13, C15h c15h14, int i, int i2, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A0K = application;
        this.A0R = c15h2;
        this.A0c = c15h3;
        this.A0P = c15h4;
        this.A0O = c15h5;
        this.A0U = c15h6;
        this.A0n = list;
        this.A0L = list2;
        this.A0M = list3;
        this.A0N = list4;
        this.A0a = c15h7;
        this.A0S = c15h8;
        this.A0Y = c15h9;
        this.A0T = c15h11;
        this.A06 = c15h10;
        this.A0C = c15h12;
        this.A0I = j2;
        this.A0Z = c15h;
        this.A0Q = c15h13;
        this.A0V = c15h14;
        this.A0d = z;
        this.A0J = j3;
        this.A0H = j;
        this.A0G = i;
        this.A0o = z2;
        this.A0m = r303;
        this.A0e = z3;
        this.A0i = z4;
        this.A0l = z5;
        this.A0h = z6;
        this.A0F = i2;
        this.A0k = z7;
        this.A0g = z8;
        A0p = this;
        C0iy.A00().ClV(C15h.A01(c15h));
        this.A0f = z9;
    }

    public static void A00(C0hg c0hg) {
        0T9.A02("FixedLengthFiles.init", -1318890884);
        try {
            0hG A00 = 0hG.A00("collector");
            Application application = c0hg.A0K;
            A00.A03(application, 8, 15000);
            0hG.A00("reports").A03(application, 6, 60000);
            0T9.A00(149659373);
        } catch (Throwable th) {
            0T9.A00(-1127841538);
            throw th;
        }
    }

    public static void A01(final C0hg c0hg) {
        (C0gp.A00 == 2 ? 0hE.A03 : 0hE.A01()).execute(new Runnable() { // from class: X.0he
            public static final String __redex_internal_original_name = "LacrimaConfig$$ExternalSyntheticLambda6";

            @Override // java.lang.Runnable
            public final void run() {
                C0hg.A05(C0hg.this, false);
            }
        });
    }

    public static void A02(C0hg c0hg) {
        for (C0ha c0ha : c0hg.A0n) {
            int CBI = C0iy.A00().CBI("earlyJavaInit");
            Integer Ayi = c0ha.Ayi();
            c0hg.A02 = Ayi;
            c0ha.BOm(c0hg);
            if (CBI != -1) {
                HashMap A0u = AnonymousClass001.A0u();
                C0iy.A01("ConfigName", 0G9.A00(Ayi), A0u).CBH(CBI, A0u);
            }
        }
    }

    public static void A03(C0hg c0hg, String str, Throwable th) {
        0T9.A02("maybeReportSoftError", -690615394);
        try {
            if (Math.random() < 0.001d) {
                DirectReports.A01(C15h.A02(c0hg.A0c), C15h.A02(c0hg.A0P), C15h.A02(c0hg.A0O), C15h.A02(c0hg.A0a), "lacrima", str, th);
            }
            0T9.A00(-565048285);
        } catch (Throwable th2) {
            0T9.A00(-629597592);
            throw th2;
        }
    }

    public static void A04(C0hg c0hg, boolean z) {
        0T9.A02("sendPendingReports", -1286667353);
        int CBI = C0iy.A00().CBI("earlyJavaInit");
        try {
            int length = c0hg.A07().A04("").length;
            0fH.A0g(Integer.valueOf(length), "lacrima", "Number of session dirs: %d");
            if ((!c0hg.A0o || length <= 6) && !z) {
                c0hg.A08();
            } else {
                0fH.A0n("lacrima", "Send pending reports blocking");
                A05(c0hg, true);
                if (Math.random() < 0.001d) {
                    DirectReports.A02(C15h.A02(c0hg.A0c), C15h.A02(c0hg.A0P), C15h.A02(c0hg.A0O), C15h.A02(c0hg.A0a), "lacrima", "Send reports blocking", null);
                }
            }
            if (CBI != -1) {
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("ConfigName", "SendPendingIfCrashLoop");
                C0iy.A01("ForceBlocking", String.valueOf(z), A0u).CBH(CBI, A0u);
            }
            0T9.A00(312004908);
        } catch (Throwable th) {
            if (CBI != -1) {
                HashMap A0u2 = AnonymousClass001.A0u();
                A0u2.put("ConfigName", "SendPendingIfCrashLoop");
                C0iy.A01("ForceBlocking", String.valueOf(z), A0u2).CBH(CBI, A0u2);
            }
            0T9.A00(-1228190880);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x02cb, code lost:
    
        if (r0.A09 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02d4, code lost:
    
        r0 = java.lang.Math.max(0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02db, code lost:
    
        r315 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02df, code lost:
    
        if (r315 >= r0) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02e4, code lost:
    
        r0 = r0[r315];
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02f7, code lost:
    
        X.0fH.A0g(r0.getName(), "lacrima", "   %s");
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02fe, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x030e, code lost:
    
        monitor-enter(X.C0h9.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0314, code lost:
    
        X.0Xq.A00("deleteTooOldSessions");
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0320, code lost:
    
        if (r0.exists() == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0342, code lost:
    
        if (r0.lastModified() >= (java.lang.System.currentTimeMillis() - 604800000)) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x034a, code lost:
    
        r0 = X.C0h9.A05.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x035a, code lost:
    
        if (r0.hasNext() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x035d, code lost:
    
        r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0372, code lost:
    
        throw X.AnonymousClass001.A0Q("onDeleteSession");
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0377, code lost:
    
        X.C0h9.A00(r0, r0, "collector");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x037c, code lost:
    
        X.0Xp.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0385, code lost:
    
        X.0Xp.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x038e, code lost:
    
        r307 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0390, code lost:
    
        X.0Xp.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0395, code lost:
    
        throw r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x039e, code lost:
    
        r310 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x03b9, code lost:
    
        X.C0iy.A02("lacrima", "Failed to delete session dir", r310).Bwu("SessMgrDeleteSessDir", r310, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(X.C0hg r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 1523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0hg.A05(X.0hg, boolean):void");
    }

    public 0gK A06() {
        0RZ.A03(this.A00, "Did you call earlyInit()?");
        return this.A00;
    }

    public 0jH A07() {
        0RZ.A03(this.A01, "Did you call earlyInit()?");
        return this.A01;
    }

    public void A08() {
        0fH.A0n("lacrima", "Sending pending reports");
        C0j7 c0j7 = (C0j7) this.A0X.get();
        c0j7.A02(C0gq.CRITICAL_REPORT, false);
        c0j7.A02(C0gq.LARGE_REPORT, false);
        c0j7.A03(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if ("browser".equals(r0) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A09() {
        /*
            r301 = this;
            r0 = r301
            X.0WF r0 = r0.A0m
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L31
            r0 = r302
            X.0pv r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r303 = r0
            java.lang.String r0 = ""
            r302 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L31
            java.lang.String r0 = "browser"
            r1 = r303
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r305
            if (r0 == 0) goto L33
        L31:
            r0 = 1
            r304 = r0
        L33:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0hg.A09():boolean");
    }
}
