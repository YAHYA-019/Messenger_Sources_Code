package X;

import java.io.FileDescriptor;

/* loaded from: I50.class */
public final class I50 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final I50 A0A;
    public final FileDescriptor A0B;
    public final FileDescriptor A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public static final HXD A0S = new HXD(0);
    public static final Guo A0L = new HXD(2);
    public static final Guo A0K = new HXD(3);
    public static final Guo A0M = new HXD(4);
    public static final Guo A0J = new HXD(5);
    public static final HXD A0T = new HXD(6);
    public static final HXD A0N = new HXD(7);
    public static final HXD A0Z = new HXD(8);
    public static final HXD A0O = new HXD(9);
    public static final HXD A0P = new HXD(10);
    public static final HXD A0Q = new HXD(11);
    public static final HXD A0V = new HXD(12);
    public static final HXD A0W = new HXD(13);
    public static final HXD A0X = new HXD(14);
    public static final HXD A0Y = new HXD(15);
    public static final HXD A0R = new HXD(16);
    public static final HXD A0U = new HXD(17);

    public I50(I2t i2t) {
        String str = i2t.A0G;
        if (str == null && i2t.A0B == null) {
            throw AnonymousClass001.A0L("one of file path or FileDescriptor must be set");
        }
        this.A0G = str;
        this.A0B = i2t.A0B;
        this.A0H = i2t.A0H;
        this.A0C = i2t.A0C;
        this.A07 = i2t.A03;
        this.A06 = i2t.A02;
        this.A08 = i2t.A04;
        this.A05 = i2t.A01;
        this.A0I = i2t.A0I;
        this.A04 = i2t.A00;
        this.A09 = i2t.A05;
        this.A0D = i2t.A0D;
        this.A0E = i2t.A0E;
        this.A0F = i2t.A0F;
        this.A00 = i2t.A06;
        this.A01 = i2t.A07;
        this.A02 = i2t.A08;
        this.A03 = i2t.A09;
        this.A0A = i2t.A0A;
    }

    public Integer A00(Guo guo) {
        int i = ((HXD) guo).A00;
        return Integer.valueOf(i != 2 ? i != 3 ? i != 4 ? this.A05 : this.A08 : this.A06 : this.A07);
    }

    public Object A01(HXD hxd) {
        long j;
        int i = hxd.A00;
        if (i == 0) {
            return this.A0G;
        }
        if (i == 1) {
            return this.A0B;
        }
        switch (i) {
            case 6:
                return Boolean.valueOf(this.A0I);
            case 7:
                return Integer.valueOf(this.A04);
            case 8:
                return Integer.valueOf(this.A09);
            case 9:
                return this.A0D;
            case 10:
                return this.A0E;
            case 11:
                return this.A0F;
            case 12:
                j = this.A00;
                break;
            case 13:
                j = this.A01;
                break;
            case 14:
                j = this.A02;
                break;
            case 15:
                j = this.A03;
                break;
            case 16:
                return this.A0A;
            case 17:
                return this.A0H;
            default:
                throw GOp.A16("Invalid required video capture result key: ", i);
        }
        return Long.valueOf(j);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public void A02(HXD hxd, Object obj) {
        String str;
        String str2;
        long j = -1;
        switch (hxd.A00) {
            case 12:
                if (this.A00 == j) {
                    this.A00 = AnonymousClass001.A05(obj);
                    return;
                }
                str = "VideoCaptureRequest";
                str2 = "Start request time was already set, cannot set it again";
                ID3.A02(str, str2);
                return;
            case 13:
                if (this.A01 == j) {
                    this.A01 = AnonymousClass001.A05(obj);
                    return;
                }
                str = "VideoCaptureRequest";
                str2 = "Start time was already set, cannot set it again";
                ID3.A02(str, str2);
                return;
            case 14:
                if (this.A02 == j) {
                    this.A02 = AnonymousClass001.A05(obj);
                    return;
                }
                str = "VideoCaptureRequest";
                str2 = "Stop request time was already set, cannot set it again";
                ID3.A02(str, str2);
                return;
            default:
                if (this.A03 == j) {
                    this.A03 = AnonymousClass001.A05(obj);
                    return;
                }
                str = "VideoCaptureRequest";
                str2 = "Stop time was already set, cannot set it again";
                ID3.A02(str, str2);
                return;
        }
    }
}
