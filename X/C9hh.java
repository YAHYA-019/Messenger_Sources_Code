package X;

import com.facebook.messaging.composer.OneLineComposerView;

/* renamed from: X.9hh, reason: invalid class name */
/* loaded from: 9hh.class */
public final class C9hh {
    public static final 1G2 A03 = 1G3.A01(1G0.A00, "emoji_default_expression");
    public final C00i A01 = 1BQ.A02(33013);
    public final C00i A02 = 1BQ.A02(49412);
    public Boolean A00 = null;

    public void A00(6QZ r302, String str) {
        if (A01()) {
            return;
        }
        if (!"EMOJI".equals(str)) {
            ((C12044yi) this.A02.get()).A05("CONSECUTIVE_EMOJI_SENDS", null);
            return;
        }
        if (((OneLineComposerView) ((6QY) r302).A00).A0q == 0S2.A0C) {
            C00i c00i = this.A02;
            ((C12044yi) c00i.get()).A06("CONSECUTIVE_EMOJI_SENDS", null);
            if (((C12044yi) c00i.get()).A03("CONSECUTIVE_EMOJI_SENDS", null) > 5) {
                1Ql.A01(1BL.A0V(this.A01), A03, true);
                this.A00 = Boolean.TRUE;
            }
        }
    }

    public boolean A01() {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(1BK.A1T(1BK.A0R(this.A01), A03));
            this.A00 = bool;
        }
        return bool.booleanValue();
    }
}
