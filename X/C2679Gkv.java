package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.facebook.litho.LithoView;

/* renamed from: X.Gkv, reason: case insensitive filesystem */
/* loaded from: Gkv.class */
public final class C2679Gkv extends LithoView {
    public final 1Br A00;
    public final 1Br A01;

    public C2679Gkv(Context context) {
        super(context, (AttributeSet) null);
        this.A01 = 1Bu.A00(49502);
        this.A00 = GOn.A0R(context);
        AbL.A11(((LithoView) this).A09, this);
    }

    public static final String A05(C2679Gkv c2679Gkv, int i) {
        Resources resources;
        int i2;
        if (i == 1) {
            resources = c2679Gkv.getResources();
            i2 = 2131965218;
        } else if (i == 2) {
            resources = c2679Gkv.getResources();
            i2 = 2131965231;
        } else {
            if (i != 3) {
                return null;
            }
            resources = c2679Gkv.getResources();
            i2 = 2131964762;
        }
        return resources.getString(i2);
    }
}
