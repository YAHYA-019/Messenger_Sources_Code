package X;

import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.Arrays;
import java.util.List;

/* loaded from: L4A.class */
public final class L4A {
    public static final L4A A02;
    public static final L4A A03;
    public static final L4A A04;
    public static final List A05;
    public static final L4A A06;
    public static final L4A A07;
    public final int A00;
    public final String A01;

    static {
        L4A l4a = new L4A(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE, "Success");
        A04 = l4a;
        L4A l4a2 = new L4A(4097, "Failure");
        A06 = l4a2;
        L4A l4a3 = new L4A(4098, "NotSupported");
        A07 = l4a3;
        L4A l4a4 = new L4A(4160, "InvalidIdentifier");
        A02 = l4a4;
        L4A l4a5 = new L4A(4161, "InvalidSignature");
        A03 = l4a5;
        A05 = C0s8.A14(l4a, l4a2, l4a3, l4a5, l4a4);
    }

    public L4A(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L4A)) {
                return false;
            }
            L4A l4a = (L4A) obj;
            if (this.A00 != l4a.A00 || !11T.A0O(this.A01, l4a.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, this.A00 * 31);
    }

    public String toString() {
        return JQz.A0r("Error(0x", GOo.A10("%04x", Arrays.copyOf(AnonymousClass001.A1a(this.A00), 1)), ": ", this.A01);
    }
}
