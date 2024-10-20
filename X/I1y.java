package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: I1y.class */
public final class I1y {
    public 1BY A00;
    public final C00i A02 = 1BQ.A02(115524);
    public final Context A01 = 7zP.A0J();

    public I1y(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static final I1y A00(1BO r301) {
        return new I1y(r301);
    }

    public void A01(FbUserSession fbUserSession, String str, String str2, String str3) {
        C00i c00i = this.A02;
        String A00 = ((HrW) c00i.get()).A00();
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, A00, "action_id");
        07S.A00(A0J, str, "living_room_id");
        07S.A00(A0J, 0, "video_resume_position_ms");
        07S.A00(A0J, str2, "media_id");
        07S.A00(A0J, "PLAY_DIRECT", "video_event");
        if (str3 != null) {
            07S.A00(A0J, str3, "tab_source");
        }
        ((HrW) c00i.get()).A01(A00);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        4YV.A1A(A0J, A0M, "data");
        5Dh A002 = 5Dh.A00(A0M, new C01643sd(Q7q.class, "MessengerCoWatchVideoPlayNowMutation", null, "data", "fbandroid", 1341489656, 96, 3325134933L, 3325134933L, false, true));
        AbstractC05414dq A07 = 1VX.A07(this.A01, fbUserSession);
        4YU.A1J(A002, 1055339481777596L);
        A07.A06(A002);
    }
}
