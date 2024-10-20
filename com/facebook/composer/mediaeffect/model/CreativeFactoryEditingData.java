package com.facebook.composer.mediaeffect.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FJ8;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLPhotoFormatsComponentTemplateGroup;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.videocodec.effects.model.MotionEffectGLConfig;
import com.facebook.videocodec.effects.persistence.common.PersistedGLRenderer;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CreativeFactoryEditingData.class */
public final class CreativeFactoryEditingData implements Parcelable {
    public static volatile GraphQLPhotoFormatsComponentTemplateGroup A0A;
    public static final Parcelable.Creator CREATOR = FKX.A00(6);
    public final MediaData A00;
    public final MotionEffectGLConfig A01;
    public final PersistedGLRenderer A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final GraphQLPhotoFormatsComponentTemplateGroup A08;
    public final Set A09;

    public CreativeFactoryEditingData(Parcel parcel) {
        PersistedGLRenderer persistedGLRenderer = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A08 = null;
        } else {
            this.A08 = GraphQLPhotoFormatsComponentTemplateGroup.values()[parcel.readInt()];
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
        this.A03 = FJ8.A02(parcel);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MotionEffectGLConfig) MotionEffectGLConfig.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = DKG.A0Y(parcel);
        }
        this.A02 = parcel.readInt() != 0 ? (PersistedGLRenderer) PersistedGLRenderer.CREATOR.createFromParcel(parcel) : persistedGLRenderer;
        this.A07 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public CreativeFactoryEditingData(GraphQLPhotoFormatsComponentTemplateGroup graphQLPhotoFormatsComponentTemplateGroup, MediaData mediaData, MotionEffectGLConfig motionEffectGLConfig, PersistedGLRenderer persistedGLRenderer, ImmutableList immutableList, String str, String str2, String str3, String str4, Set set) {
        this.A08 = graphQLPhotoFormatsComponentTemplateGroup;
        this.A04 = str;
        this.A05 = str2;
        C1pq.A08("arEffectParamsList", immutableList);
        this.A03 = immutableList;
        this.A06 = str3;
        this.A01 = motionEffectGLConfig;
        this.A00 = mediaData;
        this.A02 = persistedGLRenderer;
        C1pq.A08("templateId", str4);
        this.A07 = str4;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public GraphQLPhotoFormatsComponentTemplateGroup A00() {
        if (this.A09.contains("appliedEffectGroup")) {
            return this.A08;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = GraphQLPhotoFormatsComponentTemplateGroup.A01;
                }
            }
        }
        return A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreativeFactoryEditingData)) {
                return false;
            }
            CreativeFactoryEditingData creativeFactoryEditingData = (CreativeFactoryEditingData) obj;
            if (A00() != creativeFactoryEditingData.A00() || !11T.A0O(this.A04, creativeFactoryEditingData.A04) || !11T.A0O(this.A05, creativeFactoryEditingData.A05) || !11T.A0O(this.A03, creativeFactoryEditingData.A03) || !11T.A0O(this.A06, creativeFactoryEditingData.A06) || !11T.A0O(this.A01, creativeFactoryEditingData.A01) || !11T.A0O(this.A00, creativeFactoryEditingData.A00) || !11T.A0O(this.A02, creativeFactoryEditingData.A02) || !11T.A0O(this.A07, creativeFactoryEditingData.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A04(this.A06, C1pq.A04(this.A03, C1pq.A04(this.A05, C1pq.A04(this.A04, C3o5.A03(A00()) + 31))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A08);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        FJ8.A0B(parcel, this.A03);
        1BL.A13(parcel, this.A06);
        MotionEffectGLConfig motionEffectGLConfig = this.A01;
        if (motionEffectGLConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            motionEffectGLConfig.writeToParcel(parcel, i);
        }
        DKH.A10(parcel, this.A00, i);
        PersistedGLRenderer persistedGLRenderer = this.A02;
        if (persistedGLRenderer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            persistedGLRenderer.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A07);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
