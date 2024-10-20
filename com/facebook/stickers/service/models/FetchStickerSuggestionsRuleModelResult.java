package com.facebook.stickers.service.models;

import X.AbM;
import X.DKI;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.StickerSuggestionRule;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: FetchStickerSuggestionsRuleModelResult.class */
public final class FetchStickerSuggestionsRuleModelResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(53);
    public final ImmutableList A00;
    public final ImmutableList A01;

    public FetchStickerSuggestionsRuleModelResult(Parcel parcel) {
        this.A01 = DKI.A0H(parcel, StickerSuggestionRule.class);
        this.A00 = DKI.A0H(parcel, StickerSuggestionRule.class);
    }

    public FetchStickerSuggestionsRuleModelResult(List list, List list2) {
        this.A01 = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
        this.A00 = list2 != null ? ImmutableList.copyOf((Collection) list2) : ImmutableList.of();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof FetchStickerSuggestionsRuleModelResult)) {
                return false;
            }
            FetchStickerSuggestionsRuleModelResult fetchStickerSuggestionsRuleModelResult = (FetchStickerSuggestionsRuleModelResult) obj;
            if (Objects.equal(this.A01, fetchStickerSuggestionsRuleModelResult.A01) && Objects.equal(this.A00, fetchStickerSuggestionsRuleModelResult.A00)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeList(this.A00);
    }
}
