package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9dn, reason: invalid class name */
/* loaded from: 9dn.class */
public abstract class C9dn {
    public static final int A00(Context context, Integer num) {
        11T.A0F(context, 0);
        1Bn.A0A(147827);
        MigColorScheme A0c = 7zR.A0c(context);
        2qR r0 = 6tM.A01;
        return 6zN.A00(A0c).A00(num);
    }

    public static final void A01(TextView textView, Integer num, Integer num2) {
        11T.A0F(textView, 0);
        1Bn.A0A(147827);
        Context A08 = 4YU.A08(textView);
        2KE A00 = 8A1.A00(num);
        float A002 = 7zN.A00(A00);
        Typeface A003 = 2KK.A04(A00).A00(A08);
        MigColorScheme A0c = 7zR.A0c(A08);
        2qR r0 = 6tM.A01;
        int A004 = 6zN.A00(A0c).A00(num2);
        textView.setTypeface(A003);
        textView.setTextSize(A002);
        textView.setTextColor(A004);
    }
}
