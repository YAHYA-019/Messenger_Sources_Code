package X;

import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;

/* renamed from: X.63o, reason: invalid class name */
/* loaded from: 63o.class */
public final class C63o {
    public final C00i A00 = new 1BQ(16772);

    public static void A00(C63o c63o, Message message, Integer num, String str) {
        C1kw A06 = 1BK.A06(c63o.A00);
        if (7bH.A00 == null) {
            synchronized (7bH.class) {
                if (7bH.A00 == null) {
                    7bH.A00 = new C2J3(A06);
                }
            }
        }
        AbstractC01593ro A3u = 7bH.A00.A00.A3u(str, false);
        if (A3u.A0B()) {
            A3u.A06("message_id", message.A1V);
            A3u.A06("attribution_type", C7kg.A00(num));
            ContentAppAttribution contentAppAttribution = message.A09;
            A3u.A06("app_id", contentAppAttribution == null ? null : contentAppAttribution.A04);
            A3u.A06("pigeon_reserved_keyword_module", "attribution_module");
            A3u.A0A();
        }
    }
}
