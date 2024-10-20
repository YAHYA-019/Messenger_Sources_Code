package X;

import java.util.List;

/* renamed from: X.4wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4wh.class */
public final class C11434wh extends C04v {
    public final List A00;
    public final boolean A01;

    public C11434wh(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C11434wh)) {
                return false;
            }
            C11434wh c11434wh = (C11434wh) obj;
            if (!11T.A0O(this.A00, c11434wh.A00) || this.A01 != c11434wh.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("detections: ");
        A0k.append(this.A00);
        A0k.append(" isPaymentAutofillWithValidCreditCardDetected: ");
        A0k.append(this.A01);
        return A0k.toString();
    }
}
