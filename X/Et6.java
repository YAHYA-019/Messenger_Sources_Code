package X;

import android.content.Context;
import android.text.SpannableString;
import com.facebook.inject.FbInjector;

/* loaded from: Et6.class */
public final class Et6 {
    public 1BY A00;
    public final C00i A01 = FbInjector.A00;

    public Et6(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public SpannableString A00(GF5 gf5, int i) {
        Object A0E = 1Bn.A0E((Context) null, this.A00, 16979);
        C00i c00i = this.A01;
        0Dc r0 = new 0Dc(1BL.A0B(c00i));
        r0.A02(4YU.A0u(1BL.A0B(c00i), 1BL.A0B(c00i).getString(2131952789), i));
        return 7zS.A0B(r0, new DOG(5, gf5, this, A0E), "[[learn_more_link]]", 1BL.A0B(c00i).getString(2131962652));
    }
}
