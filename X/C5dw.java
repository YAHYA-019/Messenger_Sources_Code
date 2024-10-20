package X;

import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.communitymessaging.notify.analytics.CommunityMessagingNotificationsLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.logging.MessagesSystemTrayLogService;
import com.facebook.messengercar.CarNotificationService;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5dw, reason: invalid class name */
/* loaded from: 5dw.class */
public abstract class C5dw extends 0ON implements AnonymousClass025, 1IM {
    public QuickPerformanceLogger A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final AnonymousClass074 A04;
    public final C00i A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.074] */
    public C5dw(String str) {
        super(str);
        11T.A0F(str, 1);
        this.A04 = new Object();
        this.A01 = 1Bu.A00(66371);
        this.A03 = 1Bu.A01(this, 16428);
        this.A02 = 1Bq.A00(16511);
        1BP r0 = FbInjector.A00;
        11T.A0A(r0);
        this.A05 = r0;
    }

    public void A01(Intent intent) {
        1T7 r303;
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(43712515, "handle-intent");
        }
        C00j.A07("FbIntentService[%s].onSecuredHandleIntent", getClass().getSimpleName(), 2046552371);
        try {
            Process.setThreadPriority(1DW.A06.androidThreadPriority);
            String A00 = 1BJ.A00(21);
            try {
                if (intent != null) {
                    try {
                    } catch (Exception e) {
                        1Br.A04(this.A02).softReport(AbstractC00603o4.A00(432), e);
                        r303 = 1T7.A01;
                    }
                    if (intent.hasExtra(A00)) {
                        r303 = ((1EZ) 1Br.A0B(this.A03)).CZt((ViewerContext) intent.getParcelableExtra(A00));
                        A03(intent);
                        r303.close();
                        C00j.A01(-2081734987);
                        return;
                    }
                }
                A03(intent);
                r303.close();
                C00j.A01(-2081734987);
                return;
            } finally {
            }
            r303 = 1T7.A01;
        } catch (Throwable th) {
            C00j.A01(-728494356);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, com.facebook.messengercar.CarNotificationService] */
    public void A02() {
        if (this instanceof MessagesSystemTrayLogService) {
            ((MessagesSystemTrayLogService) this).A00 = (C5dx) 1Bi.A03(49803);
            return;
        }
        ?? r0 = (CarNotificationService) this;
        1EZ r02 = (1EZ) 1Bn.A0E((Context) r0, (1BY) null, 16428);
        r0.A00 = (1Bt) 1Bi.A03(66185);
        r0.A01 = (AnonymousClass208) 1Bn.A0E((Context) r0, (1BY) null, 17006);
        FbUserSession A04 = 1Fw.A04(r02);
        r0.A02 = (5I5) 1Lo.A04((Context) r0, A04, (1BY) null, 49665);
        r0.A03 = (CQl) 1Hv.A02((Context) r0, 65898);
        r0.A04 = (C5Pr) 1Lo.A04((Context) r0, A04, (1BY) null, 49712);
        r0.A05 = (Executor) 1Bi.A03(16432);
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [android.content.Context, com.facebook.messaging.notify.logging.MessagesSystemTrayLogService] */
    public void A03(Intent intent) {
        int A04;
        int i;
        int andIncrement;
        String str;
        String str2;
        String str3;
        if (this instanceof MessagesSystemTrayLogService) {
            ?? r0 = (MessagesSystemTrayLogService) this;
            A04 = 0FI.A04(1807859484);
            if (intent == null) {
                i = -1641965837;
            } else {
                C1cx.A00(r0);
                Bundle extras = intent.getExtras();
                String string = extras.getString("event_type_extra");
                int i2 = extras.getInt("notif_android_id");
                String string2 = extras.getString("notif_android_tag");
                if ("messaging_notification_dismiss_from_tray".equals(string)) {
                    C5dx c5dx = r0.A00;
                    Object obj = extras.get("event_params");
                    java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
                    ThreadKey A0K = ThreadKey.A0K(extras.getString("notif_android_tag"), true);
                    C45d c45d = (C45d) c5dx.A04.get();
                    c45d.A00.A00("notif_dismiss_from_tray");
                    if (map != null) {
                        1UG A00 = 1UD.A00((04J) c45d.A07.A00.get(), 1ZG.A01, "notif_dismiss_from_tray");
                        if (A00.isSampled()) {
                            for (Map.Entry entry : map.entrySet()) {
                                String str4 = (String) entry.getKey();
                                String str5 = (String) entry.getValue();
                                switch (str4.hashCode()) {
                                    case -1690722221:
                                        str3 = "message_id";
                                        break;
                                    case -1187973399:
                                        str3 = "notif_type";
                                        break;
                                    case -947822266:
                                        str3 = "delivery_id";
                                        break;
                                    case -896505829:
                                        str3 = Property.SYMBOL_Z_ORDER_SOURCE;
                                        break;
                                    case -219794336:
                                        str3 = "push_id";
                                        break;
                                    case 32190309:
                                        str3 = "sender_id";
                                        break;
                                    case 1167367133:
                                        str3 = "client_notif_type";
                                        break;
                                }
                                if (str4.equals(str3)) {
                                    A00.A7R(str3, str5);
                                }
                            }
                            A00.BZL();
                        }
                    }
                    c5dx.A03.get();
                    C5dz c5dz = (C5dz) c5dx.A06.get();
                    C5dz.A03(A0K, c5dz, "notification_dismissed", map);
                    if (map != null && (str2 = (String) map.get("extra_survey_shown")) != null && Boolean.parseBoolean(str2)) {
                        C5dz.A03(A0K, c5dz, "notification_survey_dismissed", map);
                    }
                    C5e0 c5e0 = (C5e0) c5dx.A01.get();
                    if (map != null) {
                        1UG A002 = 1UD.A00((04J) c5e0.A06.get(), 1ZG.A01, "messenger_business_notification_tray_action_impression");
                        String A01 = C5e0.A01(map);
                        if (C5e0.A04(c5e0) && C5e0.A05(c5e0, A01) && A002.isSampled()) {
                            FbUserSession A003 = 1Fw.A00();
                            1UG.A02(A002, "business_inbox_notification");
                            0DA r02 = new 0DA();
                            r02.A07("notification_message_id", 4YV.A0v("message_id", map));
                            r02.A07("notification_sender_id", 4YV.A0v("sender_id", map));
                            r02.A07("notification_delivery_id", 4YV.A0v("delivery_id", map));
                            r02.A07("notification_type", A01);
                            C5e0.A03(r02, c5e0, "dismiss");
                            C5e0.A02(r02, A002, A003);
                        }
                    }
                    C5e2 c5e2 = (C5e2) c5dx.A02.get();
                    CommunityMessagingNotificationsLoggerModel A004 = CommunityMessagingNotificationsLoggerModel.A0E.A00(map);
                    if (A004 != null) {
                        C5e2.A00(c5e2, new CommunityMessagingNotificationsLoggerModel(A004.A01, BOA.A02, null, A004.A04, A004.A07, A004.A05, A004.A06, "notification_dismiss", "notification_clear_button", A004.A0B, A004.A08, A004.A0C, A004.A0A, A004.A00));
                    }
                    C5e4 c5e4 = (C5e4) c5dx.A05.get();
                    if (map != null) {
                        String str6 = (String) map.get("thread_key");
                        Long A0e = str6 != null ? 0CW.A0e(str6) : null;
                        String str7 = (String) map.get("client_notif_type");
                        if (A0e != null && str7 != null) {
                            String upperCase = str7.toUpperCase(Locale.ROOT);
                            11T.A0A(upperCase);
                            if (c5e4.A00.contains(C5ap.A00(upperCase))) {
                                C5e4.A00(BOn.A0G, c5e4, str7, ActionId.TIMEOUT, 1, 16, A0e.longValue());
                            }
                        }
                    }
                    C4Do c4Do = r0.A01.A00.A00;
                    AtomicInteger atomicInteger = C1Y6.A04;
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    1YC r03 = c4Do.A05;
                    r03.A08("com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationDismissed", andIncrement2);
                    Exception e = null;
                    try {
                        if (C4Do.A01(c4Do)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.notify.notificationeventlistener.debug.DebugNotificationEventListener";
                            r03.A0A("com.facebook.messaging.notify.plugins.notificationeventlistener.debug.DebugNotificationEventListener", str, "com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", andIncrement, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "com.facebook.messaging.notify.plugins.notificationeventlistener.NotifyNotificationeventlistenerKillSwitch", "onNotificationDismissed");
                            try {
                                try {
                                    0fH.A0j("DebugNotificationEventListener", 0Pz.A0F(i2, "Notification dismissed - tag: ", string2, " id: "));
                                    r03.A04((Exception) null, str, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationDismissed", andIncrement);
                                } catch (Exception e2) {
                                    e = e2;
                                    throw e;
                                }
                            } catch (Throwable th) {
                                r03.A04(e, str, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationDismissed", andIncrement);
                                throw th;
                            }
                        }
                        if (C4Do.A00(c4Do)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.notify.notificationeventlistener.activenotificationstracker.ActiveNotificationsTrackerNotificationEventListener";
                            r03.A0A("com.facebook.messaging.notify.plugins.notificationeventlistener.activenotificationstracker.ActiveNotificationsTrackerNotificationEventListener", str, "com.facebook.messaging.notify.plugins.interfaces.notificationeventlistener.NotificationEventListenerInterfaceSpec", andIncrement, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "com.facebook.messaging.notify.plugins.notificationeventlistener.NotifyNotificationeventlistenerKillSwitch", "onNotificationDismissed");
                            C04204ab c04204ab = (C04204ab) c4Do.A00.A00.A00.get();
                            c04204ab.A02.remove(new C82e(i2, string2));
                            if (C04204ab.A01(c04204ab)) {
                                c04204ab.A03.remove(new C82e(i2, string2));
                            }
                            r03.A04((Exception) null, str, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationDismissed", andIncrement);
                        }
                        r03.A02((Exception) null, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationDismissed", andIncrement2);
                        Intent intent2 = (Intent) extras.getParcelable("redirect_intent");
                        if (intent2 != null) {
                            int i3 = extras.getInt("redirect_type");
                            MessagesSystemTrayLogService.A00(intent2, r0, i3 != 1 ? i3 != 2 ? 0S2.A00 : 0S2.A0C : 0S2.A01, 0);
                        }
                    } catch (Throwable th2) {
                        r03.A02(e, "messaging.notify.notificationeventlistener.NotificationEventListenerInterfaceSpec", "onNotificationDismissed", andIncrement2);
                        throw th2;
                    }
                } else if ("messaging_notification_click_from_tray".equals(string)) {
                    Intent intent3 = (Intent) extras.getParcelable("redirect_intent");
                    r0.A00.A00(intent3, "MessagesSystemTrayLogService", extras);
                    r0.A01.A03(string2, i2);
                    int i4 = extras.getInt("redirect_type");
                    MessagesSystemTrayLogService.A00(intent3, r0, i4 != 1 ? i4 != 2 ? 0S2.A00 : 0S2.A0C : 0S2.A01, 335544320);
                } else if ("messaging_notification_click_from_action_view".equals(string)) {
                    Intent intent4 = (Intent) extras.getParcelable("redirect_intent");
                    if (intent4 != null) {
                        int i5 = extras.getInt("redirect_type");
                        Integer num = i5 != 1 ? i5 != 2 ? 0S2.A00 : 0S2.A0C : 0S2.A01;
                        MessagesSystemTrayLogService.A00(intent4, r0, num, num != 0S2.A01 ? 335544320 : 0);
                    }
                    NotificationManager notificationManager = (NotificationManager) r0.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(string2, i2);
                    }
                }
                i = -185845374;
            }
        } else {
            CarNotificationService carNotificationService = (CarNotificationService) this;
            A04 = 0FI.A04(-1950282224);
            carNotificationService.A00.A02();
            ThreadKey threadKey = (ThreadKey) intent.getParcelableExtra("thread_key");
            String action = intent.getAction();
            if (action.equals("read_thread")) {
                carNotificationService.A02.A07(threadKey);
                carNotificationService.A01.AFx(threadKey, "ReadThreadCarNotification");
            } else if (action.equals("reply")) {
                Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                carNotificationService.A05.execute(new D8j(carNotificationService.A03.A0K(1BL.A0F(), threadKey, (resultsFromIntent != null ? resultsFromIntent.getCharSequence("voice_reply") : null).toString()), carNotificationService));
            }
            i = 1438500761;
        }
        0FI.A0A(i, A04);
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return this.A04.A00(obj);
    }

    public void CcH(1IG r302) {
        11T.A0F(r302, 0);
        ((2CP) 1Br.A0B(this.A01)).A01(r302);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0F(obj, 0);
        11T.A0F(obj2, 1);
        this.A04.A01(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resources getResources() {
        Resources resources;
        Context context = (Context) this.A05.get();
        if (context != null && (resources = context.getResources()) != null) {
            return resources;
        }
        Resources resources2 = super/*android.content.ContextWrapper*/.getResources();
        11T.A0A(resources2);
        return resources2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        int A00 = C08o.A00(this, 2005901722);
        int A04 = 0FI.A04(596406765);
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A00 = qPLInstance;
        if (qPLInstance != null) {
            qPLInstance.markerStart(43712515, 1BJ.A00(358), getClass().getSimpleName());
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            11T.A0D(quickPerformanceLogger);
            quickPerformanceLogger.markerPoint(43712515, "on-create");
        }
        C00j.A07("FbIntentService[%s].onCreate", getClass().getSimpleName(), 240782936);
        try {
            super/*android.app.IntentService*/.onCreate();
            A02();
            C00j.A01(-1619491944);
            0FI.A0A(-1182552075, A04);
            C08o.A02(-1897600546, A00);
        } catch (Throwable th) {
            C00j.A01(162753536);
            0FI.A0A(877227864, A04);
            C08o.A02(1189134329, A00);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A04 = 0FI.A04(-1470632086);
        super/*android.app.IntentService*/.onDestroy();
        ((2CP) this.A01.A00.get()).A00();
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(43712515, (short) 2);
        }
        0FI.A0A(1736288014, A04);
        C01w.A00(this);
    }
}
