package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4Al, reason: invalid class name */
/* loaded from: 4Al.class */
public final class C4Al {
    public Integer A00 = 0S2.A01;
    public final Set A01 = new HashSet(7, 1.0f);

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('{');
        for (Object obj : this.A01) {
            if (A0k.length() > 1) {
                A0k.append(", ");
            }
            A0k.append(AnonymousClass001.A0X(obj));
            A0k.append('=');
            A0k.append(obj);
        }
        A0k.append(", ");
        A0k.append("UserVisitationState=");
        switch (this.A00.intValue()) {
            case 0:
                str = "ACTIVE";
                break;
            case 1:
                str = "DAP";
                break;
            case 2:
                str = "WAP";
                break;
            case 3:
                str = "MAP";
                break;
            default:
                str = "NON_MAP";
                break;
        }
        A0k.append(str);
        return AnonymousClass001.A0f(A0k);
    }
}
