package X;

import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;

/* renamed from: X.8tv, reason: invalid class name */
/* loaded from: 8tv.class */
public final class C8tv extends C99a {
    public final GroupInviteLinkData A00;

    public C8tv(GroupInviteLinkData groupInviteLinkData) {
        this.A00 = groupInviteLinkData;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8tv) && 11T.A0O(this.A00, ((C8tv) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
