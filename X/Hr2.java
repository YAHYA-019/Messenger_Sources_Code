package X;

import android.content.Context;

/* loaded from: Hr2.class */
public abstract class Hr2 {
    public static final Hr2 A00 = GOn.A10(0);

    public final int A00(Context context) {
        if (this instanceof GzB) {
            return ((GzB) this).A00;
        }
        if (this instanceof GzA) {
            return context.getResources().getDimensionPixelSize(((GzA) this).A00);
        }
        if (!(this instanceof GzC)) {
            throw 1BK.A1F();
        }
        GzC gzC = (GzC) this;
        return gzC.A00.A00(context) + gzC.A01.A00(context);
    }

    public String toString() {
        StringBuilder A0k;
        int i;
        if (this instanceof GzB) {
            A0k = AnonymousClass001.A0k();
            A0k.append("Raw: ");
            i = ((GzB) this).A00;
        } else {
            if (!(this instanceof GzA)) {
                if (!(this instanceof GzC)) {
                    throw 1BK.A1F();
                }
                A0k = AnonymousClass001.A0k();
                GzC gzC = (GzC) this;
                A0k.append(gzC.A00);
                A0k.append(" + ");
                A0k.append(gzC.A01);
                return A0k.toString();
            }
            A0k = AnonymousClass001.A0k();
            A0k.append("Dimen: (res) ");
            i = ((GzA) this).A00;
        }
        A0k.append(i);
        return A0k.toString();
    }
}
