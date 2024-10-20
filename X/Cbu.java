package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Cbu.class */
public final class Cbu implements 2TV {
    public final /* synthetic */ ThreadSummary A00;
    public final /* synthetic */ Buy A01;
    public final /* synthetic */ String A02;

    public Cbu(ThreadSummary threadSummary, Buy buy, String str) {
        this.A01 = buy;
        this.A02 = str;
        this.A00 = threadSummary;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
        RMw rMw = (RMw) obj2;
        if (rMw != null) {
            Buy buy = this.A01;
            String str = this.A02;
            ThreadSummary threadSummary = this.A00;
            ImmutableList immutableList = rMw.A01;
            if (immutableList.size() == 1) {
                C8o c8o = buy.A02;
                MessageSearchMessageModel messageSearchMessageModel = (MessageSearchMessageModel) 0QD.A0J(immutableList, 0);
                if (messageSearchMessageModel != null) {
                    String str2 = messageSearchMessageModel.A09;
                    c8o.A00(threadSummary, messageSearchMessageModel.A03, messageSearchMessageModel.A05, str, str2, true);
                }
            }
        }
    }
}
