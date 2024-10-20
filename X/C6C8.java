package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.6C8, reason: invalid class name */
/* loaded from: 6C8.class */
public final class C6C8 extends C04v implements 6C9 {
    public final Photo A00;
    public final Float A01;

    public C6C8(Photo photo) {
        int i;
        this.A00 = photo;
        Float f = photo.A07;
        if (f == null) {
            int i2 = photo.A01;
            f = (i2 == 0 || (i = photo.A00) == 0) ? null : Float.valueOf(i2 / i);
        }
        this.A01 = f;
    }

    public Float AXU() {
        return this.A01;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6C8) && 11T.A0O(this.A00, ((C6C8) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
