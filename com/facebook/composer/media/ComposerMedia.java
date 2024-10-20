package com.facebook.composer.media;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YT;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C24b;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.DKH;
import X.DKf;
import X.FJ8;
import X.MRl;
import X.MT5;
import X.N2w;
import X.Qzo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.composer.camera.logging.InspirationLoggingInfo;
import com.facebook.composer.focuspoint.model.ComposerFocusPoint;
import com.facebook.composer.mediaeffect.model.CreativeFactoryEditingData;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.facebook.inspiration.analytics.mediaaccuracy.model.MediaAccuracyMediaTranscodeParams;
import com.facebook.inspiration.contextualmetadata.model.InspirationContextualFeatureInfo;
import com.facebook.inspiration.model.InspirationGenAIMediaUploadInfo;
import com.facebook.inspiration.model.InspirationMultiCaptureState;
import com.facebook.ipc.composer.model.ComposerTaggedUser;
import com.facebook.ipc.composer.model.ComposerVideoPollData;
import com.facebook.ipc.inspiration.model.InspirationEditingData;
import com.facebook.ipc.inspiration.model.InspirationMediaState;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.CreativeEditingData;
import com.facebook.video.creativeediting.model.VideoCreativeEditingData;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: ComposerMedia.class */
public final class ComposerMedia implements Parcelable {
    public static volatile GraphQLTextWithEntities A0h;
    public static final Parcelable.Creator CREATOR = new DKf(99);
    public final int A00;
    public final InspirationLoggingInfo A01;
    public final ComposerFocusPoint A02;
    public final ComposerMediaLinkedReelMetaData A03;
    public final ComposerMediaOverlayData A04;
    public final CreativeFactoryEditingData A05;
    public final GraphQLTextWithEntities A06;
    public final MediaAccuracyMediaTranscodeParams A07;
    public final InspirationGenAIMediaUploadInfo A08;
    public final InspirationMultiCaptureState A09;
    public final ComposerVideoPollData A0A;
    public final InspirationEditingData A0B;
    public final InspirationMediaState A0C;
    public final MediaData A0D;
    public final CreativeEditingData A0E;
    public final MT5 A0F;
    public final VideoCreativeEditingData A0G;
    public final ImmutableList A0H;
    public final ImmutableList A0I;
    public final ImmutableList A0J;
    public final ImmutableList A0K;
    public final ImmutableList A0L;
    public final ImmutableList A0M;
    public final ImmutableList A0N;
    public final ImmutableMap A0O;
    public final Boolean A0P;
    public final Boolean A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final Set A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;

    /* loaded from: ComposerMedia$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N2w n2w = new N2w();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2023177363:
                                if (A1C.equals("undo_stack")) {
                                    n2w.A03(AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationEditingData.class));
                                    break;
                                }
                                break;
                            case -2005255391:
                                if (A1C.equals(4YT.A00(10))) {
                                    n2w.A0R = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1808737821:
                                if (A1C.equals("dubbing_lang_code_to_audio_handle_map")) {
                                    ImmutableMap A0H = MRl.A0H(abstractC01033pi, c27t, C24b.A01(String.class), String.class);
                                    n2w.A0O = A0H;
                                    C1pq.A08("dubbingLangCodeToAudioHandleMap", A0H);
                                    break;
                                }
                                break;
                            case -1605373729:
                                if (A1C.equals("auto_captions_enabled")) {
                                    n2w.A0P = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case -1543692093:
                                if (A1C.equals("inspiration_logging_info")) {
                                    n2w.A01 = (InspirationLoggingInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationLoggingInfo.class);
                                    break;
                                }
                                break;
                            case -1405347055:
                                if (A1C.equals("custom_alt_text")) {
                                    n2w.A0U = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1276602435:
                                if (A1C.equals("video_creative_editing_data")) {
                                    n2w.A0G = (VideoCreativeEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, VideoCreativeEditingData.class);
                                    break;
                                }
                                break;
                            case -930630555:
                                if (A1C.equals("is_shared_from_story")) {
                                    n2w.A0g = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -789904279:
                                if (A1C.equals("video_collaborators")) {
                                    ImmutableList A0G = MRl.A0G(abstractC01033pi, c27t);
                                    n2w.A0M = A0G;
                                    C1pq.A08("videoCollaborators", A0G);
                                    break;
                                }
                                break;
                            case -677358073:
                                if (A1C.equals("optimistic_photo_upload_handle")) {
                                    n2w.A0X = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -250679589:
                                if (A1C.equals("video_list_ids")) {
                                    ImmutableList A0G2 = MRl.A0G(abstractC01033pi, c27t);
                                    n2w.A0N = A0G2;
                                    C1pq.A08("videoListIds", A0G2);
                                    break;
                                }
                                break;
                            case -184192746:
                                if (A1C.equals("media_accuracy_media_transcode_params")) {
                                    n2w.A07 = (MediaAccuracyMediaTranscodeParams) AbstractC11224vw.A02(abstractC01033pi, c27t, MediaAccuracyMediaTranscodeParams.class);
                                    break;
                                }
                                break;
                            case -78141654:
                                if (A1C.equals("enable_require_review_for_dubbing")) {
                                    n2w.A0d = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -66632341:
                                if (A1C.equals("contextual_features")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationContextualFeatureInfo.class);
                                    n2w.A0H = A00;
                                    C1pq.A08("contextualFeatures", A00);
                                    break;
                                }
                                break;
                            case -6698642:
                                if (A1C.equals("gen_a_i_media_upload_info")) {
                                    n2w.A08 = (InspirationGenAIMediaUploadInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationGenAIMediaUploadInfo.class);
                                    break;
                                }
                                break;
                            case 3355:
                                if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                                    n2w.A00 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 97604824:
                                if (A1C.equals("focus")) {
                                    n2w.A02 = (ComposerFocusPoint) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerFocusPoint.class);
                                    break;
                                }
                                break;
                            case 110371416:
                                if (A1C.equals("title")) {
                                    n2w.A0Z = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 123131553:
                                if (A1C.equals("inspiration_media_state")) {
                                    n2w.A0C = (InspirationMediaState) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationMediaState.class);
                                    break;
                                }
                                break;
                            case 172932703:
                                if (A1C.equals("campaign_i_d")) {
                                    n2w.A0T = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 285447737:
                                if (A1C.equals("overlay_data")) {
                                    n2w.A04 = (ComposerMediaOverlayData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerMediaOverlayData.class);
                                    break;
                                }
                                break;
                            case 302529701:
                                if (A1C.equals("linked_reel_meta_data")) {
                                    n2w.A03 = (ComposerMediaLinkedReelMetaData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerMediaLinkedReelMetaData.class);
                                    break;
                                }
                                break;
                            case 385219630:
                                if (A1C.equals("is_shared_from_feed")) {
                                    n2w.A0e = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 468080310:
                                if (A1C.equals("goodwill_video_campaign_id")) {
                                    n2w.A0V = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 552573414:
                                if (A1C.equals("caption")) {
                                    n2w.A00((GraphQLTextWithEntities) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLTextWithEntities.class));
                                    break;
                                }
                                break;
                            case 645590132:
                                if (A1C.equals("tagged_place")) {
                                    n2w.A0F = (MT5) AbstractC11224vw.A02(abstractC01033pi, c27t, MT5.class);
                                    break;
                                }
                                break;
                            case 650420597:
                                if (A1C.equals("tagged_users")) {
                                    ImmutableList A002 = AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerTaggedUser.class);
                                    n2w.A0K = A002;
                                    C1pq.A08("taggedUsers", A002);
                                    break;
                                }
                                break;
                            case 711124916:
                                if (A1C.equals("captions_review_required")) {
                                    n2w.A0Q = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case 822808161:
                                if (A1C.equals("is_shared_from_non_public_story")) {
                                    n2w.A0f = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 990955926:
                                if (A1C.equals("creative_factory_editing_data")) {
                                    n2w.A05 = (CreativeFactoryEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, CreativeFactoryEditingData.class);
                                    break;
                                }
                                break;
                            case 1242505643:
                                if (A1C.equals("ar_ads_encoded_token")) {
                                    n2w.A0S = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1361461465:
                                if (A1C.equals("preferred_thumbnail_handle")) {
                                    n2w.A0Y = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1398498307:
                                if (A1C.equals("enable_lip_sync")) {
                                    n2w.A0c = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1607114881:
                                if (A1C.equals("creative_editing_data")) {
                                    n2w.A0E = (CreativeEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, CreativeEditingData.class);
                                    break;
                                }
                                break;
                            case 1623707901:
                                if (A1C.equals("inspiration_multi_capture_state")) {
                                    n2w.A09 = (InspirationMultiCaptureState) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationMultiCaptureState.class);
                                    break;
                                }
                                break;
                            case 1899168102:
                                if (A1C.equals("video_poll_data")) {
                                    n2w.A0A = (ComposerVideoPollData) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerVideoPollData.class);
                                    break;
                                }
                                break;
                            case 1910659333:
                                if (A1C.equals("video_upload_quality")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n2w.A0a = A03;
                                    C1pq.A08("videoUploadQuality", A03);
                                    break;
                                }
                                break;
                            case 1939375909:
                                if (A1C.equals("media_data")) {
                                    n2w.A01((MediaData) AbstractC11224vw.A02(abstractC01033pi, c27t, MediaData.class));
                                    break;
                                }
                                break;
                            case 1948551431:
                                if (A1C.equals("redo_stack")) {
                                    n2w.A02(AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationEditingData.class));
                                    break;
                                }
                                break;
                            case 1998579103:
                                if (A1C.equals("linked_video_target_id")) {
                                    n2w.A0W = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 2019032358:
                                if (A1C.equals("inspiration_editing_data")) {
                                    n2w.A0B = (InspirationEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationEditingData.class);
                                    break;
                                }
                                break;
                            case 2070942917:
                                if (A1C.equals("dubbing_selected_languages")) {
                                    ImmutableList A0G3 = MRl.A0G(abstractC01033pi, c27t);
                                    n2w.A0I = A0G3;
                                    C1pq.A08("dubbingSelectedLanguages", A0G3);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerMedia.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerMedia(n2w);
        }
    }

    /* loaded from: ComposerMedia$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerMedia composerMedia = (ComposerMedia) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, 4YT.A00(10), composerMedia.A0R);
            AbstractC11224vw.A0D(r302, "ar_ads_encoded_token", composerMedia.A0S);
            AbstractC11224vw.A08(r302, composerMedia.A0P, "auto_captions_enabled");
            AbstractC11224vw.A0D(r302, "campaign_i_d", composerMedia.A0T);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A00(), "caption");
            AbstractC11224vw.A08(r302, composerMedia.A0Q, "captions_review_required");
            AbstractC11224vw.A06(r302, c26c, "contextual_features", composerMedia.A0H);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A0E, "creative_editing_data");
            AbstractC11224vw.A05(r302, c26c, composerMedia.A05, "creative_factory_editing_data");
            AbstractC11224vw.A0D(r302, "custom_alt_text", composerMedia.A0U);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A0O, "dubbing_lang_code_to_audio_handle_map");
            AbstractC11224vw.A06(r302, c26c, "dubbing_selected_languages", composerMedia.A0I);
            boolean z = composerMedia.A0c;
            r302.A0o("enable_lip_sync");
            r302.A0v(z);
            boolean z2 = composerMedia.A0d;
            r302.A0o("enable_require_review_for_dubbing");
            r302.A0v(z2);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A02, "focus");
            AbstractC11224vw.A05(r302, c26c, composerMedia.A08, "gen_a_i_media_upload_info");
            AbstractC11224vw.A0D(r302, "goodwill_video_campaign_id", composerMedia.A0V);
            int i = composerMedia.A00;
            r302.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            r302.A0f(i);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A0B, "inspiration_editing_data");
            AbstractC11224vw.A05(r302, c26c, composerMedia.A01, "inspiration_logging_info");
            AbstractC11224vw.A05(r302, c26c, composerMedia.A0C, "inspiration_media_state");
            AbstractC11224vw.A05(r302, c26c, composerMedia.A09, "inspiration_multi_capture_state");
            boolean z3 = composerMedia.A0e;
            r302.A0o("is_shared_from_feed");
            r302.A0v(z3);
            boolean z4 = composerMedia.A0f;
            r302.A0o("is_shared_from_non_public_story");
            r302.A0v(z4);
            boolean z5 = composerMedia.A0g;
            r302.A0o("is_shared_from_story");
            r302.A0v(z5);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A03, "linked_reel_meta_data");
            AbstractC11224vw.A0D(r302, "linked_video_target_id", composerMedia.A0W);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A07, "media_accuracy_media_transcode_params");
            AbstractC11224vw.A05(r302, c26c, composerMedia.A01(), "media_data");
            AbstractC11224vw.A0D(r302, "optimistic_photo_upload_handle", composerMedia.A0X);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A04, "overlay_data");
            AbstractC11224vw.A0D(r302, "preferred_thumbnail_handle", composerMedia.A0Y);
            AbstractC11224vw.A06(r302, c26c, "redo_stack", composerMedia.A0J);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A0F, "tagged_place");
            AbstractC11224vw.A06(r302, c26c, "tagged_users", composerMedia.A0K);
            AbstractC11224vw.A0D(r302, "title", composerMedia.A0Z);
            AbstractC11224vw.A06(r302, c26c, "undo_stack", composerMedia.A0L);
            AbstractC11224vw.A06(r302, c26c, "video_collaborators", composerMedia.A0M);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A0G, "video_creative_editing_data");
            AbstractC11224vw.A06(r302, c26c, "video_list_ids", composerMedia.A0N);
            AbstractC11224vw.A05(r302, c26c, composerMedia.A0A, "video_poll_data");
            AbstractC11224vw.A0D(r302, "video_upload_quality", composerMedia.A0a);
            r302.A0Y();
        }
    }

    public ComposerMedia(N2w n2w) {
        this.A0R = n2w.A0R;
        this.A0S = n2w.A0S;
        this.A0P = n2w.A0P;
        this.A0T = n2w.A0T;
        this.A06 = n2w.A06;
        this.A0Q = n2w.A0Q;
        ImmutableList immutableList = n2w.A0H;
        C1pq.A08("contextualFeatures", immutableList);
        this.A0H = immutableList;
        this.A0E = n2w.A0E;
        this.A05 = n2w.A05;
        this.A0U = n2w.A0U;
        ImmutableMap immutableMap = n2w.A0O;
        C1pq.A08("dubbingLangCodeToAudioHandleMap", immutableMap);
        this.A0O = immutableMap;
        ImmutableList immutableList2 = n2w.A0I;
        C1pq.A08("dubbingSelectedLanguages", immutableList2);
        this.A0I = immutableList2;
        this.A0c = n2w.A0c;
        this.A0d = n2w.A0d;
        this.A02 = n2w.A02;
        this.A08 = n2w.A08;
        this.A0V = n2w.A0V;
        this.A00 = n2w.A00;
        this.A0B = n2w.A0B;
        this.A01 = n2w.A01;
        this.A0C = n2w.A0C;
        this.A09 = n2w.A09;
        this.A0e = n2w.A0e;
        this.A0f = n2w.A0f;
        this.A0g = n2w.A0g;
        this.A03 = n2w.A03;
        this.A0W = n2w.A0W;
        this.A07 = n2w.A07;
        this.A0D = n2w.A0D;
        this.A0X = n2w.A0X;
        this.A04 = n2w.A04;
        this.A0Y = n2w.A0Y;
        ImmutableList immutableList3 = n2w.A0J;
        C1pq.A08("redoStack", immutableList3);
        this.A0J = immutableList3;
        this.A0F = n2w.A0F;
        ImmutableList immutableList4 = n2w.A0K;
        C1pq.A08("taggedUsers", immutableList4);
        this.A0K = immutableList4;
        this.A0Z = n2w.A0Z;
        ImmutableList immutableList5 = n2w.A0L;
        C1pq.A08("undoStack", immutableList5);
        this.A0L = immutableList5;
        ImmutableList immutableList6 = n2w.A0M;
        C1pq.A08("videoCollaborators", immutableList6);
        this.A0M = immutableList6;
        this.A0G = n2w.A0G;
        ImmutableList immutableList7 = n2w.A0N;
        C1pq.A08("videoListIds", immutableList7);
        this.A0N = immutableList7;
        this.A0A = n2w.A0A;
        String str = n2w.A0a;
        C1pq.A08("videoUploadQuality", str);
        this.A0a = str;
        this.A0b = Collections.unmodifiableSet(n2w.A0b);
    }

    public ComposerMedia(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ComposerVideoPollData composerVideoPollData = null;
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = parcel.readString();
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (GraphQLTextWithEntities) FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = Boolean.valueOf(1BM.A07(parcel));
        }
        int readInt = parcel.readInt();
        InspirationContextualFeatureInfo[] inspirationContextualFeatureInfoArr = new InspirationContextualFeatureInfo[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = DKG.A02(parcel, InspirationContextualFeatureInfo.CREATOR, inspirationContextualFeatureInfoArr, i2);
        }
        this.A0H = ImmutableList.copyOf(inspirationContextualFeatureInfoArr);
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (CreativeEditingData) CreativeEditingData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (CreativeFactoryEditingData) CreativeFactoryEditingData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = parcel.readString();
        }
        HashMap A0u = AnonymousClass001.A0u();
        int readInt2 = parcel.readInt();
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbL.A01(parcel, A0u, i3);
        }
        this.A0O = ImmutableMap.copyOf((Map) A0u);
        int readInt3 = parcel.readInt();
        String[] strArr = new String[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = AbH.A00(parcel, strArr, i4);
        }
        this.A0I = ImmutableList.copyOf(strArr);
        this.A0c = 1BM.A07(parcel);
        this.A0d = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ComposerFocusPoint) ComposerFocusPoint.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (InspirationGenAIMediaUploadInfo) InspirationGenAIMediaUploadInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = parcel.readString();
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (InspirationEditingData) InspirationEditingData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (InspirationLoggingInfo) InspirationLoggingInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (InspirationMediaState) InspirationMediaState.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (InspirationMultiCaptureState) InspirationMultiCaptureState.CREATOR.createFromParcel(parcel);
        }
        this.A0e = 1BM.A07(parcel);
        this.A0f = 1BM.A07(parcel);
        this.A0g = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (ComposerMediaLinkedReelMetaData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (MediaAccuracyMediaTranscodeParams) MediaAccuracyMediaTranscodeParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (ComposerMediaOverlayData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = parcel.readString();
        }
        int readInt4 = parcel.readInt();
        InspirationEditingData[] inspirationEditingDataArr = new InspirationEditingData[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = DKG.A02(parcel, InspirationEditingData.CREATOR, inspirationEditingDataArr, i5);
        }
        this.A0J = ImmutableList.copyOf(inspirationEditingDataArr);
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = FJ8.A01(parcel);
        }
        int readInt5 = parcel.readInt();
        ComposerTaggedUser[] composerTaggedUserArr = new ComposerTaggedUser[readInt5];
        int i6 = 0;
        while (i6 < readInt5) {
            i6 = DKG.A02(parcel, ComposerTaggedUser.CREATOR, composerTaggedUserArr, i6);
        }
        this.A0K = ImmutableList.copyOf(composerTaggedUserArr);
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = parcel.readString();
        }
        int readInt6 = parcel.readInt();
        InspirationEditingData[] inspirationEditingDataArr2 = new InspirationEditingData[readInt6];
        int i7 = 0;
        while (i7 < readInt6) {
            i7 = DKG.A02(parcel, InspirationEditingData.CREATOR, inspirationEditingDataArr2, i7);
        }
        this.A0L = ImmutableList.copyOf(inspirationEditingDataArr2);
        int readInt7 = parcel.readInt();
        String[] strArr2 = new String[readInt7];
        int i8 = 0;
        while (i8 < readInt7) {
            i8 = AbH.A00(parcel, strArr2, i8);
        }
        this.A0M = ImmutableList.copyOf(strArr2);
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (VideoCreativeEditingData) VideoCreativeEditingData.CREATOR.createFromParcel(parcel);
        }
        int readInt8 = parcel.readInt();
        String[] strArr3 = new String[readInt8];
        int i9 = 0;
        while (i9 < readInt8) {
            i9 = AbH.A00(parcel, strArr3, i9);
        }
        this.A0N = ImmutableList.copyOf(strArr3);
        this.A0A = parcel.readInt() != 0 ? (ComposerVideoPollData) ComposerVideoPollData.CREATOR.createFromParcel(parcel) : composerVideoPollData;
        this.A0a = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt9 = parcel.readInt();
        while (i < readInt9) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0b = Collections.unmodifiableSet(A0v);
    }

    public GraphQLTextWithEntities A00() {
        if (this.A0b.contains("caption")) {
            return this.A06;
        }
        if (A0h == null) {
            synchronized (this) {
                if (A0h == null) {
                    GraphQLTextWithEntities A00 = Qzo.A00("");
                    11T.A0A(A00);
                    A0h = A00;
                }
            }
        }
        return A0h;
    }

    public MediaData A01() {
        if (this.A0b.contains("mediaData")) {
            return this.A0D;
        }
        synchronized (this) {
            throw new NullPointerException("Media data should not be null");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMedia)) {
                return false;
            }
            ComposerMedia composerMedia = (ComposerMedia) obj;
            if (!11T.A0O(this.A0R, composerMedia.A0R) || !11T.A0O(this.A0S, composerMedia.A0S) || !11T.A0O(this.A0P, composerMedia.A0P) || !11T.A0O(this.A0T, composerMedia.A0T) || !11T.A0O(A00(), composerMedia.A00()) || !11T.A0O(this.A0Q, composerMedia.A0Q) || !11T.A0O(this.A0H, composerMedia.A0H) || !11T.A0O(this.A0E, composerMedia.A0E) || !11T.A0O(this.A05, composerMedia.A05) || !11T.A0O(this.A0U, composerMedia.A0U) || !11T.A0O(this.A0O, composerMedia.A0O) || !11T.A0O(this.A0I, composerMedia.A0I) || this.A0c != composerMedia.A0c || this.A0d != composerMedia.A0d || !11T.A0O(this.A02, composerMedia.A02) || !11T.A0O(this.A08, composerMedia.A08) || !11T.A0O(this.A0V, composerMedia.A0V) || this.A00 != composerMedia.A00 || !11T.A0O(this.A0B, composerMedia.A0B) || !11T.A0O(this.A01, composerMedia.A01) || !11T.A0O(this.A0C, composerMedia.A0C) || !11T.A0O(this.A09, composerMedia.A09) || this.A0e != composerMedia.A0e || this.A0f != composerMedia.A0f || this.A0g != composerMedia.A0g || !11T.A0O(this.A03, composerMedia.A03) || !11T.A0O(this.A0W, composerMedia.A0W) || !11T.A0O(this.A07, composerMedia.A07) || !11T.A0O(A01(), composerMedia.A01()) || !11T.A0O(this.A0X, composerMedia.A0X) || !11T.A0O(this.A04, composerMedia.A04) || !11T.A0O(this.A0Y, composerMedia.A0Y) || !11T.A0O(this.A0J, composerMedia.A0J) || !11T.A0O(this.A0F, composerMedia.A0F) || !11T.A0O(this.A0K, composerMedia.A0K) || !11T.A0O(this.A0Z, composerMedia.A0Z) || !11T.A0O(this.A0L, composerMedia.A0L) || !11T.A0O(this.A0M, composerMedia.A0M) || !11T.A0O(this.A0G, composerMedia.A0G) || !11T.A0O(this.A0N, composerMedia.A0N) || !11T.A0O(this.A0A, composerMedia.A0A) || !11T.A0O(this.A0a, composerMedia.A0a)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0a, C1pq.A04(this.A0A, C1pq.A04(this.A0N, C1pq.A04(this.A0G, C1pq.A04(this.A0M, C1pq.A04(this.A0L, C1pq.A04(this.A0Z, C1pq.A04(this.A0K, C1pq.A04(this.A0F, C1pq.A04(this.A0J, C1pq.A04(this.A0Y, C1pq.A04(this.A04, C1pq.A04(this.A0X, C1pq.A04(A01(), C1pq.A04(this.A07, C1pq.A04(this.A0W, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A09, C1pq.A04(this.A0C, C1pq.A04(this.A01, C1pq.A04(this.A0B, (C1pq.A04(this.A0V, C1pq.A04(this.A08, C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A04(this.A0I, C1pq.A04(this.A0O, C1pq.A04(this.A0U, C1pq.A04(this.A05, C1pq.A04(this.A0E, C1pq.A04(this.A0H, C1pq.A04(this.A0Q, C1pq.A04(A00(), C1pq.A04(this.A0T, C1pq.A04(this.A0P, C1pq.A04(this.A0S, C1pq.A03(this.A0R)))))))))))), this.A0c), this.A0d)))) * 31) + this.A00)))), this.A0e), this.A0f), this.A0g))))))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0R);
        1BL.A13(parcel, this.A0S);
        AbN.A0s(parcel, this.A0P);
        1BL.A13(parcel, this.A0T);
        DKH.A0y(parcel, this.A06);
        AbN.A0s(parcel, this.A0Q);
        1Du A0b = 1BL.A0b(parcel, this.A0H);
        while (A0b.hasNext()) {
            ((InspirationContextualFeatureInfo) A0b.next()).writeToParcel(parcel, i);
        }
        CreativeEditingData creativeEditingData = this.A0E;
        if (creativeEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            creativeEditingData.writeToParcel(parcel, i);
        }
        CreativeFactoryEditingData creativeFactoryEditingData = this.A05;
        if (creativeFactoryEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            creativeFactoryEditingData.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0U);
        1Du A0g = DKH.A0g(parcel, this.A0O);
        while (A0g.hasNext()) {
            AbL.A0n(parcel, A0g);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A0I);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        ComposerFocusPoint composerFocusPoint = this.A02;
        if (composerFocusPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerFocusPoint.writeToParcel(parcel, i);
        }
        InspirationGenAIMediaUploadInfo inspirationGenAIMediaUploadInfo = this.A08;
        if (inspirationGenAIMediaUploadInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationGenAIMediaUploadInfo.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0V);
        parcel.writeInt(this.A00);
        InspirationEditingData inspirationEditingData = this.A0B;
        if (inspirationEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEditingData.writeToParcel(parcel, i);
        }
        InspirationLoggingInfo inspirationLoggingInfo = this.A01;
        if (inspirationLoggingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationLoggingInfo.writeToParcel(parcel, i);
        }
        InspirationMediaState inspirationMediaState = this.A0C;
        if (inspirationMediaState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationMediaState.writeToParcel(parcel, i);
        }
        InspirationMultiCaptureState inspirationMultiCaptureState = this.A09;
        if (inspirationMultiCaptureState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationMultiCaptureState.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        C3o5.A0d(parcel, this.A03, i);
        1BL.A13(parcel, this.A0W);
        MediaAccuracyMediaTranscodeParams mediaAccuracyMediaTranscodeParams = this.A07;
        if (mediaAccuracyMediaTranscodeParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaAccuracyMediaTranscodeParams.writeToParcel(parcel, i);
        }
        DKH.A10(parcel, this.A0D, i);
        1BL.A13(parcel, this.A0X);
        C3o5.A0d(parcel, this.A04, i);
        1BL.A13(parcel, this.A0Y);
        1Du A0b3 = 1BL.A0b(parcel, this.A0J);
        while (A0b3.hasNext()) {
            ((InspirationEditingData) A0b3.next()).writeToParcel(parcel, i);
        }
        DKH.A0y(parcel, this.A0F);
        1Du A0b4 = 1BL.A0b(parcel, this.A0K);
        while (A0b4.hasNext()) {
            ((ComposerTaggedUser) A0b4.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0Z);
        1Du A0b5 = 1BL.A0b(parcel, this.A0L);
        while (A0b5.hasNext()) {
            ((InspirationEditingData) A0b5.next()).writeToParcel(parcel, i);
        }
        1Du A0b6 = 1BL.A0b(parcel, this.A0M);
        while (A0b6.hasNext()) {
            C3o5.A0h(parcel, A0b6);
        }
        VideoCreativeEditingData videoCreativeEditingData = this.A0G;
        if (videoCreativeEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCreativeEditingData.writeToParcel(parcel, i);
        }
        1Du A0b7 = 1BL.A0b(parcel, this.A0N);
        while (A0b7.hasNext()) {
            C3o5.A0h(parcel, A0b7);
        }
        ComposerVideoPollData composerVideoPollData = this.A0A;
        if (composerVideoPollData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerVideoPollData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0a);
        Iterator A0S = C3o5.A0S(parcel, this.A0b);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
