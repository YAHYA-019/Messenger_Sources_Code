package com.facebook.messenger.app;

import X.0FD;
import X.0GM;
import X.0Pz;
import X.0UN;
import X.0V7;
import X.0XQ;
import X.0XR;
import X.0XW;
import X.0Xb;
import X.0Xd;
import X.0Xh;
import X.0Xo;
import X.0Xp;
import X.0Xq;
import X.0Yj;
import X.0ZP;
import X.0Zi;
import X.0cA;
import X.0eB;
import X.0eC;
import X.0eE;
import X.0fH;
import X.0kO;
import X.0kQ;
import X.0lE;
import X.0lF;
import X.11T;
import X.AnonymousClass001;
import X.C00f;
import X.C04z;
import X.C0di;
import X.C0dj;
import X.C0ff;
import X.C0gp;
import X.C0iz;
import X.C0k1;
import X.C0kn;
import X.C0mj;
import X.C0t9;
import X.C0y3;
import X.C15i;
import X.C15j;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.katana.app.mainactivity.FbMainActivity;
import com.facebook.perf.background.BackgroundStartupDetector;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: MessengerApplication.class */
public class MessengerApplication extends 0Xb implements 0XW, C15i, 0V7, C0kn {
    public static boolean A06;
    public static final 0XQ A07 = new Object();
    public Intent A00;
    public MessengerSharedLibrariesErrorDelegate A01;
    public String A02;
    public final ConditionVariable A03;
    public final 0Xo A04;
    public volatile C00f A05;

    /* loaded from: MessengerApplication$MessengerSharedLibrariesErrorDelegate.class */
    public class MessengerSharedLibrariesErrorDelegate {
        public final MessengerApplication A00;

        public MessengerSharedLibrariesErrorDelegate(MessengerApplication messengerApplication) {
            this.A00 = messengerApplication;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0XQ] */
    static {
        C0dj.A01 = SystemClock.uptimeMillis();
    }

    public MessengerApplication() {
        this(0);
        0ZP.A01 = new 0Xo(C0mj.A00, 824316542);
        this.A04 = 0ZP.A01;
    }

    public MessengerApplication(int i) {
        this.A03 = new ConditionVariable();
        synchronized (A07) {
            if (A06) {
                Log.e("NonBlockingApp", "Multiple instances of the Application object were created.");
                System.exit(222);
            }
            A06 = true;
        }
    }

    public static final void A00() {
        0FD.A01.set(true);
        0FD.A00.open();
        ConditionVariable conditionVariable = C0y3.A00;
        0fH.A17("InitStatus", "Providers unblocked (%s)", AnonymousClass001.A1a(conditionVariable.hashCode()));
        conditionVariable.open();
        ConditionVariable conditionVariable2 = 0eC.A00;
        0fH.A0n("InitStatus", 0Pz.A0O("Services unblocked (", ')', conditionVariable2.hashCode()));
        conditionVariable2.open();
        ConditionVariable conditionVariable3 = 0eE.A00;
        0Pz.A1F(conditionVariable3, "BroadcastReceivers unblocked (");
        conditionVariable3.open();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.app.Application$ActivityLifecycleCallbacks, com.facebook.perf.background.BackgroundStartupDetector, android.os.Handler] */
    public static final void A01(Application application) {
        String str;
        long j = 0Zi.A01(application).A0I;
        if (BackgroundStartupDetector.A0H == null) {
            Looper mainLooper = application.getMainLooper();
            11T.A0D(mainLooper);
            ?? handler = new Handler(mainLooper);
            BackgroundStartupDetector.A0H = handler;
            application.registerActivityLifecycleCallbacks(handler);
            str = "BackgroundStartupDetector";
            C0di A00 = C0di.A00();
            11T.A0A(A00);
            str = A00.A05() ? "BackgroundStartupDetector" : 0Pz.A0Y(str, A00.A04(), '/');
            BackgroundStartupDetector.A0B = str;
            0fH.A0j(str, "Installed. Waiting for activity or ColdStartQueue drain...");
            handler.sendEmptyMessageDelayed(49181, j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.0lE] */
    public static void A02(0Xb r301) {
        if (C0di.A02()) {
            return;
        }
        String A04 = C0di.A00().A04();
        0Xh r0 = 0Xh.A04;
        if (r0.A01 != null) {
            throw AnonymousClass001.A0N("checkIfStartupWasInTheBackground has already been called!");
        }
        r0.A01 = Boolean.valueOf(0Xh.A02(r0));
        int i = 0;
        if (A04 == null || A04.equals("")) {
            i = 2;
        }
        ?? obj = new Object();
        ((0lE) obj).A00 = C0k1.A00(r301, "instacrash_threshold", 2);
        0lF r02 = new 0lF(((0lE) obj).A00, C0k1.A00(r301, "instacrash_interval", 45000));
        0Xb r03 = r301;
        try {
            0UN.A0F(r03, r02, i);
            C0t9 A01 = 0Zi.A01(r301);
            int i2 = A01.A15;
            C0gp.A00 = i2;
            if (A01.A6o) {
                C0iz.A00 = A01.A17;
                C0iz.A02 = A01.A6q;
                C0iz.A01 = i2;
                C0iz.A03 = true;
                r03 = new 0cA(r301, C0ff.A00());
                r03.start();
            }
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(r03);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long A03() {
        return 0Zi.A01(this).A9h ? C0dj.A00 : Process.getStartUptimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A04() {
        if (0Xd.A00(this)) {
            A00();
        }
        if (0Xd.A00(this)) {
            C04z.A02();
            0Xd.A00(this);
            AhD();
        }
        new Handler(getMainLooper()).post(new Runnable() { // from class: X.050
            public static final String __redex_internal_original_name = "FbMainActivityTracker$dismissSplashScreen$runnable$1";

            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = 0Fb.A00;
                if (arrayList.isEmpty()) {
                    return;
                }
                0Dq.A03 = true;
                0Dq.A01 = Long.valueOf(SystemClock.elapsedRealtime());
                0fH.A0l("SplashScreen", 0Pz.A0d("Restoring ", " activities", arrayList.size()));
                Object clone = arrayList.clone();
                11T.A0I(clone, "null cannot be cast to non-null type java.util.ArrayList<java.lang.ref.WeakReference<com.facebook.katana.app.mainactivity.FbMainActivity>>");
                arrayList.clear();
                Iterator it = ((AbstractCollection) clone).iterator();
                while (it.hasNext()) {
                    FbMainActivity fbMainActivity = (FbMainActivity) ((Reference) it.next()).get();
                    if (fbMainActivity != null && !fbMainActivity.isFinishing() && !fbMainActivity.isDestroyed()) {
                        final 0kQ r0 = fbMainActivity.A00;
                        if (r0 != null) {
                            BackgroundStartupDetector backgroundStartupDetector = BackgroundStartupDetector.A0H;
                            if (backgroundStartupDetector != null) {
                                backgroundStartupDetector.A03 = true;
                            }
                            r0.A05.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.katana.app.mainactivity.FbMainActivitySplashHelper$ActivityRecreateLifecycleListener
                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityCreated(Activity activity, Bundle bundle) {
                                    11T.A0F(activity, 0);
                                    boolean isFinishing = activity.isFinishing();
                                    int i = Build.VERSION.SDK_INT;
                                    if (!isFinishing) {
                                        if (i >= 30) {
                                            0GM.A00(activity);
                                        }
                                        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                                    } else {
                                        if (i >= 31) {
                                            0kQ.A01(activity, r0, false);
                                            return;
                                        }
                                        0kQ r02 = r0;
                                        0kO.A00(activity, 0kQ.A00(r02, false), r02.A06);
                                    }
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityDestroyed(Activity activity) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityPaused(Activity activity) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityResumed(Activity activity) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityStarted(Activity activity) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityStopped(Activity activity) {
                                }
                            });
                        }
                        0kQ r02 = fbMainActivity.A00;
                        if (r02 != null) {
                            r02.A03();
                        }
                        fbMainActivity.A00 = null;
                        if (0Zi.A01(fbMainActivity).A3F) {
                            fbMainActivity.getWindow().addFlags(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                            Field declaredField = Window.class.getDeclaredField("mHardwareAccelerated");
                            if (declaredField != null) {
                                declaredField.setAccessible(true);
                                declaredField.set(fbMainActivity.getWindow(), true);
                            }
                        }
                        fbMainActivity.recreate();
                    }
                }
                0Dq.A03 = false;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A05() {
        return AnonymousClass001.A1Q(getResources().getConfiguration().uiMode & 48, 32);
    }

    public boolean ANR() {
        boolean z = false;
        if (Build.VERSION.SDK_INT > 30) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0c3f A[Catch: all -> 0x0ca7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0004, B:7:0x000d, B:9:0x0017, B:274:0x0c33, B:276:0x0c37, B:279:0x0c3f, B:280:0x0c44, B:282:0x0c49, B:286:0x0c55, B:288:0x0ca3, B:290:0x0c5e, B:293:0x0c69, B:511:0x0c9d, B:13:0x0024, B:15:0x0025, B:72:0x00df, B:73:0x00e0, B:76:0x00e7, B:77:0x00eb, B:80:0x00f7, B:81:0x00fc, B:83:0x0102, B:89:0x012e, B:94:0x0155, B:99:0x0167, B:100:0x016c, B:102:0x0189, B:107:0x019d, B:109:0x01b6, B:114:0x01c9, B:116:0x01e2, B:121:0x01fc, B:123:0x0215, B:128:0x0228, B:130:0x0241, B:135:0x0255, B:137:0x026e, B:139:0x0278, B:141:0x0295, B:143:0x029f, B:145:0x02b8, B:147:0x02c4, B:148:0x02c9, B:150:0x02eb, B:155:0x0301, B:157:0x031a, B:162:0x032d, B:164:0x0346, B:169:0x036b, B:174:0x037f, B:176:0x0398, B:181:0x03ac, B:183:0x03c5, B:185:0x03cf, B:187:0x03e8, B:189:0x03ee, B:191:0x040d, B:193:0x0415, B:195:0x0435, B:199:0x0442, B:201:0x0462, B:205:0x046f, B:207:0x048c, B:211:0x049a, B:213:0x04b7, B:215:0x04c0, B:217:0x04d7, B:222:0x04f1, B:224:0x0511, B:229:0x0526, B:231:0x0546, B:235:0x0554, B:237:0x056d, B:242:0x0581, B:244:0x05a0, B:246:0x05a9, B:248:0x05cd, B:252:0x05db, B:254:0x05ff, B:256:0x061c, B:260:0x062a, B:262:0x0647, B:268:0x0c06, B:270:0x0c11, B:272:0x0c2c, B:295:0x0bd8, B:296:0x0bdd, B:299:0x0bfe, B:303:0x0679, B:308:0x06a5, B:313:0x06b7, B:314:0x06bc, B:316:0x06e5, B:321:0x06f9, B:323:0x0714, B:328:0x0727, B:330:0x0742, B:335:0x075c, B:337:0x0777, B:342:0x078a, B:344:0x07a5, B:349:0x07b9, B:351:0x07d2, B:353:0x07dc, B:355:0x07f9, B:357:0x0803, B:359:0x081c, B:361:0x0828, B:362:0x082d, B:364:0x084f, B:369:0x0865, B:371:0x087e, B:376:0x0891, B:378:0x08aa, B:383:0x08cf, B:388:0x08e3, B:390:0x08fc, B:395:0x0910, B:397:0x0929, B:399:0x0933, B:401:0x094c, B:403:0x0952, B:405:0x0971, B:407:0x0979, B:409:0x0999, B:413:0x09a6, B:415:0x09c6, B:419:0x09d3, B:421:0x09f0, B:425:0x09fe, B:427:0x0a1b, B:429:0x0a24, B:431:0x0a3b, B:436:0x0a55, B:438:0x0a75, B:443:0x0a8a, B:445:0x0aaa, B:449:0x0ab8, B:451:0x0ad1, B:456:0x0ae5, B:458:0x0b04, B:460:0x0b0d, B:462:0x0b31, B:466:0x0b3f, B:468:0x0b63, B:470:0x0b80, B:474:0x0b8e, B:476:0x0bab, B:481:0x0bbf, B:482:0x0bc4, B:502:0x0c8d, B:504:0x0c8f, B:18:0x002c, B:20:0x002d, B:70:0x00dc, B:497:0x0c87, B:499:0x0c89, B:507:0x0c92), top: B:3:0x0004, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0c69 A[Catch: all -> 0x0ca7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0004, B:7:0x000d, B:9:0x0017, B:274:0x0c33, B:276:0x0c37, B:279:0x0c3f, B:280:0x0c44, B:282:0x0c49, B:286:0x0c55, B:288:0x0ca3, B:290:0x0c5e, B:293:0x0c69, B:511:0x0c9d, B:13:0x0024, B:15:0x0025, B:72:0x00df, B:73:0x00e0, B:76:0x00e7, B:77:0x00eb, B:80:0x00f7, B:81:0x00fc, B:83:0x0102, B:89:0x012e, B:94:0x0155, B:99:0x0167, B:100:0x016c, B:102:0x0189, B:107:0x019d, B:109:0x01b6, B:114:0x01c9, B:116:0x01e2, B:121:0x01fc, B:123:0x0215, B:128:0x0228, B:130:0x0241, B:135:0x0255, B:137:0x026e, B:139:0x0278, B:141:0x0295, B:143:0x029f, B:145:0x02b8, B:147:0x02c4, B:148:0x02c9, B:150:0x02eb, B:155:0x0301, B:157:0x031a, B:162:0x032d, B:164:0x0346, B:169:0x036b, B:174:0x037f, B:176:0x0398, B:181:0x03ac, B:183:0x03c5, B:185:0x03cf, B:187:0x03e8, B:189:0x03ee, B:191:0x040d, B:193:0x0415, B:195:0x0435, B:199:0x0442, B:201:0x0462, B:205:0x046f, B:207:0x048c, B:211:0x049a, B:213:0x04b7, B:215:0x04c0, B:217:0x04d7, B:222:0x04f1, B:224:0x0511, B:229:0x0526, B:231:0x0546, B:235:0x0554, B:237:0x056d, B:242:0x0581, B:244:0x05a0, B:246:0x05a9, B:248:0x05cd, B:252:0x05db, B:254:0x05ff, B:256:0x061c, B:260:0x062a, B:262:0x0647, B:268:0x0c06, B:270:0x0c11, B:272:0x0c2c, B:295:0x0bd8, B:296:0x0bdd, B:299:0x0bfe, B:303:0x0679, B:308:0x06a5, B:313:0x06b7, B:314:0x06bc, B:316:0x06e5, B:321:0x06f9, B:323:0x0714, B:328:0x0727, B:330:0x0742, B:335:0x075c, B:337:0x0777, B:342:0x078a, B:344:0x07a5, B:349:0x07b9, B:351:0x07d2, B:353:0x07dc, B:355:0x07f9, B:357:0x0803, B:359:0x081c, B:361:0x0828, B:362:0x082d, B:364:0x084f, B:369:0x0865, B:371:0x087e, B:376:0x0891, B:378:0x08aa, B:383:0x08cf, B:388:0x08e3, B:390:0x08fc, B:395:0x0910, B:397:0x0929, B:399:0x0933, B:401:0x094c, B:403:0x0952, B:405:0x0971, B:407:0x0979, B:409:0x0999, B:413:0x09a6, B:415:0x09c6, B:419:0x09d3, B:421:0x09f0, B:425:0x09fe, B:427:0x0a1b, B:429:0x0a24, B:431:0x0a3b, B:436:0x0a55, B:438:0x0a75, B:443:0x0a8a, B:445:0x0aaa, B:449:0x0ab8, B:451:0x0ad1, B:456:0x0ae5, B:458:0x0b04, B:460:0x0b0d, B:462:0x0b31, B:466:0x0b3f, B:468:0x0b63, B:470:0x0b80, B:474:0x0b8e, B:476:0x0bab, B:481:0x0bbf, B:482:0x0bc4, B:502:0x0c8d, B:504:0x0c8f, B:18:0x002c, B:20:0x002d, B:70:0x00dc, B:497:0x0c87, B:499:0x0c89, B:507:0x0c92), top: B:3:0x0004, inners: #0, #4 }] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AQT() {
        /*
            Method dump skipped, instructions count: 3244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.app.MessengerApplication.AQT():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C15i
    public Resources AZ0() {
        Resources resources = super/*android.content.ContextWrapper*/.getResources();
        11T.A0A(resources);
        return resources;
    }

    public C00f AhD() {
        AQT();
        C00f c00f = this.A05;
        if (c00f != null) {
            return c00f;
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:71|72|73|74|75|76|77|78|(2:79|(28:81|(5:83|84|85|86|87)|88|89|(6:91|92|93|94|95|96)|97|98|(5:100|101|102|103|104)|105|106|(5:108|109|110|111|112)|113|114|(3:116|117|118)|119|(5:121|122|123|124|125)|127|128|129|130|131|(1:133)|134|135|136|(5:138|139|140|141|142)(3:145|146|147)|143|144)(28:148|(5:150|151|152|153|154)|155|156|(6:158|159|160|161|162|163)|164|165|(5:167|168|169|170|171)|172|173|(5:175|176|177|178|179)|180|181|(3:183|184|185)|186|(5:188|189|123|124|125)|127|128|129|130|131|(0)|134|135|136|(0)(0)|143|144))|190|191|192|193|194) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0299 A[Catch: all -> 0x02e1, TRY_ENTER, TryCatch #1 {all -> 0x02e1, blocks: (B:3:0x000e, B:4:0x0012, B:6:0x0016, B:9:0x001f, B:11:0x0020, B:25:0x003d, B:27:0x003f, B:28:0x0042, B:30:0x0047, B:32:0x004c, B:34:0x0052, B:36:0x0058, B:37:0x005c, B:38:0x0062, B:39:0x0068, B:41:0x007d, B:43:0x0083, B:44:0x0086, B:47:0x008f, B:48:0x0093, B:50:0x00a1, B:52:0x00a9, B:54:0x00ae, B:55:0x00b1, B:58:0x00bb, B:60:0x00c1, B:61:0x00c4, B:63:0x00c9, B:64:0x00cf, B:66:0x00e0, B:68:0x00e6, B:70:0x00f1, B:128:0x028b, B:130:0x028f, B:133:0x0299, B:135:0x029f, B:138:0x02a9, B:140:0x02ae, B:142:0x02b3, B:143:0x02c2, B:145:0x02b9, B:147:0x02be, B:203:0x02e0, B:207:0x02da, B:210:0x02d3, B:18:0x0031, B:20:0x0037, B:23:0x0039, B:72:0x00f7, B:74:0x0103, B:75:0x0108, B:77:0x010e, B:84:0x012a, B:87:0x0134, B:194:0x0288, B:198:0x0282, B:92:0x0149, B:96:0x0157, B:101:0x016c, B:104:0x0176, B:109:0x018a, B:112:0x0195, B:117:0x01aa, B:118:0x01af, B:122:0x01be, B:125:0x0270, B:151:0x01d1, B:154:0x01db, B:159:0x01f0, B:163:0x01fe, B:168:0x0213, B:171:0x021d, B:176:0x0231, B:179:0x023c, B:184:0x0251, B:185:0x0256, B:189:0x0265, B:201:0x02c8), top: B:2:0x000e, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a9 A[Catch: all -> 0x02e1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02e1, blocks: (B:3:0x000e, B:4:0x0012, B:6:0x0016, B:9:0x001f, B:11:0x0020, B:25:0x003d, B:27:0x003f, B:28:0x0042, B:30:0x0047, B:32:0x004c, B:34:0x0052, B:36:0x0058, B:37:0x005c, B:38:0x0062, B:39:0x0068, B:41:0x007d, B:43:0x0083, B:44:0x0086, B:47:0x008f, B:48:0x0093, B:50:0x00a1, B:52:0x00a9, B:54:0x00ae, B:55:0x00b1, B:58:0x00bb, B:60:0x00c1, B:61:0x00c4, B:63:0x00c9, B:64:0x00cf, B:66:0x00e0, B:68:0x00e6, B:70:0x00f1, B:128:0x028b, B:130:0x028f, B:133:0x0299, B:135:0x029f, B:138:0x02a9, B:140:0x02ae, B:142:0x02b3, B:143:0x02c2, B:145:0x02b9, B:147:0x02be, B:203:0x02e0, B:207:0x02da, B:210:0x02d3, B:18:0x0031, B:20:0x0037, B:23:0x0039, B:72:0x00f7, B:74:0x0103, B:75:0x0108, B:77:0x010e, B:84:0x012a, B:87:0x0134, B:194:0x0288, B:198:0x0282, B:92:0x0149, B:96:0x0157, B:101:0x016c, B:104:0x0176, B:109:0x018a, B:112:0x0195, B:117:0x01aa, B:118:0x01af, B:122:0x01be, B:125:0x0270, B:151:0x01d1, B:154:0x01db, B:159:0x01f0, B:163:0x01fe, B:168:0x0213, B:171:0x021d, B:176:0x0231, B:179:0x023c, B:184:0x0251, B:185:0x0256, B:189:0x0265, B:201:0x02c8), top: B:2:0x000e, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b9 A[Catch: all -> 0x02e1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02e1, blocks: (B:3:0x000e, B:4:0x0012, B:6:0x0016, B:9:0x001f, B:11:0x0020, B:25:0x003d, B:27:0x003f, B:28:0x0042, B:30:0x0047, B:32:0x004c, B:34:0x0052, B:36:0x0058, B:37:0x005c, B:38:0x0062, B:39:0x0068, B:41:0x007d, B:43:0x0083, B:44:0x0086, B:47:0x008f, B:48:0x0093, B:50:0x00a1, B:52:0x00a9, B:54:0x00ae, B:55:0x00b1, B:58:0x00bb, B:60:0x00c1, B:61:0x00c4, B:63:0x00c9, B:64:0x00cf, B:66:0x00e0, B:68:0x00e6, B:70:0x00f1, B:128:0x028b, B:130:0x028f, B:133:0x0299, B:135:0x029f, B:138:0x02a9, B:140:0x02ae, B:142:0x02b3, B:143:0x02c2, B:145:0x02b9, B:147:0x02be, B:203:0x02e0, B:207:0x02da, B:210:0x02d3, B:18:0x0031, B:20:0x0037, B:23:0x0039, B:72:0x00f7, B:74:0x0103, B:75:0x0108, B:77:0x010e, B:84:0x012a, B:87:0x0134, B:194:0x0288, B:198:0x0282, B:92:0x0149, B:96:0x0157, B:101:0x016c, B:104:0x0176, B:109:0x018a, B:112:0x0195, B:117:0x01aa, B:118:0x01af, B:122:0x01be, B:125:0x0270, B:151:0x01d1, B:154:0x01db, B:159:0x01f0, B:163:0x01fe, B:168:0x0213, B:171:0x021d, B:176:0x0231, B:179:0x023c, B:184:0x0251, B:185:0x0256, B:189:0x0265, B:201:0x02c8), top: B:2:0x000e, inners: #0, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r302) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.app.MessengerApplication.attachBaseContext(android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Context getApplicationContext() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public File getCacheDir() {
        File cacheDir = super/*android.content.ContextWrapper*/.getCacheDir();
        11T.A0F(cacheDir, 1);
        if (0Yj.A00) {
            File A00 = 0eB.A00(this, 486209204);
            A00.mkdirs();
            if (A00.isDirectory() || A00.mkdirs()) {
                return A00;
            }
        }
        return cacheDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public File getDir(String str, int i) {
        11T.A0F(str, 1);
        if (!0Yj.A00 || !"webview".equals(str)) {
            return super/*android.content.ContextWrapper*/.getDir(str, i);
        }
        File A00 = 0eB.A00(this, 372754419);
        A00.mkdirs();
        return A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resources getResources() {
        if (this.A05 instanceof C15j) {
            if (!(this instanceof C15i)) {
                throw AnonymousClass001.A0N(0Pz.A0W(AnonymousClass001.A0Y(this), " illegally implements HasOverridingResources without HasBaseResourcesAccess."));
            }
            Object obj = this.A05;
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.resources.HasOverridingResources");
            Resources B10 = ((C15j) obj).B10();
            if (B10 != null) {
                return B10;
            }
        }
        Resources resources = super/*android.content.ContextWrapper*/.getResources();
        11T.A0A(resources);
        return resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        0Xq.A00("NonBlockingApp.onCreate");
        try {
            super/*android.app.Application*/.onCreate();
            if (0Xd.A00(this)) {
                new 0XR(this).start();
            } else {
                C04z.A02().A04(this);
                C04z.A02();
                0Xd.A00(this);
                AhD();
            }
        } finally {
            0Xp.A00();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLowMemory() {
        0Xq.A00("NonBlockingApp.onLowMemory");
        try {
            super/*android.app.Application*/.onLowMemory();
            C00f c00f = this.A05;
            if (c00f != null) {
                c00f.A01();
            }
        } finally {
            0Xp.A00();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTrimMemory(int i) {
        0Xq.A00("NonBlockingApp.onTrimMemory");
        try {
            super/*android.app.Application*/.onTrimMemory(i);
            C00f c00f = this.A05;
            if (c00f != null) {
                c00f.A02(i);
            }
        } finally {
            0Xp.A00();
        }
    }
}
