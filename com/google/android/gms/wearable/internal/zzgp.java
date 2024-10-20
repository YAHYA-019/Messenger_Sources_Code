package com.google.android.gms.wearable.internal;

import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzgp.class */
public final class zzgp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(69);
    public final String A00;
    public final String A01;
    public final byte[] A02;
    public final int A03;

    public zzgp(int i, byte[] bArr, String str, String str2) {
        this.A03 = i;
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = str2;
    }

    public final String toString() {
        int i = this.A03;
        String str = this.A00;
        byte[] bArr = this.A02;
        String obj = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MessageEventParcelable[");
        A0k.append(i);
        A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0k.append(str);
        A0k.append(", size=");
        A0k.append(obj);
        return AnonymousClass001.A0d("]", A0k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 2, this.A03);
        AbstractC01153q8.A08(parcel, this.A00, 3);
        AbstractC01153q8.A0B(parcel, this.A02, 4);
        AbstractC01153q8.A08(parcel, this.A01, 5);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
