package com.facebook.composer.mediaeffect.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLPhotoFormatsComponentTemplateGroup;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerMediaTemplateGroup.class */
public final class ComposerMediaTemplateGroup implements Parcelable {
    public static volatile GraphQLPhotoFormatsComponentTemplateGroup A05;
    public static final Parcelable.Creator CREATOR = FKX.A00(4);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final GraphQLPhotoFormatsComponentTemplateGroup A03;
    public final Set A04;

    public ComposerMediaTemplateGroup(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        ComposerMediaTemplate[] composerMediaTemplateArr = new ComposerMediaTemplate[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, composerMediaTemplateArr, i2);
        }
        this.A00 = ImmutableList.copyOf(composerMediaTemplateArr);
        this.A01 = parcel.readString();
        this.A03 = parcel.readInt() == 0 ? null : GraphQLPhotoFormatsComponentTemplateGroup.values()[parcel.readInt()];
        this.A02 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public ComposerMediaTemplateGroup(GraphQLPhotoFormatsComponentTemplateGroup graphQLPhotoFormatsComponentTemplateGroup, ImmutableList immutableList, String str, String str2, Set set) {
        C1pq.A08("composerMediaTemplates", immutableList);
        this.A00 = immutableList;
        C1pq.A08("groupAccessibilityString", str);
        this.A01 = str;
        this.A03 = graphQLPhotoFormatsComponentTemplateGroup;
        C1pq.A08("groupTitle", str2);
        this.A02 = str2;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public GraphQLPhotoFormatsComponentTemplateGroup A00() {
        if (this.A04.contains("groupCategory")) {
            return this.A03;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = GraphQLPhotoFormatsComponentTemplateGroup.A01;
                }
            }
        }
        return A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMediaTemplateGroup)) {
                return false;
            }
            ComposerMediaTemplateGroup composerMediaTemplateGroup = (ComposerMediaTemplateGroup) obj;
            if (!11T.A0O(this.A00, composerMediaTemplateGroup.A00) || !11T.A0O(this.A01, composerMediaTemplateGroup.A01) || A00() != composerMediaTemplateGroup.A00() || !11T.A0O(this.A02, composerMediaTemplateGroup.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A01, C1pq.A03(this.A00));
        return C1pq.A04(this.A02, (A04 * 31) + C3o5.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposerMediaTemplate) A0b.next(), i);
        }
        parcel.writeString(this.A01);
        parcel.writeInt(DKH.A05(parcel, this.A03));
        parcel.writeString(this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
