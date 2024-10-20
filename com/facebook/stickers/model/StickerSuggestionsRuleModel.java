package com.facebook.stickers.model;

import X.11T;
import X.4YU;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: StickerSuggestionsRuleModel.class */
public final class StickerSuggestionsRuleModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(37);
    public ImmutableList A00;
    public ImmutableList A01;
    public String A02;

    public StickerSuggestionsRuleModel(String str, List list, List list2) {
        this.A02 = str;
        this.A01 = list2 == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list2);
        this.A00 = list == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof StickerSuggestionsRuleModel)) {
                return false;
            }
            StickerSuggestionsRuleModel stickerSuggestionsRuleModel = (StickerSuggestionsRuleModel) obj;
            if (!11T.A0O(this.A02, stickerSuggestionsRuleModel.A02) || !11T.A0O(this.A01, stickerSuggestionsRuleModel.A01) || !11T.A0O(this.A00, stickerSuggestionsRuleModel.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(this.A02, this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeValue(this.A02);
        parcel.writeList(this.A01);
        parcel.writeList(this.A00);
    }
}
