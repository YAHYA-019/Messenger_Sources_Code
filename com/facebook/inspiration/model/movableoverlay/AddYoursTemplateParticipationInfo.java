package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbF;
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
import X.DKH;
import X.EnumC3493Mfo;
import X.FKc;
import X.N13;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AddYoursTemplateParticipationInfo.class */
public final class AddYoursTemplateParticipationInfo implements Parcelable {
    public static volatile EnumC3493Mfo A07;
    public static volatile InspirationOverlayPosition A08;
    public static final Parcelable.Creator CREATOR = new FKc(0);
    public final EnumC3493Mfo A00;
    public final InspirationOverlayPosition A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Set A06;

    /* loaded from: AddYoursTemplateParticipationInfo$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            HashSet A1E;
            N13 n13 = new N13();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -911198956:
                                if (A1C.equals("discovery_surface_influence")) {
                                    EnumC3493Mfo enumC3493Mfo = (EnumC3493Mfo) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3493Mfo.class);
                                    n13.A00 = enumC3493Mfo;
                                    str = "discoverySurfaceInfluence";
                                    C1pq.A08(str, enumC3493Mfo);
                                    if (!n13.A06.contains(str)) {
                                        A1E = AbF.A1E(n13.A06);
                                        n13.A06 = A1E;
                                        A1E.add(str);
                                        break;
                                    }
                                }
                                abstractC01033pi.A20();
                                break;
                            case -561815496:
                                if (A1C.equals("overlay_position")) {
                                    InspirationOverlayPosition inspirationOverlayPosition = (InspirationOverlayPosition) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayPosition.class);
                                    n13.A01 = inspirationOverlayPosition;
                                    str = "overlayPosition";
                                    C1pq.A08(str, inspirationOverlayPosition);
                                    if (!n13.A06.contains(str)) {
                                        A1E = AbF.A1E(n13.A06);
                                        n13.A06 = A1E;
                                        A1E.add(str);
                                        break;
                                    }
                                }
                                abstractC01033pi.A20();
                                break;
                            case 50511102:
                                if (A1C.equals("category")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n13.A02 = A03;
                                    C1pq.A08("category", A03);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1003167898:
                                if (A1C.equals("parent_story_id")) {
                                    String A032 = AbstractC11224vw.A03(abstractC01033pi);
                                    n13.A04 = A032;
                                    C1pq.A08("parentStoryId", A032);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1008835929:
                                if (A1C.equals("creation_app_id")) {
                                    String A033 = AbstractC11224vw.A03(abstractC01033pi);
                                    n13.A03 = A033;
                                    C1pq.A08("creationAppId", A033);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1769642752:
                                if (A1C.equals("template_id")) {
                                    String A034 = AbstractC11224vw.A03(abstractC01033pi);
                                    n13.A05 = A034;
                                    C1pq.A08("templateId", A034);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            default:
                                abstractC01033pi.A20();
                                break;
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, AddYoursTemplateParticipationInfo.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new AddYoursTemplateParticipationInfo(n13);
        }
    }

    /* loaded from: AddYoursTemplateParticipationInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            AddYoursTemplateParticipationInfo addYoursTemplateParticipationInfo = (AddYoursTemplateParticipationInfo) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "category", addYoursTemplateParticipationInfo.A02);
            AbstractC11224vw.A0D(r302, "creation_app_id", addYoursTemplateParticipationInfo.A03);
            AbstractC11224vw.A05(r302, c26c, addYoursTemplateParticipationInfo.A00(), "discovery_surface_influence");
            AbstractC11224vw.A05(r302, c26c, addYoursTemplateParticipationInfo.A01(), "overlay_position");
            AbstractC11224vw.A0D(r302, "parent_story_id", addYoursTemplateParticipationInfo.A04);
            AbstractC11224vw.A0D(r302, "template_id", addYoursTemplateParticipationInfo.A05);
            r302.A0Y();
        }
    }

    public AddYoursTemplateParticipationInfo(N13 n13) {
        String str = n13.A02;
        C1pq.A08("category", str);
        this.A02 = str;
        String str2 = n13.A03;
        C1pq.A08("creationAppId", str2);
        this.A03 = str2;
        this.A00 = n13.A00;
        this.A01 = n13.A01;
        String str3 = n13.A04;
        C1pq.A08("parentStoryId", str3);
        this.A04 = str3;
        String str4 = n13.A05;
        C1pq.A08("templateId", str4);
        this.A05 = str4;
        this.A06 = Collections.unmodifiableSet(n13.A06);
    }

    public AddYoursTemplateParticipationInfo(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        this.A03 = parcel.readString();
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = EnumC3493Mfo.values()[parcel.readInt()];
        }
        this.A01 = parcel.readInt() != 0 ? (InspirationOverlayPosition) InspirationOverlayPosition.CREATOR.createFromParcel(parcel) : inspirationOverlayPosition;
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public EnumC3493Mfo A00() {
        if (this.A06.contains("discoverySurfaceInfluence")) {
            return this.A00;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = EnumC3493Mfo.NONE;
                }
            }
        }
        return A07;
    }

    public InspirationOverlayPosition A01() {
        if (this.A06.contains("overlayPosition")) {
            return this.A01;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = new InspirationOverlayPosition(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AddYoursTemplateParticipationInfo)) {
                return false;
            }
            AddYoursTemplateParticipationInfo addYoursTemplateParticipationInfo = (AddYoursTemplateParticipationInfo) obj;
            if (!11T.A0O(this.A02, addYoursTemplateParticipationInfo.A02) || !11T.A0O(this.A03, addYoursTemplateParticipationInfo.A03) || A00() != addYoursTemplateParticipationInfo.A00() || !11T.A0O(A01(), addYoursTemplateParticipationInfo.A01()) || !11T.A0O(this.A04, addYoursTemplateParticipationInfo.A04) || !11T.A0O(this.A05, addYoursTemplateParticipationInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A03(this.A02));
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(A01(), (A04 * 31) + C3o5.A03(A00()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        C3o5.A0e(parcel, this.A00);
        DKH.A0z(parcel, this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
