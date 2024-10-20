package com.facebook.ipc.inspiration.config;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbJ;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import X.DKG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.simplepicker.controller.data.model.Folder;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InspirationReelsComposerLandingConfiguration.class */
public final class InspirationReelsComposerLandingConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(33);
    public final Folder A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* loaded from: InspirationReelsComposerLandingConfiguration$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            Folder folder = null;
            String str = null;
            String str2 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1774801780:
                                if (A1C.equals("should_show_posted_videos_shortcut_card")) {
                                    z12 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1765153793:
                                if (A1C.equals("initial_music_asset_id")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1401559726:
                                if (A1C.equals("should_show_drafts_shortcut_card")) {
                                    z6 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1325134270:
                                if (A1C.equals("open_tips_fragment")) {
                                    z2 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1090484220:
                                if (A1C.equals("music_snack_bar_text")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -880222035:
                                if (A1C.equals("should_show_templates_shortcut_card")) {
                                    z16 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -523388645:
                                if (A1C.equals("should_show_show_camera_shortcut_card")) {
                                    z15 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -470630624:
                                if (A1C.equals("should_show_shortcut_cards")) {
                                    z14 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -295927019:
                                if (A1C.equals("should_show_auto_created_reel_shortcut_card")) {
                                    z4 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -81559101:
                                if (A1C.equals("should_show_camera_in_header")) {
                                    z5 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -32149392:
                                if (A1C.equals("should_show_music_funnel_shortcut_card")) {
                                    z10 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 718527084:
                                if (A1C.equals("open_draft_gallery_only")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1195789055:
                                if (A1C.equals("should_show_fan_recognition_shortcut_card")) {
                                    z8 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1218170313:
                                if (A1C.equals("initial_folder")) {
                                    folder = (Folder) AbstractC11224vw.A02(abstractC01033pi, c27t, Folder.class);
                                    break;
                                }
                                break;
                            case 1536951906:
                                if (A1C.equals("should_show_navigation_header")) {
                                    z11 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1894828231:
                                if (A1C.equals("should_show_r_m_r_shortcut_card")) {
                                    z13 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 2056386696:
                                if (A1C.equals("should_show_green_screen_shortcut_card")) {
                                    z9 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 2090341741:
                                if (A1C.equals("should_disable_setting")) {
                                    z3 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 2128981302:
                                if (A1C.equals("should_show_effects_shortcut_card")) {
                                    z7 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationReelsComposerLandingConfiguration.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationReelsComposerLandingConfiguration(folder, str, str2, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16);
        }
    }

    /* loaded from: InspirationReelsComposerLandingConfiguration$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationReelsComposerLandingConfiguration inspirationReelsComposerLandingConfiguration = (InspirationReelsComposerLandingConfiguration) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationReelsComposerLandingConfiguration.A00, "initial_folder");
            AbstractC11224vw.A0D(r302, "initial_music_asset_id", inspirationReelsComposerLandingConfiguration.A01);
            AbstractC11224vw.A0D(r302, "music_snack_bar_text", inspirationReelsComposerLandingConfiguration.A02);
            boolean z = inspirationReelsComposerLandingConfiguration.A03;
            r302.A0o("open_draft_gallery_only");
            r302.A0v(z);
            boolean z2 = inspirationReelsComposerLandingConfiguration.A04;
            r302.A0o("open_tips_fragment");
            r302.A0v(z2);
            boolean z3 = inspirationReelsComposerLandingConfiguration.A05;
            r302.A0o("should_disable_setting");
            r302.A0v(z3);
            boolean z4 = inspirationReelsComposerLandingConfiguration.A06;
            r302.A0o("should_show_auto_created_reel_shortcut_card");
            r302.A0v(z4);
            boolean z5 = inspirationReelsComposerLandingConfiguration.A07;
            r302.A0o("should_show_camera_in_header");
            r302.A0v(z5);
            boolean z6 = inspirationReelsComposerLandingConfiguration.A08;
            r302.A0o("should_show_drafts_shortcut_card");
            r302.A0v(z6);
            boolean z7 = inspirationReelsComposerLandingConfiguration.A09;
            r302.A0o("should_show_effects_shortcut_card");
            r302.A0v(z7);
            boolean z8 = inspirationReelsComposerLandingConfiguration.A0A;
            r302.A0o("should_show_fan_recognition_shortcut_card");
            r302.A0v(z8);
            boolean z9 = inspirationReelsComposerLandingConfiguration.A0B;
            r302.A0o("should_show_green_screen_shortcut_card");
            r302.A0v(z9);
            boolean z10 = inspirationReelsComposerLandingConfiguration.A0C;
            r302.A0o("should_show_music_funnel_shortcut_card");
            r302.A0v(z10);
            boolean z11 = inspirationReelsComposerLandingConfiguration.A0D;
            r302.A0o("should_show_navigation_header");
            r302.A0v(z11);
            boolean z12 = inspirationReelsComposerLandingConfiguration.A0E;
            r302.A0o("should_show_posted_videos_shortcut_card");
            r302.A0v(z12);
            boolean z13 = inspirationReelsComposerLandingConfiguration.A0F;
            r302.A0o("should_show_r_m_r_shortcut_card");
            r302.A0v(z13);
            boolean z14 = inspirationReelsComposerLandingConfiguration.A0G;
            r302.A0o("should_show_shortcut_cards");
            r302.A0v(z14);
            boolean z15 = inspirationReelsComposerLandingConfiguration.A0H;
            r302.A0o("should_show_show_camera_shortcut_card");
            r302.A0v(z15);
            DKG.A1T(r302, "should_show_templates_shortcut_card", inspirationReelsComposerLandingConfiguration.A0I);
        }
    }

    public InspirationReelsComposerLandingConfiguration(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Folder) Folder.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = C3o5.A0O(parcel);
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = 1BM.A07(parcel);
        this.A06 = 1BM.A07(parcel);
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = 1BM.A07(parcel);
        this.A0A = 1BM.A07(parcel);
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0D = 1BM.A07(parcel);
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        this.A0G = 1BM.A07(parcel);
        this.A0H = 1BM.A07(parcel);
        this.A0I = AbJ.A1W(parcel);
    }

    public InspirationReelsComposerLandingConfiguration(Folder folder, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.A00 = folder;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A06 = z4;
        this.A07 = z5;
        this.A08 = z6;
        this.A09 = z7;
        this.A0A = z8;
        this.A0B = z9;
        this.A0C = z10;
        this.A0D = z11;
        this.A0E = z12;
        this.A0F = z13;
        this.A0G = z14;
        this.A0H = z15;
        this.A0I = z16;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationReelsComposerLandingConfiguration)) {
                return false;
            }
            InspirationReelsComposerLandingConfiguration inspirationReelsComposerLandingConfiguration = (InspirationReelsComposerLandingConfiguration) obj;
            if (!11T.A0O(this.A00, inspirationReelsComposerLandingConfiguration.A00) || !11T.A0O(this.A01, inspirationReelsComposerLandingConfiguration.A01) || !11T.A0O(this.A02, inspirationReelsComposerLandingConfiguration.A02) || this.A03 != inspirationReelsComposerLandingConfiguration.A03 || this.A04 != inspirationReelsComposerLandingConfiguration.A04 || this.A05 != inspirationReelsComposerLandingConfiguration.A05 || this.A06 != inspirationReelsComposerLandingConfiguration.A06 || this.A07 != inspirationReelsComposerLandingConfiguration.A07 || this.A08 != inspirationReelsComposerLandingConfiguration.A08 || this.A09 != inspirationReelsComposerLandingConfiguration.A09 || this.A0A != inspirationReelsComposerLandingConfiguration.A0A || this.A0B != inspirationReelsComposerLandingConfiguration.A0B || this.A0C != inspirationReelsComposerLandingConfiguration.A0C || this.A0D != inspirationReelsComposerLandingConfiguration.A0D || this.A0E != inspirationReelsComposerLandingConfiguration.A0E || this.A0F != inspirationReelsComposerLandingConfiguration.A0F || this.A0G != inspirationReelsComposerLandingConfiguration.A0G || this.A0H != inspirationReelsComposerLandingConfiguration.A0H || this.A0I != inspirationReelsComposerLandingConfiguration.A0I) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A03), this.A04), this.A05), this.A06), this.A07), this.A08), this.A09), this.A0A), this.A0B), this.A0C), this.A0D), this.A0E), this.A0F), this.A0G), this.A0H), this.A0I);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationReelsComposerLandingConfiguration{initialFolder=");
        A0k.append(this.A00);
        A0k.append(", initialMusicAssetId=");
        A0k.append(this.A01);
        A0k.append(", musicSnackBarText=");
        A0k.append(this.A02);
        A0k.append(", openDraftGalleryOnly=");
        A0k.append(this.A03);
        A0k.append(", openTipsFragment=");
        A0k.append(this.A04);
        A0k.append(", shouldDisableSetting=");
        A0k.append(this.A05);
        A0k.append(", shouldShowAutoCreatedReelShortcutCard=");
        A0k.append(this.A06);
        A0k.append(", shouldShowCameraInHeader=");
        A0k.append(this.A07);
        A0k.append(", shouldShowDraftsShortcutCard=");
        A0k.append(this.A08);
        A0k.append(", shouldShowEffectsShortcutCard=");
        A0k.append(this.A09);
        A0k.append(", shouldShowFanRecognitionShortcutCard=");
        A0k.append(this.A0A);
        A0k.append(", shouldShowGreenScreenShortcutCard=");
        A0k.append(this.A0B);
        A0k.append(", shouldShowMusicFunnelShortcutCard=");
        A0k.append(this.A0C);
        A0k.append(", shouldShowNavigationHeader=");
        A0k.append(this.A0D);
        A0k.append(", shouldShowPostedVideosShortcutCard=");
        A0k.append(this.A0E);
        A0k.append(", shouldShowRMRShortcutCard=");
        A0k.append(this.A0F);
        A0k.append(", shouldShowShortcutCards=");
        A0k.append(this.A0G);
        A0k.append(", shouldShowShowCameraShortcutCard=");
        A0k.append(this.A0H);
        A0k.append(", shouldShowTemplatesShortcutCard=");
        return AbstractC2327GOs.A0X(A0k, this.A0I);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Folder folder = this.A00;
        if (folder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            folder.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
    }
}
