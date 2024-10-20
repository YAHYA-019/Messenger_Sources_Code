package X;

import android.content.Context;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cit.class */
public final class Cit implements AXi {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 06Z A02;
    public final /* synthetic */ InboxTrackableItem A03;
    public final /* synthetic */ ThreadSummary A04;
    public final /* synthetic */ BLc A05;
    public final /* synthetic */ CHQ A06;
    public final /* synthetic */ String A07;

    public Cit(Context context, 06Z r303, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary, BLc bLc, CHQ chq, String str, long j) {
        this.A06 = chq;
        this.A02 = r303;
        this.A04 = threadSummary;
        this.A01 = context;
        this.A07 = str;
        this.A00 = j;
        this.A03 = inboxTrackableItem;
        this.A05 = bLc;
    }

    @Override // X.AXi
    public void C0a(String str) {
        CHQ chq = this.A06;
        06Z r0 = this.A02;
        ThreadSummary threadSummary = this.A04;
        CHQ.A00(this.A01, r0, this.A03, threadSummary, this.A05, chq, str, this.A07, String.valueOf(this.A00));
    }
}
