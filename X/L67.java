package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.acra.constants.ActionId;
import java.util.ArrayList;
import java.util.List;

/* loaded from: L67.class */
public abstract class L67 {
    /* JADX WARN: Type inference failed for: r0v7, types: [int[], X.GJf] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.Khq, X.KN9] */
    public static final KkM A00(Context context, KN9 kn9, int i) {
        context.getResources();
        if (context.getDrawable(i) == null) {
            return null;
        }
        KN9 kn92 = KN9.A02;
        11T.A0D((Object) 1);
        EY3.A00((Resources) 1, (Drawable) 1, 1);
        ?? r0 = {0};
        ?? khq = new Khq(r0, r0);
        return kn9 == khq ? new KkM((Khq) khq, (KN9) khq) : new KkM((Khq) khq, kn9);
    }

    public static final ArrayList A01(Context context) {
        ArrayList A0s = AnonymousClass001.A0s();
        KkM A00 = A00(context, KN9.A02, 2131230795);
        if (A00 != null) {
            A0s.add(A00);
        }
        KkM A002 = A00(context, KN9.A03, 2131230796);
        if (A002 != null) {
            A0s.add(A002);
        }
        KkM A003 = A00(context, KN9.A04, 2131230797);
        if (A003 != null) {
            A0s.add(A003);
        }
        KkM A004 = A00(context, KN9.A05, 2131230798);
        if (A004 != null) {
            A0s.add(A004);
        }
        KkM A005 = A00(context, KN9.A07, 2131230799);
        if (A005 != null) {
            A0s.add(A005);
        }
        return A0s;
    }

    public static final List A02(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        List<ColorFilter> A14 = C0s8.A14(new PorterDuffColorFilter(Color.rgb(255, 215, 0), mode), new PorterDuffColorFilter(Color.rgb(255, ActionId.CARD_DATA_LOADED, 0), mode), new PorterDuffColorFilter(Color.rgb(255, 0, ActionId.ABORTED), mode), new PorterDuffColorFilter(Color.rgb(211, 0, 197), mode), new PorterDuffColorFilter(Color.rgb(ActionId.RTMP_CONNECTION_FAILED, 56, 250), mode));
        ArrayList A0z = 1BL.A0z(A14);
        for (ColorFilter colorFilter : A14) {
            Paint A0A = DKC.A0A(6);
            A0A.setColorFilter(colorFilter);
            A0A.setAlpha(i);
            A0z.add(A0A);
        }
        return A0z;
    }
}
