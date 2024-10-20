package com.facebook.photos.creativeediting.model;

import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BL;
import X.1BM;
import X.1Bq;
import X.1Br;
import X.1Du;
import X.28Q;
import X.4YT;
import X.5BB;
import X.7zO;
import X.AbG;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbM;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C01s;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKE;
import X.DKF;
import X.DKG;
import X.EQi;
import X.FKW;
import X.GOm;
import X.MRl;
import X.N43;
import X.NAk;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLInspirationsAccountSettingsSaveSource;
import com.facebook.graphql.enums.GraphQLXFBMusicPickerSongMonetizationInfo;
import com.facebook.musicpicker.models.MusicBeatModel;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: MusicTrackParams.class */
public final class MusicTrackParams implements Parcelable, NAk {
    public static final Parcelable.Creator CREATOR = new FKW(18);
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final EQi A0G;
    public final GraphQLInspirationsAccountSettingsSaveSource A0H;
    public final GraphQLXFBMusicPickerSongMonetizationInfo A0I;
    public final ImmutableList A0J;
    public final ImmutableList A0K;
    public final ImmutableList A0L;
    public final Long A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
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
    public final String A0b;
    public final String A0c;
    public final String A0d;
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

    /* loaded from: MusicTrackParams$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N43 n43 = new N43();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2028672891:
                                if (A1C.equals("song_id")) {
                                    n43.A0b = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1937323901:
                                if (A1C.equals("artist_name")) {
                                    n43.A05(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case -1927465350:
                                if (A1C.equals("section_tag_id")) {
                                    n43.A0a = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1840920871:
                                if (A1C.equals("music_track_start_time_in_ms")) {
                                    n43.A0B = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1512070049:
                                if (A1C.equals("selection_index")) {
                                    n43.A0M = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                break;
                            case -1503288843:
                                if (A1C.equals("audio_source_type")) {
                                    n43.A03 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1406128219:
                                if (A1C.equals("is_music_track_init_complete")) {
                                    n43.A0l = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1280645564:
                                if (A1C.equals("uri_string")) {
                                    n43.A0d = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -1072670157:
                                if (A1C.equals("music_track_fade_in_time_in_ms")) {
                                    n43.A09 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1051925603:
                                if (A1C.equals("music_video_start_time_ms")) {
                                    n43.A0D = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1019118274:
                                if (A1C.equals("is_sound_sync_applied")) {
                                    n43.A0o = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -948363223:
                                if (A1C.equals("video_fade_in_time_in_ms")) {
                                    n43.A0E = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -808865487:
                                if (A1C.equals("is_auto_added_track")) {
                                    n43.A0g = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -757853179:
                                if (A1C.equals("alacorn_session_id")) {
                                    n43.A0N = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -746481868:
                                if (A1C.equals("music_volume_adjustment_in_d_b")) {
                                    n43.A01 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -671023262:
                                if (A1C.equals("music_video_uri_string")) {
                                    n43.A0Z = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case -264155746:
                                if (A1C.equals("all_highlight_times_in_ms")) {
                                    n43.A04(AbstractC11224vw.A00(abstractC01033pi, c27t, Integer.class));
                                    break;
                                }
                                break;
                            case -236945154:
                                if (A1C.equals("is_internal_track")) {
                                    n43.A0j = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -170869953:
                                if (A1C.equals("has_search_text")) {
                                    n43.A0e = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -98166093:
                                if (A1C.equals("is_lyrics_available")) {
                                    n43.A0k = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -59289858:
                                if (A1C.equals("video_fade_out_time_in_ms")) {
                                    n43.A0F = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -25092706:
                                if (A1C.equals("video_volume_adjustment_in_d_b")) {
                                    n43.A02 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 70261140:
                                if (A1C.equals("music_integrated_loudness_in_db")) {
                                    n43.A00 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 80746441:
                                if (A1C.equals("is_song_explicit")) {
                                    n43.A0n = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 99990863:
                                if (A1C.equals("complete_track_duration_in_ms")) {
                                    n43.A04 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 100346066:
                                if (A1C.equals("index")) {
                                    n43.A06 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 109659572:
                                if (A1C.equals("cover_image_large_uri_string")) {
                                    n43.A0R = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 110371416:
                                if (A1C.equals("title")) {
                                    n43.A08(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case 296780693:
                                if (A1C.equals("music_sticker_style")) {
                                    n43.A07 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 382162484:
                                if (A1C.equals("music_track_fade_out_time_in_ms")) {
                                    n43.A0A = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 437646393:
                                if (A1C.equals("browse_session_id")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n43.A0Q = A03;
                                    C1pq.A08("browseSessionId", A03);
                                    break;
                                }
                                break;
                            case 450318201:
                                if (A1C.equals("highlight_time_in_ms")) {
                                    n43.A05 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 460897700:
                                if (A1C.equals("music_asset_id")) {
                                    n43.A07(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case 577296745:
                                if (A1C.equals("music_track_source")) {
                                    n43.A0X = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 763088688:
                                if (A1C.equals("cover_image_uri_string")) {
                                    n43.A0S = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 778171472:
                                if (A1C.equals("amplitudes")) {
                                    n43.A0K = AbstractC11224vw.A00(abstractC01033pi, c27t, Float.class);
                                    break;
                                }
                                break;
                            case 837971229:
                                if (A1C.equals("save_source")) {
                                    n43.A0H = (GraphQLInspirationsAccountSettingsSaveSource) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLInspirationsAccountSettingsSaveSource.class);
                                    break;
                                }
                                break;
                            case 945421114:
                                if (A1C.equals("song_monetization_info")) {
                                    n43.A0I = (GraphQLXFBMusicPickerSongMonetizationInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBMusicPickerSongMonetizationInfo.class);
                                    break;
                                }
                                break;
                            case 1128191036:
                                if (A1C.equals(4YT.A00(63))) {
                                    n43.A0T = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1160721534:
                                if (A1C.equals("is_correlated_recommendation")) {
                                    n43.A0h = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1160789910:
                                if (A1C.equals("music_video_end_time_ms")) {
                                    n43.A0C = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1167619811:
                                if (A1C.equals("lyrics_cache_id")) {
                                    n43.A0U = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1171396330:
                                if (A1C.equals("is_volume_manually_adjusted")) {
                                    n43.A0p = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1202474906:
                                if (A1C.equals("music_picker_mode")) {
                                    n43.A02(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case 1283503945:
                                if (A1C.equals("is_added_from_search")) {
                                    n43.A0f = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1334890642:
                                if (A1C.equals("song_has_music_video")) {
                                    n43.A0q = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1366351768:
                                if (A1C.equals("music_picker_product")) {
                                    n43.A0G = (EQi) AbstractC11224vw.A02(abstractC01033pi, c27t, EQi.class);
                                    break;
                                }
                                break;
                            case 1370960642:
                                if (A1C.equals("audio_library_product")) {
                                    n43.A06(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case 1424271535:
                                if (A1C.equals("is_owner_of_original_audio")) {
                                    n43.A0m = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1536138949:
                                if (A1C.equals("is_downloading")) {
                                    n43.A0i = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1573111011:
                                if (A1C.equals("music_beats")) {
                                    n43.A0L = AbstractC11224vw.A00(abstractC01033pi, c27t, MusicBeatModel.class);
                                    break;
                                }
                                break;
                            case 1694075875:
                                if (A1C.equals("music_track_duration_in_ms")) {
                                    n43.A08 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1985487929:
                                if (A1C.equals("music_video_id")) {
                                    n43.A0Y = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, MusicTrackParams.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new MusicTrackParams(n43);
        }
    }

    /* loaded from: MusicTrackParams$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            MusicTrackParams musicTrackParams = (MusicTrackParams) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "alacorn_session_id", musicTrackParams.A0N);
            AbstractC11224vw.A06(r302, c26c, "all_highlight_times_in_ms", musicTrackParams.A0J);
            AbstractC11224vw.A06(r302, c26c, "amplitudes", musicTrackParams.A0K);
            AbstractC11224vw.A0D(r302, "artist_name", musicTrackParams.A0O);
            AbstractC11224vw.A0D(r302, "audio_library_product", musicTrackParams.A0P);
            int i = musicTrackParams.A03;
            r302.A0o("audio_source_type");
            r302.A0f(i);
            AbstractC11224vw.A0D(r302, "browse_session_id", musicTrackParams.A0Q);
            int i2 = musicTrackParams.A04;
            r302.A0o("complete_track_duration_in_ms");
            r302.A0f(i2);
            AbstractC11224vw.A0D(r302, "cover_image_large_uri_string", musicTrackParams.A0R);
            AbstractC11224vw.A0D(r302, "cover_image_uri_string", musicTrackParams.A0S);
            AbstractC11224vw.A0D(r302, 4YT.A00(63), musicTrackParams.A0T);
            boolean z = musicTrackParams.A0e;
            r302.A0o("has_search_text");
            r302.A0v(z);
            int i3 = musicTrackParams.A05;
            r302.A0o("highlight_time_in_ms");
            r302.A0f(i3);
            int i4 = musicTrackParams.A06;
            r302.A0o("index");
            r302.A0f(i4);
            boolean z2 = musicTrackParams.A0f;
            r302.A0o("is_added_from_search");
            r302.A0v(z2);
            boolean z3 = musicTrackParams.A0g;
            r302.A0o("is_auto_added_track");
            r302.A0v(z3);
            boolean z4 = musicTrackParams.A0h;
            r302.A0o("is_correlated_recommendation");
            r302.A0v(z4);
            boolean z5 = musicTrackParams.A0i;
            r302.A0o("is_downloading");
            r302.A0v(z5);
            boolean z6 = musicTrackParams.A0j;
            r302.A0o("is_internal_track");
            r302.A0v(z6);
            boolean z7 = musicTrackParams.A0k;
            r302.A0o("is_lyrics_available");
            r302.A0v(z7);
            boolean z8 = musicTrackParams.A0l;
            r302.A0o("is_music_track_init_complete");
            r302.A0v(z8);
            boolean z9 = musicTrackParams.A0m;
            r302.A0o("is_owner_of_original_audio");
            r302.A0v(z9);
            boolean z10 = musicTrackParams.A0n;
            r302.A0o("is_song_explicit");
            r302.A0v(z10);
            boolean z11 = musicTrackParams.A0o;
            r302.A0o("is_sound_sync_applied");
            r302.A0v(z11);
            boolean z12 = musicTrackParams.A0p;
            r302.A0o("is_volume_manually_adjusted");
            r302.A0v(z12);
            AbstractC11224vw.A0D(r302, "lyrics_cache_id", musicTrackParams.A0U);
            AbstractC11224vw.A0D(r302, "music_asset_id", musicTrackParams.A0V);
            AbstractC11224vw.A06(r302, c26c, "music_beats", musicTrackParams.A0L);
            float f = musicTrackParams.A00;
            r302.A0o("music_integrated_loudness_in_db");
            r302.A0e(f);
            AbstractC11224vw.A0D(r302, "music_picker_mode", musicTrackParams.A0W);
            AbstractC11224vw.A05(r302, c26c, musicTrackParams.A0G, "music_picker_product");
            int i5 = musicTrackParams.A07;
            r302.A0o("music_sticker_style");
            r302.A0f(i5);
            int i6 = musicTrackParams.A08;
            r302.A0o("music_track_duration_in_ms");
            r302.A0f(i6);
            int i7 = musicTrackParams.A09;
            r302.A0o("music_track_fade_in_time_in_ms");
            r302.A0f(i7);
            int i8 = musicTrackParams.A0A;
            r302.A0o("music_track_fade_out_time_in_ms");
            r302.A0f(i8);
            AbstractC11224vw.A0D(r302, "music_track_source", musicTrackParams.A0X);
            int i9 = musicTrackParams.A0B;
            r302.A0o("music_track_start_time_in_ms");
            r302.A0f(i9);
            int i10 = musicTrackParams.A0C;
            r302.A0o("music_video_end_time_ms");
            r302.A0f(i10);
            AbstractC11224vw.A0D(r302, "music_video_id", musicTrackParams.A0Y);
            int i11 = musicTrackParams.A0D;
            r302.A0o("music_video_start_time_ms");
            r302.A0f(i11);
            AbstractC11224vw.A0D(r302, "music_video_uri_string", musicTrackParams.A0Z);
            float f2 = musicTrackParams.A01;
            r302.A0o("music_volume_adjustment_in_d_b");
            r302.A0e(f2);
            AbstractC11224vw.A05(r302, c26c, musicTrackParams.A0H, "save_source");
            AbstractC11224vw.A0D(r302, "section_tag_id", musicTrackParams.A0a);
            AbstractC11224vw.A0C(r302, musicTrackParams.A0M, "selection_index");
            boolean z13 = musicTrackParams.A0q;
            r302.A0o("song_has_music_video");
            r302.A0v(z13);
            AbstractC11224vw.A0D(r302, "song_id", musicTrackParams.A0b);
            AbstractC11224vw.A05(r302, c26c, musicTrackParams.A0I, "song_monetization_info");
            AbstractC11224vw.A0D(r302, "title", musicTrackParams.A0c);
            AbstractC11224vw.A0D(r302, "uri_string", musicTrackParams.A0d);
            int i12 = musicTrackParams.A0E;
            r302.A0o("video_fade_in_time_in_ms");
            r302.A0f(i12);
            int i13 = musicTrackParams.A0F;
            r302.A0o("video_fade_out_time_in_ms");
            r302.A0f(i13);
            float f3 = musicTrackParams.A02;
            r302.A0o("video_volume_adjustment_in_d_b");
            r302.A0e(f3);
            r302.A0Y();
        }
    }

    public MusicTrackParams(N43 n43) {
        String str;
        this.A0N = n43.A0N;
        ImmutableList immutableList = n43.A0J;
        C1pq.A08("allHighlightTimesInMs", immutableList);
        this.A0J = immutableList;
        this.A0K = n43.A0K;
        String str2 = n43.A0O;
        C1pq.A08("artistName", str2);
        this.A0O = str2;
        String str3 = n43.A0P;
        C1pq.A08("audioLibraryProduct", str3);
        this.A0P = str3;
        this.A03 = n43.A03;
        String str4 = n43.A0Q;
        C1pq.A08("browseSessionId", str4);
        this.A0Q = str4;
        this.A04 = n43.A04;
        this.A0R = n43.A0R;
        this.A0S = n43.A0S;
        this.A0T = n43.A0T;
        this.A0e = n43.A0e;
        this.A05 = n43.A05;
        this.A06 = n43.A06;
        this.A0f = n43.A0f;
        this.A0g = n43.A0g;
        this.A0h = n43.A0h;
        this.A0i = n43.A0i;
        this.A0j = n43.A0j;
        this.A0k = n43.A0k;
        this.A0l = n43.A0l;
        this.A0m = n43.A0m;
        this.A0n = n43.A0n;
        this.A0o = n43.A0o;
        this.A0p = n43.A0p;
        this.A0U = n43.A0U;
        String str5 = n43.A0V;
        C1pq.A08("musicAssetId", str5);
        this.A0V = str5;
        this.A0L = n43.A0L;
        this.A00 = n43.A00;
        String str6 = n43.A0W;
        C1pq.A08("musicPickerMode", str6);
        this.A0W = str6;
        this.A0G = n43.A0G;
        this.A07 = n43.A07;
        this.A08 = n43.A08;
        this.A09 = n43.A09;
        this.A0A = n43.A0A;
        this.A0X = n43.A0X;
        this.A0B = n43.A0B;
        this.A0C = n43.A0C;
        this.A0Y = n43.A0Y;
        this.A0D = n43.A0D;
        this.A0Z = n43.A0Z;
        this.A01 = n43.A01;
        this.A0H = n43.A0H;
        this.A0a = n43.A0a;
        this.A0M = n43.A0M;
        this.A0q = n43.A0q;
        this.A0b = n43.A0b;
        this.A0I = n43.A0I;
        String str7 = n43.A0c;
        C1pq.A08("title", str7);
        this.A0c = str7;
        String str8 = n43.A0d;
        this.A0d = str8;
        this.A0E = n43.A0E;
        this.A0F = n43.A0F;
        this.A02 = n43.A02;
        1Br A00 = 1Bq.A00(16511);
        if ((str8 == null || str8.length() == 0) && ((str = this.A0T) == null || str.length() == 0)) {
            ((C01s) A00.get()).D0v("MusicTrackParamsSpec-IllegalSource", toString());
        }
        if (!this.A0i && this.A08 <= 0) {
            ((C01s) A00.get()).D0v("MusicTrackParamsSpec-IllegalDuration", toString());
        }
        int i = this.A0B;
        if (i < 0) {
            float f = 0.0f / 0.0f;
            if (i != -1) {
                ((C01s) A00.get()).D0v("MusicTrackParamsSpec-IllegalStartTime", toString());
            }
        }
    }

    public MusicTrackParams(Parcel parcel) {
        GraphQLXFBMusicPickerSongMonetizationInfo graphQLXFBMusicPickerSongMonetizationInfo = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        int readInt = parcel.readInt();
        Integer[] numArr = new Integer[readInt];
        for (int i = 0; i < readInt; i++) {
            numArr[i] = AbI.A0z(parcel);
        }
        this.A0J = ImmutableList.copyOf(numArr);
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            int readInt2 = parcel.readInt();
            Float[] fArr = new Float[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                fArr[i2] = MRl.A0I(parcel);
            }
            this.A0K = ImmutableList.copyOf(fArr);
        }
        this.A0O = parcel.readString();
        this.A0P = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0Q = parcel.readString();
        this.A04 = parcel.readInt();
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
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = parcel.readString();
        }
        this.A0e = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A05 = parcel.readInt();
        this.A06 = parcel.readInt();
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
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = parcel.readString();
        }
        this.A0V = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            int readInt3 = parcel.readInt();
            MusicBeatModel[] musicBeatModelArr = new MusicBeatModel[readInt3];
            int i3 = 0;
            while (i3 < readInt3) {
                i3 = DKG.A02(parcel, MusicBeatModel.CREATOR, musicBeatModelArr, i3);
            }
            this.A0L = ImmutableList.copyOf(musicBeatModelArr);
        }
        this.A00 = parcel.readFloat();
        this.A0W = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = EQi.values()[parcel.readInt()];
        }
        this.A07 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0A = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = parcel.readString();
        }
        this.A0B = parcel.readInt();
        this.A0C = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = parcel.readString();
        }
        this.A0D = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = parcel.readString();
        }
        this.A01 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = GraphQLInspirationsAccountSettingsSaveSource.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = 7zO.A0j(parcel);
        }
        this.A0q = AbJ.A1W(parcel);
        if (parcel.readInt() == 0) {
            this.A0b = null;
        } else {
            this.A0b = parcel.readString();
        }
        this.A0I = parcel.readInt() != 0 ? GraphQLXFBMusicPickerSongMonetizationInfo.values()[parcel.readInt()] : graphQLXFBMusicPickerSongMonetizationInfo;
        this.A0c = parcel.readString();
        this.A0d = C3o5.A0O(parcel);
        this.A0E = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A02 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MusicTrackParams)) {
                return false;
            }
            MusicTrackParams musicTrackParams = (MusicTrackParams) obj;
            if (!11T.A0O(this.A0N, musicTrackParams.A0N) || !11T.A0O(this.A0J, musicTrackParams.A0J) || !11T.A0O(this.A0K, musicTrackParams.A0K) || !11T.A0O(this.A0O, musicTrackParams.A0O) || !11T.A0O(this.A0P, musicTrackParams.A0P) || this.A03 != musicTrackParams.A03 || !11T.A0O(this.A0Q, musicTrackParams.A0Q) || this.A04 != musicTrackParams.A04 || !11T.A0O(this.A0R, musicTrackParams.A0R) || !11T.A0O(this.A0S, musicTrackParams.A0S) || !11T.A0O(this.A0T, musicTrackParams.A0T) || this.A0e != musicTrackParams.A0e || this.A05 != musicTrackParams.A05 || this.A06 != musicTrackParams.A06 || this.A0f != musicTrackParams.A0f || this.A0g != musicTrackParams.A0g || this.A0h != musicTrackParams.A0h || this.A0i != musicTrackParams.A0i || this.A0j != musicTrackParams.A0j || this.A0k != musicTrackParams.A0k || this.A0l != musicTrackParams.A0l || this.A0m != musicTrackParams.A0m || this.A0n != musicTrackParams.A0n || this.A0o != musicTrackParams.A0o || this.A0p != musicTrackParams.A0p || !11T.A0O(this.A0U, musicTrackParams.A0U) || !11T.A0O(this.A0V, musicTrackParams.A0V) || !11T.A0O(this.A0L, musicTrackParams.A0L) || this.A00 != musicTrackParams.A00 || !11T.A0O(this.A0W, musicTrackParams.A0W) || this.A0G != musicTrackParams.A0G || this.A07 != musicTrackParams.A07 || this.A08 != musicTrackParams.A08 || this.A09 != musicTrackParams.A09 || this.A0A != musicTrackParams.A0A || !11T.A0O(this.A0X, musicTrackParams.A0X) || this.A0B != musicTrackParams.A0B || this.A0C != musicTrackParams.A0C || !11T.A0O(this.A0Y, musicTrackParams.A0Y) || this.A0D != musicTrackParams.A0D || !11T.A0O(this.A0Z, musicTrackParams.A0Z) || this.A01 != musicTrackParams.A01 || this.A0H != musicTrackParams.A0H || !11T.A0O(this.A0a, musicTrackParams.A0a) || !11T.A0O(this.A0M, musicTrackParams.A0M) || this.A0q != musicTrackParams.A0q || !11T.A0O(this.A0b, musicTrackParams.A0b) || this.A0I != musicTrackParams.A0I || !11T.A0O(this.A0c, musicTrackParams.A0c) || !11T.A0O(this.A0d, musicTrackParams.A0d) || this.A0E != musicTrackParams.A0E || this.A0F != musicTrackParams.A0F || this.A02 != musicTrackParams.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0W, AbM.A00(C1pq.A04(this.A0L, C1pq.A04(this.A0V, C1pq.A04(this.A0U, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((((C1pq.A02(C1pq.A04(this.A0T, C1pq.A04(this.A0S, C1pq.A04(this.A0R, (C1pq.A04(this.A0Q, (C1pq.A04(this.A0P, C1pq.A04(this.A0O, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A03(this.A0N))))) * 31) + this.A03) * 31) + this.A04))), this.A0e) * 31) + this.A05) * 31) + this.A06, this.A0f), this.A0g), this.A0h), this.A0i), this.A0j), this.A0k), this.A0l), this.A0m), this.A0n), this.A0o), this.A0p)))), this.A00));
        int A00 = AbM.A00(C1pq.A04(this.A0Z, (C1pq.A04(this.A0Y, (((C1pq.A04(this.A0X, (((((((((A04 * 31) + C3o5.A03(this.A0G)) * 31) + this.A07) * 31) + this.A08) * 31) + this.A09) * 31) + this.A0A) * 31) + this.A0B) * 31) + this.A0C) * 31) + this.A0D), this.A01);
        int A042 = C1pq.A04(this.A0b, C1pq.A02(C1pq.A04(this.A0M, C1pq.A04(this.A0a, (A00 * 31) + C3o5.A03(this.A0H))), this.A0q));
        return AbM.A00((((C1pq.A04(this.A0d, C1pq.A04(this.A0c, (A042 * 31) + DKF.A04(this.A0I))) * 31) + this.A0E) * 31) + this.A0F, this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MusicTrackParams{alacornSessionId=");
        A0k.append(this.A0N);
        A0k.append(", allHighlightTimesInMs=");
        A0k.append(this.A0J);
        A0k.append(", amplitudes=");
        A0k.append(this.A0K);
        A0k.append(", artistName=");
        A0k.append(this.A0O);
        A0k.append(", audioLibraryProduct=");
        A0k.append(this.A0P);
        A0k.append(", audioSourceType=");
        A0k.append(this.A03);
        A0k.append(", browseSessionId=");
        A0k.append(this.A0Q);
        A0k.append(", completeTrackDurationInMs=");
        A0k.append(this.A04);
        A0k.append(", coverImageLargeUriString=");
        A0k.append(this.A0R);
        A0k.append(", coverImageUriString=");
        A0k.append(this.A0S);
        A0k.append(GOm.A00(98));
        A0k.append(this.A0T);
        A0k.append(", hasSearchText=");
        A0k.append(this.A0e);
        A0k.append(", highlightTimeInMs=");
        A0k.append(this.A05);
        A0k.append(1BJ.A00(63));
        A0k.append(this.A06);
        A0k.append(", isAddedFromSearch=");
        A0k.append(this.A0f);
        A0k.append(", isAutoAddedTrack=");
        A0k.append(this.A0g);
        A0k.append(", isCorrelatedRecommendation=");
        A0k.append(this.A0h);
        A0k.append(", isDownloading=");
        A0k.append(this.A0i);
        A0k.append(", isInternalTrack=");
        A0k.append(this.A0j);
        A0k.append(", isLyricsAvailable=");
        A0k.append(this.A0k);
        A0k.append(", isMusicTrackInitComplete=");
        A0k.append(this.A0l);
        A0k.append(", isOwnerOfOriginalAudio=");
        A0k.append(this.A0m);
        A0k.append(", isSongExplicit=");
        A0k.append(this.A0n);
        A0k.append(", isSoundSyncApplied=");
        A0k.append(this.A0o);
        A0k.append(", isVolumeManuallyAdjusted=");
        A0k.append(this.A0p);
        A0k.append(", lyricsCacheId=");
        A0k.append(this.A0U);
        A0k.append(", musicAssetId=");
        A0k.append(this.A0V);
        A0k.append(", musicBeats=");
        A0k.append(this.A0L);
        A0k.append(", musicIntegratedLoudnessInDb=");
        A0k.append(this.A00);
        A0k.append(", musicPickerMode=");
        A0k.append(this.A0W);
        A0k.append(", musicPickerProduct=");
        A0k.append(this.A0G);
        A0k.append(", musicStickerStyle=");
        A0k.append(this.A07);
        A0k.append(", musicTrackDurationInMs=");
        A0k.append(this.A08);
        A0k.append(", musicTrackFadeInTimeInMs=");
        A0k.append(this.A09);
        A0k.append(", musicTrackFadeOutTimeInMs=");
        A0k.append(this.A0A);
        A0k.append(", musicTrackSource=");
        A0k.append(this.A0X);
        A0k.append(", musicTrackStartTimeInMs=");
        A0k.append(this.A0B);
        A0k.append(", musicVideoEndTimeMs=");
        A0k.append(this.A0C);
        A0k.append(", musicVideoId=");
        A0k.append(this.A0Y);
        A0k.append(", musicVideoStartTimeMs=");
        A0k.append(this.A0D);
        A0k.append(", musicVideoUriString=");
        A0k.append(this.A0Z);
        A0k.append(", musicVolumeAdjustmentInDB=");
        A0k.append(this.A01);
        A0k.append(", saveSource=");
        A0k.append(this.A0H);
        A0k.append(", sectionTagId=");
        A0k.append(this.A0a);
        A0k.append(", selectionIndex=");
        A0k.append(this.A0M);
        A0k.append(", songHasMusicVideo=");
        A0k.append(this.A0q);
        A0k.append(", songId=");
        A0k.append(this.A0b);
        A0k.append(", songMonetizationInfo=");
        A0k.append(this.A0I);
        A0k.append(", title=");
        A0k.append(this.A0c);
        A0k.append(", uriString=");
        A0k.append(this.A0d);
        A0k.append(", videoFadeInTimeInMs=");
        A0k.append(this.A0E);
        A0k.append(", videoFadeOutTimeInMs=");
        A0k.append(this.A0F);
        A0k.append(", videoVolumeAdjustmentInDB=");
        A0k.append(this.A02);
        A0k.append("}");
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0N);
        1Du A0b = 1BL.A0b(parcel, this.A0J);
        while (A0b.hasNext()) {
            parcel.writeInt(DKE.A0F(A0b));
        }
        ImmutableList immutableList = this.A0K;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeFloat(((Number) A0Y.next()).floatValue());
            }
        }
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0P);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0Q);
        parcel.writeInt(this.A04);
        1BL.A13(parcel, this.A0R);
        1BL.A13(parcel, this.A0S);
        1BL.A13(parcel, this.A0T);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
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
        1BL.A13(parcel, this.A0U);
        parcel.writeString(this.A0V);
        ImmutableList immutableList2 = this.A0L;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                ((MusicBeatModel) A0Y2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A0W);
        C3o5.A0e(parcel, this.A0G);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0A);
        1BL.A13(parcel, this.A0X);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A0C);
        1BL.A13(parcel, this.A0Y);
        parcel.writeInt(this.A0D);
        1BL.A13(parcel, this.A0Z);
        parcel.writeFloat(this.A01);
        C3o5.A0e(parcel, this.A0H);
        1BL.A13(parcel, this.A0a);
        C3o5.A0g(parcel, this.A0M);
        parcel.writeInt(this.A0q ? 1 : 0);
        1BL.A13(parcel, this.A0b);
        C3o5.A0e(parcel, this.A0I);
        parcel.writeString(this.A0c);
        1BL.A13(parcel, this.A0d);
        parcel.writeInt(this.A0E);
        parcel.writeInt(this.A0F);
        parcel.writeFloat(this.A02);
    }
}
