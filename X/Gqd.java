package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqd.class */
public final class Gqd extends GS2 {
    public final Context A00;
    public final FbUserSession A01;
    public final C00i A02;
    public final JIh A03;

    public Gqd(Context context) {
        super("ParticipantOverflowPresenter");
        this.A03 = new IZB(this, 3);
        this.A02 = AbH.A0Q();
        this.A00 = context;
        this.A01 = IDw.A00(context, "ParticipantOverflowPresenter");
    }
}
