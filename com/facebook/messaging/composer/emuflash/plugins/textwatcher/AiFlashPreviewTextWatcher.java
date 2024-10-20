package com.facebook.messaging.composer.emuflash.plugins.textwatcher;

import X.11T;
import X.1Bq;
import X.1Br;
import X.2S4;
import X.6Qb;
import X.7zT;
import X.Hig;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AiFlashPreviewTextWatcher.class */
public final class AiFlashPreviewTextWatcher {
    public final Context A00;
    public final LifecycleOwner A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final Hig A04;
    public final 6Qb A05;
    public final 2S4 A06;

    public AiFlashPreviewTextWatcher(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 2S4 r305, 6Qb r306) {
        7zT.A1W(r306, lifecycleOwner, fbUserSession, r305);
        11T.A0F(context, 5);
        this.A05 = r306;
        this.A01 = lifecycleOwner;
        this.A02 = fbUserSession;
        this.A06 = r305;
        this.A00 = context;
        this.A03 = 1Bq.A00(66409);
        this.A04 = (Hig) r305.A00(115762);
    }
}
