package com.facebook.messaging.friending.plugins.inboxunit.itemsprocessor;

import X.0rI;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2VJ;
import X.2hB;
import X.C0dp;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* loaded from: PeopleYouMayKnowItemProcessor.class */
public final class PeopleYouMayKnowItemProcessor {
    public final 1Br A00 = 1Bu.A00(66216);
    public final 1Br A01 = 1Bq.A00(82490);
    public final Function1 A02;
    public final C0dp A03;

    public PeopleYouMayKnowItemProcessor() {
        0rI r0 = 0rI.A00;
        11T.A0A(r0);
        this.A03 = r0;
        this.A02 = 2hB.A00;
    }

    public static final long A00(PeopleYouMayKnowItemProcessor peopleYouMayKnowItemProcessor) {
        return peopleYouMayKnowItemProcessor.A03.now() - TimeUnit.DAYS.toMillis(2VJ.A00((2VJ) peopleYouMayKnowItemProcessor.A01.A00.get()).Auy(36606676280024550L));
    }
}
