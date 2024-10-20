package com.google.android.gms.auth.api.identity;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.JQx;
import X.LGn;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: AuthorizationRequest.class */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(56);
    public final Account A00;
    public final Bundle A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public AuthorizationRequest(Account account, Bundle bundle, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (list != null && !list.isEmpty()) {
            z4 = true;
        }
        AbstractC00481b7.A08(z4, "requestedScopes cannot be null or empty");
        this.A05 = list;
        this.A02 = str;
        this.A06 = z;
        this.A07 = z2;
        this.A00 = account;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = z3;
        this.A01 = bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.AuthorizationRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A02, Boolean.valueOf(this.A06), Boolean.valueOf(this.A08), Boolean.valueOf(this.A07), this.A00, this.A03, this.A04, this.A01});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0A(parcel, this.A05, 1);
        AbstractC01153q8.A08(parcel, this.A02, 2);
        AbstractC01153q8.A06(parcel, 3, this.A06);
        AbstractC01153q8.A06(parcel, 4, this.A07);
        AbstractC01153q8.A07(parcel, this.A00, 5, i);
        AbstractC01153q8.A08(parcel, this.A03, 6);
        AbstractC01153q8.A08(parcel, this.A04, 7);
        AbstractC01153q8.A06(parcel, 8, this.A08);
        AbstractC01153q8.A02(this.A01, parcel, 9);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
