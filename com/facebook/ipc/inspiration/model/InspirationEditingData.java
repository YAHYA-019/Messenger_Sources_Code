package com.facebook.ipc.inspiration.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbJ;
import X.AbL;
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
import X.CSR;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EKy;
import X.MRl;
import X.N2X;
import X.N3U;
import X.NAq;
import X.QoX;
import X.ReV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.genai.aienhance.model.InspirationAiEnhanceData;
import com.facebook.inspiration.magicmontage.model.InspirationMagicMontageData;
import com.facebook.inspiration.model.InspirationAIBackdropData;
import com.facebook.inspiration.model.InspirationAIExpanderData;
import com.facebook.inspiration.model.InspirationAiImagineData;
import com.facebook.inspiration.model.InspirationEffectWithSource;
import com.facebook.inspiration.model.InspirationMagicModState;
import com.facebook.inspiration.model.InspirationTTSParams;
import com.facebook.inspiration.model.InspirationVideoEditingData;
import com.facebook.inspiration.model.InspirationVideoSegment;
import com.facebook.inspiration.model.movableoverlay.InspirationDoodleParams;
import com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder;
import com.facebook.inspiration.model.movableoverlay.InspirationPollInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationTextState;
import com.facebook.inspiration.model.pagescta.InspirationPagesCtaParams;
import com.facebook.inspiration.smarteditor.api.model.SmartEditData;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
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

/* loaded from: InspirationEditingData.class */
public final class InspirationEditingData implements Parcelable, NAq {
    public static volatile QoX A0i;
    public static volatile InspirationEffectWithSource A0j;
    public static volatile InspirationDoodleParams A0k;
    public static volatile InspirationTextState A0l;
    public static volatile EKy A0m;
    public static volatile PersistableRect A0n;
    public static final Parcelable.Creator CREATOR = new CSR(40);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final InspirationAiEnhanceData A05;
    public final InspirationMagicMontageData A06;
    public final InspirationAIBackdropData A07;
    public final InspirationAIExpanderData A08;
    public final InspirationAiImagineData A09;
    public final QoX A0A;
    public final InspirationEffectWithSource A0B;
    public final InspirationEffectWithSource A0C;
    public final InspirationEffectWithSource A0D;
    public final InspirationMagicModState A0E;
    public final InspirationVideoEditingData A0F;
    public final InspirationDoodleParams A0G;
    public final InspirationPollInfo A0H;
    public final InspirationTextState A0I;
    public final InspirationPagesCtaParams A0J;
    public final SmartEditData A0K;
    public final InspirationBackupEditingData A0L;
    public final InspirationBackupEditingData A0M;
    public final InspirationBackupEditingData A0N;
    public final InspirationProcessedMediaData A0O;
    public final InspirationProcessedMediaData A0P;
    public final InspirationZoomCropParams A0Q;
    public final EKy A0R;
    public final MediaData A0S;
    public final PersistableRect A0T;
    public final ImmutableList A0U;
    public final ImmutableList A0V;
    public final ImmutableList A0W;
    public final ImmutableList A0X;
    public final ImmutableMap A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final Set A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;

    /* loaded from: InspirationEditingData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            N3U n3u = new N3U();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1916156406:
                                if (A1C.equals("is_from_text_canvas")) {
                                    n3u.A0f = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1905946971:
                                if (A1C.equals("inspiration_pages_cta_params")) {
                                    n3u.A0J = (InspirationPagesCtaParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationPagesCtaParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1576916315:
                                if (A1C.equals("photo_uri_generated_from_text_canvas")) {
                                    n3u.A0c = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1544486294:
                                if (A1C.equals("post_capture_snapshot_height")) {
                                    n3u.A02 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1517559379:
                                if (A1C.equals("inspiration_magic_mod_state")) {
                                    n3u.A0E = (InspirationMagicModState) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationMagicModState.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1507283358:
                                if (A1C.equals("is_preset_stickers_added")) {
                                    n3u.A0h = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1308366631:
                                if (A1C.equals("inspiration_a_i_expander_data")) {
                                    n3u.A08 = (InspirationAIExpanderData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationAIExpanderData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1273278130:
                                if (A1C.equals("backup_editing_data")) {
                                    n3u.A0L = (InspirationBackupEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationBackupEditingData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1123190129:
                                if (A1C.equals("expected_height_for_media_generated_from_photo")) {
                                    n3u.A00 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1123147783:
                                if (A1C.equals("applied_postcapture_inspiration_model")) {
                                    n3u.A0B = (InspirationEffectWithSource) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationEffectWithSource.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1122219305:
                                if (A1C.equals("inspiration_doodle_params")) {
                                    n3u.A01((InspirationDoodleParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationDoodleParams.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -1023412186:
                                if (A1C.equals("is_overlay_adjusted_relative_to_media")) {
                                    n3u.A0g = abstractC01033pi.A1l();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -979579367:
                                if (A1C.equals("inspiration_poll_info")) {
                                    n3u.A0H = (InspirationPollInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationPollInfo.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -930302381:
                                if (A1C.equals("original_media_data")) {
                                    n3u.A0S = (MediaData) AbstractC11224vw.A02(abstractC01033pi, c27t, MediaData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -764561750:
                                if (A1C.equals("inspiration_video_editing_data")) {
                                    n3u.A0F = (InspirationVideoEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationVideoEditingData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -759957634:
                                if (A1C.equals("expected_width_for_media_generated_from_photo")) {
                                    n3u.A01 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -727314150:
                                if (A1C.equals("selected_effect_copy_for_undo")) {
                                    InspirationEffectWithSource inspirationEffectWithSource = (InspirationEffectWithSource) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationEffectWithSource.class);
                                    n3u.A0D = inspirationEffectWithSource;
                                    str = "selectedEffectCopyForUndo";
                                    C1pq.A08(str, inspirationEffectWithSource);
                                    N3U.A00(n3u, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -661613907:
                                if (A1C.equals("rotation_degree")) {
                                    n3u.A04 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -373816423:
                                if (A1C.equals("applied_precapture_inspiration_models")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationEffectWithSource.class);
                                    n3u.A0U = A00;
                                    C1pq.A08("appliedPrecaptureInspirationModels", A00);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -194715590:
                                if (A1C.equals("inspiration_t_t_s_params_map")) {
                                    n3u.A0Y = MRl.A0H(abstractC01033pi, c27t, C24b.A01(String.class), InspirationTTSParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -187466155:
                                if (A1C.equals("inspiration_ai_imagine_data")) {
                                    n3u.A09 = (InspirationAiImagineData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationAiImagineData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case -12058598:
                                if (A1C.equals("applied_precapture_inspiration_model")) {
                                    n3u.A0C = (InspirationEffectWithSource) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationEffectWithSource.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 90315209:
                                if (A1C.equals("smart_edit_data")) {
                                    n3u.A0K = (SmartEditData) AbstractC11224vw.A02(abstractC01033pi, c27t, SmartEditData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 100237406:
                                if (A1C.equals("inspiration_zoom_crop_params")) {
                                    n3u.A0Q = (InspirationZoomCropParams) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationZoomCropParams.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 188938100:
                                if (A1C.equals("last_inspiration_processed_media_data")) {
                                    n3u.A0P = (InspirationProcessedMediaData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationProcessedMediaData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 228748068:
                                if (A1C.equals("magic_montage_data")) {
                                    n3u.A06 = (InspirationMagicMontageData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationMagicMontageData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 241240099:
                                if (A1C.equals("post_capture_snapshot_width")) {
                                    n3u.A03 = abstractC01033pi.A1y();
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 241285889:
                                if (A1C.equals("backup_video_segments")) {
                                    n3u.A0V = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationVideoSegment.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 464493291:
                                if (A1C.equals("inspiration_processed_media_data")) {
                                    n3u.A0O = (InspirationProcessedMediaData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationProcessedMediaData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 467072343:
                                if (A1C.equals("media_type_generated_from_photo")) {
                                    EKy eKy = (EKy) AbstractC11224vw.A02(abstractC01033pi, c27t, EKy.class);
                                    n3u.A0R = eKy;
                                    str = "mediaTypeGeneratedFromPhoto";
                                    C1pq.A08(str, eKy);
                                    N3U.A00(n3u, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 488328237:
                                if (A1C.equals("current_tool_backup_editing_data")) {
                                    n3u.A0M = (InspirationBackupEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationBackupEditingData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 494707432:
                                if (A1C.equals("inspiration_add_yours_template_overlay_params")) {
                                    ImmutableList A002 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationOverlayParamsHolder.class);
                                    n3u.A0W = A002;
                                    C1pq.A08("inspirationAddYoursTemplateOverlayParams", A002);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 543453426:
                                if (A1C.equals("applied_swipeable_effect_model_id")) {
                                    n3u.A0Z = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 570363562:
                                if (A1C.equals("inspiration_a_i_backdrop_data")) {
                                    n3u.A07 = (InspirationAIBackdropData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationAIBackdropData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1100085051:
                                if (A1C.equals("inspiration_movable_overlay_params")) {
                                    n3u.A04(AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationOverlayParamsHolder.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1293767154:
                                if (A1C.equals("crop_mode")) {
                                    QoX qoX = (QoX) AbstractC11224vw.A02(abstractC01033pi, c27t, QoX.class);
                                    n3u.A0A = qoX;
                                    str = "cropMode";
                                    C1pq.A08(str, qoX);
                                    N3U.A00(n3u, str);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1497604875:
                                if (A1C.equals("last_processed_editing_data")) {
                                    n3u.A0N = (InspirationBackupEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationBackupEditingData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1678936827:
                                if (A1C.equals("media_uri_generated_from_photo")) {
                                    n3u.A0b = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1801896274:
                                if (A1C.equals("ai_enhance_data")) {
                                    n3u.A05 = (InspirationAiEnhanceData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationAiEnhanceData.class);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1810301335:
                                if (A1C.equals("media_crop_box")) {
                                    n3u.A03((PersistableRect) AbstractC11224vw.A02(abstractC01033pi, c27t, PersistableRect.class));
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 1962095602:
                                if (A1C.equals("edited_image_uri")) {
                                    n3u.A0a = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2025983924:
                                if (A1C.equals("processed_media_type_id")) {
                                    n3u.A0d = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                abstractC01033pi.A20();
                                break;
                            case 2059791220:
                                if (A1C.equals("inspiration_text_state")) {
                                    n3u.A02((InspirationTextState) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationTextState.class));
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
                    C4V6.A01(abstractC01033pi, InspirationEditingData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationEditingData(n3u);
        }
    }

    /* loaded from: InspirationEditingData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationEditingData inspirationEditingData = (InspirationEditingData) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A05, "ai_enhance_data");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0B, "applied_postcapture_inspiration_model");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0C, "applied_precapture_inspiration_model");
            AbstractC11224vw.A06(r302, c26c, "applied_precapture_inspiration_models", inspirationEditingData.A0U);
            AbstractC11224vw.A0D(r302, "applied_swipeable_effect_model_id", inspirationEditingData.A0Z);
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0L, "backup_editing_data");
            AbstractC11224vw.A06(r302, c26c, "backup_video_segments", inspirationEditingData.A0V);
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.Af4(), "crop_mode");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0M, "current_tool_backup_editing_data");
            AbstractC11224vw.A0D(r302, "edited_image_uri", inspirationEditingData.A0a);
            int i = inspirationEditingData.A00;
            r302.A0o("expected_height_for_media_generated_from_photo");
            r302.A0f(i);
            int i2 = inspirationEditingData.A01;
            r302.A0o("expected_width_for_media_generated_from_photo");
            r302.A0f(i2);
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A07, "inspiration_a_i_backdrop_data");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A08, "inspiration_a_i_expander_data");
            AbstractC11224vw.A06(r302, c26c, "inspiration_add_yours_template_overlay_params", inspirationEditingData.A0W);
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A09, "inspiration_ai_imagine_data");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.Ar6(), "inspiration_doodle_params");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0E, "inspiration_magic_mod_state");
            AbstractC11224vw.A06(r302, c26c, "inspiration_movable_overlay_params", inspirationEditingData.A0X);
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0J, "inspiration_pages_cta_params");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0H, "inspiration_poll_info");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0O, "inspiration_processed_media_data");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0Y, "inspiration_t_t_s_params_map");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.ArM(), "inspiration_text_state");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0F, "inspiration_video_editing_data");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0Q, "inspiration_zoom_crop_params");
            boolean z = inspirationEditingData.A0f;
            r302.A0o("is_from_text_canvas");
            r302.A0v(z);
            boolean z2 = inspirationEditingData.A0g;
            r302.A0o("is_overlay_adjusted_relative_to_media");
            r302.A0v(z2);
            boolean z3 = inspirationEditingData.A0h;
            r302.A0o("is_preset_stickers_added");
            r302.A0v(z3);
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0P, "last_inspiration_processed_media_data");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0N, "last_processed_editing_data");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A06, "magic_montage_data");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.Aw4(), "media_crop_box");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.AwR(), "media_type_generated_from_photo");
            AbstractC11224vw.A0D(r302, "media_uri_generated_from_photo", inspirationEditingData.A0b);
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0S, "original_media_data");
            AbstractC11224vw.A0D(r302, "photo_uri_generated_from_text_canvas", inspirationEditingData.A0c);
            int i3 = inspirationEditingData.A02;
            r302.A0o("post_capture_snapshot_height");
            r302.A0f(i3);
            int i4 = inspirationEditingData.A03;
            r302.A0o("post_capture_snapshot_width");
            r302.A0f(i4);
            AbstractC11224vw.A0D(r302, "processed_media_type_id", inspirationEditingData.A0d);
            int i5 = inspirationEditingData.A04;
            r302.A0o("rotation_degree");
            r302.A0f(i5);
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.B9g(), "selected_effect_copy_for_undo");
            AbstractC11224vw.A05(r302, c26c, inspirationEditingData.A0K, "smart_edit_data");
            r302.A0Y();
        }
    }

    public InspirationEditingData(N3U n3u) {
        this.A05 = n3u.A05;
        this.A0B = n3u.A0B;
        this.A0C = n3u.A0C;
        ImmutableList immutableList = n3u.A0U;
        C1pq.A08("appliedPrecaptureInspirationModels", immutableList);
        this.A0U = immutableList;
        this.A0Z = n3u.A0Z;
        this.A0L = n3u.A0L;
        this.A0V = n3u.A0V;
        this.A0A = n3u.A0A;
        this.A0M = n3u.A0M;
        this.A0a = n3u.A0a;
        this.A00 = n3u.A00;
        this.A01 = n3u.A01;
        this.A07 = n3u.A07;
        this.A08 = n3u.A08;
        ImmutableList immutableList2 = n3u.A0W;
        C1pq.A08("inspirationAddYoursTemplateOverlayParams", immutableList2);
        this.A0W = immutableList2;
        this.A09 = n3u.A09;
        this.A0G = n3u.A0G;
        this.A0E = n3u.A0E;
        ImmutableList immutableList3 = n3u.A0X;
        C1pq.A08("inspirationMovableOverlayParams", immutableList3);
        this.A0X = immutableList3;
        this.A0J = n3u.A0J;
        this.A0H = n3u.A0H;
        this.A0O = n3u.A0O;
        this.A0Y = n3u.A0Y;
        this.A0I = n3u.A0I;
        this.A0F = n3u.A0F;
        this.A0Q = n3u.A0Q;
        this.A0f = n3u.A0f;
        this.A0g = n3u.A0g;
        this.A0h = n3u.A0h;
        this.A0P = n3u.A0P;
        this.A0N = n3u.A0N;
        this.A06 = n3u.A06;
        this.A0T = n3u.A0T;
        this.A0R = n3u.A0R;
        this.A0b = n3u.A0b;
        this.A0S = n3u.A0S;
        this.A0c = n3u.A0c;
        this.A02 = n3u.A02;
        this.A03 = n3u.A03;
        this.A0d = n3u.A0d;
        this.A04 = n3u.A04;
        this.A0D = n3u.A0D;
        this.A0K = n3u.A0K;
        this.A0e = Collections.unmodifiableSet(n3u.A0e);
    }

    public InspirationEditingData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        SmartEditData smartEditData = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (InspirationAiEnhanceData) InspirationAiEnhanceData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (InspirationEffectWithSource) InspirationEffectWithSource.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (InspirationEffectWithSource) InspirationEffectWithSource.CREATOR.createFromParcel(parcel);
        }
        int readInt = parcel.readInt();
        InspirationEffectWithSource[] inspirationEffectWithSourceArr = new InspirationEffectWithSource[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = DKG.A02(parcel, InspirationEffectWithSource.CREATOR, inspirationEffectWithSourceArr, i2);
        }
        this.A0U = ImmutableList.copyOf(inspirationEffectWithSourceArr);
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (InspirationBackupEditingData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            int readInt2 = parcel.readInt();
            InspirationVideoSegment[] inspirationVideoSegmentArr = new InspirationVideoSegment[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = DKG.A02(parcel, InspirationVideoSegment.CREATOR, inspirationVideoSegmentArr, i3);
            }
            this.A0V = ImmutableList.copyOf(inspirationVideoSegmentArr);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = QoX.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = (InspirationBackupEditingData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = parcel.readString();
        }
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (InspirationAIBackdropData) InspirationAIBackdropData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (InspirationAIExpanderData) InspirationAIExpanderData.CREATOR.createFromParcel(parcel);
        }
        int readInt3 = parcel.readInt();
        InspirationOverlayParamsHolder[] inspirationOverlayParamsHolderArr = new InspirationOverlayParamsHolder[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = DKG.A02(parcel, InspirationOverlayParamsHolder.CREATOR, inspirationOverlayParamsHolderArr, i4);
        }
        this.A0W = ImmutableList.copyOf(inspirationOverlayParamsHolderArr);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (InspirationAiImagineData) InspirationAiImagineData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (InspirationDoodleParams) InspirationDoodleParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (InspirationMagicModState) InspirationMagicModState.CREATOR.createFromParcel(parcel);
        }
        int readInt4 = parcel.readInt();
        InspirationOverlayParamsHolder[] inspirationOverlayParamsHolderArr2 = new InspirationOverlayParamsHolder[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = DKG.A02(parcel, InspirationOverlayParamsHolder.CREATOR, inspirationOverlayParamsHolderArr2, i5);
        }
        this.A0X = ImmutableList.copyOf(inspirationOverlayParamsHolderArr2);
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = (InspirationPagesCtaParams) InspirationPagesCtaParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = (InspirationPollInfo) InspirationPollInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = (InspirationProcessedMediaData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt5 = parcel.readInt();
            for (int i6 = 0; i6 < readInt5; i6++) {
                A0u.put(parcel.readString(), InspirationTTSParams.CREATOR.createFromParcel(parcel));
            }
            this.A0Y = ImmutableMap.copyOf((Map) A0u);
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = (InspirationTextState) InspirationTextState.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (InspirationVideoEditingData) InspirationVideoEditingData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel);
        }
        this.A0f = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0g = 1BM.A07(parcel);
        this.A0h = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = (InspirationProcessedMediaData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (InspirationBackupEditingData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (InspirationMagicMontageData) InspirationMagicMontageData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = EKy.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0b = null;
        } else {
            this.A0b = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0c = null;
        } else {
            this.A0c = parcel.readString();
        }
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0d = null;
        } else {
            this.A0d = parcel.readString();
        }
        this.A04 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (InspirationEffectWithSource) InspirationEffectWithSource.CREATOR.createFromParcel(parcel);
        }
        this.A0K = parcel.readInt() != 0 ? (SmartEditData) SmartEditData.CREATOR.createFromParcel(parcel) : smartEditData;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt6 = parcel.readInt();
        while (i < readInt6) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0e = Collections.unmodifiableSet(A0v);
    }

    public static N3U A00(NAq nAq) {
        return nAq != null ? new N3U(nAq) : new N3U();
    }

    @Override // X.NAq
    public QoX Af4() {
        if (this.A0e.contains("cropMode")) {
            return this.A0A;
        }
        if (A0i == null) {
            synchronized (this) {
                if (A0i == null) {
                    A0i = QoX.A04;
                }
            }
        }
        return A0i;
    }

    @Override // X.NAq
    public InspirationDoodleParams Ar6() {
        if (this.A0e.contains("inspirationDoodleParams")) {
            return this.A0G;
        }
        if (A0k == null) {
            synchronized (this) {
                if (A0k == null) {
                    A0k = new InspirationDoodleParams(null, null, null, "", AnonymousClass001.A0v());
                }
            }
        }
        return A0k;
    }

    @Override // X.NAq
    public InspirationTextState ArM() {
        if (this.A0e.contains("inspirationTextState")) {
            return this.A0I;
        }
        if (A0l == null) {
            synchronized (this) {
                if (A0l == null) {
                    A0l = new InspirationTextState(new N2X());
                }
            }
        }
        return A0l;
    }

    @Override // X.NAq
    public PersistableRect Aw4() {
        if (this.A0e.contains("mediaCropBox")) {
            return this.A0T;
        }
        if (A0n == null) {
            synchronized (this) {
                if (A0n == null) {
                    A0n = new PersistableRect(1.0f, 0.0f, 1.0f, 0.0f);
                }
            }
        }
        return A0n;
    }

    @Override // X.NAq
    public EKy AwR() {
        if (this.A0e.contains("mediaTypeGeneratedFromPhoto")) {
            return this.A0R;
        }
        if (A0m == null) {
            synchronized (this) {
                if (A0m == null) {
                    A0m = EKy.A03;
                }
            }
        }
        return A0m;
    }

    @Override // X.NAq
    public InspirationEffectWithSource B9g() {
        if (this.A0e.contains("selectedEffectCopyForUndo")) {
            return this.A0D;
        }
        if (A0j == null) {
            synchronized (this) {
                if (A0j == null) {
                    A0j = ReV.A00;
                }
            }
        }
        return A0j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationEditingData)) {
                return false;
            }
            InspirationEditingData inspirationEditingData = (InspirationEditingData) obj;
            if (!11T.A0O(this.A05, inspirationEditingData.A05) || !11T.A0O(this.A0B, inspirationEditingData.A0B) || !11T.A0O(this.A0C, inspirationEditingData.A0C) || !11T.A0O(this.A0U, inspirationEditingData.A0U) || !11T.A0O(this.A0Z, inspirationEditingData.A0Z) || !11T.A0O(this.A0L, inspirationEditingData.A0L) || !11T.A0O(this.A0V, inspirationEditingData.A0V) || Af4() != inspirationEditingData.Af4() || !11T.A0O(this.A0M, inspirationEditingData.A0M) || !11T.A0O(this.A0a, inspirationEditingData.A0a) || this.A00 != inspirationEditingData.A00 || this.A01 != inspirationEditingData.A01 || !11T.A0O(this.A07, inspirationEditingData.A07) || !11T.A0O(this.A08, inspirationEditingData.A08) || !11T.A0O(this.A0W, inspirationEditingData.A0W) || !11T.A0O(this.A09, inspirationEditingData.A09) || !11T.A0O(Ar6(), inspirationEditingData.Ar6()) || !11T.A0O(this.A0E, inspirationEditingData.A0E) || !11T.A0O(this.A0X, inspirationEditingData.A0X) || !11T.A0O(this.A0J, inspirationEditingData.A0J) || !11T.A0O(this.A0H, inspirationEditingData.A0H) || !11T.A0O(this.A0O, inspirationEditingData.A0O) || !11T.A0O(this.A0Y, inspirationEditingData.A0Y) || !11T.A0O(ArM(), inspirationEditingData.ArM()) || !11T.A0O(this.A0F, inspirationEditingData.A0F) || !11T.A0O(this.A0Q, inspirationEditingData.A0Q) || this.A0f != inspirationEditingData.A0f || this.A0g != inspirationEditingData.A0g || this.A0h != inspirationEditingData.A0h || !11T.A0O(this.A0P, inspirationEditingData.A0P) || !11T.A0O(this.A0N, inspirationEditingData.A0N) || !11T.A0O(this.A06, inspirationEditingData.A06) || !11T.A0O(Aw4(), inspirationEditingData.Aw4()) || AwR() != inspirationEditingData.AwR() || !11T.A0O(this.A0b, inspirationEditingData.A0b) || !11T.A0O(this.A0S, inspirationEditingData.A0S) || !11T.A0O(this.A0c, inspirationEditingData.A0c) || this.A02 != inspirationEditingData.A02 || this.A03 != inspirationEditingData.A03 || !11T.A0O(this.A0d, inspirationEditingData.A0d) || this.A04 != inspirationEditingData.A04 || !11T.A0O(B9g(), inspirationEditingData.B9g()) || !11T.A0O(this.A0K, inspirationEditingData.A0K)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0V, C1pq.A04(this.A0L, C1pq.A04(this.A0Z, C1pq.A04(this.A0U, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A03(this.A05)))))));
        int A042 = C1pq.A04(Aw4(), C1pq.A04(this.A06, C1pq.A04(this.A0N, C1pq.A04(this.A0P, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0Q, C1pq.A04(this.A0F, C1pq.A04(ArM(), C1pq.A04(this.A0Y, C1pq.A04(this.A0O, C1pq.A04(this.A0H, C1pq.A04(this.A0J, C1pq.A04(this.A0X, C1pq.A04(this.A0E, C1pq.A04(Ar6(), C1pq.A04(this.A09, C1pq.A04(this.A0W, C1pq.A04(this.A08, C1pq.A04(this.A07, (((C1pq.A04(this.A0a, C1pq.A04(this.A0M, (A04 * 31) + C3o5.A03(Af4()))) * 31) + this.A00) * 31) + this.A01)))))))))))))), this.A0f), this.A0g), this.A0h)))));
        return C1pq.A04(this.A0K, C1pq.A04(B9g(), (C1pq.A04(this.A0d, (((C1pq.A04(this.A0c, C1pq.A04(this.A0S, C1pq.A04(this.A0b, (A042 * 31) + DKF.A04(AwR())))) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        InspirationAiEnhanceData inspirationAiEnhanceData = this.A05;
        if (inspirationAiEnhanceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationAiEnhanceData.writeToParcel(parcel, i);
        }
        InspirationEffectWithSource inspirationEffectWithSource = this.A0B;
        if (inspirationEffectWithSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEffectWithSource.writeToParcel(parcel, i);
        }
        InspirationEffectWithSource inspirationEffectWithSource2 = this.A0C;
        if (inspirationEffectWithSource2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEffectWithSource2.writeToParcel(parcel, i);
        }
        1Du A0b = 1BL.A0b(parcel, this.A0U);
        while (A0b.hasNext()) {
            ((InspirationEffectWithSource) A0b.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0Z);
        C3o5.A0d(parcel, this.A0L, i);
        ImmutableList immutableList = this.A0V;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((InspirationVideoSegment) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        C3o5.A0e(parcel, this.A0A);
        C3o5.A0d(parcel, this.A0M, i);
        1BL.A13(parcel, this.A0a);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        InspirationAIBackdropData inspirationAIBackdropData = this.A07;
        if (inspirationAIBackdropData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationAIBackdropData.writeToParcel(parcel, i);
        }
        InspirationAIExpanderData inspirationAIExpanderData = this.A08;
        if (inspirationAIExpanderData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationAIExpanderData.writeToParcel(parcel, i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A0W);
        while (A0b2.hasNext()) {
            MRl.A0Q(parcel, A0b2, i);
        }
        InspirationAiImagineData inspirationAiImagineData = this.A09;
        if (inspirationAiImagineData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationAiImagineData.writeToParcel(parcel, i);
        }
        InspirationDoodleParams inspirationDoodleParams = this.A0G;
        if (inspirationDoodleParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationDoodleParams.writeToParcel(parcel, i);
        }
        InspirationMagicModState inspirationMagicModState = this.A0E;
        if (inspirationMagicModState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationMagicModState.writeToParcel(parcel, i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A0X);
        while (A0b3.hasNext()) {
            MRl.A0Q(parcel, A0b3, i);
        }
        InspirationPagesCtaParams inspirationPagesCtaParams = this.A0J;
        if (inspirationPagesCtaParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationPagesCtaParams.writeToParcel(parcel, i);
        }
        InspirationPollInfo inspirationPollInfo = this.A0H;
        if (inspirationPollInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationPollInfo.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A0O, i);
        ImmutableMap immutableMap = this.A0Y;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                ((InspirationTTSParams) MRl.A0K(parcel, A0g)).writeToParcel(parcel, i);
            }
        }
        InspirationTextState inspirationTextState = this.A0I;
        if (inspirationTextState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationTextState.writeToParcel(parcel, i);
        }
        InspirationVideoEditingData inspirationVideoEditingData = this.A0F;
        if (inspirationVideoEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationVideoEditingData.writeToParcel(parcel, i);
        }
        MRl.A0O(parcel, this.A0Q, i);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        C3o5.A0d(parcel, this.A0P, i);
        C3o5.A0d(parcel, this.A0N, i);
        InspirationMagicMontageData inspirationMagicMontageData = this.A06;
        if (inspirationMagicMontageData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationMagicMontageData.writeToParcel(parcel, i);
        }
        DKH.A11(parcel, this.A0T, i);
        C3o5.A0e(parcel, this.A0R);
        1BL.A13(parcel, this.A0b);
        DKH.A10(parcel, this.A0S, i);
        1BL.A13(parcel, this.A0c);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        1BL.A13(parcel, this.A0d);
        parcel.writeInt(this.A04);
        InspirationEffectWithSource inspirationEffectWithSource3 = this.A0D;
        if (inspirationEffectWithSource3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEffectWithSource3.writeToParcel(parcel, i);
        }
        SmartEditData smartEditData = this.A0K;
        if (smartEditData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartEditData.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0e);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
