package X;

import com.google.common.base.Absent;
import com.google.common.base.Present;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.1Ze, reason: invalid class name */
/* loaded from: 1Ze.class */
public final class C1Ze {
    public final 1Br A00 = 1Bq.A00(98404);

    public static final File A00(C1Ze c1Ze) {
        File AUU = ((1MC) c1Ze.A00.A00.get()).AUU(1414289738);
        if (AUU.exists() || AUU.mkdirs()) {
            return AUU;
        }
        throw new RuntimeException(0Pz.A0v("Unable to create ", AUU.getName(), " directory under ", AUU.getParent()));
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Throwable, boolean] */
    public final 3uE A01(String str, String str2, int i) {
        Absent absent;
        11T.A0F(str, 2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File[] listFiles = A00(this).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                11T.A0D(file);
                11T.A0F(file, 0);
                try {
                    new Present(3uC.A00(file));
                } catch (C1dm | 3uA unused) {
                    absent = Absent.INSTANCE;
                    11T.A0D(absent);
                }
                if (absent.isPresent()) {
                    Object obj = absent.get();
                    11T.A0A(obj);
                    arrayList2.add(obj);
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            3uE r0 = (3uE) it.next();
            if (i == r0.A00 && str.equals(r0.A04) && str2.equals(r0.A05)) {
                arrayList.add(r0);
            }
        }
        if (arrayList.isEmpty()) {
            String format = String.format(Locale.US, "No QT files found for build %d and locale %s and user %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), str, str2}, 3));
            11T.A0A(format);
            throw new RuntimeException(format);
        }
        if (!(!arrayList.isEmpty())) {
            throw AnonymousClass001.A0N("Expecting at least one QT file");
        }
        Object max = Collections.max(arrayList, new Comparator() { // from class: X.3io
            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(Object obj2, Object obj3) {
                int i2;
                long j = ((3uE) obj2).A01;
                long j2 = ((3uE) obj3).A01;
                if (j < j2) {
                    i2 = -1;
                } else {
                    i2 = 0;
                    if (j > j2) {
                        return 1;
                    }
                }
                return i2;
            }
        });
        11T.A0A(max);
        3uE r02 = (3uE) max;
        try {
            File file2 = r02.A02;
            byte[] A00 = C05344dj.A00(file2);
            if (A00 == null) {
                throw 1BK.A0h();
            }
            if (r02.A03.equals(0KC.A03(A00, "MD5"))) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((3uE) it2.next()).A02.delete();
                }
                return r02;
            }
            file2.delete();
            String format2 = String.format(Locale.US, "Failed to verify QT file content for build %d and locale %s and user %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), str, str2}, 3));
            11T.A0A(format2);
            throw new RuntimeException(format2);
        } catch (IOException unused2) {
            throw AnonymousClass001.A0U(arrayList.remove(r02));
        }
    }
}
