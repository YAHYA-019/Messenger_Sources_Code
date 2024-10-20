package com.facebook.stickers.model;

import X.11T;
import X.4YV;
import X.AbM;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: StickerSuggestionRule.class */
public final class StickerSuggestionRule implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(36);
    public final String A00;
    public final String A01;
    public final Pattern A02;

    public StickerSuggestionRule(Parcel parcel) {
        String str = (String) 4YV.A0l(parcel, String.class);
        this.A01 = str;
        this.A00 = (String) 4YV.A0l(parcel, String.class);
        Pattern pattern = null;
        if (str != null) {
            try {
                pattern = Pattern.compile(str, 2);
            } catch (PatternSyntaxException unused) {
            }
        }
        this.A02 = pattern;
    }

    public StickerSuggestionRule(String str, String str2) {
        this.A01 = str2;
        this.A00 = str;
        Pattern pattern = null;
        if (str2 != null) {
            try {
                pattern = Pattern.compile(str2, 2);
            } catch (PatternSyntaxException unused) {
            }
        }
        this.A02 = pattern;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof StickerSuggestionRule)) {
                return false;
            }
            StickerSuggestionRule stickerSuggestionRule = (StickerSuggestionRule) obj;
            if (!11T.A0O(this.A01, stickerSuggestionRule.A01) || !11T.A0O(this.A00, stickerSuggestionRule.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A00);
    }
}
