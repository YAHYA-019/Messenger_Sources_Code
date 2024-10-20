package com.facebook.privacy.model;

import X.09K;
import X.1BK;
import X.1BL;
import X.1Du;
import X.2JX;
import X.2JY;
import X.4YV;
import X.AbstractC3303Jpy;
import X.AnonymousClass001;
import X.C53v;
import X.EXR;
import X.FJ8;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.privacy.uafprivacyoption.UAFPrivacyOption;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: PrivacyOptionsResult.class */
public final class PrivacyOptionsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(61);
    public final ImmutableList audiencePickerDescriptionFromServer;
    public final ImmutableList basicPrivacyOptions;
    public final 2JX defaultPrivacyInfo;
    public final AbstractC3303Jpy earlyAccessStrings;
    public final ImmutableList expandablePrivacyOptionIndices;
    public final ImmutableList friendListPrivacyOptions;
    public final boolean isResultFromServer;
    public final boolean isSelectedOptionExternal;
    public final ImmutableList primaryOptionIndices;
    public final String privacyWriteId;
    public final UAFPrivacyOption recentPrivacyOption;
    public final int recentPrivacyOptionIndex;
    public final UAFPrivacyOption selectedPrivacyOption;
    public final int selectedPrivacyOptionIndex;

    public PrivacyOptionsResult() {
        this.basicPrivacyOptions = ImmutableList.of();
        this.friendListPrivacyOptions = ImmutableList.of();
        this.primaryOptionIndices = ImmutableList.of();
        this.expandablePrivacyOptionIndices = ImmutableList.of();
        this.selectedPrivacyOptionIndex = -1;
        this.selectedPrivacyOption = null;
        this.defaultPrivacyInfo = null;
        this.audiencePickerDescriptionFromServer = null;
        this.privacyWriteId = null;
        this.recentPrivacyOptionIndex = -1;
        this.recentPrivacyOption = null;
        this.isSelectedOptionExternal = false;
        this.isResultFromServer = false;
        this.earlyAccessStrings = null;
    }

    public PrivacyOptionsResult(Parcel parcel) {
        Parcelable.Creator creator = UAFPrivacyOption.CREATOR;
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, creator);
        this.basicPrivacyOptions = ImmutableList.copyOf((Collection) A0s);
        ArrayList A0s2 = AnonymousClass001.A0s();
        parcel.readTypedList(A0s2, creator);
        this.friendListPrivacyOptions = ImmutableList.copyOf((Collection) A0s2);
        AbstractCollection A0y = 4YV.A0y(parcel, Integer.class);
        this.primaryOptionIndices = A0y == null ? ImmutableList.of() : A0y instanceof ImmutableList ? (ImmutableList) A0y : ImmutableList.copyOf((Collection) A0y);
        AbstractCollection A0y2 = 4YV.A0y(parcel, Integer.class);
        this.expandablePrivacyOptionIndices = A0y2 == null ? ImmutableList.of() : A0y2 instanceof ImmutableList ? (ImmutableList) A0y2 : ImmutableList.copyOf((Collection) A0y2);
        this.selectedPrivacyOptionIndex = parcel.readInt();
        this.selectedPrivacyOption = A00((UAFPrivacyOption) 1BL.A0C(parcel, UAFPrivacyOption.class));
        this.defaultPrivacyInfo = FJ8.A01(parcel);
        ArrayList A06 = FJ8.A06(parcel);
        this.audiencePickerDescriptionFromServer = A06 == null ? null : ImmutableList.copyOf((Collection) A06);
        this.privacyWriteId = parcel.readString();
        this.recentPrivacyOptionIndex = parcel.readInt();
        this.recentPrivacyOption = A00((UAFPrivacyOption) 1BL.A0C(parcel, UAFPrivacyOption.class));
        this.isSelectedOptionExternal = C53v.A0S(parcel);
        this.isResultFromServer = C53v.A0S(parcel);
        FJ8.A01(parcel);
        this.earlyAccessStrings = null;
    }

    private UAFPrivacyOption A00(UAFPrivacyOption uAFPrivacyOption) {
        1Du it = this.basicPrivacyOptions.iterator();
        while (it.hasNext()) {
            UAFPrivacyOption uAFPrivacyOption2 = (UAFPrivacyOption) it.next();
            if (EXR.A00(uAFPrivacyOption2, uAFPrivacyOption)) {
                return uAFPrivacyOption2;
            }
        }
        1Du it2 = this.friendListPrivacyOptions.iterator();
        while (it2.hasNext()) {
            UAFPrivacyOption uAFPrivacyOption3 = (UAFPrivacyOption) it2.next();
            if (EXR.A00(uAFPrivacyOption3, uAFPrivacyOption)) {
                return uAFPrivacyOption3;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivacyOptionsResult)) {
            return false;
        }
        PrivacyOptionsResult privacyOptionsResult = (PrivacyOptionsResult) obj;
        if (this.basicPrivacyOptions.size() != privacyOptionsResult.basicPrivacyOptions.size()) {
            return false;
        }
        for (int i = 0; i < this.basicPrivacyOptions.size(); i++) {
            if (!EXR.A00((UAFPrivacyOption) this.basicPrivacyOptions.get(i), (UAFPrivacyOption) privacyOptionsResult.basicPrivacyOptions.get(i))) {
                return false;
            }
        }
        if (this.friendListPrivacyOptions.size() != privacyOptionsResult.friendListPrivacyOptions.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.friendListPrivacyOptions.size(); i2++) {
            if (!EXR.A00((UAFPrivacyOption) this.friendListPrivacyOptions.get(i2), (UAFPrivacyOption) privacyOptionsResult.friendListPrivacyOptions.get(i2))) {
                return false;
            }
        }
        boolean A01 = 09K.A01(this.primaryOptionIndices);
        boolean A012 = 09K.A01(privacyOptionsResult.primaryOptionIndices);
        if (A01 ^ A012) {
            return false;
        }
        if (!A01 && !A012 && !this.primaryOptionIndices.equals(privacyOptionsResult.primaryOptionIndices)) {
            return false;
        }
        boolean A013 = 09K.A01(this.expandablePrivacyOptionIndices);
        boolean A014 = 09K.A01(privacyOptionsResult.expandablePrivacyOptionIndices);
        if (A013 ^ A014) {
            return false;
        }
        if ((!A013 && !A014 && !this.expandablePrivacyOptionIndices.equals(privacyOptionsResult.expandablePrivacyOptionIndices)) || this.selectedPrivacyOptionIndex != privacyOptionsResult.selectedPrivacyOptionIndex || !EXR.A00(this.selectedPrivacyOption, privacyOptionsResult.selectedPrivacyOption)) {
            return false;
        }
        2JX r0 = this.defaultPrivacyInfo;
        2JX r02 = privacyOptionsResult.defaultPrivacyInfo;
        if (r0 != null) {
            if (r02 == null || r0.getBooleanValue(2066058102) != r02.getBooleanValue(2066058102) || !Objects.equal(r0.A0t(GraphQLStringDefUtil.A00(), "GraphQLDefaultPrivacyNuxUseCase", -775568426), r02.A0t(GraphQLStringDefUtil.A00(), "GraphQLDefaultPrivacyNuxUseCase", -775568426))) {
                return false;
            }
            2JY A0B = 1BK.A0B(r0, 2JX.class, 1034864440, -1611360254);
            2JY A0B2 = 1BK.A0B(r02, 2JX.class, 1034864440, -1611360254);
            if (A0B == null) {
                if (A0B2 != null) {
                    return false;
                }
            } else if (A0B2 == null || !Objects.equal(A0B.A0q(), A0B2.A0q()) || !Objects.equal(A0B.A0j(), A0B2.A0j())) {
                return false;
            }
        } else if (r02 != null) {
            return false;
        }
        if (this.audiencePickerDescriptionFromServer != privacyOptionsResult.audiencePickerDescriptionFromServer) {
            return false;
        }
        String str = this.privacyWriteId;
        return (str == null || str.equals(str)) && this.recentPrivacyOptionIndex == privacyOptionsResult.recentPrivacyOptionIndex && EXR.A00(this.recentPrivacyOption, privacyOptionsResult.recentPrivacyOption) && this.isSelectedOptionExternal == privacyOptionsResult.isSelectedOptionExternal && this.isResultFromServer == privacyOptionsResult.isResultFromServer;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{1BK.A0k(this.basicPrivacyOptions), 1BK.A0k(this.friendListPrivacyOptions), 1BK.A0k(this.primaryOptionIndices), 1BK.A0k(this.expandablePrivacyOptionIndices), Integer.valueOf(this.selectedPrivacyOptionIndex), Integer.valueOf(this.recentPrivacyOptionIndex), Boolean.valueOf(this.isSelectedOptionExternal), Boolean.valueOf(this.isResultFromServer)});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(PrivacyOptionsResult.class);
        stringHelper.add("basicPrivacyOptions", this.basicPrivacyOptions);
        stringHelper.add("friendListOptions", this.friendListPrivacyOptions);
        stringHelper.add("primaryOptionIndices", this.primaryOptionIndices);
        stringHelper.add("expandablePrivacyOptionIndices", this.expandablePrivacyOptionIndices);
        stringHelper.add("selectedPrivacyOptionIndex", this.selectedPrivacyOptionIndex);
        stringHelper.add("selectedPrivacyOption", this.selectedPrivacyOption);
        stringHelper.add("defaultPrivacyInfo", this.defaultPrivacyInfo);
        stringHelper.add("audiencePickerDescriptionFromServer", this.audiencePickerDescriptionFromServer);
        stringHelper.add("privacyWriteId", this.privacyWriteId);
        stringHelper.add("recentPrivacyOptionIndex", this.recentPrivacyOptionIndex);
        stringHelper.add("recentPrivacyOption", this.recentPrivacyOption);
        stringHelper.add("isSelectedOptionExternal", this.isSelectedOptionExternal);
        stringHelper.add("earlyAccessStrings", (Object) null);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.basicPrivacyOptions);
        parcel.writeTypedList(this.friendListPrivacyOptions);
        parcel.writeList(this.primaryOptionIndices);
        parcel.writeList(this.expandablePrivacyOptionIndices);
        parcel.writeInt(this.selectedPrivacyOptionIndex);
        parcel.writeParcelable(this.selectedPrivacyOption, i);
        FJ8.A0A(parcel, this.defaultPrivacyInfo);
        FJ8.A0B(parcel, this.audiencePickerDescriptionFromServer);
        parcel.writeString(this.privacyWriteId);
        parcel.writeInt(this.recentPrivacyOptionIndex);
        parcel.writeParcelable(this.recentPrivacyOption, i);
        parcel.writeInt(this.isSelectedOptionExternal ? 1 : 0);
        parcel.writeInt(this.isResultFromServer ? 1 : 0);
        parcel.writeInt(-1);
    }
}
