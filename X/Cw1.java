package X;

import android.view.View;
import com.facebook.messaging.communitymessaging.block.plugins.core.graphqlthreadmemberdata.CommunityBlockThreadMemberGraphQLDataSource;
import com.facebook.user.model.User;

/* loaded from: Cw1.class */
public final class Cw1 implements AYO {
    public final /* synthetic */ CommunityBlockThreadMemberGraphQLDataSource A00;

    public Cw1(CommunityBlockThreadMemberGraphQLDataSource communityBlockThreadMemberGraphQLDataSource) {
        this.A00 = communityBlockThreadMemberGraphQLDataSource;
    }

    public final void BoG(View view, User user) {
        this.A00.A0E.A00(view, user);
    }
}
