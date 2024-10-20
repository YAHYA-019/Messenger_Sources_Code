package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator;
import com.facebook.messaging.msys.common.translator.TempMessageReactionListUtil;
import com.facebook.messenger.orca.ChildResultSetUtils;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.5pg, reason: invalid class name */
/* loaded from: 5pg.class */
public final class C5pg extends AbstractMsysMessagesCollectionTranslator {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;

    public C5pg(1BO r302, FbUserSession fbUserSession) {
        super((5HV) 1Bi.A03(49642));
        this.A04 = new 1BV((1BY) null, 49982);
        this.A03 = new 1BV((1BY) null, 49983);
        this.A02 = 1BQ.A02(46);
        this.A05 = 1BQ.A02(100038);
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
    }

    @Override // com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator
    public void A06(GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType, 5PI r303, ThreadKey threadKey, C07924lC c07924lC, Capabilities capabilities, ImmutableSet immutableSet, Boolean bool, int i) {
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType2 = graphQLMessengerGroupThreadSubType;
        super.A06(graphQLMessengerGroupThreadSubType, r303, threadKey, c07924lC, capabilities, immutableSet, bool, i);
        C5pk c5pk = (C5pk) this.A05.get();
        if (graphQLMessengerGroupThreadSubType == null) {
            graphQLMessengerGroupThreadSubType2 = GraphQLMessengerGroupThreadSubType.A0E;
        }
        if (c5pk.A00(graphQLMessengerGroupThreadSubType2, threadKey, capabilities, immutableSet, bool)) {
            TempMessageReactionListUtil.A00(r303, ChildResultSetUtils.getOrcaTempMessageReactionsV2CountListFromOrcaTempMessageList(c07924lC, i));
        }
    }
}
