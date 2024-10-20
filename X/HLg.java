package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* loaded from: HLg.class */
public abstract class HLg {
    public static I8v A00(Context context, File file, boolean z) {
        Hqj A02 = IFS.A02(context, Uri.fromFile(file).toString(), z);
        if (A02 == null) {
            return null;
        }
        I8v A00 = I8v.A00(A02, I7N.A04, null);
        A00.A01 = (int) A02.A06;
        return A00;
    }
}
