package com.facebook.messaging.media.plugins.mediapicker.composerentrypoint;

import X.06Z;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2S4;
import X.6Qf;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: MediaPickerComposerEntryPointImplementation.class */
public final class MediaPickerComposerEntryPointImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 2S4 A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 6Qf A06;
    public final ThreadKey A07;
    public final Capabilities A08;

    public MediaPickerComposerEntryPointImplementation(Context context, 06Z r303, 2S4 r304, 6Qf r305, ThreadKey threadKey, Capabilities capabilities) {
        11T.A0F(context, 1);
        11T.A0F(r304, 2);
        11T.A0F(r305, 3);
        11T.A0F(threadKey, 4);
        11T.A0F(r303, 5);
        11T.A0F(capabilities, 6);
        this.A00 = context;
        this.A02 = r304;
        this.A06 = r305;
        this.A07 = threadKey;
        this.A01 = r303;
        this.A08 = capabilities;
        this.A05 = 1Bu.A00(85055);
        this.A04 = 1Bq.A00(68025);
        this.A03 = 1Bu.A01(context, 81957);
    }
}
