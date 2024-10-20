package com.facebook.threadview.adminmessage;

import X.1BL;
import X.AbN;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.dialog.MenuDialogParams;
import com.facebook.messaging.threadview.messagelist.item.adminmessage.PlatformAdminMessageGameUpdate$3;

/* loaded from: AdminMessageReactionsConfig.class */
public final class AdminMessageReactionsConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(78);
    public final MenuDialogParams A00;
    public final PlatformAdminMessageGameUpdate$3 A01;
    public final boolean A02;

    public AdminMessageReactionsConfig(Parcel parcel) {
        this.A00 = (MenuDialogParams) 1BL.A0C(parcel, MenuDialogParams.class);
        this.A02 = AbN.A1U(parcel);
        this.A01 = (PlatformAdminMessageGameUpdate$3) 1BL.A0C(parcel, PlatformAdminMessageGameUpdate$3.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }
}
