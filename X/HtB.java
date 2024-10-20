package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: HtB.class */
public final class HtB {
    public final List A00;

    public HtB(List list) {
        11T.A0F(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !1BL.A1V(this, obj)) {
            return false;
        }
        return 11T.A0O(this.A00, ((HtB) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return 0QD.A0K(", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", this.A00, (Function1) null, -1);
    }
}
