package com.facebook.messaging.dataclasses.threadmetadata;

import X.39Q;
import X.5rO;
import X.AnonymousClass311;
import X.AnonymousClass313;
import X.C23s;
import X.MRr;
import X.MRs;
import X.MRt;
import X.MRu;
import X.MRv;
import X.MRw;
import X.MRx;
import X.N9a;

/* loaded from: ThreadMetadataImpl.class */
public final class ThreadMetadataImpl extends C23s implements ThreadMetadata {
    public ThreadMetadataImpl() {
        super(-1932172617);
    }

    public ThreadMetadataImpl(int i) {
        super(i);
    }

    @Override // com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadata
    public 39Q getMarketplaceTrustSignalData() {
        C23s A05 = A05(5rO.class, "marketplace_trust_signal_data", 8);
        if (A05 != null) {
            return A05.A03(39Q.class);
        }
        return null;
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        AnonymousClass311 anonymousClass311 = AnonymousClass311.A00;
        N9a mRr = new MRr(anonymousClass311);
        N9a mRr2 = new MRr(MRt.A00);
        MRs mRs = MRs.A00;
        N9a mRr3 = new MRr(mRs);
        MRu mRu = MRu.A00;
        return new AnonymousClass313(new N9a[]{mRr, mRr2, mRr3, new MRw(new MRx(new MRv(mRu))), new MRr(mRs), new MRw(new MRx(new MRv(mRu))), new MRw(), new MRr(anonymousClass311), new MRw(), new MRw()});
    }
}
