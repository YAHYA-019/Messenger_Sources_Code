package androidx.compose.ui.semantics;

import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LOB;
import X.MNA;
import kotlin.jvm.functions.Function1;

/* loaded from: AppendedSemanticsElement.class */
public final class AppendedSemanticsElement extends LOB implements MNA {
    public final Function1 A00;
    public final boolean A01;

    public AppendedSemanticsElement(Function1 function1, boolean z) {
        this.A01 = z;
        this.A00 = function1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AppendedSemanticsElement)) {
                return false;
            }
            AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
            if (this.A01 != appendedSemanticsElement.A01 || !11T.A0O(this.A00, appendedSemanticsElement.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A00(this.A01 ? 1 : 0) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AppendedSemanticsElement(mergeDescendants=");
        A0k.append(this.A01);
        A0k.append(", properties=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
