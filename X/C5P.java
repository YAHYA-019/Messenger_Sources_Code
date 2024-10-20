package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.service.model.DeleteThreadsParams;
import com.google.common.collect.ImmutableList;

/* loaded from: C5P.class */
public final class C5P {
    public 1BY A00;
    public final C00i A04 = 1BV.A01((1BY) null, 33031);
    public final C00i A05 = AbH.A0F();
    public final C00i A01 = 1BV.A01((1BY) null, 84999);
    public final C00i A03 = 1BV.A01((1BY) null, 84425);
    public final C00i A02 = AbH.A0H();

    public C5P(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public 1Ho A00(FbUserSession fbUserSession, 4rX r303, ImmutableList immutableList, boolean z) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("deleteThreadsParams", new DeleteThreadsParams(immutableList, z));
        1Ho newInstance_DEPRECATED = 4YU.A0L(this.A04).newInstance_DEPRECATED("delete_threads", A05);
        1IB A00 = 1Ho.A00(newInstance_DEPRECATED, true);
        1Kd.A0D(this.A05, new ApP(fbUserSession, this, (CaO) 1Lo.A04((Context) null, fbUserSession, this.A00, 84535), immutableList), A00);
        C00i c00i = this.A02;
        1BK.A1E(c00i).execute(new D7u(this, immutableList));
        1BK.A1E(c00i).execute(new D7v(this, immutableList));
        if (r303 != null) {
            1Kd.A0E(r303, A00);
        }
        return newInstance_DEPRECATED;
    }
}
