package com.google.android.gms.auth.api.identity;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.JR0;
import X.LGn;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: AuthorizationResult.class */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(57);
    public final PendingIntent A00;
    public final GoogleSignInAccount A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final String A05;

    public AuthorizationResult(PendingIntent pendingIntent, GoogleSignInAccount googleSignInAccount, String str, String str2, String str3, List list) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = str3;
        AbstractC00481b7.A02(list);
        this.A04 = list;
        this.A00 = pendingIntent;
        this.A01 = googleSignInAccount;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AuthorizationResult) {
            AuthorizationResult authorizationResult = (AuthorizationResult) obj;
            if (AbstractC09524qc.A00(this.A02, authorizationResult.A02) && AbstractC09524qc.A00(this.A03, authorizationResult.A03) && AbstractC09524qc.A00(this.A05, authorizationResult.A05) && AbstractC09524qc.A00(this.A04, authorizationResult.A04) && AbstractC09524qc.A00(this.A00, authorizationResult.A00)) {
                z = JR0.A1X(this.A01, authorizationResult.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A05, this.A04, this.A00, this.A01});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A02, 1);
        AbstractC01153q8.A08(parcel, this.A03, 2);
        AbstractC01153q8.A08(parcel, this.A05, 3);
        AbstractC01153q8.A09(parcel, this.A04, 4);
        AbstractC01153q8.A07(parcel, this.A01, 5, i);
        AbstractC01153q8.A07(parcel, this.A00, 6, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
