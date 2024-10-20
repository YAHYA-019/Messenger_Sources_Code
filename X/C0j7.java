package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0j7, reason: invalid class name */
/* loaded from: 0j7.class */
public final class C0j7 {
    public static int A0L;
    public static boolean A0M;
    public 0Gc A00;
    public ScheduledExecutorService A01;
    public C15h A02;
    public final int A03;
    public final Context A04;
    public final C0h9 A05;
    public final 0pX A06;
    public final C0j6 A07;
    public final Runnable A08;
    public final Set A09;
    public final Executor A0A;
    public final AtomicInteger A0B;
    public final C15h A0C;
    public final C15h A0D;
    public final C15h A0E;
    public final C15h A0F;
    public final C15h A0G;
    public final C15h A0H;
    public final C15h A0I;
    public final boolean A0J;
    public final boolean A0K;

    public C0j7(Context context, C0h9 c0h9, 0pX r304, Runnable runnable, Executor executor, C15h c15h, C15h c15h2, C15h c15h3, C15h c15h4, C15h c15h5, C15h c15h6, C15h c15h7, C15h c15h8, boolean z, boolean z2) {
        C0j6 c0j6 = new C0j6();
        this.A09 = AnonymousClass001.A0v();
        this.A0B = new AtomicInteger();
        this.A04 = context;
        this.A0I = c15h;
        this.A0D = c15h2;
        this.A0C = c15h3;
        this.A0F = c15h4;
        this.A0G = c15h6;
        this.A05 = c0h9;
        this.A0A = executor;
        this.A08 = runnable;
        this.A0E = c15h7;
        this.A0H = c15h8;
        this.A03 = c15h7 == null ? 3 : 1;
        this.A06 = r304;
        this.A07 = c0j6;
        this.A0J = z;
        this.A0K = z2;
        if (z2) {
            this.A02 = c15h5;
        } else {
            this.A00 = (0Gc) c15h5.get();
        }
    }

    private int A00(File file) {
        File[] listFiles = file.listFiles(new C0op(3));
        int length = (listFiles == null ? 0 : listFiles.length) + 1;
        AnonymousClass001.A0D(file, 0Pz.A0T("_attempt", length)).createNewFile();
        if (C0iw.A04 && (file.getName().startsWith("critical_anr_app_death") || file.getName().startsWith("critical_unexplained") || file.getName().startsWith("critical_java_app_death") || file.getName().startsWith("critical_native"))) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("count", String.valueOf(length));
            A0u.put("report_id", file.getName());
            C0iw.A00("ReportSender.attempt", A0u);
        }
        return length;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x029d A[Catch: all -> 0x066f, IOException -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x066f, blocks: (B:5:0x002b, B:7:0x0034, B:8:0x003a, B:11:0x0046, B:15:0x0054, B:18:0x005d, B:20:0x006b, B:21:0x006f, B:21:0x006f, B:24:0x0078, B:26:0x0081, B:27:0x0087, B:30:0x0093, B:34:0x00a1, B:37:0x00aa, B:38:0x00af, B:40:0x00b4, B:40:0x00b4, B:44:0x00bb, B:93:0x024e, B:98:0x0247, B:139:0x0226, B:140:0x0291, B:143:0x029d, B:144:0x02a4, B:146:0x02ab, B:147:0x02b0, B:149:0x02c1, B:153:0x02d3, B:155:0x02dd, B:157:0x02f1, B:159:0x02fd, B:164:0x0329, B:166:0x0333, B:168:0x0347, B:169:0x034e, B:174:0x035d, B:178:0x0373, B:180:0x0380, B:182:0x0387, B:185:0x0391, B:187:0x0398, B:188:0x039d, B:188:0x039d, B:191:0x03ac, B:193:0x03b6, B:195:0x03c1, B:199:0x03d0, B:201:0x03dd, B:204:0x03e7, B:206:0x03f4, B:207:0x03fb, B:211:0x040a, B:212:0x0411, B:214:0x0418, B:216:0x0430, B:217:0x0435, B:218:0x043b, B:221:0x0451, B:226:0x04a0, B:229:0x04c9, B:232:0x04d3, B:234:0x04dc, B:237:0x04e8, B:239:0x04f1, B:242:0x04fd, B:244:0x0506, B:247:0x0512, B:249:0x051b, B:253:0x052c, B:255:0x0535, B:257:0x053e, B:260:0x062f, B:261:0x0636, B:262:0x063e, B:264:0x0546, B:267:0x0554, B:270:0x055e, B:272:0x0567, B:275:0x0573, B:277:0x057c, B:280:0x0588, B:282:0x0591, B:285:0x059d, B:287:0x05a6, B:291:0x05b7, B:293:0x05c0, B:295:0x05c9, B:299:0x05d5, B:302:0x05e1, B:303:0x05ea, B:304:0x05f1, B:305:0x05f8, B:307:0x0621, B:309:0x0647, B:315:0x046b, B:316:0x0470, B:316:0x0470, B:320:0x0481, B:327:0x0422, B:328:0x0429, B:331:0x0305, B:332:0x030c, B:334:0x0313, B:342:0x0265, B:345:0x027d, B:352:0x0652, B:353:0x0659, B:355:0x0668), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04c9 A[Catch: all -> 0x066f, IOException -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x066f, blocks: (B:5:0x002b, B:7:0x0034, B:8:0x003a, B:11:0x0046, B:15:0x0054, B:18:0x005d, B:20:0x006b, B:21:0x006f, B:21:0x006f, B:24:0x0078, B:26:0x0081, B:27:0x0087, B:30:0x0093, B:34:0x00a1, B:37:0x00aa, B:38:0x00af, B:40:0x00b4, B:40:0x00b4, B:44:0x00bb, B:93:0x024e, B:98:0x0247, B:139:0x0226, B:140:0x0291, B:143:0x029d, B:144:0x02a4, B:146:0x02ab, B:147:0x02b0, B:149:0x02c1, B:153:0x02d3, B:155:0x02dd, B:157:0x02f1, B:159:0x02fd, B:164:0x0329, B:166:0x0333, B:168:0x0347, B:169:0x034e, B:174:0x035d, B:178:0x0373, B:180:0x0380, B:182:0x0387, B:185:0x0391, B:187:0x0398, B:188:0x039d, B:188:0x039d, B:191:0x03ac, B:193:0x03b6, B:195:0x03c1, B:199:0x03d0, B:201:0x03dd, B:204:0x03e7, B:206:0x03f4, B:207:0x03fb, B:211:0x040a, B:212:0x0411, B:214:0x0418, B:216:0x0430, B:217:0x0435, B:218:0x043b, B:221:0x0451, B:226:0x04a0, B:229:0x04c9, B:232:0x04d3, B:234:0x04dc, B:237:0x04e8, B:239:0x04f1, B:242:0x04fd, B:244:0x0506, B:247:0x0512, B:249:0x051b, B:253:0x052c, B:255:0x0535, B:257:0x053e, B:260:0x062f, B:261:0x0636, B:262:0x063e, B:264:0x0546, B:267:0x0554, B:270:0x055e, B:272:0x0567, B:275:0x0573, B:277:0x057c, B:280:0x0588, B:282:0x0591, B:285:0x059d, B:287:0x05a6, B:291:0x05b7, B:293:0x05c0, B:295:0x05c9, B:299:0x05d5, B:302:0x05e1, B:303:0x05ea, B:304:0x05f1, B:305:0x05f8, B:307:0x0621, B:309:0x0647, B:315:0x046b, B:316:0x0470, B:316:0x0470, B:320:0x0481, B:327:0x0422, B:328:0x0429, B:331:0x0305, B:332:0x030c, B:334:0x0313, B:342:0x0265, B:345:0x027d, B:352:0x0652, B:353:0x0659, B:355:0x0668), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0546 A[Catch: all -> 0x066f, IOException -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x066f, blocks: (B:5:0x002b, B:7:0x0034, B:8:0x003a, B:11:0x0046, B:15:0x0054, B:18:0x005d, B:20:0x006b, B:21:0x006f, B:21:0x006f, B:24:0x0078, B:26:0x0081, B:27:0x0087, B:30:0x0093, B:34:0x00a1, B:37:0x00aa, B:38:0x00af, B:40:0x00b4, B:40:0x00b4, B:44:0x00bb, B:93:0x024e, B:98:0x0247, B:139:0x0226, B:140:0x0291, B:143:0x029d, B:144:0x02a4, B:146:0x02ab, B:147:0x02b0, B:149:0x02c1, B:153:0x02d3, B:155:0x02dd, B:157:0x02f1, B:159:0x02fd, B:164:0x0329, B:166:0x0333, B:168:0x0347, B:169:0x034e, B:174:0x035d, B:178:0x0373, B:180:0x0380, B:182:0x0387, B:185:0x0391, B:187:0x0398, B:188:0x039d, B:188:0x039d, B:191:0x03ac, B:193:0x03b6, B:195:0x03c1, B:199:0x03d0, B:201:0x03dd, B:204:0x03e7, B:206:0x03f4, B:207:0x03fb, B:211:0x040a, B:212:0x0411, B:214:0x0418, B:216:0x0430, B:217:0x0435, B:218:0x043b, B:221:0x0451, B:226:0x04a0, B:229:0x04c9, B:232:0x04d3, B:234:0x04dc, B:237:0x04e8, B:239:0x04f1, B:242:0x04fd, B:244:0x0506, B:247:0x0512, B:249:0x051b, B:253:0x052c, B:255:0x0535, B:257:0x053e, B:260:0x062f, B:261:0x0636, B:262:0x063e, B:264:0x0546, B:267:0x0554, B:270:0x055e, B:272:0x0567, B:275:0x0573, B:277:0x057c, B:280:0x0588, B:282:0x0591, B:285:0x059d, B:287:0x05a6, B:291:0x05b7, B:293:0x05c0, B:295:0x05c9, B:299:0x05d5, B:302:0x05e1, B:303:0x05ea, B:304:0x05f1, B:305:0x05f8, B:307:0x0621, B:309:0x0647, B:315:0x046b, B:316:0x0470, B:316:0x0470, B:320:0x0481, B:327:0x0422, B:328:0x0429, B:331:0x0305, B:332:0x030c, B:334:0x0313, B:342:0x0265, B:345:0x027d, B:352:0x0652, B:353:0x0659, B:355:0x0668), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0305 A[Catch: all -> 0x066f, IOException -> 0x0689, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x066f, blocks: (B:5:0x002b, B:7:0x0034, B:8:0x003a, B:11:0x0046, B:15:0x0054, B:18:0x005d, B:20:0x006b, B:21:0x006f, B:21:0x006f, B:24:0x0078, B:26:0x0081, B:27:0x0087, B:30:0x0093, B:34:0x00a1, B:37:0x00aa, B:38:0x00af, B:40:0x00b4, B:40:0x00b4, B:44:0x00bb, B:93:0x024e, B:98:0x0247, B:139:0x0226, B:140:0x0291, B:143:0x029d, B:144:0x02a4, B:146:0x02ab, B:147:0x02b0, B:149:0x02c1, B:153:0x02d3, B:155:0x02dd, B:157:0x02f1, B:159:0x02fd, B:164:0x0329, B:166:0x0333, B:168:0x0347, B:169:0x034e, B:174:0x035d, B:178:0x0373, B:180:0x0380, B:182:0x0387, B:185:0x0391, B:187:0x0398, B:188:0x039d, B:188:0x039d, B:191:0x03ac, B:193:0x03b6, B:195:0x03c1, B:199:0x03d0, B:201:0x03dd, B:204:0x03e7, B:206:0x03f4, B:207:0x03fb, B:211:0x040a, B:212:0x0411, B:214:0x0418, B:216:0x0430, B:217:0x0435, B:218:0x043b, B:221:0x0451, B:226:0x04a0, B:229:0x04c9, B:232:0x04d3, B:234:0x04dc, B:237:0x04e8, B:239:0x04f1, B:242:0x04fd, B:244:0x0506, B:247:0x0512, B:249:0x051b, B:253:0x052c, B:255:0x0535, B:257:0x053e, B:260:0x062f, B:261:0x0636, B:262:0x063e, B:264:0x0546, B:267:0x0554, B:270:0x055e, B:272:0x0567, B:275:0x0573, B:277:0x057c, B:280:0x0588, B:282:0x0591, B:285:0x059d, B:287:0x05a6, B:291:0x05b7, B:293:0x05c0, B:295:0x05c9, B:299:0x05d5, B:302:0x05e1, B:303:0x05ea, B:304:0x05f1, B:305:0x05f8, B:307:0x0621, B:309:0x0647, B:315:0x046b, B:316:0x0470, B:316:0x0470, B:320:0x0481, B:327:0x0422, B:328:0x0429, B:331:0x0305, B:332:0x030c, B:334:0x0313, B:342:0x0265, B:345:0x027d, B:352:0x0652, B:353:0x0659, B:355:0x0668), top: B:4:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.0GX r301, final X.C0j7 r302, final X.0jA r303, final java.io.File r304) {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0j7.A01(X.0GX, X.0j7, X.0jA, java.io.File):boolean");
    }

    public void A02(C0gq c0gq, boolean z) {
        0Xq.A00(0Pz.A0j("sendPendingReports.", c0gq.name(), z ? ".blocking" : ""));
        if (z) {
            try {
                0fH.A17("lacrima", "Send pending reports blocking %s", new Object[]{c0gq.prefix});
            } finally {
                0Xp.A00();
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.A0A.execute(new 0gE(c0gq, this, countDownLatch));
        if (z) {
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
                0fH.A0n("lacrima", "Send pending reports done");
            } catch (InterruptedException e) {
                C0iy.A00().Bwu("ReportSenderSendPending", e, null);
            }
        }
    }

    public void A03(boolean z) {
        0Xq.A00("cleanupSentReports");
        if (z) {
            try {
                0fH.A0n("lacrima", "Cleanup sent reports blocking");
            } finally {
                0Xp.A00();
            }
        }
        final CountDownLatch A11 = AnonymousClass001.A11();
        0hE.A01().execute(new Runnable() { // from class: X.0j3
            public static final String __redex_internal_original_name = "ReportSender$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C0j7 c0j7 = C0j7.this;
                CountDownLatch countDownLatch = A11;
                if (c0j7.A07.A00("cleanup")) {
                    return;
                }
                File file = ((C0j1) c0j7.A0G.get()).A01;
                try {
                    c0j7.A05.A03();
                } catch (IOException e) {
                    C0iy.A00().Bwu("ReportSenderCleanup", e, null);
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        try {
                            File[] listFiles2 = file2.listFiles(new C0op(3));
                            int length = listFiles2 == null ? 0 : listFiles2.length;
                            C0h9 c0h9 = c0j7.A05;
                            boolean z2 = false;
                            if (length >= c0j7.A03) {
                                z2 = true;
                                c0j7.A08.run();
                            }
                            if (new File(file2, "_sent").exists() || z2) {
                                if (C0j7.A0M) {
                                    0fH.A17("lacrima", "Would have deleted: %s", new Object[]{file2.getPath()});
                                } else if (new File(file2, "_sent").exists()) {
                                    synchronized (C0h9.class) {
                                        Iterator it = C0h9.A05.iterator();
                                        while (it.hasNext()) {
                                            it.next();
                                        }
                                        C0h9.A00(c0h9, file2, "reports");
                                    }
                                } else if (z2) {
                                    c0h9.A04(file2);
                                }
                            }
                        } catch (IOException e2) {
                            C0iy.A02("lacrima", "Error while deleting report directory", e2).Bwu("ReportSenderPurge", e2, null);
                        }
                    }
                    countDownLatch.countDown();
                }
            }
        });
        if (z) {
            try {
                A11.await(10, TimeUnit.SECONDS);
                0fH.A0n("lacrima", "Cleanup sent reports done");
            } catch (InterruptedException e) {
                C0iy.A00().Bwu("ReportSenderBlockingCleanup", e, null);
            }
        }
    }
}
