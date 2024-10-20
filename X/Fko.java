package X;

import com.facebook.bloks.messenger.implementations.plugins.core.aisadddirectinstalllistener.AISAddDirectInstallListenerImplementation;

/* loaded from: Fko.class */
public final class Fko implements GFK {
    public final /* synthetic */ AISAddDirectInstallListenerImplementation A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ GJj A02;

    public Fko(AISAddDirectInstallListenerImplementation aISAddDirectInstallListenerImplementation, FHh fHh, GJj gJj) {
        this.A00 = aISAddDirectInstallListenerImplementation;
        this.A02 = gJj;
        this.A01 = fHh;
    }

    public void CSb(int i, int i2, String str, double d) {
        DKM A00 = DKM.A00();
        A00.A0H(Integer.valueOf(i));
        A00.A0I(Integer.valueOf((int) d));
        DKc A07 = DKM.A07(A00, Integer.valueOf(i2), 2);
        F3e.A00(new SDv(this.A00, this.A01, A07, this.A02));
    }
}
