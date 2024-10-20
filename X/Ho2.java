package X;

import android.net.Uri;
import com.facebook.stickers.model.Sticker;

/* loaded from: Ho2.class */
public final class Ho2 {
    public final 69I A00 = (69I) 1Bn.A0A(49970);
    public final C00i A01 = 1BV.A00(68026);

    public String A00(Sticker sticker) {
        69I r0 = this.A00;
        if (r0.A04(sticker) != null) {
            C00i c00i = this.A01;
            if (GOp.A0l(c00i).AZk(36322409573271025L) || GOp.A0l(c00i).AZk(36322409573336562L)) {
                return "lottie";
            }
        }
        Uri uri = sticker.A01;
        if ((69I.A01(uri) && uri != null) || r0.A03(sticker) != null) {
            return "webp";
        }
        if (r0.A07(sticker) == null && r0.A08(sticker) == null) {
            return null;
        }
        return "png";
    }
}
