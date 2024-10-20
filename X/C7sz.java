package X;

import com.facebook.messaging.model.attachment.EphemeralMediaData;
import com.facebook.messaging.model.attachment.EphemeralMediaState;
import com.facebook.messaging.model.messages.Message;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7sz, reason: invalid class name */
/* loaded from: 7sz.class */
public abstract class C7sz {
    public static final EphemeralMediaState A00(Message message) {
        EphemeralMediaData ephemeralMediaData;
        11T.A0F(message, 0);
        EphemeralMediaState ephemeralMediaState = EphemeralMediaState.UNKNOWN;
        ImmutableList immutableList = message.A0r;
        if (immutableList != null && !immutableList.isEmpty() && 4YU.A0T(immutableList, 0).A06 != null && (ephemeralMediaData = 4YU.A0T(immutableList, 0).A06) != null) {
            ephemeralMediaState = ephemeralMediaData.A01;
            11T.A0A(ephemeralMediaState);
        }
        return ephemeralMediaState;
    }

    public static final boolean A01(Message message) {
        ImmutableList immutableList = message.A0r;
        if (immutableList != null && !immutableList.isEmpty() && 4YU.A0T(immutableList, 0).A06 != null) {
            EphemeralMediaData ephemeralMediaData = 4YU.A0T(immutableList, 0).A06;
            if (ephemeralMediaData == null) {
                return false;
            }
            EphemeralMediaState ephemeralMediaState = ephemeralMediaData.A01;
            if (ephemeralMediaState != EphemeralMediaState.REPLAYED && ephemeralMediaState != EphemeralMediaState.EXPIRED && ephemeralMediaState != EphemeralMediaState.UNKNOWN) {
                long j = ephemeralMediaData.A00;
                if (j <= 0 || System.currentTimeMillis() - j <= 86400000) {
                    return false;
                }
            }
        }
        return true;
    }
}
