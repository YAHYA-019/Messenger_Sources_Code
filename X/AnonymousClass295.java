package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.295, reason: invalid class name */
/* loaded from: 295.class */
public final class AnonymousClass295 implements C29M, Serializable, Cloneable {
    public final List additional_contacts;
    public final String requestId;
    public static final C29O A02 = new Object();
    public static final C29Q A00 = new C29Q("additional_contacts", (byte) 15, 1);
    public static final C29Q A01 = new C29Q("requestId", (byte) 11, 2);

    public AnonymousClass295(String str, List list) {
        this.additional_contacts = list;
        this.requestId = str;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.additional_contacts != null) {
            r302.A0V(A00);
            r302.A0W(new 2Aq((byte) 10, this.additional_contacts.size()));
            Iterator it = this.additional_contacts.iterator();
            while (it.hasNext()) {
                r302.A0U(((Number) it.next()).longValue());
            }
        }
        if (this.requestId != null) {
            r302.A0V(A01);
            r302.A0Z(this.requestId);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof AnonymousClass295)) {
                return false;
            }
            AnonymousClass295 anonymousClass295 = (AnonymousClass295) obj;
            List list = this.additional_contacts;
            boolean A1T = AnonymousClass001.A1T(list);
            List list2 = anonymousClass295.additional_contacts;
            if (!CQq.A0I(list, list2, A1T, AnonymousClass001.A1T(list2))) {
                return false;
            }
            String str = this.requestId;
            boolean A1T2 = AnonymousClass001.A1T(str);
            String str2 = anonymousClass295.requestId;
            if (!CQq.A0H(str, str2, A1T2, AnonymousClass001.A1T(str2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.additional_contacts, this.requestId});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
