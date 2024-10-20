package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6n6, reason: invalid class name */
/* loaded from: 6n6.class */
public final class C6n6 {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    public C6n6(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A00 = 1Bq.A00(67528);
        this.A01 = 1Bq.A00(68332);
    }

    public final ThreadSummary A00(ThreadKey threadKey) {
        if (threadKey == null) {
            return null;
        }
        try {
            ThreadSummaryDataModel threadSummaryDataModel = (ThreadSummaryDataModel) ((C5xl) this.A00.A00.get()).ASY(threadKey).getValue();
            if (threadSummaryDataModel != null) {
                return threadSummaryDataModel.A00;
            }
            return null;
        } catch (IllegalStateException e) {
            0fH.A0s("ThreadedRepliesUtils", "error thrown during maybeGetThreadSummaryFromRepository", e);
            return null;
        }
    }

    public final boolean A01(Message message, Capabilities capabilities) {
        6Ay BCm;
        ImmutableList BDF;
        ThreadKey threadKey = message.A0V;
        ThreadSummary A00 = A00(threadKey);
        String str = message.A1V;
        if (str == null || str.equals(message.A1g)) {
            return false;
        }
        if ((threadKey != null ? threadKey.A06 : null) != C1yg.COMMUNITY_CHANNEL || message.A0U != null) {
            return false;
        }
        5Pm r0 = message.A08;
        if ((r0 != null && (BCm = r0.BCm()) != null && (BDF = BCm.BDF()) != null && BDF.contains(GraphQLStoryAttachmentStyle.A1F)) || C1q7.A0p(message) || !capabilities.A00.get(ActionId.ASYNC_ACTION_SUCCESS)) {
            return false;
        }
        C00i c00i = this.A01.A00;
        C5xr c5xr = (C5xr) c00i.get();
        if (!c5xr.A01() || !C5xr.A00(c5xr).AZk(36322499767584334L)) {
            return false;
        }
        if (!C1q7.A0D(message) || r0 != null || C1q7.A08(message) || C1q7.A0C(message) || C1q7.A0A(message)) {
            C5xr c5xr2 = (C5xr) c00i.get();
            if (!c5xr2.A01() || !C5xr.A00(c5xr2).AZk(36322499768174165L)) {
                return false;
            }
        }
        return A00 == null || !A00.A0n.A1A() || A00.A2i;
    }
}
