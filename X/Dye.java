package X;

import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Dye.class */
public final class Dye extends C1rj {
    public 2JX A00;
    public EiM A01;
    public Edm A02;
    public MigColorScheme A03;
    public ImmutableList A04;
    public ImmutableList A05;
    public boolean A06;

    public Dye() {
        super("FxImAvatarSettingLayout");
    }

    public static boolean A00(ImmutableList immutableList) {
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            if (!1JF.A0B(((AccountProfileModel) it.next()).A0D)) {
                return true;
            }
        }
        return false;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A03, this.A02, this.A00, this.A05, this.A01, Boolean.valueOf(this.A06)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x016c, code lost:
    
        if (A00(r0) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x016f, code lost:
    
        r0 = new X.9hR();
        r317 = 1482912623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0186, code lost:
    
        if (A00(r0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0189, code lost:
    
        r317 = -605447903;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x018d, code lost:
    
        r0.A05 = X.DKG.A18(r0, r317);
        r0.A03 = X.EL0.A02;
        r0.A00 = new X.Fjz(r0, 6);
        r0.m11011add((java.lang.Object) X.CJM.A00(r0.A01(), r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01d4, code lost:
    
        r0.A2Y(r0.build());
        r0.A0R();
        r0.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01f5, code lost:
    
        return X.7zL.A0V(r0, r0.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0160, code lost:
    
        if (r0 == false) goto L23;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dye.A0y(X.1Iw):X.1LI");
    }
}
