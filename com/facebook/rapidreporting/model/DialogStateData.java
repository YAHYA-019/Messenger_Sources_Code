package com.facebook.rapidreporting.model;

import X.1BK;
import X.1BL;
import X.1Du;
import X.2JX;
import X.2JY;
import X.7zN;
import X.AbG;
import X.AbI;
import X.AnonymousClass001;
import X.C2221Dhd;
import X.C53v;
import X.DKF;
import X.DKH;
import X.EM2;
import X.FJ8;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.guidedaction.GuidedActionItem;
import com.facebook.rapidreporting.util.Range;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: DialogStateData.class */
public final class DialogStateData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(87);
    public 2JX A00;
    public 2JX A01;
    public 2JX A02;
    public C2221Dhd A03;
    public EM2 A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final DialogConfig A0I;
    public final List A0J;
    public final Set A0K;
    public final List A0L;

    public DialogStateData(Parcel parcel) {
        this.A04 = EM2.A03;
        this.A06 = null;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0J = A0s;
        this.A08 = null;
        this.A0E = false;
        this.A0A = true;
        this.A0H = false;
        this.A09 = AnonymousClass001.A0s();
        this.A0G = false;
        this.A0F = false;
        ArrayList A0s2 = AnonymousClass001.A0s();
        this.A0L = A0s2;
        this.A0D = false;
        this.A0C = false;
        this.A0B = false;
        HashSet A0v = AnonymousClass001.A0v();
        this.A0K = A0v;
        this.A0I = (DialogConfig) 1BL.A0C(parcel, DialogConfig.class);
        this.A04 = EM2.values()[parcel.readInt()];
        this.A03 = (C2221Dhd) FJ8.A01(parcel);
        this.A00 = FJ8.A01(parcel);
        this.A06 = parcel.readString();
        DKF.A1D(parcel, Tag.class, A0s);
        this.A08 = parcel.readString();
        this.A0E = DKH.A1Y(parcel);
        this.A0A = DKH.A1Y(parcel);
        this.A0H = DKH.A1Y(parcel);
        ArrayList A0s3 = AnonymousClass001.A0s();
        this.A09 = A0s3;
        DKF.A1D(parcel, GuidedActionItem.class, A0s3);
        this.A0G = DKH.A1Y(parcel);
        this.A0F = C53v.A0S(parcel);
        parcel.readStringList(A0s2);
        this.A0D = DKH.A1Y(parcel);
        this.A02 = FJ8.A01(parcel);
        this.A0C = DKH.A1Y(parcel);
        this.A0B = DKH.A1Y(parcel);
        this.A05 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.readStringList(createStringArrayList);
        A0v.addAll(createStringArrayList);
    }

    public DialogStateData(DialogConfig dialogConfig) {
        this.A04 = EM2.A03;
        this.A06 = null;
        this.A0J = AnonymousClass001.A0s();
        this.A08 = null;
        this.A0E = false;
        this.A0A = true;
        this.A0H = false;
        this.A09 = AnonymousClass001.A0s();
        this.A0G = false;
        this.A0F = false;
        this.A0L = AnonymousClass001.A0s();
        this.A0D = false;
        this.A0C = false;
        this.A0B = false;
        this.A0K = AnonymousClass001.A0v();
        this.A0I = dialogConfig;
    }

    public ImmutableList A00() {
        2JY A0B;
        C2221Dhd c2221Dhd = this.A03;
        if (c2221Dhd == null || (A0B = 1BK.A0B(c2221Dhd, 2JX.class, -2060497896, 177872488)) == null) {
            return null;
        }
        return Range.A00(A0B.A0c(-938283306, 2JX.class, -222063131));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        if (r301.A0D == false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, com.facebook.guidedaction.GuidedActionItem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList A01() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rapidreporting.model.DialogStateData.A01():com.google.common.collect.ImmutableList");
    }

    public void A02(C2221Dhd c2221Dhd) {
        ImmutableList A0Z = c2221Dhd.A0Z(-311781630);
        if (A0Z != null) {
            this.A0K.addAll(A0Z);
        }
        this.A03 = c2221Dhd;
        List list = this.A0J;
        list.clear();
        1Du A0v = AbI.A0v(c2221Dhd, 2JX.class, -246564796, 2010689673);
        while (A0v.hasNext()) {
            list.add(new Tag(AbG.A0D(A0v)));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A0I, 0);
        7zN.A0z(parcel, this.A04);
        FJ8.A0A(parcel, this.A03);
        FJ8.A0A(parcel, this.A00);
        parcel.writeString(this.A06);
        parcel.writeList(this.A0J);
        parcel.writeString(this.A08);
        DKF.A1F(parcel, this.A0E);
        DKF.A1F(parcel, this.A0A);
        DKF.A1F(parcel, this.A0H);
        parcel.writeList(this.A09);
        DKF.A1F(parcel, this.A0G);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeStringList(this.A0L);
        DKF.A1F(parcel, this.A0D);
        FJ8.A0A(parcel, this.A02);
        DKF.A1F(parcel, this.A0C);
        DKF.A1F(parcel, this.A0B);
        parcel.writeString(this.A05);
        parcel.writeStringList(1BK.A17(this.A0K));
    }
}
