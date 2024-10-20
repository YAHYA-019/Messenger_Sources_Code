package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.notifications.constants.push.NotificationType;
import com.facebook.push.constants.PushProperty;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4E0, reason: invalid class name */
/* loaded from: 4E0.class */
public final class C4E0 {
    public static final 1G2 A0G;
    public static final 1G2 A0H;
    public final 1Br A00;
    public final 1Br A04;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0C;
    public final 1PB A0D;
    public final Set A0E;
    public final Set A0F;
    public final 1Br A01 = 1Bq.A00(99390);
    public final 1Br A02 = 1Bq.A00(16511);
    public final 1Br A03 = 1Bq.A00(67118);
    public final 1Br A05 = 1Bq.A00(33013);
    public final 1Br A0B = 1Bu.A00(115658);

    static {
        1G2 A0D = 1G0.A04.A0D("mqtt/");
        11T.A0A(A0D);
        1G2 r0 = A0D;
        A0G = r0;
        1G2 A0D2 = r0.A0D("push_channel");
        11T.A0A(A0D2);
        A0H = A0D2;
    }

    public C4E0() {
        Set A06 = 1Bi.A06(183);
        11T.A0A(A06);
        this.A0F = A06;
        1Br A00 = 1Bq.A00(16626);
        this.A08 = A00;
        this.A04 = 1Bu.A00(33259);
        this.A09 = 1Bq.A00(67117);
        this.A07 = 1Bq.A00(66428);
        this.A00 = 1Bq.A00(16616);
        this.A0A = 1Bq.A00(115124);
        this.A06 = 1Bq.A00(66351);
        this.A0C = 1Bq.A00(66430);
        this.A0D = ((1P8) A00.A00.get()).A00("notification_instance");
        this.A0E = new HashSet();
    }

    public static final void A00(Context context, C82j c82j, PushProperty pushProperty, 4rH r304, C4E0 c4e0, 5Zs r306, PushInfraMetaData pushInfraMetaData, String str, String str2, String str3, AtomicBoolean atomicBoolean) {
        try {
            r306.C9e(context, c82j, pushProperty, pushInfraMetaData);
        } catch (Exception e) {
            if (r306 instanceof Czx) {
                Czx czx = (Czx) r306;
                24X r0 = (24X) c82j.A02;
                11T.A0F(r0, 0);
                if (r0.A0Z("flow_id")) {
                    long A03 = JSONUtil.A03(r0.A0D("flow_id"), 0L);
                    24X A0D = r0.A0D("params");
                    if (A0D == null || JSONUtil.A0H(A0D.A0D("topic"), null) == null) {
                        ((I5r) 1Br.A0B(czx.A01)).A04(0S2.A15, A03);
                    } else {
                        ((I5r) 1Br.A0B(czx.A01)).A05(0S2.A00, e.getMessage(), A03);
                    }
                }
            }
            String canonicalName = r306.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName);
            sb.append(' ');
            sb.append(r304);
            String obj = sb.toString();
            ((C01s) c4e0.A02.A00.get()).softReport("FbPushDataHandler.onNotification exception", obj, e);
            C00i c00i = c4e0.A09.A00;
            C4Dy c4Dy = (C4Dy) c00i.get();
            2Iq r02 = (2Iq) c4Dy.A00.A00.get();
            StringBuilder sb2 = new StringBuilder("handler_exception-");
            4rH r03 = pushProperty.A04;
            sb2.append(r03);
            sb2.append("-");
            sb2.append(pushProperty.A0B);
            r02.A00(sb2.toString());
            String obj2 = r03.toString();
            2DM A0K = ((AnonymousClass244) c4Dy.A02.A00.get()).A0K();
            A0K.A0o("handler", canonicalName);
            A0K.A0o("exception", e.toString());
            A0K.A0o("stacktrace", 0G8.A01(e));
            String obj3 = A0K.toString();
            11T.A0A(obj3);
            1UG A00 = 1UD.A00(C4Dy.A00(c4Dy), 1ZG.A01, "notif_abnormal");
            if (A00.isSampled()) {
                A00.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "d1_handler_exception");
                A00.A7R("debug_info", obj3);
                A00.A7R(Property.SYMBOL_Z_ORDER_SOURCE, obj2);
                A00.BZL();
            }
            if (NotificationType.A5C.A00(str)) {
                ((C4Dy) c00i.get()).A01(pushProperty, "handler_exception");
            }
            1PB r04 = c4e0.A0D;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Handler_Exception: notifId = ");
            sb3.append(str2);
            sb3.append("; msgId = ");
            sb3.append(str3);
            sb3.append("; handler = ");
            sb3.append(canonicalName);
            sb3.append("; exception = ");
            sb3.append(e);
            r04.BZQ(sb3.toString());
            5Zm A02 = ((C4Nz) c4e0.A04.A00.get()).A02(pushProperty.A00);
            A02.A03("handler_exception_base_info", 0Pz.A0W("FbPushDataHandler.onNotification exception", obj));
            A02.A03("handler_exception_message", e.getMessage());
            if (r306 instanceof 5Zy) {
                A02.A04("exception_during_render_handler.onNotification", (short) 3);
            }
            atomicBoolean.set(false);
            1hK.A00().A00(e.toString());
        }
    }

    public static final void A01(Context context, C82j c82j, PushProperty pushProperty, 4rH r304, C4E0 c4e0, PushInfraMetaData pushInfraMetaData, String str, String str2, String str3, Set set, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        for (5Zs r0 : 0QD.A0S(set)) {
            if (r0 instanceof 5Zy) {
                atomicBoolean2.set(true);
            }
            if (r0.CZV() || (str != null && r0.BMo(c82j, str))) {
                A00(context, c82j, pushProperty, r304, c4e0, r0, pushInfraMetaData, str, str2, str3, atomicBoolean);
            }
        }
    }
}
