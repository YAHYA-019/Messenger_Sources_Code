package com.facebookpay.form.cell.addresslist;

import X.11T;
import X.L93;
import X.MFp;
import X.Q1Z;
import X.QX8;
import android.content.Context;
import android.os.Parcel;
import android.view.ViewGroup;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.logging.LoggingContext;
import java.util.List;

/* loaded from: AddressListCellParams.class */
public final class AddressListCellParams extends CellParams {
    public int A00;
    public BaseCheckoutItem A01;
    public LoggingContext A02;
    public List A03;
    public boolean A04;

    @Override // com.facebookpay.form.cell.CellParams
    public MFp A00(Context context, ViewGroup.LayoutParams layoutParams) {
        11T.A0H(context, layoutParams);
        Q1Z q1z = new Q1Z(context);
        q1z.setLayoutParams(layoutParams);
        return (MFp) q1z;
    }

    @Override // com.facebookpay.form.cell.CellParams
    public /* bridge */ /* synthetic */ L93 A01() {
        int i = super.A02;
        boolean z = this.A05;
        List list = this.A03;
        return new QX8(this.A01, this.A02, list, i, this.A00, z, this.A04);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
