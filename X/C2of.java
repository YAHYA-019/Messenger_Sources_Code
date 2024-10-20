package X;

import com.facebook.messaging.montage.model.MontageBucketPreview;

/* renamed from: X.2of, reason: invalid class name */
/* loaded from: 2of.class */
public final class C2of extends C04v implements C2g4 {
    public final MontageBucketPreview A00;
    public final C2fr A01;

    public C2of(MontageBucketPreview montageBucketPreview, C2fr c2fr) {
        this.A01 = c2fr;
        this.A00 = montageBucketPreview;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2of)) {
                return false;
            }
            C2of c2of = (C2of) obj;
            if (!11T.A0O(this.A01, c2of.A01) || !11T.A0O(this.A00, c2of.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }
}
