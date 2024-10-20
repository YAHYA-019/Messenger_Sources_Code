package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: GXk.class */
public final class GXk extends C2lb {
    public final TextView A00;
    public final GlyphView A01;
    public final GlyphView A02;
    public final /* synthetic */ GWe A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXk(View view, GWe gWe, MigColorScheme migColorScheme) {
        super(view);
        this.A03 = gWe;
        GlyphView glyphView = (GlyphView) C09s.A01(view, 2131363975);
        this.A02 = glyphView;
        TextView A0E = DKF.A0E(view, 2131368067);
        this.A00 = A0E;
        GlyphView glyphView2 = (GlyphView) C09s.A01(view, 2131363049);
        this.A01 = glyphView2;
        glyphView2.setOnClickListener(new IJn(gWe));
        AbH.A1K(view, migColorScheme.AjC());
        glyphView.A00(migColorScheme.B4h());
        AbH.A1M(A0E, migColorScheme);
        glyphView2.A00(migColorScheme.B4h());
    }
}
