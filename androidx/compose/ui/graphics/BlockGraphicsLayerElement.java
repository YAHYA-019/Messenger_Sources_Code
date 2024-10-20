package androidx.compose.ui.graphics;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LOB;
import kotlin.jvm.functions.Function1;

/* loaded from: BlockGraphicsLayerElement.class */
public final class BlockGraphicsLayerElement extends LOB {
    public final Function1 A00;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.A00 = function1;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BlockGraphicsLayerElement) && 11T.A0O(this.A00, ((BlockGraphicsLayerElement) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BlockGraphicsLayerElement(block=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
