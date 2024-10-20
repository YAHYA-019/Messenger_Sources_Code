package com.facebook.messaging.translation.plugins.contextmenu;

import X.1BK;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.2Sh;
import X.5zD;
import X.AbH;
import X.AnonymousClass967;
import X.BNO;
import X.C61n;
import X.C61v;
import X.C61x;
import X.C7Pe;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: TranslationContextMenuItemImpl.class */
public final class TranslationContextMenuItemImpl {
    public static final int A07 = BNO.A0p.id;
    public final Context A00;
    public final 1Br A01;
    public final 5zD A02;
    public final Message A03;
    public final ThreadSummary A04;
    public final C61x A05;
    public final 2Sh A06;

    public TranslationContextMenuItemImpl(Context context, 5zD r303, Message message, ThreadSummary threadSummary, 2Sh r306) {
        1BK.A1K(context, 1, r303);
        this.A00 = context;
        this.A03 = message;
        this.A06 = r306;
        this.A02 = r303;
        this.A04 = threadSummary;
        1Bi.A03(66517);
        this.A05 = C61v.A00(message);
        this.A01 = 1Bu.A01(context, 67929);
    }

    public static final AnonymousClass967 A00(TranslationContextMenuItemImpl translationContextMenuItemImpl) {
        C61n c61n;
        2Sh r0 = translationContextMenuItemImpl.A06;
        Object obj = (r0 == null || (c61n = (C61n) AbH.A14(r0, C61n.class)) == null) ? null : c61n.A00;
        if (obj instanceof C7Pe) {
            return (AnonymousClass967) ((C7Pe) obj).A00.get(translationContextMenuItemImpl.A03.A1V);
        }
        return null;
    }
}
