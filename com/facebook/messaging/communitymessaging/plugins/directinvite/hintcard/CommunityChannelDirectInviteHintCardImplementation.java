package com.facebook.messaging.communitymessaging.plugins.directinvite.hintcard;

import X.06Z;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.63D;
import X.7zP;
import X.7zR;
import X.C7e;
import X.C9qq;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import java.util.List;
import java.util.ListIterator;

/* loaded from: CommunityChannelDirectInviteHintCardImplementation.class */
public final class CommunityChannelDirectInviteHintCardImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final ThreadSummary A07;
    public final 63D A08;
    public final ThreadViewParams A09;

    public CommunityChannelDirectInviteHintCardImplementation(Context context, 06Z r303, ThreadSummary threadSummary, 63D r305, ThreadViewParams threadViewParams) {
        7zR.A1N(context, r303);
        this.A00 = context;
        this.A01 = r303;
        this.A08 = r305;
        this.A09 = threadViewParams;
        this.A07 = threadSummary;
        this.A03 = 1Bu.A01(context, 83112);
        this.A04 = 1Bu.A00(83118);
        this.A05 = 1Bq.A00(17047);
        this.A02 = 1Bu.A01(context, 82563);
        this.A06 = 1Bu.A00(83108);
    }

    public static final void A00(FbUserSession fbUserSession, CommunityChannelDirectInviteHintCardImplementation communityChannelDirectInviteHintCardImplementation, Integer num) {
        Object obj;
        int i;
        List A0x = 7zP.A0x(communityChannelDirectInviteHintCardImplementation.A01);
        ListIterator listIterator = A0x.listIterator(A0x.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((Fragment) obj).mView != null) {
                    break;
                }
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null) {
            C7e c7e = (C7e) 1Br.A0B(communityChannelDirectInviteHintCardImplementation.A02);
            long j = communityChannelDirectInviteHintCardImplementation.A07.A0n.A04;
            switch (num.intValue()) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                default:
                    i = 3;
                    break;
            }
            MutableLiveData A00 = c7e.A00(fbUserSession, i, j);
            A00.observe(fragment.getViewLifecycleOwner(), new C9qq(A00, 10));
        }
    }
}
