package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.friends.methods.BlockUserMethod$Params;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;

/* loaded from: Cfz.class */
public final class Cfz implements 1Ro {
    public static final String __redex_internal_original_name = "BlockUserMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String valueOf;
        BlockUserMethod$Params blockUserMethod$Params = (BlockUserMethod$Params) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        if (blockUserMethod$Params.A04) {
            List list = blockUserMethod$Params.A03;
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            valueOf = jSONArray.toString();
        } else {
            valueOf = String.valueOf(blockUserMethod$Params.A00);
        }
        A0s.add(new BasicNameValuePair(ErrorReportingConstants.USER_ID_KEY, valueOf));
        A0s.add(new BasicNameValuePair(Property.SYMBOL_Z_ORDER_SOURCE, blockUserMethod$Params.A02.name()));
        return new C04103zy(0S2.A01, "blockUser", "POST", StringFormatUtil.formatStrLocaleSafe("%d/blocked", Long.valueOf(blockUserMethod$Params.A01)), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
