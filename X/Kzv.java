package X;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: Kzv.class */
public final class Kzv {
    public static final Status A02 = new Status(8, "The connection to Google Play services was lost");
    public final Set A01 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final Kfw A00 = new Kfw(this);
}
