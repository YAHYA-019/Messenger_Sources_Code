package X;

import com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow;
import com.facebook.messaging.privacy.plugins.core.mesetting.PrivacyShortcutsSetting;

/* loaded from: CsM.class */
public final class CsM implements C4I3 {
    public final int A00;
    public final Object A01;

    public CsM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C4I3
    public void CSO() {
        (this.A00 != 0 ? ((PrivacyShortcutsSetting) this.A01).A03 : ((EphemeralSecurityAlertsRow) this.A01).A02).D7z();
    }
}
