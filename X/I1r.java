package X;

import android.R;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;

/* loaded from: I1r.class */
public final class I1r {
    public static final ImmutableSet A02 = ImmutableSet.A06("image/tiff", "image/x-photoshop", "image/x-coreldraw", "image/svg+xml", "image/vnd.djvu", "image/nef", "image/webp");
    public 1BY A00;
    public final Context A01 = 7zP.A0J();

    public I1r(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public boolean A00(String str) {
        IGS A00 = IGS.A00(this, 7);
        if (!A02.contains(str.toLowerCase(Locale.US))) {
            return true;
        }
        Context context = this.A01;
        C2121Dea c2121Dea = new C2121Dea(context);
        c2121Dea.A06(2131963251);
        c2121Dea.A0A(1BK.A0v(context, context.getString(2131952789), 2131963250));
        c2121Dea.A0E(A00, R.string.ok);
        c2121Dea.A0C(false);
        c2121Dea.A04();
        return false;
    }
}
