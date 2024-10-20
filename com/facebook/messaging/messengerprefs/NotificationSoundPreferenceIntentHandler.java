package com.facebook.messaging.messengerprefs;

import X.1BK;
import X.1BV;
import X.1G2;
import X.51K;
import X.C00i;
import X.C3o5;
import X.HFl;
import X.HkQ;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContextable;
import java.util.List;

/* loaded from: NotificationSoundPreferenceIntentHandler.class */
public final class NotificationSoundPreferenceIntentHandler implements CallerContextable {
    public final C00i A00 = 1BV.A00(115602);

    /* JADX WARN: Type inference failed for: r0v25, types: [X.HFl, java.lang.Object] */
    public Intent A00(Context context, Intent intent) {
        if (intent.getData() != null) {
            List<String> pathSegments = intent.getData().getPathSegments();
            if (!pathSegments.isEmpty() && ((String) 1BK.A0r(pathSegments)).equals("ringtone")) {
                Resources resources = context.getResources();
                HkQ hkQ = (HkQ) this.A00.get();
                ?? obj = new Object();
                ((HFl) obj).A00 = resources;
                ((HFl) obj).A01 = hkQ;
                1G2 r0 = 51K.A0F;
                String A00 = obj.A00();
                Intent A0D = C3o5.A0D(context, RingtonePreferenceActivity.class);
                A0D.putExtra("thread_key", (Parcelable) null);
                A0D.putExtra("ringtone_preference_type_extra", 1);
                A0D.putExtra("ringtone_prefkey_extra", r0.toString());
                A0D.putExtra("ringtone_setting_title_extra", (String) null);
                A0D.putExtra("messenger_tone_uri", A00);
                return A0D;
            }
        }
        return C3o5.A0D(context, OrcaNotificationPreferenceActivity.class);
    }
}
