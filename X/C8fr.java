package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8fr, reason: invalid class name */
/* loaded from: 8fr.class */
public final class C8fr extends 1LH {
    public static final CallerContext A03 = CallerContext.A0B("AttachmentPreviewItemComponent");
    public final 8L5 A00;
    public final Function1 A01;
    public final Function1 A02;

    public C8fr(8L5 r302, Function1 function1, Function1 function12) {
        7zR.A1O(function1, function12);
        this.A00 = r302;
        this.A01 = function1;
        this.A02 = function12;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        8L5 r0 = this.A00;
        1LI r02 = (1LI) 2rO.A00(c2k5, AQe.A00(c2k5, this, 49), new Object[]{r0.A03, r0.A02});
        2lQ r03 = 2lO.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(64.0d);
        Integer num = 0S2.A00;
        2KZ r307 = null;
        2lO A0K = 4YV.A0K((2lO) null, num, doubleToRawLongBits);
        Integer num2 = 0S2.A01;
        2lO A0K2 = 4YV.A0K(A0K, num2, doubleToRawLongBits);
        C2sn A0L = 7zR.A0L(c2k5);
        A0L.A00(r02);
        ShapeDrawable A0D = 7zR.A0D();
        A0D.getPaint().setColor(16777215);
        A0D.getPaint().setAlpha(178);
        C1u2 A0I = 4YV.A0I();
        2lO A0L2 = 4YV.A0L(7zT.A0k((2lO) null, num, num2, 7zQ.A06()), num, C1ro.FLEX_END, 0);
        long A0C = 7zP.A0C();
        2lO A0K3 = 4YV.A0K(A0L2, 0S2.A06, A0C);
        2dP r04 = 2dP.A01;
        Integer num3 = 0S2.A0Y;
        2lO A0L3 = 4YV.A0L(A0K3, num3, r04, 0);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(1.0d);
        Integer num4 = 0S2.A0N;
        2lO A0R = 7zR.A0R(7zR.A0Q(7zR.A0Q(7zT.A0l(A0L3, num4, num3, doubleToRawLongBits2), num4, 3yH.A09(A0L, 2131952926)), num2, "android.widget.Button"), AVF.A01(this, 11), 1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A0D, A0I.A08(C1u3.A1y, -16777216)});
        1Iw AeS = A0L.AeS();
        C2cm A00 = C2cl.A00(AeS);
        A00.A2b(layerDrawable);
        C5z7.A00(A00, A0R);
        7zR.A17(A00, A0L);
        Number number = (Number) r0.A01;
        if (number != null) {
            long longValue = number.longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long minutes = timeUnit.toMinutes(longValue);
            String A0w = 7zO.A0w("%01d:%02d", new Object[]{Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(longValue) - TimeUnit.MINUTES.toSeconds(minutes))});
            11T.A0A(A0w);
            2lO A0Y = 7zQ.A0Y(7zS.A0Q(4YV.A0L((2lO) null, num3, r04, 0), 4.0d), 0S2.A15, A0C);
            long A06 = 7zS.A06(10.0f);
            2K4 r05 = 2K4.A03;
            Typeface typeface = Typeface.DEFAULT;
            long A08 = 7zP.A08();
            3yF A0v = 7zM.A0v(AeS, A0w, 0);
            7zS.A1Q(A0L, A0v, -1, A06);
            A0v.A33(0);
            7zT.A15(typeface, A0L, A0v, A08);
            A0v.A2Y();
            A0v.A2t(0);
            A0v.A39(r05);
            7zT.A1N(A0v, false, true);
            r307 = 7zQ.A0c(A0Y, A0v);
        }
        return 7zM.A0l(r307, A0L, c2k5, A0K2);
    }
}
