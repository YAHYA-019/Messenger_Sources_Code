package com.facebook.audience.model.interfaces;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: DirectShareAudience.class */
public final class DirectShareAudience implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(5);
    public final GroupStoryData A00;
    public final MomentsStoryData A01;
    public final SharesheetPageStoryData A02;
    public final String A03;
    public final boolean A04;

    /* loaded from: DirectShareAudience$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            GroupStoryData groupStoryData = null;
            MomentsStoryData momentsStoryData = null;
            SharesheetPageStoryData sharesheetPageStoryData = null;
            boolean z = false;
            String str = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1272961740:
                                if (A1C.equals("story_audience_mode")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("storyAudienceMode", str);
                                    break;
                                }
                                break;
                            case -575784919:
                                if (A1C.equals("moments_story")) {
                                    momentsStoryData = (MomentsStoryData) AbstractC11224vw.A02(abstractC01033pi, c27t, MomentsStoryData.class);
                                    break;
                                }
                                break;
                            case 568640979:
                                if (A1C.equals("should_post_to_my_story")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1102001973:
                                if (A1C.equals("group_story")) {
                                    groupStoryData = (GroupStoryData) AbstractC11224vw.A02(abstractC01033pi, c27t, GroupStoryData.class);
                                    break;
                                }
                                break;
                            case 1629837125:
                                if (A1C.equals("page_story")) {
                                    sharesheetPageStoryData = (SharesheetPageStoryData) AbstractC11224vw.A02(abstractC01033pi, c27t, SharesheetPageStoryData.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, DirectShareAudience.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new DirectShareAudience(groupStoryData, momentsStoryData, sharesheetPageStoryData, str, z);
        }
    }

    /* loaded from: DirectShareAudience$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            DirectShareAudience directShareAudience = (DirectShareAudience) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, directShareAudience.A00, "group_story");
            AbstractC11224vw.A05(r302, c26c, directShareAudience.A01, "moments_story");
            AbstractC11224vw.A05(r302, c26c, directShareAudience.A02, "page_story");
            boolean z = directShareAudience.A04;
            r302.A0o("should_post_to_my_story");
            r302.A0v(z);
            AbstractC11224vw.A0D(r302, "story_audience_mode", directShareAudience.A03);
            r302.A0Y();
        }
    }

    public DirectShareAudience(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        SharesheetPageStoryData sharesheetPageStoryData = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (GroupStoryData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MomentsStoryData) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readInt() != 0 ? (SharesheetPageStoryData) parcel.readParcelable(A0e) : sharesheetPageStoryData;
        this.A04 = AbN.A1U(parcel);
        this.A03 = parcel.readString();
    }

    public DirectShareAudience(GroupStoryData groupStoryData, MomentsStoryData momentsStoryData, SharesheetPageStoryData sharesheetPageStoryData, String str, boolean z) {
        this.A00 = groupStoryData;
        this.A01 = momentsStoryData;
        this.A02 = sharesheetPageStoryData;
        this.A04 = z;
        C1pq.A08("storyAudienceMode", str);
        this.A03 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DirectShareAudience)) {
                return false;
            }
            DirectShareAudience directShareAudience = (DirectShareAudience) obj;
            if (!11T.A0O(this.A00, directShareAudience.A00) || !11T.A0O(this.A01, directShareAudience.A01) || !11T.A0O(this.A02, directShareAudience.A02) || this.A04 != directShareAudience.A04 || !11T.A0O(this.A03, directShareAudience.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A04));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DirectShareAudience{groupStory=");
        A0k.append(this.A00);
        A0k.append(", momentsStory=");
        A0k.append(this.A01);
        A0k.append(", pageStory=");
        A0k.append(this.A02);
        A0k.append(", shouldPostToMyStory=");
        A0k.append(this.A04);
        A0k.append(", storyAudienceMode=");
        A0k.append(this.A03);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A03);
    }
}
