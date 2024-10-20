package com.google.android.gms.wearable.internal;

import X.0Pz;
import X.1BJ;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.LGm;
import X.MKD;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzbj.class */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(64);
    public final int A00;
    public final int A01;
    public final int A02;
    public final zzbu A03;

    public zzbj(zzbu zzbuVar, int i, int i2, int i3) {
        this.A03 = zzbuVar;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void A00(MKD mkd) {
        int i = this.A00;
        if (i == 1) {
            mkd.Bnm(this.A03);
            return;
        }
        if (i == 2) {
            mkd.Bnl(this.A03, this.A01, this.A02);
            return;
        }
        if (i == 3) {
            mkd.C1u(this.A03, this.A01, this.A02);
        } else if (i != 4) {
            Log.w("ChannelEventParcelable", 0Pz.A0T(1BJ.A00(319), i));
        } else {
            mkd.CAQ(this.A03, this.A01, this.A02);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A03);
        int i = this.A00;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.A01;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.A02;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ChannelEventParcelable[, channel=");
        A0k.append(valueOf);
        A0k.append(", type=");
        A0k.append(num);
        A0k.append(", closeReason=");
        A0k.append(num2);
        A0k.append(", appErrorCode=");
        A0k.append(i3);
        return AnonymousClass001.A0d("]", A0k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A03, 2, i);
        AbstractC01153q8.A04(parcel, 3, this.A00);
        AbstractC01153q8.A04(parcel, 4, this.A01);
        AbstractC01153q8.A04(parcel, 5, this.A02);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
