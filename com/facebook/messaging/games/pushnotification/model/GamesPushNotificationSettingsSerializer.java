package com.facebook.messaging.games.pushnotification.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: GamesPushNotificationSettingsSerializer.class */
public class GamesPushNotificationSettingsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), GamesPushNotificationSettings.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        GamesPushNotificationSettings gamesPushNotificationSettings = (GamesPushNotificationSettings) obj;
        if (gamesPushNotificationSettings == null) {
            r302.A0Z();
        }
        r302.A0b();
        long j = gamesPushNotificationSettings.muteUntilSeconds;
        r302.A0o("mute_until_seconds");
        r302.A0g(j);
        AbstractC11224vw.A06(r302, c26c, "push_notification_states", gamesPushNotificationSettings.pushNotificationStates);
        r302.A0Y();
    }
}
