package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: I49.class */
public final class I49 {
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final Rect A03;
    public final Rect A04;
    public final Rect A05;
    public final I40 A06;
    public final I49 A07;
    public final Boolean A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Long A0H;
    public final byte[] A0I;
    public final byte[] A0J;
    public static final HXA A0M = new HXA(4);
    public static final HXA A0N = new HXA(3);
    public static final HXA A0L = new HXA(5);
    public static final HXA A0K = new HXA(6);
    public static final HXB A0X = new HXB(0);
    public static final HXB A0b = new HXB(19);
    public static final HXB A0Y = new HXB(1);
    public static final HXB A0d = new HXB(2);
    public static final HXB A0T = new HXB(7);
    public static final HXB A0Z = new HXB(8);
    public static final HXB A0O = new HXB(9);
    public static final HXB A0P = new HXB(10);
    public static final HXB A0V = new HXB(11);
    public static final HXB A0R = new HXB(13);
    public static final HXB A0Q = new HXB(14);
    public static final HXB A0a = new HXB(15);
    public static final HXB A0e = new HXB(16);
    public static final HXB A0S = new HXB(17);
    public static final HXB A0c = new HXB(18);
    public static final HXB A0U = new HXB(20);
    public static final HXB A0W = new HXB(21);

    public I49(I48 i48) {
        this.A03 = i48.A01;
        this.A04 = i48.A0J;
        this.A01 = i48.A0I;
        this.A00 = i48.A0H;
        this.A0I = i48.A0F;
        this.A0J = i48.A0G;
        this.A06 = i48.A03;
        this.A05 = i48.A02;
        this.A0H = i48.A0E;
        this.A0D = i48.A0A;
        this.A09 = i48.A06;
        this.A0B = i48.A08;
        this.A0A = i48.A07;
        this.A07 = i48.A04;
        this.A0E = i48.A0B;
        this.A0G = i48.A0D;
        this.A08 = i48.A05;
        this.A0F = i48.A0C;
        this.A0C = i48.A09;
        this.A02 = i48.A00;
    }

    public Object A00(HXA hxa) {
        int i = hxa.A00;
        if (i == 3) {
            return this.A04;
        }
        if (i != 4) {
            return Integer.valueOf(i != 5 ? this.A00 : this.A01);
        }
        return this.A03;
    }

    public Object A01(HXB hxb) {
        int i = hxb.A00;
        switch (i) {
            case 0:
                return this.A0I;
            case 1:
                return this.A06;
            case 2:
                return this.A05;
            case 3:
                return this.A04;
            case 4:
            case 5:
            case 6:
            case 12:
            default:
                throw GOp.A16("Invalid photo capture result key: ", i);
            case 7:
                return this.A0H;
            case 8:
                return this.A0D;
            case 9:
                return this.A09;
            case 10:
                return this.A0B;
            case 11:
                return this.A0A;
            case 13:
                return null;
            case 14:
                return this.A07;
            case 15:
                return this.A0E;
            case 16:
                return this.A0G;
            case 17:
                return this.A08;
            case 18:
                return this.A0F;
            case 19:
                return this.A0J;
            case 20:
                return this.A0C;
            case 21:
                return this.A02;
        }
    }
}
