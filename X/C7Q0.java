package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.plugins.mute.activitybanner.ThreadMutedActivityBanner;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.7Q0, reason: invalid class name */
/* loaded from: 7Q0.class */
public final class C7Q0 implements 1HN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ ThreadMutedActivityBanner A03;
    public final /* synthetic */ 7OX A04;
    public final /* synthetic */ 5Sc A05;

    public C7Q0(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadMutedActivityBanner threadMutedActivityBanner, 7OX r306, 5Sc r307) {
        this.A02 = threadKey;
        this.A03 = threadMutedActivityBanner;
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A05 = r307;
        this.A04 = r306;
    }

    public final void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        11T.A0F(r303, 1);
        1G2 r0 = 1NK.A05;
        ThreadKey A00 = AbstractC03303xn.A00(r303);
        ThreadKey threadKey = this.A02;
        if (11T.A0O(threadKey, A00)) {
            this.A03.A00(this.A00, this.A01, threadKey, this.A04, this.A05);
        }
    }
}
