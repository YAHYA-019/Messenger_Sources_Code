package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import android.content.Context;
import android.net.LocalSocket;
import android.os.Process;
import com.facebook.acra.util.JavaProcFileReader;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.zip.ZipFile;

/* loaded from: Fs.class */
public final class Fs {
    public static boolean isKernelPageCacheFlushIsBroken;
    public static File sDalvikCacheDirectory;

    public static void deleteRecursive(File file) {
        DalvikInternals.deleteRecursive(file.getAbsolutePath());
    }

    public static void deleteRecursiveNoThrow(File file) {
        if (file != null) {
            try {
                deleteRecursive(file);
            } catch (Exception e) {
                Mlog.w(e, "error deleting %s", file);
            }
        }
    }

    public static File dexOptGenerateCacheFileName(File file, File file2, String str) {
        String absolutePath = file2.getAbsolutePath();
        if (str != null) {
            absolutePath = 0Pz.A0j(absolutePath, "@", str);
        }
        return AnonymousClass001.A0D(file, absolutePath.substring(1).replace("/", "@"));
    }

    public static long discardFromInputStream(InputStream inputStream, long j) {
        long j2;
        int read;
        byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
        long j3 = 0;
        while (true) {
            j2 = j3;
            if (j2 >= j || (read = inputStream.read(bArr, 0, (int) Math.min(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED, j - j2))) == -1) {
                break;
            }
            j3 = j2 + read;
        }
        return j2;
    }

    public static String extensions(String str) {
        int indexOf = str.indexOf(46);
        if (indexOf == -1) {
            return null;
        }
        return str.substring(indexOf);
    }

    public static File findSystemDalvikCache() {
        File file = sDalvikCacheDirectory;
        if (file == null) {
            String lowerCase = System.getProperty("os.arch").toLowerCase();
            String str = "arm";
            if (!lowerCase.startsWith(str)) {
                if (!lowerCase.startsWith("x86") && (!lowerCase.startsWith("i") || !lowerCase.endsWith("86"))) {
                    throw 0Pz.A08("unknown arch: ", lowerCase);
                }
                str = "x86";
            }
            String str2 = System.getenv("ANDROID_DATA");
            if (str2 == null) {
                str2 = "/data";
            }
            String format = String.format("%s/dalvik-cache/%s", str2, str);
            if (!AnonymousClass001.A0E(format).isDirectory()) {
                format = String.format("%s/dalvik-cache", str2);
            }
            file = AnonymousClass001.A0E(format);
            sDalvikCacheDirectory = file;
        }
        return file;
    }

    public static void fsyncRecursive(File file, Prio prio) {
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                fsyncRecursive(file2, prio);
            }
        }
        if (file.exists()) {
            DalvikInternals.fsyncNamed(file.getAbsolutePath(), prio.ioPriority);
        }
    }

    public static String lastExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(lastIndexOf);
    }

    public static void link(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 0);
    }

    public static void linkAtomic(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 2);
    }

    public static File makeDataFile(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir, str);
    }

    public static void mkdirOrThrow(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw AnonymousClass001.A0G(AnonymousClass001.A0Z(file, "cannot mkdir: ", AnonymousClass001.A0k()));
        }
    }

    public static RandomAccessFile openDataSyncedFile(File file) {
        int openUnixSyncReadWriteFd = DalvikInternals.openUnixSyncReadWriteFd(file.getAbsolutePath());
        try {
            StringBuilder A1D = 0Pz.A1D("/proc/self/task/", JavaProcFileReader.FD_DIR_STRING, Process.myTid());
            A1D.append(openUnixSyncReadWriteFd);
            return new RandomAccessFile(A1D.toString(), "rw");
        } finally {
            DalvikInternals.closeUnixFd(openUnixSyncReadWriteFd);
        }
    }

    public static RandomAccessFile openUnlinkedTemporaryFile(File file) {
        File createTempFile = File.createTempFile("dextricks", ".tmp", file);
        RandomAccessFile A0I = AnonymousClass001.A0I(createTempFile);
        if (createTempFile.delete()) {
            return A0I;
        }
        A0I.close();
        throw AnonymousClass001.A0G(AnonymousClass001.A0Z(createTempFile, "could not unlink ", AnonymousClass001.A0k()));
    }

    public static String readProgramOutputFile(RandomAccessFile randomAccessFile) {
        randomAccessFile.seek(0L);
        byte[] bArr = new byte[(int) Math.min(randomAccessFile.length(), 131072L)];
        randomAccessFile.read(bArr);
        String obj = Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.REPLACE).replaceWith("?").decode(ByteBuffer.wrap(bArr)).toString();
        if (obj.startsWith("WARNING: linker: ")) {
            int indexOf = obj.indexOf(10);
            if (indexOf == -1) {
                indexOf = obj.length() - 1;
            }
            obj = AnonymousClass001.A0W(indexOf, obj);
        }
        return obj;
    }

    public static void renameOrThrow(File file, File file2) {
        if (!file.exists()) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Cannot rename ");
            A0k.append(file);
            throw AnonymousClass001.A0G(AnonymousClass001.A0d(" because it doesn't exist", A0k));
        }
        if (file.renameTo(file2)) {
            return;
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("rename of ");
        A0k2.append(file);
        A0k2.append(" to ");
        A0k2.append(file2);
        throw AnonymousClass001.A0G(AnonymousClass001.A0d(" failed", A0k2));
    }

    public static RuntimeException runtimeExFrom(Throwable th) {
        return th == null ? AnonymousClass001.A0T("missing exception object") : th instanceof RuntimeException ? (RuntimeException) th : AnonymousClass001.A0U(th);
    }

    public static void safeClose(LocalSocket localSocket) {
        if (localSocket != null) {
            try {
                localSocket.close();
            } catch (Exception e) {
                Mlog.w(e, "error closing %s", localSocket);
            }
        }
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Mlog.w(e, "error closing %s", closeable);
            }
        }
    }

    public static void safeClose(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Exception e) {
                Mlog.w(e, "error closing %s", zipFile);
            }
        }
    }

    public static String stripExtensions(String str) {
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            str = AnonymousClass001.A0c(str, indexOf);
        }
        return str;
    }

    public static String stripLastExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = AnonymousClass001.A0c(str, lastIndexOf);
        }
        return str;
    }

    public static void symlink(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 1);
    }

    public static void tryDiscardPageCache(int i) {
        if (isKernelPageCacheFlushIsBroken) {
            return;
        }
        try {
            DalvikInternals.fadvise(i, 0L, 2147483647L, 4);
        } catch (Exception e) {
            Mlog.w(e, "failed to fadvise", AnonymousClass001.A1Z());
            isKernelPageCacheFlushIsBroken = true;
        }
    }
}
