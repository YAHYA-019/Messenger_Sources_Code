package X;

import android.view.View;
import com.facebook.messaging.communitymessaging.block.plugins.core.groupmemberdata.CommunityGroupMemberDataProviderImplementation;
import com.facebook.user.model.User;

/* loaded from: Cw2.class */
public final class Cw2 implements AYO {
    public final /* synthetic */ CommunityGroupMemberDataProviderImplementation A00;

    public Cw2(CommunityGroupMemberDataProviderImplementation communityGroupMemberDataProviderImplementation) {
        this.A00 = communityGroupMemberDataProviderImplementation;
    }

    public final void BoG(View view, User user) {
        this.A00.A09.A00(view, user);
    }
}
