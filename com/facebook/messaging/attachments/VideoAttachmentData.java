package com.facebook.messaging.attachments;

import X.0CO;
import X.1BK;
import X.1BL;
import X.4YV;
import X.6AB;
import X.6AC;
import X.82M;
import X.AnonymousClass001;
import X.C0Aj;
import X.C48g;
import X.C53v;
import X.C61u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.engine.api.VideoDataSource;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: VideoAttachmentData.class */
public final class VideoAttachmentData implements Parcelable, C61u {
    public static final Parcelable.Creator CREATOR = new 82M(14);
    public Integer A00;
    public String A01;
    public final int A02;
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
    public final Uri A0D;
    public final Uri A0E;
    public final Uri A0F;
    public final 6AC A0G;
    public final C48g A0H;
    public final MediaResource A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final List A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public VideoAttachmentData(Uri uri, Uri uri2, Uri uri3, 6AC r305, C48g c48g, MediaResource mediaResource, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2) {
        this.A0C = i11;
        this.A08 = i7;
        this.A0A = i9;
        this.A04 = i3;
        this.A09 = i8;
        this.A06 = i5;
        this.A0O = list;
        this.A0F = uri3;
        this.A0E = uri2;
        this.A0M = str5;
        this.A0H = c48g;
        this.A0K = str2;
        this.A0I = mediaResource;
        this.A0B = i10;
        this.A05 = i4;
        this.A0G = r305;
        this.A0P = z;
        this.A0J = str;
        this.A0L = str4;
        this.A0N = str6;
        this.A03 = i2;
        this.A07 = i6;
        this.A02 = i;
        this.A0D = uri;
        this.A0Q = z2;
        this.A01 = str3;
        this.A00 = num;
    }

    public VideoAttachmentData(Parcel parcel) {
        this.A0C = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A0O = 4YV.A0y(parcel, VideoDataSource.class);
        this.A0F = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A0E = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A0M = parcel.readString();
        this.A0H = C48g.valueOf(parcel.readString());
        this.A0K = parcel.readString();
        this.A0I = (MediaResource) 1BL.A0C(parcel, MediaResource.class);
        this.A0B = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0G = parcel.readSerializable();
        boolean z = false;
        this.A0P = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0J = parcel.readString();
        this.A0L = parcel.readString();
        this.A0N = parcel.readString();
        this.A03 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A0D = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A0Q = parcel.readInt() == 1 ? true : z;
        this.A00 = C53v.A08(parcel);
        this.A01 = parcel.readString();
    }

    public VideoDataSource A00() {
        List<VideoDataSource> list = this.A0O;
        VideoDataSource videoDataSource = null;
        if (list != null && !list.isEmpty()) {
            for (VideoDataSource videoDataSource2 : list) {
                if (videoDataSource2.A04 == 6AB.A03) {
                    Uri uri = videoDataSource2.A03;
                    if (0CO.A03(uri)) {
                        if (new File(uri.getPath()).exists()) {
                            return videoDataSource2;
                        }
                    }
                }
                if (videoDataSource == null) {
                    videoDataSource = videoDataSource2;
                }
            }
            if (videoDataSource == null) {
                videoDataSource = (VideoDataSource) 1BK.A0r(list);
            }
        }
        return videoDataSource;
    }

    @Override // X.C61u
    public boolean BRl() {
        if (this.A0G == 6AC.A01) {
            return false;
        }
        Iterator it = this.A0O.iterator();
        while (it.hasNext()) {
            Uri uri = ((VideoDataSource) it.next()).A03;
            if (C0Aj.A05(uri) || (this.A0J != null && 0CO.A02(uri))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A06);
        parcel.writeList(this.A0O);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeParcelable(this.A0E, i);
        parcel.writeString(this.A0M);
        1BL.A12(parcel, this.A0H);
        parcel.writeString(this.A0K);
        parcel.writeParcelable(this.A0I, i);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A05);
        parcel.writeSerializable(this.A0G);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A02);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeInt(this.A0Q ? 1 : 0);
        C53v.A0K(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
