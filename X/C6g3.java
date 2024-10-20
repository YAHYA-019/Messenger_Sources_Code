package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6g3, reason: invalid class name */
/* loaded from: 6g3.class */
public final class C6g3 {
    public final Uri A00;
    public final C1u3 A01;
    public final C6gk A02;
    public final C6gl A03;
    public final C1p8 A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C6g3(Uri uri, C1u3 c1u3, C6gk c6gk, C6gl c6gl, C1p8 c1p8, String str, String str2, boolean z, boolean z2, boolean z3) {
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, c1u3);
        this.A01 = c1u3;
        this.A02 = c6gk;
        this.A04 = c1p8;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        this.A05 = str;
        this.A06 = str2;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A03 = c6gl;
        this.A00 = uri;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6g3)) {
                return false;
            }
            C6g3 c6g3 = (C6g3) obj;
            if (this.A01 != c6g3.A01 || !11T.A0O(this.A02, c6g3.A02) || !11T.A0O(this.A04, c6g3.A04) || !11T.A0O(this.A05, c6g3.A05) || !11T.A0O(this.A06, c6g3.A06) || this.A07 != c6g3.A07 || this.A08 != c6g3.A08 || this.A09 != c6g3.A09 || !11T.A0O(this.A03, c6g3.A03) || !11T.A0O(this.A00, c6g3.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A02, C3o5.A03(this.A01) + 31)) * 31)), this.A07), this.A08), this.A09)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComposerButton{icon=");
        A0k.append(this.A01);
        A0k.append(", longClickListener=");
        A0k.append(this.A02);
        A0k.append(", moreDrawerIconBackgroundColorMapping=");
        A0k.append(this.A04);
        A0k.append(", moreDrawerPriority=");
        A0k.append(0);
        A0k.append(", name=");
        A0k.append(this.A05);
        A0k.append(", shortcutId=");
        A0k.append(this.A06);
        A0k.append(", shouldAnimateStickerHint=");
        A0k.append(this.A07);
        A0k.append(", shouldRenderCircleBackground=");
        A0k.append(this.A08);
        A0k.append(", shouldRenderStickerHint=");
        A0k.append(this.A09);
        A0k.append(", touchListener=");
        A0k.append(this.A03);
        A0k.append(", uri=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }
}
