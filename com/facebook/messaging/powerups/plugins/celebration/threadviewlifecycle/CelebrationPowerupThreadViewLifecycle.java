package com.facebook.messaging.powerups.plugins.celebration.threadviewlifecycle;

import X.AnonymousClass622;
import X.AnonymousClass624;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: CelebrationPowerupThreadViewLifecycle.class */
public final class CelebrationPowerupThreadViewLifecycle {
    public static final AnonymousClass622 A00(ImmutableList immutableList) {
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
            if ((anonymousClass6222 instanceof AnonymousClass622) && anonymousClass6222.A0c) {
                break;
            }
        }
        if (obj instanceof AnonymousClass622) {
            anonymousClass622 = (AnonymousClass622) obj;
        }
        return anonymousClass622;
    }
}
