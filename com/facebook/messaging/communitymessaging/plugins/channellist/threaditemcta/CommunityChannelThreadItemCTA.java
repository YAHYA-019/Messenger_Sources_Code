package com.facebook.messaging.communitymessaging.plugins.channellist.threaditemcta;

import X.06Z;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.2YQ;
import X.7zP;
import X.7zT;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbK;
import X.AbL;
import X.C1296Ad8;
import X.C2gi;
import X.C7e;
import X.CaE;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.ListIterator;

/* loaded from: CommunityChannelThreadItemCTA.class */
public final class CommunityChannelThreadItemCTA {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C7e A06;
    public final 2YQ A07;
    public final C2gi A08;

    public CommunityChannelThreadItemCTA(Context context, 06Z r303, 2YQ r304, C2gi c2gi) {
        7zT.A1U(r303, r304, context);
        this.A08 = c2gi;
        this.A01 = r303;
        this.A07 = r304;
        this.A00 = context;
        this.A06 = (C7e) 1Bn.A0E(context, (1BY) null, 82563);
        this.A05 = AbG.A0c();
        this.A02 = 1Bu.A01(context, 83114);
        this.A04 = AbG.A0Q();
        this.A03 = 1Bu.A00(68762);
    }

    public static final void A00(FbUserSession fbUserSession, CommunityChannelThreadItemCTA communityChannelThreadItemCTA, String str, long j) {
        Object obj;
        ListIterator A1F = AbH.A1F(7zP.A0x(communityChannelThreadItemCTA.A01));
        while (true) {
            if (!A1F.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = A1F.previous();
                if (((Fragment) obj).mView != null) {
                    break;
                }
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null) {
            MutableLiveData A00 = communityChannelThreadItemCTA.A06.A00(fbUserSession, 1, communityChannelThreadItemCTA.A08.A01.A0n.A04);
            A00.observe(fragment.getViewLifecycleOwner(), CaE.A00(A00, 63));
            A01(communityChannelThreadItemCTA, "join_button", str, "thread_join", j);
        }
    }

    public static final void A01(CommunityChannelThreadItemCTA communityChannelThreadItemCTA, String str, String str2, String str3, long j) {
        C1296Ad8 A0O = AbJ.A0O(communityChannelThreadItemCTA.A05);
        ThreadSummary threadSummary = communityChannelThreadItemCTA.A08.A01;
        A0O.A04(new CommunityMessagingLoggerModel(null, null, AbL.A0e(threadSummary.A0l), String.valueOf(j), AbK.A17(threadSummary), null, str, str2, str3, "channel_list", null, null));
    }
}
