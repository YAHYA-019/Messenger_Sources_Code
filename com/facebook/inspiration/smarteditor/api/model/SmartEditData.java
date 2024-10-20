package com.facebook.inspiration.smarteditor.api.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbH;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKH;
import X.F5n;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: SmartEditData.class */
public final class SmartEditData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(71);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;

    /* loaded from: SmartEditData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            F5n f5n = new F5n();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -900774058:
                                if (A1C.equals("media_id")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    f5n.A02 = A03;
                                    C1pq.A08("mediaId", A03);
                                    break;
                                }
                                break;
                            case -420378918:
                                if (A1C.equals("fetched_music_recommendations")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, MusicTrackParams.class);
                                    f5n.A01 = A00;
                                    C1pq.A08("fetchedMusicRecommendations", A00);
                                    break;
                                }
                                break;
                            case -412611495:
                                if (A1C.equals("is_loading_in_tools")) {
                                    f5n.A03 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1313520048:
                                if (A1C.equals("fetched_caption_suggestions")) {
                                    f5n.A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, SmartEditData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new SmartEditData(f5n);
        }
    }

    /* loaded from: SmartEditData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            SmartEditData smartEditData = (SmartEditData) obj;
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "fetched_caption_suggestions", smartEditData.A00);
            AbstractC11224vw.A06(r302, c26c, "fetched_music_recommendations", smartEditData.A01);
            boolean z = smartEditData.A03;
            r302.A0o("is_loading_in_tools");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "media_id", smartEditData.A02);
            r302.A0Y();
        }
    }

    public SmartEditData(F5n f5n) {
        this.A00 = f5n.A00;
        ImmutableList immutableList = f5n.A01;
        C1pq.A08("fetchedMusicRecommendations", immutableList);
        this.A01 = immutableList;
        this.A03 = f5n.A03;
        String str = f5n.A02;
        C1pq.A08("mediaId", str);
        this.A02 = str;
    }

    public SmartEditData(Parcel parcel) {
        ImmutableList copyOf;
        if (C3o5.A01(parcel, this) == 0) {
            copyOf = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            copyOf = ImmutableList.copyOf(strArr);
        }
        this.A00 = copyOf;
        int readInt2 = parcel.readInt();
        MusicTrackParams[] musicTrackParamsArr = new MusicTrackParams[readInt2];
        int i2 = 0;
        while (i2 < readInt2) {
            i2 = DKG.A02(parcel, MusicTrackParams.CREATOR, musicTrackParamsArr, i2);
        }
        this.A01 = ImmutableList.copyOf(musicTrackParamsArr);
        this.A03 = DKH.A1W(parcel);
        this.A02 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SmartEditData)) {
                return false;
            }
            SmartEditData smartEditData = (SmartEditData) obj;
            if (!11T.A0O(this.A00, smartEditData.A00) || !11T.A0O(this.A01, smartEditData.A01) || this.A03 != smartEditData.A03 || !11T.A0O(this.A02, smartEditData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A03));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            ((MusicTrackParams) A0b.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
