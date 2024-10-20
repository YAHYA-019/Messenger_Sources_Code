package X;

import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0o8, reason: invalid class name */
/* loaded from: 0o8.class */
public final class C0o8 {
    public static final byte[] A02 = new byte[100];
    public static final char[] A03 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final 0hK A00;
    public final java.util.Map A01;

    public C0o8() {
    }

    public C0o8(0hK r302) {
        this.A01 = new ConcurrentHashMap();
        this.A00 = r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x003c, code lost:
    
        if (r305 < r0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A00(java.lang.String r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0o8.A00(java.lang.String, boolean):java.lang.String");
    }

    public static void A01(File file, String str, String str2, Properties properties) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, 0Pz.A0W(str2, str));
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.io.RandomAccessFile, java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r313v0 */
    /* JADX WARN: Type inference failed for: r313v16 */
    /* JADX WARN: Type inference failed for: r313v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r313v9 */
    public void A02(File file, String str, Properties properties, boolean z) {
        Throwable th;
        IOException th2;
        long filePointer;
        long j;
        String str2 = str;
        try {
            if ("perf".equals(str)) {
                try {
                    java.util.Map map = this.A01;
                    C0pe c0pe = (C0pe) map.get(file.getPath());
                    if (c0pe == null) {
                        c0pe = this.A00.AIX(file, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
                        C0k4.A00(c0pe);
                        map.put(file.getPath(), c0pe);
                    }
                    MappedByteBuffer mappedByteBuffer = c0pe.A00;
                    mappedByteBuffer.clear();
                    for (Map.Entry entry : properties.entrySet()) {
                        String obj = entry.getKey().toString();
                        String obj2 = entry.getValue().toString();
                        mappedByteBuffer.put(A00(obj, true).getBytes("Ascii"));
                        mappedByteBuffer.put(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR.getBytes("Ascii"));
                        mappedByteBuffer.put(A00(obj2, false).getBytes("Ascii"));
                        mappedByteBuffer.put("\n".getBytes("Ascii"));
                    }
                    th = "#";
                    mappedByteBuffer.put(th.getBytes("Ascii"));
                    return;
                } catch (Throwable th3) {
                    th = 0;
                    C0iy.A00().Bwu("MappedPropStore", th3, null);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    if (str == null) {
                        str2 = "";
                    }
                    try {
                        properties.store(fileOutputStream, 0Pz.A0W("fallover ", str2));
                        fileOutputStream.close();
                        return;
                    } catch (Throwable th4) {
                        fileOutputStream.close();
                        throw th4;
                    }
                }
            }
            File file2 = new File(0Pz.A0W(file.getPath(), "_tmp"));
            if (str != null) {
                0hG A00 = 0hG.A00(str);
                synchronized (A00.A03) {
                    0RZ.A03((Object) A00.A02, 0Pz.A0W("Did you call FixedLengthFiles.init()? - pool: ", A00.A04));
                    0RZ.A05(A00.A02.getPath().equals(file2.getParent()) ? false : true, "Destination file cannot be in the pool directory");
                    th = A00.A02.listFiles();
                    try {
                        if (th != 0 && th.length > 0 && th[0].renameTo(file2)) {
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                                randomAccessFile.write("# ".getBytes("Ascii"));
                                randomAccessFile.write(str2.getBytes("Ascii"));
                                randomAccessFile.write("\n".getBytes("Ascii"));
                                Iterator it = properties.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        String obj3 = entry2.getKey().toString();
                                        String obj4 = entry2.getValue().toString();
                                        byte[] bytes = A00(obj3, true).getBytes("Ascii");
                                        byte[] bytes2 = A00(obj4, false).getBytes("Ascii");
                                        if (randomAccessFile.getFilePointer() + bytes.length + bytes2.length + 25 > randomAccessFile.length()) {
                                            randomAccessFile.write("trimmed_report=true\n#".getBytes("Ascii"));
                                            randomAccessFile.close();
                                            A01(file2, str2, " store (too large) ", properties);
                                            break;
                                        } else {
                                            randomAccessFile.write(bytes);
                                            randomAccessFile.write(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR.getBytes("Ascii"));
                                            randomAccessFile.write(bytes2);
                                            randomAccessFile.write("\n".getBytes("Ascii"));
                                        }
                                    } else {
                                        if (!z || randomAccessFile.length() > 100000) {
                                            byte[] bytes3 = "# ".getBytes("Ascii");
                                            do {
                                                randomAccessFile.write(bytes3);
                                                filePointer = randomAccessFile.getFilePointer();
                                                bytes3 = A02;
                                                j = 100;
                                            } while (filePointer + 100 < randomAccessFile.length());
                                            while (randomAccessFile.getFilePointer() + j < randomAccessFile.length()) {
                                                randomAccessFile.writeByte(0);
                                            }
                                        } else {
                                            randomAccessFile.write("# ".getBytes("Ascii"));
                                            randomAccessFile.write(new byte[(int) (randomAccessFile.length() - randomAccessFile.getFilePointer())]);
                                        }
                                        randomAccessFile.close();
                                    }
                                }
                                randomAccessFile.close();
                            } catch (FileNotFoundException e) {
                                C0iy.A00().Bwu("FixedLenFilesReserve", e, null);
                                0fH.A0u("lacrima", "Cannot reserve file", e);
                            }
                        }
                        A01(file2, str2, " store (reserve)", properties);
                    } finally {
                        th2 = th;
                        if (r0 != 0) {
                        }
                    }
                }
            } else {
                A01(file2, "", "no pool", properties);
            }
            if (file2.renameTo(file)) {
                return;
            }
            th2 = AnonymousClass001.A0G(0Pz.A0W("Could not rename file: ", file.getName()));
            throw th2;
        } catch (Throwable th5) {
            0Ug.A00(th, th5);
            throw th;
        }
        0Ug.A00(th, th5);
        throw th;
    }
}
