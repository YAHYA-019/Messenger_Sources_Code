package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BL;
import X.28Q;
import X.5BB;
import X.7zK;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBGroupComposerToggleProfileType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ComposerGroupProfileSwitchToggleData.class */
public final class ComposerGroupProfileSwitchToggleData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(28);
    public final GraphQLXFBGroupComposerToggleProfileType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* loaded from: ComposerGroupProfileSwitchToggleData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            String str2 = null;
            String str3 = null;
            GraphQLXFBGroupComposerToggleProfileType graphQLXFBGroupComposerToggleProfileType = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1102636175:
                                if (A1C.equals("profile_id")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -174080651:
                                if (A1C.equals("profile_image_url")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1223707489:
                                if (A1C.equals(7zK.A00(40))) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1223909392:
                                if (A1C.equals(1BJ.A00(53))) {
                                    graphQLXFBGroupComposerToggleProfileType = (GraphQLXFBGroupComposerToggleProfileType) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBGroupComposerToggleProfileType.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerGroupProfileSwitchToggleData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerGroupProfileSwitchToggleData(graphQLXFBGroupComposerToggleProfileType, str, str2, str3);
        }
    }

    /* loaded from: ComposerGroupProfileSwitchToggleData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerGroupProfileSwitchToggleData composerGroupProfileSwitchToggleData = (ComposerGroupProfileSwitchToggleData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "profile_id", composerGroupProfileSwitchToggleData.A01);
            AbstractC11224vw.A0D(r302, "profile_image_url", composerGroupProfileSwitchToggleData.A02);
            AbstractC11224vw.A0D(r302, 7zK.A00(40), composerGroupProfileSwitchToggleData.A03);
            AbstractC11224vw.A05(r302, c26c, composerGroupProfileSwitchToggleData.A00, 1BJ.A00(53));
            r302.A0Y();
        }
    }

    public ComposerGroupProfileSwitchToggleData(Parcel parcel) {
        GraphQLXFBGroupComposerToggleProfileType graphQLXFBGroupComposerToggleProfileType = null;
        if (C3o5.A01(parcel, this) == 0) {
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
        this.A00 = parcel.readInt() != 0 ? GraphQLXFBGroupComposerToggleProfileType.values()[parcel.readInt()] : graphQLXFBGroupComposerToggleProfileType;
    }

    public ComposerGroupProfileSwitchToggleData(GraphQLXFBGroupComposerToggleProfileType graphQLXFBGroupComposerToggleProfileType, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = graphQLXFBGroupComposerToggleProfileType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGroupProfileSwitchToggleData)) {
                return false;
            }
            ComposerGroupProfileSwitchToggleData composerGroupProfileSwitchToggleData = (ComposerGroupProfileSwitchToggleData) obj;
            if (!11T.A0O(this.A01, composerGroupProfileSwitchToggleData.A01) || !11T.A0O(this.A02, composerGroupProfileSwitchToggleData.A02) || !11T.A0O(this.A03, composerGroupProfileSwitchToggleData.A03) || this.A00 != composerGroupProfileSwitchToggleData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)));
        return (A04 * 31) + C3o5.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComposerGroupProfileSwitchToggleData{profileId=");
        A0k.append(this.A01);
        A0k.append(", profileImageUrl=");
        A0k.append(this.A02);
        A0k.append(", profileName=");
        A0k.append(this.A03);
        A0k.append(", profileType=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        C3o5.A0e(parcel, this.A00);
    }
}
