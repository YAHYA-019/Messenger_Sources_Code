package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;

/* renamed from: X.78k, reason: invalid class name */
/* loaded from: 78k.class */
public final class C78k implements 6oP {
    public C6op B0u(Context context, C6on c6on) {
        return null;
    }

    public C6op B7y(Context context, C6on c6on, Integer num) {
        int i;
        int i2;
        1BL.A1F(c6on, num);
        ColorDrawable colorDrawable = num == 0S2.A00 ? new ColorDrawable(context.getColor(2132214336)) : null;
        int ordinal = c6on.ordinal();
        int intValue = num.intValue();
        if (ordinal == 0) {
            i = 2131959760;
            if (intValue == 0) {
                i = 2131959758;
            }
        } else {
            i = 2131959779;
            if (intValue == 0) {
                i = 2131959777;
            }
        }
        String string = context.getString(i);
        if (ordinal == 0) {
            i2 = 2131959761;
            if (intValue == 0) {
                i2 = 2131959759;
            }
        } else {
            i2 = 2131959780;
            if (intValue == 0) {
                i2 = 2131959778;
            }
        }
        return new C6op(colorDrawable, null, null, string, context.getString(i2), null);
    }
}
