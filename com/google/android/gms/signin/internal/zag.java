package com.google.android.gms.signin.internal;

import X.28W;
import X.AbstractC01153q8;
import X.JQx;
import X.JQy;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: zag.class */
public final class zag extends AbstractSafeParcelable implements 28W {
    public static final Parcelable.Creator CREATOR = LGm.A00(47);
    public final String A00;
    public final List A01;

    public zag(String str, List list) {
        this.A01 = list;
        this.A00 = str;
    }

    public final Status BCJ() {
        return this.A00 != null ? Status.A08 : Status.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A01;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A09(parcel, list, 1);
        JQy.A16(parcel, this.A00, A0E);
    }
}
