package androidx.compose.ui.input.key;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LOB;
import kotlin.jvm.functions.Function1;

/* loaded from: KeyInputElement.class */
public final class KeyInputElement extends LOB {
    public final Function1 A00;

    public KeyInputElement(Function1 function1) {
        this.A00 = function1;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof KeyInputElement) && 11T.A0O(this.A00, ((KeyInputElement) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00) * 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("KeyInputElement(onKeyEvent=");
        A0k.append(this.A00);
        A0k.append(", onPreKeyEvent=");
        return AnonymousClass002.A0K(null, A0k);
    }
}
