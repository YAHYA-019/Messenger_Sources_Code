package X;

import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: Cmn.class */
public final class Cmn implements 5Vz {
    public final /* synthetic */ MessagesCollection A00;
    public final /* synthetic */ ThreadSummary A01;
    public final /* synthetic */ 5VT A02;
    public final /* synthetic */ 5Sd A03;
    public final /* synthetic */ User A04;

    public Cmn(MessagesCollection messagesCollection, ThreadSummary threadSummary, 5VT r304, 5Sd r305, User user) {
        this.A04 = user;
        this.A02 = r304;
        this.A01 = threadSummary;
        this.A00 = messagesCollection;
        this.A03 = r305;
    }

    public void Bq7(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        if (immutableList.isEmpty()) {
            return;
        }
        1Kh A0y = AbF.A0y();
        A0y.A03(this.A04);
        A0y.A0V = AbG.A0u(immutableList, 0).A0a;
        5VT r0 = this.A02;
        User A0w = AbF.A0w(A0y);
        DataFetchDisposition dataFetchDisposition = DataFetchDisposition.A0F;
        5Sc r02 = 5Sc.A07;
        ThreadSummary threadSummary = this.A01;
        MessagesCollection messagesCollection = this.A00;
        11T.A0D(dataFetchDisposition);
        5VT.A03(r0, new 5Sc(dataFetchDisposition, messagesCollection, threadSummary, this.A03, A0w, (List) null, false), false);
    }
}
