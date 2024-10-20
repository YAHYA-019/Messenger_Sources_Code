package X;

import com.facebook.messaging.media.photoquality.PhotoQualityQueryResult;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg2.class */
public final class Cg2 implements 1Ro {
    public static final String __redex_internal_original_name = "PhotoQualityMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        long A05 = AnonymousClass001.A05(obj);
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("fbid", String.valueOf(A05)), A0s);
        AbF.A1Q(A0C, "getPhotoQuality");
        A0C.A0F = "me/message_media_quality";
        A0C.A0J = A0s;
        A0C.A06 = 0S2.A0C;
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        ((Number) obj).longValue();
        11T.A0F(anonymousClass439, 1);
        anonymousClass439.A03();
        Object A1W = anonymousClass439.A00().A1W(PhotoQualityQueryResult.class);
        11T.A0A(A1W);
        return A1W;
    }
}
