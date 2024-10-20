package X;

import com.facebook.messaging.communitymessaging.communitynotificationsettings.threadsummary.model.CommunityMutedMetadata;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.2nn, reason: invalid class name */
/* loaded from: 2nn.class */
public final class C2nn implements C2nj {
    public final 1Br A00;
    public final 1De A01;
    public final AnonymousClass207 A02 = C2no.A03;

    public C2nn(1De r302) {
        this.A01 = r302;
        this.A00 = 1Bu.A03(r302.A00, 17010);
    }

    @Override // X.C2nj
    public AnonymousClass207 Asi() {
        return this.A02;
    }

    @Override // X.C2nj
    public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
        CommunityMutedMetadata communityMutedMetadata;
        11T.A0F(threadSummary, 0);
        C00i c00i = this.A00.A00;
        boolean A0E = ((2Ph) c00i.get()).A0E(threadSummary);
        boolean A0D = ((2Ph) c00i.get()).A0D(threadSummary);
        boolean z = true;
        if (!2Gt.A0B(threadSummary) || ((communityMutedMetadata = (CommunityMutedMetadata) threadSummary.AxS().A00(CommunityMutedMetadata.A01)) != null && communityMutedMetadata.A00 == 0)) {
            z = false;
        }
        if (A0E || A0D || z) {
            return new C2no(A0E, A0D, z);
        }
        return null;
    }
}
