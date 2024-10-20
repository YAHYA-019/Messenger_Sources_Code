package X;

import com.facebook.messaging.service.model.IgnoreMessageRequestsParams;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg8.class */
public final class Cg8 implements 1Ro {
    public static final String __redex_internal_original_name = "IgnoreMessageRequestsMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        IgnoreMessageRequestsParams ignoreMessageRequestsParams = (IgnoreMessageRequestsParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("thread_ids", ImmutableList.copyOf((Iterable) 2Ri.A02(D3J.A01(ignoreMessageRequestsParams, 55), ignoreMessageRequestsParams.A00)).toString()));
        String str = ignoreMessageRequestsParams.A01;
        if (str != null) {
            A0s.add(new BasicNameValuePair(TraceFieldType.RequestID, str));
        }
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "ignoreMessageRequests");
        return AbN.A0E(c04083zw, "/me/message_ignore_requests", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
