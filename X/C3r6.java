package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.3r6, reason: invalid class name */
/* loaded from: 3r6.class */
public final class C3r6 {
    public final 1Br A02 = 1Bq.A00(65901);
    public final 1Br A00 = 1Bq.A00(65900);
    public final 1Br A01 = 1Bq.A00(84488);

    public final void A00(final Context context, final Intent intent, final FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        C00j.A05("FbPushDataIntentHelper.sendIntent", 524546846);
        try {
            ((5Zk) this.A02.A00.get()).A00(new Runnable() { // from class: X.5r9
                public static final String __redex_internal_original_name = "FbPushDataIntentHelper$sendIntent$1";

                @Override // java.lang.Runnable
                public final void run() {
                    C4Dx c4Dx = (C4Dx) this.A00.A00.get();
                    FbUserSession fbUserSession2 = fbUserSession;
                    c4Dx.A03(context, intent, fbUserSession2);
                }
            });
            C00j.A01(1260515961);
        } catch (Throwable th) {
            C00j.A01(-609303174);
            throw th;
        }
    }

    public final void A01(Context context, FbUserSession fbUserSession, 4rH r304, PushInfraMetaData pushInfraMetaData, Integer num, String str, String str2, String str3, String str4) {
        11T.A0F(fbUserSession, 0);
        11T.A0F(context, 1);
        11T.A0F(pushInfraMetaData, 2);
        0fH.A0i(r304, "FbPushDataIntentHelper", "Sending push intent from %s");
        C0dr c0dr = (C0dr) this.A01.A00.get();
        11T.A0F(c0dr, 6);
        Intent intent = new Intent();
        intent.putExtra("push_content", str);
        intent.putExtra("push_source", r304.name());
        intent.putExtra("extra_notification_sender", str2);
        intent.putExtra("extra_notification_id", str3);
        intent.putExtra("push_arrived_timestamp", c0dr.now());
        intent.putExtra("push_infra_meta_data", pushInfraMetaData);
        intent.putExtra("job_id", str4);
        intent.putExtra("notif_instance_key", num);
        A00(context, intent, fbUserSession);
    }
}
