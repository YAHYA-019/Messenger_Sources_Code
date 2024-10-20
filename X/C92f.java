package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomFrameLayout;

/* renamed from: X.92f, reason: invalid class name */
/* loaded from: 92f.class */
public final class C92f extends CustomFrameLayout {
    public MigColorScheme A00;
    public C00m A01;
    public final 1Br A02;
    public final LithoView A03;

    public C92f(Context context) {
        super(context);
        1Br A0f = 7zM.A0f(context);
        this.A02 = A0f;
        this.A00 = 7zQ.A0m(A0f);
        A0U(2132541642);
        this.A03 = (LithoView) C09s.A01(this, 2131362709);
        A00(this);
    }

    public static final void A00(C92f c92f) {
        LithoView lithoView = c92f.A03;
        Resources A0E = 4YU.A0E(lithoView.A09);
        lithoView.A0x(new 8dT(C9py.A03(c92f, ActionId.FUTURE_LISTENERS_COMPLETE), c92f.A00, (CharSequence) null, 2132411116, A0E.getString(2131953284), A0E.getString(2131953281), A0E.getString(2131953282), true));
    }
}
