package com.facebook.messaging.communitymessaging.plugins.channellist.genaisuggestedchats.itemsupplier;

import X.11T;
import X.1Br;
import X.1Bu;
import X.2Si;
import X.2Sk;
import X.C0ty;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: GenAiSuggestedChatsHeaderItemSupplierImplementation.class */
public final class GenAiSuggestedChatsHeaderItemSupplierImplementation {
    public List A00;
    public final Observer A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 2Si A04;
    public final 2Sk A05;

    public GenAiSuggestedChatsHeaderItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304, 2Sk r305) {
        11T.A0F(r304, 4);
        this.A05 = r305;
        this.A02 = fbUserSession;
        this.A04 = r304;
        this.A03 = 1Bu.A01(context, 67631);
        this.A01 = CaE.A00(this, 62);
        this.A00 = C0ty.A00;
    }
}
