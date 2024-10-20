package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* loaded from: D3d.class */
public final class D3d implements 2eF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public D3d(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public ListenableFuture A8b(Object obj) {
        switch (this.A00) {
            case 0:
                return 1Kd.A0A(obj == null ? ImmutableList.of() : ((DGy) this.A02).BId(obj));
            case 1:
                IXv iXv = (JNm) obj;
                if (iXv == null) {
                    return new 7hZ(AnonymousClass001.A0N("Cannot remove participant on an ended ConferenceCall"));
                }
                iXv.A00.Cex(7zO.A10((Collection) this.A01, 0));
                ListenableFuture listenableFuture = 1hM.A01;
                11T.A0A(listenableFuture);
                return listenableFuture;
            case 2:
                if (!7zR.A1X(obj)) {
                    ((DIo) this.A01).BMC("messenger_lobby");
                    return C3o5.A0K(false);
                }
                LobbyRootView lobbyRootView = (LobbyRootView) this.A02;
                ?? A0j = 4YU.A0j();
                ((F94) 1Br.A0B(lobbyRootView.A0V)).A01(4YU.A08(lobbyRootView.A01), new Ch0(A0j), "free_messenger_rooms_interstitial");
                return A0j;
            default:
                B9n b9n = (B9n) this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                Uri uri = null;
                try {
                    uri = C0A2.A03((String) obj);
                } catch (SecurityException unused) {
                }
                C1pq.A08("url", uri);
                return ((6H7) b9n.A01.get()).A01(fbUserSession, new C7Zl(false, uri));
        }
    }
}
