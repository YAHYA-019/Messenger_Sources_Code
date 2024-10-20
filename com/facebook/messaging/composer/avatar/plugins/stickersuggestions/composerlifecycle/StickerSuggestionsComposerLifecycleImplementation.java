package com.facebook.messaging.composer.avatar.plugins.stickersuggestions.composerlifecycle;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.6Qf;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: StickerSuggestionsComposerLifecycleImplementation.class */
public final class StickerSuggestionsComposerLifecycleImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 6Qf A03;
    public final LifecycleOwner A04;
    public final FbUserSession A05;

    public StickerSuggestionsComposerLifecycleImplementation(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 6Qf r305) {
        11T.A0F(r305, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(lifecycleOwner, 3);
        11T.A0F(context, 4);
        this.A03 = r305;
        this.A05 = fbUserSession;
        this.A04 = lifecycleOwner;
        this.A00 = context;
        this.A02 = 1Bu.A00(66486);
        this.A01 = 1Lm.A00(context, fbUserSession, 65809);
    }
}
