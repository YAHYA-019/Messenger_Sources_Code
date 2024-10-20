package X;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;

/* renamed from: X.3Qn, reason: invalid class name */
/* loaded from: 3Qn.class */
public final class C3Qn {
    public ActivityOptions A00;
    public final Intent A01 = new Intent("android.intent.action.VIEW");

    private void A00() {
        ActivityOptions activityOptions = this.A00;
        if (activityOptions == null) {
            activityOptions = ActivityOptions.makeBasic();
            this.A00 = activityOptions;
        }
        3Fv.A00(activityOptions);
    }

    public 3K9 A01() {
        Intent intent = this.A01;
        Bundle bundle = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle A05 = 1BK.A05();
            A05.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(A05);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(1BK.A05());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : 1BK.A05();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            A00();
        }
        ActivityOptions activityOptions = this.A00;
        if (activityOptions != null) {
            bundle = activityOptions.toBundle();
        }
        return new 3K9(intent, bundle);
    }
}
