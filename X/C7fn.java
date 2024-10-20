package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.7fn, reason: invalid class name */
/* loaded from: 7fn.class */
public final class C7fn extends C1rj {
    public AnonymousClass553 A00;
    public MigColorScheme A01;

    public C7fn() {
        super("AskAnotherQuestionButton");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        AnonymousClass553 anonymousClass553 = this.A00;
        11T.A0H(r302, migColorScheme);
        8Ti A01 = 8oM.A01(r302);
        A01.A2a(r302.A08(2131963428));
        A01.A2Z(migColorScheme);
        A01.A2Y(anonymousClass553);
        8oM A2W = A01.A2W();
        2dD A00 = C2dB.A00(r302);
        A00.A2X(A2W);
        A00.A1H(migColorScheme.AjC());
        A00.A0w(4.0f);
        C6bn.A00(A00);
        return A00.A2W();
    }
}
