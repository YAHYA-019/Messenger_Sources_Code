package com.facebook.inspiration.model.movableoverlay.music;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1BM;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbJ;
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
import X.FKc;
import X.N2s;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationMusicStickerInfo.class */
public final class InspirationMusicStickerInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A0Q;
    public static final Parcelable.Creator CREATOR = new FKc(64);
    public final double A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final InspirationOverlayPosition A09;
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
    public final Set A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    /* loaded from: InspirationMusicStickerInfo$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N2s n2s = new N2s();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1967345615:
                                if (A1C.equals("music_lyrics_background_style")) {
                                    n2s.A04 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1941923164:
                                if (A1C.equals("music_lyrics_sticker_text_color")) {
                                    n2s.A05 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1937323901:
                                if (A1C.equals("artist_name")) {
                                    n2s.A01(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case -1751053980:
                                if (A1C.equals("clip_duration_in_ms")) {
                                    n2s.A01 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1698851154:
                                if (A1C.equals("song_title")) {
                                    n2s.A02(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case -1195408547:
                                if (A1C.equals("sticker_id")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    n2s.A0J = A03;
                                    C1pq.A08("stickerId", A03);
                                    break;
                                }
                                break;
                            case -1190926310:
                                if (A1C.equals("clip_start_time_in_ms")) {
                                    n2s.A02 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1128818284:
                                if (A1C.equals("is_per_word_lyrics_enabled")) {
                                    n2s.A0P = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1051925603:
                                if (A1C.equals("music_video_start_time_ms")) {
                                    n2s.A08 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -815223285:
                                if (A1C.equals("is_auto_added_music")) {
                                    n2s.A0L = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -561815496:
                                if (A1C.equals("overlay_position")) {
                                    n2s.A00((InspirationOverlayPosition) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationOverlayPosition.class));
                                    break;
                                }
                                break;
                            case -461949816:
                                if (A1C.equals("album_title")) {
                                    String A032 = AbstractC11224vw.A03(abstractC01033pi);
                                    n2s.A0A = A032;
                                    C1pq.A08("albumTitle", A032);
                                    break;
                                }
                                break;
                            case -98166093:
                                if (A1C.equals("is_lyrics_available")) {
                                    n2s.A0O = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -58807444:
                                if (A1C.equals("cover_artwork")) {
                                    n2s.A0C = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 100346066:
                                if (A1C.equals("index")) {
                                    n2s.A03 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 296780693:
                                if (A1C.equals("music_sticker_style")) {
                                    n2s.A06 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 460897700:
                                if (A1C.equals("music_asset_id")) {
                                    String A033 = AbstractC11224vw.A03(abstractC01033pi);
                                    n2s.A0E = A033;
                                    C1pq.A08("musicAssetId", A033);
                                    break;
                                }
                                break;
                            case 513064310:
                                if (A1C.equals("is_in_home_base_mode")) {
                                    n2s.A0N = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 577296745:
                                if (A1C.equals("music_track_source")) {
                                    n2s.A0F = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1160789910:
                                if (A1C.equals("music_video_end_time_ms")) {
                                    n2s.A07 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case 1167619811:
                                if (A1C.equals("lyrics_cache_id")) {
                                    n2s.A0D = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1420595726:
                                if (A1C.equals("music_video_uri")) {
                                    n2s.A0H = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1630845353:
                                if (A1C.equals("is_explicit")) {
                                    n2s.A0M = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1985487929:
                                if (A1C.equals("music_video_id")) {
                                    n2s.A0G = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1993065956:
                                if (A1C.equals("scale_factor")) {
                                    n2s.A00 = abstractC01033pi.A11();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationMusicStickerInfo.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationMusicStickerInfo(n2s);
        }
    }

    /* loaded from: InspirationMusicStickerInfo$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationMusicStickerInfo inspirationMusicStickerInfo = (InspirationMusicStickerInfo) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "album_title", inspirationMusicStickerInfo.A0A);
            AbstractC11224vw.A0D(r302, "artist_name", inspirationMusicStickerInfo.A0B);
            int i = inspirationMusicStickerInfo.A01;
            r302.A0o("clip_duration_in_ms");
            r302.A0f(i);
            int i2 = inspirationMusicStickerInfo.A02;
            r302.A0o("clip_start_time_in_ms");
            r302.A0f(i2);
            AbstractC11224vw.A0D(r302, "cover_artwork", inspirationMusicStickerInfo.A0C);
            int i3 = inspirationMusicStickerInfo.A03;
            r302.A0o("index");
            r302.A0f(i3);
            boolean z = inspirationMusicStickerInfo.A0L;
            r302.A0o("is_auto_added_music");
            r302.A0v(z);
            boolean z2 = inspirationMusicStickerInfo.A0M;
            r302.A0o("is_explicit");
            r302.A0v(z2);
            boolean z3 = inspirationMusicStickerInfo.A0N;
            r302.A0o("is_in_home_base_mode");
            r302.A0v(z3);
            boolean z4 = inspirationMusicStickerInfo.A0O;
            r302.A0o("is_lyrics_available");
            r302.A0v(z4);
            boolean z5 = inspirationMusicStickerInfo.A0P;
            r302.A0o("is_per_word_lyrics_enabled");
            r302.A0v(z5);
            AbstractC11224vw.A0D(r302, "lyrics_cache_id", inspirationMusicStickerInfo.A0D);
            AbstractC11224vw.A0D(r302, "music_asset_id", inspirationMusicStickerInfo.A0E);
            int i4 = inspirationMusicStickerInfo.A04;
            r302.A0o("music_lyrics_background_style");
            r302.A0f(i4);
            int i5 = inspirationMusicStickerInfo.A05;
            r302.A0o("music_lyrics_sticker_text_color");
            r302.A0f(i5);
            int i6 = inspirationMusicStickerInfo.A06;
            r302.A0o("music_sticker_style");
            r302.A0f(i6);
            AbstractC11224vw.A0D(r302, "music_track_source", inspirationMusicStickerInfo.A0F);
            int i7 = inspirationMusicStickerInfo.A07;
            r302.A0o("music_video_end_time_ms");
            r302.A0f(i7);
            AbstractC11224vw.A0D(r302, "music_video_id", inspirationMusicStickerInfo.A0G);
            int i8 = inspirationMusicStickerInfo.A08;
            r302.A0o("music_video_start_time_ms");
            r302.A0f(i8);
            AbstractC11224vw.A0D(r302, "music_video_uri", inspirationMusicStickerInfo.A0H);
            AbstractC11224vw.A05(r302, c26c, inspirationMusicStickerInfo.A00(), "overlay_position");
            double d = inspirationMusicStickerInfo.A00;
            r302.A0o("scale_factor");
            r302.A0d(d);
            AbstractC11224vw.A0D(r302, "song_title", inspirationMusicStickerInfo.A0I);
            AbstractC11224vw.A0D(r302, "sticker_id", inspirationMusicStickerInfo.A0J);
            r302.A0Y();
        }
    }

    public InspirationMusicStickerInfo(N2s n2s) {
        String str = n2s.A0A;
        C1pq.A08("albumTitle", str);
        this.A0A = str;
        String str2 = n2s.A0B;
        C1pq.A08("artistName", str2);
        this.A0B = str2;
        this.A01 = n2s.A01;
        this.A02 = n2s.A02;
        this.A0C = n2s.A0C;
        this.A03 = n2s.A03;
        this.A0L = n2s.A0L;
        this.A0M = n2s.A0M;
        this.A0N = n2s.A0N;
        this.A0O = n2s.A0O;
        this.A0P = n2s.A0P;
        this.A0D = n2s.A0D;
        String str3 = n2s.A0E;
        C1pq.A08("musicAssetId", str3);
        this.A0E = str3;
        this.A04 = n2s.A04;
        this.A05 = n2s.A05;
        this.A06 = n2s.A06;
        this.A0F = n2s.A0F;
        this.A07 = n2s.A07;
        this.A0G = n2s.A0G;
        this.A08 = n2s.A08;
        this.A0H = n2s.A0H;
        this.A09 = n2s.A09;
        this.A00 = n2s.A00;
        String str4 = n2s.A0I;
        C1pq.A08("songTitle", str4);
        this.A0I = str4;
        String str5 = n2s.A0J;
        C1pq.A08("stickerId", str5);
        this.A0J = str5;
        this.A0K = Collections.unmodifiableSet(n2s.A0K);
    }

    public InspirationMusicStickerInfo(Parcel parcel) {
        this.A0A = 7zU.A0l(parcel, this);
        this.A0B = parcel.readString();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        this.A03 = parcel.readInt();
        int i = 0;
        this.A0L = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0M = 1BM.A07(parcel);
        this.A0N = 1BM.A07(parcel);
        this.A0O = 1BM.A07(parcel);
        this.A0P = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A0E = parcel.readString();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A06 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        this.A07 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        this.A08 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        this.A09 = parcel.readInt() != 0 ? (InspirationOverlayPosition) InspirationOverlayPosition.CREATOR.createFromParcel(parcel) : inspirationOverlayPosition;
        this.A00 = parcel.readDouble();
        this.A0I = parcel.readString();
        this.A0J = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0K = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlayPosition A00() {
        if (this.A0K.contains("overlayPosition")) {
            return this.A09;
        }
        if (A0Q == null) {
            synchronized (this) {
                if (A0Q == null) {
                    A0Q = new InspirationOverlayPosition(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A0Q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationMusicStickerInfo)) {
                return false;
            }
            InspirationMusicStickerInfo inspirationMusicStickerInfo = (InspirationMusicStickerInfo) obj;
            if (!11T.A0O(this.A0A, inspirationMusicStickerInfo.A0A) || !11T.A0O(this.A0B, inspirationMusicStickerInfo.A0B) || this.A01 != inspirationMusicStickerInfo.A01 || this.A02 != inspirationMusicStickerInfo.A02 || !11T.A0O(this.A0C, inspirationMusicStickerInfo.A0C) || this.A03 != inspirationMusicStickerInfo.A03 || this.A0L != inspirationMusicStickerInfo.A0L || this.A0M != inspirationMusicStickerInfo.A0M || this.A0N != inspirationMusicStickerInfo.A0N || this.A0O != inspirationMusicStickerInfo.A0O || this.A0P != inspirationMusicStickerInfo.A0P || !11T.A0O(this.A0D, inspirationMusicStickerInfo.A0D) || !11T.A0O(this.A0E, inspirationMusicStickerInfo.A0E) || this.A04 != inspirationMusicStickerInfo.A04 || this.A05 != inspirationMusicStickerInfo.A05 || this.A06 != inspirationMusicStickerInfo.A06 || !11T.A0O(this.A0F, inspirationMusicStickerInfo.A0F) || this.A07 != inspirationMusicStickerInfo.A07 || !11T.A0O(this.A0G, inspirationMusicStickerInfo.A0G) || this.A08 != inspirationMusicStickerInfo.A08 || !11T.A0O(this.A0H, inspirationMusicStickerInfo.A0H) || !11T.A0O(A00(), inspirationMusicStickerInfo.A00()) || this.A00 != inspirationMusicStickerInfo.A00 || !11T.A0O(this.A0I, inspirationMusicStickerInfo.A0I) || !11T.A0O(this.A0J, inspirationMusicStickerInfo.A0J)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A00(this.A00, C1pq.A04(A00(), C1pq.A04(this.A0H, (C1pq.A04(this.A0G, (C1pq.A04(this.A0F, (((((C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((C1pq.A04(this.A0C, (((C1pq.A04(this.A0B, C1pq.A03(this.A0A)) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03, this.A0L), this.A0M), this.A0N), this.A0O), this.A0P))) * 31) + this.A04) * 31) + this.A05) * 31) + this.A06) * 31) + this.A07) * 31) + this.A08)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        1BL.A13(parcel, this.A0C);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        1BL.A13(parcel, this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        1BL.A13(parcel, this.A0F);
        parcel.writeInt(this.A07);
        1BL.A13(parcel, this.A0G);
        parcel.writeInt(this.A08);
        1BL.A13(parcel, this.A0H);
        DKH.A0z(parcel, this.A09, i);
        parcel.writeDouble(this.A00);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        Iterator A0S = C3o5.A0S(parcel, this.A0K);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
