package com.facebook.messaging.msys.thread.wellbeing.plugins.warningcard.processor;

import X.11T;
import X.1Bn;
import X.C5ja;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: WarningCardProcessorMetadataFactoryImplementation.class */
public final class WarningCardProcessorMetadataFactoryImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadKey A02;
    public final C5ja A03;

    public WarningCardProcessorMetadataFactoryImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = threadKey;
        this.A03 = (C5ja) 1Bn.A0A(67840);
    }
}
