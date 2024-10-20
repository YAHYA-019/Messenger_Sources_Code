package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: X.6op, reason: invalid class name */
/* loaded from: 6op.class */
public final class C6op extends C04v {
    public final Drawable A00;
    public final Uri A01;
    public final 2Dp A02;
    public final CharSequence A03;
    public final CharSequence A04;
    public final Integer A05;

    public C6op(Drawable drawable, Uri uri, 2Dp r304, CharSequence charSequence, CharSequence charSequence2, Integer num) {
        this.A00 = drawable;
        this.A01 = uri;
        this.A02 = r304;
        this.A05 = num;
        this.A04 = charSequence;
        this.A03 = charSequence2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6op)) {
                return false;
            }
            C6op c6op = (C6op) obj;
            if (!11T.A0O(this.A00, c6op.A00) || !11T.A0O(this.A01, c6op.A01) || !11T.A0O(this.A02, c6op.A02) || !11T.A0O(this.A05, c6op.A05) || !11T.A0O(this.A04, c6op.A04) || !11T.A0O(this.A03, c6op.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((AnonymousClass001.A02(this.A00) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 4YU.A03(this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OverlayParams(overlayDrawable=");
        A0k.append(this.A00);
        A0k.append(", overlayUri=");
        A0k.append(this.A01);
        A0k.append(", lowResImageRequest=");
        A0k.append(this.A02);
        A0k.append(", resourceIdForStaticPlaceholder=");
        A0k.append(this.A05);
        A0k.append(", titleText=");
        A0k.append((Object) this.A04);
        A0k.append(", ctaText=");
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}
