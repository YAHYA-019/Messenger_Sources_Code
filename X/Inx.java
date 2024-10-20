package X;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: Inx.class */
public final class Inx implements FilenameFilter {
    public static final Inx A00 = new Inx();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        11T.A0F(str, 1);
        return 0CV.A0b(str, "media_accuracy_tags_", false);
    }
}
