package com.facebook.secure.intentswitchoff;

import X.04J;
import X.0D7;
import X.0JI;
import X.0Jg;
import X.0Ji;
import X.0fH;
import X.1Bi;
import X.1UD;
import X.1ZG;
import X.2R2;
import X.AnonymousClass001;
import X.AnonymousClass030;
import X.C00i;
import X.C01s;
import X.C02w;
import android.app.Activity;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ActivityIntentSwitchOffDI.class */
public final class ActivityIntentSwitchOffDI extends C02w {
    public final C00i A00;
    public final C00i A01;

    public ActivityIntentSwitchOffDI() {
        super((AnonymousClass030) 1Bi.A03(1));
        this.A00 = 1Bi.A00(16634);
        this.A01 = 1Bi.A00(16511);
    }

    public static 2R2 A00(04J r301) {
        return new 2R2(1UD.A00((1UD) r301, 1ZG.A01, "android_security_fb4a_killed_intent_logging"), 7);
    }

    private void A01(Activity activity, Intent intent) {
        JSONObject jSONObject;
        2R2 A00 = A00((04J) this.A00.get());
        if (((0D7) A00).A00.isSampled()) {
            try {
                0Ji A002 = 0Jg.A00(intent, (0JI) null, (0JI) null);
                if (A002 == null || (jSONObject = A002.A01) == null) {
                    return;
                }
                A00.A0E("activity", String.format("%s/%s", activity.getPackageName(), AnonymousClass001.A0Y(activity)));
                A00.A0E("intent", jSONObject.toString());
                A00.BZL();
            } catch (JSONException e) {
                ((C01s) this.A01.get()).softReport("com.facebook.secure.intentswitchoff.ActivityIntentSwitchOffDI", "Error parsing killed intent.", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.0Jj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(android.app.Activity r301, android.content.Intent r302, com.facebook.secure.intentswitchoff.ActivityIntentSwitchOffDI r303) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.secure.intentswitchoff.ActivityIntentSwitchOffDI.A02(android.app.Activity, android.content.Intent, com.facebook.secure.intentswitchoff.ActivityIntentSwitchOffDI):void");
    }

    @Override // X.C02w
    /* renamed from: A06, reason: merged with bridge method [inline-methods] */
    public void A05(Activity activity, Intent intent) {
        A01(activity, intent);
        0fH.A0g(AnonymousClass001.A0Y(activity), "com.facebook.secure.intentswitchoff.ActivityIntentSwitchOffDI", "Cancelling activity intent because of server-configured switch-off: %s");
        activity.finish();
    }
}
