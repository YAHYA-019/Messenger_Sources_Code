package X;

import com.facebook.messaging.communitymessaging.plugins.communitycontainers.communitycontainerthreadmetadataprovider.CommunityContainerThreadMetadataProviderImplementation;
import com.facebook.messaging.followup.plugins.metadataloader.followup.InboxFollowupsMetadataLoader;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.3d6, reason: invalid class name */
/* loaded from: 3d6.class */
public final class C3d6 implements C2nj {
    public final int A00;
    public final Object A01;

    public C3d6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C2nj
    public AnonymousClass207 Asi() {
        switch (this.A00) {
            case 0:
                return 36X.A01;
            case 1:
                return InboxFollowupsMetadataLoader.A07;
            default:
                return C30d.A0F;
        }
    }

    @Override // X.C2nj
    public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
        switch (this.A00) {
            case 0:
                11T.A0F(threadSummary, 0);
                long A0r = threadSummary.A0n.A0r();
                Number A0o = 1BK.A0o(Long.valueOf(A0r), ((CommunityContainerThreadMetadataProviderImplementation) this.A01).A00);
                if (A0o == null) {
                    return null;
                }
                long longValue = A0o.longValue();
                C1zm c1zm = new C1zm();
                c1zm.A03(ThreadKey.A03(longValue));
                c1zm.A0l = ThreadKey.A07(A0r);
                c1zm.A0g = 1F9.A0B;
                return new 36X(new ThreadSummary(c1zm));
            case 1:
                boolean z = false;
                11T.A0F(threadSummary, 0);
                InboxFollowupsMetadataLoader inboxFollowupsMetadataLoader = (InboxFollowupsMetadataLoader) this.A01;
                AnonymousClass207 anonymousClass207 = InboxFollowupsMetadataLoader.A07;
                java.util.Map map = inboxFollowupsMetadataLoader.A04;
                if (11T.A0O(map.get(C2ik.A03), threadSummary)) {
                    z = true;
                } else if (!11T.A0O(map.get(C2ik.A02), threadSummary)) {
                    return null;
                }
                return new 36V(z);
            default:
                11T.A0F(threadSummary, 0);
                C30d c30d = (C30d) this.A01;
                ThreadKey threadKey = threadSummary.A0n;
                11T.A0A(threadKey);
                if (c30d.A01(threadKey)) {
                    return new 36W();
                }
                return null;
        }
    }
}
