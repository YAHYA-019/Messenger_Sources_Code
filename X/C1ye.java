package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.1ye, reason: invalid class name */
/* loaded from: 1ye.class */
public final class C1ye implements FilenameFilter {
    public final /* synthetic */ File A00;

    public C1ye(File file) {
        this.A00 = file;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(this.A00.getName());
    }
}
