package com.facebook.messaging.tray.plugins.loader.notes;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: TrayNotesLoaderImpl.class */
public final class TrayNotesLoaderImpl {
    public ImmutableMap A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;

    public TrayNotesLoaderImpl(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A01 = fbUserSession;
        this.A04 = 1Bu.A01(context, 33204);
        this.A03 = 1Lm.A00(context, fbUserSession, 66278);
        this.A02 = 1Bq.A00(66516);
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        11T.A0A(immutableMap);
        this.A00 = immutableMap;
    }
}
