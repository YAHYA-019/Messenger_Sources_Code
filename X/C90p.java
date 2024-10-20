package X;

import com.facebook.messaging.contactstab.plugins.loader.activenow.ContactsTabActiveNowLoader;

/* renamed from: X.90p, reason: invalid class name */
/* loaded from: 90p.class */
public final class C90p extends 2TO {
    public final int A00;
    public final Object A01;

    public C90p(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A02() {
        switch (this.A00) {
            case 0:
                ((2UV) 1Br.A0B(((C9u2) this.A01).A05)).D1t(1BK.A0d());
                return;
            case 1:
                ((2UV) 1Br.A0B(((ContactsTabActiveNowLoader) this.A01).A01)).D1t(1BK.A0d());
                return;
            default:
                0fH.A0j("HighlightsClassicActiveNowLoader", "::onPresenceChanged");
                C9ka.A00((C9ka) this.A01);
                return;
        }
    }
}
