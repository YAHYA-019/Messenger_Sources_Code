package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function1;

/* loaded from: AFo.class */
public final class AFo implements Runnable {
    public static final String __redex_internal_original_name = "ChannelSummaryAiGenerationEventHandler$requestAiGeneratedSummaryWithCriticalPathController$task$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6ny A01;
    public final /* synthetic */ Function1 A02;

    public AFo(C6ny c6ny, Function1 function1, long j) {
        this.A01 = c6ny;
        this.A00 = j;
        this.A02 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6ny c6ny = this.A01;
        long j = this.A00;
        Function1 function1 = this.A02;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, String.valueOf(j), "thread_id");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, 0, "last_read_timestamp_sec");
        4YV.A1A(A0J, A0N, "input");
        ListenableFuture A06 = 1VX.A04(c6ny.A00, c6ny.A01).A06(7zT.A0B(A0N, new C01643sd(Q7i.class, "CreateMessengerCommunityChatSummaryWithGenAiMutation", null, "input", "fbandroid", 1713461294, 96, 838313204L, 838313204L, false, true)));
        1Br.A0D(c6ny.A05, AC8.A00(function1, 6), A06);
        11T.A0D(A06);
    }
}
