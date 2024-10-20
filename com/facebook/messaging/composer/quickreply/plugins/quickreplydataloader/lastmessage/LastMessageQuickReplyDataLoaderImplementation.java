package com.facebook.messaging.composer.quickreply.plugins.quickreplydataloader.lastmessage;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.5Q0;
import X.6S0;
import X.AnonymousClass622;
import X.AnonymousClass624;
import X.AnonymousClass626;
import X.C1q7;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* loaded from: LastMessageQuickReplyDataLoaderImplementation.class */
public final class LastMessageQuickReplyDataLoaderImplementation {
    public ListenableFuture A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 6S0 A06;

    public LastMessageQuickReplyDataLoaderImplementation(Context context, 6S0 r303) {
        11T.A0F(context, 1);
        11T.A0F(r303, 2);
        this.A01 = context;
        this.A06 = r303;
        this.A05 = 1Bu.A01(context, 16428);
        this.A02 = 1Bu.A00(66495);
        this.A03 = 1Bu.A01(context, 114785);
        this.A04 = 1Bq.A00(16456);
    }

    public static final AnonymousClass622 A00(List list) {
        AnonymousClass626 anonymousClass626;
        Object obj;
        AnonymousClass622 anonymousClass622 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                AnonymousClass624 anonymousClass624 = (AnonymousClass624) obj;
                if (anonymousClass624 instanceof AnonymousClass622) {
                    Message message = ((AnonymousClass622) anonymousClass624).A03;
                    if (!C1q7.A0E(message) && !5Q0.A06(message)) {
                        break;
                    }
                }
            }
            anonymousClass626 = (AnonymousClass624) obj;
        } else {
            anonymousClass626 = null;
        }
        if (anonymousClass626 instanceof AnonymousClass622) {
            anonymousClass622 = (AnonymousClass622) anonymousClass626;
        }
        return anonymousClass622;
    }
}
