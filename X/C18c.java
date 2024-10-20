package X;

import android.util.Base64;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.18c, reason: invalid class name */
/* loaded from: 18c.class */
public final class C18c {
    public int A00;
    public int A01;
    public String A02;
    public List A03;
    public List A04;

    public C18c() {
        this("", null, 0, 0);
    }

    public C18c(String str, List list, int i, int i2) {
        this.A02 = str;
        this.A03 = list;
        if (list != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0s.add(Base64.encodeToString(((InetAddress) it.next()).getAddress(), 0));
            }
            this.A04 = A0s;
        }
        this.A01 = i;
        this.A00 = i2;
    }

    public List A00() {
        List list = this.A03;
        List list2 = list;
        if (list == null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getByAddress(Base64.decode(AnonymousClass001.A0i(it), 0));
                } catch (IllegalArgumentException | UnknownHostException unused) {
                }
                if (inetAddress != null) {
                    A0s.add(inetAddress);
                }
            }
            this.A03 = A0s;
            list2 = A0s;
        }
        return list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C18c c18c = (C18c) obj;
            if (!A00().equals(c18c.A00()) || !this.A02.equals(c18c.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A02.hashCode() * 31) + A00().hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AE{'");
        A0k.append(this.A02);
        A0k.append('\'');
        A0k.append(", ");
        A0k.append(A00().toString());
        A0k.append(", ");
        A0k.append(this.A01);
        A0k.append(", ");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}
