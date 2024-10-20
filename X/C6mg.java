package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.6mg, reason: invalid class name */
/* loaded from: 6mg.class */
public final class C6mg {
    public static volatile C7sk A07;
    public final ThreadKey A00;
    public final C7sk A01;
    public final User A02;
    public final UserKey A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;

    public C6mg(ThreadKey threadKey, C7sk c7sk, User user, UserKey userKey, Set set, boolean z, boolean z2) {
        this.A01 = c7sk;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = threadKey;
        this.A02 = user;
        this.A03 = userKey;
        this.A04 = Collections.unmodifiableSet(set);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.7sk, java.lang.Object] */
    public C7sk A00() {
        if (this.A04.contains("capabilities")) {
            return this.A01;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = new Object();
                }
            }
        }
        return A07;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6mg)) {
                return false;
            }
            C6mg c6mg = (C6mg) obj;
            if (!11T.A0O(A00(), c6mg.A00()) || this.A05 != c6mg.A05 || this.A06 != c6mg.A06 || !11T.A0O(this.A00, c6mg.A00) || !11T.A0O(this.A02, c6mg.A02) || !11T.A0O(this.A03, c6mg.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A02(C1pq.A02(C1pq.A04(A00(), 1), this.A05), this.A06))));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThreadPresenceInfo{capabilities=");
        sb.append(A00());
        sb.append(", isCoPresent=");
        sb.append(this.A05);
        sb.append(", isTyping=");
        sb.append(this.A06);
        sb.append(AbE.A00(16));
        sb.append(this.A00);
        sb.append(1BJ.A00(244));
        sb.append(this.A02);
        sb.append(", userKey=");
        sb.append(this.A03);
        sb.append("}");
        return sb.toString();
    }
}
