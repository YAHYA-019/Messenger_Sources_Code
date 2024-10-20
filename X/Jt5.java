package X;

import com.facebook.messaging.communitymessaging.channelinvite.externalshare.ExternalShareUtils$ExternalShareButton$Companion;

/* loaded from: Jt5.class */
public final class Jt5 extends C04v {
    public static final ExternalShareUtils$ExternalShareButton$Companion Companion = new Object();
    public final String A00;

    public /* synthetic */ Jt5(String str, int i) {
        if (1 != (i & 1)) {
            7mU.A00(LvZ.A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Jt5) && 11T.A0O(this.A00, ((Jt5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
