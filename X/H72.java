package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: H72.class */
public final class H72 extends Hub {
    public 1OW A00;
    public C00i A01;
    public 2EU A02;

    public static void A00(2EU r301, H72 h72) {
        BitmapDrawable bitmapDrawable;
        if (AbG.A1a(r301)) {
            h72.A02 = r301;
            Bitmap A04 = AbH.A04(r301);
            Resources resources = ((Hub) h72).A01.getResources();
            if (((Hub) h72).A00 == 0.0f) {
                bitmapDrawable = new BitmapDrawable(resources, A04);
            } else {
                bitmapDrawable = new 5CW(resources, A04, (Paint) null, false);
                bitmapDrawable.Cmv(false);
                bitmapDrawable.Cte(((Hub) h72).A00);
            }
            h72.A03(bitmapDrawable);
        }
    }

    @Override // X.Hub
    public void A02() {
        super.A02();
        2EU.A04(this.A02);
        this.A02 = null;
        1OW r0 = this.A00;
        if (r0 != null) {
            r0.AGD();
        }
    }
}
