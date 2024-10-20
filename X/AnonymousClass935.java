package X;

import com.facebook.stickers.model.Sticker;

/* renamed from: X.935, reason: invalid class name */
/* loaded from: 935.class */
public final class AnonymousClass935 extends C99k {
    public final int A00;
    public final Sticker A01;
    public final 96J A02;

    public AnonymousClass935(Sticker sticker, 96J r303, int i) {
        11T.A0F(sticker, 1);
        this.A01 = sticker;
        this.A02 = r303;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass935)) {
                return false;
            }
            AnonymousClass935 anonymousClass935 = (AnonymousClass935) obj;
            if (!11T.A0O(this.A01, anonymousClass935.A01) || this.A02 != anonymousClass935.A02 || this.A00 != anonymousClass935.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A02, 1BL.A03(this.A01)) + this.A00;
    }
}
