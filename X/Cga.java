package X;

import com.facebook.platformlogger.model.LogAppInstallParams;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cga.class */
public final class Cga implements 1Ro {
    public static final String __redex_internal_original_name = "LogAppInstallMethod";
    public C0qy A00 = AbI.A0D();

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        LogAppInstallParams logAppInstallParams = (LogAppInstallParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("event", "MOBILE_APP_INSTALL"));
        A0s.add(new BasicNameValuePair("advertiser_id", logAppInstallParams.A00));
        A0s.add(new BasicNameValuePair("attribution", logAppInstallParams.A01));
        boolean z = logAppInstallParams.A02;
        String str = ConstantsKt.CAMERA_ID_BACK;
        String str2 = ConstantsKt.CAMERA_ID_FRONT;
        if (z) {
            str2 = str;
        }
        A0s.add(new BasicNameValuePair("advertising_tracking_enabled", str2));
        if (!logAppInstallParams.A03) {
            str = ConstantsKt.CAMERA_ID_FRONT;
        }
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("application_tracking_enabled", str), A0s);
        AbF.A1Q(A0C, "logAppInstalls");
        return AbK.A0M(A0C, 0Pz.A0W("256002347743983", "/activities"), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
