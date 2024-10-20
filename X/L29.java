package X;

import kotlin.jvm.functions.Function2;

/* loaded from: L29.class */
public final class L29 {
    public boolean A00;
    public final String A01;
    public final Function2 A02;

    public L29(String str, Function2 function2) {
        this.A01 = str;
        this.A02 = function2;
    }

    public static L29 A00(String str, Function2 function2, boolean z) {
        L29 l29 = new L29(str, function2);
        l29.A00 = z;
        return l29;
    }

    public String toString() {
        return 0Pz.A0W("AccessibilityKey: ", this.A01);
    }
}
