package X;

import android.app.Activity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ama, reason: case insensitive filesystem */
/* loaded from: Ama.class */
public final class C1593Ama extends 5W3 {
    public final C7qg A00;
    public final /* synthetic */ 5oO A01;

    public C1593Ama(C7qg c7qg, 5oO r303) {
        this.A01 = r303;
        this.A00 = c7qg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x009f, code lost:
    
        if (r0.A00 != r0.A00) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BtE(android.app.Activity r302) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1593Ama.BtE(android.app.Activity):void");
    }

    public void CMe(Activity activity) {
        ThreadKey threadKey;
        WeakReference weakReference;
        CD9 cd9;
        AtomicInteger atomicInteger;
        int andIncrement;
        1YC r0;
        Exception e;
        Activity activity2;
        11T.A0F(activity, 0);
        FbUserSession A0E = 4YV.A0E(activity);
        5oO r02 = this.A01;
        C7qg c7qg = this.A00;
        5oO.A06(r02);
        c7qg.A01 = 7zL.A14(activity);
        C7qg c7qg2 = r02.A01;
        try {
            if (c7qg2 != null) {
                if (c7qg.A00 == c7qg2.A00) {
                    WeakReference weakReference2 = c7qg2.A01;
                    if (weakReference2 == null) {
                        threadKey = c7qg.A02;
                        0fH.A0g(threadKey.A0u(), "BubblesStateManager", "Bubble hosting %s was restored after configuration changed.");
                    } else if (weakReference2.get() == activity) {
                        5oO.A03(A0E, c7qg, r02);
                    } else if (activity instanceof 2LI) {
                        threadKey = c7qg.A02;
                        0fH.A0g(threadKey.A0u(), "BubblesStateManager", "Bubble hosting %s is back to bubble thread activity.");
                        ((5HC) 1Br.A0B(r02.A04)).A04(A0E, threadKey, (String) null);
                    } else {
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("navigate_to_%s", AnonymousClass001.A0X(activity));
                        11T.A0A(formatStrLocaleSafe);
                        threadKey = c7qg.A02;
                        0fH.A0d(threadKey.A0u(), formatStrLocaleSafe, "BubblesStateManager", "Navigated through Bubble hosting %s (trigger = %s).");
                        ((5HC) 1Br.A0B(r02.A04)).A04(A0E, threadKey, formatStrLocaleSafe);
                    }
                } else {
                    ThreadKey threadKey2 = c7qg2.A02;
                    threadKey = c7qg.A02;
                    0fH.A0d(threadKey2.A0u(), threadKey.A0u(), "BubblesStateManager", "Switched from bubble hosting %s to bubble hosting %s");
                    5HC r03 = (5HC) 1Br.A0B(r02.A04);
                    11T.A0F(A0E, 0);
                    2R2 A05 = 2R2.A05(1Br.A02(r03.A02));
                    if (4YU.A1X(A05)) {
                        A05.A0A(5HC.A00(A0E, threadKey, (String) null), "thread");
                        A05.A0F("threads", ImmutableList.of((Object) 5HC.A01(A0E, threadKey), (Object) 5HC.A01(A0E, threadKey2)));
                        A05.A0D(4YT.A00(270), Long.valueOf(2));
                        5HC.A03(A05, r03, (String) null, 11);
                    }
                    5oO.A05(A0E, r02, threadKey, "switch");
                    C7ng A00 = 5oO.A00(r02);
                    WeakReference weakReference3 = c7qg2.A01;
                    WeakReference weakReference4 = c7qg.A01;
                    CD9 cd92 = A00.A00.A00;
                    AtomicInteger atomicInteger2 = C1Y6.A04;
                    int andIncrement2 = atomicInteger2.getAndIncrement();
                    1YC r04 = cd92.A01;
                    r04.A08("com.facebook.messaging.bubbles.plugins.interfaces.statelistener.BubblesStateListenerInterfaceSpec", "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleSwitched", andIncrement2);
                    Exception e2 = null;
                    try {
                        if (CD9.A00(cd92)) {
                            int andIncrement3 = atomicInteger2.getAndIncrement();
                            r04.A0A("com.facebook.messaging.bubbles.plugins.bubblesstatelistener.threadlifecycle.ThreadLifecycleBubblesStateListener", "messaging.bubbles.bubblesstatelistener.threadlifecycle.ThreadLifecycleBubblesStateListener", "com.facebook.messaging.bubbles.plugins.interfaces.statelistener.BubblesStateListenerInterfaceSpec", andIncrement3, "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "com.facebook.messaging.bubbles.plugins.bubblesstatelistener.BubblesBubblesstatelistenerKillSwitch", "onBubbleSwitched");
                            DIJ dij = null;
                            if (weakReference3 != null) {
                                try {
                                    try {
                                        dij = (Activity) weakReference3.get();
                                    } catch (Throwable th) {
                                        r04.A04(e2, "messaging.bubbles.bubblesstatelistener.threadlifecycle.ThreadLifecycleBubblesStateListener", "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleSwitched", andIncrement3);
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e2 = e3;
                                    throw e2;
                                }
                            }
                            if (dij instanceof DIJ) {
                                DIJ dij2 = dij;
                                if (dij2 != null) {
                                    dij2.CQ7();
                                }
                            }
                            Activity activity3 = null;
                            if (weakReference4 != null) {
                                activity3 = (Activity) weakReference4.get();
                            }
                            if (activity3 instanceof DIJ) {
                                DIJ dij3 = (DIJ) activity3;
                                if (dij3 != null) {
                                    dij3.CQI();
                                }
                            }
                            Activity activity4 = null;
                            if (weakReference4 != null) {
                                activity4 = (Activity) weakReference4.get();
                            }
                            if (activity4 instanceof DIJ) {
                                DIJ dij4 = (DIJ) activity4;
                                if (dij4 != null) {
                                    dij4.CQR();
                                }
                            }
                            r04.A09("messaging.bubbles.bubblesstatelistener.threadlifecycle.ThreadLifecycleBubblesStateListener", "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleSwitched", andIncrement3);
                        }
                        r04.A02((Exception) null, "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleSwitched", andIncrement2);
                        WeakReference weakReference5 = c7qg2.A01;
                        if (weakReference5 != null && (activity2 = (Activity) weakReference5.get()) != null && (activity2 instanceof DEA)) {
                            activity2.finish();
                        }
                    } catch (Throwable th2) {
                        r04.A02(e2, "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleSwitched", andIncrement2);
                        throw th2;
                    }
                }
                C7qg c7qg3 = new C7qg(threadKey);
                c7qg3.A00 = c7qg.A00;
                c7qg3.A01 = c7qg.A01;
                r02.A01 = c7qg3;
                r02.A0E.BPu(threadKey.A0u());
                return;
            }
            if (CD9.A00(cd9)) {
                int andIncrement4 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.bubbles.plugins.bubblesstatelistener.threadlifecycle.ThreadLifecycleBubblesStateListener", "messaging.bubbles.bubblesstatelistener.threadlifecycle.ThreadLifecycleBubblesStateListener", "com.facebook.messaging.bubbles.plugins.interfaces.statelistener.BubblesStateListenerInterfaceSpec", andIncrement4, "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "com.facebook.messaging.bubbles.plugins.bubblesstatelistener.BubblesBubblesstatelistenerKillSwitch", "onBubbleExpanded");
                DIJ dij5 = null;
                if (weakReference != null) {
                    try {
                        try {
                            dij5 = (Activity) weakReference.get();
                        } catch (Throwable th3) {
                            r0.A04(e, "messaging.bubbles.bubblesstatelistener.threadlifecycle.ThreadLifecycleBubblesStateListener", "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleExpanded", andIncrement4);
                            throw th3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        throw e;
                    }
                }
                if (dij5 instanceof DIJ) {
                    DIJ dij6 = dij5;
                    if (dij6 != null) {
                        dij6.CQI();
                    }
                }
                r0.A09("messaging.bubbles.bubblesstatelistener.threadlifecycle.ThreadLifecycleBubblesStateListener", "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleExpanded", andIncrement4);
            }
            r0.A02((Exception) null, "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleExpanded", andIncrement);
            C7qg c7qg32 = new C7qg(threadKey);
            c7qg32.A00 = c7qg.A00;
            c7qg32.A01 = c7qg.A01;
            r02.A01 = c7qg32;
            r02.A0E.BPu(threadKey.A0u());
            return;
        } catch (Throwable th4) {
            r0.A02(e, "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleExpanded", andIncrement);
            throw th4;
        }
        threadKey = c7qg.A02;
        0fH.A0g(threadKey.A0u(), "BubblesStateManager", "Bubble hosting %s has been expanded.");
        5HC r05 = (5HC) 1Br.A0B(r02.A04);
        11T.A0F(A0E, 0);
        2R2 A052 = 2R2.A05(1Br.A02(r05.A02));
        if (4YU.A1X(A052)) {
            A052.A0A(5HC.A00(A0E, threadKey, (String) null), "thread");
            A052.A0D(4YT.A00(270), 1L);
            5HC.A03(A052, r05, (String) null, 1);
        }
        5oO.A05(A0E, r02, threadKey, "expand");
        if (activity instanceof 2LI) {
            MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) 1Br.A0B(r02.A07);
            String A0u = threadKey.A0u();
            11T.A0A(A0u);
            MessagingPerformanceLogger.A0H(messagingPerformanceLogger, A0u, "bubbles");
        }
        C7ng A002 = 5oO.A00(r02);
        weakReference = c7qg.A01;
        cd9 = A002.A00.A00;
        atomicInteger = C1Y6.A04;
        andIncrement = atomicInteger.getAndIncrement();
        r0 = cd9.A01;
        r0.A08("com.facebook.messaging.bubbles.plugins.interfaces.statelistener.BubblesStateListenerInterfaceSpec", "messaging.bubbles.statelistener.BubblesStateListenerInterfaceSpec", "onBubbleExpanded", andIncrement);
        e = null;
    }

    public void CNe(Activity activity) {
        WeakReference weakReference;
        11T.A0F(activity, 0);
        5oO r0 = this.A01;
        C7qg c7qg = this.A00;
        C7qg c7qg2 = r0.A01;
        if (c7qg2 == null || (weakReference = c7qg2.A01) == null || weakReference.get() != activity || c7qg.A00 != c7qg2.A00) {
            return;
        }
        if (!activity.isChangingConfigurations()) {
            5oO.A06(r0);
            r0.A02 = ((ScheduledExecutorService) 1Br.A0B(r0.A0B)).schedule(r0.A0F, 2000L, TimeUnit.MILLISECONDS);
            0fH.A0j("BubblesStateManager", "Bubbles expanded timeout started.");
        } else {
            C7qg c7qg3 = r0.A01;
            if (c7qg3 != null) {
                c7qg3.A01 = null;
            }
        }
    }
}
