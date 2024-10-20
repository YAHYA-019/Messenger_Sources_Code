package X;

import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: DBm.class */
public final /* synthetic */ class DBm implements C00m {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GroupInviteLinkData A02;
    public final /* synthetic */ ThreadSummary A03;
    public final /* synthetic */ CmN A04;
    public final /* synthetic */ DK4 A05;
    public final /* synthetic */ AcX A06;
    public final /* synthetic */ 5SW A07;

    public /* synthetic */ DBm(GroupInviteLinkData groupInviteLinkData, ThreadSummary threadSummary, CmN cmN, DK4 dk4, AcX acX, 5SW r307, int i, int i2) {
        this.A04 = cmN;
        this.A06 = acX;
        this.A03 = threadSummary;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = r307;
        this.A02 = groupInviteLinkData;
        this.A05 = dk4;
    }

    @Override // X.C00m
    public final Object invoke() {
        CmN cmN = this.A04;
        AcX acX = this.A06;
        ThreadSummary threadSummary = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        5SW r0 = this.A07;
        AcQ.A0I(this.A02, threadSummary, cmN.A06, this.A05, acX, r0, i, i2);
        return null;
    }
}
