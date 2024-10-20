package com.facebook.messaging.communitymessaging.plugins.multireact.messagewrapperdecoration;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.2S4;
import X.5zD;
import X.63D;
import X.AnonymousClass622;
import X.AnonymousClass635;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: MessageMultiReactPillWrapper.class */
public final class MessageMultiReactPillWrapper {
    public final 06Z A00;
    public final FbUserSession A01;
    public final 2S4 A02;
    public final 5zD A03;
    public final 63D A04;
    public final AnonymousClass635 A05;
    public final AnonymousClass622 A06;
    public final Capabilities A07;
    public final Context A08;

    public MessageMultiReactPillWrapper(Context context, 06Z r303, FbUserSession fbUserSession, 2S4 r305, 5zD r306, 63D r307, AnonymousClass635 anonymousClass635, AnonymousClass622 anonymousClass622, Capabilities capabilities) {
        11T.A0F(r306, 4);
        1BL.A1G(anonymousClass635, r307);
        1BK.A1L(r305, 7, r303);
        this.A08 = context;
        this.A07 = capabilities;
        this.A06 = anonymousClass622;
        this.A03 = r306;
        this.A05 = anonymousClass635;
        this.A04 = r307;
        this.A02 = r305;
        this.A00 = r303;
        this.A01 = fbUserSession;
    }
}
