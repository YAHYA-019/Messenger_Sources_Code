package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: Lxm.class */
public final class Lxm extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.US);
    }
}
