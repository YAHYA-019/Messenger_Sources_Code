package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.9ky, reason: invalid class name */
/* loaded from: 9ky.class */
public final class C9ky {
    public int A00;
    public C98S A01;
    public C1u3 A02;
    public boolean A05;
    public Set A04 = AnonymousClass001.A0v();
    public String A03 = "";

    public static void A00(Context context, C9ky c9ky, int i) {
        String string = context.getString(i);
        c9ky.A03 = string;
        C1pq.A08("title", string);
    }

    public static void A01(C9ky c9ky, int i) {
        c9ky.A00 = i;
        c9ky.A05 = false;
    }

    public void A02(C1u3 c1u3) {
        this.A02 = c1u3;
        if (this.A04.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            return;
        }
        HashSet hashSet = new HashSet(this.A04);
        this.A04 = hashSet;
        hashSet.add(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
    }
}
