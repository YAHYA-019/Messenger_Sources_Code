package X;

import android.media.CamcorderProfile;
import java.io.FileDescriptor;

/* loaded from: I2t.class */
public final class I2t {
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public I50 A0A;
    public FileDescriptor A0B;
    public FileDescriptor A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public boolean A0I = true;
    public int A00 = 0;
    public int A05 = 0;

    public I2t(FileDescriptor fileDescriptor, String str, int i, int i2, int i3, int i4) {
        long j = -1;
        this.A06 = j;
        this.A07 = j;
        this.A08 = j;
        this.A09 = j;
        if (str == null && fileDescriptor == null) {
            throw AnonymousClass001.A0L("Both file path or file descriptor must be not be null, one must be set.");
        }
        if (i == 0) {
            throw AnonymousClass001.A0L("Frame width must be greater 0");
        }
        if (i2 == 0) {
            throw AnonymousClass001.A0L("Frame height must be greater 0");
        }
        this.A0G = str;
        this.A0B = fileDescriptor;
        this.A0H = null;
        this.A0C = null;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A01 = i4;
    }

    public static void A00(CamcorderProfile camcorderProfile, I2t i2t, HXD hxd, int i) {
        i2t.A01(hxd, Integer.valueOf(i));
        i2t.A01(I50.A0Z, Integer.valueOf(camcorderProfile.videoCodec));
    }

    public void A01(HXD hxd, Object obj) {
        switch (hxd.A00) {
            case 6:
                this.A0I = AnonymousClass001.A1V(obj);
                return;
            case 7:
                this.A00 = AnonymousClass001.A03(obj);
                return;
            case 8:
                this.A05 = AnonymousClass001.A03(obj);
                return;
            case 9:
                this.A0D = (Integer) obj;
                return;
            case 10:
                this.A0E = (Integer) obj;
                return;
            case 11:
                this.A0F = (Integer) obj;
                return;
            case 12:
                this.A06 = AnonymousClass001.A05(obj);
                return;
            case 13:
                this.A07 = AnonymousClass001.A05(obj);
                return;
            case 14:
                this.A08 = AnonymousClass001.A05(obj);
                return;
            case 15:
                this.A09 = AnonymousClass001.A05(obj);
                return;
            default:
                this.A0A = (I50) obj;
                return;
        }
    }
}
