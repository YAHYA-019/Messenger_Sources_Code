package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbH;
import X.AbJ;
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
import X.FKa;
import X.MRl;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.composer.model.richtext.ComposerRichTextStyle;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerGroupAnonymousPostData.class */
public final class ComposerGroupAnonymousPostData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(24);
    public final ComposerDifferentVoiceData A00;
    public final ComposerRichTextStyle A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* loaded from: ComposerGroupAnonymousPostData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            ComposerDifferentVoiceData composerDifferentVoiceData = null;
            String str2 = null;
            String str3 = null;
            ImmutableList immutableList = null;
            ImmutableList immutableList2 = null;
            String str4 = null;
            String str5 = null;
            ComposerRichTextStyle composerRichTextStyle = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            String str6 = null;
            String str7 = null;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2129487503:
                                if (A1C.equals("can_defer_voice_fetch")) {
                                    z2 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -2128608917:
                                if (A1C.equals("anonymous_post_disclaimer_headline")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1475644189:
                                if (A1C.equals("anonymous_post_disclaimer_messages")) {
                                    immutableList2 = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                break;
                            case -1412352357:
                                if (A1C.equals("can_defer_anonymous_post_data")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1012718872:
                                if (A1C.equals("can_reshare_as_anonymous_author")) {
                                    z3 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -702665382:
                                if (A1C.equals("confirmation_dialog_message")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -83723491:
                                if (A1C.equals("anonymous_name")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -12023701:
                                if (A1C.equals("confirmation_dialog_title")) {
                                    str7 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 230407232:
                                if (A1C.equals("anonymous_s_a_t_p_data")) {
                                    composerRichTextStyle = (ComposerRichTextStyle) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerRichTextStyle.class);
                                    break;
                                }
                                break;
                            case 776364505:
                                if (A1C.equals("anonymous_post_disclaimer_icon_names")) {
                                    immutableList = MRl.A0G(abstractC01033pi, c27t);
                                    break;
                                }
                                break;
                            case 909796539:
                                if (A1C.equals("disable_confirmation_dialog")) {
                                    z4 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 917120570:
                                if (A1C.equals("has_seen_disclaimer")) {
                                    z5 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1045046090:
                                if (A1C.equals("anonymous_post_different_voice_data")) {
                                    composerDifferentVoiceData = (ComposerDifferentVoiceData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerDifferentVoiceData.class);
                                    break;
                                }
                                break;
                            case 1264228562:
                                if (A1C.equals("anonymous_profile_pic_url")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1482086179:
                                if (A1C.equals("anonymous_post_disclaimer_button_text")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1503369330:
                                if (A1C.equals("should_show_anon_disclaimer_bottom_sheet")) {
                                    z6 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1782132257:
                                if (A1C.equals("anonymous_post_disclaimer_title")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerGroupAnonymousPostData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerGroupAnonymousPostData(composerDifferentVoiceData, composerRichTextStyle, immutableList, immutableList2, str, str2, str3, str4, str5, str6, str7, z, z2, z3, z4, z5, z6);
        }
    }

    /* loaded from: ComposerGroupAnonymousPostData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerGroupAnonymousPostData composerGroupAnonymousPostData = (ComposerGroupAnonymousPostData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "anonymous_name", composerGroupAnonymousPostData.A04);
            AbstractC11224vw.A05(r302, c26c, composerGroupAnonymousPostData.A00, "anonymous_post_different_voice_data");
            AbstractC11224vw.A0D(r302, "anonymous_post_disclaimer_button_text", composerGroupAnonymousPostData.A05);
            AbstractC11224vw.A0D(r302, "anonymous_post_disclaimer_headline", composerGroupAnonymousPostData.A06);
            AbstractC11224vw.A06(r302, c26c, "anonymous_post_disclaimer_icon_names", composerGroupAnonymousPostData.A02);
            AbstractC11224vw.A06(r302, c26c, "anonymous_post_disclaimer_messages", composerGroupAnonymousPostData.A03);
            AbstractC11224vw.A0D(r302, "anonymous_post_disclaimer_title", composerGroupAnonymousPostData.A07);
            AbstractC11224vw.A0D(r302, "anonymous_profile_pic_url", composerGroupAnonymousPostData.A08);
            AbstractC11224vw.A05(r302, c26c, composerGroupAnonymousPostData.A01, "anonymous_s_a_t_p_data");
            boolean z = composerGroupAnonymousPostData.A0B;
            r302.A0o("can_defer_anonymous_post_data");
            r302.A0v(z);
            boolean z2 = composerGroupAnonymousPostData.A0C;
            r302.A0o("can_defer_voice_fetch");
            r302.A0v(z2);
            boolean z3 = composerGroupAnonymousPostData.A0D;
            r302.A0o("can_reshare_as_anonymous_author");
            r302.A0v(z3);
            AbstractC11224vw.A0D(r302, "confirmation_dialog_message", composerGroupAnonymousPostData.A09);
            AbstractC11224vw.A0D(r302, "confirmation_dialog_title", composerGroupAnonymousPostData.A0A);
            boolean z4 = composerGroupAnonymousPostData.A0E;
            r302.A0o("disable_confirmation_dialog");
            r302.A0v(z4);
            boolean z5 = composerGroupAnonymousPostData.A0F;
            r302.A0o("has_seen_disclaimer");
            r302.A0v(z5);
            DKG.A1T(r302, "should_show_anon_disclaimer_bottom_sheet", composerGroupAnonymousPostData.A0G);
        }
    }

    public ComposerGroupAnonymousPostData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ComposerDifferentVoiceData) parcel.readParcelable(A0e);
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
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            this.A02 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            int i2 = 0;
            while (i2 < readInt2) {
                i2 = AbH.A00(parcel, strArr2, i2);
            }
            this.A03 = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (ComposerRichTextStyle) ComposerRichTextStyle.CREATOR.createFromParcel(parcel);
        }
        this.A0B = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0C = 1BM.A07(parcel);
        this.A0D = 1BM.A07(parcel);
        this.A09 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0A = C3o5.A0O(parcel);
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        this.A0G = AbJ.A1W(parcel);
    }

    public ComposerGroupAnonymousPostData(ComposerDifferentVoiceData composerDifferentVoiceData, ComposerRichTextStyle composerRichTextStyle, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = str;
        this.A00 = composerDifferentVoiceData;
        this.A05 = str2;
        this.A06 = str3;
        this.A02 = immutableList;
        this.A03 = immutableList2;
        this.A07 = str4;
        this.A08 = str5;
        this.A01 = composerRichTextStyle;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A09 = str6;
        this.A0A = str7;
        this.A0E = z4;
        this.A0F = z5;
        this.A0G = z6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGroupAnonymousPostData)) {
                return false;
            }
            ComposerGroupAnonymousPostData composerGroupAnonymousPostData = (ComposerGroupAnonymousPostData) obj;
            if (!11T.A0O(this.A04, composerGroupAnonymousPostData.A04) || !11T.A0O(this.A00, composerGroupAnonymousPostData.A00) || !11T.A0O(this.A05, composerGroupAnonymousPostData.A05) || !11T.A0O(this.A06, composerGroupAnonymousPostData.A06) || !11T.A0O(this.A02, composerGroupAnonymousPostData.A02) || !11T.A0O(this.A03, composerGroupAnonymousPostData.A03) || !11T.A0O(this.A07, composerGroupAnonymousPostData.A07) || !11T.A0O(this.A08, composerGroupAnonymousPostData.A08) || !11T.A0O(this.A01, composerGroupAnonymousPostData.A01) || this.A0B != composerGroupAnonymousPostData.A0B || this.A0C != composerGroupAnonymousPostData.A0C || this.A0D != composerGroupAnonymousPostData.A0D || !11T.A0O(this.A09, composerGroupAnonymousPostData.A09) || !11T.A0O(this.A0A, composerGroupAnonymousPostData.A0A) || this.A0E != composerGroupAnonymousPostData.A0E || this.A0F != composerGroupAnonymousPostData.A0F || this.A0G != composerGroupAnonymousPostData.A0G) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A01, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A00, C1pq.A03(this.A04))))))))), this.A0B), this.A0C), this.A0D))), this.A0E), this.A0F), this.A0G);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        ImmutableList immutableList2 = this.A03;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        ComposerRichTextStyle composerRichTextStyle = this.A01;
        if (composerRichTextStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerRichTextStyle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
    }
}
