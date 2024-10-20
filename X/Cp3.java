package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: Cp3.class */
public final class Cp3 implements JKE {
    public final /* synthetic */ DIU A00;
    public final /* synthetic */ DHL A01;
    public final /* synthetic */ LobbyRootView A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ String A04;

    public Cp3(DIU diu, DHL dhl, LobbyRootView lobbyRootView, Boolean bool, String str) {
        this.A02 = lobbyRootView;
        this.A01 = dhl;
        this.A00 = diu;
        this.A03 = bool;
        this.A04 = str;
    }

    public void BkO() {
        LobbyRootView lobbyRootView = this.A02;
        I7P i7p = (I7P) 1Br.A0B(lobbyRootView.A08);
        FbUserSession fbUserSession = lobbyRootView.A06;
        C00i c00i = lobbyRootView.A09.A00;
        boolean z = !((IEo) c00i.get()).A0F();
        11T.A0F(fbUserSession, 0);
        I7P.A00(fbUserSession, i7p, GOm.A00(z ? 242 : 239), "rooms_lobby");
        Context context = lobbyRootView.A04;
        IDX idx = (IDX) 1Lm.A05(context, fbUserSession, 114847);
        HbO hbO = new HbO("rooms_lobby", false);
        if (((IEo) c00i.get()).A0F()) {
            ((IEo) c00i.get()).A0A(hbO, (Boolean) null, true);
        } else {
            idx.A05(context, hbO, (Boolean) null, false, true, true, false);
        }
    }

    public ListenableFuture CPd() {
        LobbyRootView lobbyRootView = this.A02;
        IFc.A06(AbM.A0b(lobbyRootView.A0T), "rooms_lobby_switch_camera");
        1Br.A0C(lobbyRootView.A0J);
        ListenableFuture D3o = this.A01.D3o();
        D4q.A02(D3o, lobbyRootView, 4YV.A11(lobbyRootView.A0Q), 80);
        return D3o;
    }

    public ListenableFuture CTe() {
        ListenableFuture A03;
        C00i c00i;
        Executor A1D;
        int i;
        boolean z = !this.A00.BTq();
        Integer APa = this.A01.APa(z);
        Integer num = 0S2.A00;
        LobbyRootView lobbyRootView = this.A02;
        if (APa == num) {
            1Br.A0C(lobbyRootView.A0K);
            A03 = CNY.A00((Activity) AnonymousClass016.A00(lobbyRootView.getContext(), Activity.class), (CNY) 1Br.A0B(lobbyRootView.A0A), (1K9) null, "lobby_rootview_toggle", false, false);
            c00i = lobbyRootView.A0Q.A00;
            A1D = AbG.A1D(c00i);
            i = 78;
        } else {
            1Br.A0C(lobbyRootView.A0U);
            A03 = ((CNY) 1Br.A0B(lobbyRootView.A0A)).A03("lobby_rootview_toggle");
            c00i = lobbyRootView.A0Q.A00;
            A1D = AbG.A1D(c00i);
            i = 79;
        }
        D4q.A02(A03, lobbyRootView, A1D, i);
        return 2FP.A02(new D2p(2, this, z), A03, AbG.A1D(c00i));
    }
}
