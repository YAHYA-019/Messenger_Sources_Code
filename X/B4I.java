package X;

import com.facebook.messaging.communitymessaging.model.Member;

/* loaded from: B4I.class */
public final class B4I extends BPb {
    public final Member A00;

    public B4I(Member member) {
        11T.A0F(member, 1);
        this.A00 = member;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof B4I) && 11T.A0O(this.A00, ((B4I) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
