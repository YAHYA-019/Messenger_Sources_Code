package X;

import com.facebook.messaging.communitymessaging.model.MemberActionsState;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Bs5.class */
public final class Bs5 {
    public final MemberActionsState A00;
    public final 1F9 A01;
    public final ThreadSummary A02;
    public final ParcelableSecondaryData A03;

    public Bs5(MemberActionsState memberActionsState, 1F9 r303, ThreadSummary threadSummary, ParcelableSecondaryData parcelableSecondaryData) {
        this.A02 = threadSummary;
        this.A01 = r303;
        this.A03 = parcelableSecondaryData;
        this.A00 = memberActionsState;
    }
}
