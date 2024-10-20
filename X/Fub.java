package X;

import com.facebook.zero.settings.FlexSettingsActivity;

/* loaded from: Fub.class */
public final class Fub implements GIs {
    public final /* synthetic */ FlexSettingsActivity A00;

    public Fub(FlexSettingsActivity flexSettingsActivity) {
        this.A00 = flexSettingsActivity;
    }

    @Override // X.GIs
    public void C4G() {
        this.A00.finish();
    }

    @Override // X.GIs
    public void C4f(boolean z) {
        AnonymousClass423 anonymousClass423;
        F98 A00;
        if (!z || (A00 = (anonymousClass423 = (AnonymousClass423) this.A00.A00.get()).A00()) == null) {
            return;
        }
        java.util.Map A02 = anonymousClass423.A02();
        A02.put(A00.A02, AnonymousClass002.A0G());
        try {
            String A0W = AnonymousClass243.A00().A0W(A02);
            1Ql A0V = 1BL.A0V(anonymousClass423.A00);
            A0V.CaL(DKC.A0b(DKG.A0w().A05), A0W);
            A0V.commit();
        } catch (2LD e) {
            0fH.A0r("BannerUtils", "Error serializing banner notifications content map", e);
        }
    }
}
