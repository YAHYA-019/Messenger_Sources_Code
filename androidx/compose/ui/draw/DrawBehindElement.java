package androidx.compose.ui.draw;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LOB;
import kotlin.jvm.functions.Function1;

/* loaded from: DrawBehindElement.class */
public final class DrawBehindElement extends LOB {
    public final Function1 A00;

    public DrawBehindElement(Function1 function1) {
        this.A00 = function1;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawBehindElement) && 11T.A0O(this.A00, ((DrawBehindElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DrawBehindElement(onDraw=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
