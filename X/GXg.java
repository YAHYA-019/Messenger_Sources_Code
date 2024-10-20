package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.text.BetterTextView;

/* loaded from: GXg.class */
public final class GXg extends C2lb {
    public final BetterTextView A00;
    public final GlyphView A01;
    public final /* synthetic */ GWe A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.widget.TextView, com.facebook.widget.text.BetterTextView] */
    public GXg(View view, GWe gWe, MigColorScheme migColorScheme) {
        super(view);
        this.A02 = gWe;
        GlyphView glyphView = (GlyphView) C09s.A01(view, 2131363997);
        this.A01 = glyphView;
        ?? r0 = (BetterTextView) C09s.A01(view, 2131367932);
        this.A00 = r0;
        AbH.A1K(view, migColorScheme.AjC());
        glyphView.A00(migColorScheme.B9O());
        AbG.A1J((TextView) r0, migColorScheme);
    }
}
