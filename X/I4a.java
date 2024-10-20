package X;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/* loaded from: I4a.class */
public final class I4a {
    public final GzU A00;
    public final File A01;
    public final Hkm A02;

    public I4a(Hkm hkm, File file) {
        this.A01 = file;
        this.A02 = hkm;
        try {
            this.A00 = new C00X(file.getCanonicalPath());
        } catch (IOException e) {
            0fH.A0N(I4a.class, "Error occurred when querying the canonical path of mDir: %s.", e, new Object[]{this.A01.getName()});
            throw AnonymousClass001.A0N("Error occurred when querying the canonical path of TempFileDirectory. This only occurs if the directory path does not exist on device.");
        }
    }

    public static boolean A00(I4a i4a) {
        File file = i4a.A01;
        if (file.exists()) {
            return file.isDirectory() && file.canRead() && file.canWrite();
        }
        if (!file.mkdirs()) {
            0fH.A0B(I4a.class, "Unable to create a directory");
            return false;
        }
        try {
            AnonymousClass001.A0D(file, ".nomedia").createNewFile();
            return true;
        } catch (IOException e) {
            0fH.A0H(I4a.class, "error in temp file manager", e);
            return false;
        }
    }

    public void A01(String str) {
        File[] listFiles = this.A01.listFiles();
        if (listFiles == null) {
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            File file = listFiles[i2];
            if (file.getName().startsWith(str)) {
                this.A02.A00(file);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.FilenameFilter, java.lang.Object] */
    public boolean A02(long j) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        File[] listFiles = this.A01.listFiles((FilenameFilter) new Object());
        if (listFiles == null) {
            return false;
        }
        boolean z = false;
        for (File file : listFiles) {
            if (currentTimeMillis - file.lastModified() >= j) {
                0fH.A07(I4a.class, file.getName(), "Delete file %s");
                i = this.A02.A00(file) ? i + 1 : 0;
            }
            z = true;
        }
        return z;
    }

    public boolean A03(File file) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                return false;
            }
            if (this.A01.getCanonicalFile().equals(parentFile.getCanonicalFile())) {
                return file.exists();
            }
            return false;
        } catch (IOException e) {
            0fH.A0N(I4a.class, "Error occurred when querying the canonical path of mDir: %s and %s file's parent.", e, new Object[]{file.getName(), this.A01.getName()});
            return false;
        }
    }
}
