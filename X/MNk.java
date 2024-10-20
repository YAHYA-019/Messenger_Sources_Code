package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* loaded from: MNk.class */
public interface MNk extends MIB {
    static void A00(Matrix matrix, Path path, List list, int i) {
        path.addPath(((MNk) list.get(i)).B1j(), matrix);
    }

    Path B1j();
}
