package X;

import android.os.Process;
import com.facebook.acra.constants.ActionId;
import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger;
import com.facebook.messaging.search.nullstate.prefetch.SearchNullStateMediaTabPrefetcher;
import com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox;
import com.facebook.messenger.platform_logger.mplsyncmonitor.MPLSyncMonitor;
import com.facebook.messenger.tal.applifetime.AppLifetime;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mca.System;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.util.NotificationScope;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3b5, reason: invalid class name */
/* loaded from: 3b5.class */
public final class C3b5 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3b5(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static NotificationScope A00(C1y2 c1y2, C3b5 c3b5, String str, int i) {
        NotificationScope A00 = c1y2.A00(new A1j(c3b5, i), str);
        ((MailboxFutureImpl) c3b5.A02).setNotification(str, A00);
        return A00;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v246, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r326v21 */
    /* JADX WARN: Type inference failed for: r326v22 */
    /* JADX WARN: Type inference failed for: r326v23, types: [X.1gh] */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1xH r306;
        8EF r303;
        3Dh r328;
        String str;
        AnonymousClass261 anonymousClass261;
        SettableFuture settableFuture;
        2CB r307;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        MailboxNullable A0T;
        A1g a1g;
        String str2;
        String str3;
        1Ql A08;
        ArrayList A17;
        1qX r0;
        switch (this.A00) {
            case 0:
                Boolean bool = (Boolean) obj;
                11T.A0D(bool);
                if (!bool.booleanValue()) {
                    0fH.A0j("EncryptedBackupsManagerApi", "deleteBackups fails");
                    r306 = (1xH) this.A01;
                    r303 = new 8EF(new Exception());
                    r306.A04(r303);
                    return;
                }
                0fH.A0j("EncryptedBackupsManagerApi", "deleteBackups succeeds");
                ((C1x9) this.A02).A02.A00(C1wj.A06);
                r306 = (1xH) this.A01;
                r328 = 3Dg.A02;
                r303 = new C87e(r328);
                r306.A04(r303);
                return;
            case 1:
                int A03 = AnonymousClass001.A03(obj);
                0fH.A0j("EncryptedBackupsManagerApi", 0Pz.A0T("fetchBackupStatus finished with status=", A03));
                3Dh[] r02 = C1wj.A00;
                int length = r02.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        r328 = r02[i];
                        if (r328.status != A03) {
                            i++;
                        }
                    } else {
                        r328 = C1wj.A05;
                    }
                }
                ((C1x9) this.A02).A02.A00(r328);
                int i2 = C1wj.A05.status;
                r306 = (1xH) this.A01;
                if (A03 == i2) {
                    r303 = new 8EF(new Exception());
                    r306.A04(r303);
                    return;
                }
                r303 = new C87e(r328);
                r306.A04(r303);
                return;
            case 2:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if ((mailboxNullable != null ? mailboxNullable.value : null) == null) {
                    0fH.A0k("EncryptedBackupsManagerApi", "EncryptedBackups fetchVirtualDevicesMetadata fails.");
                    1xH.A01((1xH) this.A01, new Exception());
                    return;
                }
                List list = (List) mailboxNullable.value;
                if (list == null) {
                    0fH.A0k("EncryptedBackupsManagerApi", "EncryptedBackups fetchVirtualDevicesMetadata fails list cast.");
                    1xH.A01((1xH) this.A01, new Exception());
                    return;
                }
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj2 : list) {
                    String str4 = null;
                    if (obj2 instanceof HashMap) {
                        java.util.Map map = (java.util.Map) obj2;
                        if ((map.get("MCAMailboxEncryptedBackupsManagerVirtualDeviceIDDictKey") instanceof String) && (map.get("MCAMailboxEncryptedBackupsManagerVirtualDeviceTypeDictKey") instanceof Integer)) {
                            Object obj3 = map.get("MCAMailboxEncryptedBackupsManagerVirtualDeviceTypeDictKey");
                            String A00 = AnonymousClass000.A00(0);
                            11T.A0I(obj3, A00);
                            for (C96p c96p : C96p.values()) {
                                if (11T.A0O(c96p.type, obj3)) {
                                    Object obj4 = map.get("MCAMailboxEncryptedBackupsManagerVirtualDeviceTypeDictKey");
                                    11T.A0I(obj4, A00);
                                    Integer num = 0S2.A00;
                                    Object obj5 = map.get("MCAMailboxEncryptedBackupsManagerVirtualDeviceCreationTimeDictKey");
                                    Long l = obj5 instanceof Long ? (Long) obj5 : null;
                                    Object obj6 = map.get("MCAMailboxEncryptedBackupsManagerVirtualDeviceIDDictKey");
                                    11T.A0I(obj6, "null cannot be cast to non-null type kotlin.String");
                                    String str5 = (String) obj6;
                                    Object obj7 = map.get("MCAMailboxEncryptedBackupsManagerVirtualDeviceCreatedOnDictKey");
                                    String str6 = obj7 instanceof String ? (String) obj7 : null;
                                    for (C96p c96p2 : C96p.values()) {
                                        if (11T.A0O(c96p2.type, obj4)) {
                                            Object obj8 = map.get("MCAMailboxEncryptedBackupsManagerVirtualDeviceCloudServiceAccountKey");
                                            if (obj8 instanceof String) {
                                                str4 = (String) obj8;
                                            }
                                            A0s.add(new C9cd(c96p2, num, l, str5, str6, str4));
                                        }
                                    }
                                    throw 1BK.A0h();
                                }
                            }
                        }
                    }
                    0fH.A0k("EncryptedBackupsManagerApi", "EncryptedBackups fetchVirtualDevicesMetadata response typecast fails.");
                    1xH.A01((1xH) this.A01, new Exception());
                    return;
                    break;
                }
                0fH.A0j("EncryptedBackupsManagerApi", "EncryptedBackups fetchVirtualDevicesMetadata succeeds.");
                ((1xH) this.A01).A04(new C87e(new 9GV(A0s)));
                return;
            case 3:
                MailboxNullable mailboxNullable2 = (MailboxNullable) obj;
                r328 = mailboxNullable2 != null ? mailboxNullable2.value : null;
                StringBuilder A0k = AnonymousClass001.A0k();
                if (r328 != null) {
                    A0k.append("generateRecoveryCode success with VD type ");
                    0fH.A0j("EncryptedBackupsManagerApi", AnonymousClass001.A0a(this.A02, A0k));
                    r306 = (1xH) this.A01;
                    r303 = new C87e(r328);
                    r306.A04(r303);
                    return;
                }
                A0k.append("generateRecoveryCode error with VD type ");
                0fH.A0j("EncryptedBackupsManagerApi", AnonymousClass001.A0a(this.A02, A0k));
                r306 = (1xH) this.A01;
                r303 = new 8EF(new Exception());
                r306.A04(r303);
                return;
            case 4:
                3KF r03 = (3KF) obj;
                String str7 = null;
                if (r03 != null) {
                    str = r03.A00;
                    str7 = r03.A01;
                } else {
                    str = null;
                }
                if (str == null || str7 == null) {
                    StringBuilder A0k2 = AnonymousClass001.A0k();
                    A0k2.append("generateRecoveryCode error with VD type ");
                    0fH.A0j("EncryptedBackupsManagerApi", AnonymousClass001.A0a(this.A02, A0k2));
                    r306 = (1xH) this.A01;
                    r303 = new 8EF(new Exception());
                    r306.A04(r303);
                    return;
                }
                StringBuilder A0k3 = AnonymousClass001.A0k();
                A0k3.append("generateRecoveryCode success with VD type ");
                0fH.A0j("EncryptedBackupsManagerApi", AnonymousClass001.A0a(this.A02, A0k3));
                r306 = (1xH) this.A01;
                r328 = new Kso(str, str7);
                r303 = new C87e(r328);
                r306.A04(r303);
                return;
            case 5:
                Boolean bool2 = (Boolean) obj;
                11T.A0D(bool2);
                if (!bool2.booleanValue()) {
                    0fH.A0j("EncryptedBackupsManagerApi", "OptOutOfBackup fails");
                    r306 = (1xH) this.A01;
                    r303 = new 8EF(new Exception());
                    r306.A04(r303);
                    return;
                }
                0fH.A0j("EncryptedBackupsManagerApi", "OptOutOfBackup succeeds");
                ((C1x9) this.A02).A02.A00(C1wj.A03);
                r306 = (1xH) this.A01;
                r328 = 3Dh.A02;
                r303 = new C87e(r328);
                r306.A04(r303);
                return;
            case 6:
                MailboxNullable mailboxNullable3 = (MailboxNullable) obj;
                ((1FX) this.A02).set(mailboxNullable3 == null ? null : mailboxNullable3.value);
                return;
            case 7:
                MailboxNullable mailboxNullable4 = (MailboxNullable) obj;
                if (mailboxNullable4 == null || mailboxNullable4.value == null) {
                    ((1FX) this.A02).set((Object) null);
                }
                ((1FX) this.A02).set(mailboxNullable4.value);
                return;
            case 8:
                ((1FX) this.A02).set(obj);
                return;
            case 9:
                MailboxNullable mailboxNullable5 = (MailboxNullable) obj;
                Object obj9 = mailboxNullable5.value;
                if (obj9 != null) {
                    0fH.A0g(obj9, "AdvancedCryptoTransport", "Login type is %s");
                    Object obj10 = mailboxNullable5.value;
                    if ("PREVIOUSLY_REGISTERED".equals(obj10)) {
                        anonymousClass261 = (AnonymousClass261) this.A01;
                        settableFuture = (SettableFuture) this.A02;
                        r307 = 2CB.A06;
                    } else {
                        if ("NEW_REGISTRATION_HAPPENED".equals(obj10)) {
                            AnonymousClass261 anonymousClass2612 = (AnonymousClass261) this.A01;
                            SettableFuture settableFuture2 = (SettableFuture) this.A02;
                            AnonymousClass261 anonymousClass2613 = AnonymousClass261.$redex_init_class;
                            anonymousClass2612.A04 = new 3bG(anonymousClass2612, settableFuture2);
                            AccountSession accountSession = anonymousClass2612.A0C;
                            if (accountSession == null) {
                                0fH.A0k("AdvancedCryptoTransport", "Failed to get msys account session");
                                AnonymousClass261.A02(anonymousClass2612, 2CB.A08, settableFuture2);
                                return;
                            } else {
                                SessionedNotificationCenter sessionedNotificationCenter = accountSession.getSessionedNotificationCenter();
                                1Uc r04 = anonymousClass2612.A04;
                                r04.getClass();
                                sessionedNotificationCenter.addObserver(r04, "MCAMailboxAdvancedCryptoTransportDidRegistrationNotification", 1, null);
                                return;
                            }
                        }
                        if ("ALREADY_LOGGED_IN".equals(obj10)) {
                            anonymousClass261 = (AnonymousClass261) this.A01;
                            settableFuture = (SettableFuture) this.A02;
                            r307 = 2CB.A05;
                        } else if (MessageAvailabilityResponseId$Companion.NOT_SUPPORTED.equals(obj10)) {
                            anonymousClass261 = (AnonymousClass261) this.A01;
                            settableFuture = (SettableFuture) this.A02;
                            r307 = 2CB.A04;
                        } else if ("MAILBOX_INVALID".equals(obj10)) {
                            anonymousClass261 = (AnonymousClass261) this.A01;
                            settableFuture = (SettableFuture) this.A02;
                            r307 = 2CB.A03;
                        } else if ("USING_MEM_LOGIN".equals(obj10)) {
                            anonymousClass261 = (AnonymousClass261) this.A01;
                            settableFuture = (SettableFuture) this.A02;
                            r307 = 2CB.A0A;
                        }
                    }
                    AnonymousClass261.A02(anonymousClass261, r307, settableFuture);
                    return;
                }
                0fH.A0n("AdvancedCryptoTransport", "Login type is not returned");
                anonymousClass261 = (AnonymousClass261) this.A01;
                settableFuture = (SettableFuture) this.A02;
                r307 = 2CB.A02;
                AnonymousClass261.A02(anonymousClass261, r307, settableFuture);
                return;
            case 10:
                AccountSession accountSession2 = (AccountSession) obj;
                MailboxAdvancedCryptoTransportJNI.dispatchVOO(7, accountSession2, A00((C1y2) accountSession2.getNotificationCenterCallbackManager(), this, (String) AnonymousClass206.A00.A00(15), 2));
                return;
            case 11:
                AccountSession accountSession3 = (AccountSession) obj;
                MailboxAdvancedCryptoTransportJNI.dispatchVOO(12, accountSession3, A00((C1y2) accountSession3.getNotificationCenterCallbackManager(), this, (String) AnonymousClass206.A00.A00(18), 7));
                return;
            case 12:
                ((MailboxObservableImpl) this.A02).setResult(MailboxAdvancedCryptoTransportJNI.dispatchOO(15, obj));
                return;
            case 13:
                Object dispatchOO = MailboxAdvancedCryptoTransportJNI.dispatchOO(16, obj);
                MailboxObservableImpl mailboxObservableImpl = (MailboxObservableImpl) this.A02;
                if (dispatchOO == null) {
                    dispatchOO = null;
                }
                mailboxObservableImpl.setResult(new MailboxNullable(dispatchOO));
                return;
            case 14:
                AccountSession accountSession4 = (AccountSession) obj;
                String str8 = (String) 1xC.A00.A00(6);
                NotificationScope A002 = ((C1y2) accountSession4.getNotificationCenterCallbackManager()).A00(new A1k(str8, this, 19), str8);
                ((MailboxFutureImpl) this.A02).setNotification(str8, A002);
                MailboxCoreJNI.dispatchVIOOO(57, 0, accountSession4, "msg_double_tap_to_like", A002);
                return;
            case 15:
                AccountSession accountSession5 = (AccountSession) obj;
                MailboxEncryptedBackupsJNI.dispatchVOO(11, accountSession5, A00((C1y2) accountSession5.getNotificationCenterCallbackManager(), this, (String) 1xA.A00.A00(78), 11));
                return;
            case 16:
                AccountSession accountSession6 = (AccountSession) obj;
                MailboxEncryptedBackupsJNI.dispatchVOO(6, accountSession6, A00((C1y2) accountSession6.getNotificationCenterCallbackManager(), this, (String) 1xA.A00.A00(80), 16));
                return;
            case 17:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, 51);
                str2 = "MCAMailboxFamilyCenterSupervision";
                str3 = "GetGuardianID";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 18:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, 52);
                str2 = "MCAMailboxFamilyCenterSupervision";
                str3 = "GetSupervisionEdge";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 19:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, 53);
                str2 = "MCAMailboxFamilyCenterSupervision";
                str3 = "QueryAllQuietTimes";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 20:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, 56);
                str2 = "MCAMailboxFXCAL";
                str3 = "FetchLinkedAccounts";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 21:
                MailboxNullable mailboxNullable6 = (MailboxNullable) obj;
                11T.A0F(mailboxNullable6, 0);
                1qX r313 = (1qX) mailboxNullable6.value;
                if (r313 == null || 1qX.A00(r313) <= 0) {
                    r313 = null;
                }
                if (r313 == null) {
                    0fH.A0j("SelectiveSyncInboxBumpedThreadsHandler", "Skipping bumped to inbox sync -- no threads to sync");
                    ((2Zj) this.A02).A07.A00(0S2.A0C);
                    return;
                }
                0fH.A0j("SelectiveSyncInboxBumpedThreadsHandler", 0Pz.A0d(AbstractC00603o4.A00(ActionId.QUERY_READY), " bumped threads to report", 1qX.A00(r313)));
                07E A07 = 07C.A07(0, 1qX.A00(r313));
                int A003 = 02J.A00(C1A3.A1D(A07, 10));
                if (A003 < 16) {
                    A003 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A003);
                07I it = A07.iterator();
                while (it.hasNext()) {
                    int A004 = it.A00();
                    linkedHashMap.put(String.valueOf(r313.mResultSet.getLong(A004, 0)), 1BK.A1D("last_activity_timestamp_ms", 1BK.A0m(r313.mResultSet, A004, 2)));
                }
                MailboxFeature mailboxFeature = (MailboxFeature) this.A01;
                1Um A0O = 1BK.A0O(mailboxFeature, 0);
                MailboxFutureImpl A0P = 1BK.A0P(A0O);
                1Um.A02(A0O, new A1e(13, A0P, mailboxFeature, linkedHashMap), A0P, false);
                2Zj r05 = (2Zj) this.A02;
                r05.A0A.set(A0P);
                Executor executor = (Executor) 1Br.A0B(r05.A02);
                final int size = linkedHashMap.size();
                final C22K c22k = r05.A07;
                A0P.addResultCallback(executor, new MailboxCallback(c22k, size) { // from class: X.5ce
                    public final int A00;
                    public final C22K A01;

                    {
                        11T.A0F(c22k, 2);
                        this.A00 = size;
                        this.A01 = c22k;
                    }

                    @Override // com.facebook.msys.mca.MailboxCallback
                    public /* bridge */ /* synthetic */ void onCompletion(Object obj11) {
                        boolean booleanValue = ((Boolean) obj11).booleanValue();
                        String A005 = 7zK.A00(booleanValue ? 233 : 170);
                        StringBuilder sb = new StringBuilder();
                        sb.append(A005);
                        sb.append(' ');
                        sb.append(this.A00);
                        sb.append(" bumped to inbox CM threads");
                        0fH.A0j(1BJ.A00(858), sb.toString());
                        this.A01.A00(booleanValue ? 0S2.A00 : 0S2.A01);
                    }
                });
                return;
            case 22:
                MailboxNullable mailboxNullable7 = (MailboxNullable) obj;
                Object obj11 = mailboxNullable7.value;
                if (obj11 == null) {
                    0fH.A0n("MsysThreadListAdapter", "loadThreadRangesInfoV2 get unexpected null");
                    return;
                }
                long j = 0;
                long j2 = Long.MAX_VALUE;
                if (1qX.A00((1qX) obj11) > 0) {
                    1qX r06 = (1qX) mailboxNullable7.value;
                    j = r06.mResultSet.getLong(0, 5);
                    j2 = r06.mResultSet.getLong(0, 7);
                }
                Number number = (Number) this.A02;
                if (number.intValue() == 0) {
                    ((1UX) this.A01).A01 = Long.valueOf(j2);
                }
                1UX r07 = (1UX) this.A01;
                ((1SG) r07.A0K.get()).A0K("thread_ranges_query");
                ((1xC) r07.A0D.get()).A05(new A1d(this, 84), number, Long.valueOf(j), Long.MIN_VALUE, Long.valueOf(j2), 0, 0);
                return;
            case 23:
                1qX r08 = (1qX) ((MailboxNullable) obj).value;
                if (r08 != null) {
                    long j3 = r08.mResultSet.getLong(0, 0);
                    A08 = 1Br.A08((1Br) this.A01);
                    A08.CaH(((1xX) 1Br.A0B((1Br) this.A02)).A02(), j3);
                } else {
                    A08 = 1Br.A08((1Br) this.A01);
                    A08.Cdj(((1xX) 1Br.A0B((1Br) this.A02)).A02());
                }
                A08.commit();
                return;
            case 24:
                C20u c20u = (C20u) this.A01;
                MailboxNullable mailboxNullable8 = (MailboxNullable) obj;
                if (mailboxNullable8.value != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (int i3 = 0; i3 < 1qX.A00((1qX) mailboxNullable8.value); i3++) {
                        int integer = ((1qX) mailboxNullable8.value).mResultSet.getInteger(i3, 0);
                        java.util.Map map2 = c20u.A02;
                        Integer valueOf = Integer.valueOf(integer);
                        if (!map2.containsKey(valueOf)) {
                            map2.put(valueOf, new 29E());
                        }
                        ((1qX) mailboxNullable8.value).mResultSet.getNullableLong(i3, 3);
                        long j4 = ((1qX) mailboxNullable8.value).mResultSet.getLong(i3, 2);
                        int integer2 = ((1qX) mailboxNullable8.value).mResultSet.getInteger(i3, 1);
                        Object obj12 = map2.get(valueOf);
                        obj12.getClass();
                        29E r09 = (29E) obj12;
                        boolean A1S = 1BL.A1S((currentTimeMillis > j4 ? 1 : (currentTimeMillis == j4 ? 0 : -1)));
                        synchronized (r09) {
                            r09.A04 = true;
                            r09.A02 = integer2;
                            if (!r09.A05) {
                                r09.A03 = A1S;
                            }
                            r09.A00 = 0;
                            r09.A01 = 0;
                        }
                    }
                    return;
                }
                return;
            case 25:
                MailboxNullable mailboxNullable9 = (MailboxNullable) obj;
                if (mailboxNullable9 == null || (r0 = (1qX) mailboxNullable9.value) == null) {
                    return;
                }
                SearchNullStateMediaTabPrefetcher searchNullStateMediaTabPrefetcher = (SearchNullStateMediaTabPrefetcher) this.A02;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (1qX.A00(r0) == 0) {
                    searchNullStateMediaTabPrefetcher.A01(fbUserSession, currentTimeMillis2, false);
                } else if (Math.abs(currentTimeMillis2 - r0.mResultSet.getLong(0, 0)) >= C1gb.A02((C1gb) 1Br.A0B(searchNullStateMediaTabPrefetcher.A01)).Ai7(37167667728089743L)) {
                    searchNullStateMediaTabPrefetcher.A01(fbUserSession, currentTimeMillis2, true);
                } else {
                    ((C00683ob) 1Lm.A07(fbUserSession, searchNullStateMediaTabPrefetcher.A00.A00, 67629)).A09(new A1U(17, currentTimeMillis2, fbUserSession, searchNullStateMediaTabPrefetcher), C0s8.A14(0, 1, 2));
                }
                0fH.A0m("SearchNullStateMediaTabPrefetcher", "Done prefetching media tab results");
                return;
            case 26:
                final 1MZ r010 = (1MZ) this.A01;
                final FbUserSession fbUserSession2 = (FbUserSession) this.A02;
                final Mailbox mailbox2 = (Mailbox) obj;
                if (r010.A0J != null) {
                    r010.A0J.A04();
                }
                System system = System.getInstance();
                if (AppLifetime.isStarted) {
                    AppLifetime.mailboxInitNative(system, mailbox2);
                }
                if (1BK.A0N(r010.A08).AZk(36316619967768904L)) {
                    1MZ.A00(fbUserSession2, r010, mailbox2);
                    return;
                } else {
                    ((Executor) 1Br.A0B(r010.A0C.A00)).execute(new Runnable() { // from class: X.3hq
                        public static final String __redex_internal_original_name = "MessengerMsysBootstrap$$ExternalSyntheticLambda8";

                        @Override // java.lang.Runnable
                        public final void run() {
                            1MZ.A00(fbUserSession2, r010, mailbox2);
                        }
                    });
                    return;
                }
            case 27:
                Mailbox mailbox3 = (Mailbox) obj;
                C00j.A05("MessengerMsysMailbox.initMailboxWithCallbackImpl.onCompletion", -121812535);
                MessengerPerUserMsysMailbox messengerPerUserMsysMailbox = (MessengerPerUserMsysMailbox) this.A01;
                if (((1SI) messengerPerUserMsysMailbox.A08.get()).A08() && 1BK.A0N(messengerPerUserMsysMailbox.A06).AZk(36313609187302167L)) {
                    new Thread(new Runnable() { // from class: X.3fa
                        public static final String __redex_internal_original_name = "MessengerPerUserMsysMailbox$2$1";

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
                        /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
                        @Override // java.lang.Runnable
                        public void run() {
                            MessengerPerUserMsysMailbox messengerPerUserMsysMailbox2 = (MessengerPerUserMsysMailbox) C3b5.this.A01;
                            ?? A005 = 2yD.A00(1BK.A0N(messengerPerUserMsysMailbox2.A06), 36595084164073896L);
                            Process.setThreadPriority(A005);
                            try {
                                A005 = ((C1yx) messengerPerUserMsysMailbox2.A09.get()).AQX().get();
                            } catch (InterruptedException | ExecutionException unused) {
                                throw AnonymousClass001.A0U(A005);
                            }
                        }
                    }, "WaMsysInit").start();
                }
                C1yS c1yS = (C1yS) messengerPerUserMsysMailbox.A05.get();
                FbUserSession fbUserSession3 = messengerPerUserMsysMailbox.A01;
                synchronized (c1yS) {
                    11T.A0F(fbUserSession3, 0);
                    if (!C1yS.A01(c1yS) && c1yS.A0G == null) {
                        Execution.initialize();
                        C00i c00i = c1yS.A07.A00;
                        ((MessagingStateChangePerformanceLogger) c00i.get()).A0C("register_broadcast_receiver");
                        C00i c00i2 = c1yS.A03.A00;
                        if (((C1m1) c00i2.get()).A03()) {
                            ((MessagingStateChangePerformanceLogger) c00i.get()).A0C("mqtt_connected");
                        }
                        MqttNetworkSessionPlugin mqttNetworkSessionPlugin = MqttNetworkSessionPlugin.get();
                        if (((C1m1) c00i2.get()).A03()) {
                            Execution.executeAsync(new 1yT(mqttNetworkSessionPlugin), null, 3);
                            ((C1yU) 1Br.A0B(c1yS.A02)).A0K("mqtt_connected");
                        } else {
                            Execution.executeAsync(new C2sj(mqttNetworkSessionPlugin), null, 3);
                            ((C1yU) 1Br.A0B(c1yS.A02)).A0K("mqtt_disconnected");
                        }
                        C00i c00i3 = c1yS.A04.A00;
                        c1yS.A0G = 1P9.A01(1P9.A00(c00i3), new 3cN(c1yS), "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
                        0fH.A0j("MessengerMsysBroadcastReceiver", "channelStateReceiverBuilder registered");
                        1PA r011 = c1yS.A0G;
                        11T.A0D(r011);
                        r011.A00();
                        NetworkSession A01 = MsysInfraNoSqliteObjectHolder.A01();
                        C00i c00i4 = c1yS.A05.A00;
                        boolean A0M = ((FbNetworkManager) c00i4.get()).A0M();
                        if (A01 != null) {
                            if (A0M) {
                                0fH.A0j("MessengerMsysBroadcastReceiver", "initial network session setNetworkStateConnected");
                                A01.setNetworkStateConnected();
                                ((1SF) 1Br.A0B(c1yS.A0A)).A0K("network_connected");
                            } else {
                                0fH.A0j("MessengerMsysBroadcastReceiver", "initial network session setNetworkStateDisconnected");
                                A01.setNetworkStateDisconnected();
                                ((1SF) 1Br.A0B(c1yS.A0A)).A0K("network_disconnected");
                            }
                        }
                        if (1Br.A06(c1yS.A00).AZk(72340718282084436L)) {
                            ((FbNetworkManager) c00i4.get()).A0a = true;
                        }
                        C1yS.A00(c1yS);
                        if (c1yS.A0I == null) {
                            c1yS.A0I = 1P9.A01(1P9.A00(c00i3), new 1yY(c1yS), "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
                            0fH.A0j("MessengerMsysBroadcastReceiver", "networkStateBroadcastReceiver registered");
                            1PA r012 = c1yS.A0I;
                            11T.A0D(r012);
                            r012.A00();
                        }
                        if (c1yS.A0H == null) {
                            ((ExecutorService) 1Br.A0B(c1yS.A01)).execute(new 1yZ(fbUserSession3, c1yS));
                            c1yS.A0H = 1P9.A01(1P9.A00(c1yS.A06.A00), new 3cN(fbUserSession3, c1yS, 1), "android.os.action.DEVICE_IDLE_MODE_CHANGED");
                            try {
                                1PA r013 = c1yS.A0H;
                                11T.A0D(r013);
                                r013.A00();
                            } catch (NullPointerException unused) {
                            }
                        }
                        C1yi.A01((C1yi) 1Br.A0B(c1yS.A0B), "[broadcast_receiver_registered]", null);
                    }
                }
                mailbox3.getClass();
                ((MailboxCallback) this.A02).onCompletion(mailbox3);
                synchronized (messengerPerUserMsysMailbox) {
                    List list2 = messengerPerUserMsysMailbox.A0B;
                    A17 = 1BK.A17(list2);
                    list2.clear();
                }
                0fH.A0g(1BK.A0k(A17), "com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox", "%d callsite(s) from runWithMailboxSerialized() are going to be called");
                int size2 = A17.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((MailboxCallback) A17.get(i4)).onCompletion(mailbox3);
                }
                1hN r014 = (1hN) messengerPerUserMsysMailbox.A03.get();
                C00i c00i5 = r014.A00.A00;
                ((1SG) c00i5.get()).A0K("mailbox_complete");
                ((1UZ) 1Br.A0B(((1SF) c00i5.get()).A06)).A00("msys_mailbox_complete");
                C00i c00i6 = r014.A07.A00;
                ((1SG) c00i6.get()).A0K("mailbox_complete");
                1Vu r015 = (1Vu) c00i6.get();
                r015.A0d(0Pz.A0W("msys_mailbox_complete", "_mqtt_state"), r015.A02);
                1Br.A0E(r014.A04, "mailbox_complete");
                ?? r326 = MPLSyncMonitor.class;
                synchronized (r326) {
                    try {
                        MPLSyncMonitor.mailbox = mailbox3;
                        MPLSyncMonitor.isFirstSyncInitiated = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                r326 = (C1gh) messengerPerUserMsysMailbox.A04.get();
                synchronized (r326) {
                    C1gx c1gx = (C1gx) 1Br.A0B(r326.A01);
                    if (c1gx.A04) {
                        C1gx.A00(c1gx).markerPoint(729356554, "msys_bootstrap_end");
                    }
                    1aX r016 = (1aX) 1Br.A0B(r326.A02);
                    1aX.A01(r016, new C2xl(r016, 35));
                    1hC r017 = (1hC) 1Br.A0B(r326.A08);
                    1hD.A01(r017, new C2xl(r017, 46));
                }
                1V8.A00().CZm(new PRELoggingEvent("msys_bootstrap", "_end"));
                C00j.A01(-484506960);
                return;
            case 28:
                MailboxCallback mailboxCallback = (MailboxCallback) this.A02;
                C00j.A05(0Pz.A0j("MessengerMsysMailbox.onCompletion:<cls>", AnonymousClass001.A0Y(mailboxCallback), "</cls>"), 2119191481);
                obj.getClass();
                mailboxCallback.onCompletion(obj);
                C00j.A01(1051742551);
                return;
            case 29:
                ((Mailbox) obj).addStoredProcedureChangedListener((C1qM) this.A02);
                return;
            case 30:
            case 31:
                ((MailboxCallback) this.A02).onCompletion(((Mailbox) obj).getSlimMailbox());
                return;
            case 32:
            case 33:
            default:
                ((SlimMailbox) obj).mCallbackExecutor.execute((Runnable) this.A02);
                return;
            case 34:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, ActionId.RTMP_CONNECTION_REQUESTED);
                str2 = "MCAMailboxRoomsChat";
                str3 = "AllRtcRoomsOnThreads";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 35:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, ActionId.RTMP_CONNECTION_RELEASE);
                str2 = AbE.A00(301);
                str3 = "AllRtcThreadOngoingCalls";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 36:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, ActionId.APP_DID_FINISH_LAUNCHING);
                str2 = "MCAMailboxSyncStates";
                str3 = "SyncStateSnapshot";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 37:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, ActionId.BEGIN_START_ACTIVITY);
                str2 = "MCAMailboxTopBanners";
                str3 = "EncryptedBackupsBannersList";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 38:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, 150);
                str2 = "MCAMailboxUserPrefsBool";
                str3 = "UserPrefsBool";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
            case 39:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0T = 1BL.A0T();
                a1g = new A1g(this, ActionId.APPLY_FINISHED_LIST);
                str2 = "MCAMailboxUserPrefsString";
                str3 = "UserPrefsString";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str2, str3, a1g);
                return;
        }
    }
}
