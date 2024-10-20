package X;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: L5n.class */
public abstract class L5n {
    public static File A00(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String A0o = 0Pz.A0o(".font", "-", "-", Process.myPid(), Process.myTid());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 100) {
                return null;
            }
            File A0D = AnonymousClass001.A0D(cacheDir, 0Pz.A0T(A0o, i2));
            if (A0D.createNewFile()) {
                return A0D;
            }
            i = i2 + 1;
        }
    }

    public static MappedByteBuffer A01(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a2, code lost:
    
        if (r305 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(android.content.res.Resources r301, java.io.File r302, int r303) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L5n.A02(android.content.res.Resources, java.io.File, int):boolean");
    }
}
