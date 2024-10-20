package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.tincan.tincanoverwamsys.plugins.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation;
import com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.21O, reason: invalid class name */
/* loaded from: 21O.class */
public final class C21O implements C1qM {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A06;
    public final C00i A07;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0I;
    public final 21P A0J;
    public final 1PB A0K;
    public final Context A0L;
    public final C00i A0M;
    public final C00i A0N;
    public final C00i A0O;
    public final C00i A0P;
    public final C00i A0Q;
    public final C00i A03 = new 1BQ(16511);
    public final C00i A02 = new 1BV((1BY) null, 83759);
    public final C00i A0H = new 1BV((1BY) null, 16671);
    public final C00i A04 = new 1BQ(16449);
    public final C00i A08 = new 1BV((1BY) null, 84680);
    public final C00i A0C = new 1BQ(16385);
    public final C00i A09 = new 1BV((1BY) null, 66592);
    public final C00i A05 = new 1BQ(82351);

    public C21O(1BO r302, FbUserSession fbUserSession) {
        Context A00 = FbInjector.A00();
        this.A0L = A00;
        this.A0J = 21P.A00(A00);
        this.A0A = new 1BQ(66536);
        this.A0O = new 1BQ(67085);
        1BQ r0 = new 1BQ(16626);
        this.A0Q = r0;
        this.A0K = ((1P8) r0.get()).A00("notification_instance");
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        Integer num = 1Lo.A05;
        this.A0D = new 1MV(fbUserSession, (1BY) null, 83784);
        this.A0E = new 1MV(fbUserSession, (1BY) null, 49838);
        this.A0B = new 1MV(fbUserSession, (1BY) null, 16686);
        this.A06 = new 1MV(fbUserSession, (1BY) null, 115364);
        this.A0M = new 1MV(fbUserSession, (1BY) null, 115365);
        this.A0N = new 1MV(fbUserSession, (1BY) null, 84153);
        this.A0P = new 1MV(fbUserSession, (1BY) null, 83260);
        this.A0G = new 1MV(fbUserSession, (1BY) null, 68577);
        this.A0I = new 1MV(fbUserSession, (1BY) null, 67601);
        this.A0F = new 1MV(fbUserSession, (1BY) null, 49792);
        this.A07 = new 1MV(fbUserSession, (1BY) null, 16686);
    }

    public static C21p A00(C21O c21o, C5ow c5ow, String str) {
        ((C01s) c21o.A03.get()).D0v("MsysPushNotificationHandler", str);
        ((C5ox) c21o.A0I.get()).A00(c5ow, str);
        ((5Jh) c21o.A0G.get()).A01(c5ow.A0C, c5ow.A0A, c5ow.A0D, str, false);
        return (C21p) c21o.A09.get();
    }

    public static 4rH A01(BEV bev, int i) {
        int integer = ((1qX) bev).mResultSet.getInteger(i, 0);
        if (integer == 10 || integer == 11) {
            return 4rH.A0H;
        }
        if (integer == 15 || integer == 16) {
            return 4rH.A03;
        }
        throw new RuntimeException(StringFormatUtil.formatStrLocaleSafe("Unsupported thread type: %d", Integer.valueOf(integer)));
    }

    public static ArrayList A02(MailboxNullable mailboxNullable, java.util.Map map) {
        ArrayList arrayList = new ArrayList();
        Object obj = mailboxNullable.value;
        if (obj != null && ((1qX) obj).mResultSet.getCount() >= 1) {
            1qX r0 = (1qX) mailboxNullable.value;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= r0.mResultSet.getCount()) {
                    break;
                }
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(r0.mResultSet.getString(i2, 2)));
                    if (map.containsKey(valueOf)) {
                        arrayList.add(new Pair(Integer.valueOf(i2), map.get(valueOf)));
                    }
                } catch (NumberFormatException unused) {
                    0fH.A0k("MsysPushNotificationHandler", "Cannot convert message PK to Long");
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    public static void A03(final C21O c21o, final int i, final boolean z, final boolean z2) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(((MessengerPerUserMsysMailbox) c21o.A0B.get()).A0A));
        } catch (NumberFormatException unused) {
            1BK.A09(c21o.A03).D0v("MsysPushNotificationHandler", "unable to get user id");
            l = null;
        }
        c21o.A0K.BZR("notif_processing", 0Pz.A1C("E2EE StoredProcedure changed, rerouting_enabled:", z));
        if (((2yD) c21o.A0C.get()).AZk(36317088110685147L)) {
            MailboxFeature mailboxFeature = (MailboxFeature) c21o.A0M.get();
            Boolean A0K = AnonymousClass001.A0K();
            List A02 = ((21W) c21o.A0A.get()).A02();
            MailboxCallback mailboxCallback = new MailboxCallback() { // from class: X.3ap
                @Override // com.facebook.msys.mca.MailboxCallback
                public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                    MailboxNullable mailboxNullable = (MailboxNullable) obj;
                    Object obj2 = mailboxNullable.value;
                    if (obj2 != null) {
                        0fH.A0h(Integer.valueOf(1qX.A00((1qX) obj2)), "MsysPushNotificationHandler", "Got %s new client notifications");
                        C5ov c5ov = new C5ov((38G) mailboxNullable.value) { // from class: X.3Zb
                            public final 38G A00;

                            {
                                this.A00 = r302;
                            }

                            @Override // X.C5ov
                            public C5ow AzX(int i2) {
                                38G r0 = this.A00;
                                long j = ((1qX) r0).mResultSet.getLong(i2, 2);
                                Long nullableLong = ((1qX) r0).mResultSet.getNullableLong(i2, 8);
                                Long nullableLong2 = ((1qX) r0).mResultSet.getNullableLong(i2, 9);
                                Long nullableLong3 = ((1qX) r0).mResultSet.getNullableLong(i2, 10);
                                boolean z3 = ((1qX) r0).mResultSet.getBoolean(i2, 29);
                                boolean z4 = ((1qX) r0).mResultSet.getBoolean(i2, 22);
                                String string = ((1qX) r0).mResultSet.getString(i2, 5);
                                String string2 = ((1qX) r0).mResultSet.getString(i2, 15);
                                long integer = ((1qX) r0).mResultSet.getInteger(i2, 11);
                                long integer2 = ((1qX) r0).mResultSet.getInteger(i2, 13);
                                boolean z5 = ((1qX) r0).mResultSet.getBoolean(i2, 52);
                                Integer nullableInteger = ((1qX) r0).mResultSet.getNullableInteger(i2, 25);
                                boolean z6 = ((1qX) r0).mResultSet.getBoolean(i2, 16);
                                return new C5ow(nullableInteger, nullableLong, nullableLong2, nullableLong3, ((1qX) r0).mResultSet.getNullableLong(i2, 24), string, string2, ((1qX) r0).mResultSet.getString(i2, 19), ((1qX) r0).mResultSet.getString(i2, 18), ((1qX) r0).mResultSet.getString(i2, 17), ((1qX) r0).mResultSet.getString(i2, 26), ((1qX) r0).mResultSet.getString(i2, 28), ((1qX) r0).mResultSet.getString(i2, 51), j, integer, integer2, z3, z4, z5, z6, ((1qX) r0).mResultSet.getBoolean(i2, 50));
                            }

                            @Override // X.C5ov
                            public int getCount() {
                                return 1qX.A00(this.A00);
                            }
                        };
                        C21O c21o2 = C21O.this;
                        C21O.A04(c21o2, c5ov);
                        c21o2.A0K.BZR("notif_processing", "App layer received notification from ACT, silent_push_enabled:true");
                        c21o2.A06(c5ov, i, z, z2);
                    }
                }
            };
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0Q = 1BK.A0Q(AQV, mailboxCallback);
            1Um.A02(AQV, new C3aw(0, mailboxFeature, l, A02, A0Q, A0K), A0Q, false);
            return;
        }
        MailboxFeature mailboxFeature2 = (MailboxFeature) c21o.A06.get();
        List A022 = ((21W) c21o.A0A.get()).A02();
        MailboxCallback mailboxCallback2 = new MailboxCallback() { // from class: X.5os
            @Override // com.facebook.msys.mca.MailboxCallback
            public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                Object obj2 = mailboxNullable.value;
                if (obj2 != null) {
                    0fH.A0h(Integer.valueOf(((1qX) obj2).mResultSet.getCount()), "MsysPushNotificationHandler", "Got %s new client notifications");
                    final C5ot c5ot = (C5ot) mailboxNullable.value;
                    C5ov c5ov = new C5ov(c5ot) { // from class: X.5ou
                        public final C5ot A00;

                        {
                            this.A00 = c5ot;
                        }

                        @Override // X.C5ov
                        public C5ow AzX(int i2) {
                            C5ot c5ot2 = this.A00;
                            long j = ((1qX) c5ot2).mResultSet.getLong(i2, 2);
                            Long nullableLong = ((1qX) c5ot2).mResultSet.getNullableLong(i2, 8);
                            Long nullableLong2 = ((1qX) c5ot2).mResultSet.getNullableLong(i2, 9);
                            Long nullableLong3 = ((1qX) c5ot2).mResultSet.getNullableLong(i2, 10);
                            boolean z3 = ((1qX) c5ot2).mResultSet.getBoolean(i2, 29);
                            boolean z4 = ((1qX) c5ot2).mResultSet.getBoolean(i2, 22);
                            String string = ((1qX) c5ot2).mResultSet.getString(i2, 5);
                            String string2 = ((1qX) c5ot2).mResultSet.getString(i2, 15);
                            long integer = ((1qX) c5ot2).mResultSet.getInteger(i2, 11);
                            long integer2 = ((1qX) c5ot2).mResultSet.getInteger(i2, 13);
                            Integer nullableInteger = ((1qX) c5ot2).mResultSet.getNullableInteger(i2, 25);
                            boolean z5 = ((1qX) c5ot2).mResultSet.getBoolean(i2, 16);
                            return new C5ow(nullableInteger, nullableLong, nullableLong2, nullableLong3, ((1qX) c5ot2).mResultSet.getNullableLong(i2, 24), string, string2, ((1qX) c5ot2).mResultSet.getString(i2, 19), ((1qX) c5ot2).mResultSet.getString(i2, 18), ((1qX) c5ot2).mResultSet.getString(i2, 17), ((1qX) c5ot2).mResultSet.getString(i2, 26), ((1qX) c5ot2).mResultSet.getString(i2, 28), ((1qX) c5ot2).mResultSet.getString(i2, 51), j, integer, integer2, z3, z4, false, z5, ((1qX) c5ot2).mResultSet.getBoolean(i2, 50));
                        }

                        @Override // X.C5ov
                        public int getCount() {
                            return ((1qX) this.A00).mResultSet.getCount();
                        }
                    };
                    C21O c21o2 = C21O.this;
                    C21O.A04(c21o2, c5ov);
                    c21o2.A0K.BZR("notif_processing", "App layer received notification from ACT, silent_push_enabled:false");
                    c21o2.A06(c5ov, i, z, z2);
                }
            }
        };
        1Um AQV2 = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV2);
        mailboxFutureImpl.Cu4(mailboxCallback2);
        if (AQV2.Cj2(new Cxv(0, mailboxFeature2, A022, mailboxFutureImpl, l))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public static void A04(C21O c21o, C5ov c5ov) {
        Long A00;
        for (int i = 0; i < c5ov.getCount(); i++) {
            C5ow AzX = c5ov.AzX(i);
            C5ox c5ox = (C5ox) c21o.A0I.get();
            String str = AzX.A0B;
            Long l = AzX.A05;
            C45o c45o = (C45o) c5ox.A01.A00.get();
            String obj = l != null ? l.toString() : null;
            long A002 = ((2In) c5ox.A00.A00.get()).A00();
            Integer num = 0S2.A0K;
            2DM r0 = new 2DM(C26T.A00);
            C00i c00i = c45o.A00;
            r0.A0o(TraceFieldType.NetworkType, ((5aF) c00i.get()).A01());
            r0.A0p("is_connection_slow", ((5aF) c00i.get()).A02());
            C45o.A02(c45o, r0, num, Long.valueOf(A002), obj, str, null, null, null);
            5Jh r02 = (5Jh) c21o.A0G.get();
            String str2 = AzX.A0C;
            String str3 = AzX.A0A;
            String str4 = AzX.A0D;
            if (5Jh.A00(r02).A02() && str2 != null) {
                5Ji A003 = 5Jh.A00(r02);
                UserFlowLogger A004 = 5Ji.A00(A003);
                long j = A003.A02;
                if (A004.isOngoingFlow(j)) {
                    0fH.A0j("SecureMessageOverWANotificationsE2ENotificationLevelLogger", "notification level: notification is synced");
                    UserFlowLogger A005 = 5Ji.A00(A003);
                    C84j c84j = Ba4.A04;
                    A005.flowMarkPoint(j, c84j.A01);
                    5Ji.A00(A003).flowAnnotateWithCrucialData(j, "c", c84j.A00);
                }
            }
            C00i c00i2 = r02.A00.A00;
            if (((2yD) ((5Jj) ((C5oy) c00i2.get()).A00.A00.get()).A00.A00.get()).AZk(2342160015718689675L)) {
                C5oy c5oy = (C5oy) c00i2.get();
                if (((2yD) ((5Jj) c5oy.A00.A00.get()).A00.A00.get()).AZk(36317006506634137L)) {
                    if (str4 != null) {
                        Context context = FbInjector.A03;
                        11T.A0A(context);
                        C01493rb c01493rb = 3rZ.A00(context).A00.A00;
                        AtomicInteger atomicInteger = C1Y6.A04;
                        int andIncrement = atomicInteger.getAndIncrement();
                        1YC r03 = c01493rb.A06;
                        r03.A08("com.facebook.messaging.tincan.tincanoverwamsys.plugins.interfaces.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "logNotificationSynced", andIncrement);
                        Exception e = null;
                        try {
                            C01493rb.A00(c01493rb);
                            if (C01493rb.A01(c01493rb)) {
                                int andIncrement2 = atomicInteger.getAndIncrement();
                                r03.A0A("com.facebook.messaging.tincan.tincanoverwamsys.plugins.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation", "messaging.tincan.tincanoverwamsys.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation", "com.facebook.messaging.tincan.tincanoverwamsys.plugins.interfaces.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", andIncrement2, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "com.facebook.messaging.tincan.tincanoverwamsys.plugins.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerKillSwitch", "logNotificationSynced");
                                try {
                                    try {
                                        SecureMessageOverWAPushNotificationHandlerImplementation secureMessageOverWAPushNotificationHandlerImplementation = c01493rb.A01;
                                        SecureMessageOverWAPushNotificationHandlerImplementation.A01(secureMessageOverWAPushNotificationHandlerImplementation, new 3kE(secureMessageOverWAPushNotificationHandlerImplementation, str4));
                                        r03.A04((Exception) null, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation", "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "logNotificationSynced", andIncrement2);
                                    } catch (Exception e2) {
                                        e = e2;
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    r03.A04(e, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation", "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "logNotificationSynced", andIncrement2);
                                    throw th;
                                }
                            }
                            r03.A02((Exception) null, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "logNotificationSynced", andIncrement);
                        } catch (Throwable th2) {
                            r03.A02(e, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "logNotificationSynced", andIncrement);
                            throw th2;
                        }
                    } else {
                        ((AnonymousClass046) 1Br.A0B(c5oy.A02)).ACu("offline_thread_id_is_null", 561978283).report();
                    }
                } else if (str3 != null && (A00 = C5oy.A00(c5oy, str3)) != null) {
                    long longValue = A00.longValue();
                    0fH.A0j(4YT.A00(758), "message level: notification is synced");
                    C00i c00i3 = c5oy.A03.A00;
                    UserFlowLogger userFlowLogger = (UserFlowLogger) c00i3.get();
                    C84j c84j2 = Ba4.A04;
                    userFlowLogger.flowMarkPoint(longValue, c84j2.A01);
                    ((UserFlowLogger) c00i3.get()).flowAnnotateWithCrucialData(longValue, "c", c84j2.A00);
                    UserFlowLogger userFlowLogger2 = (UserFlowLogger) c00i3.get();
                    C00i c00i4 = c5oy.A01.A00;
                    userFlowLogger2.flowAnnotate(longValue, TraceFieldType.NetworkType, ((5aF) c00i4.get()).A01());
                    ((UserFlowLogger) c00i3.get()).flowAnnotate(longValue, "is_connection_slow", ((5aF) c00i4.get()).A02());
                }
            }
        }
    }

    private void A05(C5ow c5ow, String str) {
        if (((2yD) this.A0C.get()).AZk(36317088108850126L)) {
            C21p c21p = (C21p) this.A09.get();
            Long l = c5ow.A05;
            c21p.A02(null, "secure_message", "notif_engine_processing_app_layer_stage", l == null ? null : l.toString(), c5ow.A0B, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05c2  */
    /* JADX WARN: Type inference failed for: r0v248, types: [X.1FX, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v372, types: [X.3z9] */
    /* JADX WARN: Type inference failed for: r0v414, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(X.C5ov r302, final int r303, final boolean r304, final boolean r305) {
        /*
            Method dump skipped, instructions count: 2513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21O.A06(X.5ov, int, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.1FX, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // X.C1qM
    public void CNu(Set set) {
        if (!set.contains("not_presented_client_notifications") || ((2yD) this.A0C.get()).AZk(36317088108850126L)) {
            return;
        }
        if (!((21W) this.A0A.get()).A06()) {
            A03(this, 2, false, false);
            return;
        }
        CHJ chj = (CHJ) this.A0P.get();
        ?? obj = new Object();
        if (chj.A01.booleanValue()) {
            obj.set(Integer.valueOf(chj.A00));
        } else {
            ((BDO) 1Br.A0B(chj.A02)).A00(new Cxe(obj, chj, 7));
        }
        1Kd.A0F(new C3dl(this, 7), (ListenableFuture) obj, (Executor) 1Bi.A03(16467));
    }
}
