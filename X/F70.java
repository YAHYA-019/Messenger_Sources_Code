package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.fxcal.settings.details.FxCalDetailsSettingsActivity;

/* loaded from: F70.class */
public final class F70 {
    public static final Intent A00(Context context, Bundle bundle, String str, String str2, String str3) {
        if ("FB_PAY".equals(GraphQLStringDefUtil.A00().ATw("GraphQLFXSettingsServiceIdentifier", str))) {
            if (str3.length() == 0) {
                str3 = AbstractC11504wo.A01();
            } else if (!11T.A0P("upl", 1, str3)) {
                str3 = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", String.valueOf(System.currentTimeMillis()), str3);
                11T.A0D(str3);
            }
        }
        Intent putExtra = C3o5.A0D(context, FxCalDetailsSettingsActivity.class).putExtra("details", str).putExtra("session_id", str3).putExtra("product_type", str2).putExtra("surface", "main_settings").putExtra("extra_data", bundle);
        11T.A0A(putExtra);
        return putExtra;
    }

    public final Intent A01(Context context, String str, String str2) {
        String ATw = GraphQLStringDefUtil.A00().ATw("GraphQLFXSettingsServiceIdentifier", str);
        11T.A0A(ATw);
        if (ATw.equals("FB_PAY")) {
            return A00(context, null, str, "CAL_SETTING", AbstractC11504wo.A01());
        }
        Intent putExtra = C3o5.A0D(context, FxCalDetailsSettingsActivity.class).putExtra("details", str).putExtra("surface", str2);
        11T.A0A(putExtra);
        return putExtra;
    }
}
