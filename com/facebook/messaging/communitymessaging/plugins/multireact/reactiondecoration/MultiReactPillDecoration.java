package com.facebook.messaging.communitymessaging.plugins.multireact.reactiondecoration;

import X.06Z;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Wi;
import X.2oI;
import X.4YT;
import X.5lO;
import X.5zD;
import X.7zM;
import X.7zR;
import X.AnonymousClass622;
import X.C5pk;
import android.content.Context;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableSet;

/* loaded from: MultiReactPillDecoration.class */
public final class MultiReactPillDecoration {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 5zD A0A;
    public final AnonymousClass622 A0B;
    public final Capabilities A0C;

    public MultiReactPillDecoration(Context context, 06Z r303, 5zD r304, AnonymousClass622 anonymousClass622, Capabilities capabilities) {
        7zR.A1N(context, r304);
        11T.A0F(r303, 5);
        this.A00 = context;
        this.A0B = anonymousClass622;
        this.A0A = r304;
        this.A0C = capabilities;
        this.A01 = r303;
        this.A05 = 1Bu.A01(context, 115451);
        this.A07 = 1Bq.A00(100038);
        this.A09 = 1Bq.A00(67773);
        this.A08 = 1HG.A00(context, 68414);
        this.A06 = 7zM.A0U();
        this.A02 = 1Bu.A00(67936);
        this.A03 = 1Bq.A00(68470);
        this.A04 = 1Bq.A00(82689);
    }

    public static final boolean A00(MultiReactPillDecoration multiReactPillDecoration) {
        ThreadKey threadKey;
        ImmutableSet immutableSet;
        Boolean bool;
        C5pk c5pk = (C5pk) multiReactPillDecoration.A07.A00.get();
        ThreadSummary threadSummary = multiReactPillDecoration.A0B.A05;
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = null;
        if (threadSummary != null) {
            threadKey = threadSummary.A0n;
            immutableSet = threadSummary.A1T;
        } else {
            threadKey = null;
            immutableSet = null;
        }
        Capabilities capabilities = multiReactPillDecoration.A0C;
        if (threadSummary != null) {
            bool = Boolean.valueOf(threadSummary.A2i);
            graphQLMessengerGroupThreadSubType = threadSummary.A0Y;
        } else {
            bool = null;
        }
        return c5pk.A00(graphQLMessengerGroupThreadSubType, threadKey, capabilities, immutableSet, bool);
    }

    public static final boolean A01(MultiReactPillDecoration multiReactPillDecoration) {
        5lO r0 = (5lO) multiReactPillDecoration.A09.A00.get();
        ThreadSummary threadSummary = multiReactPillDecoration.A0B.A05;
        return r0.A03(threadSummary != null ? threadSummary.A0n : null, multiReactPillDecoration.A0C);
    }

    public static final boolean A02(MultiReactPillDecoration multiReactPillDecoration) {
        Message message;
        AnonymousClass622 anonymousClass622 = multiReactPillDecoration.A0B;
        boolean z = false;
        if (2oI.A08(anonymousClass622.A05) && !anonymousClass622.A04.A03(4YT.A00(175)) && (message = anonymousClass622.A03) != null && message.A0V != null && ((1Wi) 1Br.A0B(multiReactPillDecoration.A03)).A02()) {
            z = true;
        }
        return z;
    }
}
