package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.NewMessageResult;
import java.util.Set;

/* loaded from: Cwc.class */
public final class Cwc implements DHm {
    public static final Set A02 = C1n3.A05(GraphQLMessengerGroupThreadSubType.A0A, GraphQLMessengerGroupThreadSubType.A05, GraphQLMessengerGroupThreadSubType.A04, GraphQLMessengerGroupThreadSubType.A02, GraphQLMessengerGroupThreadSubType.A03);
    public 1BY A00;
    public final Context A01 = 7zP.A0J();

    public Cwc(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.DHm
    public QqR AEm(FbUserSession fbUserSession, NewMessageResult newMessageResult) {
        ThreadSummary A06 = ((2fE) 1Lo.A04((Context) null, fbUserSession, this.A00, 17064)).A06(newMessageResult.A00.A0V);
        if (A06 != null) {
            GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = GraphQLMessengerGroupThreadSubType.A0B;
            GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType2 = A06.A0Y;
            if (graphQLMessengerGroupThreadSubType.equals(graphQLMessengerGroupThreadSubType2) || A02.contains(graphQLMessengerGroupThreadSubType2)) {
                try {
                    PackageManager packageManager = this.A01.getPackageManager();
                    packageManager.getClass();
                    packageManager.getPackageInfo("com.facebook.games", 0);
                    return QqR.A04;
                } catch (PackageManager.NameNotFoundException unused) {
                    return QqR.A01;
                }
            }
        }
        return QqR.A01;
    }

    @Override // X.DHm
    public String name() {
        return "GamesAppThreadRule";
    }
}
