package com.facebook.video.engine.api;

import X.11T;
import X.1BL;
import X.6A8;
import X.6A9;
import X.6AA;
import X.6AB;
import X.6TX;
import X.82N;
import X.AnonymousClass001;
import X.AnonymousClass002;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.video.heroplayer.ipc.VideoProtocolProps;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: VideoDataSource.class */
public final class VideoDataSource implements Parcelable, 6A8 {
    public static final RectF A09 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public static final ImmutableList A0A = ImmutableList.of((Object) "_nc_rl", (Object) "oh");
    public static final Parcelable.Creator CREATOR = new 82N(16);
    public final RectF A00;
    public final Uri A01;
    public final Uri A02;
    public final Uri A03;
    public final 6AB A04;
    public final 6AA A05;
    public final VideoProtocolProps A06;
    public final String A07;
    public final String A08;

    public VideoDataSource(6A9 r302) {
        this.A03 = r302.A03;
        this.A02 = r302.A02;
        this.A01 = r302.A01;
        this.A08 = r302.A08;
        this.A07 = r302.A07;
        this.A04 = r302.A04;
        this.A00 = r302.A00;
        this.A05 = r302.A05;
        this.A06 = r302.A06;
    }

    public VideoDataSource(Parcel parcel) {
        VideoProtocolProps videoProtocolProps = null;
        this.A03 = (Uri) parcel.readParcelable(null);
        this.A02 = (Uri) parcel.readParcelable(null);
        this.A01 = (Uri) parcel.readParcelable(null);
        this.A07 = parcel.readString();
        String readString = parcel.readString();
        readString = readString == null ? 6AB.A06.value : readString;
        11T.A0D(readString);
        this.A04 = 6AB.valueOf(readString);
        this.A00 = (RectF) 1BL.A0C(parcel, RectF.class);
        this.A05 = (6AA) 6AA.A00.get(parcel.readInt());
        this.A06 = parcel.readByte() != 1 ? (VideoProtocolProps) VideoProtocolProps.CREATOR.createFromParcel(parcel) : videoProtocolProps;
        this.A08 = parcel.readString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (X.11T.A0O(r301.A07, ((com.facebook.video.engine.api.VideoDataSource) r302).A07) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02bc, code lost:
    
        if (X.11T.A0O(r312, r311) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0354, code lost:
    
        if (r0 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f3, code lost:
    
        if (r0 == null) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(com.facebook.video.engine.api.VideoDataSource r301, java.lang.Object r302, java.util.Set r303, boolean r304, boolean r305, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.engine.api.VideoDataSource.A00(com.facebook.video.engine.api.VideoDataSource, java.lang.Object, java.util.Set, boolean, boolean, boolean, boolean):boolean");
    }

    public void CgE(6TX r302) {
        11T.A0F(r302, 0);
        Uri uri = this.A03;
        if (uri != null) {
            r302.A04("VideoDataSource", "videoUri", uri.toString());
        }
        Uri uri2 = this.A02;
        if (uri2 != null) {
            r302.A04("VideoDataSource", "videoHdUri", uri2.toString());
        }
        Uri uri3 = this.A01;
        if (uri3 != null) {
            r302.A04("VideoDataSource", "captionsUri", uri3.toString());
        }
        String str = this.A07;
        if (str != null) {
            r302.A04("VideoDataSource", "abrManifestContent", str);
        }
        6AB r0 = this.A04;
        if (r0 != null) {
            r302.A04("VideoDataSource", "streamSourceType", r0.toString());
        }
        RectF rectF = this.A00;
        if (rectF != null) {
            r302.A04("VideoDataSource", "cropRectangle", rectF.toString());
        }
        6AA r02 = this.A05;
        if (r02 != null) {
            r302.A04("VideoDataSource", "videoMirroringMode", r02.toString());
        }
        VideoProtocolProps videoProtocolProps = this.A06;
        if (videoProtocolProps != null) {
            r302.A04("VideoDataSource", "videoProtocolProps", videoProtocolProps.toString());
        }
        String str2 = this.A08;
        if (str2 != null) {
            r302.A04("VideoDataSource", "impSpec", str2);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return A00(this, obj, null, true, true, false, false);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, this.A01, this.A07, this.A04, this.A00, this.A05, this.A06, this.A08});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A03);
        A0k.append(" (");
        return AnonymousClass002.A0K(this.A04, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A07);
        6AB r0 = this.A04;
        11T.A0D(r0);
        1BL.A12(parcel, r0);
        parcel.writeParcelable(this.A00, i);
        6AA r02 = this.A05;
        11T.A0D(r02);
        parcel.writeInt(r02.ordinal());
        VideoProtocolProps videoProtocolProps = this.A06;
        if (videoProtocolProps == null) {
            parcel.writeByte((byte) 1);
        } else {
            parcel.writeByte((byte) 0);
            videoProtocolProps.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
    }
}
