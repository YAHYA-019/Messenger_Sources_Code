package X;

import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* loaded from: I1m.class */
public final class I1m {
    public final java.util.Map A00 = AnonymousClass001.A0u();
    public final Set A01 = GOn.A1J();

    public static final void A00() {
        if (!GOq.A1L()) {
            throw AnonymousClass001.A0N("Must be ran on the UI thread!");
        }
    }

    public final ImmutableMap A01() {
        A00();
        return GOo.A0k(this.A00);
    }
}
