package X;

import android.os.SystemClock;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: J1p.class */
public final class J1p implements Runnable {
    public static final String __redex_internal_original_name = "LivingRoomVideoStateMutationController$seekVideo$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IRv A02;
    public final /* synthetic */ boolean A03;

    public J1p(IRv iRv, int i, int i2, boolean z) {
        this.A02 = iRv;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2JY A0B;
        2JY A0B2;
        String A0k;
        IRv iRv = this.A02;
        if (iRv.A0B != null) {
            2JY r0 = iRv.A0C;
            GhB ghB = null;
            if (r0 == null || (A0B = 1BK.A0B(r0, 2JX.class, 1408541109, 16993028)) == null || A0B.A0k() == null) {
                return;
            }
            RR4 rr4 = iRv.A0A;
            if (rr4 != null) {
                ghB = rr4.A00;
            }
            11T.A0I(ghB, "null cannot be cast to non-null type com.facebook.facecast.livingroom.protocol.LivingRoomGraphQLInterfaces.LivingRoomConsistentFragment");
            if (ghB.getBooleanValue(158038788)) {
                HdV hdV = (HdV) 1Br.A0B(iRv.A04);
                2JY r02 = iRv.A0C;
                int i = this.A01;
                int i2 = this.A00;
                if (!1Br.A07(((HQ7) 1Br.A0B(iRv.A02)).A00).AZk(36311010752530153L)) {
                    iRv.A00.A00.A00();
                    throw 0Q8.createAndThrow();
                }
                boolean z = this.A03;
                1BY r03 = hdV.A00.A00;
                FbUserSession A0D = AbK.A0D(r03);
                if (r02 != null) {
                    2JY r04 = r02;
                    if (r04.A0k() == null || i == i2 || i < 0) {
                        return;
                    }
                    String str = i2 < i ? "SEEK_FORWARD" : "SEEK_BACKWARD";
                    String str2 = z ? "PLAYING" : "PAUSED";
                    2JY A0B3 = 1BK.A0B(r04, 2JX.class, 1408541109, 16993028);
                    String str3 = null;
                    if (A0B3 == null || (A0B2 = 1BK.A0B(A0B3, GhE.class, 112202875, 651294136)) == null || (A0k = A0B2.A0k()) == null) {
                        return;
                    }
                    String A00 = ((HrW) 1Br.A0B(hdV.A01)).A00();
                    Hi5 hi5 = (Hi5) 1Lm.A07(A0D, r03, 114923);
                    07S A0J = 4YU.A0J(GraphQlCallInput.A02, A00, "action_id");
                    07S.A00(A0J, r04.A0k(), "living_room_id");
                    07S.A00(A0J, A0k, "media_id");
                    07S.A00(A0J, str, "video_event");
                    07S.A00(A0J, str2, "video_state");
                    07S.A00(A0J, Integer.valueOf(i), "media_timestamp_ms");
                    AtomicLong atomicLong = hi5.A04;
                    if (atomicLong.get() != -1) {
                        str3 = String.valueOf(SystemClock.elapsedRealtime() + hi5.A00 + atomicLong.get());
                    }
                    07S.A00(A0J, str3, "live_clock_timestamp_ms");
                    GraphQlQueryParamSet A0M = 7zL.A0M();
                    4YV.A1A(A0J, A0M, "data");
                    1VX.A09(AbJ.A05(hdV.A02), A0D).A06(5Dh.A00(A0M, new C01643sd(Q7r.class, "MessengerCoWatchVideoStateUpdateMutation", null, "data", "fbandroid", -660309134, 96, 1784276520L, 1784276520L, false, true)));
                }
            }
        }
    }
}
