package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A7c.class */
public final class A7c implements 1Vf {
    public final 1Br A01;
    public final ThreadKey A04;
    public final Context A05;
    public final FbUserSession A06;
    public final 1Br A02 = 1Bq.A00(66774);
    public final 1Br A00 = 1Bq.A00(66481);
    public final C22K A03 = new C22K();

    public A7c(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A05 = context;
        this.A06 = fbUserSession;
        this.A04 = threadKey;
        this.A01 = 1Lm.A00(context, fbUserSession, 33183);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        int i;
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            throw 4YV.A0f(str);
        }
        C00j.A05("SelectiveSyncCommunityChannelListHandler.onCommunityChannelListVisible", 1403843581);
        try {
            long A0r = this.A04.A0r();
            if (this.A03.A01(1WY.A01((1WY) 1Br.A0B(this.A00)).Auy(36596815046053067L))) {
                ((22I) 1Br.A0B(this.A01)).A0G(new A09(this, A0r, 0), ((AnonymousClass224) 1Br.A0B(this.A02)).A00(1BJ.A00(632)), A0r);
                i = -525102876;
            } else {
                0fH.A0j("SelectiveSyncCommunityChannelListHandler", AnonymousClass001.A0h(AnonymousClass001.A0n("Skipping sync for community channel list for "), A0r));
                i = -869458450;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-146193202);
            throw th;
        }
    }
}
