package com.facebook.messaging.composer.avatar.plugins.stickersuggestions.entrypoint;

import X.11T;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: StickerSuggestionsComposerEntryPointImplementation.class */
public final class StickerSuggestionsComposerEntryPointImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;

    public StickerSuggestionsComposerEntryPointImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(threadKey, 3);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A04 = threadKey;
        this.A02 = 1Bu.A00(66486);
        this.A03 = 1Bu.A00(65808);
    }
}
