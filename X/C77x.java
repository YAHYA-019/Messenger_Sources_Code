package X;

import android.graphics.drawable.Drawable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.ui.emoji.model.Emoji;

/* renamed from: X.77x, reason: invalid class name */
/* loaded from: 77x.class */
public final class C77x implements C77y {
    public final Drawable A00;
    public final Emoji A01;

    public C77x(7Is r302) {
        this.A01 = r302.A01;
        Drawable drawable = r302.A00;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, drawable);
        this.A00 = drawable;
    }

    public C77x(Drawable drawable, Emoji emoji) {
        this.A01 = emoji;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, drawable);
        this.A00 = drawable;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C77x)) {
                return false;
            }
            C77x c77x = (C77x) obj;
            if (!11T.A0O(this.A01, c77x.A01) || !11T.A0O(this.A00, c77x.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }
}
