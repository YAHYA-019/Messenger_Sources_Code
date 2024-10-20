package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3Sl, reason: invalid class name */
/* loaded from: 3Sl.class */
public final class C3Sl {
    public final 1Br A00 = 1BK.A0D();

    public static final 2R5 A00(Integer num, Long l) {
        0DA r0 = new 0DA();
        if (l != null) {
            r0.A06("thread_id", Long.valueOf(l.longValue()));
        }
        0DA r02 = new 0DA();
        r02.A02(r0, "ids");
        r02.A01(2R7.A0K, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (num != null) {
            r02.A06("relative_position", 1BK.A0l(num.intValue()));
        }
        return r02;
    }

    public static final void A01(C98S c98s, 2R5 r302, C3Sl c3Sl, int i, int i2) {
        0DA r306;
        2R2 r0 = new 2R2(1BK.A08(1Br.A02(c3Sl.A00), "messenger_surface_events"), 201);
        if (((0D7) r0).A00.isSampled()) {
            r0.A0C("event", Integer.valueOf(i));
            r0.A0C("surface", 1);
            r0.A0C("unit_type", Integer.valueOf(i2));
            0DA r02 = new 0DA();
            r02.A06("badge_count", 0L);
            r0.A0A(r02, "surface_info");
            r0.A0A(r302, "item_container");
            if (c98s != null) {
                r306 = new 0DA();
                r306.A01(c98s, "target");
            } else {
                r306 = null;
            }
            r0.A0A(r306, "action_info");
            r0.BZL();
        }
    }
}
