package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.data.communitymessaging.memberlist.model.CommunityMemberListSource;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Ca6.class */
public final class Ca6 implements Observer {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ LifecycleOwner A01;
    public final /* synthetic */ LiveData A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ DH5 A04;
    public final /* synthetic */ ThreadKey A05;
    public final /* synthetic */ BX2 A06;

    public Ca6(Context context, LifecycleOwner lifecycleOwner, LiveData liveData, FbUserSession fbUserSession, DH5 dh5, ThreadKey threadKey, BX2 bx2) {
        this.A06 = bx2;
        this.A00 = context;
        this.A05 = threadKey;
        this.A01 = lifecycleOwner;
        this.A04 = dh5;
        this.A03 = fbUserSession;
        this.A02 = liveData;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Community community = (Community) obj;
        11T.A0F(community, 0);
        Context context = this.A00;
        ThreadKey threadKey = this.A05;
        long A0C = 7zQ.A0C(community);
        LifecycleOwner lifecycleOwner = this.A01;
        DH5 dh5 = this.A04;
        FbUserSession fbUserSession = this.A03;
        1Br A00 = 1Bq.A00(83062);
        AfT A0K = ((AbR) 1Bu.A06(context, 641)).A0K(fbUserSession, A0C);
        A0K.A03(new 8Lt(threadKey, 11T.A03(BM3.A03), 4), (Integer) null, (Long) null, CommunityMemberListSource.A0M.value, true);
        A0K.observe(lifecycleOwner, new Ca2(4, A0K, lifecycleOwner, A00, dh5));
        A0K.A02();
        this.A02.removeObservers(lifecycleOwner);
    }
}
