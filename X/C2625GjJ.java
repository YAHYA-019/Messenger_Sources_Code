package X;

import java.util.Arrays;

/* renamed from: X.GjJ, reason: case insensitive filesystem */
/* loaded from: GjJ.class */
public final class C2625GjJ extends C04v {
    public int A00 = -1;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Boolean A04;
    public final Integer A05;
    public final Long A06;
    public final Long A07;
    public final Long A08;
    public final Long A09;
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
    public final boolean A0K;
    public final byte[] A0L;
    public final byte[] A0M;
    public final byte[] A0N;
    public final byte[] A0O;

    public C2625GjJ(Boolean bool, Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2, long j, boolean z) {
        this.A03 = j;
        this.A0N = bArr;
        this.A0L = bArr2;
        this.A0M = bArr3;
        this.A07 = l;
        this.A0A = str;
        this.A05 = num;
        this.A0O = bArr4;
        this.A0I = str2;
        this.A0H = str3;
        this.A0G = str4;
        this.A09 = l2;
        this.A01 = i;
        this.A0D = str5;
        this.A02 = i2;
        this.A08 = l3;
        this.A0K = z;
        this.A0E = str6;
        this.A0F = str7;
        this.A04 = bool;
        this.A0B = str8;
        this.A06 = l4;
        this.A0C = str9;
        this.A0J = str10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2625GjJ)) {
                return false;
            }
            C2625GjJ c2625GjJ = (C2625GjJ) obj;
            if (this.A03 != c2625GjJ.A03 || !11T.A0O(this.A0N, c2625GjJ.A0N) || !11T.A0O(this.A0L, c2625GjJ.A0L) || !11T.A0O(this.A0M, c2625GjJ.A0M) || !11T.A0O(this.A07, c2625GjJ.A07) || !11T.A0O(this.A0A, c2625GjJ.A0A) || !11T.A0O(this.A05, c2625GjJ.A05) || !11T.A0O(this.A0O, c2625GjJ.A0O) || !11T.A0O(this.A0I, c2625GjJ.A0I) || !11T.A0O(this.A0H, c2625GjJ.A0H) || !11T.A0O(this.A0G, c2625GjJ.A0G) || !11T.A0O(this.A09, c2625GjJ.A09) || this.A01 != c2625GjJ.A01 || !11T.A0O(this.A0D, c2625GjJ.A0D) || this.A02 != c2625GjJ.A02 || !11T.A0O(this.A08, c2625GjJ.A08) || this.A0K != c2625GjJ.A0K || !11T.A0O(this.A0E, c2625GjJ.A0E) || !11T.A0O(this.A0F, c2625GjJ.A0F) || !11T.A0O(this.A04, c2625GjJ.A04) || !11T.A0O(this.A0B, c2625GjJ.A0B) || !11T.A0O(this.A06, c2625GjJ.A06) || !11T.A0O(this.A0C, c2625GjJ.A0C) || !11T.A0O(this.A0J, c2625GjJ.A0J) || this.A00 != c2625GjJ.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = 7zQ.A02(this.A03);
        byte[] bArr = this.A0N;
        int hashCode = (A02 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.A0L;
        int hashCode2 = (hashCode + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.A0M;
        int hashCode3 = (((((((hashCode2 + (bArr3 == null ? 0 : Arrays.hashCode(bArr3))) * 31) + AnonymousClass001.A02(this.A07)) * 31) + 1BL.A05(this.A0A)) * 31) + AnonymousClass001.A02(this.A05)) * 31;
        byte[] bArr4 = this.A0O;
        return ((((((((((AnonymousClass002.A07(this.A0F, (((((((((((((((((((((hashCode3 + (bArr4 == null ? 0 : Arrays.hashCode(bArr4))) * 31) + 1BL.A05(this.A0I)) * 31) + 1BL.A05(this.A0H)) * 31) + 1BL.A05(this.A0G)) * 31) + AnonymousClass001.A02(this.A09)) * 31) + this.A01) * 31) + 1BL.A05(this.A0D)) * 31) + this.A02) * 31) + AnonymousClass001.A02(this.A08)) * 31) + AnonymousClass002.A00(this.A0K ? 1 : 0)) * 31) + 1BL.A05(this.A0E)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 1BL.A05(this.A0B)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + 1BL.A05(this.A0C)) * 31) + 7zN.A05(this.A0J)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("messagePk: ");
        A0k.append(this.A03);
        A0k.append(", plainTextHash: ");
        byte[] bArr = this.A0N;
        String str = null;
        A0k.append(bArr != null ? DKC.A1B(bArr, 11) : null);
        A0k.append(", fileEncSha256: ");
        byte[] bArr2 = this.A0L;
        A0k.append(bArr2 != null ? DKC.A1B(bArr2, 11) : null);
        A0k.append(", mediaKey: ");
        byte[] bArr3 = this.A0M;
        A0k.append(bArr3 != null ? DKC.A1B(bArr3, 11) : null);
        A0k.append(", mediaKeyTimestamp: ");
        A0k.append(this.A07);
        A0k.append(", directPath: ");
        A0k.append(this.A0A);
        A0k.append(", mediaType: ");
        A0k.append(this.A05);
        A0k.append(", sideCar: ");
        byte[] bArr4 = this.A0O;
        if (bArr4 != null) {
            str = DKC.A1B(bArr4, 11);
        }
        A0k.append(str);
        A0k.append(", scanLengths: ");
        A0k.append(this.A0I);
        A0k.append(", receiverFetchId: ");
        A0k.append(this.A0H);
        A0k.append(", receiverFetchCdnUrl: ");
        A0k.append(this.A0G);
        A0k.append(", receiverFetchCdnUrlExpirationTimestamp: ");
        A0k.append(this.A09);
        A0k.append(", contentType: ");
        A0k.append(this.A01);
        A0k.append(", mimeType: ");
        A0k.append(this.A0D);
        A0k.append(", mcdAttachmentType: ");
        A0k.append(this.A02);
        A0k.append(", messageAgeMs: ");
        A0k.append(this.A08);
        A0k.append(", isLegacyAttachment: ");
        A0k.append(this.A0K);
        A0k.append(", persistedPath: ");
        A0k.append(this.A0E);
        A0k.append(", persistentId: ");
        A0k.append(this.A0F);
        A0k.append(", hasCutoverMessage: ");
        A0k.append(this.A04);
        A0k.append(", legacyAttachmentCdnUri: ");
        A0k.append(this.A0B);
        A0k.append(", legacyAttachmentCdnUriExpirationTimestampMs: ");
        A0k.append(this.A06);
        A0k.append(", legacyAttachmentFallbackUri: ");
        A0k.append(this.A0C);
        A0k.append(", stickerCdnUrl: ");
        A0k.append(this.A0J);
        A0k.append("scanRangeLength: ");
        return GOn.A1B(A0k, this.A00);
    }
}
