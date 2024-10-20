package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: A4z.class */
public final class A4z implements 74V {
    public final /* synthetic */ 8vK A00;

    public A4z(8vK r302) {
        this.A00 = r302;
    }

    public void A7C(Capabilities capabilities, Long l, Long l2, String str, String str2) {
        1BK.A1M(str, str2);
        8vK r0 = this.A00;
        r0.A0D.A00(1Br.A03(r0.A09), str, str2);
        9nJ A0j = 7zQ.A0j(r0.A05);
        SharedAlbumArgs sharedAlbumArgs = r0.A0A;
        ThreadKey threadKey = sharedAlbumArgs.A01;
        long j = sharedAlbumArgs.A00;
        long parseLong = Long.parseLong(str);
        long A00 = 8vK.A00(r0, str);
        11T.A0F(threadKey, 0);
        9nJ.A03(C98N.REACTIONS_BAR, 98L.A02, threadKey, A0j, "click", "reaction_emoji", 7zU.A0r(parseLong), 7zU.A0r(A00), j);
    }

    public void Cf4(Capabilities capabilities, Long l, String str, String str2) {
        11T.A0H(str, str2);
        8vK r0 = this.A00;
        FbUserSession A03 = 1Br.A03(r0.A09);
        9Zm r02 = r0.A0D;
        11T.A0F(A03, 0);
        r02.A00(A03, str, (String) null);
    }
}
