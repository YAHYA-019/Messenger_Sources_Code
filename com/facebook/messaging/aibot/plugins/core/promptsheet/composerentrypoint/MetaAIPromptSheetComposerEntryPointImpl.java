package com.facebook.messaging.aibot.plugins.core.promptsheet.composerentrypoint;

import X.06Z;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.6Qf;
import X.7zM;
import X.7zT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MetaAIPromptSheetComposerEntryPointImpl.class */
public final class MetaAIPromptSheetComposerEntryPointImpl {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 6Qf A06;
    public final ThreadKey A07;
    public final MigColorScheme A08;

    public MetaAIPromptSheetComposerEntryPointImpl(Context context, 06Z r303, FbUserSession fbUserSession, 6Qf r305, ThreadKey threadKey, MigColorScheme migColorScheme) {
        7zT.A1W(context, r303, fbUserSession, r305);
        1BL.A1G(migColorScheme, threadKey);
        this.A00 = context;
        this.A01 = r303;
        this.A02 = fbUserSession;
        this.A06 = r305;
        this.A08 = migColorScheme;
        this.A07 = threadKey;
        this.A03 = 7zM.A0a();
        this.A04 = 1Bu.A01(context, 68283);
        this.A05 = 1Bu.A00(68258);
    }
}
