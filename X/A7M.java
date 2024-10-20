package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.cuckoo.thirdpartychats.mvvm.model.ThirdPartyAppsSettingsRepository;

/* loaded from: A7M.class */
public final class A7M implements 1Vf {
    public final ThirdPartyAppsSettingsRepository A00;
    public final Context A01;
    public final FbUserSession A02;

    public A7M(Context context, FbUserSession fbUserSession) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A00 = (ThirdPartyAppsSettingsRepository) 1Lo.A04(context, fbUserSession, (1BY) null, 68785);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
            ThirdPartyAppsSettingsRepository thirdPartyAppsSettingsRepository = this.A00;
            ((C21N) 1Br.A0B(thirdPartyAppsSettingsRepository.A07)).A00(thirdPartyAppsSettingsRepository.A08);
            AJd.A03(this, 7zN.A0y(), 7);
        } else {
            if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnDestroy")) {
                throw 4YV.A0f(str);
            }
            ThirdPartyAppsSettingsRepository thirdPartyAppsSettingsRepository2 = this.A00;
            ((C21N) 1Br.A0B(thirdPartyAppsSettingsRepository2.A07)).A01(thirdPartyAppsSettingsRepository2.A08);
        }
    }
}
