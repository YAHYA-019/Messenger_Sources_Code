package X;

import android.net.Uri;

/* loaded from: El5.class */
public final class El5 {
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;

    public El5() {
        String A0X = 0Pz.A0X("content://", 0Pz.A0W((String) 1Bi.A03(100173), ".provider.PhotosProvider"), '/');
        this.A01 = 7zU.A0C(0Pz.A0W(A0X, "localphototags"));
        this.A00 = 7zU.A0C(0Pz.A0W(A0X, "localphotometadata"));
        this.A02 = 7zU.A0C(0Pz.A0W(A0X, "removedprefilledtags"));
    }
}
