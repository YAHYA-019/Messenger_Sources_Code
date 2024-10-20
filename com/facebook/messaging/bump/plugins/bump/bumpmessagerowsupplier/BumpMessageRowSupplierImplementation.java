package com.facebook.messaging.bump.plugins.bump.bumpmessagerowsupplier;

import X.1BL;
import X.60I;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* loaded from: BumpMessageRowSupplierImplementation.class */
public final class BumpMessageRowSupplierImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final Message A02;
    public final 60I A03;

    public BumpMessageRowSupplierImplementation(Context context, FbUserSession fbUserSession, Message message, 60I r305) {
        1BL.A11(2, r305, fbUserSession, context);
        this.A02 = message;
        this.A03 = r305;
        this.A01 = fbUserSession;
        this.A00 = context;
    }
}
