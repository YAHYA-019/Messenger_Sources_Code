package com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.blockoverflowmenuitem;

import X.06Z;
import X.11T;
import X.1BY;
import X.1Bn;
import X.7EN;
import X.BNT;
import X.BNV;
import X.C1ph;
import X.C7I;
import X.DGC;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: BlockOverflowMenuItemImplementation.class */
public final class BlockOverflowMenuItemImplementation {
    public final User A00;
    public final Context A01;
    public final 06Z A02;
    public final ThreadSummary A03;

    public BlockOverflowMenuItemImplementation(Context context, 06Z r303, ThreadSummary threadSummary, User user) {
        11T.A0F(r303, 3);
        this.A01 = context;
        this.A00 = user;
        this.A02 = r303;
        this.A03 = threadSummary;
    }

    public final C7I A00() {
        int ordinal;
        User user = this.A00;
        return new C7I(BNV.A0L, (user == null || !((ordinal = user.A02().ordinal()) == 2 || ordinal == 1)) ? 2131954861 : 2131954872);
    }

    public final void A01() {
        Context context;
        User user = this.A00;
        if (user == null || (context = this.A01) == null) {
            return;
        }
        ((7EN) 1Bn.A0E(context, (1BY) null, 50188)).A06(this.A02, this.A03, BNT.A0d, (DGC) null, (MigColorScheme) null, (C1ph) null, user);
    }
}
