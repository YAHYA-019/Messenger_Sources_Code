package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C0b.class */
public final class C0b {
    public final 1Br A00 = AbG.A0N();

    /* JADX WARN: Type inference failed for: r0v53, types: [X.2J3, X.Ag0] */
    public final void A00(FbUserSession fbUserSession, ThreadKey threadKey, Integer num, String str, boolean z) {
        11T.A0F(fbUserSession, 0);
        11T.A0F(threadKey, 2);
        String str2 = ((1G1) fbUserSession).A02;
        C1kw A08 = AbI.A08(this.A00);
        if (C1393Ag0.A00 == null) {
            synchronized (C1393Ag0.class) {
                if (C1393Ag0.A00 == null) {
                    C1393Ag0.A00 = new C2J3(A08);
                }
            }
        }
        AbstractC01593ro A07 = AbF.A07(C1393Ag0.A00, "games_push_notification", false);
        if (A07.A0B()) {
            A07.A06("pigeon_reserved_keyword_module", "messenger_game");
            A07.A06("event", num.intValue() != 0 ? "SETTINGS_UPDATED" : "NOTIFICATION_RECEIVED");
            A07.A06("user_id", str2);
            A07.A05("thread_id", threadKey.A0r());
            A07.A06("user_id", String.valueOf(z));
            A07.A06("game_id", str);
            A07.A0A();
        }
    }
}
