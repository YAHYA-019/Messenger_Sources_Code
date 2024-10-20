package X;

import java.util.UUID;

/* loaded from: Ktr.class */
public final class Ktr {
    public final KtJ A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final UUID A0B;

    public Ktr(KtJ ktJ, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, UUID uuid) {
        11T.A0F(uuid, 1);
        this.A0B = uuid;
        this.A00 = ktJ;
        this.A01 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A09 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A02 = str7;
        this.A05 = str8;
        this.A08 = str9;
        this.A0A = str10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ktr)) {
                return false;
            }
            Ktr ktr = (Ktr) obj;
            if (!11T.A0O(this.A0B, ktr.A0B) || !11T.A0O(this.A00, ktr.A00) || !11T.A0O(this.A01, ktr.A01) || !11T.A0O(this.A07, ktr.A07) || !11T.A0O(this.A06, ktr.A06) || !11T.A0O(this.A09, ktr.A09) || !11T.A0O(this.A03, ktr.A03) || !11T.A0O(this.A04, ktr.A04) || !11T.A0O(this.A02, ktr.A02) || !11T.A0O(this.A05, ktr.A05) || !11T.A0O(this.A08, ktr.A08) || !11T.A0O(this.A0A, ktr.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((1BL.A03(this.A0B) + AnonymousClass001.A02(this.A00)) * 31) + 1BL.A05(this.A01)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A08)) * 31) + 7zN.A05(this.A0A);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LinkedDeviceConfig(serviceUUID=");
        A0k.append(this.A0B);
        A0k.append(", linkSecurity=");
        A0k.append(this.A00);
        A0k.append(", BtcAddress=");
        A0k.append(this.A01);
        A0k.append(", firmwareVersion=");
        A0k.append(this.A07);
        A0k.append(", deviceSerial=");
        A0k.append(this.A06);
        A0k.append(", ipAddress=");
        A0k.append(this.A09);
        A0k.append(", deviceImageAssetURI=");
        A0k.append(this.A03);
        A0k.append(", deviceModelName=");
        A0k.append(this.A04);
        A0k.append(", buildFlavor=");
        A0k.append(this.A02);
        A0k.append(", deviceName=");
        A0k.append(this.A05);
        A0k.append(", hardwareType=");
        A0k.append(this.A08);
        A0k.append(", macAddress=");
        return DKH.A0o(this.A0A, A0k);
    }
}
