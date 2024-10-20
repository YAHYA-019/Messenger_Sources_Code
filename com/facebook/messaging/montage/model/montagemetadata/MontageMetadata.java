package com.facebook.messaging.montage.model.montagemetadata;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4EZ;
import X.5BB;
import X.AbG;
import X.AbstractC00603o4;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4Eb;
import X.C4Ed;
import X.C4Ny;
import X.C4V6;
import X.FJ8;
import X.GhC;
import X.Hkj;
import X.MRk;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.forker.Process;
import com.facebook.messaging.montage.forked.viewer.model.InlineActivityInfo;
import com.facebook.messaging.montage.forked.viewer.model.StoryBackgroundInfo;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: MontageMetadata.class */
public final class MontageMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(29);
    public final 4EZ A00;
    public final C4Ed A01;
    public final InlineActivityInfo A02;
    public final StoryBackgroundInfo A03;
    public final MontageActorInfo A04;
    public final MontageStoryLocationData A05;
    public final C4Eb A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final Boolean A0B;
    public final Float A0C;
    public final Float A0D;
    public final Long A0E;
    public final Long A0F;
    public final Long A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    /* loaded from: MontageMetadata$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableList A00;
            String str;
            Hkj hkj = new Hkj();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2077023236:
                                if (A1C.equals("montage_x_ray_smart_feature")) {
                                    A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, MontageXRaySmartFeature.class);
                                    hkj.A07 = A00;
                                    str = AbstractC00603o4.A00(Process.SD_STDOUT);
                                    C1pq.A08(str, A00);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1988814966:
                                if (A1C.equals("montage_original_data_id")) {
                                    hkj.A0L = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1956965529:
                                if (A1C.equals("can_show_story_in_thread")) {
                                    hkj.A0R = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1294833533:
                                if (A1C.equals("can_report")) {
                                    hkj.A0Q = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1082904102:
                                if (A1C.equals("should_show_in_tray")) {
                                    hkj.A0Y = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1071752347:
                                if (A1C.equals(MRk.A00(25))) {
                                    hkj.A01 = (C4Ed) AbstractC11224vw.A02(abstractC01033pi, c27t, C4Ed.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1032493414:
                                if (A1C.equals("montage_message_type")) {
                                    hkj.A0K = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -960432552:
                                if (A1C.equals("montage_objectionable_content_info")) {
                                    hkj.A06 = (C4Eb) AbstractC11224vw.A02(abstractC01033pi, c27t, C4Eb.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -775506228:
                                if (A1C.equals("activity_description")) {
                                    hkj.A00 = (4EZ) AbstractC11224vw.A02(abstractC01033pi, c27t, 4EZ.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -709951264:
                                if (A1C.equals("montage_actor_info")) {
                                    hkj.A04 = (MontageActorInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, MontageActorInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -492033556:
                                if (A1C.equals("encoded_id")) {
                                    hkj.A0H = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -476980957:
                                if (A1C.equals("metadata_from_omnistore")) {
                                    hkj.A0B = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -376233884:
                                if (A1C.equals("is_unread")) {
                                    hkj.A0X = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -196405935:
                                if (A1C.equals("is_reshareable")) {
                                    hkj.A0W = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -126620376:
                                if (A1C.equals("can_mute")) {
                                    hkj.A0O = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 185017562:
                                if (A1C.equals("legacy_thread_key_id")) {
                                    hkj.A0E = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 206656509:
                                if (A1C.equals("bucket_score")) {
                                    hkj.A0C = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 298123659:
                                if (A1C.equals("is_delivery_logging_enabled")) {
                                    hkj.A0U = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 373873083:
                                if (A1C.equals("can_reply")) {
                                    hkj.A0P = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 417210788:
                                if (A1C.equals("reshare_intents")) {
                                    A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, String.class);
                                    hkj.A08 = A00;
                                    str = "reshareIntents";
                                    C1pq.A08(str, A00);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 472834883:
                                if (A1C.equals("has_long_text_metadata")) {
                                    hkj.A0S = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 478518140:
                                if (A1C.equals("story_viewer_background_info")) {
                                    hkj.A03 = (StoryBackgroundInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, StoryBackgroundInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 492543234:
                                if (A1C.equals("montage_story_location_data")) {
                                    hkj.A05 = (MontageStoryLocationData) AbstractC11224vw.A02(abstractC01033pi, c27t, MontageStoryLocationData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 680364845:
                                if (A1C.equals("feed_encoded_id")) {
                                    hkj.A0I = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 881838197:
                                if (A1C.equals("story_play_duration")) {
                                    hkj.A0F = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1090794272:
                                if (A1C.equals("integrity_score")) {
                                    hkj.A0D = (Float) AbstractC11224vw.A02(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1259002733:
                                if (A1C.equals("has_media_text")) {
                                    hkj.A0T = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1261153850:
                                if (A1C.equals("original_post_permalink")) {
                                    hkj.A0N = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1278858501:
                                if (A1C.equals("text_format_preset_id")) {
                                    hkj.A0G = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1419219041:
                                if (A1C.equals("media_caption_text")) {
                                    hkj.A0J = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1469264056:
                                if (A1C.equals("inline_activity_info")) {
                                    hkj.A02 = (InlineActivityInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InlineActivityInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1592568317:
                                if (A1C.equals("montage_story_url")) {
                                    hkj.A0M = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1696201478:
                                if (A1C.equals("share_story_attachments")) {
                                    hkj.A0A = AbstractC11224vw.A00(abstractC01033pi, c27t, GhC.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2001471417:
                                if (A1C.equals("is_my_montage")) {
                                    hkj.A0V = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2022463996:
                                if (A1C.equals("share_attachment_ids")) {
                                    hkj.A09 = AbstractC11224vw.A00(abstractC01033pi, c27t, Long.class);
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
                    C4V6.A01(abstractC01033pi, MontageMetadata.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MontageMetadata(hkj);
        }
    }

    /* loaded from: MontageMetadata$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MontageMetadata montageMetadata = (MontageMetadata) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, montageMetadata.A00, "activity_description");
            AbstractC11224vw.A0A(r302, montageMetadata.A0C, "bucket_score");
            boolean z = montageMetadata.A0O;
            r302.A0o("can_mute");
            r302.A0v(z);
            boolean z2 = montageMetadata.A0P;
            r302.A0o("can_reply");
            r302.A0v(z2);
            boolean z3 = montageMetadata.A0Q;
            r302.A0o("can_report");
            r302.A0v(z3);
            boolean z4 = montageMetadata.A0R;
            r302.A0o("can_show_story_in_thread");
            r302.A0v(z4);
            AbstractC11224vw.A0D(r302, "encoded_id", montageMetadata.A0H);
            AbstractC11224vw.A0D(r302, "feed_encoded_id", montageMetadata.A0I);
            boolean z5 = montageMetadata.A0S;
            r302.A0o("has_long_text_metadata");
            r302.A0v(z5);
            boolean z6 = montageMetadata.A0T;
            r302.A0o("has_media_text");
            r302.A0v(z6);
            AbstractC11224vw.A05(r302, c26c, montageMetadata.A02, "inline_activity_info");
            AbstractC11224vw.A0A(r302, montageMetadata.A0D, "integrity_score");
            boolean z7 = montageMetadata.A0U;
            r302.A0o("is_delivery_logging_enabled");
            r302.A0v(z7);
            boolean z8 = montageMetadata.A0V;
            r302.A0o("is_my_montage");
            r302.A0v(z8);
            boolean z9 = montageMetadata.A0W;
            r302.A0o("is_reshareable");
            r302.A0v(z9);
            boolean z10 = montageMetadata.A0X;
            r302.A0o("is_unread");
            r302.A0v(z10);
            AbstractC11224vw.A0C(r302, montageMetadata.A0E, "legacy_thread_key_id");
            AbstractC11224vw.A0D(r302, "media_caption_text", montageMetadata.A0J);
            AbstractC11224vw.A08(r302, montageMetadata.A0B, "metadata_from_omnistore");
            AbstractC11224vw.A05(r302, c26c, montageMetadata.A04, "montage_actor_info");
            AbstractC11224vw.A0D(r302, "montage_message_type", montageMetadata.A0K);
            AbstractC11224vw.A05(r302, c26c, montageMetadata.A06, "montage_objectionable_content_info");
            AbstractC11224vw.A0D(r302, "montage_original_data_id", montageMetadata.A0L);
            AbstractC11224vw.A05(r302, c26c, montageMetadata.A05, "montage_story_location_data");
            AbstractC11224vw.A0D(r302, "montage_story_url", montageMetadata.A0M);
            AbstractC11224vw.A06(r302, c26c, "montage_x_ray_smart_feature", montageMetadata.A07);
            AbstractC11224vw.A0D(r302, "original_post_permalink", montageMetadata.A0N);
            AbstractC11224vw.A06(r302, c26c, "reshare_intents", montageMetadata.A08);
            AbstractC11224vw.A06(r302, c26c, "share_attachment_ids", montageMetadata.A09);
            AbstractC11224vw.A06(r302, c26c, "share_story_attachments", montageMetadata.A0A);
            boolean z11 = montageMetadata.A0Y;
            r302.A0o("should_show_in_tray");
            r302.A0v(z11);
            AbstractC11224vw.A0C(r302, montageMetadata.A0F, "story_play_duration");
            AbstractC11224vw.A05(r302, c26c, montageMetadata.A03, "story_viewer_background_info");
            AbstractC11224vw.A05(r302, c26c, montageMetadata.A01, MRk.A00(25));
            AbstractC11224vw.A0C(r302, montageMetadata.A0G, "text_format_preset_id");
            r302.A0Y();
        }
    }

    public MontageMetadata(Hkj hkj) {
        this.A00 = hkj.A00;
        this.A0C = hkj.A0C;
        this.A0O = hkj.A0O;
        this.A0P = hkj.A0P;
        this.A0Q = hkj.A0Q;
        this.A0R = hkj.A0R;
        this.A0H = hkj.A0H;
        this.A0I = hkj.A0I;
        this.A0S = hkj.A0S;
        this.A0T = hkj.A0T;
        this.A02 = hkj.A02;
        this.A0D = hkj.A0D;
        this.A0U = hkj.A0U;
        this.A0V = hkj.A0V;
        this.A0W = hkj.A0W;
        this.A0X = hkj.A0X;
        this.A0E = hkj.A0E;
        this.A0J = hkj.A0J;
        this.A0B = hkj.A0B;
        this.A04 = hkj.A04;
        this.A0K = hkj.A0K;
        this.A06 = hkj.A06;
        this.A0L = hkj.A0L;
        this.A05 = hkj.A05;
        this.A0M = hkj.A0M;
        ImmutableList immutableList = hkj.A07;
        C1pq.A08("montageXRaySmartFeature", immutableList);
        this.A07 = immutableList;
        this.A0N = hkj.A0N;
        ImmutableList immutableList2 = hkj.A08;
        C1pq.A08("reshareIntents", immutableList2);
        this.A08 = immutableList2;
        this.A09 = hkj.A09;
        this.A0A = hkj.A0A;
        this.A0Y = hkj.A0Y;
        this.A0F = hkj.A0F;
        this.A03 = hkj.A03;
        this.A01 = hkj.A01;
        this.A0G = hkj.A0G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MontageMetadata(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        Long l = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = Float.valueOf(parcel.readFloat());
        }
        boolean z = false;
        this.A0O = parcel.readInt() == 1;
        this.A0P = parcel.readInt() == 1;
        this.A0Q = parcel.readInt() == 1;
        this.A0R = parcel.readInt() == 1;
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
        this.A0S = parcel.readInt() == 1;
        this.A0T = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (InlineActivityInfo) InlineActivityInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = Float.valueOf(parcel.readFloat());
        }
        this.A0U = parcel.readInt() == 1;
        this.A0V = parcel.readInt() == 1;
        this.A0W = parcel.readInt() == 1;
        this.A0X = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (MontageActorInfo) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (C4Eb) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (MontageStoryLocationData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        int readInt = parcel.readInt();
        MontageXRaySmartFeature[] montageXRaySmartFeatureArr = new MontageXRaySmartFeature[readInt];
        for (int i = 0; i < readInt; i++) {
            montageXRaySmartFeatureArr[i] = parcel.readParcelable(classLoader);
        }
        this.A07 = ImmutableList.copyOf(montageXRaySmartFeatureArr);
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            strArr[i2] = parcel.readString();
        }
        this.A08 = ImmutableList.copyOf(strArr);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            int readInt3 = parcel.readInt();
            Long[] lArr = new Long[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                lArr[i3] = Long.valueOf(parcel.readLong());
            }
            this.A09 = ImmutableList.copyOf(lArr);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = ImmutableList.copyOf((Collection) FJ8.A06(parcel));
        }
        this.A0Y = parcel.readInt() == 1 ? true : z;
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (StoryBackgroundInfo) StoryBackgroundInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (C4Ed) FJ8.A01(parcel);
        }
        this.A0G = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : l;
    }

    public MontageMetadata(StoryBackgroundInfo storyBackgroundInfo, MontageActorInfo montageActorInfo, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Long l, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A00 = null;
        this.A0C = null;
        this.A0O = z;
        this.A0P = z2;
        this.A0Q = z3;
        this.A0R = z4;
        this.A0H = null;
        this.A0I = str;
        this.A0S = z5;
        this.A0T = z6;
        this.A02 = null;
        this.A0D = null;
        this.A0U = false;
        this.A0V = z7;
        this.A0W = false;
        this.A0X = z8;
        this.A0E = null;
        this.A0J = null;
        this.A0B = null;
        this.A04 = montageActorInfo;
        this.A0K = str2;
        this.A06 = null;
        this.A0L = null;
        this.A05 = null;
        this.A0M = null;
        C1pq.A08("montageXRaySmartFeature", immutableList);
        this.A07 = immutableList;
        this.A0N = null;
        C1pq.A08("reshareIntents", immutableList2);
        this.A08 = immutableList2;
        this.A09 = immutableList3;
        this.A0A = null;
        this.A0Y = z9;
        this.A0F = null;
        this.A03 = storyBackgroundInfo;
        this.A01 = null;
        this.A0G = l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageMetadata)) {
                return false;
            }
            MontageMetadata montageMetadata = (MontageMetadata) obj;
            if (!11T.A0O(this.A00, montageMetadata.A00) || !11T.A0O(this.A0C, montageMetadata.A0C) || this.A0O != montageMetadata.A0O || this.A0P != montageMetadata.A0P || this.A0Q != montageMetadata.A0Q || this.A0R != montageMetadata.A0R || !11T.A0O(this.A0H, montageMetadata.A0H) || !11T.A0O(this.A0I, montageMetadata.A0I) || this.A0S != montageMetadata.A0S || this.A0T != montageMetadata.A0T || !11T.A0O(this.A02, montageMetadata.A02) || !11T.A0O(this.A0D, montageMetadata.A0D) || this.A0U != montageMetadata.A0U || this.A0V != montageMetadata.A0V || this.A0W != montageMetadata.A0W || this.A0X != montageMetadata.A0X || !11T.A0O(this.A0E, montageMetadata.A0E) || !11T.A0O(this.A0J, montageMetadata.A0J) || !11T.A0O(this.A0B, montageMetadata.A0B) || !11T.A0O(this.A04, montageMetadata.A04) || !11T.A0O(this.A0K, montageMetadata.A0K) || !11T.A0O(this.A06, montageMetadata.A06) || !11T.A0O(this.A0L, montageMetadata.A0L) || !11T.A0O(this.A05, montageMetadata.A05) || !11T.A0O(this.A0M, montageMetadata.A0M) || !11T.A0O(this.A07, montageMetadata.A07) || !11T.A0O(this.A0N, montageMetadata.A0N) || !11T.A0O(this.A08, montageMetadata.A08) || !11T.A0O(this.A09, montageMetadata.A09) || !11T.A0O(this.A0A, montageMetadata.A0A) || this.A0Y != montageMetadata.A0Y || !11T.A0O(this.A0F, montageMetadata.A0F) || !11T.A0O(this.A03, montageMetadata.A03) || !11T.A0O(this.A01, montageMetadata.A01) || !11T.A0O(this.A0G, montageMetadata.A0G)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0G, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A04(this.A0F, C1pq.A02(C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A0N, C1pq.A04(this.A07, C1pq.A04(this.A0M, C1pq.A04(this.A05, C1pq.A04(this.A0L, C1pq.A04(this.A06, C1pq.A04(this.A0K, C1pq.A04(this.A04, C1pq.A04(this.A0B, C1pq.A04(this.A0J, C1pq.A04(this.A0E, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0D, C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0C, C1pq.A03(this.A00)), this.A0O), this.A0P), this.A0Q), this.A0R))), this.A0S), this.A0T))), this.A0U), this.A0V), this.A0W), this.A0X))))))))))))))), this.A0Y)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4EZ r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, r0);
        }
        Float f = this.A0C;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        1BL.A13(parcel, this.A0H);
        1BL.A13(parcel, this.A0I);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        InlineActivityInfo inlineActivityInfo = this.A02;
        if (inlineActivityInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inlineActivityInfo.writeToParcel(parcel, i);
        }
        Float f2 = this.A0D;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        C3o5.A0g(parcel, this.A0E);
        1BL.A13(parcel, this.A0J);
        Boolean bool = this.A0B;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C3o5.A0d(parcel, this.A04, i);
        1BL.A13(parcel, this.A0K);
        C4Eb c4Eb = this.A06;
        if (c4Eb == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, c4Eb);
        }
        1BL.A13(parcel, this.A0L);
        C3o5.A0d(parcel, this.A05, i);
        1BL.A13(parcel, this.A0M);
        1Du A0b = 1BL.A0b(parcel, this.A07);
        while (A0b.hasNext()) {
            parcel.writeParcelable((MontageXRaySmartFeature) A0b.next(), i);
        }
        1BL.A13(parcel, this.A0N);
        1Du A0b2 = 1BL.A0b(parcel, this.A08);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        ImmutableList immutableList = this.A09;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b3 = 1BL.A0b(parcel, immutableList);
            while (A0b3.hasNext()) {
                parcel.writeLong(((Number) A0b3.next()).longValue());
            }
        }
        ImmutableList immutableList2 = this.A0A;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0B(parcel, immutableList2);
        }
        parcel.writeInt(this.A0Y ? 1 : 0);
        C3o5.A0g(parcel, this.A0F);
        StoryBackgroundInfo storyBackgroundInfo = this.A03;
        if (storyBackgroundInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyBackgroundInfo.writeToParcel(parcel, i);
        }
        C4Ed c4Ed = this.A01;
        if (c4Ed == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, c4Ed);
        }
        C3o5.A0g(parcel, this.A0G);
    }
}
