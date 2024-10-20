package X;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;

/* loaded from: Igt.class */
public final class Igt implements 4rQ {
    public final Context A00;
    public final java.util.Map A01;

    public Igt(Context context, java.util.Map map) {
        this.A00 = context;
        this.A01 = map;
    }

    public static void A00(File file, java.util.Map map) {
        String absolutePath;
        try {
            absolutePath = file.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = file.getAbsolutePath();
        }
        StatFs statFs = new StatFs(absolutePath);
        map.put("block_size", Long.valueOf(statFs.getBlockSizeLong()));
        map.put("block_count", Long.valueOf(statFs.getBlockCountLong()));
        map.put("total_bytes", Long.valueOf(statFs.getTotalBytes()));
        map.put("available_bytes", Long.valueOf(statFs.getAvailableBytes()));
        map.put("available_blocks", Long.valueOf(statFs.getAvailableBlocksLong()));
    }

    public String BXf() {
        return "volumes";
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f1, code lost:
    
        if (r0 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x021b, code lost:
    
        if (r0 != false) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap CZY() {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Igt.CZY():java.util.HashMap");
    }
}
