package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.messaging.service.model.BlockUserParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg5.class */
public final class Cg5 implements 1Ro {
    public static final String __redex_internal_original_name = "BlockUserMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        BlockUserParams blockUserParams = (BlockUserParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair(ErrorReportingConstants.USER_ID_KEY, String.valueOf(blockUserParams.A00)));
        return new C04103zy(RequestPriority.INTERACTIVE, 0S2.A01, "blockUser", "POST", StringFormatUtil.formatStrLocaleSafe("%d/blocked", Long.valueOf(blockUserParams.A01)), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
