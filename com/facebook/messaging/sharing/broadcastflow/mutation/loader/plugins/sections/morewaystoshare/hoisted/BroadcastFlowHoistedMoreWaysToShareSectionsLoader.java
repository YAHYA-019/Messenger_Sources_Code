package com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.morewaystoshare.hoisted;

import X.0fH;
import X.7zT;
import X.AbL;
import X.C6r;
import X.CLz;
import X.Cst;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: BroadcastFlowHoistedMoreWaysToShareSectionsLoader.class */
public final class BroadcastFlowHoistedMoreWaysToShareSectionsLoader {
    public final C6r A00;
    public final ImmutableList.Builder A01;
    public final ListenableFuture A02;
    public final ListenableFuture A03;

    public BroadcastFlowHoistedMoreWaysToShareSectionsLoader(C6r c6r, ImmutableList.Builder builder, ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        7zT.A1W(listenableFuture, listenableFuture2, builder, c6r);
        this.A02 = listenableFuture;
        this.A03 = listenableFuture2;
        this.A01 = builder;
        this.A00 = c6r;
    }

    public final void A00() {
        try {
            ImmutableList.Builder builder = ImmutableList.builder();
            if (AbL.A1a(this.A02)) {
                builder.m11011add(new Object());
            }
            if (AbL.A1a(this.A03)) {
                builder.m11011add(new Object());
            }
            CLz cLz = new CLz(new Cst("", null, null), builder.build(), "more_ways_to_share");
            ImmutableList.Builder builder2 = this.A01;
            builder2.m11011add((Object) cLz);
            this.A00.A00(builder2.build());
        } catch (Exception e) {
            0fH.A0w("BroadcastFlowHoistedMoreWaysToShareSectionsLoader", "BroadcastFlowSectionsLoader failure", e);
            this.A00.A01(e);
        }
    }
}
