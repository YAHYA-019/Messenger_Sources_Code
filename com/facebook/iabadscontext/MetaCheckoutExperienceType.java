package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.C00t;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: MetaCheckoutExperienceType.class */
public final class MetaCheckoutExperienceType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MetaCheckoutExperienceType[] A01;
    public static final MetaCheckoutExperienceType A02;
    public static final MetaCheckoutExperienceType A03;
    public static final MetaCheckoutExperienceType A04;
    public static final Parcelable.Creator CREATOR;

    static {
        MetaCheckoutExperienceType metaCheckoutExperienceType = new MetaCheckoutExperienceType("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A04 = metaCheckoutExperienceType;
        MetaCheckoutExperienceType metaCheckoutExperienceType2 = new MetaCheckoutExperienceType("BAU_WEB_CHECKOUT", 1);
        A02 = metaCheckoutExperienceType2;
        MetaCheckoutExperienceType metaCheckoutExperienceType3 = new MetaCheckoutExperienceType("ONSITE_SHOPIFY_SDK_CHECKOUT", 2);
        A03 = metaCheckoutExperienceType3;
        MetaCheckoutExperienceType[] metaCheckoutExperienceTypeArr = {metaCheckoutExperienceType, metaCheckoutExperienceType2, metaCheckoutExperienceType3};
        A01 = metaCheckoutExperienceTypeArr;
        A00 = C00t.A00(metaCheckoutExperienceTypeArr);
        CREATOR = FKf.A01(9);
    }

    public MetaCheckoutExperienceType(String str, int i) {
    }

    public static MetaCheckoutExperienceType valueOf(String str) {
        return (MetaCheckoutExperienceType) Enum.valueOf(MetaCheckoutExperienceType.class, str);
    }

    public static MetaCheckoutExperienceType[] values() {
        return (MetaCheckoutExperienceType[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this);
    }
}
