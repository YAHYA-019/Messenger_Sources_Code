package X;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: Iny.class */
public final class Iny implements FilenameFilter {
    public static final Iny A00 = new Iny();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        11T.A0F(str, 1);
        boolean z = false;
        if (0CV.A0b(str, "preview_audio_", false) && 0CV.A0Z(str, ".wav", false)) {
            z = true;
        }
        return z;
    }
}
