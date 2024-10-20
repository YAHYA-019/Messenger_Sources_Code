package X;

import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Gl1, reason: case insensitive filesystem */
/* loaded from: Gl1.class */
public final class C2683Gl1 extends LithoView implements JFq {
    public RE7 A00;
    public Gqo A01;
    public I3a A02;
    public MigColorScheme A03;
    public MigColorScheme A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6 A[ORIG_RETURN, RETURN] */
    @Override // X.JFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2683Gl1.CfQ(X.JDB):void");
    }

    @Override // com.facebook.litho.BaseMountingView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(607109800);
        super.onAttachedToWindow();
        Gqo gqo = this.A01;
        if (gqo == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        gqo.A0Y(this);
        0FI.A0C(32132931, A06);
    }

    @Override // com.facebook.litho.BaseMountingView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(156513493);
        Gqo gqo = this.A01;
        if (gqo == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        gqo.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-1688928152, A06);
    }
}
