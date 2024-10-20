package X;

import android.net.Uri;
import java.io.File;
import java.net.URL;

/* loaded from: JO9.class */
public interface JO9 {
    static Hqj A00(JO9 jo9, File file) {
        return jo9.ARj(Uri.fromFile(file));
    }

    Hqj ARj(Uri uri);

    Hqj ARk(URL url);
}
