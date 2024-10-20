package com.facebook.messaging.composer.avatar.plugins.stickersuggestions.composertextwatcher;

import X.11T;
import X.6Qb;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: StickerSuggestionsTextWatcherImplementation.class */
public final class StickerSuggestionsTextWatcherImplementation {
    public final Context A00;
    public final LifecycleOwner A01;
    public final FbUserSession A02;
    public final 6Qb A03;

    public StickerSuggestionsTextWatcherImplementation(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 6Qb r305) {
        11T.A0F(fbUserSession, 1);
        11T.A0F(r305, 2);
        11T.A0F(lifecycleOwner, 3);
        11T.A0F(context, 4);
        this.A02 = fbUserSession;
        this.A03 = r305;
        this.A01 = lifecycleOwner;
        this.A00 = context;
    }
}
