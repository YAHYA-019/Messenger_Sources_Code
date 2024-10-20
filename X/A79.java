package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsConfigProviderImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.ArrayList;

/* loaded from: A79.class */
public final class A79 implements 1VB, 1VC {
    public static final java.util.Map A04 = 04R.A09(7zQ.A1b("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible", 7zT.A0t(new 1VD[]{7zL.A0x(0)}, 0)));
    public A73 A00;
    public C3cp A01;
    public A74 A02;
    public final /* synthetic */ CommunityChannelListEventsConfigProviderImplementation A03;

    public A79(CommunityChannelListEventsConfigProviderImplementation communityChannelListEventsConfigProviderImplementation) {
        this.A03 = communityChannelListEventsConfigProviderImplementation;
        Context context = communityChannelListEventsConfigProviderImplementation.A00;
        FbUserSession fbUserSession = communityChannelListEventsConfigProviderImplementation.A01;
        1Va r0 = communityChannelListEventsConfigProviderImplementation.A04;
        2S4 r02 = communityChannelListEventsConfigProviderImplementation.A02;
        ThreadKey threadKey = communityChannelListEventsConfigProviderImplementation.A03;
        if (threadKey == null) {
            throw 1BK.A0h();
        }
        A73 a73 = new A73(context, fbUserSession, r02, threadKey, r0);
        ASA asa = ASA.A00;
        boolean A1X = 7zP.A1X(asa);
        1VJ r03 = new 1VJ(a73);
        asa.invoke(r03);
        1VH r04 = r03.A00;
        ArrayList arrayList = r03.A02;
        ArrayList arrayList2 = r03.A01;
        11T.A0I(r04, "null cannot be cast to non-null type com.facebook.messaging.communitymessaging.plugins.channellist.communitychannellisteventsconfigprovider.CommunityChannelListEventsGlobalConfig");
        this.A00 = (A73) r04;
        Object obj = arrayList.get(A1X ? 1 : 0);
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.communitymessaging.plugins.channellist.communitychannellisteventsconfigprovider.CommunityChannelListNormalBackgroundQueueConfig");
        this.A01 = (C3cp) obj;
        Object obj2 = arrayList2.get(A1X ? 1 : 0);
        11T.A0I(obj2, "null cannot be cast to non-null type com.facebook.messaging.communitymessaging.selectivesync.communitychannellist.eventhandler.SelectiveSyncCommunityChannelListConfig");
        this.A02 = (A74) obj2;
    }

    public 1VO Al1(int i) {
        if (i == 0) {
            return this.A01.A01;
        }
        throw 1BK.A1F();
    }

    public int AoW() {
        return 1;
    }

    public 1VF AvX(String str) {
        11T.A0F(str, 0);
        return (1VF) A04.get(str);
    }

    public int B5i() {
        return 1;
    }

    public 1Vf BfG(int i) {
        A7c a7c;
        if (i != 0) {
            throw 1BK.A1F();
        }
        if (this.A02.isEnabled()) {
            A73 a73 = this.A00;
            a7c = new A7c(a73.A00, a73.A01, a73.A02);
        } else {
            a7c = 2Wi.A00;
        }
        return a7c;
    }
}
