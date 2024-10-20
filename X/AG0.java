package X;

import android.graphics.Color;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.memories.viewer.MemoryViewerFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: AG0.class */
public final class AG0 implements Runnable {
    public static final String __redex_internal_original_name = "MemoryViewerFragment$setContentComponent$1$1$1$onReceiveMeasurements$1";
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ MemoryViewerFragment A02;

    public AG0(MemoryViewerFragment memoryViewerFragment, float f, float f2) {
        this.A02 = memoryViewerFragment;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MemoryViewerFragment memoryViewerFragment = this.A02;
        final float f = this.A00;
        final float f2 = this.A01;
        LithoView lithoView = memoryViewerFragment.A04;
        if (lithoView != null) {
            final MemoryViewModel memoryViewModel = memoryViewerFragment.A08;
            1LI r307 = null;
            if (memoryViewModel != null) {
                final C96y A00 = C9dL.A00(memoryViewModel.A03);
                1pQ r0 = memoryViewerFragment.A0O;
                if ((7zV.A1C(r0) || 1pQ.A00(r0).AZk(36324595714969431L)) && A00 != null) {
                    final MigColorScheme A0m = 7zQ.A0m(memoryViewerFragment.A0H);
                    1G1 r02 = memoryViewerFragment.A00;
                    if (r02 == null) {
                        7zL.A1C();
                        throw 0Q8.createAndThrow();
                    }
                    final long parseLong = Long.parseLong(r02.A05);
                    r307 = new 1LH(memoryViewModel, A00, A0m, f, f2, parseLong) { // from class: X.8gn
                        public static final CallerContext A06 = CallerContext.A0B(C8gn.class.getName());
                        public final float A00;
                        public final float A01;
                        public final MemoryViewModel A02;
                        public final C96y A03;
                        public final MigColorScheme A04;
                        public final long A05;

                        {
                            7zR.A1O(A00, A0m);
                            this.A02 = memoryViewModel;
                            this.A03 = A00;
                            this.A04 = A0m;
                            this.A05 = parseLong;
                            this.A00 = f;
                            this.A01 = f2;
                        }

                        public 1LI A0s(C2k5 c2k5) {
                            1LH r318;
                            boolean A1W = 7zL.A1W(c2k5);
                            2lO A04 = C82m.A04(C82m.A06(0S2.A01, 100.0f, A1W ? 1 : 0), 0S2.A00, 100.0f, A1W ? 1 : 0);
                            C2sn A0U = 7zQ.A0U(c2k5.A05);
                            final MemoryViewModel memoryViewModel2 = this.A02;
                            MigColorScheme migColorScheme = this.A04;
                            float f3 = this.A00;
                            float f4 = this.A01;
                            C96y c96y = this.A03;
                            A0U.A00(new C8gc(memoryViewModel2, c96y, migColorScheme, f3, f4));
                            int ordinal = c96y.ordinal();
                            if (ordinal != 2) {
                                if (ordinal == 1) {
                                    r318 = new 1LH(memoryViewModel2) { // from class: X.8he
                                        public static final int A01 = Color.parseColor("#E6CEECDE");
                                        public static final CallerContext A02 = CallerContext.A0B("MemoryViewerTemplatesRetroForeground");
                                        public final MemoryViewModel A00;

                                        {
                                            11T.A0F(memoryViewModel2, 1);
                                            this.A00 = memoryViewModel2;
                                        }

                                        public static final C2k2 A01(C2k6 c2k6) {
                                            int i = A01;
                                            2lQ r03 = 2lO.A02;
                                            2lO A0H = 7zT.A0H(7zS.A0g(0S2.A00, Double.doubleToRawLongBits(30.0d)), 90.0d);
                                            C2k3 A002 = C2k2.A00(c2k6.AeS());
                                            A002.A2X(i);
                                            C5z7.A00(A002, A0H);
                                            return A002.A2V();
                                        }

                                        public 1LI A0s(C2k5 c2k52) {
                                            11T.A0F(c2k52, 0);
                                            1Iw AeS = c2k52.AeS();
                                            float f5 = r0.widthPixels / 7zQ.A0L(AeS).density;
                                            9Sg r03 = C96y.A03.imageConfig;
                                            MemoryViewModel memoryViewModel3 = this.A00;
                                            float f6 = f5 * ((memoryViewModel3.A0S ? r03.A01 : r03.A02) / 100.0f);
                                            float f7 = f6 / memoryViewModel3.A00;
                                            float f8 = f6 + 90.0f;
                                            float f9 = f7 + 60.0f;
                                            2lQ r04 = 2lO.A02;
                                            long A07 = 7zL.A07(f8);
                                            Integer num = 0S2.A00;
                                            2lO A0K = 4YV.A0K((2lO) null, num, A07);
                                            long A072 = 7zL.A07(f9);
                                            Integer num2 = 0S2.A01;
                                            2lO A0T = 7zS.A0T(7zT.A0M(7zS.A0S(4YV.A0K(A0K, num2, A072), 0), 12.0d), 4YV.A06(2RH.A04));
                                            C1rp c1rp = C1rp.SPACE_BETWEEN;
                                            C2sn A0U2 = 7zQ.A0U(AeS);
                                            long doubleToRawLongBits = Double.doubleToRawLongBits(90.0d);
                                            2lO A0K2 = 4YV.A0K((2lO) null, num2, doubleToRawLongBits);
                                            long doubleToRawLongBits2 = Double.doubleToRawLongBits(30.0d);
                                            2lO A042 = C82m.A04(4YV.A0K(4YV.A0L(4YV.A0K(A0K2, num, doubleToRawLongBits2), num, C1ro.FLEX_START, 0), 0S2.A07, doubleToRawLongBits2), num2, 50.0f, 1);
                                            1Iw r05 = A0U2.A00;
                                            C2sn A0U3 = 7zQ.A0U(r05);
                                            7zQ.A1F(A01(A0U3), A0U3, A0U2, A042);
                                            2lO A022 = C82m.A02(4YV.A0L(7zS.A0V((2lO) null, 7zL.A0i(num2, doubleToRawLongBits), num, doubleToRawLongBits2), num, C1ro.FLEX_END, 0), 7zL.A0i(0S2.A09, doubleToRawLongBits2), num2, 50.0f, 1);
                                            C2sn A0U4 = 7zQ.A0U(r05);
                                            7zQ.A1F(A01(A0U4), A0U4, A0U2, A022);
                                            return C2so.A0C(A0U2, c2k52, A0T, c1rp);
                                        }
                                    };
                                }
                                return C2so.A06(A0U, c2k5, A04);
                            }
                            r318 = new 8XJ(memoryViewModel2, migColorScheme, this.A05);
                            A0U.A00(r318);
                            return C2so.A06(A0U, c2k5, A04);
                        }
                    };
                } else {
                    int i = C8gc.A05;
                    r307 = new C8gc(memoryViewModel, C96y.A04, 7zQ.A0m(memoryViewerFragment.A0H), f, f2);
                }
            }
            lithoView.A0y(r307);
        }
        memoryViewerFragment.A0D = true;
        LithoView lithoView2 = memoryViewerFragment.A05;
        if (lithoView2 != null) {
            lithoView2.setVisibility(8);
            lithoView2.A10(null, true);
        }
    }
}
