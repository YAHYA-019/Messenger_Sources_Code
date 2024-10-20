package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0j1, reason: invalid class name */
/* loaded from: 0j1.class */
public final class C0j1 {
    public static String A06;
    public final 0jH A00;
    public final File A01;
    public final List A02;
    public final boolean A03;
    public final C0o8 A04;
    public final boolean A05;
    public static final File[] A08 = new File[0];
    public static final Object A07 = AnonymousClass001.A0R();

    public C0j1(C0o8 c0o8, 0jH r303, boolean z, boolean z2) {
        this.A00 = r303;
        this.A04 = c0o8;
        File A0D = AnonymousClass001.A0D(r303.A06, "reports");
        this.A01 = A0D;
        A0D.mkdirs();
        this.A05 = z;
        this.A03 = z2;
        this.A02 = z2 ? new CopyOnWriteArrayList() : AnonymousClass001.A0s();
    }

    public static void A00(C0gq c0gq, C0j1 c0j1, File file, File file2, String str) {
        0Xq.A00(0Pz.A0W("maybeAssembleReport.", c0gq.name()));
        try {
            synchronized (A07) {
                List<0gS> list = c0j1.A02;
                0fH.A0g(Integer.valueOf(list.size()), "lacrima", "Maybe assemble report: %d");
                for (0gS r0 : list) {
                    0fH.A0g(r0.getClass().getSimpleName(), "lacrima", "Maybe assemble report: %s");
                    0fH.A0d(file.getName(), file2 == null ? "-" : file2.getName(), "lacrima", " session: %s prev: %s");
                    r0.A04(c0gq, file, file2, str);
                }
                A01(file, "mixers");
            }
        } finally {
            0Xp.A00();
        }
    }

    public static void A01(File file, String str) {
        synchronized (A07) {
            try {
                new File(file, 0Pz.A0W(str, "_done")).createNewFile();
            } catch (IOException e) {
                0fH.A0k("lacrima", "Marking session dir failed");
                C0iy.A00().Bwu("MarkAssembled", e, null);
            }
        }
    }

    public static boolean A02(File file, String str) {
        boolean exists;
        synchronized (A07) {
            exists = 0Pz.A02(str, "_done", file).exists();
        }
        return exists;
    }

    public void A03(C0qh c0qh, File file, String str, List list) {
        0Xq.A00("combineIntoReport");
        try {
            synchronized (A07) {
                0Xq.A00("combineIntoProperties");
                try {
                    0fH.A0g(file.getName(), "lacrima", "Assemble report to %s");
                    Collections.sort(list, new C0qo(1));
                    Properties properties = new Properties();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        0Xq.A00(0Pz.A0W("include property file: ", file2.getName()));
                        Properties properties2 = new Properties();
                        try {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                try {
                                    properties2.load(fileInputStream);
                                    properties.putAll(properties2);
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        0Ug.A00(th, th2);
                                    }
                                    throw th;
                                    break;
                                }
                            } finally {
                            }
                        } catch (IOException | IllegalArgumentException e) {
                            0fH.A14("lacrima", "Could not read property file %s", new Object[]{file2.getName(), e});
                            C0iy.A00().Bwu("AssemblerReadPropFile", e, null);
                        }
                    }
                    if (c0qh != null) {
                        properties.put(C0g6.A95.A00, file.getName());
                        c0qh.A08(properties);
                    }
                    File A0D = AnonymousClass001.A0D(file, str);
                    try {
                        C0o8 c0o8 = this.A04;
                        C0gq c0gq = C0gq.CRITICAL_REPORT;
                        c0o8.A02(A0D, (str.startsWith(c0gq.prefix) || str.contains(0iP.A0C.mName)) ? "reports" : null, properties, this.A05);
                        if (C0iw.A04 && str.startsWith(c0gq.prefix) && (str.contains(0iP.A0E.mName) || str.contains(0iP.A0L.mName) || str.contains(0iP.A03.mName) || str.contains(0iP.A0U.mName))) {
                            HashMap A0u = AnonymousClass001.A0u();
                            A0u.put("report_name", str);
                            A0u.put("report_size", String.valueOf(A0D.length()));
                            A0u.put("report_id", file.getName());
                            C0iw.A00("report_assembled", A0u);
                        }
                    } catch (IOException e2) {
                        0fH.A14("lacrima", "Assembling report failed: %s %s", new Object[]{file.getName(), str, e2});
                        C0iy.A00().Bwu("AssembleFail", e2, null);
                    }
                } finally {
                }
            }
        } finally {
        }
    }
}
