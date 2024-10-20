package X;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0qo, reason: invalid class name */
/* loaded from: 0qo.class */
public final class C0qo implements Comparator {
    public final int A00;

    public C0qo(int i) {
        this.A00 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        File file;
        File file2;
        int i;
        switch (this.A00) {
            case 0:
                file = (File) obj;
                file2 = (File) obj2;
                List list = C0h9.A05;
                break;
            case 1:
                file = (File) obj;
                file2 = (File) obj2;
                break;
            case 2:
                File file3 = (File) obj;
                File file4 = (File) obj2;
                i = (!file3.getName().startsWith("session_") ? 1 : 0) - (!file4.getName().startsWith("session_") ? 1 : 0);
                if (i == 0) {
                    return file3.getName().compareTo(file4.getName());
                }
                return i;
            case 3:
                16C r0 = 0jB.A08;
                return ((Long) ((Map.Entry) obj).getValue()).compareTo((Long) ((Map.Entry) obj2).getValue());
            default:
                i = 0;
                return i;
        }
        return (int) (file.lastModified() - file2.lastModified());
    }
}
