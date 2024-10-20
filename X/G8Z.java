package X;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: G8Z.class */
public final class G8Z extends HashMap {
    public static final long serialVersionUID = 1;
    public final Locale _locale;

    public G8Z() {
        this(Locale.getDefault());
    }

    public G8Z(Locale locale) {
        this._locale = locale;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.get(((String) obj).toLowerCase(this._locale));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(((String) obj).toLowerCase(this._locale), obj2);
    }
}
