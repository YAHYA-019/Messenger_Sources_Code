package com.facebook.messaging.montage.model.art;

import X.2JX;
import X.C53v;
import X.CST;
import X.H9b;
import X.H9c;
import X.HA0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLStringDefUtil;

/* loaded from: ArtAssetDimensions.class */
public final class ArtAssetDimensions implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(2);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final HA0 A04;
    public final H9b A05;
    public final H9c A06;

    public ArtAssetDimensions(HA0 ha0, H9b h9b, H9c h9c, double d, double d2, double d3, double d4) {
        this.A03 = (float) d;
        this.A00 = (float) d2;
        this.A01 = (float) d3;
        this.A02 = (float) d4;
        this.A04 = ha0;
        this.A05 = h9b;
        this.A06 = h9c;
    }

    public ArtAssetDimensions(Parcel parcel) {
        this.A03 = parcel.readFloat();
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A04 = C53v.A07(parcel, HA0.class);
        this.A05 = (H9b) C53v.A07(parcel, H9b.class);
        this.A06 = (H9c) C53v.A07(parcel, H9c.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ArtAssetDimensions A00(2JX r301, 2JX r302, 2JX r303) {
        double d;
        double d2;
        double d3;
        double d4;
        H9b h9b;
        H9c h9c;
        if (r301 != null) {
            d = r301.getDoubleValue(113126854);
            d2 = r301.getDoubleValue(-1221029593);
        } else {
            d = 0.0d;
            d2 = 0.0d;
        }
        if (r302 != null) {
            d3 = r302.getDoubleValue(-1626102044);
            d4 = r302.getDoubleValue(35219410);
        } else {
            d3 = 0.0d;
            d4 = 0.0d;
        }
        HA0 ha0 = HA0.A04;
        if (r303 != null) {
            String A0t = r303.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerMontageAssetHorizontalAlignmentType", -618494286);
            switch (A0t.hashCode()) {
                case 2332679:
                    if (A0t.equals("LEFT")) {
                        h9b = H9b.LEFT;
                        break;
                    }
                    h9b = H9b.CENTER;
                    break;
                case 77974012:
                    if (A0t.equals("RIGHT")) {
                        h9b = H9b.RIGHT;
                        break;
                    }
                    h9b = H9b.CENTER;
                    break;
                default:
                    h9b = H9b.CENTER;
                    break;
            }
            String A0t2 = r303.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerMontageAssetVerticalAlignmentType", -657136764);
            switch (A0t2.hashCode()) {
                case 83253:
                    if (A0t2.equals("TOP")) {
                        h9c = H9c.TOP;
                        break;
                    }
                    h9c = H9c.CENTER;
                    break;
                case 1965067819:
                    if (A0t2.equals("BOTTOM")) {
                        h9c = H9c.BOTTOM;
                        break;
                    }
                    h9c = H9c.CENTER;
                    break;
                default:
                    h9c = H9c.CENTER;
                    break;
            }
        } else {
            h9b = H9b.CENTER;
            h9c = H9c.CENTER;
        }
        return new ArtAssetDimensions(ha0, h9b, h9c, d, d2, d3, d4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        C53v.A0J(parcel, this.A04);
        C53v.A0J(parcel, this.A05);
        C53v.A0J(parcel, this.A06);
    }
}
