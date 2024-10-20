package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: I48.class */
public final class I48 {
    public Bitmap A00;
    public Rect A01;
    public Rect A02;
    public I40 A03;
    public I49 A04;
    public Boolean A05;
    public Float A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public byte[] A0F;
    public byte[] A0G;
    public final int A0H;
    public final int A0I;
    public final Rect A0J;

    public I48(I49 i49) {
        this.A01 = (Rect) i49.A00(I49.A0M);
        this.A0J = (Rect) i49.A00(I49.A0N);
        this.A0I = AnonymousClass001.A03(i49.A00(I49.A0L));
        this.A0H = AnonymousClass001.A03(i49.A00(I49.A0K));
        this.A0F = (byte[]) i49.A01(I49.A0X);
        this.A0G = (byte[]) i49.A01(I49.A0b);
        this.A03 = (I40) i49.A01(I49.A0Y);
        this.A02 = (Rect) i49.A01(I49.A0d);
        this.A0E = (Long) i49.A01(I49.A0T);
        this.A0A = (Integer) i49.A01(I49.A0Z);
        this.A06 = (Float) i49.A01(I49.A0O);
        this.A08 = (Integer) i49.A01(I49.A0P);
        this.A07 = (Float) i49.A01(I49.A0V);
        i49.A01(I49.A0R);
        this.A04 = (I49) i49.A01(I49.A0Q);
        this.A0B = (Integer) i49.A01(I49.A0a);
        this.A0D = (Integer) i49.A01(I49.A0e);
        this.A05 = (Boolean) i49.A01(I49.A0S);
        this.A0C = (Integer) i49.A01(I49.A0c);
        this.A09 = (Integer) i49.A01(I49.A0U);
        this.A00 = (Bitmap) i49.A01(I49.A0W);
    }

    public I48(Rect rect, Rect rect2, int i, int i2) {
        this.A01 = rect;
        this.A0J = rect2;
        this.A0I = i;
        this.A0H = i2;
    }

    public Object A00(HXB hxb) {
        int i = hxb.A00;
        switch (i) {
            case 0:
                return this.A0F;
            case 1:
                return this.A03;
            case 2:
                return this.A02;
            case 3:
            case 4:
            case 5:
            case 6:
            case 12:
            default:
                throw GOp.A16("Failed to get photo capture value: ", i);
            case 7:
                return this.A0E;
            case 8:
                return this.A0A;
            case 9:
                return this.A06;
            case 10:
                return this.A08;
            case 11:
                return this.A07;
            case 13:
                return null;
            case 14:
                return this.A04;
            case 15:
                return this.A0B;
            case 16:
                return this.A0D;
            case 17:
                return this.A05;
            case 18:
                return this.A0C;
            case 19:
                return this.A0G;
        }
    }

    public void A01(HXB hxb, Object obj) {
        int i = hxb.A00;
        switch (i) {
            case 0:
                this.A0F = (byte[]) obj;
                return;
            case 1:
                this.A03 = (I40) obj;
                return;
            case 2:
                this.A02 = (Rect) obj;
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 12:
            default:
                throw GOp.A16("Failed to set photo capture value: ", i);
            case 7:
                this.A0E = (Long) obj;
                return;
            case 8:
                this.A0A = (Integer) obj;
                return;
            case 9:
                this.A06 = (Float) obj;
                return;
            case 10:
                this.A08 = (Integer) obj;
                return;
            case 11:
                this.A07 = (Float) obj;
                return;
            case 13:
                return;
            case 14:
                this.A04 = (I49) obj;
                return;
            case 15:
                this.A0B = (Integer) obj;
                return;
            case 16:
                this.A0D = (Integer) obj;
                return;
            case 17:
                this.A05 = (Boolean) obj;
                return;
            case 18:
                this.A0C = (Integer) obj;
                return;
            case 19:
                this.A0G = (byte[]) obj;
                return;
            case 20:
                this.A09 = (Integer) obj;
                return;
            case 21:
                this.A00 = (Bitmap) obj;
                return;
        }
    }
}
