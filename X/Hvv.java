package X;

import android.os.StatFs;
import java.io.File;

/* loaded from: Hvv.class */
public final class Hvv {
    public static final void A00(File file, String str, java.util.Map map) {
        if (file == null || !file.exists()) {
            return;
        }
        StatFs statFs = new StatFs(file.getPath());
        map.put(str, new Igp(statFs.getAvailableBytes(), statFs.getFreeBytes(), statFs.getTotalBytes()));
    }
}
