package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;

/* loaded from: C18.class */
public final class C18 {
    public final 1GU A00 = AbI.A0A();

    public void A00(Context context, MenuItem menuItem) {
        this.A00.AAs();
        11T.A0F(context, 0);
        ContextThemeWrapper A06 = 0NA.A06(context, 2130968601, 2132608306);
        int A01 = 0NA.A01(A06, 2130969146, A06.getColor(2132213832));
        menuItem.setIcon((Drawable) 6Q6.A00(A06.getDrawable(2132346832), 0NA.A00(A06), A01));
    }
}
