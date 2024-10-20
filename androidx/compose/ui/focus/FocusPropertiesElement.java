package androidx.compose.ui.focus;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LOB;
import X.MBW;

/* loaded from: FocusPropertiesElement.class */
public final class FocusPropertiesElement extends LOB {
    public final MBW A00;

    public FocusPropertiesElement(MBW mbw) {
        this.A00 = mbw;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusPropertiesElement) && 11T.A0O(this.A00, ((FocusPropertiesElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FocusPropertiesElement(scope=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
