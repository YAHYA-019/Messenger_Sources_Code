package X;

import android.content.Context;
import android.view.View;
import com.facebook.fbui.widget.glyph.GlyphButton;

/* renamed from: X.Apa, reason: case insensitive filesystem */
/* loaded from: Apa.class */
public final class C1669Apa extends GlyphButton {
    public int A00;
    public int A01;
    public AfB A02;
    public Bjz A03;
    public boolean A04;
    public final View.OnClickListener A05;

    public C1669Apa(Context context) {
        super(context);
        this.A05 = CZD.A00(this, 10);
    }

    public static void A00(C1669Apa c1669Apa) {
        Context context = c1669Apa.getContext();
        int i = 2131962945;
        if (c1669Apa.A04) {
            i = 2131962944;
        }
        c1669Apa.setContentDescription(context.getString(i));
    }

    public static void A01(C1669Apa c1669Apa) {
        c1669Apa.A02(c1669Apa.A04 ? c1669Apa.A00 : c1669Apa.A01);
    }
}
