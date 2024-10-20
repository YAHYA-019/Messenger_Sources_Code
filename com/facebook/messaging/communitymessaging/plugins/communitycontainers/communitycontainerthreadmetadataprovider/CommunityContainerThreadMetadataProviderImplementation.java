package com.facebook.messaging.communitymessaging.plugins.communitycontainers.communitycontainerthreadmetadataprovider;

import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lo;
import X.1QB;
import X.1Qc;
import X.22I;
import X.2V3;
import X.C3d6;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.communitycontainers.communitycontainerthreadmetadataprovider.CommunityContainerThreadMetadataProviderImplementation;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: CommunityContainerThreadMetadataProviderImplementation.class */
public final class CommunityContainerThreadMetadataProviderImplementation {
    public Map A00;
    public final 22I A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 2V3 A04;
    public final C3d6 A05;
    public final AtomicReference A06;
    public final AtomicReference A07;
    public final Context A08;
    public final FbUserSession A09;

    public CommunityContainerThreadMetadataProviderImplementation(Context context, FbUserSession fbUserSession, 2V3 r304) {
        1BL.A1H(fbUserSession, r304, context);
        this.A09 = fbUserSession;
        this.A04 = r304;
        this.A08 = context;
        this.A01 = (22I) 1Lo.A04(context, fbUserSession, (1BY) null, 33183);
        this.A00 = 1BK.A1C();
        this.A03 = 1Bq.A00(65837);
        this.A02 = 1Bu.A01(context, 65841);
        this.A06 = new AtomicReference(null);
        this.A07 = new AtomicReference(null);
        this.A05 = new C3d6(this, 0);
    }

    public static final void A00(final CommunityContainerThreadMetadataProviderImplementation communityContainerThreadMetadataProviderImplementation, final List list) {
        if (list.isEmpty()) {
            return;
        }
        AtomicReference atomicReference = communityContainerThreadMetadataProviderImplementation.A06;
        1Qc r0 = (1Qc) 1Br.A0B(communityContainerThreadMetadataProviderImplementation.A03);
        1QB r02 = (1QB) 1Br.A0B(communityContainerThreadMetadataProviderImplementation.A02);
        r02.A01 = new Runnable() { // from class: X.3gj
            public static final String __redex_internal_original_name = "CommunityContainerThreadMetadataProviderImplementation$createGetSingleUnreadJoinedCommunityChannelForCommunityObserver$1";

            @Override // java.lang.Runnable
            public final void run() {
                CommunityContainerThreadMetadataProviderImplementation communityContainerThreadMetadataProviderImplementation2 = CommunityContainerThreadMetadataProviderImplementation.this;
                List list2 = list;
                AtomicReference atomicReference2 = communityContainerThreadMetadataProviderImplementation2.A07;
                C2a2 c2a2 = (C2a2) atomicReference2.getAndSet(null);
                if (c2a2 != null) {
                    c2a2.AE0(null);
                }
                atomicReference2.set(2aK.A04(new AJW(list2, communityContainerThreadMetadataProviderImplementation2, null, 31), 2Zy.A01(2Zo.A00())));
            }
        };
        r02.A04("GetSingleUnreadJoinedCommunityChannelForCommunity");
        Future future = (Future) atomicReference.getAndSet(r0.A03(1QB.A00(r02, "DefaultIdle"), "KeepExisting"));
        if (future != null) {
            future.cancel(true);
        }
    }
}
