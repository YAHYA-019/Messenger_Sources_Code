package X;

import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4Px, reason: invalid class name */
/* loaded from: 4Px.class */
public final class C4Px extends C04v {
    public final ImmutableList A00;
    public final Integer A01;
    public final Integer A02;

    public C4Px(ImmutableList immutableList, Integer num, Integer num2) {
        11T.A0F(immutableList, 1);
        this.A00 = immutableList;
        this.A01 = num;
        this.A02 = num2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4Px)) {
                return false;
            }
            C4Px c4Px = (C4Px) obj;
            if (!11T.A0O(this.A00, c4Px.A00) || !11T.A0O(this.A01, c4Px.A01) || !11T.A0O(this.A02, c4Px.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.A00.hashCode() * 31) + AnonymousClass001.A02(this.A01)) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FriendRequestsResult(friendRequests=");
        A0k.append(this.A00);
        A0k.append(AnonymousClass000.A00(ActionId.MESSENGER_QUEUE_CREATION));
        A0k.append(this.A01);
        A0k.append(", unseenCount=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
