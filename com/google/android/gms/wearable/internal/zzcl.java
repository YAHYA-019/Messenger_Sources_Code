package com.google.android.gms.wearable.internal;

import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.GOq;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: zzcl.class */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(68);
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public zzcl(List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zzcl)) {
                return false;
            }
            zzcl zzclVar = (zzcl) obj;
            if (this.A00 != zzclVar.A00 || this.A02 != zzclVar.A02 || this.A03 != zzclVar.A03 || this.A04 != zzclVar.A04 || this.A05 != zzclVar.A05) {
                return false;
            }
            List list = zzclVar.A01;
            List list2 = this.A01;
            if (list2 != null) {
                if (list == null || !list2.containsAll(list) || list2.size() != list.size()) {
                    return false;
                }
            } else if (list2 != list) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A02), Boolean.valueOf(this.A03), Boolean.valueOf(this.A04), Boolean.valueOf(this.A05), this.A01});
    }

    public final String toString() {
        int i = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        boolean z4 = this.A05;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ConsentResponse {statusCode =");
        A0k.append(i);
        A0k.append(", hasTosConsent =");
        A0k.append(z);
        A0k.append(", hasLoggingConsent =");
        A0k.append(z2);
        A0k.append(", hasCloudSyncConsent =");
        A0k.append(z3);
        A0k.append(", hasLocationConsent =");
        A0k.append(z4);
        A0k.append(", accountConsentRecords =");
        return GOq.A12(valueOf, A0k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        AbstractC01153q8.A06(parcel, 2, this.A02);
        AbstractC01153q8.A06(parcel, 3, this.A03);
        AbstractC01153q8.A06(parcel, 4, this.A04);
        AbstractC01153q8.A06(parcel, 5, this.A05);
        AbstractC01153q8.A0A(parcel, this.A01, 6);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
