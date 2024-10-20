package X;

import com.facebook.platform.opengraph.model.OpenGraphActionRobotextComposer;
import com.facebook.platform.opengraph.server.GetRobotextPreviewMethod$Params;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgn.class */
public final class Cgn implements 1Ro {
    public static final String __redex_internal_original_name = "GetRobotextPreviewMethod";
    public final 1Br A00 = 1Bu.A00(68337);
    public final 1Br A01 = 1Bq.A00(68335);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        GetRobotextPreviewMethod$Params getRobotextPreviewMethod$Params = (GetRobotextPreviewMethod$Params) obj;
        ArrayList A0z = 7zO.A0z(getRobotextPreviewMethod$Params, 0);
        AnonymousClass259 anonymousClass259 = (AnonymousClass259) 1Br.A0B(this.A00);
        String str = getRobotextPreviewMethod$Params.A04;
        if (str == null) {
            throw 1BK.A0h();
        }
        24X A1N = anonymousClass259.A05(str).A1N();
        11T.A0A(A1N);
        Iterator A0N = A1N.A0N();
        11T.A0A(A0N);
        while (A0N.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(A0N);
            String A0j = AnonymousClass001.A0j(A0z2);
            24X r0 = (24X) A0z2.getValue();
            if (!"image".equals(A0j)) {
                A0z.add(new BasicNameValuePair(A0j, r0.A0Y() ? r0.A0H() : r0.toString()));
            }
        }
        A0z.add(new BasicNameValuePair("preview", ConstantsKt.CAMERA_ID_BACK));
        A0z.add(new BasicNameValuePair("proxied_app_id", getRobotextPreviewMethod$Params.A01));
        A0z.add(new BasicNameValuePair("android_key_hash", getRobotextPreviewMethod$Params.A02));
        String str2 = getRobotextPreviewMethod$Params.A03;
        if (str2 != null) {
            A0z.add(new BasicNameValuePair("fb:channel", str2));
        }
        return new C04103zy(0S2.A01, "get_robotext_preview_method", "POST", 0Pz.A0W("me/", getRobotextPreviewMethod$Params.A00), A0z);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        11T.A0F(anonymousClass439, 1);
        24X A0w = AbH.A0w(anonymousClass439);
        11T.A0A(A0w);
        if (A0w.A0Z("data")) {
            24X A0D = A0w.A0D("data");
            if (A0D == null) {
                throw 1BK.A0h();
            }
            A0w = A0D.A0B(0);
            11T.A0A(A0w);
        }
        3AW r0 = new 3AW((AnonymousClass245) null, A0w);
        r0.A00 = (AnonymousClass245) 1Br.A0B(this.A01);
        return r0.A1W(OpenGraphActionRobotextComposer.class);
    }
}
