package X;

import android.graphics.PointF;
import com.facebook.stickers.model.Sticker;

/* loaded from: DqH.class */
public final class DqH extends C04v {
    public final float A00;
    public final int A01 = 2;
    public final Object A02;

    public DqH(PointF pointF, float f) {
        this.A02 = pointF;
        this.A00 = f;
    }

    public DqH(Sticker sticker, float f) {
        11T.A0F(sticker, 1);
        this.A02 = sticker;
        this.A00 = f;
    }

    public DqH(Object obj, float f) {
        this.A02 = obj;
        this.A00 = f;
    }

    public boolean equals(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                if (this == obj) {
                    return true;
                }
                i = 0;
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                i = 1;
                break;
            default:
                if (this == obj) {
                    return true;
                }
                i = 2;
                break;
        }
        if (!(obj instanceof DqH)) {
            return false;
        }
        DqH dqH = (DqH) obj;
        return dqH.A01 == i && 11T.A0O(this.A02, dqH.A02) && Float.compare(this.A00, dqH.A00) == 0;
    }

    public int hashCode() {
        Object obj;
        int i;
        if (this.A01 != 0) {
            obj = this.A02;
        } else {
            obj = this.A02;
            if (obj == null) {
                i = 0;
                return (i * 31) + Float.floatToIntBits(this.A00);
            }
        }
        i = obj.hashCode();
        return (i * 31) + Float.floatToIntBits(this.A00);
    }
}
