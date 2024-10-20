package X;

import com.facebook.messaging.contactstab.plugins.loader.activenow.ContactsTabActiveNowLoader;

/* renamed from: X.9w6, reason: invalid class name */
/* loaded from: 9w6.class */
public final class C9w6 implements 2TW {
    public final int A00;
    public final Object A01;

    public C9w6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void CTD() {
        switch (this.A00) {
            case 0:
                ((2UV) 1Br.A0B(((C9u2) this.A01).A05)).D1t(1BK.A0d());
                return;
            case 1:
                ((2UV) 1Br.A0B(((ContactsTabActiveNowLoader) this.A01).A01)).D1t(1BK.A0d());
                return;
            default:
                0fH.A0j("HighlightsClassicActiveNowLoader", "::onUserControlActionSucceeded");
                C9ka.A00((C9ka) this.A01);
                return;
        }
    }
}
