package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.facebook.acra.constants.ActionId;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.internal.gtm.zzce;
import com.google.android.gms.internal.gtm.zzcj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: K6k.class */
public final class K6k extends K6n {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final K6i A03;
    public final K6m A04;
    public final L2H A05;
    public final zzcj A06;
    public final K6l A07;
    public final L2H A08;
    public final L22 A09;

    public K6k(L9t l9t) {
        super(l9t);
        this.A06 = new zzcj(l9t);
        this.A04 = new K6m(l9t);
        this.A07 = new K6l(l9t);
        this.A03 = new K6i(l9t);
        this.A09 = new L22(((LCw) this).A00.A04);
        this.A08 = new K6p(l9t, this);
        this.A05 = new K6q(l9t, this);
    }

    private final void A00() {
        K6f k6f = ((LCw) this).A00.A0B;
        L9t.A02(k6f);
        if (!k6f.A01 || k6f.A02) {
            return;
        }
        L0g.A00();
        A0I();
        try {
            K6m k6m = this.A04;
            L0g.A00();
            k6m.A0I();
            long A01 = K6m.A01(k6m, K6m.A04, null);
            if (A01 == 0 || Math.abs(System.currentTimeMillis() - A01) > AnonymousClass001.A05(Kz3.A0J.A00)) {
                return;
            }
            Object obj = Kz3.A0I.A00;
            A0D("Dispatch alarm scheduled (ms)", obj);
            k6f.A0I();
            AbstractC00481b7.A09(k6f.A01, "Receiver not registered");
            long A05 = AnonymousClass001.A05(obj);
            if (A05 > 0) {
                k6f.A0J();
                L9t l9t = ((LCw) k6f).A00;
                SystemClock.elapsedRealtime();
                k6f.A02 = true;
                LCw.A0A(k6f, "Scheduling upload with JobScheduler", 2);
                Context context = l9t.A00;
                ComponentName componentName = new ComponentName(context, "com.google.android.gms.analytics.AnalyticsJobService");
                Integer num = k6f.A00;
                if (num == null) {
                    num = Integer.valueOf(JQy.A0s("analytics", context.getPackageName()).hashCode());
                    k6f.A00 = num;
                }
                int intValue = num.intValue();
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                JobInfo build = new JobInfo.Builder(intValue, componentName).setMinimumLatency(A05).setOverrideDeadline(A05 << 1).setExtras(persistableBundle).build();
                k6f.A0D("Scheduling job. JobID", Integer.valueOf(intValue));
                ((JobScheduler) context.getSystemService("jobscheduler")).schedule(build);
            }
        } catch (SQLiteException e) {
            A0G("Failed to get min/max hit times from local store", e);
        }
    }

    private final void A01() {
        L2H l2h = this.A08;
        if (l2h.A02 != 0) {
            LCw.A0A(this, "All hits dispatched or no network/service. Going to power save mode", 2);
        }
        l2h.A02 = 0L;
        L2H.A00(l2h).removeCallbacks(l2h.A01);
        K6f k6f = ((LCw) this).A00.A0B;
        L9t.A02(k6f);
        if (k6f.A02) {
            k6f.A0J();
        }
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [X.K1j, X.L7x, java.lang.Object] */
    public static final void A02(KlA klA, K6k k6k, K1m k1m) {
        AbstractC00481b7.A02(klA);
        AbstractC00481b7.A02(k1m);
        L9t l9t = ((LCw) k6k).A00;
        K1o k1o = new K1o(l9t);
        String str = klA.A02;
        AbstractC00481b7.A04(str);
        AbstractC00481b7.A04(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(TraceFieldType.Uri);
        builder.authority("google-analytics.com");
        builder.path(str);
        Uri build = builder.build();
        L8Q l8q = ((KjY) k1o).A00;
        List list = l8q.A08;
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (build.equals(((MIt) listIterator.next()).DCF())) {
                listIterator.remove();
            }
        }
        L9t l9t2 = k1o.A01;
        list.add(new K6Z(l9t2, str));
        k1o.A00 = klA.A04;
        L8Q l8q2 = new L8Q(l8q);
        K6d k6d = l9t2.A07;
        L9t.A02(k6d);
        k6d.A0I();
        l8q2.A02(k6d.A00);
        K6a k6a = l9t2.A0A;
        k6a.A0I();
        DisplayMetrics A0I = 7zO.A0I(L9t.A00(k6a).A01);
        ?? obj = new Object();
        obj.A05 = L6G.A01(Locale.getDefault());
        obj.A01 = A0I.widthPixels;
        obj.A02 = A0I.heightPixels;
        l8q2.A02((L7x) obj);
        Iterator it = ((KjY) k1o).A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("zza");
        }
        K1l k1l = (K1l) l8q2.A01(K1l.class);
        k1l.A01 = "data";
        k1l.A07 = true;
        l8q2.A02(k1m);
        K1d k1d = (K1d) l8q2.A01(K1d.class);
        K1n k1n = (K1n) l8q2.A01(K1n.class);
        Iterator A0y = AnonymousClass001.A0y(klA.A03);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            String A16 = 1BK.A16(A0z);
            if ("an".equals(A0j)) {
                k1n.A00 = A16;
            } else if ("av".equals(A0j)) {
                k1n.A01 = A16;
            } else if ("aid".equals(A0j)) {
                k1n.A02 = A16;
            } else if ("aiid".equals(A0j)) {
                k1n.A03 = A16;
            } else if (ErrorReportingConstants.USER_ID_KEY.equals(A0j)) {
                k1l.A03 = A16;
            } else {
                AbstractC00481b7.A04(A0j);
                if (A0j != null && A0j.startsWith("&")) {
                    A0j = A0j.substring(1);
                }
                AbstractC00481b7.A06(A0j, "Name can not be empty or \"&\"");
                k1d.A00.put(A0j, A16);
            }
        }
        LCw.A09(k6k, str, k1m, (Object) null, "Sending installation campaign to", 3);
        K6h k6h = l9t.A0D;
        L9t.A02(k6h);
        l8q2.A01 = k6h.A0J();
        L0g l0g = l8q2.A07.A01;
        if (l8q2.A04) {
            throw AnonymousClass001.A0N("Measurement prototype can't be submitted");
        }
        if (l8q2.A03) {
            throw AnonymousClass001.A0N("Measurement can only be submitted once");
        }
        L8Q l8q3 = new L8Q(l8q2);
        l8q3.A02 = SystemClock.elapsedRealtime();
        long j = l8q3.A01;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        l8q3.A00 = j;
        l8q3.A03 = true;
        l0g.A02.execute(new LoW(l8q3, l0g));
    }

    public static final void A03(K6k k6k) {
        if (k6k.A02 || !AnonymousClass001.A1V(Kz3.A0C.A00)) {
            return;
        }
        K6i k6i = k6k.A03;
        L0g.A00();
        k6i.A0I();
        if (k6i.A00 == null) {
            long A05 = AnonymousClass001.A05(Kz3.A08.A00);
            L22 l22 = k6k.A09;
            if (l22.A00(A05)) {
                l22.A00 = SystemClock.elapsedRealtime();
                LCw.A0A(k6k, "Connecting to service", 2);
                L0g.A00();
                k6i.A0I();
                if (k6i.A00 == null) {
                    LFj lFj = k6i.A01;
                    L0g.A00();
                    Intent A0A = 4YU.A0A("com.google.android.gms.analytics.service.START");
                    DKD.A18(A0A, "com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService");
                    K6i k6i2 = lFj.A02;
                    Context context = ((LCw) k6i2).A00.A00;
                    A0A.putExtra(AnonymousClass000.A00(49), context.getPackageName());
                    C2B7 A00 = C2B7.A00();
                    synchronized (lFj) {
                        lFj.A00 = null;
                        lFj.A01 = true;
                        boolean A03 = A00.A03(context, A0A, k6i2.A01, ActionId.MESSENGER_QUEUE_CREATION);
                        k6i2.A0D("Bind to service requested", Boolean.valueOf(A03));
                        if (!A03) {
                            lFj.A01 = false;
                            return;
                        }
                        try {
                            lFj.wait(JQx.A0R(Kz3.A07.A00));
                        } catch (InterruptedException unused) {
                            LCw.A0A(k6i2, "Wait for service connect was interrupted", 5);
                        }
                        lFj.A01 = false;
                        zzce zzceVar = lFj.A00;
                        lFj.A00 = null;
                        if (zzceVar == null) {
                            LCw.A0A(k6i2, "Successfully bound to service but never got onServiceConnected callback", 6);
                        }
                        if (zzceVar == null) {
                            return;
                        }
                        k6i.A00 = zzceVar;
                        K6i.A00(k6i);
                    }
                }
                LCw.A0A(k6k, "Connected to service", 2);
                l22.A00 = 0L;
                k6k.A0J();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0263, code lost:
    
        r301.A0G("Failed to remove hit that was send for delivery", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0274, code lost:
    
        if (r0.A0J() == false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0277, code lost:
    
        X.L0g.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x027c, code lost:
    
        r0.A0I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0281, code lost:
    
        r0 = ((X.LCw) r0).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0286, code lost:
    
        r0 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a3, code lost:
    
        if (r0.A00().isEmpty() != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02dc, code lost:
    
        if (r0.A00.A00(X.GOn.A09(X.Kz3.A01.A00) * 1000) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02eb, code lost:
    
        r0 = (java.lang.String) X.Kz3.A0R.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0302, code lost:
    
        if ("BATCH_BY_SESSION".equalsIgnoreCase(r0) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0305, code lost:
    
        r319 = X.KMI.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0386, code lost:
    
        r322 = X.1BK.A1V(r319, X.KMI.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b2, code lost:
    
        if ("GZIP".equalsIgnoreCase((java.lang.String) X.Kz3.A0S.A00) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03b5, code lost:
    
        r319 = X.KMG.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03bf, code lost:
    
        r329 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03c6, code lost:
    
        if (r319 == X.KMG.A02) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03e7, code lost:
    
        if (r322 == false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03f1, code lost:
    
        X.AbstractC00481b7.A07(X.7zM.A1b(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0415, code lost:
    
        X.LCw.A09(r0, java.lang.Boolean.valueOf(r329), X.1BK.A0k(r0), (java.lang.Object) null, "Uploading batched hits. compression, count", 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x041a, code lost:
    
        r336 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0421, code lost:
    
        r0 = new java.io.ByteArrayOutputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0429, code lost:
    
        r323 = X.AnonymousClass001.A0s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x042b, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x043d, code lost:
    
        if (r0.hasNext() == false) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0449, code lost:
    
        r0 = (X.L2Y) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0450, code lost:
    
        X.AbstractC00481b7.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0466, code lost:
    
        if ((r336 + 1) > r0.intValue()) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0473, code lost:
    
        r0 = X.K6l.A01(r0, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x047b, code lost:
    
        if (r0 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x047e, code lost:
    
        r319 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0485, code lost:
    
        X.L9t.A02(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x048d, code lost:
    
        r305 = "Error formatting hit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0493, code lost:
    
        r319.A0J(r0, r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04a9, code lost:
    
        r0 = r0.getBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04b0, code lost:
    
        r338 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04cc, code lost:
    
        if (r338 <= X.GOn.A09(X.Kz3.A0T.A00)) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04cf, code lost:
    
        r319 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04d6, code lost:
    
        X.L9t.A02(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04de, code lost:
    
        r305 = "Hit size exceeds the maximum size limit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04ec, code lost:
    
        if (r0.size() <= 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04ef, code lost:
    
        r338 = r338 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0516, code lost:
    
        if ((r0.size() + r338) > X.GOn.A09(X.Kz3.A0V.A00)) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0522, code lost:
    
        if (r0.size() <= 0) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x052c, code lost:
    
        r0.write(X.K6l.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0533, code lost:
    
        r0.write(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x053a, code lost:
    
        r336 = r336 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0541, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x054c, code lost:
    
        r0.A0G("Failed to write payload when batching hits", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0556, code lost:
    
        if (r336 == 0) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x058f, code lost:
    
        r0 = new java.net.URL(X.JQy.A0s(java.lang.String.valueOf((java.lang.String) X.Kz3.A0N.A00), X.Kz3.A0P.A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0596, code lost:
    
        r0 = r0.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x059d, code lost:
    
        if (r329 == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05a5, code lost:
    
        X.AbstractC00481b7.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05ab, code lost:
    
        r334 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05b4, code lost:
    
        r0.A00.getPackageName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x05bf, code lost:
    
        r0 = new java.io.ByteArrayOutputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05cb, code lost:
    
        r0 = new java.util.zip.GZIPOutputStream(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05d2, code lost:
    
        r0.write(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05d9, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05de, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05e3, code lost:
    
        r0 = r0.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05f1, code lost:
    
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05f6, code lost:
    
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05fd, code lost:
    
        r0 = r0 * 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x060a, code lost:
    
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x062f, code lost:
    
        X.LCw.A09(r0, r0, java.lang.Long.valueOf(r0 / r0), r0, "POST compressed size, ratio %, url", 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0638, code lost:
    
        if (r0 <= r0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0651, code lost:
    
        r0.A0C(r0, java.lang.Integer.valueOf(r0), "Compressed payload is larger then uncompressed. compressed, uncompressed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0673, code lost:
    
        if (android.util.Log.isLoggable((java.lang.String) X.Kz3.A0D.A00, 2) == false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0687, code lost:
    
        r0 = new java.lang.String(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0695, code lost:
    
        if (r0.length() == 0) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x069a, code lost:
    
        r305 = "\n".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06a5, code lost:
    
        r0.A0D("Post payload", r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x06bd, code lost:
    
        new java.lang.String("\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06ac, code lost:
    
        r324 = X.K6l.A02(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x06ca, code lost:
    
        r324.setDoOutput(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06e4, code lost:
    
        r324.addRequestProperty(X.AnonymousClass000.A00(com.facebook.acra.constants.ActionId.MESSENGER_THREAD_LIST_LOADED), "gzip");
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x06eb, code lost:
    
        r324.setFixedLengthStreamingMode(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06f7, code lost:
    
        X.0J3.A02(r324, 2141710880);
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0703, code lost:
    
        r0 = X.0J3.A01(r324, -1917917470);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0710, code lost:
    
        r0.write(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0717, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x071c, code lost:
    
        X.K6l.A03(r0, r324);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0723, code lost:
    
        r348 = r324.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x072c, code lost:
    
        if (r348 != 200) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x072f, code lost:
    
        X.K6n.A05(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0744, code lost:
    
        r0.A0E("POST status", java.lang.Integer.valueOf(r348));
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x074b, code lost:
    
        r324.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x07b6, code lost:
    
        if (200 == r348) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x07e1, code lost:
    
        r0 = java.lang.Integer.valueOf(r348);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x07f1, code lost:
    
        r0.A0D("Network error uploading hits. status code", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x080a, code lost:
    
        if (r0.A00().contains(r0) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0819, code lost:
    
        X.LCw.A0A(r0, "Server instructed the client to stop batching", 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x082c, code lost:
    
        r0.A00.A00 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0834, code lost:
    
        r323 = java.util.Collections.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0afb, code lost:
    
        r0.A0D("Batched upload completed. Hits batched", java.lang.Integer.valueOf(r336));
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0751, code lost:
    
        r319 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0753, code lost:
    
        r334 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0770, code lost:
    
        r0.A0F("Network compressed POST connection error", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0777, code lost:
    
        if (r334 != null) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0793, code lost:
    
        if (r324 != null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0796, code lost:
    
        r324.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x07ac, code lost:
    
        r348 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x077a, code lost:
    
        r334.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0782, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x078c, code lost:
    
        r0.A0G("Error closing http compressed post connection output stream", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0b89, code lost:
    
        r320 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0b96, code lost:
    
        if (r334 != null) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0bb7, code lost:
    
        if (r324 != null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0bba, code lost:
    
        r324.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0bd0, code lost:
    
        throw r320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0b99, code lost:
    
        r334.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0ba1, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0bab, code lost:
    
        r0.A0G("Error closing http compressed post connection output stream", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0b8e, code lost:
    
        r320 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0b90, code lost:
    
        r334 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x075a, code lost:
    
        r319 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0bb3, code lost:
    
        r320 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x075f, code lost:
    
        r319 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0761, code lost:
    
        r324 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0b84, code lost:
    
        r320 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x07a2, code lost:
    
        r348 = X.K6l.A00(r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x07bc, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x07c7, code lost:
    
        r0.A0G("Error trying to parse the hardcoded host url", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x07d9, code lost:
    
        X.LCw.A0A(r0, "Failed to build batching endpoint url", 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0b02, code lost:
    
        r0 = r323.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0b29, code lost:
    
        r316 = java.lang.Math.max(r316, X.JQx.A0R(r0.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0b39, code lost:
    
        r0.A0M(r323);
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0b44, code lost:
    
        r0.addAll(r323);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0b4d, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0b57, code lost:
    
        r301.A0G("Failed to remove successfully uploaded hits", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0839, code lost:
    
        r323 = X.1BL.A10(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0840, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0852, code lost:
    
        if (r0.hasNext() == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x085e, code lost:
    
        r0 = (X.L2Y) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0865, code lost:
    
        X.AbstractC00481b7.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x086c, code lost:
    
        r0 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x087b, code lost:
    
        r0 = X.K6l.A01(r0, r0, !r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0884, code lost:
    
        if (r0 != null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0887, code lost:
    
        r319 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x088e, code lost:
    
        X.L9t.A02(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0896, code lost:
    
        r305 = "Error formatting hit for upload";
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x089c, code lost:
    
        r319.A0J(r0, r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x08aa, code lost:
    
        X.4YU.A1W(r323, r0.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x08c1, code lost:
    
        if (r323.size() < r0.intValue()) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x08e5, code lost:
    
        if (r0.length() > X.GOn.A09(X.Kz3.A0Q.A00)) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x08ef, code lost:
    
        if (r0 == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0193, code lost:
    
        r301.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x08f2, code lost:
    
        r305 = X.Kz3.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x08fe, code lost:
    
        r0 = (java.lang.String) r305.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0911, code lost:
    
        r0 = (java.lang.String) X.Kz3.A0O.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0935, code lost:
    
        r0 = X.JQy.A0u(r0, (X.1BK.A02(r0) + 1) + X.1BK.A02(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0942, code lost:
    
        X.AnonymousClass001.A1D(r0, r0, "?", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0962, code lost:
    
        r0 = new java.net.URL(X.AnonymousClass001.A0d(r0, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0970, code lost:
    
        r0.A0E("GET request", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0976, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x097d, code lost:
    
        r0 = X.K6l.A02(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x098b, code lost:
    
        X.0J3.A02(r0, -1830811795);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0992, code lost:
    
        X.K6l.A03(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0999, code lost:
    
        r322 = r0.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x09a2, code lost:
    
        if (r322 != 200) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x09a5, code lost:
    
        X.K6n.A05(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x09ba, code lost:
    
        r0.A0E("GET status", java.lang.Integer.valueOf(r322));
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x09c1, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a8b, code lost:
    
        if (r322 != 200) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0bc2, code lost:
    
        r320 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0bc6, code lost:
    
        if (0 != 0) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0bc9, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0a91, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0a9c, code lost:
    
        r0.A0F("Network GET connection error", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0aa3, code lost:
    
        if (0 != 0) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0aa6, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0aae, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0ab9, code lost:
    
        r0.A0G("Error trying to parse the hardcoded host url", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0ac1, code lost:
    
        r319 = "Failed to build collect GET endpoint url";
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0ae3, code lost:
    
        X.LCw.A0A(r0, r319, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0953, code lost:
    
        r305 = X.Kz3.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x09d1, code lost:
    
        r0 = X.K6l.A01(r0, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x09d9, code lost:
    
        if (r0 != null) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x09dc, code lost:
    
        r319 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x09e3, code lost:
    
        X.L9t.A02(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x09eb, code lost:
    
        r305 = "Error formatting hit for POST upload";
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x09f0, code lost:
    
        r0 = r0.getBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0a13, code lost:
    
        if (r0.length <= X.GOn.A09(X.Kz3.A0U.A00)) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0a16, code lost:
    
        r319 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0a1d, code lost:
    
        X.L9t.A02(r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0a25, code lost:
    
        r305 = "Hit payload exceeds size limit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0a2c, code lost:
    
        if (r0 == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0a32, code lost:
    
        r305 = X.Kz3.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0a80, code lost:
    
        r322 = X.K6l.A00(r0, new java.net.URL(X.JQy.A0s(java.lang.String.valueOf((java.lang.String) r305.A00), (java.lang.String) X.Kz3.A0O.A00)), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0ac6, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0ad1, code lost:
    
        r0.A0G("Error trying to parse the hardcoded host url", r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0ad9, code lost:
    
        r319 = "Failed to build collect POST endpoint url";
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0a3a, code lost:
    
        r305 = X.Kz3.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x03da, code lost:
    
        r329 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x03cc, code lost:
    
        r319 = X.KMG.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0322, code lost:
    
        if ("BATCH_BY_TIME".equalsIgnoreCase(r0) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0325, code lost:
    
        r319 = X.KMI.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0199, code lost:
    
        X.L0g.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x033d, code lost:
    
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(r0) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0340, code lost:
    
        r319 = X.KMI.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0358, code lost:
    
        if ("BATCH_BY_COUNT".equalsIgnoreCase(r0) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x035b, code lost:
    
        r319 = X.KMI.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0373, code lost:
    
        if ("BATCH_BY_SIZE".equalsIgnoreCase(r0) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0376, code lost:
    
        r319 = X.KMI.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x037e, code lost:
    
        r319 = X.KMI.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x03d4, code lost:
    
        r322 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0b68, code lost:
    
        if (r0.isEmpty() == false) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0b6b, code lost:
    
        r0.A0I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019d, code lost:
    
        r0.A0I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0b77, code lost:
    
        r0.A0J().setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x00fc, code lost:
    
        X.LCw.A0A(r301, "Store is empty, nothing to dispatch", 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0101, code lost:
    
        r301.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0c09, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0c0b, code lost:
    
        r301.A0G("Failed to commit local dispatch transaction", r319);
        r301.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0c19, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ab, code lost:
    
        if (r0.A00 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b6, code lost:
    
        X.LCw.A0A(r301, "Service connected, sending hits to the service", 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c3, code lost:
    
        if (r0.isEmpty() != false) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d4, code lost:
    
        r0 = (X.L2Y) r0.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e8, code lost:
    
        if (r0.A0K(r0) == false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01eb, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f4, code lost:
    
        r316 = java.lang.Math.max(r316, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fd, code lost:
    
        r0.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020b, code lost:
    
        r301.A0E("Hit sent do device AnalyticsService for delivery", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0210, code lost:
    
        X.L0g.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0215, code lost:
    
        r0.A0I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021b, code lost:
    
        r0 = X.AnonymousClass001.A0t(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0222, code lost:
    
        r0 = java.lang.Long.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022b, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x023e, code lost:
    
        r0.A0D("Deleting hit, id", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0245, code lost:
    
        r0.A0M(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0250, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0259, code lost:
    
        r319 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0bba A[Catch: all -> 0x0be8, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0be8, blocks: (B:10:0x00b0, B:12:0x00ba, B:14:0x00c1, B:16:0x00cd, B:18:0x00d4, B:21:0x00e1, B:22:0x00e8, B:597:0x00fc, B:599:0x0101, B:26:0x010c, B:28:0x0116, B:29:0x0130, B:30:0x0137, B:33:0x0145, B:34:0x014e, B:35:0x0155, B:40:0x016d, B:41:0x0174, B:43:0x018d, B:45:0x0193, B:56:0x0199, B:58:0x019d, B:60:0x01a3, B:64:0x01b6, B:66:0x01bc, B:70:0x01ce, B:71:0x01d4, B:73:0x01df, B:76:0x01eb, B:78:0x01f4, B:80:0x01fd, B:82:0x020b, B:84:0x0210, B:86:0x0215, B:88:0x021b, B:89:0x0222, B:91:0x022b, B:93:0x023e, B:94:0x0245, B:96:0x0250, B:100:0x0263, B:103:0x026b, B:106:0x0277, B:108:0x027c, B:110:0x0281, B:111:0x0286, B:113:0x0291, B:114:0x0298, B:117:0x02a6, B:118:0x02ad, B:119:0x02b2, B:120:0x02b9, B:122:0x02d3, B:125:0x02df, B:126:0x02e4, B:127:0x02eb, B:129:0x02f9, B:132:0x0305, B:133:0x030a, B:135:0x038f, B:136:0x0394, B:137:0x039b, B:139:0x03a9, B:142:0x03b5, B:143:0x03ba, B:148:0x03ea, B:149:0x03f1, B:151:0x03f8, B:152:0x03fd, B:154:0x0415, B:156:0x041c, B:157:0x0421, B:158:0x0426, B:160:0x042b, B:161:0x0432, B:164:0x0440, B:165:0x0449, B:166:0x0450, B:168:0x045b, B:172:0x0473, B:175:0x047e, B:176:0x0485, B:179:0x0493, B:181:0x049a, B:183:0x04a1, B:184:0x04a9, B:185:0x04b0, B:186:0x04b5, B:187:0x04ba, B:188:0x04c1, B:191:0x04cf, B:192:0x04d6, B:194:0x04e3, B:198:0x04f5, B:200:0x04ff, B:201:0x0504, B:202:0x050b, B:206:0x0519, B:209:0x0525, B:211:0x052c, B:213:0x0533, B:218:0x054c, B:222:0x0559, B:223:0x055e, B:224:0x0565, B:225:0x056c, B:226:0x0573, B:227:0x0578, B:229:0x0581, B:231:0x0588, B:233:0x058f, B:235:0x0596, B:239:0x05a5, B:328:0x074b, B:331:0x07e1, B:333:0x07f1, B:335:0x07f8, B:337:0x07ff, B:341:0x0819, B:343:0x0820, B:344:0x0825, B:346:0x082c, B:347:0x0831, B:349:0x0aeb, B:351:0x0afb, B:364:0x077a, B:361:0x0796, B:368:0x078c, B:379:0x0b99, B:375:0x0bba, B:377:0x0bd0, B:383:0x0bab, B:394:0x07a2, B:398:0x07c7, B:400:0x07d9, B:402:0x0b02, B:403:0x0b09, B:406:0x0b17, B:407:0x0b20, B:409:0x0b29, B:413:0x0b39, B:415:0x0b44, B:419:0x0b57, B:422:0x0839, B:423:0x0840, B:424:0x0847, B:427:0x0855, B:428:0x085e, B:429:0x0865, B:431:0x086c, B:433:0x087b, B:436:0x0887, B:437:0x088e, B:440:0x089c, B:442:0x08a3, B:444:0x08aa, B:446:0x08b1, B:447:0x08b6, B:452:0x08c7, B:453:0x08ce, B:454:0x08d3, B:455:0x08da, B:460:0x08f2, B:461:0x08f7, B:462:0x08fe, B:463:0x0905, B:464:0x090a, B:465:0x0911, B:466:0x0918, B:468:0x0925, B:470:0x0935, B:472:0x0942, B:473:0x0949, B:475:0x095b, B:477:0x0962, B:479:0x0970, B:497:0x09c1, B:510:0x0aa6, B:505:0x0bc9, B:514:0x0ab9, B:517:0x0ae3, B:518:0x0953, B:520:0x09d1, B:523:0x09dc, B:524:0x09e3, B:526:0x09f0, B:527:0x09f7, B:528:0x09fc, B:529:0x0a01, B:530:0x0a08, B:533:0x0a16, B:534:0x0a1d, B:538:0x0a32, B:539:0x0a3f, B:540:0x0a46, B:541:0x0a4d, B:542:0x0a54, B:543:0x0a59, B:544:0x0a60, B:546:0x0a69, B:548:0x0a70, B:550:0x0a77, B:552:0x0a80, B:556:0x0ad1, B:558:0x0a3a, B:561:0x03cc, B:563:0x0319, B:566:0x0325, B:568:0x0334, B:571:0x0340, B:573:0x034f, B:576:0x035b, B:578:0x036a, B:581:0x0376, B:582:0x037e, B:584:0x0b5f, B:603:0x0128, B:482:0x097d, B:484:0x098b, B:485:0x0992, B:487:0x0999, B:490:0x09a5, B:493:0x09af, B:495:0x09ba, B:508:0x0a9c), top: B:9:0x00b0, outer: #13, inners: #1, #2, #4, #9, #11, #14, #15, #16, #18, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0b99 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0b17 A[Catch: all -> 0x0be8, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0be8, blocks: (B:10:0x00b0, B:12:0x00ba, B:14:0x00c1, B:16:0x00cd, B:18:0x00d4, B:21:0x00e1, B:22:0x00e8, B:597:0x00fc, B:599:0x0101, B:26:0x010c, B:28:0x0116, B:29:0x0130, B:30:0x0137, B:33:0x0145, B:34:0x014e, B:35:0x0155, B:40:0x016d, B:41:0x0174, B:43:0x018d, B:45:0x0193, B:56:0x0199, B:58:0x019d, B:60:0x01a3, B:64:0x01b6, B:66:0x01bc, B:70:0x01ce, B:71:0x01d4, B:73:0x01df, B:76:0x01eb, B:78:0x01f4, B:80:0x01fd, B:82:0x020b, B:84:0x0210, B:86:0x0215, B:88:0x021b, B:89:0x0222, B:91:0x022b, B:93:0x023e, B:94:0x0245, B:96:0x0250, B:100:0x0263, B:103:0x026b, B:106:0x0277, B:108:0x027c, B:110:0x0281, B:111:0x0286, B:113:0x0291, B:114:0x0298, B:117:0x02a6, B:118:0x02ad, B:119:0x02b2, B:120:0x02b9, B:122:0x02d3, B:125:0x02df, B:126:0x02e4, B:127:0x02eb, B:129:0x02f9, B:132:0x0305, B:133:0x030a, B:135:0x038f, B:136:0x0394, B:137:0x039b, B:139:0x03a9, B:142:0x03b5, B:143:0x03ba, B:148:0x03ea, B:149:0x03f1, B:151:0x03f8, B:152:0x03fd, B:154:0x0415, B:156:0x041c, B:157:0x0421, B:158:0x0426, B:160:0x042b, B:161:0x0432, B:164:0x0440, B:165:0x0449, B:166:0x0450, B:168:0x045b, B:172:0x0473, B:175:0x047e, B:176:0x0485, B:179:0x0493, B:181:0x049a, B:183:0x04a1, B:184:0x04a9, B:185:0x04b0, B:186:0x04b5, B:187:0x04ba, B:188:0x04c1, B:191:0x04cf, B:192:0x04d6, B:194:0x04e3, B:198:0x04f5, B:200:0x04ff, B:201:0x0504, B:202:0x050b, B:206:0x0519, B:209:0x0525, B:211:0x052c, B:213:0x0533, B:218:0x054c, B:222:0x0559, B:223:0x055e, B:224:0x0565, B:225:0x056c, B:226:0x0573, B:227:0x0578, B:229:0x0581, B:231:0x0588, B:233:0x058f, B:235:0x0596, B:239:0x05a5, B:328:0x074b, B:331:0x07e1, B:333:0x07f1, B:335:0x07f8, B:337:0x07ff, B:341:0x0819, B:343:0x0820, B:344:0x0825, B:346:0x082c, B:347:0x0831, B:349:0x0aeb, B:351:0x0afb, B:364:0x077a, B:361:0x0796, B:368:0x078c, B:379:0x0b99, B:375:0x0bba, B:377:0x0bd0, B:383:0x0bab, B:394:0x07a2, B:398:0x07c7, B:400:0x07d9, B:402:0x0b02, B:403:0x0b09, B:406:0x0b17, B:407:0x0b20, B:409:0x0b29, B:413:0x0b39, B:415:0x0b44, B:419:0x0b57, B:422:0x0839, B:423:0x0840, B:424:0x0847, B:427:0x0855, B:428:0x085e, B:429:0x0865, B:431:0x086c, B:433:0x087b, B:436:0x0887, B:437:0x088e, B:440:0x089c, B:442:0x08a3, B:444:0x08aa, B:446:0x08b1, B:447:0x08b6, B:452:0x08c7, B:453:0x08ce, B:454:0x08d3, B:455:0x08da, B:460:0x08f2, B:461:0x08f7, B:462:0x08fe, B:463:0x0905, B:464:0x090a, B:465:0x0911, B:466:0x0918, B:468:0x0925, B:470:0x0935, B:472:0x0942, B:473:0x0949, B:475:0x095b, B:477:0x0962, B:479:0x0970, B:497:0x09c1, B:510:0x0aa6, B:505:0x0bc9, B:514:0x0ab9, B:517:0x0ae3, B:518:0x0953, B:520:0x09d1, B:523:0x09dc, B:524:0x09e3, B:526:0x09f0, B:527:0x09f7, B:528:0x09fc, B:529:0x0a01, B:530:0x0a08, B:533:0x0a16, B:534:0x0a1d, B:538:0x0a32, B:539:0x0a3f, B:540:0x0a46, B:541:0x0a4d, B:542:0x0a54, B:543:0x0a59, B:544:0x0a60, B:546:0x0a69, B:548:0x0a70, B:550:0x0a77, B:552:0x0a80, B:556:0x0ad1, B:558:0x0a3a, B:561:0x03cc, B:563:0x0319, B:566:0x0325, B:568:0x0334, B:571:0x0340, B:573:0x034f, B:576:0x035b, B:578:0x036a, B:581:0x0376, B:582:0x037e, B:584:0x0b5f, B:603:0x0128, B:482:0x097d, B:484:0x098b, B:485:0x0992, B:487:0x0999, B:490:0x09a5, B:493:0x09af, B:495:0x09ba, B:508:0x0a9c), top: B:9:0x00b0, outer: #13, inners: #1, #2, #4, #9, #11, #14, #15, #16, #18, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0b6b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0bd1 A[EDGE_INSN: B:594:0x0bd1->B:46:0x0bd1 BREAK  A[LOOP:0: B:9:0x00b0->B:593:0x0b7e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v323, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A04(X.K6k r301) {
        /*
            Method dump skipped, instructions count: 3098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6k.A04(X.K6k):void");
    }

    public final void A0J() {
        L0g.A00();
        L0g.A00();
        A0I();
        if (!AnonymousClass001.A1V(Kz3.A0C.A00)) {
            LCw.A0A(this, "Service client disabled. Can't dispatch local hits to device AnalyticsService", 5);
        }
        K6i k6i = this.A03;
        L0g.A00();
        k6i.A0I();
        if (k6i.A00 == null) {
            LCw.A0A(this, "Service not connected", 2);
            return;
        }
        K6m k6m = this.A04;
        if (K6m.A00(k6m) == 0) {
            return;
        }
        LCw.A0A(this, "Dispatching local hits to device AnalyticsService", 2);
        while (true) {
            try {
                ArrayList A0K = k6m.A0K(AnonymousClass001.A03(Kz3.A0K.A00));
                if (A0K.isEmpty()) {
                    A0K();
                    return;
                }
                while (!A0K.isEmpty()) {
                    L2Y l2y = (L2Y) A0K.get(0);
                    if (!k6i.A0K(l2y)) {
                        A0K();
                        return;
                    }
                    A0K.remove(l2y);
                    try {
                        long j = l2y.A01;
                        L0g.A00();
                        k6m.A0I();
                        ArrayList A0t = AnonymousClass001.A0t(1);
                        Long valueOf = Long.valueOf(j);
                        A0t.add(valueOf);
                        k6m.A0D("Deleting hit, id", valueOf);
                        k6m.A0M(A0t);
                    } catch (SQLiteException e) {
                        A0G("Failed to remove hit that was send for delivery", e);
                        A01();
                        return;
                    }
                }
            } catch (SQLiteException e2) {
                A0G("Failed to read hits from store", e2);
                A01();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0129, code lost:
    
        if (r0.isConnected() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01f0, code lost:
    
        if (r320 > 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K() {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6k.A0K():void");
    }
}
