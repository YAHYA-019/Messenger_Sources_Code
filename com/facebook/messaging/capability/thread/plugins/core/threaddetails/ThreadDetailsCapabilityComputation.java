package com.facebook.messaging.capability.thread.plugins.core.threaddetails;

import X.4YV;
import X.C1v9;
import com.facebook.graphql.enums.GraphQLMessageThreadCannotReplyReason;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ThreadDetailsCapabilityComputation.class */
public final class ThreadDetailsCapabilityComputation {
    public static final void A00(ThreadSummary threadSummary, User user, C1v9 c1v9) {
        4YV.A1N(threadSummary, c1v9);
        ThreadKey threadKey = threadSummary.A0n;
        if (ThreadKey.A0f(threadKey) || ThreadKey.A0h(threadKey) || ThreadKey.A0a(threadKey) || ThreadKey.A0T(threadKey) || ThreadKey.A0p(threadKey) || ((ThreadKey.A0q(threadKey) && !"UNSET_LAST_MESSAGE_ID".equals(threadSummary.A1x)) || !(!ThreadKey.A0j(threadKey) || threadSummary.AbY() == GraphQLMessageThreadCannotReplyReason.A08 || user == null || user.A1f || user.A1n))) {
            c1v9.A00(23);
        }
    }
}
