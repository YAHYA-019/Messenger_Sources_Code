package com.facebook.xapp.messaging.reactions.sendbar.fragment;

import X.11T;
import X.7zP;
import X.7zS;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.reactions.sendbar.colorstrategy.ReactionsBarColorStrategyParams;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: ReactionsBarParams.class */
public final class ReactionsBarParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(62);
    public final int A00;
    public final int A01;
    public final ReactionsBarColorStrategyParams A02;
    public final Integer A03;
    public final String A04;
    public final EnumMap A05;
    public final List A06;
    public final Set A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public ReactionsBarParams(ReactionsBarColorStrategyParams reactionsBarColorStrategyParams, Integer num, String str, EnumMap enumMap, List list, Set set, int i, int i2, boolean z, boolean z2, boolean z3) {
        7zS.A17(2, list, str, num);
        7zP.A1M(reactionsBarColorStrategyParams, 7, enumMap);
        this.A07 = set;
        this.A06 = list;
        this.A01 = i;
        this.A04 = str;
        this.A03 = num;
        this.A09 = z;
        this.A02 = reactionsBarColorStrategyParams;
        this.A0A = z2;
        this.A05 = enumMap;
        this.A00 = i2;
        this.A08 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        11T.A0F(parcel, 0);
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
        parcel.writeStringList(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        switch (this.A03.intValue()) {
            case 1:
                str = "ACTION_DRAWER_ONLY";
                break;
            case 2:
                str = "REACTIONS_ONLY";
                break;
            case 3:
                str = "REACTIONS_AND_ACTION_BAR";
                break;
            default:
                str = "NONE";
                break;
        }
        parcel.writeString(str);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeSerializable(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A08 ? 1 : 0);
    }
}
