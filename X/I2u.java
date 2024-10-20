package X;

import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.google.common.base.Preconditions;

/* loaded from: I2u.class */
public final class I2u {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Integer A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;

    public I2u() {
        this.A0B = 0S2.A0u;
        this.A0C = 0S2.A0N;
        this.A00 = -1;
        this.A05 = 0;
        this.A06 = -1;
        this.A07 = -1;
        this.A09 = 0;
        this.A0A = -1;
        this.A08 = -1;
    }

    public I2u(CompositionInfo compositionInfo) {
        this.A0B = 0S2.A0u;
        this.A0C = 0S2.A0N;
        this.A00 = -1;
        this.A05 = 0;
        this.A06 = -1;
        this.A07 = -1;
        this.A09 = 0;
        this.A0A = -1;
        this.A08 = -1;
        this.A0B = compositionInfo.A0B;
        this.A0C = compositionInfo.A0C;
        this.A00 = compositionInfo.A00;
        this.A09 = compositionInfo.A09;
        this.A0K = compositionInfo.A0L;
        this.A0A = compositionInfo.A0A;
        this.A0I = compositionInfo.A0J;
        this.A0D = compositionInfo.A0D;
        this.A0G = compositionInfo.A0G;
        this.A0J = compositionInfo.A0K;
        this.A0H = compositionInfo.A0H;
        this.A08 = compositionInfo.A08;
        this.A01 = compositionInfo.A01;
        this.A02 = compositionInfo.A02;
        this.A03 = compositionInfo.A03;
        this.A04 = compositionInfo.A04;
    }

    public void A00(int i) {
        Preconditions.checkArgument(1BL.A1S(i));
        this.A07 = i;
    }
}
