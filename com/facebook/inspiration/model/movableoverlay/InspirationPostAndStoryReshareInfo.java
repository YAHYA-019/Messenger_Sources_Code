package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKF;
import X.EKx;
import X.EME;
import X.FKc;
import X.QpP;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationPostAndStoryReshareInfo.class */
public final class InspirationPostAndStoryReshareInfo implements Parcelable {
    public static volatile EME A0F;
    public static volatile EKx A0G;
    public static volatile InspirationReshareMediaInfo A0H;
    public static volatile QpP A0I;
    public static final Parcelable.Creator CREATOR = FKc.A00(37);
    public final InspirationReshareHeaderInfo A00;
    public final InspirationReshareLinkInfo A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final EME A0A;
    public final EKx A0B;
    public final InspirationReshareMediaInfo A0C;
    public final QpP A0D;
    public final Set A0E;

    /* loaded from: InspirationPostAndStoryReshareInfo$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0055. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            String str2 = null;
            boolean z = false;
            QpP qpP = null;
            String str3 = null;
            String str4 = null;
            InspirationReshareHeaderInfo inspirationReshareHeaderInfo = null;
            String str5 = null;
            InspirationReshareLinkInfo inspirationReshareLinkInfo = null;
            InspirationReshareMediaInfo inspirationReshareMediaInfo = null;
            EME eme = null;
            EKx eKx = null;
            Integer num = null;
            String str6 = null;
            Integer num2 = null;
            HashSet A0v = AnonymousClass001.A0v();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1672984966:
                                if (A1C.equals("text_color_override")) {
                                    num2 = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1164511044:
                                if (A1C.equals("reshare_media_info")) {
                                    inspirationReshareMediaInfo = (InspirationReshareMediaInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationReshareMediaInfo.class);
                                    str = "reshareMediaInfo";
                                    C1pq.A08(str, inspirationReshareMediaInfo);
                                    A0v = 4YV.A10(str, A0v);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -982439980:
                                if (A1C.equals("sticker_background_color")) {
                                    num = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -880905839:
                                if (A1C.equals("target")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -645197262:
                                if (A1C.equals("post_story_permalink_url")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -616366368:
                                if (A1C.equals("reshare_link_info")) {
                                    inspirationReshareLinkInfo = (InspirationReshareLinkInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationReshareLinkInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -589317946:
                                if (A1C.equals("reshare_content")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -552378131:
                                if (A1C.equals("reshare_header_info")) {
                                    inspirationReshareHeaderInfo = (InspirationReshareHeaderInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationReshareHeaderInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 232393465:
                                if (A1C.equals("reshare_information")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 474201845:
                                if (A1C.equals("reshare_target_type")) {
                                    eKx = (EKx) AbstractC11224vw.A02(abstractC01033pi, c27t, EKx.class);
                                    str = "reshareTargetType";
                                    C1pq.A08(str, eKx);
                                    A0v = 4YV.A10(str, A0v);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 552573414:
                                if (A1C.equals("caption")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1078651209:
                                if (A1C.equals("enable_reshare_attribution_link")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1118309263:
                                if (A1C.equals("reshare_sticker_template")) {
                                    eme = (EME) AbstractC11224vw.A02(abstractC01033pi, c27t, EME.class);
                                    str = "reshareStickerTemplate";
                                    C1pq.A08(str, eme);
                                    A0v = 4YV.A10(str, A0v);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1939875509:
                                if (A1C.equals("media_type")) {
                                    qpP = (QpP) AbstractC11224vw.A02(abstractC01033pi, c27t, QpP.class);
                                    str = "mediaType";
                                    C1pq.A08(str, qpP);
                                    A0v = 4YV.A10(str, A0v);
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
                    C4V6.A01(abstractC01033pi, InspirationPostAndStoryReshareInfo.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationPostAndStoryReshareInfo(eme, eKx, inspirationReshareHeaderInfo, inspirationReshareLinkInfo, inspirationReshareMediaInfo, qpP, num, num2, str2, str3, str4, str5, str6, A0v, z);
        }
    }

    /* loaded from: InspirationPostAndStoryReshareInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationPostAndStoryReshareInfo inspirationPostAndStoryReshareInfo = (InspirationPostAndStoryReshareInfo) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "caption", inspirationPostAndStoryReshareInfo.A04);
            boolean z = inspirationPostAndStoryReshareInfo.A09;
            r302.A0o("enable_reshare_attribution_link");
            r302.A0v(z);
            AbstractC11224vw.A05(r302, c26c, inspirationPostAndStoryReshareInfo.A03(), "media_type");
            AbstractC11224vw.A0D(r302, "post_story_permalink_url", inspirationPostAndStoryReshareInfo.A05);
            AbstractC11224vw.A0D(r302, "reshare_content", inspirationPostAndStoryReshareInfo.A06);
            AbstractC11224vw.A05(r302, c26c, inspirationPostAndStoryReshareInfo.A00, "reshare_header_info");
            AbstractC11224vw.A0D(r302, "reshare_information", inspirationPostAndStoryReshareInfo.A07);
            AbstractC11224vw.A05(r302, c26c, inspirationPostAndStoryReshareInfo.A01, "reshare_link_info");
            AbstractC11224vw.A05(r302, c26c, inspirationPostAndStoryReshareInfo.A02(), "reshare_media_info");
            AbstractC11224vw.A05(r302, c26c, inspirationPostAndStoryReshareInfo.A00(), "reshare_sticker_template");
            AbstractC11224vw.A05(r302, c26c, inspirationPostAndStoryReshareInfo.A01(), "reshare_target_type");
            AbstractC11224vw.A0B(r302, inspirationPostAndStoryReshareInfo.A02, "sticker_background_color");
            AbstractC11224vw.A0D(r302, "target", inspirationPostAndStoryReshareInfo.A08);
            AbstractC11224vw.A0B(r302, inspirationPostAndStoryReshareInfo.A03, "text_color_override");
            r302.A0Y();
        }
    }

    public InspirationPostAndStoryReshareInfo(EME eme, EKx eKx, InspirationReshareHeaderInfo inspirationReshareHeaderInfo, InspirationReshareLinkInfo inspirationReshareLinkInfo, InspirationReshareMediaInfo inspirationReshareMediaInfo, QpP qpP, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, Set set, boolean z) {
        this.A04 = str;
        this.A09 = z;
        this.A0D = qpP;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = inspirationReshareHeaderInfo;
        this.A07 = str4;
        this.A01 = inspirationReshareLinkInfo;
        this.A0C = inspirationReshareMediaInfo;
        this.A0A = eme;
        this.A0B = eKx;
        this.A02 = num;
        this.A08 = str5;
        this.A03 = num2;
        this.A0E = Collections.unmodifiableSet(set);
    }

    public InspirationPostAndStoryReshareInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        int i = 0;
        this.A09 = 4YV.A1U(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = QpP.values()[parcel.readInt()];
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
            this.A00 = null;
        } else {
            this.A00 = (InspirationReshareHeaderInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (InspirationReshareLinkInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (InspirationReshareMediaInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = EME.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = EKx.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0E = Collections.unmodifiableSet(A0v);
    }

    public EME A00() {
        if (this.A0E.contains("reshareStickerTemplate")) {
            return this.A0A;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = EME.A0G;
                }
            }
        }
        return A0F;
    }

    public EKx A01() {
        if (this.A0E.contains("reshareTargetType")) {
            return this.A0B;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = EKx.A02;
                }
            }
        }
        return A0G;
    }

    public InspirationReshareMediaInfo A02() {
        if (this.A0E.contains("reshareMediaInfo")) {
            return this.A0C;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    HashSet A0v = AnonymousClass001.A0v();
                    A0H = new InspirationReshareMediaInfo(QpP.A02, ImmutableList.of(), ImmutableList.of(), null, null, 4YV.A0z("mediaType", A0v, A0v), 0.0f, 0, false);
                }
            }
        }
        return A0H;
    }

    public QpP A03() {
        if (this.A0E.contains("mediaType")) {
            return this.A0D;
        }
        if (A0I == null) {
            synchronized (this) {
                if (A0I == null) {
                    A0I = QpP.A02;
                }
            }
        }
        return A0I;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationPostAndStoryReshareInfo)) {
                return false;
            }
            InspirationPostAndStoryReshareInfo inspirationPostAndStoryReshareInfo = (InspirationPostAndStoryReshareInfo) obj;
            if (!11T.A0O(this.A04, inspirationPostAndStoryReshareInfo.A04) || this.A09 != inspirationPostAndStoryReshareInfo.A09 || A03() != inspirationPostAndStoryReshareInfo.A03() || !11T.A0O(this.A05, inspirationPostAndStoryReshareInfo.A05) || !11T.A0O(this.A06, inspirationPostAndStoryReshareInfo.A06) || !11T.A0O(this.A00, inspirationPostAndStoryReshareInfo.A00) || !11T.A0O(this.A07, inspirationPostAndStoryReshareInfo.A07) || !11T.A0O(this.A01, inspirationPostAndStoryReshareInfo.A01) || !11T.A0O(A02(), inspirationPostAndStoryReshareInfo.A02()) || A00() != inspirationPostAndStoryReshareInfo.A00() || A01() != inspirationPostAndStoryReshareInfo.A01() || !11T.A0O(this.A02, inspirationPostAndStoryReshareInfo.A02) || !11T.A0O(this.A08, inspirationPostAndStoryReshareInfo.A08) || !11T.A0O(this.A03, inspirationPostAndStoryReshareInfo.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C1pq.A02(C1pq.A03(this.A04), this.A09);
        int A04 = C1pq.A04(A02(), C1pq.A04(this.A01, C1pq.A04(this.A07, C1pq.A04(this.A00, C1pq.A04(this.A06, C1pq.A04(this.A05, (A02 * 31) + C3o5.A03(A03())))))));
        int A03 = (A04 * 31) + C3o5.A03(A00());
        return C1pq.A04(this.A03, C1pq.A04(this.A08, C1pq.A04(this.A02, (A03 * 31) + DKF.A04(A01()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A09 ? 1 : 0);
        C3o5.A0e(parcel, this.A0D);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A07);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A0C, i);
        C3o5.A0e(parcel, this.A0A);
        C3o5.A0e(parcel, this.A0B);
        C3o5.A0f(parcel, this.A02);
        1BL.A13(parcel, this.A08);
        C3o5.A0f(parcel, this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A0E);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
