package com.facebook.payments.p2p.messenger.core.prefs.transactions;

import X.AbN;
import X.C53v;
import X.FJ8;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: MessengerPayHistoryLoaderResult.class */
public final class MessengerPayHistoryLoaderResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(81);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final boolean A02;

    public MessengerPayHistoryLoaderResult(Parcel parcel) {
        this.A01 = AbN.A0e(parcel, PaymentTransaction.class);
        ArrayList A06 = FJ8.A06(parcel);
        this.A00 = A06 != null ? ImmutableList.copyOf((Collection) A06) : ImmutableList.of();
        this.A02 = C53v.A0S(parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r303 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessengerPayHistoryLoaderResult(com.google.common.collect.ImmutableList r302, com.google.common.collect.ImmutableList r303, boolean r304) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            if (r0 != 0) goto Lf
            r0 = 0
            r305 = r0
            r0 = r303
            if (r0 == 0) goto L12
        Lf:
            r0 = 1
            r305 = r0
        L12:
            r0 = r305
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r301
            r1 = r302
            r0.A01 = r1
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.p2p.messenger.core.prefs.transactions.MessengerPayHistoryLoaderResult.<init>(com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, boolean):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        FJ8.A0B(parcel, this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
