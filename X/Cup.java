package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Cup.class */
public final class Cup implements DHf {
    public final FbUserSession A00;
    public final By6 A01;
    public final C2944Je9 A02;

    public Cup(Context context, FbUserSession fbUserSession, By6 by6) {
        this.A00 = fbUserSession;
        this.A01 = by6;
        this.A02 = new C2944Je9(context);
    }

    @Override // X.DHf
    public View BJw() {
        return this.A02;
    }

    @Override // X.DHf
    public void CfR(CLu cLu) {
        11T.A0F(cLu, 0);
        0fH.A0j("ThreadSettingsComposeRenderer", "render");
        this.A02.A07(new AHs(947666632, true, new 83Q(cLu, this, 47)));
    }
}
