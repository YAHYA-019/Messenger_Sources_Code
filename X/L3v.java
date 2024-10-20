package X;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: L3v.class */
public final class L3v {
    public final String A00;
    public final C00l A01;

    public L3v(String str, C00l c00l) {
        this.A00 = str;
        this.A01 = c00l;
    }

    public static void A00(L3v l3v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        accessibilityNodeInfoCompat.A05(new 0Oe(i, l3v.A00));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L3v)) {
                return false;
            }
            L3v l3v = (L3v) obj;
            if (!11T.A0O(this.A00, l3v.A00) || !11T.A0O(this.A01, l3v.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (1BL.A06(this.A00) * 31) + JQz.A0E(this.A01, 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AccessibilityAction(label=");
        A0k.append(this.A00);
        A0k.append(", action=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
