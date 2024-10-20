package com.facebookpay.form.cell.label;

import X.AnonymousClass001;
import X.Jx7;
import X.LGp;
import X.MFp;
import X.Q1a;
import X.QXD;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.facebookpay.form.cell.CellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: LabelCellParams.class */
public class LabelCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = LGp.A00(65);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final ImmutableList A05;
    public final String A06;
    public final int A07;
    public final int A08;

    public LabelCellParams(Jx7 jx7) {
        super(jx7);
        this.A06 = null;
        this.A02 = jx7.A03;
        this.A05 = jx7.A06;
        this.A03 = jx7.A07 ? 2132542126 : 2132542129;
        this.A04 = jx7.A04;
        this.A00 = jx7.A00;
        this.A01 = jx7.A02;
        this.A08 = jx7.A05;
        this.A07 = jx7.A01;
    }

    public LabelCellParams(Parcel parcel) {
        super(parcel);
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readList(A0s, LinkParams.class.getClassLoader());
        this.A05 = ImmutableList.copyOf((Collection) A0s);
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A07 = parcel.readInt();
    }

    @Override // com.facebookpay.form.cell.CellParams
    public MFp A00(Context context, ViewGroup.LayoutParams layoutParams) {
        Q1a q1a = new Q1a(context, this.A03);
        q1a.setLayoutParams(layoutParams);
        return (MFp) q1a;
    }

    @Override // com.facebookpay.form.cell.CellParams
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public QXD A01() {
        int i = super.A02;
        boolean z = super.A06;
        boolean z2 = super.A05;
        return new QXD(this.A05, this.A06, i, this.A02, this.A04, this.A00, this.A01, this.A08, this.A07, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeList(this.A05);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A07);
    }
}
