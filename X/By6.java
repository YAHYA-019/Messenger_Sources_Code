package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.threadsettings2.params.ThreadSettingsParams;

/* loaded from: By6.class */
public final class By6 {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1pI A03;
    public final DHb A04;
    public final DHc A05;
    public final DHd A06;
    public final ThreadSettingsParams A07;
    public final DGB A08;

    public By6(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DHb dHb, DHc dHc, DHd dHd, ThreadSettingsParams threadSettingsParams, DGB dgb) {
        7zR.A1N(threadSettingsParams, fbUserSession);
        7zS.A18(6, dHc, dHd, dgb);
        this.A07 = threadSettingsParams;
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A01 = r303;
        this.A03 = r305;
        this.A05 = dHc;
        this.A04 = dHb;
        this.A06 = dHd;
        this.A08 = dgb;
    }
}
