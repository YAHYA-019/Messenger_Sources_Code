package com.facebook.messaging.business.plugins.messengercontextualsuggestion.threadviewlifecycle;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.2JX;
import X.2Jf;
import X.7zL;
import X.7zM;
import X.AbI;
import X.AbstractC00603o4;
import X.AeR;
import X.AnonymousClass622;
import X.AnonymousClass624;
import X.C2069Dau;
import X.C3sa;
import X.DKE;
import X.DKH;
import X.EiI;
import X.G98;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: MessengerInThreadContextualSuggestionsLifeCycleController.class */
public final class MessengerInThreadContextualSuggestionsLifeCycleController {
    public boolean A00;
    public boolean A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Context A04;

    public MessengerInThreadContextualSuggestionsLifeCycleController(Context context) {
        11T.A0F(context, 1);
        this.A04 = context;
        this.A03 = 1Bu.A01(context, 16428);
        this.A02 = 1Bu.A01(context, 98409);
    }

    public static final AnonymousClass622 A00(ImmutableList immutableList, boolean z) {
        ImmutableList reverse = immutableList.reverse();
        11T.A0A(reverse);
        Iterator it = reverse.iterator();
        while (it.hasNext()) {
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) it.next();
            if (anonymousClass624 instanceof AnonymousClass622) {
                AnonymousClass622 anonymousClass622 = (AnonymousClass622) anonymousClass624;
                if (z ? anonymousClass622.A0d : anonymousClass622.A0c) {
                    return anonymousClass622;
                }
            }
        }
        return null;
    }

    public static final void A01(FbUserSession fbUserSession, MessengerInThreadContextualSuggestionsLifeCycleController messengerInThreadContextualSuggestionsLifeCycleController, ThreadKey threadKey, Integer num, String str, String str2) {
        if (threadKey != null) {
            EiI eiI = (EiI) 1Br.A0B(messengerInThreadContextualSuggestionsLifeCycleController.A02);
            String valueOf = String.valueOf(threadKey.A05);
            String A0w = 1BK.A0w(threadKey);
            G98 g98 = new G98(messengerInThreadContextualSuggestionsLifeCycleController, 3);
            11T.A0F(fbUserSession, 0);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            boolean A1W = DKE.A1W(A0M, "page_id", valueOf);
            boolean A1W2 = DKE.A1W(A0M, "thread_id", A0w);
            A0M.A05("trigger", str);
            A0M.A05("platform", "BIIM");
            A0M.A05("message_id", str2);
            A0M.A04(AbstractC00603o4.A00(21), num);
            Preconditions.checkArgument(A1W);
            Preconditions.checkArgument(A1W2);
            C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MessengerContextualSuggestionQuery", (String) null, "fbandroid", 2118548059, 0, 908706011L, 908706011L, false, true));
            A0L.A00 = fbUserSession.BKF();
            AbI.A0o(eiI.A01).A04(new C2069Dau(eiI, g98, 7), AeR.A01(DKH.A0N(eiI.A00).A09(A0L)), "MessengerContextualSuggestionFetcher");
        }
    }
}
