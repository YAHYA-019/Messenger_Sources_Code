package com.facebook.quicksilver.model;

import X.11T;
import X.AnonymousClass001;
import X.C2298Dji;
import X.DKF;
import X.FKW;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLCloudGamingVirtualGamepadKeycode;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: CloudGamingGredosVirtualGamepad.class */
public final class CloudGamingGredosVirtualGamepad implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(82);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final double A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final ImmutableList A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;

    /* JADX WARN: Multi-variable type inference failed */
    public CloudGamingGredosVirtualGamepad(C2298Dji c2298Dji) {
        11T.A0F(c2298Dji, 1);
        this.A0K = c2298Dji.getBooleanValue(-1609594047);
        this.A0L = c2298Dji.getBooleanValue(-404264951);
        this.A07 = c2298Dji.getIntValue(-653078265);
        this.A08 = c2298Dji.getIntValue(-1917927154);
        this.A09 = c2298Dji.getIntValue(171852375);
        this.A02 = c2298Dji.getDoubleValue(-1106363674);
        this.A03 = c2298Dji.getDoubleValue(106854733);
        this.A04 = c2298Dji.getDoubleValue(106854734);
        this.A05 = c2298Dji.getDoubleValue(109250890);
        this.A06 = c2298Dji.getDoubleValue(-645511976);
        this.A0C = c2298Dji.A0r(970405380);
        this.A0D = c2298Dji.A0r(-2129020825);
        this.A0E = c2298Dji.A0r(1448443576);
        this.A0F = c2298Dji.A0r(1434921384);
        this.A0H = c2298Dji.A0r(-624113587);
        this.A0G = c2298Dji.A0r(1440392096);
        String A0t = c2298Dji.A0t(GraphQLStringDefUtil.A00(), "GraphQLCloudGamingVirtualGamepadCollisionShape", -1706341292);
        this.A0B = A0t == null ? "CIRCLE" : A0t;
        String A0t2 = c2298Dji.A0t(GraphQLStringDefUtil.A00(), "GraphQLCloudGamingVirtualGamepadOrientation", 1857906773);
        this.A0I = A0t2 == null ? "NONE" : A0t2;
        String A0t3 = c2298Dji.A0t(GraphQLStringDefUtil.A00(), "GraphQLCloudGamingVirtualGamepadWidgetType", -923027371);
        this.A0J = A0t3 == null ? "BUTTON" : A0t3;
        ImmutableList A0d = c2298Dji.A0d(GraphQLStringDefUtil.A00(), "GraphQLCloudGamingVirtualGamepadKeycode", -815004468);
        11T.A0A(A0d);
        this.A0A = ImmutableList.copyOf((Collection) A0d);
        this.A00 = c2298Dji.getDoubleValue(-1654716197);
        this.A01 = c2298Dji.getDoubleValue(-1654716196);
    }

    public CloudGamingGredosVirtualGamepad(Parcel parcel) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            this.A0K = parcel.readBoolean();
            z = parcel.readBoolean();
        } else {
            this.A0K = true;
            z = false;
        }
        this.A0L = z;
        this.A07 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A02 = parcel.readDouble();
        this.A03 = parcel.readDouble();
        this.A04 = parcel.readDouble();
        this.A05 = parcel.readDouble();
        this.A06 = parcel.readDouble();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A0E = parcel.readString();
        this.A0F = parcel.readString();
        this.A0H = parcel.readString();
        this.A0G = parcel.readString();
        String readString = parcel.readString();
        this.A0B = readString != null ? GraphQLStringDefUtil.A00().ATw("GraphQLCloudGamingVirtualGamepadCollisionShape", readString) : "CIRCLE";
        String readString2 = parcel.readString();
        this.A0I = readString2 != null ? GraphQLStringDefUtil.A00().ATw("GraphQLCloudGamingVirtualGamepadOrientation", readString2) : "NONE";
        String readString3 = parcel.readString();
        this.A0J = readString3 != null ? GraphQLStringDefUtil.A00().ATw("GraphQLCloudGamingVirtualGamepadWidgetType", readString3) : "BUTTON";
        ArrayList A0s = AnonymousClass001.A0s();
        DKF.A1D(parcel, GraphQLCloudGamingVirtualGamepadKeycode.class, A0s);
        this.A0A = ImmutableList.copyOf((Collection) A0s);
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeBoolean(this.A0K);
            parcel.writeBoolean(this.A0L);
        }
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A04);
        parcel.writeDouble(this.A05);
        parcel.writeDouble(this.A06);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeList(this.A0A);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }
}
