package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadWarningType;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ja, reason: invalid class name */
/* loaded from: 5ja.class */
public final class C5ja {
    public final 1Br A00 = 1Bu.A00(67841);

    public boolean A00(Context context, FbUserSession fbUserSession, ThreadKey threadKey, Integer num, List list) {
        GraphQLMessengerGroupThreadWarningType graphQLMessengerGroupThreadWarningType;
        11T.A0F(list, 3);
        if (!((C5nm) this.A00.A00.get()).A00(threadKey)) {
            return false;
        }
        C1zm c1zm = new C1zm();
        c1zm.A03(threadKey);
        c1zm.A0g = 1F9.A0I;
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5fr c5fr = (C5fr) it.next();
            C1zJ c1zJ = new C1zJ();
            C1zA c1zA = ParticipantInfo.A0N;
            1Ks A03 = c5fr.A03();
            3pI r0 = new 3pI();
            r0.A0B = A03;
            r0.A09 = new UserKey(1Js.A03, c5fr.A06);
            r0.A0D = c5fr.A07;
            c1zJ.A01(r0.A00());
            builder.add(new ThreadParticipant(c1zJ));
        }
        ImmutableList build = builder.build();
        11T.A0A(build);
        c1zm.A0E(build);
        if (num == null) {
            graphQLMessengerGroupThreadWarningType = GraphQLMessengerGroupThreadWarningType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        } else {
            int intValue = num.intValue();
            graphQLMessengerGroupThreadWarningType = intValue != 1 ? intValue != 2 ? intValue != 3 ? GraphQLMessengerGroupThreadWarningType.UNKNOWN : GraphQLMessengerGroupThreadWarningType.CEI_SHARER : GraphQLMessengerGroupThreadWarningType.CEI_BANK_HIT : GraphQLMessengerGroupThreadWarningType.CLEAR;
        }
        c1zm.A02(graphQLMessengerGroupThreadWarningType);
        return C5nn.A00(context, fbUserSession, new ThreadSummary(c1zm));
    }
}
