package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: L3o.class */
public final class L3o {
    public static final L3o A01 = new L3o(Ls1.A02);
    public final Ls1 A00;

    public L3o(Ls1 ls1) {
        this.A00 = ls1;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof L3o) && 11T.A0O(this.A00, ((L3o) obj).A00));
    }

    public int hashCode() {
        return 1BK.A03(this.A00, -532689276);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        4YV.A1Q(A0k, "ImeOptions(singleLine=");
        A0k.append(", capitalization=");
        A0k.append((Object) "None");
        A0k.append(", autoCorrect=");
        A0k.append(true);
        A0k.append(", keyboardType=");
        A0k.append((Object) "Text");
        A0k.append(", imeAction=");
        A0k.append((Object) ServerW3CShippingAddressConstants.DEFAULT);
        DKG.A1X(A0k, ", platformImeOptions=");
        A0k.append(", hintLocales=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
