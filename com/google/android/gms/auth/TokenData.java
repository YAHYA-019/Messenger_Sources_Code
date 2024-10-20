package com.google.android.gms.auth;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.JR0;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: TokenData.class */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(78);
    public final int A00;
    public final String A01;
    public final Long A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public TokenData(Long l, String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        AbstractC00481b7.A04(str);
        this.A01 = str;
        this.A02 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            if (TextUtils.equals(this.A01, tokenData.A01) && AbstractC09524qc.A00(this.A02, tokenData.A02) && this.A05 == tokenData.A05 && this.A06 == tokenData.A06 && AbstractC09524qc.A00(this.A04, tokenData.A04)) {
                z = JR0.A1X(this.A03, tokenData.A03);
            }
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A04, this.A03});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        AbstractC01153q8.A08(parcel, this.A01, 2);
        Long l = this.A02;
        if (l != null) {
            parcel.writeInt(524291);
            parcel.writeLong(l.longValue());
        }
        AbstractC01153q8.A06(parcel, 4, this.A05);
        AbstractC01153q8.A06(parcel, 5, this.A06);
        AbstractC01153q8.A09(parcel, this.A04, 6);
        AbstractC01153q8.A08(parcel, this.A03, 7);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
