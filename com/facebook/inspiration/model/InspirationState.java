package com.facebook.inspiration.model;

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
import X.AbM;
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
import X.DKF;
import X.DKG;
import X.DKH;
import X.EnumC3473Mer;
import X.EnumC3474Mes;
import X.EnumC3485Mf3;
import X.EnumC3486Mf5;
import X.FKf;
import X.MRl;
import X.MfV;
import X.N4G;
import X.NAo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.crossposting.contentcompatibility.model.CrossPostingMetadata;
import com.facebook.inspiration.composer.smartgallery.model.SingleStackingMediaStatusInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder;
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;
import com.facebook.ipc.composer.model.ComposerLocation;
import com.facebook.ipc.composer.model.ComposerTaggedUser;
import com.facebook.ipc.locationcomponents.locationpicker.model.LocationPickerResultLocation;
import com.facebook.photos.creativeediting.model.VideoTrimParams;
import com.facebook.photos.creativeediting.model.audio.AudioTrackParams;
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

/* loaded from: InspirationState.class */
public final class InspirationState implements Parcelable, NAo {
    public static volatile MfV A1D;
    public static volatile EnumC3485Mf3 A1E;
    public static volatile EnumC3486Mf5 A1F;
    public static volatile InspirationTTSVoiceType A1G;
    public static final Parcelable.Creator CREATOR = new FKf(63);
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final CrossPostingMetadata A08;
    public final SingleStackingMediaStatusInfo A09;
    public final MfV A0A;
    public final EnumC3473Mer A0B;
    public final EnumC3474Mes A0C;
    public final EnumC3485Mf3 A0D;
    public final EnumC3486Mf5 A0E;
    public final InspirationTTSVoiceType A0F;
    public final InspirationTimelineEditorBackupData A0G;
    public final InspirationVideoEditingData A0H;
    public final ComposerLocation A0I;
    public final LocationPickerResultLocation A0J;
    public final VideoTrimParams A0K;
    public final AudioTrackParams A0L;
    public final ImmutableList A0M;
    public final ImmutableList A0N;
    public final ImmutableList A0O;
    public final ImmutableMap A0P;
    public final ImmutableMap A0Q;
    public final ImmutableMap A0R;
    public final Boolean A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final Set A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;

    /* loaded from: InspirationState$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N4G n4g = new N4G();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2123270763:
                                if (A1C.equals("text_for_t_t_s")) {
                                    n4g.A0X = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -2104371604:
                                if (A1C.equals("is_in_post_capture")) {
                                    n4g.A0o = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -2087013377:
                                if (A1C.equals("media_enhance_slider_value")) {
                                    n4g.A01 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -2017799364:
                                if (A1C.equals("video_length_state")) {
                                    n4g.A06((EnumC3486Mf5) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3486Mf5.class));
                                    break;
                                }
                                break;
                            case -1994212030:
                                if (A1C.equals("backup_video_trim_params")) {
                                    n4g.A0K = (VideoTrimParams) AbstractC11224vw.A02(abstractC01033pi, c27t, VideoTrimParams.class);
                                    break;
                                }
                                break;
                            case -1929607242:
                                if (A1C.equals("camera_orientation")) {
                                    n4g.A03 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1924879907:
                                if (A1C.equals("is_accessibility_focus_set_on_dismiss_button")) {
                                    n4g.A0d = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1912041450:
                                if (A1C.equals("animation_state")) {
                                    n4g.A0B = (EnumC3473Mer) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3473Mer.class);
                                    break;
                                }
                                break;
                            case -1865807845:
                                if (A1C.equals("is_smart_crop_eligible")) {
                                    n4g.A10 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1820106403:
                                if (A1C.equals("is_in_text_canvas_mode")) {
                                    n4g.A0p = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1745903373:
                                if (A1C.equals("timeline_editor_backup_data")) {
                                    n4g.A0G = (InspirationTimelineEditorBackupData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationTimelineEditorBackupData.class);
                                    break;
                                }
                                break;
                            case -1700173909:
                                if (A1C.equals("is_close_friends_story_selected")) {
                                    n4g.A0i = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1489674585:
                                if (A1C.equals("has_initial_inspirations_applied")) {
                                    n4g.A0b = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1421417376:
                                if (A1C.equals("is_green_screen_effect_store_update_toggle")) {
                                    n4g.A0m = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1390516411:
                                if (A1C.equals("tts_state")) {
                                    n4g.A07 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1351819292:
                                if (A1C.equals("animating_entity")) {
                                    n4g.A0T = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1312640257:
                                if (A1C.equals("xposting_data")) {
                                    n4g.A08 = (CrossPostingMetadata) AbstractC11224vw.A02(abstractC01033pi, c27t, CrossPostingMetadata.class);
                                    break;
                                }
                                break;
                            case -1305952336:
                                if (A1C.equals("location_picker_result_location")) {
                                    n4g.A0J = (LocationPickerResultLocation) AbstractC11224vw.A02(abstractC01033pi, c27t, LocationPickerResultLocation.class);
                                    break;
                                }
                                break;
                            case -1250718077:
                                if (A1C.equals("location_permission_result")) {
                                    n4g.A0S = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                            case -1201192325:
                                if (A1C.equals("media_enhance_contextual_recommendation")) {
                                    n4g.A05 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1100485620:
                                if (A1C.equals("is_post_capture_view_ready")) {
                                    n4g.A0x = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1052397958:
                                if (A1C.equals("is_auto_trim_n_tooltip_dismissed")) {
                                    n4g.A0g = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1042765837:
                                if (A1C.equals("should_restore_ai_imagine_session")) {
                                    n4g.A1B = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -952734370:
                                if (A1C.equals("is_smart_crop_turned_on")) {
                                    n4g.A13 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -952155149:
                                if (A1C.equals("tts_voice_type")) {
                                    n4g.A07((InspirationTTSVoiceType) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationTTSVoiceType.class));
                                    break;
                                }
                                break;
                            case -927512845:
                                if (A1C.equals("is_location_permission_requested")) {
                                    n4g.A0r = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -916681951:
                                if (A1C.equals("is_media_enhance_turned_on")) {
                                    n4g.A0t = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -840013532:
                                if (A1C.equals("has_trashed_auto_add_music")) {
                                    n4g.A0c = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -684014354:
                                if (A1C.equals("is_smart_crop_pre_processed")) {
                                    n4g.A11 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -564444760:
                                if (A1C.equals("edited_timed_element_unique_id")) {
                                    n4g.A0U = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -477934096:
                                if (A1C.equals("unique_id_of_text_element_before_timed_elements_editor")) {
                                    n4g.A0Y = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -459344456:
                                if (A1C.equals("is_trim_editing_in_progress")) {
                                    n4g.A17 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -238626046:
                                if (A1C.equals("backup_t_t_s_audio_track_params")) {
                                    n4g.A0L = (AudioTrackParams) AbstractC11224vw.A02(abstractC01033pi, c27t, AudioTrackParams.class);
                                    break;
                                }
                                break;
                            case -194715590:
                                if (A1C.equals("inspiration_t_t_s_params_map")) {
                                    n4g.A0Q = MRl.A0H(abstractC01033pi, c27t, C24b.A01(String.class), InspirationTTSParams.class);
                                    break;
                                }
                                break;
                            case -136804592:
                                if (A1C.equals("selected_inspiration_media_state_index")) {
                                    n4g.A06 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -100023780:
                                if (A1C.equals("video_editing_backup_data")) {
                                    n4g.A0H = (InspirationVideoEditingData) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationVideoEditingData.class);
                                    break;
                                }
                                break;
                            case -90930510:
                                if (A1C.equals("single_stacking_media_status_info")) {
                                    n4g.A09 = (SingleStackingMediaStatusInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, SingleStackingMediaStatusInfo.class);
                                    break;
                                }
                                break;
                            case -67016079:
                                if (A1C.equals("music_editing_entry")) {
                                    n4g.A0B(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case -16138008:
                                if (A1C.equals("photo_preview_scale_factor")) {
                                    n4g.A02 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 1599455:
                                if (A1C.equals("tagged_people_backup")) {
                                    n4g.A09(AbstractC11224vw.A00(abstractC01033pi, c27t, ComposerTaggedUser.class));
                                    break;
                                }
                                break;
                            case 26765043:
                                if (A1C.equals("is_form_swiping_enabled")) {
                                    n4g.A0l = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 234727376:
                                if (A1C.equals("is_motion_effect_selector_open")) {
                                    n4g.A0v = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 299081475:
                                if (A1C.equals("is_post_capture_media_render_requested")) {
                                    n4g.A0w = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 351829079:
                                if (A1C.equals("is_smart_crop_processing")) {
                                    n4g.A12 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 386550869:
                                if (A1C.equals("is_product_tagging_suggestion_enabled")) {
                                    n4g.A0y = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 443882800:
                                if (A1C.equals("is_suggestions_tray_closed")) {
                                    n4g.A15 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 447949923:
                                if (A1C.equals("camera_add_yours_template_overlay_params")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationOverlayParamsHolder.class);
                                    n4g.A0M = A00;
                                    C1pq.A08("cameraAddYoursTemplateOverlayParams", A00);
                                    break;
                                }
                                break;
                            case 470669243:
                                if (A1C.equals("inspiration_timed_element_params_backup")) {
                                    n4g.A0R = MRl.A0H(abstractC01033pi, c27t, C24b.A01(String.class), InspirationTimedElementParams.class);
                                    break;
                                }
                                break;
                            case 471183091:
                                if (A1C.equals("is_video_length_tool_tapped")) {
                                    n4g.A18 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 576508331:
                                if (A1C.equals("is_tall_screen_enabled")) {
                                    n4g.A16 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 638752578:
                                if (A1C.equals("is_magic_montage_light_weight_processing")) {
                                    n4g.A0s = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 658999893:
                                if (A1C.equals("is_media_enhance_voltron_loaded")) {
                                    n4g.A0u = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 701178935:
                                if (A1C.equals("is_crop_box_modified")) {
                                    n4g.A0j = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 858740418:
                                if (A1C.equals("is_current_effect_supporting_landscape")) {
                                    n4g.A0k = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1033445490:
                                if (A1C.equals("should_restore_ai_imagine_me_session")) {
                                    n4g.A1A = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1049001196:
                                if (A1C.equals("capture_in_progress_source")) {
                                    n4g.A0C = (EnumC3474Mes) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3474Mes.class);
                                    break;
                                }
                                break;
                            case 1051888800:
                                if (A1C.equals("camera_movable_overlay_params")) {
                                    n4g.A08(AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationOverlayParamsHolder.class));
                                    break;
                                }
                                break;
                            case 1100244375:
                                if (A1C.equals("backup_inspiration_t_t_s_params_map")) {
                                    n4g.A0P = MRl.A0H(abstractC01033pi, c27t, C24b.A01(String.class), InspirationTTSParams.class);
                                    break;
                                }
                                break;
                            case 1138506662:
                                if (A1C.equals("is_inline_effects_tray_enabled")) {
                                    n4g.A0q = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1420751830:
                                if (A1C.equals("is_in_nux_mode")) {
                                    n4g.A0n = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1464144486:
                                if (A1C.equals("media_enhance_slider_backup_value")) {
                                    n4g.A00 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 1566608644:
                                if (A1C.equals("unique_id_of_text_element_for_t_t_s")) {
                                    n4g.A0Z = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1668340800:
                                if (A1C.equals("should_disable_sticker_tray_animation")) {
                                    n4g.A19 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1732107419:
                                if (A1C.equals("camera_roll_entry_point")) {
                                    n4g.A04 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1767299140:
                                if (A1C.equals("should_update_backup_t_t_s_track_params_and_map")) {
                                    n4g.A1C = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1826454843:
                                if (A1C.equals("is_aspect_ratio_box_crop_active")) {
                                    n4g.A0f = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1840324660:
                                if (A1C.equals("is_caption_turned_on")) {
                                    n4g.A0h = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1901043637:
                                if (A1C.equals("location")) {
                                    n4g.A0I = (ComposerLocation) AbstractC11224vw.A02(abstractC01033pi, c27t, ComposerLocation.class);
                                    break;
                                }
                                break;
                            case 2018325365:
                                if (A1C.equals("music_source")) {
                                    n4g.A05((EnumC3485Mf3) AbstractC11224vw.A02(abstractC01033pi, c27t, EnumC3485Mf3.class));
                                    break;
                                }
                                break;
                            case 2121984633:
                                if (A1C.equals("is_appended_sticker_params")) {
                                    n4g.A0e = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationState.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationState(n4g);
        }
    }

    /* loaded from: InspirationState$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationState inspirationState = (InspirationState) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "animating_entity", inspirationState.A0T);
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0B, "animation_state");
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0P, "backup_inspiration_t_t_s_params_map");
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0L, "backup_t_t_s_audio_track_params");
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0K, "backup_video_trim_params");
            AbstractC11224vw.A06(r302, c26c, "camera_add_yours_template_overlay_params", inspirationState.A0M);
            AbstractC11224vw.A06(r302, c26c, "camera_movable_overlay_params", inspirationState.A0N);
            int i = inspirationState.A03;
            r302.A0o("camera_orientation");
            r302.A0f(i);
            int i2 = inspirationState.A04;
            r302.A0o("camera_roll_entry_point");
            r302.A0f(i2);
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0C, "capture_in_progress_source");
            AbstractC11224vw.A0D(r302, "edited_timed_element_unique_id", inspirationState.A0U);
            boolean z = inspirationState.A0b;
            r302.A0o("has_initial_inspirations_applied");
            r302.A0v(z);
            boolean z2 = inspirationState.A0c;
            r302.A0o("has_trashed_auto_add_music");
            r302.A0v(z2);
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0Q, "inspiration_t_t_s_params_map");
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0R, "inspiration_timed_element_params_backup");
            boolean z3 = inspirationState.A0d;
            r302.A0o("is_accessibility_focus_set_on_dismiss_button");
            r302.A0v(z3);
            boolean z4 = inspirationState.A0e;
            r302.A0o("is_appended_sticker_params");
            r302.A0v(z4);
            boolean z5 = inspirationState.A0f;
            r302.A0o("is_aspect_ratio_box_crop_active");
            r302.A0v(z5);
            boolean z6 = inspirationState.A0g;
            r302.A0o("is_auto_trim_n_tooltip_dismissed");
            r302.A0v(z6);
            boolean z7 = inspirationState.A0h;
            r302.A0o("is_caption_turned_on");
            r302.A0v(z7);
            boolean z8 = inspirationState.A0i;
            r302.A0o("is_close_friends_story_selected");
            r302.A0v(z8);
            boolean z9 = inspirationState.A0j;
            r302.A0o("is_crop_box_modified");
            r302.A0v(z9);
            boolean z10 = inspirationState.A0k;
            r302.A0o("is_current_effect_supporting_landscape");
            r302.A0v(z10);
            boolean z11 = inspirationState.A0l;
            r302.A0o("is_form_swiping_enabled");
            r302.A0v(z11);
            boolean z12 = inspirationState.A0m;
            r302.A0o("is_green_screen_effect_store_update_toggle");
            r302.A0v(z12);
            boolean z13 = inspirationState.A0n;
            r302.A0o("is_in_nux_mode");
            r302.A0v(z13);
            boolean z14 = inspirationState.A0o;
            r302.A0o("is_in_post_capture");
            r302.A0v(z14);
            boolean z15 = inspirationState.A0p;
            r302.A0o("is_in_text_canvas_mode");
            r302.A0v(z15);
            boolean z16 = inspirationState.A0q;
            r302.A0o("is_inline_effects_tray_enabled");
            r302.A0v(z16);
            boolean z17 = inspirationState.A0r;
            r302.A0o("is_location_permission_requested");
            r302.A0v(z17);
            boolean z18 = inspirationState.A0s;
            r302.A0o("is_magic_montage_light_weight_processing");
            r302.A0v(z18);
            boolean z19 = inspirationState.A0t;
            r302.A0o("is_media_enhance_turned_on");
            r302.A0v(z19);
            boolean z20 = inspirationState.A0u;
            r302.A0o("is_media_enhance_voltron_loaded");
            r302.A0v(z20);
            boolean z21 = inspirationState.A0v;
            r302.A0o("is_motion_effect_selector_open");
            r302.A0v(z21);
            boolean z22 = inspirationState.A0w;
            r302.A0o("is_post_capture_media_render_requested");
            r302.A0v(z22);
            boolean z23 = inspirationState.A0x;
            r302.A0o("is_post_capture_view_ready");
            r302.A0v(z23);
            boolean z24 = inspirationState.A0y;
            r302.A0o("is_product_tagging_suggestion_enabled");
            r302.A0v(z24);
            boolean z25 = inspirationState.A10;
            r302.A0o("is_smart_crop_eligible");
            r302.A0v(z25);
            boolean z26 = inspirationState.A11;
            r302.A0o("is_smart_crop_pre_processed");
            r302.A0v(z26);
            boolean z27 = inspirationState.A12;
            r302.A0o("is_smart_crop_processing");
            r302.A0v(z27);
            boolean z28 = inspirationState.A13;
            r302.A0o("is_smart_crop_turned_on");
            r302.A0v(z28);
            boolean z29 = inspirationState.A15;
            r302.A0o("is_suggestions_tray_closed");
            r302.A0v(z29);
            boolean z30 = inspirationState.A16;
            r302.A0o("is_tall_screen_enabled");
            r302.A0v(z30);
            boolean z31 = inspirationState.A17;
            r302.A0o("is_trim_editing_in_progress");
            r302.A0v(z31);
            boolean z32 = inspirationState.A18;
            r302.A0o("is_video_length_tool_tapped");
            r302.A0v(z32);
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0I, "location");
            AbstractC11224vw.A08(r302, inspirationState.A0S, "location_permission_result");
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0J, "location_picker_result_location");
            int i3 = inspirationState.A05;
            r302.A0o("media_enhance_contextual_recommendation");
            r302.A0f(i3);
            float f = inspirationState.A00;
            r302.A0o("media_enhance_slider_backup_value");
            r302.A0e(f);
            float f2 = inspirationState.A01;
            r302.A0o("media_enhance_slider_value");
            r302.A0e(f2);
            AbstractC11224vw.A0D(r302, "music_editing_entry", inspirationState.A0W);
            AbstractC11224vw.A05(r302, c26c, inspirationState.AyW(), "music_source");
            float f3 = inspirationState.A02;
            r302.A0o("photo_preview_scale_factor");
            r302.A0e(f3);
            int i4 = inspirationState.A06;
            r302.A0o("selected_inspiration_media_state_index");
            r302.A0f(i4);
            boolean z33 = inspirationState.A19;
            r302.A0o("should_disable_sticker_tray_animation");
            r302.A0v(z33);
            boolean z34 = inspirationState.A1A;
            r302.A0o("should_restore_ai_imagine_me_session");
            r302.A0v(z34);
            boolean z35 = inspirationState.A1B;
            r302.A0o("should_restore_ai_imagine_session");
            r302.A0v(z35);
            boolean z36 = inspirationState.A1C;
            r302.A0o("should_update_backup_t_t_s_track_params_and_map");
            r302.A0v(z36);
            AbstractC11224vw.A05(r302, c26c, inspirationState.A09, "single_stacking_media_status_info");
            AbstractC11224vw.A06(r302, c26c, "tagged_people_backup", inspirationState.A0O);
            AbstractC11224vw.A0D(r302, "text_for_t_t_s", inspirationState.A0X);
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0G, "timeline_editor_backup_data");
            int i5 = inspirationState.A07;
            r302.A0o("tts_state");
            r302.A0f(i5);
            AbstractC11224vw.A05(r302, c26c, inspirationState.BHK(), "tts_voice_type");
            AbstractC11224vw.A0D(r302, "unique_id_of_text_element_before_timed_elements_editor", inspirationState.A0Y);
            AbstractC11224vw.A0D(r302, "unique_id_of_text_element_for_t_t_s", inspirationState.A0Z);
            AbstractC11224vw.A05(r302, c26c, inspirationState.A0H, "video_editing_backup_data");
            AbstractC11224vw.A05(r302, c26c, inspirationState.BJS(), "video_length_state");
            AbstractC11224vw.A05(r302, c26c, inspirationState.A08, "xposting_data");
            r302.A0Y();
        }
    }

    public InspirationState(N4G n4g) {
        this.A0T = n4g.A0T;
        this.A0B = n4g.A0B;
        this.A0P = n4g.A0P;
        this.A0L = n4g.A0L;
        this.A0K = n4g.A0K;
        ImmutableList immutableList = n4g.A0M;
        C1pq.A08("cameraAddYoursTemplateOverlayParams", immutableList);
        this.A0M = immutableList;
        ImmutableList immutableList2 = n4g.A0N;
        C1pq.A08("cameraMovableOverlayParams", immutableList2);
        this.A0N = immutableList2;
        this.A03 = n4g.A03;
        this.A04 = n4g.A04;
        this.A0C = n4g.A0C;
        this.A0U = n4g.A0U;
        String str = n4g.A0V;
        C1pq.A08("formatChangeReason", str);
        this.A0V = str;
        this.A0A = n4g.A0A;
        this.A0b = n4g.A0b;
        this.A0c = n4g.A0c;
        this.A0Q = n4g.A0Q;
        this.A0R = n4g.A0R;
        this.A0d = n4g.A0d;
        this.A0e = n4g.A0e;
        this.A0f = n4g.A0f;
        this.A0g = n4g.A0g;
        this.A0h = n4g.A0h;
        this.A0i = n4g.A0i;
        this.A0j = n4g.A0j;
        this.A0k = n4g.A0k;
        this.A0l = n4g.A0l;
        this.A0m = n4g.A0m;
        this.A0n = n4g.A0n;
        this.A0o = n4g.A0o;
        this.A0p = n4g.A0p;
        this.A0q = n4g.A0q;
        this.A0r = n4g.A0r;
        this.A0s = n4g.A0s;
        this.A0t = n4g.A0t;
        this.A0u = n4g.A0u;
        this.A0v = n4g.A0v;
        this.A0w = n4g.A0w;
        this.A0x = n4g.A0x;
        this.A0y = n4g.A0y;
        this.A0z = n4g.A0z;
        this.A10 = n4g.A10;
        this.A11 = n4g.A11;
        this.A12 = n4g.A12;
        this.A13 = n4g.A13;
        this.A14 = n4g.A14;
        this.A15 = n4g.A15;
        this.A16 = n4g.A16;
        this.A17 = n4g.A17;
        this.A18 = n4g.A18;
        this.A0I = n4g.A0I;
        this.A0S = n4g.A0S;
        this.A0J = n4g.A0J;
        this.A05 = n4g.A05;
        this.A00 = n4g.A00;
        this.A01 = n4g.A01;
        String str2 = n4g.A0W;
        C1pq.A08("musicEditingEntry", str2);
        this.A0W = str2;
        this.A0D = n4g.A0D;
        this.A02 = n4g.A02;
        this.A06 = n4g.A06;
        this.A19 = n4g.A19;
        this.A1A = n4g.A1A;
        this.A1B = n4g.A1B;
        this.A1C = n4g.A1C;
        this.A09 = n4g.A09;
        ImmutableList immutableList3 = n4g.A0O;
        C1pq.A08("taggedPeopleBackup", immutableList3);
        this.A0O = immutableList3;
        this.A0X = n4g.A0X;
        this.A0G = n4g.A0G;
        this.A07 = n4g.A07;
        this.A0F = n4g.A0F;
        this.A0Y = n4g.A0Y;
        this.A0Z = n4g.A0Z;
        this.A0H = n4g.A0H;
        this.A0E = n4g.A0E;
        this.A08 = n4g.A08;
        this.A0a = Collections.unmodifiableSet(n4g.A0a);
    }

    public InspirationState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        CrossPostingMetadata crossPostingMetadata = null;
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = EnumC3473Mer.values()[parcel.readInt()];
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                A0u.put(parcel.readString(), parcel.readParcelable(A0e));
            }
            this.A0P = ImmutableMap.copyOf((Map) A0u);
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (AudioTrackParams) AudioTrackParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = (VideoTrimParams) VideoTrimParams.CREATOR.createFromParcel(parcel);
        }
        int readInt2 = parcel.readInt();
        InspirationOverlayParamsHolder[] inspirationOverlayParamsHolderArr = new InspirationOverlayParamsHolder[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = DKG.A02(parcel, InspirationOverlayParamsHolder.CREATOR, inspirationOverlayParamsHolderArr, i3);
        }
        this.A0M = ImmutableList.copyOf(inspirationOverlayParamsHolderArr);
        int readInt3 = parcel.readInt();
        InspirationOverlayParamsHolder[] inspirationOverlayParamsHolderArr2 = new InspirationOverlayParamsHolder[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = DKG.A02(parcel, InspirationOverlayParamsHolder.CREATOR, inspirationOverlayParamsHolderArr2, i4);
        }
        this.A0N = ImmutableList.copyOf(inspirationOverlayParamsHolderArr2);
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = EnumC3474Mes.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = parcel.readString();
        }
        this.A0V = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = MfV.values()[parcel.readInt()];
        }
        this.A0b = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0c = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            HashMap A0u2 = AnonymousClass001.A0u();
            int readInt4 = parcel.readInt();
            for (int i5 = 0; i5 < readInt4; i5++) {
                A0u2.put(parcel.readString(), parcel.readParcelable(A0e));
            }
            this.A0Q = ImmutableMap.copyOf((Map) A0u2);
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            HashMap A0u3 = AnonymousClass001.A0u();
            int readInt5 = parcel.readInt();
            for (int i6 = 0; i6 < readInt5; i6++) {
                A0u3.put(parcel.readString(), InspirationTimedElementParams.CREATOR.createFromParcel(parcel));
            }
            this.A0R = ImmutableMap.copyOf((Map) A0u3);
        }
        this.A0d = 1BM.A07(parcel);
        this.A0e = 1BM.A07(parcel);
        this.A0f = 1BM.A07(parcel);
        this.A0g = 1BM.A07(parcel);
        this.A0h = 1BM.A07(parcel);
        this.A0i = 1BM.A07(parcel);
        this.A0j = 1BM.A07(parcel);
        this.A0k = 1BM.A07(parcel);
        this.A0l = 1BM.A07(parcel);
        this.A0m = 1BM.A07(parcel);
        this.A0n = 1BM.A07(parcel);
        this.A0o = 1BM.A07(parcel);
        this.A0p = 1BM.A07(parcel);
        this.A0q = 1BM.A07(parcel);
        this.A0r = 1BM.A07(parcel);
        this.A0s = 1BM.A07(parcel);
        this.A0t = 1BM.A07(parcel);
        this.A0u = 1BM.A07(parcel);
        this.A0v = 1BM.A07(parcel);
        this.A0w = 1BM.A07(parcel);
        this.A0x = 1BM.A07(parcel);
        this.A0y = 1BM.A07(parcel);
        this.A0z = 1BM.A07(parcel);
        this.A10 = 1BM.A07(parcel);
        this.A11 = 1BM.A07(parcel);
        this.A12 = 1BM.A07(parcel);
        this.A13 = 1BM.A07(parcel);
        this.A14 = 1BM.A07(parcel);
        this.A15 = 1BM.A07(parcel);
        this.A16 = 1BM.A07(parcel);
        this.A17 = 1BM.A07(parcel);
        this.A18 = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = (ComposerLocation) ComposerLocation.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = (LocationPickerResultLocation) LocationPickerResultLocation.CREATOR.createFromParcel(parcel);
        }
        this.A05 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A0W = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = EnumC3485Mf3.values()[parcel.readInt()];
        }
        this.A02 = parcel.readFloat();
        this.A06 = parcel.readInt();
        this.A19 = 1BM.A07(parcel);
        this.A1A = 1BM.A07(parcel);
        this.A1B = 1BM.A07(parcel);
        this.A1C = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (SingleStackingMediaStatusInfo) SingleStackingMediaStatusInfo.CREATOR.createFromParcel(parcel);
        }
        int readInt6 = parcel.readInt();
        ComposerTaggedUser[] composerTaggedUserArr = new ComposerTaggedUser[readInt6];
        int i7 = 0;
        while (i7 < readInt6) {
            i7 = DKG.A02(parcel, ComposerTaggedUser.CREATOR, composerTaggedUserArr, i7);
        }
        this.A0O = ImmutableList.copyOf(composerTaggedUserArr);
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (InspirationTimelineEditorBackupData) parcel.readParcelable(A0e);
        }
        this.A07 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (InspirationTTSVoiceType) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = (InspirationVideoEditingData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = EnumC3486Mf5.values()[parcel.readInt()];
        }
        this.A08 = parcel.readInt() != 0 ? (CrossPostingMetadata) CrossPostingMetadata.CREATOR.createFromParcel(parcel) : crossPostingMetadata;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt7 = parcel.readInt();
        while (i < readInt7) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0a = Collections.unmodifiableSet(A0v);
    }

    @Override // X.NAo
    public MfV AnE() {
        if (this.A0a.contains("formatMode")) {
            return this.A0A;
        }
        if (A1D == null) {
            synchronized (this) {
                if (A1D == null) {
                    A1D = MfV.A0l;
                }
            }
        }
        return A1D;
    }

    @Override // X.NAo
    public EnumC3485Mf3 AyW() {
        if (this.A0a.contains("musicSource")) {
            return this.A0D;
        }
        if (A1E == null) {
            synchronized (this) {
                if (A1E == null) {
                    A1E = EnumC3485Mf3.A05;
                }
            }
        }
        return A1E;
    }

    @Override // X.NAo
    public InspirationTTSVoiceType BHK() {
        if (this.A0a.contains("ttsVoiceType")) {
            return this.A0F;
        }
        if (A1G == null) {
            synchronized (this) {
                if (A1G == null) {
                    A1G = NAo.A01;
                }
            }
        }
        return A1G;
    }

    @Override // X.NAo
    public EnumC3486Mf5 BJS() {
        if (this.A0a.contains("videoLengthState")) {
            return this.A0E;
        }
        if (A1F == null) {
            synchronized (this) {
                if (A1F == null) {
                    A1F = EnumC3486Mf5.A02;
                }
            }
        }
        return A1F;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationState)) {
                return false;
            }
            InspirationState inspirationState = (InspirationState) obj;
            if (!11T.A0O(this.A0T, inspirationState.A0T) || this.A0B != inspirationState.A0B || !11T.A0O(this.A0P, inspirationState.A0P) || !11T.A0O(this.A0L, inspirationState.A0L) || !11T.A0O(this.A0K, inspirationState.A0K) || !11T.A0O(this.A0M, inspirationState.A0M) || !11T.A0O(this.A0N, inspirationState.A0N) || this.A03 != inspirationState.A03 || this.A04 != inspirationState.A04 || this.A0C != inspirationState.A0C || !11T.A0O(this.A0U, inspirationState.A0U) || !11T.A0O(this.A0V, inspirationState.A0V) || AnE() != inspirationState.AnE() || this.A0b != inspirationState.A0b || this.A0c != inspirationState.A0c || !11T.A0O(this.A0Q, inspirationState.A0Q) || !11T.A0O(this.A0R, inspirationState.A0R) || this.A0d != inspirationState.A0d || this.A0e != inspirationState.A0e || this.A0f != inspirationState.A0f || this.A0g != inspirationState.A0g || this.A0h != inspirationState.A0h || this.A0i != inspirationState.A0i || this.A0j != inspirationState.A0j || this.A0k != inspirationState.A0k || this.A0l != inspirationState.A0l || this.A0m != inspirationState.A0m || this.A0n != inspirationState.A0n || this.A0o != inspirationState.A0o || this.A0p != inspirationState.A0p || this.A0q != inspirationState.A0q || this.A0r != inspirationState.A0r || this.A0s != inspirationState.A0s || this.A0t != inspirationState.A0t || this.A0u != inspirationState.A0u || this.A0v != inspirationState.A0v || this.A0w != inspirationState.A0w || this.A0x != inspirationState.A0x || this.A0y != inspirationState.A0y || this.A0z != inspirationState.A0z || this.A10 != inspirationState.A10 || this.A11 != inspirationState.A11 || this.A12 != inspirationState.A12 || this.A13 != inspirationState.A13 || this.A14 != inspirationState.A14 || this.A15 != inspirationState.A15 || this.A16 != inspirationState.A16 || this.A17 != inspirationState.A17 || this.A18 != inspirationState.A18 || !11T.A0O(this.A0I, inspirationState.A0I) || !11T.A0O(this.A0S, inspirationState.A0S) || !11T.A0O(this.A0J, inspirationState.A0J) || this.A05 != inspirationState.A05 || this.A00 != inspirationState.A00 || this.A01 != inspirationState.A01 || !11T.A0O(this.A0W, inspirationState.A0W) || AyW() != inspirationState.AyW() || this.A02 != inspirationState.A02 || this.A06 != inspirationState.A06 || this.A19 != inspirationState.A19 || this.A1A != inspirationState.A1A || this.A1B != inspirationState.A1B || this.A1C != inspirationState.A1C || !11T.A0O(this.A09, inspirationState.A09) || !11T.A0O(this.A0O, inspirationState.A0O) || !11T.A0O(this.A0X, inspirationState.A0X) || !11T.A0O(this.A0G, inspirationState.A0G) || this.A07 != inspirationState.A07 || !11T.A0O(BHK(), inspirationState.BHK()) || !11T.A0O(this.A0Y, inspirationState.A0Y) || !11T.A0O(this.A0Z, inspirationState.A0Z) || !11T.A0O(this.A0H, inspirationState.A0H) || BJS() != inspirationState.BJS() || !11T.A0O(this.A08, inspirationState.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A0T);
        int A04 = (((C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A0K, C1pq.A04(this.A0L, C1pq.A04(this.A0P, (A03 * 31) + C3o5.A03(this.A0B)))))) * 31) + this.A03) * 31) + this.A04;
        int A042 = C1pq.A04(this.A0V, C1pq.A04(this.A0U, (A04 * 31) + C3o5.A03(this.A0C)));
        int A043 = C1pq.A04(this.A0W, AbM.A00(AbM.A00((C1pq.A04(this.A0J, C1pq.A04(this.A0S, C1pq.A04(this.A0I, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0R, C1pq.A04(this.A0Q, C1pq.A02(C1pq.A02((A042 * 31) + C3o5.A03(AnE()), this.A0b), this.A0c))), this.A0d), this.A0e), this.A0f), this.A0g), this.A0h), this.A0i), this.A0j), this.A0k), this.A0l), this.A0m), this.A0n), this.A0o), this.A0p), this.A0q), this.A0r), this.A0s), this.A0t), this.A0u), this.A0v), this.A0w), this.A0x), this.A0y), this.A0z), this.A10), this.A11), this.A12), this.A13), this.A14), this.A15), this.A16), this.A17), this.A18)))) * 31) + this.A05, this.A00), this.A01));
        int A044 = C1pq.A04(this.A0H, C1pq.A04(this.A0Z, C1pq.A04(this.A0Y, C1pq.A04(BHK(), (C1pq.A04(this.A0G, C1pq.A04(this.A0X, C1pq.A04(this.A0O, C1pq.A04(this.A09, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((AbM.A00((A043 * 31) + C3o5.A03(AyW()), this.A02) * 31) + this.A06, this.A19), this.A1A), this.A1B), this.A1C))))) * 31) + this.A07))));
        return C1pq.A04(this.A08, (A044 * 31) + DKF.A04(BJS()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0T);
        C3o5.A0e(parcel, this.A0B);
        ImmutableMap immutableMap = this.A0P;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                parcel.writeParcelable((Parcelable) MRl.A0K(parcel, A0g), i);
            }
        }
        AudioTrackParams audioTrackParams = this.A0L;
        if (audioTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioTrackParams.writeToParcel(parcel, i);
        }
        MRl.A0P(parcel, this.A0K, i);
        1Du A0b = 1BL.A0b(parcel, this.A0M);
        while (A0b.hasNext()) {
            MRl.A0Q(parcel, A0b, i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A0N);
        while (A0b2.hasNext()) {
            MRl.A0Q(parcel, A0b2, i);
        }
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        C3o5.A0e(parcel, this.A0C);
        1BL.A13(parcel, this.A0U);
        parcel.writeString(this.A0V);
        C3o5.A0e(parcel, this.A0A);
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeInt(this.A0c ? 1 : 0);
        ImmutableMap immutableMap2 = this.A0Q;
        if (immutableMap2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g2 = DKH.A0g(parcel, immutableMap2);
            while (A0g2.hasNext()) {
                parcel.writeParcelable((Parcelable) MRl.A0K(parcel, A0g2), i);
            }
        }
        ImmutableMap immutableMap3 = this.A0R;
        if (immutableMap3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g3 = DKH.A0g(parcel, immutableMap3);
            while (A0g3.hasNext()) {
                ((InspirationTimedElementParams) MRl.A0K(parcel, A0g3)).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeInt(this.A0l ? 1 : 0);
        parcel.writeInt(this.A0m ? 1 : 0);
        parcel.writeInt(this.A0n ? 1 : 0);
        parcel.writeInt(this.A0o ? 1 : 0);
        parcel.writeInt(this.A0p ? 1 : 0);
        parcel.writeInt(this.A0q ? 1 : 0);
        parcel.writeInt(this.A0r ? 1 : 0);
        parcel.writeInt(this.A0s ? 1 : 0);
        parcel.writeInt(this.A0t ? 1 : 0);
        parcel.writeInt(this.A0u ? 1 : 0);
        parcel.writeInt(this.A0v ? 1 : 0);
        parcel.writeInt(this.A0w ? 1 : 0);
        parcel.writeInt(this.A0x ? 1 : 0);
        parcel.writeInt(this.A0y ? 1 : 0);
        parcel.writeInt(this.A0z ? 1 : 0);
        parcel.writeInt(this.A10 ? 1 : 0);
        parcel.writeInt(this.A11 ? 1 : 0);
        parcel.writeInt(this.A12 ? 1 : 0);
        parcel.writeInt(this.A13 ? 1 : 0);
        parcel.writeInt(this.A14 ? 1 : 0);
        parcel.writeInt(this.A15 ? 1 : 0);
        parcel.writeInt(this.A16 ? 1 : 0);
        parcel.writeInt(this.A17 ? 1 : 0);
        parcel.writeInt(this.A18 ? 1 : 0);
        ComposerLocation composerLocation = this.A0I;
        if (composerLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerLocation.writeToParcel(parcel, i);
        }
        AbN.A0s(parcel, this.A0S);
        LocationPickerResultLocation locationPickerResultLocation = this.A0J;
        if (locationPickerResultLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            locationPickerResultLocation.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A05);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeString(this.A0W);
        C3o5.A0e(parcel, this.A0D);
        parcel.writeFloat(this.A02);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A19 ? 1 : 0);
        parcel.writeInt(this.A1A ? 1 : 0);
        parcel.writeInt(this.A1B ? 1 : 0);
        parcel.writeInt(this.A1C ? 1 : 0);
        SingleStackingMediaStatusInfo singleStackingMediaStatusInfo = this.A09;
        if (singleStackingMediaStatusInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singleStackingMediaStatusInfo.writeToParcel(parcel, i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A0O);
        while (A0b3.hasNext()) {
            ((ComposerTaggedUser) A0b3.next()).writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0X);
        C3o5.A0d(parcel, this.A0G, i);
        parcel.writeInt(this.A07);
        C3o5.A0d(parcel, this.A0F, i);
        1BL.A13(parcel, this.A0Y);
        1BL.A13(parcel, this.A0Z);
        C3o5.A0d(parcel, this.A0H, i);
        C3o5.A0e(parcel, this.A0E);
        CrossPostingMetadata crossPostingMetadata = this.A08;
        if (crossPostingMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            crossPostingMetadata.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0a);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
