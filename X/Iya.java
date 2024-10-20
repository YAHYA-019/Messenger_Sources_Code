package X;

import com.facebook.video.exoserviceclient.FbVpsController;
import java.io.File;
import java.util.regex.Matcher;

/* loaded from: Iya.class */
public final class Iya implements Runnable {
    public static final String __redex_internal_original_name = "OnBackgroundCleanVideoCacheConditionalWorker$evictStaleCache$1";
    public final /* synthetic */ long A00 = 604800;
    public final /* synthetic */ 4qI A01;

    public Iya(4qI r302) {
        this.A01 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        String str = FbVpsController.A01(this.A01.A01).cache.cacheDirectory;
        synchronized (5Ly.class) {
            File A01 = 5Ly.A01(0S2.A00, str);
            synchronized (5Mh.class) {
                if (A01.exists()) {
                    File[] listFiles = A01.listFiles();
                    if (listFiles != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        j = 0;
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= listFiles.length) {
                                break;
                            }
                            File file = listFiles[i2];
                            if (file.length() > 0) {
                                Matcher matcher = 6Px.A00.matcher(file.getName());
                                if (matcher.matches()) {
                                    File A00 = 6Px.A00(file.getParentFile(), matcher.group(1), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), false);
                                    file.renameTo(A00);
                                    file = A00;
                                }
                                Matcher matcher2 = 6Px.A01.matcher(file.getName());
                                long j2 = 0;
                                if (matcher2.matches()) {
                                    try {
                                        j2 = Long.parseLong(matcher2.group(3));
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                if (currentTimeMillis - j2 > 604800000) {
                                    j += file.length();
                                    file.delete();
                                }
                            }
                            i = i2 + 1;
                        }
                    }
                }
                j = 0;
            }
        }
        0fH.A0d(604800L, Long.valueOf(j), "OnBackgroundCleanVideoCacheConditionalWorker", "Proactively cleared video cache items older than %d seconds, bytesCleared = %d");
    }
}
