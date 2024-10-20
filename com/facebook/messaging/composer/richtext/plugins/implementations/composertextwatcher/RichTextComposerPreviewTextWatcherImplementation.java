package com.facebook.messaging.composer.richtext.plugins.implementations.composertextwatcher;

import X.11T;
import X.1BY;
import X.1Bn;
import X.C2n0;
import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: RichTextComposerPreviewTextWatcherImplementation.class */
public final class RichTextComposerPreviewTextWatcherImplementation {
    public final C2n0 A00;
    public final MigColorScheme A01;

    public RichTextComposerPreviewTextWatcherImplementation(Context context) {
        11T.A0F(context, 1);
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979);
        this.A01 = migColorScheme;
        this.A00 = new C2n0(context, null, null, -1, -1, migColorScheme.BEj(), -1, 1, -1, false, false, false, false, false, false);
    }
}
