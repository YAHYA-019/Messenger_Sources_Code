package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.google.common.base.Function;

/* loaded from: D39.class */
public final class D39 implements Function {
    public static final D39 A00 = new Object();

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        ThreadSummary threadSummary;
        ThreadKey threadKey;
        MessageSearchThreadModel messageSearchThreadModel = (MessageSearchThreadModel) obj;
        if (messageSearchThreadModel == null || (threadSummary = messageSearchThreadModel.A02) == null || (threadKey = threadSummary.A0n) == null) {
            return null;
        }
        return new C4U(threadSummary, messageSearchThreadModel.A05, threadKey.A0t(), messageSearchThreadModel.A00);
    }
}
