package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.fury.context.ReqContext;
import com.facebook.messaging.accountlogin.plugins.autologin.inboxlifecycle.SSOAutoLoginInboxLifecycleImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.neue.nux.acctlogin.AccountSSOAutoLoginCardFragment;
import com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation;
import com.facebook.messaging.notify.permissions.plugins.postprompt.inboxnux.AndroidTNotificationPermissionPostPromptNuxActivity;
import com.facebook.messaging.prefetcher.plugins.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher;
import com.facebook.xapp.messaging.events.common.lifecycle.OnBeforeCreate;
import com.facebook.xapp.messaging.events.common.lifecycle.OnDestroy;
import com.facebook.xapp.messaging.events.common.lifecycle.OnPause;
import com.facebook.xapp.messaging.events.common.lifecycle.OnSaveInstanceState;
import com.facebook.xapp.messaging.events.common.lifecycle.OnStart;
import com.facebook.xapp.messaging.events.common.lifecycle.OnStop;
import com.google.common.collect.RegularImmutableSet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.358, reason: invalid class name */
/* loaded from: 358.class */
public final class AnonymousClass358 extends C1q6 {
    public final int A00;
    public final Object A01;

    public AnonymousClass358(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1q6, X.C1pu
    public void Bhs(Intent intent, Fragment fragment, int i, int i2) {
        if (this.A00 == 0) {
            11T.A0F(fragment, 0);
            0fH.A0m("InboxLifecyclePluginHandler", "onActivityResult");
            2Vu r0 = ((2Vp) this.A01).A00;
            if (r0 == null) {
                11T.A0L("lifecycleInterface");
                throw 0Q8.createAndThrow();
            }
            2Vt r02 = r0.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r03 = r02.A0j;
            r03.A08("com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onActivityResult", andIncrement);
            try {
                2Vt.A00(r02);
                if (2Vt.A04(r02)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    try {
                        r03.A0A("com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation", "messaging.notify.permissions.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation", "com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", andIncrement2, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "com.facebook.messaging.notify.permissions.plugins.inbox.NotifyPermissionsInboxKillSwitch", "onActivityResult");
                        try {
                            InboxLifecycleNotificationsPermissionImplementation inboxLifecycleNotificationsPermissionImplementation = r02.A0D;
                            if (i == 1 && i2 == -1) {
                                String stringExtra = intent != null ? intent.getStringExtra(GOm.A00(82)) : null;
                                0fH.A0j("InboxLifecycleNotificationsPermissionImplementation", 0Pz.A0W("[BANotif] Permission checked: ", stringExtra));
                                String A00 = DKB.A00(100);
                                if (!11T.A0O(stringExtra, A00) && !((1wT) 1Br.A0B(inboxLifecycleNotificationsPermissionImplementation.A05)).A01()) {
                                    Context context = inboxLifecycleNotificationsPermissionImplementation.A01;
                                    0LS.A0A(context, new Intent(context, (Class<?>) AndroidTNotificationPermissionPostPromptNuxActivity.class));
                                } else if (11T.A0O(stringExtra, A00)) {
                                    0fH.A0j("InboxLifecycleNotificationsPermissionImplementation", "[BANotif] Notifications permission is on, checking if background account notification NUX should be displayed");
                                    InboxLifecycleNotificationsPermissionImplementation.A00(inboxLifecycleNotificationsPermissionImplementation);
                                }
                            }
                            r03.A09("messaging.notify.permissions.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onActivityResult", andIncrement2);
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        r03.A04((Exception) null, "messaging.notify.permissions.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onActivityResult", andIncrement2);
                        throw th;
                    }
                }
                r03.A02((Exception) null, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onActivityResult", andIncrement);
            } catch (Throwable th2) {
                r03.A02((Exception) null, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onActivityResult", andIncrement);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x036a A[Catch: Exception -> 0x064f, all -> 0x0669, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x064f, blocks: (B:100:0x0273, B:104:0x0281, B:107:0x028d, B:110:0x036a, B:112:0x039d, B:113:0x03a2, B:117:0x0372, B:119:0x0381, B:120:0x0388, B:122:0x0391, B:123:0x0396, B:123:0x0396, B:125:0x0297, B:126:0x029c, B:129:0x02a8, B:132:0x02b2, B:133:0x02bc, B:136:0x02c8, B:138:0x02d7, B:139:0x02de, B:141:0x02e7, B:142:0x02ec, B:142:0x02ec, B:146:0x02f6, B:149:0x0356, B:149:0x0356, B:151:0x035b, B:152:0x0302, B:154:0x0314, B:166:0x0351, B:174:0x063a, B:176:0x0647, B:178:0x064e), top: B:99:0x0273, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0372 A[Catch: Exception -> 0x064f, all -> 0x0669, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x064f, blocks: (B:100:0x0273, B:104:0x0281, B:107:0x028d, B:110:0x036a, B:112:0x039d, B:113:0x03a2, B:117:0x0372, B:119:0x0381, B:120:0x0388, B:122:0x0391, B:123:0x0396, B:123:0x0396, B:125:0x0297, B:126:0x029c, B:129:0x02a8, B:132:0x02b2, B:133:0x02bc, B:136:0x02c8, B:138:0x02d7, B:139:0x02de, B:141:0x02e7, B:142:0x02ec, B:142:0x02ec, B:146:0x02f6, B:149:0x0356, B:149:0x0356, B:151:0x035b, B:152:0x0302, B:154:0x0314, B:166:0x0351, B:174:0x063a, B:176:0x0647, B:178:0x064e), top: B:99:0x0273, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e5 A[Catch: Exception -> 0x0699, all -> 0x06ae, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0699, blocks: (B:226:0x047e, B:230:0x048c, B:233:0x0498, B:238:0x0518, B:242:0x04e5, B:243:0x04ec, B:244:0x04f3, B:245:0x04fa, B:247:0x0505, B:248:0x050c, B:249:0x0511, B:249:0x0511, B:251:0x04a2, B:252:0x04a7, B:255:0x04b3, B:258:0x04bd, B:260:0x04cf), top: B:225:0x047e, outer: #10 }] */
    @Override // X.C1q6, X.C1pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BiN(android.os.Bundle r302, androidx.fragment.app.Fragment r303) {
        /*
            Method dump skipped, instructions count: 1835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass358.BiN(android.os.Bundle, androidx.fragment.app.Fragment):void");
    }

    @Override // X.C1q6, X.C1pu
    public void Bib(Bundle bundle, View view, Fragment fragment) {
        if (this.A00 == 0) {
            11T.A0F(view, 1);
            0fH.A0m("InboxLifecyclePluginHandler", "onViewCreated");
            2Vu r0 = ((2Vp) this.A01).A00;
            if (r0 == null) {
                11T.A0L("lifecycleInterface");
                throw 0Q8.createAndThrow();
            }
            2Vt r02 = r0.A00.A00;
            int A00 = 1BK.A00();
            1YC r03 = r02.A0j;
            r03.A08("com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onViewCreated", A00);
            try {
                2Vt.A00(r02);
            } finally {
                r03.A06("messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onViewCreated", A00);
            }
        }
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void Bic(Fragment fragment) {
        if (this.A00 == 0) {
            0fH.A0m("InboxLifecyclePluginHandler", "onDestroyView");
            2Vu r0 = ((2Vp) this.A01).A00;
            if (r0 == null) {
                11T.A0L("lifecycleInterface");
                throw 0Q8.createAndThrow();
            }
            2Vt r02 = r0.A00.A00;
            int A00 = 1BK.A00();
            1YC r03 = r02.A0j;
            r03.A08("com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onDestroyView", A00);
            try {
                2Vt.A00(r02);
            } finally {
                r03.A06("messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onDestroyView", A00);
            }
        }
    }

    @Override // X.C1q6, X.C1pu
    public void BlB(Bundle bundle) {
        if (this.A00 == 0) {
            0fH.A0m("InboxLifecyclePluginHandler", "onBeforeCreate");
            1Va r0 = ((2Vp) this.A01).A01;
            if (r0 == null) {
                11T.A0L("publisher");
                throw 0Q8.createAndThrow();
            }
            r0.CZm(OnBeforeCreate.A00);
        }
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
        String str;
        if (this.A00 == 0) {
            0fH.A0m("InboxLifecyclePluginHandler", "onDestroy");
            2Vp r0 = (2Vp) this.A01;
            2Vu r02 = r0.A00;
            if (r02 == null) {
                str = "lifecycleInterface";
            } else {
                2Vt r03 = r02.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement = atomicInteger.getAndIncrement();
                1YC r04 = r03.A0j;
                r04.A08("com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onDestroy", andIncrement);
                try {
                    2Vt.A00(r03);
                    if (2Vt.A06(r03)) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        try {
                            r04.A0A("com.facebook.messaging.prefetcher.plugins.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher", "messaging.prefetcher.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher", "com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", andIncrement2, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "com.facebook.messaging.prefetcher.plugins.messagesprefetcher.PrefetcherMessagesprefetcherKillSwitch", "onDestroy");
                            try {
                                InboxLifecycleMessagesPrefetcher inboxLifecycleMessagesPrefetcher = r03.A0H;
                                1EK.A09("InboxLifecycleMessagesPrefetcher", 174509424307572L);
                                try {
                                    ReqContext A04 = AnonymousClass018.A04("InboxLifecycleMessagesPrefetcher", 0);
                                    try {
                                        2ZP A042 = 1Lm.A04(inboxLifecycleMessagesPrefetcher);
                                        0fH.A0j("ForegroundThreadMessagesPrefetcher", "onDestroy()");
                                        A042.A0I = RegularImmutableSet.A05;
                                        5xM r05 = (5xM) A042.A05.get();
                                        0WH r06 = r05.A01;
                                        synchronized (r06) {
                                            try {
                                                r06.clear();
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        }
                                        SparseArray sparseArray = ((C5xN) r05.A03.get()).A01;
                                        synchronized (sparseArray) {
                                            try {
                                                sparseArray.clear();
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                        if (A042.A01) {
                                            C00i c00i = A042.A09;
                                            C2iy c2iy = (C2iy) c00i.get();
                                            ((C2j0) c2iy.A01.get()).A03(c2iy);
                                            ((C2iy) c00i.get()).A00 = null;
                                        }
                                        0WH r07 = A042.A03;
                                        synchronized (r07) {
                                            try {
                                                r07.clear();
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                        0WH r08 = A042.A02;
                                        synchronized (r08) {
                                            try {
                                                r08.clear();
                                            } catch (Throwable th4) {
                                                th = th4;
                                                throw th;
                                            }
                                        }
                                        if (1BK.A0N(A042.A0C).AZk(36324681611038624L)) {
                                            ((2ZT) A042.A0A.get()).A00(1BK.A04(A042.A06), (ThreadKey) null, true);
                                        }
                                        if (A04 != null) {
                                            A04.close();
                                        }
                                        1EK.A03();
                                        r04.A09("messaging.prefetcher.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onDestroy", andIncrement2);
                                    } finally {
                                    }
                                } catch (Throwable th5) {
                                    1EK.A03();
                                    throw th5;
                                }
                            } catch (Exception e) {
                                throw e;
                            }
                        } catch (Throwable th6) {
                            r04.A04((Exception) null, "messaging.prefetcher.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onDestroy", andIncrement2);
                            throw th6;
                        }
                    }
                    r04.A02((Exception) null, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onDestroy", andIncrement);
                    1Va r09 = r0.A01;
                    if (r09 != null) {
                        r09.CZm(OnDestroy.A00);
                        return;
                    }
                    str = "publisher";
                } catch (Throwable th7) {
                    r04.A02((Exception) null, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onDestroy", andIncrement);
                    throw th7;
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.C1q6, X.C1pu
    public void CAx(Fragment fragment) {
        String str;
        int andIncrement;
        if (this.A00 != 0) {
            2Y7 r0 = (2Y7) this.A01;
            if (r0.A00 != 0) {
                2Y7.A00(r0.A01, r0, 0);
                return;
            }
            return;
        }
        0fH.A0m("InboxLifecyclePluginHandler", "onPause");
        2Vp r02 = (2Vp) this.A01;
        2Vu r03 = r02.A00;
        if (r03 == null) {
            str = "lifecycleInterface";
        } else {
            2Vt r04 = r03.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement2 = atomicInteger.getAndIncrement();
            1YC r05 = r04.A0j;
            r05.A08("com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onPause", andIncrement2);
            try {
                2Vt.A00(r04);
                try {
                    if (2Vt.A06(r04)) {
                        andIncrement = atomicInteger.getAndIncrement();
                        r05.A0A("com.facebook.messaging.prefetcher.plugins.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher", "messaging.prefetcher.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher", "com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", andIncrement, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "com.facebook.messaging.prefetcher.plugins.messagesprefetcher.PrefetcherMessagesprefetcherKillSwitch", "onPause");
                        try {
                            InboxLifecycleMessagesPrefetcher inboxLifecycleMessagesPrefetcher = r04.A0H;
                            1EK.A09("InboxLifecycleMessagesPrefetcher", 174509424307572L);
                            try {
                                ReqContext A04 = AnonymousClass018.A04("InboxLifecycleMessagesPrefetcher", 0);
                                try {
                                    2ZP A042 = 1Lm.A04(inboxLifecycleMessagesPrefetcher);
                                    0fH.A0j("ForegroundThreadMessagesPrefetcher", "onPause()");
                                    if (A042.A01) {
                                        C00i c00i = A042.A09;
                                        C2iy c2iy = (C2iy) c00i.get();
                                        ((C2j0) c2iy.A01.get()).A03(c2iy);
                                        ((C2iy) c00i.get()).A00 = null;
                                    }
                                    if (1BK.A0N(A042.A0C).AZk(36324681611038624L)) {
                                        ((2ZT) A042.A0A.get()).A00(1BK.A04(A042.A06), (ThreadKey) null, true);
                                    }
                                    if (A04 != null) {
                                        A04.close();
                                    }
                                    1EK.A03();
                                    r05.A09("messaging.prefetcher.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onPause", andIncrement);
                                } finally {
                                }
                            } catch (Throwable th) {
                                1EK.A03();
                                throw th;
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    if (2Vt.A05(r04)) {
                        int andIncrement3 = atomicInteger.getAndIncrement();
                        r05.A0A("com.facebook.messaging.notify.plugins.inbox.inboxlifecycle.InboxLifecycleClearNotificationImplementation", "messaging.notify.inbox.inboxlifecycle.InboxLifecycleClearNotificationImplementation", "com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", andIncrement3, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "com.facebook.messaging.notify.plugins.inbox.NotifyInboxKillSwitch", "onPause");
                        2Za r06 = (2Za) 1Br.A0B(r04.A0E.A00);
                        ScheduledFuture scheduledFuture = r06.A01;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            0fH.A0j("ClearAllNotificationsHelper", "clearAllNotifications");
                            ((AnonymousClass208) 1Bn.A0E((Context) null, r06.A00, 17006)).AFI("InboxFragmentOnPause");
                            r06.A01 = null;
                        }
                        r05.A09("messaging.notify.inbox.inboxlifecycle.InboxLifecycleClearNotificationImplementation", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onPause", andIncrement3);
                    }
                    if (2Vt.A04(r04)) {
                        int andIncrement4 = atomicInteger.getAndIncrement();
                        r05.A0A("com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation", "messaging.notify.permissions.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation", "com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", andIncrement4, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "com.facebook.messaging.notify.permissions.plugins.inbox.NotifyPermissionsInboxKillSwitch", "onPause");
                        r05.A09("messaging.notify.permissions.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onPause", andIncrement4);
                    }
                    r05.A02((Exception) null, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onPause", andIncrement2);
                    1Va r07 = r02.A01;
                    if (r07 != null) {
                        r07.CZm(OnPause.A00);
                        return;
                    }
                    str = "publisher";
                } catch (Throwable th2) {
                    r05.A04((Exception) null, "messaging.prefetcher.messagesprefetcher.inboxlifecycle.InboxLifecycleMessagesPrefetcher", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onPause", andIncrement);
                    throw th2;
                }
            } catch (Throwable th3) {
                r05.A02((Exception) null, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onPause", andIncrement2);
                throw th3;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:96|97|(2:99|(16:101|(8:119|120|121|122|123|124|125|126)|103|104|105|106|107|108|109|110|111|112|113|114|115|116)(6:128|129|130|131|132|133))(4:134|135|136|137)|127|103|104|105|106|107|108|109|110|111|112|113|114|115|116) */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04d2 A[Catch: Exception -> 0x067a, all -> 0x0692, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x067a, blocks: (B:207:0x0486, B:211:0x0491, B:214:0x049b, B:217:0x04d2, B:219:0x0501, B:220:0x0506, B:225:0x04da, B:227:0x04e9, B:228:0x04ef, B:230:0x04f6, B:231:0x04fa, B:231:0x04fa, B:233:0x04a4, B:234:0x04a9, B:237:0x04b3, B:239:0x04c3), top: B:206:0x0486, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04da A[Catch: Exception -> 0x067a, all -> 0x0692, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x067a, blocks: (B:207:0x0486, B:211:0x0491, B:214:0x049b, B:217:0x04d2, B:219:0x0501, B:220:0x0506, B:225:0x04da, B:227:0x04e9, B:228:0x04ef, B:230:0x04f6, B:231:0x04fa, B:231:0x04fa, B:233:0x04a4, B:234:0x04a9, B:237:0x04b3, B:239:0x04c3), top: B:206:0x0486, outer: #2 }] */
    @Override // X.C1q6, X.C1pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CHq(androidx.fragment.app.Fragment r302) {
        /*
            Method dump skipped, instructions count: 1817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass358.CHq(androidx.fragment.app.Fragment):void");
    }

    @Override // X.C1q6, X.C1pu
    public void CIe(Bundle bundle, Fragment fragment) {
        if (this.A00 == 0) {
            11T.A0F(bundle, 1);
            0fH.A0m("InboxLifecyclePluginHandler", "onSaveInstanceState");
            1Va r0 = ((2Vp) this.A01).A01;
            if (r0 == null) {
                11T.A0L("publisher");
                throw 0Q8.createAndThrow();
            }
            r0.CZm(new OnSaveInstanceState(bundle));
        }
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
        String str;
        if (this.A00 == 0) {
            0fH.A0m("InboxLifecyclePluginHandler", "onStart");
            2Vp r0 = (2Vp) this.A01;
            2Vu r02 = r0.A00;
            if (r02 == null) {
                str = "lifecycleInterface";
            } else {
                2Vt r03 = r02.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement = atomicInteger.getAndIncrement();
                1YC r04 = r03.A0j;
                r04.A08("com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onStart", andIncrement);
                try {
                    2Vt.A00(r03);
                    if (2Vt.A01(r03)) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        try {
                            r04.A0A("com.facebook.messaging.accountlogin.plugins.autologin.inboxlifecycle.SSOAutoLoginInboxLifecycleImplementation", "messaging.accountlogin.autologin.inboxlifecycle.SSOAutoLoginInboxLifecycleImplementation", "com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", andIncrement2, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "com.facebook.messaging.accountlogin.plugins.autologin.AccountloginAutologinKillSwitch", "onStart");
                            try {
                                SSOAutoLoginInboxLifecycleImplementation sSOAutoLoginInboxLifecycleImplementation = r03.A00;
                                AccountSSOAutoLoginCardFragment accountSSOAutoLoginCardFragment = sSOAutoLoginInboxLifecycleImplementation.A00;
                                if (accountSSOAutoLoginCardFragment != null && SSOAutoLoginInboxLifecycleImplementation.A01(sSOAutoLoginInboxLifecycleImplementation, SSOAutoLoginInboxLifecycleImplementation.A0A)) {
                                    accountSSOAutoLoginCardFragment.A0o();
                                }
                                r04.A09("messaging.accountlogin.autologin.inboxlifecycle.SSOAutoLoginInboxLifecycleImplementation", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onStart", andIncrement2);
                            } catch (Exception e) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            r04.A04((Exception) null, "messaging.accountlogin.autologin.inboxlifecycle.SSOAutoLoginInboxLifecycleImplementation", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onStart", andIncrement2);
                            throw th;
                        }
                    }
                    r04.A02((Exception) null, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onStart", andIncrement);
                    1Va r05 = r0.A01;
                    if (r05 != null) {
                        r05.CZm(OnStart.A00);
                        return;
                    }
                    str = "publisher";
                } catch (Throwable th2) {
                    r04.A02((Exception) null, "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onStart", andIncrement);
                    throw th2;
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CNf(Fragment fragment) {
        String str;
        if (this.A00 == 0) {
            0fH.A0m("InboxLifecyclePluginHandler", "onStop");
            2Vp r0 = (2Vp) this.A01;
            2Vu r02 = r0.A00;
            if (r02 == null) {
                str = "lifecycleInterface";
            } else {
                2Vt r03 = r02.A00.A00;
                int A00 = 1BK.A00();
                1YC r04 = r03.A0j;
                r04.A08("com.facebook.messaging.inbox.plugins.interfaces.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onStop", A00);
                try {
                    2Vt.A00(r03);
                    r04.A06("messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onStop", A00);
                    1Va r05 = r0.A01;
                    if (r05 != null) {
                        r05.CZm(OnStop.A00);
                        return;
                    }
                    str = "publisher";
                } catch (Throwable th) {
                    r04.A06("messaging.inbox.fragment.lifecycle.FragmentLifecycleInterfaceSpec", "onStop", A00);
                    throw th;
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }
}
