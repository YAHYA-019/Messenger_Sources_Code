package X;

import android.content.Context;
import java.io.File;

/* loaded from: Hoh.class */
public final class Hoh {
    public final Context A00;
    public final I7F A01;
    public final String A02;

    public Hoh(Context context, I7F i7f, String str) {
        this.A02 = str;
        this.A00 = context;
        this.A01 = i7f;
    }

    public final File A00(String str) {
        I7F i7f = this.A01;
        if (i7f == null) {
            return null;
        }
        if (str == null) {
            throw 1BK.A0h();
        }
        if (0CV.A0b(str, "content", false)) {
            return null;
        }
        File A0E = AnonymousClass001.A0E(str);
        Context context = this.A00;
        String str2 = this.A02;
        File file = null;
        if (str2.length() != 0 && str.length() != 0) {
            File A00 = RVo.A00(context, str2, str);
            if (IFX.A09(A00)) {
                file = A00;
            }
        }
        if (!IFX.A09(A0E)) {
            return file;
        }
        if (file != null) {
            return null;
        }
        I7F.A00(i7f, new SEO(context, i7f, str, str2));
        return null;
    }
}
