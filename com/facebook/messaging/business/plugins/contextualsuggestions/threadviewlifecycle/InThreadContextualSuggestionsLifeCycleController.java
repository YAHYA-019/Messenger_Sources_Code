package com.facebook.messaging.business.plugins.contextualsuggestions.threadviewlifecycle;

import X.0Q8;
import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Du;
import X.2FP;
import X.2JX;
import X.2Jf;
import X.2Wo;
import X.63D;
import X.7zL;
import X.7zM;
import X.7zN;
import X.AbstractC00603o4;
import X.AeR;
import X.AnonymousClass622;
import X.AnonymousClass624;
import X.C00i;
import X.C0et;
import X.C3sa;
import X.DKE;
import X.DKN;
import X.ESw;
import X.EWk;
import X.Eqf;
import X.FZB;
import X.FvV;
import X.FwK;
import X.REv;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: InThreadContextualSuggestionsLifeCycleController.class */
public final class InThreadContextualSuggestionsLifeCycleController {
    public 1BY A00;
    public LithoView A01;
    public 63D A02;
    public EWk A03;
    public 2Wo A04;
    public boolean A05;
    public boolean A06;
    public final C00i A08 = 7zN.A0D(98442);
    public final C00i A0A = 1BQ.A02(83604);
    public final Observer A07 = FZB.A00(this, 5);
    public final REv A09 = new REv(this);

    public InThreadContextualSuggestionsLifeCycleController(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static AnonymousClass622 A00(ImmutableList immutableList, boolean z) {
        1Du it = immutableList.reverse().iterator();
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

    public static void A01(InThreadContextualSuggestionsLifeCycleController inThreadContextualSuggestionsLifeCycleController, ThreadKey threadKey, Integer num, String str, String str2) {
        if (threadKey != null) {
            inThreadContextualSuggestionsLifeCycleController.A04.A01();
            inThreadContextualSuggestionsLifeCycleController.A04.A03();
            Eqf eqf = (Eqf) inThreadContextualSuggestionsLifeCycleController.A08.get();
            String l = Long.toString(threadKey.A05);
            String l2 = Long.toString(threadKey.A0r());
            String str3 = inThreadContextualSuggestionsLifeCycleController.A0A.get().equals(C0et.A0P) ? "BIIM" : "MESSENGER";
            ESw eSw = (ESw) 1Br.A0B(eqf.A07);
            FbUserSession fbUserSession = eqf.A01;
            if (fbUserSession == null) {
                7zL.A1C();
                throw 0Q8.createAndThrow();
            }
            GraphQlQueryParamSet A0M = 7zL.A0M();
            boolean A1W = DKE.A1W(A0M, "page_id", l);
            boolean A1W2 = DKE.A1W(A0M, "thread_id", l2);
            A0M.A05("trigger", str);
            A0M.A05("platform", str3);
            A0M.A05("message_id", str2);
            A0M.A04(AbstractC00603o4.A00(21), num);
            Preconditions.checkArgument(A1W);
            Preconditions.checkArgument(A1W2);
            C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "ContextualSuggestionQuery", (String) null, "fbandroid", 1297057199, 0, 1060638045L, 1060638045L, false, true));
            A0L.A00 = fbUserSession.BKF();
            1Br.A0D(eqf.A08, FwK.A01(eqf, 14), 2FP.A01(new FvV(eSw, l2, str3, str, 1), AeR.A01(((DKN) 1Bn.A0E((Context) null, eSw.A00, 68643)).A02().A09(A0L))));
        }
    }
}
