package com.facebook.rapidreporting.model;

import X.1BK;
import X.1Du;
import X.2JX;
import X.2JY;
import X.AbG;
import X.AbI;
import X.AnonymousClass001;
import X.DKF;
import X.DKH;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLRRTagAdditionalInputType;
import java.util.ArrayList;

/* loaded from: Tag.class */
public final class Tag implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(88);
    public Tag A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public final ArrayList A0B;

    public Tag(2JX r302) {
        this.A0B = AnonymousClass001.A0s();
        this.A08 = true;
        2JY A0R = r302.A0R(2JX.class, -774249549);
        if (A0R != null) {
            this.A05 = A0R.A0i();
        }
        this.A06 = r302.A0r(-763807553);
        this.A09 = r302.getBooleanValue(1191572123);
        this.A07 = r302.getBooleanValue(499069567);
        this.A0A = r302.getIntValue(-1165461084);
        this.A08 = r302.getBooleanValue(-1916279311);
        this.A00 = null;
        1Du A0v = AbI.A0v(r302, 2JX.class, -2079582536, -2130358826);
        while (A0v.hasNext()) {
            this.A0B.add(new Tag(AbG.A0D(A0v), this));
        }
        2JY A0B = 1BK.A0B(r302, 2JX.class, -1035029999, 879902191);
        if (A0B != null) {
            this.A04 = A0B.A0i();
        }
        Enum A0g = r302.A0g(GraphQLRRTagAdditionalInputType.A01, 628210098);
        if (A0g != null) {
            this.A02 = A0g.toString();
        }
        2JY A0B2 = 1BK.A0B(r302, 2JX.class, 1581822347, -998435837);
        if (A0B2 != null) {
            this.A01 = A0B2.A0i();
        }
    }

    public Tag(2JX r302, Tag tag) {
        this.A0B = AnonymousClass001.A0s();
        this.A08 = true;
        2JY A0R = r302.A0R(2JX.class, 1766308393);
        if (A0R != null) {
            this.A05 = A0R.A0i();
        }
        this.A06 = r302.A0r(-763807553);
        this.A08 = r302.getBooleanValue(-1916279311);
        this.A09 = r302.getBooleanValue(1191572123);
        this.A07 = r302.getBooleanValue(499069567);
        this.A0A = r302.getIntValue(-1165461084);
        this.A00 = tag;
        Enum A0g = r302.A0g(GraphQLRRTagAdditionalInputType.A01, 628210098);
        if (A0g != null) {
            this.A02 = A0g.toString();
        }
        2JY A0B = 1BK.A0B(r302, 2JX.class, 1581822347, -1330226816);
        if (A0B != null) {
            this.A01 = A0B.A0i();
        }
    }

    public Tag(Parcel parcel) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0B = A0s;
        this.A08 = true;
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A09 = DKH.A1Y(parcel);
        this.A07 = DKH.A1Y(parcel);
        this.A0A = parcel.readInt();
        DKF.A1D(parcel, Tag.class, A0s);
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A08 = DKH.A1Y(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        DKF.A1F(parcel, this.A09);
        DKF.A1F(parcel, this.A07);
        parcel.writeInt(this.A0A);
        parcel.writeList(this.A0B);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        DKF.A1F(parcel, this.A08);
    }
}
