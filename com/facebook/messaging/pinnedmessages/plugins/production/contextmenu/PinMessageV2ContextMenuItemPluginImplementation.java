package com.facebook.messaging.pinnedmessages.plugins.production.contextmenu;

import X.07S;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Lm;
import X.1Lo;
import X.1Uv;
import X.1VX;
import X.2rT;
import X.4YU;
import X.4YV;
import X.5Dh;
import X.61K;
import X.7zL;
import X.7zM;
import X.9bK;
import X.AC5;
import X.AV8;
import X.AbG;
import X.AbK;
import X.AbstractC05414dq;
import X.BgJ;
import X.C01643sd;
import X.C4k;
import X.C61J;
import X.Q8X;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: PinMessageV2ContextMenuItemPluginImplementation.class */
public final class PinMessageV2ContextMenuItemPluginImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final Message A0B;
    public final BgJ A0C;

    public PinMessageV2ContextMenuItemPluginImplementation(Context context, FbUserSession fbUserSession, Message message) {
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A0B = message;
        this.A04 = 1Bu.A01(context, 68706);
        this.A07 = 1Bu.A01(context, 68266);
        this.A09 = 1Bu.A00(68135);
        this.A05 = AbG.A0a();
        this.A08 = 1Lm.A00(context, fbUserSession, 68603);
        this.A06 = 7zM.A0U();
        this.A0A = 1HG.A00(context, 99435);
        this.A0C = (BgJ) 1Lo.A04(context, fbUserSession, (1BY) null, 81927);
        this.A03 = 1Bq.A00(66266);
        this.A02 = AbG.A0c();
    }

    public static final void A00(View view, ThreadKey threadKey, ThreadSummary threadSummary, PinMessageV2ContextMenuItemPluginImplementation pinMessageV2ContextMenuItemPluginImplementation, String str, boolean z) {
        if (((2rT) 1Br.A0B(pinMessageV2ContextMenuItemPluginImplementation.A03)).A02(threadSummary.A0n)) {
            ((9bK) 1Br.A0B(pinMessageV2ContextMenuItemPluginImplementation.A07)).A00(pinMessageV2ContextMenuItemPluginImplementation.A01, threadKey, Boolean.valueOf(z), str);
            return;
        }
        C4k c4k = (C4k) 1Br.A0B(pinMessageV2ContextMenuItemPluginImplementation.A08);
        AV8 av8 = new AV8(38, view, pinMessageV2ContextMenuItemPluginImplementation, threadSummary);
        C61J c61j = c4k.A03;
        c61j.A02.put(str, 61K.A03);
        ((1Uv) 1Br.A0B(c61j.A01)).A0A(c61j.A00, threadKey, "PendingPinMessageV2Cache");
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, 1BK.A0w(threadKey), "thread_id");
        07S.A00(A0J, str, "message_id");
        AbstractC05414dq A04 = 1VX.A04(c4k.A00, c4k.A01);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        4YV.A1A(A0J, A0M, "input");
        ListenableFuture A0z = AbK.A0z(A04, 5Dh.A00(A0M, new C01643sd(Q8X.class, "MessengerPinMessage", null, "input", "fbandroid", -2117124256, 128, 2072850697L, 2072850697L, false, true)), 415192073395620L);
        1Br.A0D(c4k.A02, new AC5(threadKey, c4k, av8, str, 1), A0z);
    }
}
