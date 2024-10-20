package X;

import android.os.Bundle;

/* loaded from: Fps.class */
public final class Fps implements GNf {
    public final /* synthetic */ Bundle A00;

    public Fps(Bundle bundle) {
        this.A00 = bundle;
    }

    @Override // X.GNf
    public String AfO() {
        return this.A00.getString("sandboxCtaButtonString");
    }

    @Override // X.GNf
    public String AfP() {
        return this.A00.getString("sandboxCtaRedirectUrl");
    }

    @Override // X.GNf
    public String B4t() {
        return this.A00.getString("sandboxPrivacyAudienceString");
    }
}
