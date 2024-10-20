package androidx.compose.foundation.lazy.layout;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Kzz;
import X.LOB;

/* loaded from: TraversablePrefetchStateModifierElement.class */
public final class TraversablePrefetchStateModifierElement extends LOB {
    public final Kzz A00;

    public TraversablePrefetchStateModifierElement(Kzz kzz) {
        this.A00 = kzz;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TraversablePrefetchStateModifierElement) && 11T.A0O(this.A00, ((TraversablePrefetchStateModifierElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TraversablePrefetchStateModifierElement(prefetchState=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
