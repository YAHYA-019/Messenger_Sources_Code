package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.09s, reason: invalid class name */
/* loaded from: 09s.class */
public abstract class C09s {
    public static View A00(Activity activity, int i) {
        C0k4.A00(activity);
        View findViewById = activity.findViewById(i);
        Resources resources = activity.getResources();
        C0k4.A00(resources);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass001.A0N(StringFormatUtil.formatStrLocaleSafe("Required view with ID %s not found. Either your layout is missing the ID you requested, or you want to use getOptionalView. Only use getOptionalView if you're sure that you need logic that depends on whether a particular child view exists.", resources.getResourceEntryName(i)));
    }

    public static View A01(View view, int i) {
        C0k4.A00(view);
        View findViewById = view.findViewById(i);
        Resources resources = view.getResources();
        C0k4.A00(resources);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass001.A0N(StringFormatUtil.formatStrLocaleSafe("Required view with ID %s not found. Either your layout is missing the ID you requested, or you want to use getOptionalView. Only use getOptionalView if you're sure that you need logic that depends on whether a particular child view exists.", resources.getResourceEntryName(i)));
    }
}
