package com.facebook.messaging.threaddelete.plugins.threadsettingsmenuitem.deleteconversation;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.2Sh;
import X.2oI;
import X.4YU;
import X.6EX;
import X.6Q7;
import X.7zR;
import X.7zT;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.BNV;
import X.Byb;
import X.C0D1;
import X.C1gs;
import X.C20E;
import X.C7I;
import X.CBD;
import X.Cn2;
import X.Cn6;
import X.DHc;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.mutators.DeleteThreadDialogFragment;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* loaded from: ThreadSettingsDeleteConversationMenuItem.class */
public final class ThreadSettingsDeleteConversationMenuItem {
    public static final C7I A00(ThreadSummary threadSummary) {
        int i;
        if (AbI.A1b(1BL.A0Q())) {
            i = 2131968168;
        } else {
            i = 2131966934;
            if (ThreadKey.A0a(AbJ.A0S(threadSummary))) {
                i = 2131966932;
            }
        }
        return new C7I(BNV.A0k, i);
    }

    public static final void A01(Context context, 06Z r302, FbUserSession fbUserSession, ThreadSummary threadSummary, DHc dHc) {
        int i;
        11T.A0F(context, 0);
        7zT.A1U(r302, dHc, fbUserSession);
        if (C0D1.A01(r302)) {
            if (threadSummary == null) {
                throw 1BK.A0e();
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ThreadKey threadKey = threadSummary.A0n;
            ImmutableList of = ImmutableList.of((Object) threadKey);
            if (ThreadKey.A0a(threadKey)) {
                6EX r0 = 6EX.A00;
                long j = threadSummary.A06;
                boolean A04 = r0.A04(j);
                if (CBD.A01(threadSummary)) {
                    str5 = 1BK.A0v(context, threadSummary.A20, 2131953983);
                    int i2 = 2131953981;
                    if (A04) {
                        i2 = 2131966203;
                    }
                    str3 = context.getString(i2);
                    str4 = context.getString(2131966065);
                } else {
                    int i3 = 2131953982;
                    if (A04) {
                        i3 = 2131966204;
                    }
                    String str6 = threadSummary.A20;
                    str5 = 1BK.A0v(context, str6, i3);
                    int i4 = 2131953980;
                    if (A04) {
                        i4 = 2131966202;
                    }
                    str3 = 1BK.A0v(context, str6, i4);
                }
                bool = true;
                ThreadKey threadKey2 = threadSummary.A0l;
                if (threadKey2 != null) {
                    str = 1BK.A0w(threadKey2);
                }
                str2 = String.valueOf(j);
            } else {
                if (2oI.A03(threadSummary)) {
                    str5 = context.getString(2131955844);
                    i = 2131955843;
                } else if (threadSummary.A2X && AbF.A1Y(C1gs.A00((C1gs) 1Bn.A0A(66804)), 2342160269123595352L)) {
                    11T.A0A(threadKey);
                    if (threadKey.A0x()) {
                        str5 = context.getString(2131952892);
                        str3 = 1BK.A0v(context, threadSummary.A20, 2131952891);
                    } else if (threadKey.A0w()) {
                        str5 = context.getString(2131952892);
                        i = 2131952890;
                    }
                }
                str3 = context.getString(i);
            }
            DeleteThreadDialogFragment A05 = DeleteThreadDialogFragment.A05(new Byb(of, null, bool, null, null, str, null, "ThreadSettingsDeleteConversationMenuItem", str2, str3, str4, str5));
            11T.A0D(A05);
            if (CBD.A01(threadSummary)) {
                A05.A06 = new Cn6(threadSummary, A05);
            }
            A05.A05 = new Cn2(dHc, 3);
            A05.A0m(r302, "delete_thread_request_dialog");
            11T.A0A(threadKey);
            ((6Q7) 1Bn.A0E(context, (1BY) null, 67958)).A08(fbUserSession, threadKey, "entrypoint_thread_detail");
        }
    }

    public static final boolean A02(ThreadSummary threadSummary, Capabilities capabilities, 2Sh r303) {
        Community community;
        7zR.A1O(capabilities, r303);
        if (threadSummary == null || !4YU.A1Y(capabilities, 74)) {
            return false;
        }
        if (!AbF.A1X(threadSummary)) {
            return true;
        }
        ThreadKey threadKey = threadSummary.A0l;
        return (threadKey == null || 4YU.A0l(threadKey) == null || (community = (Community) AbH.A14(r303, Community.class)) == null || community.A0K == C20E.A03) ? false : true;
    }
}
