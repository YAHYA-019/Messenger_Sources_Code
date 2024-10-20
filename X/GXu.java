package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: GXu.class */
public final class GXu extends C2lb implements CallerContextable {
    public static final CallerContext A04 = CallerContext.A06(GXu.class);
    public static final C2r9 A05;
    public static final String __redex_internal_original_name = "SwipeableMediaTrayRollCallTileItemViewHolder";
    public HS6 A00;
    public final C06974ih A01;
    public final 2Wo A02;
    public final Context A03;

    static {
        2rA r0 = new 2rA();
        r0.A0A = true;
        r0.A07 = false;
        A05 = new C2r9(r0);
    }

    public GXu(View view, MigColorScheme migColorScheme) {
        super(view);
        Context A08 = 4YU.A08(view);
        this.A03 = A08;
        migColorScheme = migColorScheme == null ? 7zR.A0c(A08) : migColorScheme;
        C1u2 A0I = 4YV.A0I();
        View A01 = C09s.A01(view, 2131367799);
        GOo.A1E((ImageView) C09s.A01(A01, 2131367800), C1u3.A5Y, A0I, migColorScheme.AWT());
        TextView A0E = DKF.A0E(A01, 2131367801);
        A0E.setTextColor(migColorScheme.BKh());
        A0E.setTypeface(Typeface.DEFAULT_BOLD);
        this.A02 = GOq.A0w(A01, 2131367798);
        int dimensionPixelSize = A08.getResources().getDimensionPixelSize(2132279368);
        C02353ux c02353ux = new C02353ux(dimensionPixelSize, dimensionPixelSize, 2048.0f, 0.6666667f);
        C07004ik A00 = C06984ii.A00();
        ((C07014il) A00).A0C = true;
        ((C07014il) A00).A05 = A05;
        ((C07014il) A00).A06 = c02353ux;
        ((C07014il) A00).A09 = new C2592Gib(20, 2.0f, 1291845632);
        this.A01 = new C06974ih(A00);
        IKE.A01(view, this, 69);
        AbH.A1K(A01, migColorScheme.AZe());
    }
}
