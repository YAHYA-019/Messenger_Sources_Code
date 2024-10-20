package X;

import com.facebook.messenger.app.update.InAppUpdater;

/* loaded from: Ldm.class */
public final class Ldm implements C51o {
    public final /* synthetic */ InAppUpdater A00;

    public Ldm(InAppUpdater inAppUpdater) {
        this.A00 = inAppUpdater;
    }

    @Override // X.C51o
    public final void Bpv(C4Ez c4Ez) {
        11T.A0F(c4Ez, 0);
        if (!c4Ez.A0E()) {
            0fH.A0n("InAppUpdate", "AppUpdateInfo Listener Failed");
            return;
        }
        InterfaceC00051a0 AP5 = C06284gd.A00().AP5();
        AP5.CaG(4YT.A00(871), 1Br.A00(InAppUpdater.A04));
        boolean z = false;
        AP5.Ca2("update_attempted", false);
        AP5.apply();
        InAppUpdater inAppUpdater = this.A00;
        if (((Klu) c4Ez.A05()).A01 == 2) {
            z = true;
        }
        inAppUpdater.A00 = z;
    }
}
