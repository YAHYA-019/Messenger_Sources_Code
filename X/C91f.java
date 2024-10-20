package X;

import com.facebook.messaging.media.resharehub.model.ReshareHubTabModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.91f, reason: invalid class name */
/* loaded from: 91f.class */
public final class C91f extends C3Yn {
    public int A00;
    public ReshareHubTabModel A01;
    public MigColorScheme A02;
    public C91l A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.91f, X.3Yn] */
    public static C91f create(Jtt jtt, C91l c91l) {
        ?? c3Yn = new C3Yn();
        c3Yn.A03 = c91l;
        c3Yn.A02 = c91l.A02;
        c3Yn.A00 = c91l.A00;
        c3Yn.A01 = c91l.A01;
        return c3Yn;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C3Yn
    public /* bridge */ /* synthetic */ 2Yv A02() {
        return new Object();
    }

    @Override // X.C3Yn
    public void A06(2Yv r302, 2Yv r303) {
        ((C8op) r303).A00 = ((C8op) r302).A00;
    }

    @Override // X.C3Yn
    public boolean A0B() {
        return true;
    }

    @Override // X.C3Yn
    public 1LI A0C(Jtt jtt) {
        C8op c8op = (C8op) super.A01;
        ReshareHubTabModel reshareHubTabModel = this.A01;
        int i = this.A00;
        MigColorScheme migColorScheme = this.A02;
        1BL.A11(1, reshareHubTabModel, migColorScheme, c8op.A00);
        return 9kC.A00(reshareHubTabModel, migColorScheme, jtt, EAE.A00(), i);
    }

    @Override // X.C3Yn
    public /* bridge */ /* synthetic */ 1LI A0D(Jtt jtt, Object obj) {
        EAE eae = (EAE) obj;
        C8op c8op = (C8op) super.A01;
        ReshareHubTabModel reshareHubTabModel = this.A01;
        int i = this.A00;
        MigColorScheme migColorScheme = this.A02;
        C6tg c6tg = c8op.A00;
        7zT.A1T(eae, reshareHubTabModel, migColorScheme);
        11T.A0F(c6tg, 5);
        return 9kC.A00(reshareHubTabModel, migColorScheme, jtt, eae, i);
    }
}
