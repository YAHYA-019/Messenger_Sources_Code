package com.facebook.pages.app.commshub.suggestions.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLBizInboxCTSSuggestedActionType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ContextualSuggestionModel.class */
public final class ContextualSuggestionModel implements Parcelable {
    public static volatile GraphQLBizInboxCTSSuggestedActionType A0D;
    public static final Parcelable.Creator CREATOR = FKY.A00(21);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final GraphQLBizInboxCTSSuggestedActionType A09;
    public final ContextualSuggestionActionExtraModel A0A;
    public final String A0B;
    public final Set A0C;

    public ContextualSuggestionModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (ContextualSuggestionActionExtraModel) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = GraphQLBizInboxCTSSuggestedActionType.values()[parcel.readInt()];
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0C = Collections.unmodifiableSet(A0v);
    }

    public ContextualSuggestionModel(GraphQLBizInboxCTSSuggestedActionType graphQLBizInboxCTSSuggestedActionType, ContextualSuggestionActionExtraModel contextualSuggestionActionExtraModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Set set) {
        this.A0A = contextualSuggestionActionExtraModel;
        this.A0B = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A05 = str7;
        this.A06 = str8;
        this.A09 = graphQLBizInboxCTSSuggestedActionType;
        this.A07 = str9;
        this.A08 = str10;
        this.A0C = Collections.unmodifiableSet(set);
    }

    public GraphQLBizInboxCTSSuggestedActionType A00() {
        if (this.A0C.contains("suggestionType")) {
            return this.A09;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    A0D = GraphQLBizInboxCTSSuggestedActionType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                }
            }
        }
        return A0D;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ContextualSuggestionModel)) {
                return false;
            }
            ContextualSuggestionModel contextualSuggestionModel = (ContextualSuggestionModel) obj;
            if (!11T.A0O(this.A0A, contextualSuggestionModel.A0A) || !11T.A0O(this.A0B, contextualSuggestionModel.A0B) || !11T.A0O(this.A00, contextualSuggestionModel.A00) || !11T.A0O(this.A01, contextualSuggestionModel.A01) || !11T.A0O(this.A02, contextualSuggestionModel.A02) || !11T.A0O(this.A03, contextualSuggestionModel.A03) || !11T.A0O(this.A04, contextualSuggestionModel.A04) || !11T.A0O(this.A05, contextualSuggestionModel.A05) || !11T.A0O(this.A06, contextualSuggestionModel.A06) || A00() != contextualSuggestionModel.A00() || !11T.A0O(this.A07, contextualSuggestionModel.A07) || !11T.A0O(this.A08, contextualSuggestionModel.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A0B, C1pq.A03(this.A0A)))))))));
        return C1pq.A04(this.A08, C1pq.A04(this.A07, (A04 * 31) + C3o5.A03(A00())));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A0A, i);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        C3o5.A0e(parcel, this.A09);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        Iterator A0S = C3o5.A0S(parcel, this.A0C);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
