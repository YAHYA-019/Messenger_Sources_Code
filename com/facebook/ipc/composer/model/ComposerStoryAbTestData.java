package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.AbE;
import X.AbG;
import X.AbH;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKH;
import X.FJ8;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbshorts.sharesheet.coverphotoselector.model.CoverPhotoSelectionResultDataModel;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerStoryAbTestData.class */
public final class ComposerStoryAbTestData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(69);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    /* loaded from: ComposerStoryAbTestData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList immutableList = null;
            ImmutableList immutableList2 = null;
            boolean z = false;
            ImmutableList of = ImmutableList.of();
            String str = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1787667769:
                                if (A1C.equals("caption_variants")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, GraphQLTextWithEntities.class);
                                    break;
                                }
                                break;
                            case -1199093718:
                                if (A1C.equals("is_auto_a_b_test_enabled")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 421528294:
                                if (A1C.equals("alternative_thumbnail_handles")) {
                                    of = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    C1pq.A08("alternativeThumbnailHandles", of);
                                    break;
                                }
                                break;
                            case 1399477917:
                                if (A1C.equals("cover_photo_variants_selection_result_data")) {
                                    immutableList2 = AbstractC11224vw.A00(abstractC01033pi, c27t, CoverPhotoSelectionResultDataModel.class);
                                    break;
                                }
                                break;
                            case 1866045987:
                                if (A1C.equals(AbE.A00(18))) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("creationEntryPoint", str);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerStoryAbTestData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerStoryAbTestData(of, immutableList, immutableList2, str, z);
        }
    }

    /* loaded from: ComposerStoryAbTestData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerStoryAbTestData composerStoryAbTestData = (ComposerStoryAbTestData) obj;
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "alternative_thumbnail_handles", composerStoryAbTestData.A00);
            AbstractC11224vw.A06(r302, c26c, "caption_variants", composerStoryAbTestData.A01);
            AbstractC11224vw.A06(r302, c26c, "cover_photo_variants_selection_result_data", composerStoryAbTestData.A02);
            AbstractC11224vw.A0D(r302, AbE.A00(18), composerStoryAbTestData.A03);
            DKG.A1T(r302, "is_auto_a_b_test_enabled", composerStoryAbTestData.A04);
        }
    }

    public ComposerStoryAbTestData(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        int i = 0;
        while (i < A01) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = FJ8.A02(parcel);
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            CoverPhotoSelectionResultDataModel[] coverPhotoSelectionResultDataModelArr = new CoverPhotoSelectionResultDataModel[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = DKG.A02(parcel, CoverPhotoSelectionResultDataModel.CREATOR, coverPhotoSelectionResultDataModelArr, i2);
            }
            immutableList = ImmutableList.copyOf(coverPhotoSelectionResultDataModelArr);
        }
        this.A02 = immutableList;
        this.A03 = parcel.readString();
        this.A04 = DKH.A1W(parcel);
    }

    public ComposerStoryAbTestData(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, boolean z) {
        C1pq.A08("alternativeThumbnailHandles", immutableList);
        this.A00 = immutableList;
        this.A01 = immutableList2;
        this.A02 = immutableList3;
        C1pq.A08("creationEntryPoint", str);
        this.A03 = str;
        this.A04 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerStoryAbTestData)) {
                return false;
            }
            ComposerStoryAbTestData composerStoryAbTestData = (ComposerStoryAbTestData) obj;
            if (!11T.A0O(this.A00, composerStoryAbTestData.A00) || !11T.A0O(this.A01, composerStoryAbTestData.A01) || !11T.A0O(this.A02, composerStoryAbTestData.A02) || !11T.A0O(this.A03, composerStoryAbTestData.A03) || this.A04 != composerStoryAbTestData.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))), this.A04);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComposerStoryAbTestData{alternativeThumbnailHandles=");
        A0k.append(this.A00);
        A0k.append(", captionVariants=");
        A0k.append(this.A01);
        A0k.append(", coverPhotoVariantsSelectionResultData=");
        A0k.append(this.A02);
        A0k.append(", creationEntryPoint=");
        A0k.append(this.A03);
        A0k.append(", isAutoABTestEnabled=");
        A0k.append(this.A04);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0B(parcel, immutableList);
        }
        ImmutableList immutableList2 = this.A02;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList2);
            while (A0Y.hasNext()) {
                ((CoverPhotoSelectionResultDataModel) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
