package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.platformmetadata.types.persona.MessagePersonaPlatformMetadata;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.665, reason: invalid class name */
/* loaded from: 665.class */
public final class AnonymousClass665 {
    public static String A00(Message message) {
        ImmutableMap immutableMap;
        if (message == null || (immutableMap = message.A15) == null) {
            return null;
        }
        C5qt c5qt = C5qt.A0A;
        if (immutableMap.get(c5qt) == null || ((MessagePersonaPlatformMetadata) immutableMap.get(c5qt)).A00 == null) {
            return null;
        }
        return ((MessagePersonaPlatformMetadata) immutableMap.get(c5qt)).A00.A02;
    }
}
