package com.facebook.messaging.model.attachment;

import X.2Go;
import X.48O;
import X.48P;
import X.C4Ny;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: Attachment.class */
public final class Attachment implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(10);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final 48P A04;
    public final AudioData A05;
    public final EphemeralMediaData A06;
    public final ImageData A07;
    public final VideoData A08;
    public final ImmutableMap A09;
    public final Integer A0A;
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
    public final boolean A0O;
    public final boolean A0P;
    public final byte[] A0Q;

    public Attachment(48O r302) {
        this.A0I = r302.A0P;
        this.A0K = r302.A0Q;
        this.A0F = r302.A0E;
        this.A0L = r302.A0I;
        this.A0G = r302.A0F;
        this.A00 = r302.A00;
        this.A07 = r302.A07;
        this.A08 = r302.A08;
        this.A05 = r302.A05;
        this.A0C = r302.A0B;
        this.A0Q = r302.A0O;
        this.A0J = r302.A0H;
        Map map = r302.A0L;
        this.A09 = ImmutableMap.copyOf(map == null ? new HashMap() : map);
        this.A02 = r302.A02;
        this.A06 = r302.A06;
        this.A04 = r302.A04;
        this.A01 = r302.A01;
        this.A0E = r302.A0D;
        this.A0M = r302.A0J;
        this.A03 = r302.A03;
        this.A0N = r302.A0K;
        this.A0P = r302.A0N;
        this.A0B = r302.A0A;
        this.A0D = r302.A0C;
        this.A0H = r302.A0G;
        this.A0A = r302.A09;
        this.A0O = r302.A0M;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Attachment(android.os.Parcel r302) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.attachment.Attachment.<init>(android.os.Parcel):void");
    }

    public boolean A00() {
        ImmutableMap immutableMap = this.A09;
        if (immutableMap == null) {
            return false;
        }
        return ConstantsKt.CAMERA_ID_BACK.equals(immutableMap.get("is_preview"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Attachment attachment = (Attachment) obj;
            if (this.A00 == attachment.A00) {
                String str = this.A0I;
                String str2 = attachment.A0I;
                if (str == null ? str2 == null : str.equals(str2)) {
                    String str3 = this.A0K;
                    String str4 = attachment.A0K;
                    if (str3 == null ? str4 == null : str3.equals(str4)) {
                        String str5 = this.A0F;
                        String str6 = attachment.A0F;
                        if (str5 == null ? str6 == null : str5.equals(str6)) {
                            String str7 = this.A0L;
                            String str8 = attachment.A0L;
                            if (str7 == null ? str8 == null : str7.equals(str8)) {
                                String str9 = this.A0G;
                                String str10 = attachment.A0G;
                                if (str9 == null ? str10 == null : str9.equals(str10)) {
                                    ImageData imageData = this.A07;
                                    ImageData imageData2 = attachment.A07;
                                    if (imageData == null ? imageData2 == null : imageData.equals(imageData2)) {
                                        VideoData videoData = this.A08;
                                        VideoData videoData2 = attachment.A08;
                                        if (videoData == null ? videoData2 == null : videoData.equals(videoData2)) {
                                            AudioData audioData = this.A05;
                                            AudioData audioData2 = attachment.A05;
                                            if (audioData == null ? audioData2 == null : audioData.equals(audioData2)) {
                                                String str11 = this.A0C;
                                                String str12 = attachment.A0C;
                                                if (str11 == null ? str12 == null : str11.equals(str12)) {
                                                    if (Arrays.equals(this.A0Q, attachment.A0Q) && 2Go.A00(this.A0H, attachment.A0H) && 2Go.A00(this.A0A, attachment.A0A)) {
                                                        String str13 = this.A0J;
                                                        String str14 = attachment.A0J;
                                                        if (str13 == null ? str14 == null : str13.equals(str14)) {
                                                            if (Objects.equal(this.A06, attachment.A06) && Objects.equal(this.A04, attachment.A04) && this.A01 == attachment.A01 && Objects.equal(this.A0E, attachment.A0E) && Objects.equal(this.A0M, attachment.A0M) && this.A03 == attachment.A03 && Objects.equal(this.A0N, attachment.A0N) && this.A0P == attachment.A0P && this.A0B == attachment.A0B && this.A0O == attachment.A0O && Objects.equal(this.A0D, attachment.A0D)) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.A0I;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.A0K;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A0F;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.A0L;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.A0G;
        int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.A00) * 31;
        ImageData imageData = this.A07;
        int hashCode6 = (hashCode5 + (imageData != null ? imageData.hashCode() : 0)) * 31;
        VideoData videoData = this.A08;
        int hashCode7 = (hashCode6 + (videoData != null ? videoData.hashCode() : 0)) * 31;
        AudioData audioData = this.A05;
        int hashCode8 = (hashCode7 + (audioData != null ? audioData.hashCode() : 0)) * 31;
        String str6 = this.A0C;
        int hashCode9 = (((hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31) + Arrays.hashCode(this.A0Q)) * 31;
        String str7 = this.A0J;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        EphemeralMediaData ephemeralMediaData = this.A06;
        int hashCode11 = (hashCode10 + (ephemeralMediaData != null ? ephemeralMediaData.hashCode() : 0)) * 31;
        48P r0 = this.A04;
        int hashCode12 = (hashCode11 + (r0 != null ? r0.hashCode() : 0)) * 31;
        long j = this.A01;
        int i2 = (hashCode12 + ((int) (j ^ (j >>> 32)))) * 31;
        String str8 = this.A0E;
        int hashCode13 = (i2 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.A0M;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31;
        long j2 = this.A03;
        int i3 = (hashCode14 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str10 = this.A0N;
        int hashCode15 = (((i3 + (str10 != null ? str10.hashCode() : 0)) * 31) + (this.A0P ? 1 : 0)) * 31;
        String str11 = this.A0B;
        int hashCode16 = (hashCode15 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.A0D;
        int hashCode17 = (hashCode16 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Integer num = this.A0A;
        int hashCode18 = (hashCode17 + (num != null ? num.hashCode() : 0)) * 31;
        String str13 = this.A0H;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return ((hashCode18 + i) * 31) + (this.A0O ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0C);
        parcel.writeValue(this.A0Q);
        parcel.writeString(this.A0J);
        parcel.writeMap(this.A09);
        parcel.writeLong(this.A02);
        parcel.writeParcelable(this.A06, i);
        48P r0 = this.A04;
        parcel.writeInt(r0 != null ? r0.value : 0);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0M);
        parcel.writeLong(this.A03);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        C53v.A0K(parcel, this.A0A);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A0O ? 1 : 0);
    }
}
