package X;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: Chf.class */
public final class Chf implements DEg {
    public final ImmutableList A00;

    public Chf(DEg... dEgArr) {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) Arrays.asList(dEgArr));
        copyOf.getClass();
        this.A00 = copyOf;
    }

    @Override // X.DEg
    public boolean BLX(Uri uri) {
        1Du it = this.A00.iterator();
        while (it.hasNext()) {
            if (((DEg) it.next()).BLX(uri)) {
                return true;
            }
        }
        return false;
    }
}
