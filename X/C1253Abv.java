package X;

import com.facebook.notifications.constants.push.NotificationType;
import com.facebook.push.constants.PushProperty;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;

/* renamed from: X.Abv, reason: case insensitive filesystem */
/* loaded from: Abv.class */
public final class C1253Abv {
    public static final C84j A07 = new C84j("notification_received", ConstantsKt.CAMERA_ID_FRONT, 2);
    public static final C84j A06 = new C84j("notification_handler_received", ConstantsKt.CAMERA_ID_BACK, 2);
    public static final C84j A08 = new C84j("notification_rendering", "15", 2);
    public final 1Br A03 = 1BK.A0C();
    public final 1Br A05 = 7zM.A0T();
    public final 1Br A04 = 1Bq.A00(84027);
    public final 1Br A02 = 1Bu.A00(66592);
    public final 1Br A01 = 1Bq.A00(83826);
    public final 1Br A00 = 7zM.A0d();

    public static final UserFlowLogger A00(C1253Abv c1253Abv) {
        return 4YV.A0Z(c1253Abv.A05);
    }

    public static final void A01(C1253Abv c1253Abv, PushProperty pushProperty, String str) {
        String str2 = str == null ? "rendered" : "suppressed";
        if (pushProperty == null) {
            0fH.A0o("OpenMessagesPerformanceLogger", 0Pz.A0W("Null messagingNotification or pushProperty when open message is ", str2));
            return;
        }
        if (pushProperty.A09 == null || NotificationType.A4y.A00(pushProperty.A0B)) {
            return;
        }
        0fH.A0j("OpenMessagesPerformanceLogger", 0Pz.A0v("open message is ", str2, ", reason: ", str));
        int i = pushProperty.A00;
        1Br r0 = c1253Abv.A05;
        long generateFlowId = 4YV.A0Z(r0).generateFlowId(550451290, i);
        if (4YV.A0Z(r0).isOngoingFlow(generateFlowId)) {
            UserFlowLogger A0Z = 4YV.A0Z(r0);
            C84j c84j = A08;
            A0Z.flowMarkPoint(generateFlowId, c84j.A01);
            4YV.A0Z(r0).flowAnnotate(generateFlowId, "is_rendered", AnonymousClass001.A1U(str));
            if (str != null) {
                4YV.A0Z(r0).flowAnnotateWithCrucialData(generateFlowId, "suppress_reason", str);
            }
            4YV.A0Z(r0).flowAnnotateWithCrucialData(generateFlowId, "c", c84j.A00);
            4YV.A0Z(r0).flowEndSuccess(generateFlowId);
        }
    }

    public void A02(PushInfraMetaData pushInfraMetaData, int i) {
        Long l;
        if (1Br.A07(this.A03).AZk(36324144740257247L)) {
            Long l2 = pushInfraMetaData.A01;
            if ((l2 == null || l2.longValue() != 1) && (l = pushInfraMetaData.A00) != null) {
                1Br r0 = this.A05;
                long generateFlowId = 4YV.A0Z(r0).generateFlowId(550451290, i);
                String A00 = 4YT.A00(1329);
                UserFlowLogger A0Z = 4YV.A0Z(r0);
                UserFlowConfig userFlowConfig = new UserFlowConfig(A00, false);
                userFlowConfig.mTtlMs = LocationComponentOptions.STALE_STATE_DELAY_MS;
                A0Z.flowStartIfNotOngoing(generateFlowId, userFlowConfig);
                UserFlowLogger A0Z2 = 4YV.A0Z(r0);
                C84j c84j = A07;
                A0Z2.flowMarkPoint(generateFlowId, c84j.A01);
                4YV.A0Z(r0).flowAnnotateWithCrucialData(generateFlowId, "mtrid", String.valueOf(l));
                4YV.A0Z(r0).flowAnnotateWithCrucialData(generateFlowId, "qpl_start_time_ms", String.valueOf(1Br.A00(this.A00)));
                4YV.A0Z(r0).flowAnnotateWithCrucialData(generateFlowId, "c", c84j.A00);
                UserFlowLogger A0Z3 = 4YV.A0Z(r0);
                C00i c00i = this.A04.A00;
                A0Z3.flowAnnotate(generateFlowId, AnonymousClass000.A00(35), ((5aF) c00i.get()).A01());
                4YV.A0Z(r0).flowAnnotate(generateFlowId, 1BJ.A00(1448), ((5aF) c00i.get()).A02());
            }
        }
    }
}
