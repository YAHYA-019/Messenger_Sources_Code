package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.8un, reason: invalid class name */
/* loaded from: 8un.class */
public final class C8un extends 9DA {
    public final ThreadSummary A00;
    public final java.util.Map A01;

    public C8un(ThreadSummary threadSummary, java.util.Map map) {
        this.A00 = threadSummary;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8un)) {
                return false;
            }
            C8un c8un = (C8un) obj;
            if (!11T.A0O(this.A00, c8un.A00) || !11T.A0O(this.A01, c8un.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Loaded(threadSummary=");
        A0k.append(this.A00);
        A0k.append(", nicknames=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
