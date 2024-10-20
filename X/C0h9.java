package X;

import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/* renamed from: X.0h9, reason: invalid class name */
/* loaded from: 0h9.class */
public final class C0h9 {
    public static final List A05 = AnonymousClass001.A0t(2);
    public final Context A00;
    public final Object A01 = AnonymousClass001.A0R();
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final C0pq A03;
    public final File A04;

    public C0h9(Context context, C0pq c0pq, File file) {
        this.A00 = context;
        this.A04 = file;
        this.A03 = c0pq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0245, code lost:
    
        if (r0.renameTo(new java.io.File(r0.A02, X.0Pz.A0W(java.util.UUID.randomUUID().toString(), "_prop.txt"))) != false) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.C0h9 r301, java.io.File r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0h9.A00(X.0h9, java.io.File, java.lang.String):void");
    }

    public static void A01(C0h9 c0h9, String str, int i, long j) {
        int i2;
        File[] listFiles = AnonymousClass001.A0D(c0h9.A04, "reports").listFiles(new C0of(str, 0));
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, new C0qo(0));
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            int i3 = i2;
            int length = listFiles.length;
            if (i3 >= length) {
                return;
            }
            File file = listFiles[i3];
            if (i3 >= length - i) {
                try {
                } catch (IOException e) {
                    C0iy.A00().Bwu("DeleteTooManyReports", e, null);
                    0fH.A17("lacrima", "Cannot delete report dir: %s", new Object[]{file.getName(), e});
                }
                i2 = file.lastModified() >= currentTimeMillis - j ? i3 + 1 : 0;
            }
            c0h9.A04(file);
        }
    }

    public static void A02(File file, FileFilter fileFilter, List list, Set set) {
        0Xq.A00("buildFiles");
        try {
            File[] listFiles = file.listFiles(fileFilter);
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    File file2 = listFiles[i2];
                    try {
                        String canonicalPath = file2.getCanonicalPath();
                        if (!file2.isDirectory()) {
                            list.add(file2);
                        } else if (!set.contains(canonicalPath)) {
                            set.add(canonicalPath);
                            A02(file2, fileFilter, list, set);
                        }
                    } catch (IOException e) {
                        C0iy.A00().Bwu("GlobalCleanBuildFile", e, null);
                    }
                    i = i2 + 1;
                }
            }
        } finally {
            0Xp.A00();
        }
    }

    public void A03() {
        FileReader fileReader;
        0Xq.A00("updateRefCounts");
        try {
            synchronized (this.A01) {
                ArrayList A0s = AnonymousClass001.A0s();
                A02(this.A04, new C0op(1), A0s, AnonymousClass001.A0v());
                java.util.Map map = this.A02;
                map.clear();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    Properties properties = new Properties();
                    try {
                        fileReader = new FileReader(file);
                    } catch (IllegalArgumentException e) {
                        C0iy.A00().Bwu("MalformUnicode", e, null);
                        0fH.A0n("lacrima", "malformed Unicode present in input, ignoring it.");
                    }
                    try {
                        properties.load(fileReader);
                        fileReader.close();
                        Iterator<String> it2 = properties.stringPropertyNames().iterator();
                        while (it2.hasNext()) {
                            String property = properties.getProperty(it2.next());
                            Integer num = (Integer) map.get(property);
                            if (num == null) {
                                map.put(property, 1);
                            } else {
                                map.put(property, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            fileReader.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                        break;
                    }
                }
            }
        } finally {
            0Xp.A00();
        }
    }

    public void A04(File file) {
        synchronized (C0h9.class) {
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                it.next();
            }
            A00(this, file, "reports");
        }
    }
}
