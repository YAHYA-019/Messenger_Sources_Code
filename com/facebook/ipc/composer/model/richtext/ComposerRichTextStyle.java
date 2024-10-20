package com.facebook.ipc.composer.model.richtext;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3305Jq0;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import X.DKB;
import X.ELI;
import X.FJ8;
import X.GOm;
import X.GOq;
import X.KMg;
import X.MRk;
import X.Qpr;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.inspiration.model.fonts.InspirationFont;
import com.facebook.messenger.plugins.msysopenmessagingattachmentdeletionplugin.MsysOpenMessagingAttachmentDeletionPluginPostmailbox;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerRichTextStyle.class */
public final class ComposerRichTextStyle implements Parcelable {
    public static volatile Qpr A0T;
    public static volatile ELI A0U;
    public static volatile KMg A0V;
    public static volatile String A0W;
    public static final Parcelable.Creator CREATOR = new CSR(23);
    public final double A00;
    public final double A01;
    public final InspirationFont A02;
    public final OverlayAnimationStyle A03;
    public final ImmutableList A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final Qpr A0O;
    public final ELI A0P;
    public final KMg A0Q;
    public final String A0R;
    public final Set A0S;

    /* loaded from: ComposerRichTextStyle$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0095. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            String str2;
            String str3 = null;
            String str4 = null;
            ImmutableList immutableList = null;
            double d = 0.0d;
            KMg kMg = null;
            InspirationFont inspirationFont = null;
            String str5 = null;
            String str6 = null;
            OverlayAnimationStyle overlayAnimationStyle = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            double d2 = 0.0d;
            String str11 = null;
            ELI eli = null;
            Qpr qpr = null;
            String str12 = null;
            HashSet A0v = AnonymousClass001.A0v();
            String A00 = GOm.A00(32);
            String str13 = "";
            String str14 = str13;
            String str15 = str13;
            String str16 = "#FF000000";
            String str17 = str13;
            String str18 = "default";
            String str19 = str13;
            String str20 = str13;
            String str21 = str13;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        switch (A1Y.hashCode()) {
                            case -2117277325:
                                if (A1Y.equals("text_align")) {
                                    eli = (ELI) AbstractC11224vw.A02(abstractC01033pi, c27t, ELI.class);
                                    C1pq.A08("textAlign", eli);
                                    A0v = 4YV.A10("textAlign", A0v);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1774711020:
                                if (A1Y.equals("portrait_keyframes_animation_id")) {
                                    str9 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1716261559:
                                if (A1Y.equals("ranking_score")) {
                                    d2 = abstractC01033pi.A11();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1510456032:
                                if (A1Y.equals("delight_ranges")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, C3305Jq0.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1145048242:
                                if (A1Y.equals("custom_thumbnail_url")) {
                                    str17 = AbstractC11224vw.A03(abstractC01033pi);
                                    str = "customThumbnailUrl";
                                    str2 = str17;
                                    C1pq.A08(str, str2);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -921784709:
                                if (A1Y.equals("preset_id")) {
                                    str19 = AbstractC11224vw.A03(abstractC01033pi);
                                    str = "presetId";
                                    str2 = str19;
                                    C1pq.A08(str, str2);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -877259807:
                                if (A1Y.equals("background_gradient_direction")) {
                                    str14 = AbstractC11224vw.A03(abstractC01033pi);
                                    str = "backgroundGradientDirection";
                                    str2 = str14;
                                    C1pq.A08(str, str2);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -299113657:
                                if (A1Y.equals("overlay_animation_style")) {
                                    overlayAnimationStyle = (OverlayAnimationStyle) AbstractC11224vw.A02(abstractC01033pi, c27t, OverlayAnimationStyle.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -168253766:
                                if (A1Y.equals("background_image_url")) {
                                    str15 = AbstractC11224vw.A03(abstractC01033pi);
                                    str = "backgroundImageUrl";
                                    str2 = str15;
                                    C1pq.A08(str, str2);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 3373707:
                                if (A1Y.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                    str18 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str18);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 8688281:
                                if (A1Y.equals(DKB.A00(32))) {
                                    str21 = AbstractC11224vw.A03(abstractC01033pi);
                                    str = "trackingString";
                                    str2 = str21;
                                    C1pq.A08(str, str2);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 94842723:
                                if (A1Y.equals("color")) {
                                    str16 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("color", str16);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 110327241:
                                if (A1Y.equals("theme")) {
                                    qpr = (Qpr) AbstractC11224vw.A02(abstractC01033pi, c27t, Qpr.class);
                                    C1pq.A08("theme", qpr);
                                    A0v = 4YV.A10("theme", A0v);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 752641086:
                                if (A1Y.equals(MsysOpenMessagingAttachmentDeletionPluginPostmailbox.PLAYABLE_URL)) {
                                    str7 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 818545299:
                                if (A1Y.equals("portrait_keyframes_animation_uri")) {
                                    str10 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 862817528:
                                if (A1Y.equals("thumbnail_image_url")) {
                                    str20 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("thumbnailImageUrl", str20);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 971957470:
                                if (A1Y.equals("portrait_background_image_url")) {
                                    str8 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1151387487:
                                if (A1Y.equals(TraceFieldType.VideoId)) {
                                    str12 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1311007823:
                                if (A1Y.equals("fixed_aspect_ratio")) {
                                    d = abstractC01033pi.A11();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1567482475:
                                if (A1Y.equals("background_description")) {
                                    str4 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1681957687:
                                if (A1Y.equals("keyframes_animation_uri")) {
                                    str6 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1725212620:
                                if (A1Y.equals("style_category")) {
                                    str11 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("styleCategory", str11);
                                    A0v = 4YV.A10("styleCategory", A0v);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1911135364:
                                if (A1Y.equals("inspiration_font")) {
                                    inspirationFont = (InspirationFont) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationFont.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1993918960:
                                if (A1Y.equals("keyframes_animation_id")) {
                                    str5 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2024311912:
                                if (A1Y.equals("font_weight")) {
                                    kMg = (KMg) AbstractC11224vw.A02(abstractC01033pi, c27t, KMg.class);
                                    C1pq.A08("fontWeight", kMg);
                                    A0v = 4YV.A10("fontWeight", A0v);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2036780306:
                                if (A1Y.equals(GOm.A00(4))) {
                                    A00 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("backgroundColor", A00);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2045164741:
                                if (A1Y.equals("background_gradient_color")) {
                                    str13 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08(MRk.A00(12), str13);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2122282369:
                                if (A1Y.equals("avatar_story_text_format_id")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
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
                    C4V6.A01(abstractC01033pi, ComposerRichTextStyle.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerRichTextStyle(qpr, inspirationFont, eli, kMg, overlayAnimationStyle, immutableList, str3, A00, str4, str13, str14, str15, str16, str17, str5, str6, str18, str7, str8, str9, str10, str19, str11, str20, str21, str12, A0v, d, d2);
        }
    }

    /* loaded from: ComposerRichTextStyle$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerRichTextStyle composerRichTextStyle = (ComposerRichTextStyle) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "avatar_story_text_format_id", composerRichTextStyle.A05);
            AbstractC11224vw.A0D(r302, GOm.A00(4), composerRichTextStyle.A06);
            AbstractC11224vw.A0D(r302, "background_description", composerRichTextStyle.A07);
            AbstractC11224vw.A0D(r302, "background_gradient_color", composerRichTextStyle.A08);
            AbstractC11224vw.A0D(r302, "background_gradient_direction", composerRichTextStyle.A09);
            AbstractC11224vw.A0D(r302, "background_image_url", composerRichTextStyle.A0A);
            AbstractC11224vw.A0D(r302, "color", composerRichTextStyle.A0B);
            AbstractC11224vw.A0D(r302, "custom_thumbnail_url", composerRichTextStyle.A0C);
            AbstractC11224vw.A06(r302, c26c, "delight_ranges", composerRichTextStyle.A04);
            double d = composerRichTextStyle.A00;
            r302.A0o("fixed_aspect_ratio");
            r302.A0d(d);
            AbstractC11224vw.A05(r302, c26c, composerRichTextStyle.A02(), "font_weight");
            AbstractC11224vw.A05(r302, c26c, composerRichTextStyle.A02, "inspiration_font");
            AbstractC11224vw.A0D(r302, "keyframes_animation_id", composerRichTextStyle.A0D);
            AbstractC11224vw.A0D(r302, "keyframes_animation_uri", composerRichTextStyle.A0E);
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, composerRichTextStyle.A0F);
            AbstractC11224vw.A05(r302, c26c, composerRichTextStyle.A03, "overlay_animation_style");
            AbstractC11224vw.A0D(r302, MsysOpenMessagingAttachmentDeletionPluginPostmailbox.PLAYABLE_URL, composerRichTextStyle.A0G);
            AbstractC11224vw.A0D(r302, "portrait_background_image_url", composerRichTextStyle.A0H);
            AbstractC11224vw.A0D(r302, "portrait_keyframes_animation_id", composerRichTextStyle.A0I);
            AbstractC11224vw.A0D(r302, "portrait_keyframes_animation_uri", composerRichTextStyle.A0J);
            AbstractC11224vw.A0D(r302, "preset_id", composerRichTextStyle.A0K);
            double d2 = composerRichTextStyle.A01;
            r302.A0o("ranking_score");
            r302.A0d(d2);
            AbstractC11224vw.A0D(r302, "style_category", composerRichTextStyle.A03());
            AbstractC11224vw.A05(r302, c26c, composerRichTextStyle.A01(), "text_align");
            AbstractC11224vw.A05(r302, c26c, composerRichTextStyle.A00(), "theme");
            AbstractC11224vw.A0D(r302, "thumbnail_image_url", composerRichTextStyle.A0L);
            AbstractC11224vw.A0D(r302, DKB.A00(32), composerRichTextStyle.A0M);
            AbstractC11224vw.A0D(r302, TraceFieldType.VideoId, composerRichTextStyle.A0N);
            r302.A0Y();
        }
    }

    public ComposerRichTextStyle(Qpr qpr, InspirationFont inspirationFont, ELI eli, KMg kMg, OverlayAnimationStyle overlayAnimationStyle, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Set set, double d, double d2) {
        this.A05 = str;
        C1pq.A08("backgroundColor", str2);
        this.A06 = str2;
        this.A07 = str3;
        C1pq.A08(MRk.A00(12), str4);
        this.A08 = str4;
        C1pq.A08("backgroundGradientDirection", str5);
        this.A09 = str5;
        C1pq.A08("backgroundImageUrl", str6);
        this.A0A = str6;
        C1pq.A08("color", str7);
        this.A0B = str7;
        C1pq.A08("customThumbnailUrl", str8);
        this.A0C = str8;
        this.A04 = immutableList;
        this.A00 = d;
        this.A0Q = kMg;
        this.A02 = inspirationFont;
        this.A0D = str9;
        this.A0E = str10;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str11);
        this.A0F = str11;
        this.A03 = overlayAnimationStyle;
        this.A0G = str12;
        this.A0H = str13;
        this.A0I = str14;
        this.A0J = str15;
        C1pq.A08("presetId", str16);
        this.A0K = str16;
        this.A01 = d2;
        this.A0R = str17;
        this.A0P = eli;
        this.A0O = qpr;
        C1pq.A08("thumbnailImageUrl", str18);
        this.A0L = str18;
        C1pq.A08("trackingString", str19);
        this.A0M = str19;
        this.A0N = str20;
        this.A0S = Collections.unmodifiableSet(set);
    }

    public ComposerRichTextStyle(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Qpr qpr = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = ImmutableList.copyOf((Collection) FJ8.A06(parcel));
        }
        this.A00 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = KMg.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (InspirationFont) InspirationFont.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        this.A0F = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (OverlayAnimationStyle) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        this.A0K = parcel.readString();
        this.A01 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = ELI.values()[parcel.readInt()];
        }
        this.A0O = parcel.readInt() != 0 ? Qpr.values()[parcel.readInt()] : qpr;
        this.A0L = parcel.readString();
        this.A0M = parcel.readString();
        this.A0N = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0S = Collections.unmodifiableSet(A0v);
    }

    public Qpr A00() {
        if (this.A0S.contains("theme")) {
            return this.A0O;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = Qpr.A03;
                }
            }
        }
        return A0T;
    }

    public ELI A01() {
        if (this.A0S.contains("textAlign")) {
            return this.A0P;
        }
        if (A0U == null) {
            synchronized (this) {
                if (A0U == null) {
                    A0U = ELI.A04;
                }
            }
        }
        return A0U;
    }

    public KMg A02() {
        if (this.A0S.contains("fontWeight")) {
            return this.A0Q;
        }
        if (A0V == null) {
            synchronized (this) {
                if (A0V == null) {
                    A0V = KMg.A03;
                }
            }
        }
        return A0V;
    }

    public String A03() {
        if (this.A0S.contains("styleCategory")) {
            return this.A0R;
        }
        if (A0W == null) {
            synchronized (this) {
                if (A0W == null) {
                    A0W = "UNDEFINED";
                }
            }
        }
        return A0W;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerRichTextStyle)) {
                return false;
            }
            ComposerRichTextStyle composerRichTextStyle = (ComposerRichTextStyle) obj;
            if (!11T.A0O(this.A05, composerRichTextStyle.A05) || !11T.A0O(this.A06, composerRichTextStyle.A06) || !11T.A0O(this.A07, composerRichTextStyle.A07) || !11T.A0O(this.A08, composerRichTextStyle.A08) || !11T.A0O(this.A09, composerRichTextStyle.A09) || !11T.A0O(this.A0A, composerRichTextStyle.A0A) || !11T.A0O(this.A0B, composerRichTextStyle.A0B) || !11T.A0O(this.A0C, composerRichTextStyle.A0C) || !11T.A0O(this.A04, composerRichTextStyle.A04) || this.A00 != composerRichTextStyle.A00 || A02() != composerRichTextStyle.A02() || !11T.A0O(this.A02, composerRichTextStyle.A02) || !11T.A0O(this.A0D, composerRichTextStyle.A0D) || !11T.A0O(this.A0E, composerRichTextStyle.A0E) || !11T.A0O(this.A0F, composerRichTextStyle.A0F) || !11T.A0O(this.A03, composerRichTextStyle.A03) || !11T.A0O(this.A0G, composerRichTextStyle.A0G) || !11T.A0O(this.A0H, composerRichTextStyle.A0H) || !11T.A0O(this.A0I, composerRichTextStyle.A0I) || !11T.A0O(this.A0J, composerRichTextStyle.A0J) || !11T.A0O(this.A0K, composerRichTextStyle.A0K) || this.A01 != composerRichTextStyle.A01 || !11T.A0O(A03(), composerRichTextStyle.A03()) || A01() != composerRichTextStyle.A01() || A00() != composerRichTextStyle.A00() || !11T.A0O(this.A0L, composerRichTextStyle.A0L) || !11T.A0O(this.A0M, composerRichTextStyle.A0M) || !11T.A0O(this.A0N, composerRichTextStyle.A0N)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = (C1pq.A04(A03(), C1pq.A00(this.A01, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A03, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A02, (C1pq.A00(this.A00, C1pq.A04(this.A04, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A03(this.A05)))))))))) * 31) + C3o5.A03(A02()))))))))))))) * 31) + C3o5.A03(A01());
        Qpr A00 = A00();
        if (A00 != null) {
            i = A00.ordinal();
        }
        return C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A0L, (A04 * 31) + i)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComposerRichTextStyle{avatarStoryTextFormatId=");
        A0k.append(this.A05);
        A0k.append(DKB.A00(34));
        A0k.append(this.A06);
        A0k.append(", backgroundDescription=");
        A0k.append(this.A07);
        A0k.append(", backgroundGradientColor=");
        A0k.append(this.A08);
        A0k.append(", backgroundGradientDirection=");
        A0k.append(this.A09);
        A0k.append(", backgroundImageUrl=");
        A0k.append(this.A0A);
        A0k.append(", color=");
        A0k.append(this.A0B);
        A0k.append(", customThumbnailUrl=");
        A0k.append(this.A0C);
        A0k.append(", delightRanges=");
        A0k.append(this.A04);
        A0k.append(", fixedAspectRatio=");
        A0k.append(this.A00);
        A0k.append(", fontWeight=");
        A0k.append(A02());
        A0k.append(", inspirationFont=");
        A0k.append(this.A02);
        A0k.append(", keyframesAnimationId=");
        A0k.append(this.A0D);
        A0k.append(", keyframesAnimationUri=");
        A0k.append(this.A0E);
        A0k.append(", name=");
        A0k.append(this.A0F);
        A0k.append(", overlayAnimationStyle=");
        A0k.append(this.A03);
        A0k.append(", playableUrl=");
        A0k.append(this.A0G);
        A0k.append(", portraitBackgroundImageUrl=");
        A0k.append(this.A0H);
        A0k.append(", portraitKeyframesAnimationId=");
        A0k.append(this.A0I);
        A0k.append(", portraitKeyframesAnimationUri=");
        A0k.append(this.A0J);
        A0k.append(", presetId=");
        A0k.append(this.A0K);
        A0k.append(", rankingScore=");
        A0k.append(this.A01);
        A0k.append(", styleCategory=");
        A0k.append(A03());
        A0k.append(", textAlign=");
        A0k.append(A01());
        A0k.append(", theme=");
        A0k.append(A00());
        A0k.append(", thumbnailImageUrl=");
        A0k.append(this.A0L);
        A0k.append(", trackingString=");
        A0k.append(this.A0M);
        A0k.append(", videoId=");
        return GOq.A12(this.A0N, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0B(parcel, immutableList);
        }
        parcel.writeDouble(this.A00);
        C3o5.A0e(parcel, this.A0Q);
        InspirationFont inspirationFont = this.A02;
        if (inspirationFont == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationFont.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        parcel.writeString(this.A0F);
        C3o5.A0d(parcel, this.A03, i);
        1BL.A13(parcel, this.A0G);
        1BL.A13(parcel, this.A0H);
        1BL.A13(parcel, this.A0I);
        1BL.A13(parcel, this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeDouble(this.A01);
        1BL.A13(parcel, this.A0R);
        C3o5.A0e(parcel, this.A0P);
        C3o5.A0e(parcel, this.A0O);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        1BL.A13(parcel, this.A0N);
        Iterator A0S = C3o5.A0S(parcel, this.A0S);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
