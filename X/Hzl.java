package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.user.model.User;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Hzl.class */
public final class Hzl {
    public ListenableFuture A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final User A05;
    public final Handler A06;
    public final 1BP A07 = FbInjector.A00;

    public Hzl(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A05 = (User) 1Bn.A0E((Context) null, r0, 83430);
        this.A06 = (Handler) 1Bn.A0E((Context) null, r0, 16430);
        this.A04 = 1Bu.A03(r0, 114807);
        this.A02 = GOo.A0N(r0);
        this.A03 = 1Bu.A03(r0, 82222);
    }

    public static final void A00(FbUserSession fbUserSession, Hzl hzl, String str, String str2, boolean z) {
        String A0s;
        Resources A0D = GOn.A0D();
        int i = 2131955155;
        if (z) {
            i = 2131955156;
        }
        String string = A0D.getString(i);
        11T.A0D(string);
        Handler handler = hzl.A06;
        handler.removeCallbacksAndMessages(null);
        handler.post(new J0A(fbUserSession, hzl, string));
        if (z) {
            return;
        }
        HdU hdU = (HdU) 1Br.A0B(hzl.A04);
        HnE hnE = new HnE(hzl.A05);
        Q6i q6i = new Q6i();
        C00i c00i = hdU.A01.A00;
        HQ6 hq6 = (HQ6) c00i.get();
        synchronized (hq6) {
            try {
                A0s = 7zR.A0s();
                hq6.A00.A04(A0s, AnonymousClass001.A0K());
            } catch (Throwable th) {
                throw th;
            }
        }
        hq6 = (HQ6) c00i.get();
        synchronized (hq6) {
            hq6.A00.A03(A0s);
        }
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, A0s, "action_id");
        07S.A00(A0J, str, "living_room_id");
        07S.A00(A0J, str2, TraceFieldType.VideoId);
        07S.A00(A0J, "ADDED_VIDEO", "video_event");
        User user = hnE.A01;
        07S.A00(A0J, user != null ? user.A13 : null, "message_actor_id");
        4YV.A1A(A0J, ((2Jf) q6i).A00, "input");
        5Dh r0 = new 5Dh(q6i);
        r0.A00 = null;
        1Vd A0K = 7zM.A0K(hdU.A00);
        4YU.A1J(r0, 216779269370911L);
        A0K.A08(r0, 5Dj.A01);
    }
}
