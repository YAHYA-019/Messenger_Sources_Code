package com.facebookpay.form.cell.label.paymentmethod;

import X.11T;
import X.L93;
import X.LGp;
import X.MFp;
import X.QX3;
import android.content.Context;
import android.os.Parcel;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebookpay.form.cell.CellParams;
import java.util.List;

/* loaded from: SupportedLogosCellParams.class */
public final class SupportedLogosCellParams extends CellParams {
    public static final LGp CREATOR = LGp.A00(67);
    public List A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebookpay.form.cell.CellParams
    public MFp A00(Context context, ViewGroup.LayoutParams layoutParams) {
        11T.A0H(context, layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        return (MFp) frameLayout;
    }

    @Override // com.facebookpay.form.cell.CellParams
    public /* bridge */ /* synthetic */ L93 A01() {
        return new QX3(this.A00, this.A02, this.A05);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A00);
    }
}
