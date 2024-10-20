package X;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: ACe.class */
public final class ACe implements FilenameFilter {
    public final int A00;
    public final String A01;

    public ACe(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        11T.A0D(str);
        return 0CV.A0b(str, this.A01, false);
    }
}
