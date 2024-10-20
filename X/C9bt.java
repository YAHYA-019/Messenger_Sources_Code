package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import java.util.Arrays;

/* renamed from: X.9bt, reason: invalid class name */
/* loaded from: 9bt.class */
public final class C9bt {
    public final C5fv A00;
    public final Photo A01;
    public final 5vW A02;
    public final 9Zg A03;
    public final String A04;

    public C9bt(C5fv c5fv, Photo photo, 5vW r304, 9Zg r305, String str) {
        this.A04 = str;
        this.A01 = photo;
        this.A00 = c5fv;
        this.A03 = r305;
        this.A02 = r304;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9bt)) {
                return false;
            }
            C9bt c9bt = (C9bt) obj;
            if (!11T.A0O(this.A04, c9bt.A04)) {
                return false;
            }
            Photo photo = this.A01;
            Photo photo2 = c9bt.A01;
            if (photo != null) {
                if (!photo.equals(photo2)) {
                    return false;
                }
            } else if (photo2 != null) {
                return false;
            }
            C5fv c5fv = this.A00;
            C5fv c5fv2 = c9bt.A00;
            if (c5fv != null) {
                if (!c5fv.equals(c5fv2)) {
                    return false;
                }
            } else if (c5fv2 != null) {
                return false;
            }
            9Zg r0 = this.A03;
            9Zg r02 = c9bt.A03;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            5vW r03 = this.A02;
            5vW r04 = c9bt.A02;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A01, this.A00, this.A03, null, this.A02, getClass()});
    }
}
