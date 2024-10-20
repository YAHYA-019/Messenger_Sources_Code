package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: F9v.class */
public final class F9v {
    public final F9w A00;
    public final List A01;
    public final List A02;

    public F9v() {
        this(null, null, null, null, 7);
    }

    public /* synthetic */ F9v(F9w f9w, List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C0ty c0ty = C0ty.A00;
        M9S m9s = M9S.A01;
        F9w f9w2 = new F9w(m9s, m9s, false);
        11T.A0F(c0ty, 1);
        this.A01 = c0ty;
        this.A02 = c0ty;
        this.A00 = f9w2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9v)) {
                return false;
            }
            F9v f9v = (F9v) obj;
            if (!11T.A0O(this.A01, f9v.A01) || !11T.A0O(this.A02, f9v.A02) || !11T.A0O(this.A00, f9v.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A05(this.A02, 1BL.A03(this.A01)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MEmuOnboardingData(memuPoseDataList=");
        A0k.append(this.A01);
        A0k.append(", userUploadedImages=");
        A0k.append(this.A02);
        A0k.append(", profileResponse=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
