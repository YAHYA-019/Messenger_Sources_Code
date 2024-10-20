package X;

import java.util.Set;

/* renamed from: X.4vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4vi.class */
public final class C11094vi {
    public static C11094vi A02;
    public String A00 = "NOT_SHOWN";
    public final Set A01;

    public C11094vi() {
        Set A0I = 1Bn.A0I(225);
        11T.A0A(A0I);
        this.A01 = A0I;
        synchronized (C11094vi.class) {
            if (A02 == null) {
                A02 = this;
            }
        }
    }

    public final void A00(String str) {
        synchronized (this) {
            if (!str.equals(this.A00)) {
                this.A00 = str;
                0fH.A0g(str, "ChatHeadStatusManager", "chat head state change to: %s");
                for (C7yd c7yd : this.A01) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1156473671) {
                        if (hashCode != 371810871) {
                            if (hashCode == 1035078757 && str.equals("NOT_SHOWN")) {
                                c7yd.Btq();
                            }
                        } else if (str.equals("COLLAPSED")) {
                            c7yd.Bph();
                        }
                    } else if (str.equals("EXPANDED")) {
                        c7yd.Bx9();
                    }
                }
            }
        }
    }
}
