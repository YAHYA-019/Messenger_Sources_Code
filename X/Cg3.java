package X;

import com.facebook.messaging.service.model.AcceptMessageRequestParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg3.class */
public final class Cg3 implements 1Ro {
    public static final String __redex_internal_original_name = "AcceptMessageRequestsMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("thread_ids", ImmutableList.of((Object) 4YU.A0l(((AcceptMessageRequestParams) obj).A00)).toString()), A0s);
        AbF.A1Q(A0C, "acceptMessageRequests");
        return AbN.A0E(A0C, "/me/message_accept_requests", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
