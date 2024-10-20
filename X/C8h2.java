package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.BitSet;

/* renamed from: X.8h2, reason: invalid class name */
/* loaded from: 8h2.class */
public final class C8h2 extends 1LH {
    public static final CallerContext A07 = CallerContext.A0B("GifPhotoMessageComponent");
    public final C5j5 A00;
    public final AaE A01;
    public final 6oP A02;
    public final String A03;
    public final String A04;
    public final java.util.Map A05;
    public final boolean A06;

    public C8h2(C5j5 c5j5, AaE aaE, 6oP r304, String str, String str2, java.util.Map map, boolean z) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = c5j5;
        this.A01 = aaE;
        this.A02 = r304;
        this.A05 = map;
        this.A06 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        6TI r02 = (6TI) AQs.A00(c2k5, 1Fw.A01(r0.A0D), this, new Object[]{this.A04, this.A03}, 9);
        C6op c6op = (C6op) AQs.A01(c2k5, this, new Object[]{this.A02}, 8);
        Drawable drawable = c6op != null ? c6op.A00 : null;
        H10 h10 = new H10(2);
        03Y[] A1b = 7zT.A1b();
        GR8 gr8 = new GR8(r0, new 88K());
        88K r03 = gr8.A01;
        r03.A05 = h10;
        BitSet bitSet = gr8.A02;
        bitSet.set(1);
        r03.A03 = PlayerOrigin.A0I;
        bitSet.set(3);
        r03.A02 = 6TN.A0B;
        r03.A0B = true;
        bitSet.set(5);
        bitSet.set(2);
        r03.A09 = null;
        bitSet.set(0);
        AaE aaE = this.A01;
        r03.A00 = aaE.getAspectRatio();
        bitSet.set(6);
        r03.A04 = aaE;
        r03.A01 = this.A00;
        gr8.A1e(drawable);
        r03.A07 = r02;
        bitSet.set(4);
        return new 7J5(gr8.A2W(), A1b, (03Y[]) null);
    }
}
