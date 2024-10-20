package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: Li6.class */
public final class Li6 implements Closeable {
    public int A00;
    public long A01;
    public Writer A03;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0D;
    public static final Charset A0F = Charset.forName("US-ASCII");
    public static final Charset A0G = Charset.forName("UTF-8");
    public static final Pattern A0H = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream A0E = new KM1();
    public long A02 = 0;
    public final LinkedHashMap A0A = new LinkedHashMap(0, 0.75f, true);
    public long A04 = 0;
    public final ThreadPoolExecutor A0C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable A0B = new LtW(this, 3);
    public final int A05 = 2;
    public final int A06 = 1;

    public Li6(File file, long j) {
        this.A07 = file;
        this.A08 = AnonymousClass001.A0D(file, "journal");
        this.A09 = AnonymousClass001.A0D(file, "journal.tmp");
        this.A0D = AnonymousClass001.A0D(file, "journal.bkp");
        this.A01 = j;
    }

    public static void A00(KqF kqF, Li6 li6, boolean z) {
        IllegalStateException A0o;
        synchronized (li6) {
            Kro kro = kqF.A02;
            if (kro.A00 == kqF) {
                if (z && !kro.A01) {
                    for (int i = 0; i < li6.A06; i = 1) {
                        if (!kqF.A03[i]) {
                            kqF.A00();
                            A0o = 4YV.A0h("Newly created entry didn't create value for index ", i);
                        } else {
                            if (!kro.A01().exists()) {
                                kqF.A00();
                                break;
                            }
                        }
                    }
                }
                for (int i2 = 0; i2 < li6.A06; i2 = 1) {
                    File A01 = kro.A01();
                    if (!z) {
                        A04(A01);
                    } else if (A01.exists()) {
                        File A00 = kro.A00();
                        A01.renameTo(A00);
                        long[] jArr = kro.A03;
                        long j = jArr[i2];
                        long length = A00.length();
                        jArr[i2] = length;
                        li6.A02 = (li6.A02 - j) + length;
                    }
                }
                li6.A00++;
                kro.A00 = null;
                if (kro.A01 || z) {
                    kro.A01 = true;
                    Writer writer = li6.A03;
                    String str = kro.A02;
                    StringBuilder A0k = AnonymousClass001.A0k();
                    long[] jArr2 = kro.A03;
                    int length2 = jArr2.length;
                    for (int i3 = 0; i3 < length2; i3 = 1) {
                        long j2 = jArr2[i3];
                        A0k.append(' ');
                        A0k.append(j2);
                    }
                    writer.write(0Pz.A0k("CLEAN ", str, A0k.toString(), '\n'));
                    if (z) {
                        li6.A04 = 1 + li6.A04;
                    }
                } else {
                    LinkedHashMap linkedHashMap = li6.A0A;
                    String str2 = kro.A02;
                    linkedHashMap.remove(str2);
                    li6.A03.write(0Pz.A0X("REMOVE ", str2, '\n'));
                }
                li6.A03.flush();
                if (li6.A02 > li6.A01 || A06(li6)) {
                    li6.A0C.submit(li6.A0B);
                }
            } else {
                A0o = JQx.A0o();
            }
            throw A0o;
        }
    }

    public static void A01(Li6 li6) {
        File file;
        synchronized (li6) {
            Writer writer = li6.A03;
            if (writer != null) {
                writer.close();
            }
            File file2 = li6.A09;
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            Charset charset = A0F;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write(ConstantsKt.CAMERA_ID_BACK);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(li6.A05));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(li6.A06));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A13 = GOo.A13(li6.A0A);
                while (A13.hasNext()) {
                    Kro kro = (Kro) A13.next();
                    if (kro.A00 != null) {
                        bufferedWriter.write(0Pz.A0X("DIRTY ", kro.A02, '\n'));
                    } else {
                        String str = kro.A02;
                        StringBuilder A0k = AnonymousClass001.A0k();
                        long[] jArr = kro.A03;
                        int length = jArr.length;
                        for (int i = 0; i < length; i = 1) {
                            long j = jArr[i];
                            A0k.append(' ');
                            A0k.append(j);
                        }
                        bufferedWriter.write(0Pz.A0k("CLEAN ", str, A0k.toString(), '\n'));
                    }
                }
                bufferedWriter.close();
                file = li6.A08;
            } catch (Throwable th) {
                th = th;
                bufferedWriter.close();
            }
            if (file.exists()) {
                File file3 = li6.A0D;
                A04(file3);
                if (!file.renameTo(file3)) {
                    new IOException();
                    throw th;
                }
            }
            if (!file2.renameTo(file)) {
                new IOException();
                throw th;
            }
            li6.A0D.delete();
            li6.A03 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), charset));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(java.io.Closeable r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L10
            r0 = r301
            r0.close()     // Catch: java.lang.RuntimeException -> Ld java.lang.Exception -> Lf
            goto Le
        Ld:
            throw r0
        Le:
            return
        Lf:
        L10:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Li6.A02(java.io.Closeable):void");
    }

    public static void A03(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw AnonymousClass001.A0G(AnonymousClass001.A0Z(file, "not a readable directory: ", AnonymousClass001.A0k()));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                A03(file2);
            }
            if (!file2.delete()) {
                throw AnonymousClass001.A0G(AnonymousClass001.A0Z(file2, "failed to delete file: ", AnonymousClass001.A0k()));
            }
        }
    }

    public static void A04(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void A05(String str) {
        if (!DKD.A1X(str, A0H)) {
            throw 1BL.A0f("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\"");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r0 < r301.A0A.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(X.Li6 r301) {
        /*
            r0 = r301
            int r0 = r0.A00
            r302 = r0
            r0 = 2000(0x7d0, float:2.803E-42)
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto L21
            r0 = r301
            java.util.LinkedHashMap r0 = r0.A0A
            r304 = r0
            r0 = r304
            int r0 = r0.size()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            r1 = r305
            if (r0 >= r1) goto L25
        L21:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L25:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Li6.A06(X.Li6):boolean");
    }

    public void A07(String str) {
        Throwable A0N;
        synchronized (this) {
            if (this.A03 != null) {
                A05(str);
                LinkedHashMap linkedHashMap = this.A0A;
                Kro kro = (Kro) linkedHashMap.get(str);
                if (kro != null && kro.A00 == null) {
                    for (int i = 0; i < this.A06; i = 1) {
                        File A00 = kro.A00();
                        if (!A00.exists() || A00.delete()) {
                            long j = this.A02;
                            long[] jArr = kro.A03;
                            this.A02 = j - jArr[i];
                            jArr[i] = 0;
                        } else {
                            A0N = AnonymousClass001.A0G(AnonymousClass001.A0Z(A00, "failed to delete ", AnonymousClass001.A0k()));
                        }
                    }
                    this.A00++;
                    this.A03.append((CharSequence) 0Pz.A0X("REMOVE ", str, '\n'));
                    linkedHashMap.remove(str);
                    if (A06(this)) {
                        this.A0C.submit(this.A0B);
                    }
                }
            } else {
                A0N = AnonymousClass001.A0N("cache is closed");
            }
            throw A0N;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.A03 != null) {
                LinkedHashMap linkedHashMap = this.A0A;
                Iterator A1D = GOp.A1D(linkedHashMap.values());
                while (A1D.hasNext()) {
                    KqF kqF = ((Kro) A1D.next()).A00;
                    if (kqF != null) {
                        kqF.A00();
                    }
                }
                while (this.A02 > this.A01) {
                    A07((String) JR1.A0r(AnonymousClass001.A0x(linkedHashMap)));
                }
                this.A03.close();
                this.A03 = null;
            }
        }
    }
}
