package X;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: L2d.class */
public final class L2d {
    public Account A00;
    public String A01;
    public String A02;
    public Set A03;
    public boolean A04;
    public boolean A05;
    public String A06;
    public java.util.Map A07;
    public boolean A08;

    public L2d() {
        this.A03 = AnonymousClass001.A0v();
        this.A07 = AnonymousClass001.A0u();
    }

    public L2d(GoogleSignInOptions googleSignInOptions) {
        this.A03 = AnonymousClass001.A0v();
        this.A07 = AnonymousClass001.A0u();
        AbstractC00481b7.A02(googleSignInOptions);
        Parcelable.Creator creator = GoogleSignInOptions.CREATOR;
        this.A03 = AbF.A1E(googleSignInOptions.A08);
        this.A04 = googleSignInOptions.A09;
        this.A05 = googleSignInOptions.A0A;
        this.A08 = googleSignInOptions.A05;
        this.A01 = googleSignInOptions.A01;
        this.A00 = googleSignInOptions.A00;
        this.A06 = googleSignInOptions.A02;
        ArrayList arrayList = googleSignInOptions.A04;
        HashMap A0u = AnonymousClass001.A0u();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                A0u.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.A00), googleSignInOptionsExtensionParcelable);
            }
        }
        this.A07 = A0u;
        this.A02 = googleSignInOptions.A03;
    }

    public GoogleSignInOptions A00() {
        Set set = this.A03;
        if (set.contains(GoogleSignInOptions.A0H)) {
            Scope scope = GoogleSignInOptions.A0G;
            if (set.contains(scope)) {
                set.remove(scope);
            }
        }
        boolean z = this.A08;
        if (z && (this.A00 == null || !set.isEmpty())) {
            set.add(GoogleSignInOptions.A0F);
        }
        ArrayList A17 = 1BK.A17(set);
        Account account = this.A00;
        boolean z2 = this.A04;
        boolean z3 = this.A05;
        return new GoogleSignInOptions(account, this.A01, this.A06, this.A02, A17, this.A07, 3, z, z2, z3);
    }
}
