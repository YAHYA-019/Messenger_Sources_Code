package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLCallToActionType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerCallToAction.class */
public final class ComposerCallToAction implements Parcelable {
    public static volatile GraphQLCallToActionType A09;
    public static final Parcelable.Creator CREATOR = FKa.A00(6);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final GraphQLCallToActionType A07;
    public final Set A08;

    public ComposerCallToAction(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = GraphQLCallToActionType.values()[parcel.readInt()];
        }
        this.A01 = parcel.readString();
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = parcel.readString();
        this.A04 = C3o5.A0O(parcel);
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public ComposerCallToAction(GraphQLCallToActionType graphQLCallToActionType, String str, String str2, String str3, String str4, String str5, String str6, String str7, Set set) {
        this.A00 = str;
        this.A07 = graphQLCallToActionType;
        C1pq.A08("label", str2);
        this.A01 = str2;
        this.A02 = str3;
        C1pq.A08("linkImage", str4);
        this.A03 = str4;
        this.A04 = str5;
        C1pq.A08("subtitle", str6);
        this.A05 = str6;
        C1pq.A08("title", str7);
        this.A06 = str7;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public GraphQLCallToActionType A00() {
        if (this.A08.contains("callToActionType")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = GraphQLCallToActionType.A02;
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerCallToAction)) {
                return false;
            }
            ComposerCallToAction composerCallToAction = (ComposerCallToAction) obj;
            if (!11T.A0O(this.A00, composerCallToAction.A00) || A00() != composerCallToAction.A00() || !11T.A0O(this.A01, composerCallToAction.A01) || !11T.A0O(this.A02, composerCallToAction.A02) || !11T.A0O(this.A03, composerCallToAction.A03) || !11T.A0O(this.A04, composerCallToAction.A04) || !11T.A0O(this.A05, composerCallToAction.A05) || !11T.A0O(this.A06, composerCallToAction.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A00);
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, (A03 * 31) + C3o5.A03(A00())))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        C3o5.A0e(parcel, this.A07);
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
