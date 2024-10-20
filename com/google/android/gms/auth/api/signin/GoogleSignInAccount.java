package com.google.android.gms.auth.api.signin;

import X.AbF;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.LGn;
import X.Lct;
import X.MCv;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: GoogleSignInAccount.class */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public String A00;
    public final int A01;
    public final long A02;
    public final Uri A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final Set A0C = AnonymousClass001.A0v();
    public static final Parcelable.Creator CREATOR = LGn.A00(71);
    public static final MCv A0D = Lct.A00;

    public GoogleSignInAccount(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, long j) {
        this.A01 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = uri;
        this.A00 = str5;
        this.A02 = j;
        this.A08 = str6;
        this.A0B = list;
        this.A09 = str7;
        this.A0A = str8;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof GoogleSignInAccount)) {
                return false;
            }
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            if (!googleSignInAccount.A08.equals(this.A08)) {
                return false;
            }
            HashSet A1E = AbF.A1E(googleSignInAccount.A0B);
            A1E.addAll(googleSignInAccount.A0C);
            HashSet A1E2 = AbF.A1E(this.A0B);
            A1E2.addAll(this.A0C);
            if (!A1E.equals(A1E2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A08.hashCode() + 527;
        HashSet A1E = AbF.A1E(this.A0B);
        A1E.addAll(this.A0C);
        return (hashCode * 31) + A1E.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A01);
        AbstractC01153q8.A08(parcel, this.A04, 2);
        AbstractC01153q8.A08(parcel, this.A05, 3);
        AbstractC01153q8.A08(parcel, this.A06, 4);
        AbstractC01153q8.A08(parcel, this.A07, 5);
        AbstractC01153q8.A07(parcel, this.A03, 6, i);
        AbstractC01153q8.A08(parcel, this.A00, 7);
        AbstractC01153q8.A05(parcel, 8, this.A02);
        AbstractC01153q8.A08(parcel, this.A08, 9);
        AbstractC01153q8.A0A(parcel, this.A0B, 10);
        AbstractC01153q8.A08(parcel, this.A09, 11);
        AbstractC01153q8.A08(parcel, this.A0A, 12);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
