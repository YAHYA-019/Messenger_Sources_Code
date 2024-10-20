package X;

import com.facebook.messaging.profile.bottomsheet.model.ProfileSheet;

/* loaded from: B4K.class */
public final class B4K extends BPc {
    public final ProfileSheet A00;

    public B4K(ProfileSheet profileSheet) {
        11T.A0F(profileSheet, 1);
        this.A00 = profileSheet;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof B4K) && 11T.A0O(this.A00, ((B4K) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
