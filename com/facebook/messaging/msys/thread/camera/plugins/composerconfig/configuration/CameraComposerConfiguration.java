package com.facebook.messaging.msys.thread.camera.plugins.composerconfig.configuration;

import X.11T;
import X.1Br;
import X.1Bu;
import X.5oY;
import X.5oZ;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableSet;

/* loaded from: CameraComposerConfiguration.class */
public final class CameraComposerConfiguration {
    public final Context A00;
    public final Fragment A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final 5oY A05;
    public final 5oZ A06;
    public final ImmutableSet A07;

    public CameraComposerConfiguration(Context context, Fragment fragment, ThreadKey threadKey, 5oY r305, 5oZ r306, ImmutableSet immutableSet) {
        11T.A0F(context, 1);
        11T.A0F(fragment, 2);
        11T.A0F(threadKey, 3);
        11T.A0F(immutableSet, 4);
        11T.A0F(r305, 5);
        11T.A0F(r306, 6);
        this.A00 = context;
        this.A01 = fragment;
        this.A04 = threadKey;
        this.A07 = immutableSet;
        this.A05 = r305;
        this.A06 = r306;
        this.A02 = 1Bu.A00(67253);
        this.A03 = 1Bu.A00(66601);
    }
}
