package X;

import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.stash.core.FileStash;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

/* loaded from: F50.class */
public final class F50 {
    public final 1BP A01 = FbInjector.A00;
    public final C01i A00 = C01g.A01(SHa.A00);

    public static final SettableFuture A00(F50 f50, String str, int i) {
        SettableFuture A0j = 4YU.A0j();
        C01i c01i = f50.A00;
        File file = ((FileStash) c01i.getValue()).getFile(str);
        if (file != null && file.length() > 0) {
            A0j.set(Uri.fromFile(file));
            return A0j;
        }
        File insertFile = ((FileStash) c01i.getValue()).insertFile(str);
        5Gh drawable = 7zL.A09().getDrawable(i);
        11T.A0I(drawable, "null cannot be cast to non-null type com.facebook.fbui.drawable.NetworkDrawable");
        drawable.A03(new Q67(A0j, insertFile));
        return A0j;
    }
}
