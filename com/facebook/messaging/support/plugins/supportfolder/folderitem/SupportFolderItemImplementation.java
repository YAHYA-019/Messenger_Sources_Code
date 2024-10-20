package com.facebook.messaging.support.plugins.supportfolder.folderitem;

import X.11T;
import X.1Br;
import X.1Bu;
import X.C4Xo;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: SupportFolderItemImplementation.class */
public final class SupportFolderItemImplementation {
    public final Context A00;
    public final 1Br A01;
    public final C4Xo A02;
    public final AtomicBoolean A03;
    public final AtomicReference A04;

    public SupportFolderItemImplementation(Context context, C4Xo c4Xo) {
        11T.A0F(context, 1);
        11T.A0F(c4Xo, 2);
        this.A00 = context;
        this.A02 = c4Xo;
        this.A01 = 1Bu.A01(context, 81971);
        this.A03 = new AtomicBoolean(false);
        this.A04 = new AtomicReference();
    }
}
