package com.facebookpay.form.cell.addresslist;

import X.11T;
import X.JQz;
import X.L93;
import X.MFp;
import X.QX4;
import android.content.Context;
import android.os.Parcel;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebookpay.form.cell.CellParams;

/* loaded from: AddressListHeaderCellParams.class */
public final class AddressListHeaderCellParams extends CellParams {
    public int A00;
    public int A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebookpay.form.cell.CellParams
    public MFp A00(Context context, ViewGroup.LayoutParams layoutParams) {
        11T.A0H(context, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        return (MFp) linearLayout;
    }

    @Override // com.facebookpay.form.cell.CellParams
    public /* bridge */ /* synthetic */ L93 A01() {
        return new QX4(this.A02, super.A02, this.A05, this.A03, this.A04);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        Integer num = this.A02;
        if (num != null) {
            JQz.A16(parcel, num);
        }
    }
}
