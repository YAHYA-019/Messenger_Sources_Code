package com.facebook.messaging.communitymessaging.plugins.threadview.pinnedmessagescountsecondarydata;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.6iB;
import X.9W3;
import X.C9qq;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PinnedMessagesCountSecondaryDataImplementation.class */
public final class PinnedMessagesCountSecondaryDataImplementation {
    public final LiveData A00;
    public final Observer A01;
    public final 1Br A02;
    public final 6iB A03;
    public final Context A04;
    public final FbUserSession A05;
    public final ThreadKey A06;
    public final 9W3 A07;

    public PinnedMessagesCountSecondaryDataImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        1BL.A11(1, context, fbUserSession, r305);
        this.A04 = context;
        this.A06 = threadKey;
        this.A05 = fbUserSession;
        this.A03 = r305;
        1Br A00 = 1Bu.A00(68601);
        this.A02 = A00;
        1Br.A0C(A00);
        9W3 r0 = new 9W3(context, fbUserSession, threadKey, (String) null);
        this.A07 = r0;
        this.A00 = Transformations.distinctUntilChanged(r0.A04);
        this.A01 = new C9qq(this, 13);
    }
}
