package com.facebook.messaging.publicchats.plugins.suggestedpublicchannels.itemsupplier;

import X.1BL;
import X.2Si;
import X.3OC;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: SuggestedPublicChannelsItemSupplierImplementation.class */
public final class SuggestedPublicChannelsItemSupplierImplementation extends 3OC {
    public final Context A00;
    public final 2Si A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedPublicChannelsItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304) {
        super(context, fbUserSession, r304);
        1BL.A1H(fbUserSession, r304, context);
        this.A01 = r304;
        this.A00 = context;
    }
}
