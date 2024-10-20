package X;

import android.graphics.Typeface;
import java.io.File;

/* renamed from: X.2d1, reason: invalid class name */
/* loaded from: 2d1.class */
public interface C2d1 {
    public static final C2d1 A00 = new C2d1() { // from class: X.2d2
        @Override // X.C2d1
        public /* bridge */ /* synthetic */ Object AI4(File file) {
            return file;
        }
    };
    public static final C2d1 A01 = new C2d1() { // from class: X.2d3
        @Override // X.C2d1
        public /* bridge */ /* synthetic */ Object AI4(File file) {
            Typeface typeface = null;
            if (file != null) {
                try {
                    typeface = Typeface.createFromFile(file);
                } catch (RuntimeException unused) {
                }
            }
            return typeface;
        }
    };

    Object AI4(File file);
}
