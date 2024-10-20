package X;

import com.facebook.bloks.messenger.implementations.plugins.core.aisdirectinstalladdlistener.AISDirectInstallAddListenerImplementation;

/* loaded from: Fkp.class */
public final class Fkp implements GFK {
    public final /* synthetic */ AISDirectInstallAddListenerImplementation A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ GJj A02;

    public Fkp(AISDirectInstallAddListenerImplementation aISDirectInstallAddListenerImplementation, FHh fHh, GJj gJj) {
        this.A00 = aISDirectInstallAddListenerImplementation;
        this.A02 = gJj;
        this.A01 = fHh;
    }

    public void CSb(int i, int i2, String str, double d) {
        DKM A00 = DKM.A00();
        A00.A0H(Integer.valueOf(i));
        DKc A06 = DKM.A06(A00, Integer.valueOf((int) d));
        F3e.A00(new SDw(this.A00, this.A01, A06, this.A02));
    }
}
