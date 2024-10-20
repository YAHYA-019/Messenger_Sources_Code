package X;

import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.List;

/* loaded from: Hhs.class */
public final class Hhs {
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public Hhs(List list, int i) {
        Uri uri;
        String str = "image/*";
        if (i != 2) {
            str = "video/*";
            if (i != 3) {
                this.A02 = Environment.DIRECTORY_DOWNLOADS;
                this.A00 = Build.VERSION.SDK_INT >= 29 ? MediaStore.Downloads.getContentUri("external_primary") : Uri.EMPTY;
                this.A03 = list;
            }
            this.A02 = Environment.DIRECTORY_MOVIES;
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            this.A02 = Environment.DIRECTORY_PICTURES;
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        this.A00 = uri;
        this.A01 = str;
        this.A04 = true;
        this.A03 = list;
    }
}
