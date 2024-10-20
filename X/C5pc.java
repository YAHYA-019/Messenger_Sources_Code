package X;

import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadMetadata;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5pc, reason: invalid class name */
/* loaded from: 5pc.class */
public final class C5pc {
    public long A00;
    public DataFetchDisposition A01;
    public MessagesCollection A02;
    public ThreadMetadata A03;
    public ThreadSummary A04;
    public 5Xx A05;
    public ImmutableList A06;
    public String A07;
    public String A08;
    public java.util.Map A09;
    public boolean A0A;
    public boolean A0B;

    public C5pc() {
        this.A05 = 5Xx.A03;
        this.A01 = DataFetchDisposition.A0I;
        this.A06 = ImmutableList.of();
    }

    public C5pc(FetchThreadResult fetchThreadResult) {
        this.A05 = 5Xx.A03;
        this.A01 = DataFetchDisposition.A0I;
        this.A06 = ImmutableList.of();
        this.A05 = fetchThreadResult.A06;
        this.A01 = fetchThreadResult.A02;
        this.A04 = fetchThreadResult.A05;
        this.A03 = fetchThreadResult.A04;
        this.A02 = fetchThreadResult.A03;
        this.A06 = fetchThreadResult.A07;
        this.A09 = fetchThreadResult.A00;
        this.A00 = fetchThreadResult.A01;
        this.A0B = fetchThreadResult.A0B;
        this.A0A = fetchThreadResult.A0A;
        this.A08 = fetchThreadResult.A09;
        this.A07 = fetchThreadResult.A08;
    }

    public FetchThreadResult A00() {
        ThreadSummary threadSummary;
        MessagesCollection messagesCollection = this.A02;
        if (messagesCollection == null && (threadSummary = this.A04) != null) {
            C5pv c5pv = new C5pv();
            c5pv.A00 = threadSummary.A0n;
            c5pv.A01(ImmutableList.of());
            c5pv.A03 = true;
            c5pv.A02 = true;
            messagesCollection = new MessagesCollection(c5pv);
            this.A02 = messagesCollection;
        }
        5Xx r0 = this.A05;
        DataFetchDisposition dataFetchDisposition = this.A01;
        ThreadSummary threadSummary2 = this.A04;
        return new FetchThreadResult(dataFetchDisposition, messagesCollection, this.A03, threadSummary2, r0, this.A06, this.A08, this.A07, this.A09, this.A00, this.A0B, this.A0A);
    }
}
