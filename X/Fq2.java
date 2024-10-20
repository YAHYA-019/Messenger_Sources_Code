package X;

import android.os.Bundle;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;

/* loaded from: Fq2.class */
public final class Fq2 implements GGH {
    public final /* synthetic */ QuicksilverWebviewService A00;

    public Fq2(QuicksilverWebviewService quicksilverWebviewService) {
        this.A00 = quicksilverWebviewService;
    }

    public void Bpo(GraphQLResult graphQLResult) {
        QuicksilverWebviewService quicksilverWebviewService = this.A00;
        if (((ExK) quicksilverWebviewService.A0K.get()).A01 != null) {
            Bundle A05 = 1BK.A05();
            A05.putBoolean("showtournamenticon", true);
            quicksilverWebviewService.A0B(A05, EOz.A0R);
        }
    }
}
