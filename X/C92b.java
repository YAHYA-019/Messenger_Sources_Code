package X;

import android.graphics.PointF;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.google.common.collect.ImmutableMap;
import kotlin.jvm.functions.Function1;

/* renamed from: X.92b, reason: invalid class name */
/* loaded from: 92b.class */
public final class C92b extends 6cZ {
    public String A00;
    public Function1 A01;

    public void A03(String str, Function1 function1) {
        this.A01 = function1;
        this.A00 = str;
    }

    public 1LI A04(1Iw r302, 6TN r303, PlayerOrigin playerOrigin, GRD grd, 6UR r306, final 6TI r307, 6U2 r308, C6ce c6ce, GRX grx) {
        GRS A04;
        boolean A1W = 1BL.A1W(r302, grd);
        7zT.A1U(r307, r308, grx);
        11T.A0F(r306, 6);
        7zR.A1P(playerOrigin, r303);
        boolean z = true;
        if (r306 != 6UR.A05 || (A04 = grd.A04()) == null || !1BK.A1X(A04.A0M, A1W)) {
            z = false;
        }
        if (r306 != 6UR.A0B && r306 != 6UR.A06 && !z) {
            return null;
        }
        final Function1 function1 = this.A01;
        final String str = this.A00;
        final 2lO r1 = null;
        final String str2 = "CoverImageParamsKey";
        return new 1LH(r1, r307, str2, str, function1) { // from class: X.8ba
            public final 2lO A00;
            public final 6TI A01;
            public final String A02;
            public final String A03;
            public final Function1 A04;

            {
                this.A01 = r307;
                this.A02 = str2;
                this.A00 = r1;
                this.A04 = function1;
                this.A03 = str;
            }

            public 1LI A0s(C2k5 c2k5) {
                11T.A0F(c2k5, 0);
                6TI r0 = this.A01;
                5BO r02 = (5BO) AQU.A00(c2k5, this, new Object[]{r0, this.A02}, 40);
                03Y[] A1b = 7zT.A1b();
                CallerContext A01 = CallerContext.A01(9Fo.A00, new ContextChain((ContextChain) null, "i", "CoverImagePlugin"));
                C07004ik A00 = C06984ii.A00();
                VideoPlayerParams videoPlayerParams = r0.A03;
                double d = videoPlayerParams.A01;
                if (d > 0.0d) {
                    double d2 = videoPlayerParams.A02;
                    if (d2 > 0.0d) {
                        ((C07014il) A00).A01 = new PointF((float) d, (float) d2);
                    }
                }
                3xX r03 = (3xX) r0.A02("VideoPreviewPostprocessor");
                if (r03 != null) {
                    ((C07014il) A00).A09 = r03;
                }
                5BH A012 = 5BG.A01(c2k5.A05);
                A012.A2b(A01);
                A012.A2a(r02);
                A012.A00.A07 = Boolean.valueOf(r0.A07);
                7zP.A13(A012);
                C06984ii.A01(A012, A00);
                A012.A2Y(new 8I0(this, 11));
                C5z7.A00(A012, this.A00);
                return new 7J5(7zO.A0O(A012), A1b, (03Y[]) null);
            }
        };
    }

    public Integer AWj() {
        return 0S2.A00;
    }

    public String AuU() {
        return "CoverImagePluginDescriptor";
    }

    public boolean BUW(6TN r302, PlayerOrigin playerOrigin, GRD grd, 6TI r305) {
        11T.A0F(r305, 0);
        ImmutableMap immutableMap = r305.A04;
        return (immutableMap == null || !1BK.A1X(immutableMap.get("HideVideoCoverImage"), true)) && r305.A02("CoverImageParamsKey") != null;
    }
}
