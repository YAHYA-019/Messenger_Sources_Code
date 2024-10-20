package com.facebook.messaging.integrity.unsend.plugins.threadviewlifecycle;

import X.11T;
import X.5Q0;
import X.60P;
import X.AnonymousClass622;
import X.AnonymousClass624;
import com.facebook.messaging.model.messages.Message;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: UnsendWarningReceiverThreadViewLifecycle.class */
public final class UnsendWarningReceiverThreadViewLifecycle {
    public static final AnonymousClass622 A00(60P r301, ImmutableList immutableList) {
        AnonymousClass622 anonymousClass622;
        Object obj;
        Iterator it = immutableList.iterator();
        while (true) {
            anonymousClass622 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            AnonymousClass622 anonymousClass6222 = (AnonymousClass624) obj;
            if (anonymousClass6222 instanceof AnonymousClass622) {
                Message message = anonymousClass6222.A03;
                11T.A09(message);
                if (5Q0.A06(message) && !r301.A00(message)) {
                    break;
                }
            }
        }
        if (obj instanceof AnonymousClass622) {
            anonymousClass622 = (AnonymousClass622) obj;
        }
        return anonymousClass622;
    }
}
