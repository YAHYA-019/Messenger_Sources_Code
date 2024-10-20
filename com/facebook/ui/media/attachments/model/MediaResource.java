package com.facebook.ui.media.attachments.model;

import X.0OO;
import X.5HP;
import X.82N;
import X.C53v;
import X.C5en;
import X.C5ep;
import X.C5eq;
import X.C5es;
import X.C5ev;
import X.C5ew;
import X.J4g;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.audio.transcriptions.model.MessageTranscription;
import com.facebook.messaging.memories.share.MemoryShareMetadata;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.presence.note.music.musicpicker.model.MusicData;
import com.facebook.spherical.photo.metadata.SphericalPhotoMetadata;
import com.facebook.ui.media.attachments.model.music.MusicMetaData;
import com.facebook.ui.media.attachments.source.MediaResourceCameraPosition;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.facebook.xapp.messaging.threadview.model.audio.WaveformData;
import com.facebook.xapp.messaging.threadview.model.highlightstab.HighlightsTabMetadata;
import com.google.common.base.Objects;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* loaded from: MediaResource.class */
public final class MediaResource implements Parcelable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final RectF A0A;
    public final Uri A0B;
    public final Uri A0C;
    public final Uri A0D;
    public final Uri A0E;
    public final 0OO A0F;
    public final MessageTranscription A0G;
    public final MemoryShareMetadata A0H;
    public final ContentAppAttribution A0I;
    public final ThreadKey A0J;
    public final MusicData A0K;
    public final SphericalPhotoMetadata A0L;
    public final AnimatedMediaPreprocessData A0M;
    public final C5eq A0N;
    public final C5ep A0O;
    public final C5ew A0P;
    public final 5HP A0Q;
    public final MediaResource A0R;
    public final MediaUploadResult A0S;
    public final ProgressiveJpegResult A0T;
    public final MusicMetaData A0U;
    public final MediaResourceCameraPosition A0V;
    public final MediaResourceSendSource A0W;
    public final WaveformData A0X;
    public final HighlightsTabMetadata A0Y;
    public final ImmutableMap A0Z;
    public final Float A0a;
    public final Integer A0b;
    public final Integer A0c;
    public final Integer A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final String A0o;
    public final String A0p;
    public final String A0q;
    public final String A0r;
    public final String A0s;
    public final String A0t;
    public final String A0u;
    public final String A0v;
    public final String A0w;
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
    public static final Comparator A19 = new J4g(0);
    public static final RectF A18 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public static final Parcelable.Creator CREATOR = new 82N(10);

    public MediaResource(C5en c5en) {
        Uri uri = c5en.A0E;
        uri.getClass();
        this.A0E = uri;
        5HP r0 = c5en.A0P;
        r0.getClass();
        this.A0Q = r0;
        C5ep c5ep = c5en.A0N;
        c5ep.getClass();
        this.A0O = c5ep;
        this.A0c = c5en.A0a;
        this.A0q = c5en.A0o;
        this.A0p = c5en.A0n;
        this.A0f = c5en.A0d;
        this.A0g = c5en.A0e;
        this.A0N = c5en.A0M;
        this.A0D = c5en.A0D;
        this.A0T = c5en.A0S;
        this.A09 = c5en.A09;
        this.A0R = c5en.A0Q;
        this.A08 = c5en.A08;
        this.A04 = c5en.A04;
        this.A00 = c5en.A00;
        this.A0F = c5en.A0F;
        this.A03 = c5en.A03;
        this.A0z = c5en.A0y;
        this.A0C = c5en.A0C;
        this.A0d = c5en.A0b;
        this.A0u = c5en.A0s;
        this.A0t = c5en.A0r;
        this.A0J = c5en.A0J;
        this.A0s = c5en.A0q;
        this.A07 = c5en.A07;
        this.A0A = c5en.A0A;
        this.A10 = c5en.A0z;
        this.A17 = c5en.A16;
        this.A02 = c5en.A02;
        this.A01 = c5en.A01;
        this.A0S = c5en.A0R;
        this.A0x = c5en.A0w;
        Map map = c5en.A0v;
        this.A0Z = map == null ? RegularImmutableMap.A03 : ImmutableMap.copyOf(map);
        this.A0I = c5en.A0I;
        this.A0B = c5en.A0B;
        this.A12 = c5en.A11;
        this.A06 = c5en.A06;
        this.A05 = c5en.A05;
        this.A14 = c5en.A13;
        this.A13 = c5en.A12;
        this.A0i = c5en.A0g;
        this.A0l = c5en.A0j;
        this.A0W = c5en.A0V;
        this.A0V = c5en.A0U;
        this.A0j = c5en.A0h;
        this.A0P = c5en.A0O;
        this.A0L = c5en.A0K;
        this.A0K = null;
        this.A16 = c5en.A15;
        this.A0v = c5en.A0t;
        this.A0h = c5en.A0f;
        this.A0r = c5en.A0p;
        this.A0n = c5en.A0l;
        this.A0m = c5en.A0k;
        this.A0M = c5en.A0L;
        this.A0U = c5en.A0T;
        this.A0X = c5en.A0W;
        this.A0b = c5en.A0Z;
        this.A0w = c5en.A0u;
        this.A0G = c5en.A0G;
        this.A0e = c5en.A0c;
        this.A0o = c5en.A0m;
        this.A0y = c5en.A0x;
        this.A11 = c5en.A10;
        this.A15 = c5en.A14;
        this.A0a = c5en.A0Y;
        this.A0H = c5en.A0H;
        this.A0Y = c5en.A0X;
        this.A0k = c5en.A0i;
    }

    public MediaResource(Parcel parcel) {
        C5ev c5ev;
        MediaResourceCameraPosition mediaResourceCameraPosition;
        this.A0E = (Uri) parcel.readParcelable(null);
        this.A0Q = 5HP.valueOf(parcel.readString());
        this.A0O = C5ep.values()[parcel.readInt()];
        this.A0c = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.A0q = parcel.readString();
        this.A0p = parcel.readString();
        this.A0f = parcel.readString();
        this.A0g = parcel.readString();
        this.A0N = C5eq.values()[parcel.readInt()];
        this.A0D = (Uri) parcel.readParcelable(null);
        this.A09 = parcel.readLong();
        this.A0R = (MediaResource) parcel.readParcelable(MediaResource.class.getClassLoader());
        this.A08 = parcel.readLong();
        this.A04 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A0F = parcel.readSerializable();
        this.A03 = parcel.readInt();
        boolean z = true;
        this.A0z = parcel.readInt() != 0;
        this.A0C = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.A0d = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.A0T = (ProgressiveJpegResult) parcel.readParcelable(ProgressiveJpegResult.class.getClassLoader());
        this.A0u = parcel.readString();
        this.A0t = parcel.readString();
        this.A0J = (ThreadKey) parcel.readParcelable(ThreadKey.class.getClassLoader());
        this.A0s = parcel.readString();
        this.A07 = parcel.readLong();
        this.A0A = (RectF) parcel.readParcelable(null);
        this.A10 = C53v.A0S(parcel);
        this.A17 = parcel.readInt() == 0 ? false : z;
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0S = (MediaUploadResult) parcel.readParcelable(MediaUploadResult.class.getClassLoader());
        this.A0x = C53v.A0S(parcel);
        this.A0Z = ImmutableMap.copyOf((Map) parcel.readHashMap(null));
        this.A0I = (ContentAppAttribution) parcel.readParcelable(MediaResource.class.getClassLoader());
        this.A0B = (Uri) parcel.readParcelable(null);
        this.A12 = C53v.A0S(parcel);
        this.A06 = parcel.readLong();
        this.A05 = parcel.readLong();
        this.A14 = C53v.A0S(parcel);
        this.A13 = C53v.A0S(parcel);
        this.A0i = parcel.readString();
        this.A0l = parcel.readString();
        this.A0W = MediaResourceSendSource.A00(parcel.readString());
        String readString = parcel.readString();
        if (Platform.stringIsNullOrEmpty(readString)) {
            mediaResourceCameraPosition = MediaResourceCameraPosition.A01;
        } else {
            C5ev[] values = C5ev.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    c5ev = C5ev.UNKNOWN;
                    break;
                }
                c5ev = values[i];
                if (c5ev.analyticsName.equals(readString)) {
                    break;
                } else {
                    i++;
                }
            }
            mediaResourceCameraPosition = new MediaResourceCameraPosition(c5ev);
        }
        this.A0V = mediaResourceCameraPosition;
        this.A0j = parcel.readString();
        this.A0P = C5ew.valueOf(parcel.readString());
        this.A0L = (SphericalPhotoMetadata) parcel.readParcelable(SphericalPhotoMetadata.class.getClassLoader());
        this.A0K = (MusicData) parcel.readParcelable(MusicData.class.getClassLoader());
        this.A16 = C53v.A0S(parcel);
        this.A0v = parcel.readString();
        this.A0h = parcel.readString();
        this.A0r = parcel.readString();
        this.A0n = parcel.readString();
        this.A0m = parcel.readString();
        this.A0M = (AnimatedMediaPreprocessData) parcel.readParcelable(AnimatedMediaPreprocessData.class.getClassLoader());
        this.A0U = (MusicMetaData) parcel.readParcelable(MusicMetaData.class.getClassLoader());
        this.A0X = (WaveformData) parcel.readParcelable(WaveformData.class.getClassLoader());
        this.A0b = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.A0w = parcel.readString();
        this.A0G = (MessageTranscription) parcel.readParcelable(getClass().getClassLoader());
        this.A0e = parcel.readString();
        this.A0o = parcel.readString();
        this.A0y = C53v.A0S(parcel);
        this.A11 = C53v.A0S(parcel);
        this.A15 = C53v.A0S(parcel);
        this.A0a = parcel.readInt() == 1 ? Float.valueOf(parcel.readFloat()) : null;
        this.A0H = (MemoryShareMetadata) parcel.readParcelable(MemoryShareMetadata.class.getClassLoader());
        this.A0Y = (HighlightsTabMetadata) parcel.readParcelable(HighlightsTabMetadata.class.getClassLoader());
        this.A0k = parcel.readString();
    }

    public int A00() {
        long j = this.A08;
        int i = this.A02;
        long j2 = i >= 0 ? i : 0L;
        int i2 = this.A01;
        if (i2 >= 0) {
            j = i2;
        }
        return (int) Math.min(Math.max(0L, j - j2), j);
    }

    public String A01() {
        C5ep c5ep;
        MediaResourceSendSource mediaResourceSendSource = this.A0W;
        return (mediaResourceSendSource.A00 != C5es.A0p || (c5ep = this.A0O) == C5ep.A0R) ? mediaResourceSendSource.toString() : c5ep.DBSerialValue;
    }

    public final String A02() {
        MediaUploadResult mediaUploadResult = this.A0S;
        if (mediaUploadResult != null) {
            return mediaUploadResult.A0G;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if ("image/webp".equals(r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A0s
            r302 = r0
            java.lang.String r0 = "image/gif"
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L25
            java.lang.String r0 = "image/webp"
            r1 = r302
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L27
        L25:
            r0 = 1
            r304 = r0
        L27:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ui.media.attachments.model.MediaResource.A03():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof MediaResource)) {
            MediaResource mediaResource = (MediaResource) obj;
            if (Objects.equal(this.A0E, mediaResource.A0E) && Objects.equal(this.A0Q, mediaResource.A0Q) && Objects.equal(this.A0O, mediaResource.A0O) && Objects.equal(this.A0c, mediaResource.A0c) && Objects.equal(this.A0q, mediaResource.A0q) && Objects.equal(this.A0p, mediaResource.A0p) && Objects.equal(this.A0f, mediaResource.A0f) && Objects.equal(this.A0g, mediaResource.A0g) && Objects.equal(this.A0N, mediaResource.A0N) && Objects.equal(this.A0D, mediaResource.A0D) && Objects.equal(this.A0T, mediaResource.A0T) && Objects.equal(Long.valueOf(this.A09), Long.valueOf(mediaResource.A09)) && Objects.equal(this.A0R, mediaResource.A0R) && Objects.equal(Long.valueOf(this.A08), Long.valueOf(mediaResource.A08)) && Objects.equal(Integer.valueOf(this.A04), Integer.valueOf(mediaResource.A04)) && Objects.equal(Integer.valueOf(this.A00), Integer.valueOf(mediaResource.A00)) && Objects.equal(this.A0F, mediaResource.A0F) && Objects.equal(Integer.valueOf(this.A03), Integer.valueOf(mediaResource.A03)) && Objects.equal(Boolean.valueOf(this.A0z), Boolean.valueOf(mediaResource.A0z)) && Objects.equal(this.A0C, mediaResource.A0C) && Objects.equal(this.A0d, mediaResource.A0d) && Objects.equal(this.A0u, mediaResource.A0u) && Objects.equal(this.A0t, mediaResource.A0t) && Objects.equal(this.A0J, mediaResource.A0J) && Objects.equal(this.A0s, mediaResource.A0s) && Objects.equal(Long.valueOf(this.A07), Long.valueOf(mediaResource.A07)) && Objects.equal(this.A0A, mediaResource.A0A) && Objects.equal(Boolean.valueOf(this.A10), Boolean.valueOf(mediaResource.A10)) && Objects.equal(Boolean.valueOf(this.A17), Boolean.valueOf(mediaResource.A17)) && Objects.equal(Integer.valueOf(this.A02), Integer.valueOf(mediaResource.A02)) && Objects.equal(Integer.valueOf(this.A01), Integer.valueOf(mediaResource.A01)) && Objects.equal(this.A0S, mediaResource.A0S) && Objects.equal(Boolean.valueOf(this.A0x), Boolean.valueOf(mediaResource.A0x)) && Objects.equal(this.A0Z, mediaResource.A0Z) && Objects.equal(this.A0I, mediaResource.A0I) && Objects.equal(this.A0B, mediaResource.A0B) && Objects.equal(Boolean.valueOf(this.A12), Boolean.valueOf(mediaResource.A12)) && Objects.equal(Long.valueOf(this.A06), Long.valueOf(mediaResource.A06)) && Objects.equal(Long.valueOf(this.A05), Long.valueOf(mediaResource.A05)) && Objects.equal(Boolean.valueOf(this.A14), Boolean.valueOf(mediaResource.A14)) && Objects.equal(Boolean.valueOf(this.A13), Boolean.valueOf(mediaResource.A13)) && Objects.equal(this.A0i, mediaResource.A0i) && Objects.equal(this.A0l, mediaResource.A0l) && Objects.equal(this.A0W, mediaResource.A0W) && Objects.equal(this.A0V, mediaResource.A0V) && Objects.equal(this.A0j, mediaResource.A0j) && Objects.equal(this.A0P, mediaResource.A0P) && Objects.equal(this.A0L, mediaResource.A0L) && Objects.equal(this.A0K, mediaResource.A0K) && Objects.equal(Boolean.valueOf(this.A16), Boolean.valueOf(mediaResource.A16)) && Objects.equal(this.A0v, mediaResource.A0v) && Objects.equal(this.A0h, mediaResource.A0h) && Objects.equal(this.A0r, mediaResource.A0r) && Objects.equal(this.A0n, mediaResource.A0n) && Objects.equal(this.A0m, mediaResource.A0m) && Objects.equal(this.A0M, mediaResource.A0M) && Objects.equal(this.A0U, mediaResource.A0U) && Objects.equal(this.A0X, mediaResource.A0X) && Objects.equal(this.A0b, mediaResource.A0b) && Objects.equal(this.A0w, mediaResource.A0w) && Objects.equal(this.A0G, mediaResource.A0G) && Objects.equal(this.A0e, mediaResource.A0e) && Objects.equal(this.A0o, mediaResource.A0o) && Objects.equal(Boolean.valueOf(this.A0y), Boolean.valueOf(mediaResource.A0y)) && Objects.equal(Boolean.valueOf(this.A11), Boolean.valueOf(mediaResource.A11)) && Objects.equal(Boolean.valueOf(this.A15), Boolean.valueOf(mediaResource.A15)) && Objects.equal(this.A0a, mediaResource.A0a) && Objects.equal(this.A0H, mediaResource.A0H) && Objects.equal(this.A0Y, mediaResource.A0Y) && Objects.equal(this.A0k, mediaResource.A0k)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        Object[] objArr = new Object[70];
        System.arraycopy(new Object[]{this.A0E, this.A0Q, this.A0O, this.A0c, this.A0q, this.A0p, this.A0f, this.A0g, this.A0N, this.A0D, this.A0T, Long.valueOf(this.A09), this.A0R, Long.valueOf(this.A08), Integer.valueOf(this.A04), Integer.valueOf(this.A00), this.A0F, Integer.valueOf(this.A03), Boolean.valueOf(this.A0z), this.A0C, this.A0d, this.A0u, this.A0t, this.A0J, this.A0s, Long.valueOf(this.A07), this.A0A}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{Boolean.valueOf(this.A10), Boolean.valueOf(this.A17), Integer.valueOf(this.A02), Integer.valueOf(this.A01), this.A0S, Boolean.valueOf(this.A0x), this.A0Z, this.A0I, this.A0B, Boolean.valueOf(this.A12), Long.valueOf(this.A06), Long.valueOf(this.A05), Boolean.valueOf(this.A14), Boolean.valueOf(this.A13), this.A0i, this.A0l, this.A0W, this.A0V, this.A0j, this.A0P, this.A0L, this.A0K, Boolean.valueOf(this.A16), this.A0v, this.A0h, this.A0r, this.A0n}, 0, objArr, 27, 27);
        System.arraycopy(new Object[]{this.A0m, this.A0M, this.A0U, this.A0X, this.A0b, this.A0w, this.A0G, this.A0e, this.A0o, Boolean.valueOf(this.A0y), Boolean.valueOf(this.A11), Boolean.valueOf(this.A15), this.A0a, this.A0H, this.A0Y, this.A0k}, 0, objArr, 54, 16);
        return Arrays.hashCode(objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A0E, i);
        parcel.writeString(this.A0Q.name());
        parcel.writeInt(this.A0O.ordinal());
        parcel.writeValue(this.A0c);
        parcel.writeString(this.A0q);
        parcel.writeString(this.A0p);
        parcel.writeString(this.A0f);
        parcel.writeString(this.A0g);
        parcel.writeInt(this.A0N.ordinal());
        parcel.writeParcelable(this.A0D, i);
        parcel.writeLong(this.A09);
        parcel.writeParcelable(this.A0R, i);
        parcel.writeLong(this.A08);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeSerializable(this.A0F);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0z ? 1 : 0);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeValue(this.A0d);
        parcel.writeParcelable(this.A0T, i);
        parcel.writeString(this.A0u);
        parcel.writeString(this.A0t);
        parcel.writeParcelable(this.A0J, i);
        parcel.writeString(this.A0s);
        parcel.writeLong(this.A07);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeInt(this.A10 ? 1 : 0);
        parcel.writeInt(this.A17 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A0S, i);
        parcel.writeInt(this.A0x ? 1 : 0);
        parcel.writeMap(this.A0Z);
        parcel.writeParcelable(this.A0I, i);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeInt(this.A12 ? 1 : 0);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A14 ? 1 : 0);
        parcel.writeInt(this.A13 ? 1 : 0);
        parcel.writeString(this.A0i);
        parcel.writeString(this.A0l);
        parcel.writeString(this.A0W.toString());
        parcel.writeString(this.A0V.toString());
        parcel.writeString(this.A0j);
        parcel.writeString(this.A0P.name());
        parcel.writeParcelable(this.A0L, i);
        parcel.writeParcelable(this.A0K, i);
        parcel.writeInt(this.A16 ? 1 : 0);
        parcel.writeString(this.A0v);
        parcel.writeString(this.A0h);
        parcel.writeString(this.A0r);
        parcel.writeString(this.A0n);
        parcel.writeString(this.A0m);
        parcel.writeParcelable(this.A0M, i);
        parcel.writeParcelable(this.A0U, i);
        parcel.writeParcelable(this.A0X, i);
        parcel.writeValue(this.A0b);
        parcel.writeString(this.A0w);
        parcel.writeParcelable(this.A0G, i);
        parcel.writeString(this.A0e);
        parcel.writeString(this.A0o);
        parcel.writeInt(this.A0y ? 1 : 0);
        parcel.writeInt(this.A11 ? 1 : 0);
        parcel.writeInt(this.A15 ? 1 : 0);
        Float f = this.A0a;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeParcelable(this.A0H, i);
        parcel.writeParcelable(this.A0Y, i);
        parcel.writeString(this.A0k);
    }
}
