package X;

import android.app.Activity;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.chatheads.service.ChatHeadService;

/* loaded from: F7R.class */
public final class F7R {
    public final Et9 A00 = (Et9) 1Bi.A03(99950);
    public static final String A02 = C1xj.A06;
    public static final String A01 = 0Pz.A0W("com.facebook.orca", ".returntochatheadshelper.EXTRA_RETURN_TO_CHAT_HEADS_ACTION");

    public final void A00(Activity activity, FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        String str = ((1G1) fbUserSession).A02;
        Intent intent = activity.getIntent();
        String str2 = A01;
        if (intent.hasExtra(str2)) {
            Intent A0D = C3o5.A0D(this.A00.A00, ChatHeadService.class);
            A0D.setAction(intent.getStringExtra(str2));
            String str3 = C1xj.A0W;
            A0D.putExtra(str3, intent.getStringExtra(str3));
            String str4 = C1xj.A0T;
            A0D.putExtra(str4, intent.getStringExtra(str4));
            A0D.putExtra(C1xj.A0Q, str);
            0LS.A00(activity.getApplicationContext(), A0D);
        }
    }
}
