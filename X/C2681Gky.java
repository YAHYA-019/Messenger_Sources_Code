package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* renamed from: X.Gky, reason: case insensitive filesystem */
/* loaded from: Gky.class */
public final class C2681Gky extends LithoView implements JPL {
    public final 1Br A00;
    public final C01i A01;
    public final C01i A02;

    public C2681Gky(Context context) {
        super(context, (AttributeSet) null);
        C03i c03i = C03i.A02;
        this.A02 = J9s.A00(this, c03i, 1);
        this.A01 = C01g.A00(c03i, new AKX(context, this, 31));
        this.A00 = GOn.A0R(context);
        AbL.A11(((LithoView) this).A09, this);
    }

    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        AtA atA = (AtA) jdb;
        11T.A0F(atA, 0);
        FbUserSession fbUserSession = (FbUserSession) this.A02.getValue();
        String A01 = I6F.A01(this);
        A0x(new C1947Axc(fbUserSession, new Hmb(this), atA, 7zQ.A0m(this.A00), A01));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.litho.BaseMountingView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(205695304);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A01);
        0FI.A0C(-1913567699, A06);
    }

    @Override // com.facebook.litho.BaseMountingView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1294592874);
        super.onDetachedFromWindow();
        AbI.A1X(this.A01);
        0FI.A0C(-328405258, A06);
    }
}
