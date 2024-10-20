package X;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.4A3, reason: invalid class name */
/* loaded from: 4A3.class */
public abstract class C4A3 {
    public static final Iterator A01 = new ArrayList(0).iterator();
    public final File A00;

    public C4A3(File file) {
        this.A00 = file;
    }

    public Iterator A00() {
        if (!(this instanceof C4A2)) {
            return A01;
        }
        C4A2 c4a2 = (C4A2) this;
        File file = ((C4A3) c4a2).A00;
        FileFilter fileFilter = c4a2.A00;
        Comparator comparator = c4a2.A01;
        Object[] listFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
        if (listFiles != null) {
            Object[] copyOf = Arrays.copyOf(listFiles, listFiles.length);
            try {
                Arrays.sort(copyOf, comparator);
                listFiles = copyOf;
            } catch (IllegalArgumentException unused) {
            }
        } else {
            listFiles = new File[0];
        }
        return new 4AB(c4a2, new 4AA(listFiles));
    }
}
