package X;

import com.facebook.messaging.media.folder.Folder;
import java.util.Comparator;

/* loaded from: DAe.class */
public final class DAe implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        Folder folder = (Folder) obj;
        Folder folder2 = (Folder) obj2;
        11T.A0H(folder, folder2);
        long j = folder.A01;
        long j2 = folder2.A01;
        if (j == j2) {
            i = folder.A03.compareTo(folder2.A03);
        } else {
            i = 1;
            if (j > j2) {
                return -1;
            }
        }
        return i;
    }
}
