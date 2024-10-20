package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.0cV;
import X.AnonymousClass001;
import X.C0il;
import android.text.TextUtils;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: DexOptRunner.class */
public class DexOptRunner {
    public final ProcessBuilder mTemplate;
    public final File mTmpDir;
    public File mTmpFbDexOpt;

    /* loaded from: DexOptRunner$DexOptException.class */
    public class DexOptException extends RuntimeException {
        public final String errout;
        public final int status;

        public DexOptException(int i, String str) {
            super(0Pz.A0z("dexopt failed with status ", Process.describeStatus(i), ": [", str, "]"));
            this.status = i;
            this.errout = str;
        }
    }

    public DexOptRunner(File file) {
        this.mTmpFbDexOpt = null;
        this.mTmpDir = file;
        File A01 = C0il.A01("fbdexopt");
        if (!A01.canExecute()) {
            File createTempFile = File.createTempFile("fbdexopt", null, file);
            this.mTmpFbDexOpt = createTempFile;
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                FileInputStream A0F = AnonymousClass001.A0F(A01);
                try {
                    0cV.A04(A0F, fileOutputStream, (-1) >>> 1);
                    fileOutputStream.flush();
                    A0F.close();
                    fileOutputStream.close();
                    createTempFile.setExecutable(true, true);
                    A01 = createTempFile;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    throw th;
                } finally {
                    0Ug.A00(th, th);
                }
            }
        }
        ProcessBuilder processBuilder = new ProcessBuilder(A01.getAbsolutePath(), new String[0]);
        processBuilder.setenv("LD_LIBRARY_PATH", C0il.A02());
        processBuilder.mTmpDir = file;
        this.mTemplate = processBuilder;
    }

    public void addDexOptOptions(ProcessBuilder processBuilder) {
    }

    public boolean attemptAllocate(int i, long j) {
        return DalvikInternals.attemptAllocate(i, j, -1);
    }

    public void cleanup() {
        if (this.mTmpFbDexOpt != null) {
            try {
                AnonymousClass001.A1C("Cleaning up temporary fbdexopt");
                Fs.deleteRecursive(this.mTmpFbDexOpt);
            } catch (IOException unused) {
                Mlog.w("Unable to delete temporary fbdexopt", new Object[0]);
            }
        }
    }

    public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
        int i2 = (-1) >>> 1;
        int i3 = 0;
        do {
            int A06 = 0cV.A06(inputStream, bArr, i2 - i3);
            if (A06 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, A06);
            i3 += A06;
        } while (i3 < i2);
        return i3;
    }

    public final void run(InputStream inputStream, int i, String str, RandomAccessFile randomAccessFile, String str2, String[] strArr) {
        int exitValueEx;
        Object[] objArr;
        String str3;
        Mlog.assertThat(AnonymousClass001.A1O((randomAccessFile.getFilePointer() > 0L ? 1 : (randomAccessFile.getFilePointer() == 0L ? 0 : -1))), "odex fpos must be 0", new Object[0]);
        Mlog.assertThat(AnonymousClass001.A1O((randomAccessFile.length() > 0L ? 1 : (randomAccessFile.length() == 0L ? 0 : -1))), "odex must be empty", new Object[0]);
        int fileno = Fd.fileno(randomAccessFile.getFD());
        DalvikInternals.dexOptCreateEmptyHeader(fileno);
        int filePointer = (int) randomAccessFile.getFilePointer();
        if (i > 1) {
            if (DalvikInternals.attemptAllocate(fileno, randomAccessFile.getFilePointer() + i, -1)) {
                objArr = AnonymousClass001.A1a(i);
                str3 = "allocated more %s bytes for dex content";
            } else {
                objArr = new Object[0];
                str3 = "unable to preallocate on this system";
            }
            Mlog.v(str3, objArr);
        }
        int copyDexToOdex = copyDexToOdex(inputStream, i, randomAccessFile);
        if (copyDexToOdex == ((-1) >>> 1)) {
            throw 0Pz.A05("refusing to deal with impossibly huge dex file ", str);
        }
        Mlog.v("wrote %s bytes to dex %s", Integer.valueOf(copyDexToOdex), str);
        RandomAccessFile openUnlinkedTemporaryFile = Fs.openUnlinkedTemporaryFile(this.mTmpDir);
        try {
            ProcessBuilder m6091clone = this.mTemplate.m6091clone();
            int fileno2 = Fd.fileno(openUnlinkedTemporaryFile.getFD());
            int[] iArr = m6091clone.mStreamDispositions;
            iArr[1] = fileno2;
            iArr[2] = -5;
            m6091clone.mKeepFds.set(fileno);
            addDexOptOptions(m6091clone);
            String num = Integer.toString(fileno);
            String num2 = Integer.toString(0);
            m6091clone.addArguments("--", num, str, num2, num2, System.getenv("BOOTCLASSPATH"), strArr == null ? "" : TextUtils.join(":", strArr), Long.toString(filePointer), Long.toString(copyDexToOdex), str2);
            Process startSubprocess = startSubprocess(m6091clone);
            try {
                waitForDexOpt(startSubprocess, fileno);
                exitValueEx = startSubprocess.exitValueEx();
                startSubprocess.destroy();
            } catch (Throwable th) {
                th = th;
                startSubprocess.destroy();
            }
            if (exitValueEx == 0) {
                openUnlinkedTemporaryFile.close();
            } else {
                new DexOptException(exitValueEx, Fs.readProgramOutputFile(openUnlinkedTemporaryFile));
                throw th;
            }
        } catch (Throwable th2) {
            try {
                openUnlinkedTemporaryFile.close();
                throw th2;
            } catch (Throwable th3) {
                0Ug.A00(th2, th3);
                throw th2;
            }
        }
    }

    public Process startSubprocess(ProcessBuilder processBuilder) {
        return processBuilder.create();
    }

    public void waitForDexOpt(Process process, int i) {
        process.waitForUninterruptibly();
    }
}
