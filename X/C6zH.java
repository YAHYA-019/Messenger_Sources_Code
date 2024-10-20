package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.camera.plugins.composerconfig.configuration.CameraComposerConfiguration;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.6zH, reason: invalid class name */
/* loaded from: 6zH.class */
public final class C6zH {
    public CameraComposerConfiguration A00;
    public Object A01;
    public final Context A02;
    public final Fragment A03;
    public final ThreadKey A04;
    public final 5oY A05;
    public final 1YC A06 = 1YC.A03;
    public final 5oZ A07;
    public final ImmutableSet A08;

    public C6zH(Context context, Fragment fragment, ThreadKey threadKey, 5oY r305, 5oZ r306, ImmutableSet immutableSet) {
        this.A02 = context;
        this.A03 = fragment;
        this.A04 = threadKey;
        this.A08 = immutableSet;
        this.A05 = r305;
        this.A07 = r306;
    }
}
