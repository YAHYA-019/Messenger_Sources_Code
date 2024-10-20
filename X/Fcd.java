package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

/* loaded from: Fcd.class */
public final class Fcd implements CallerContextable {
    public static final CallerContext A0D = CallerContext.A08(Fcd.class, "creative_editing_in_composer");
    public static final HashSet A0E;
    public static final List A0F;
    public static final String __redex_internal_original_name = "FrameAssetsLoader";
    public C00X A00;
    public final 1Br A05 = 1Bq.A00(65609);
    public final 1Br A0A = 7zM.A0P();
    public final 1Br A03 = 1Bq.A00(16431);
    public final 1Br A09 = 7zM.A0Q();
    public final 1BP A0B = FbInjector.A00;
    public final 1Br A07 = 1Bq.A00(65630);
    public final 1Br A04 = AbG.A0M();
    public final 1Br A08 = 1Bq.A00(49322);
    public final 1Br A02 = 1Bq.A00(98688);
    public final 1Br A01 = 1Bq.A00(98404);
    public final 1Br A06 = 1BK.A0D();
    public final 1CO A0C = (1CO) 1Bi.A03(16386);

    static {
        ImmutableList of = ImmutableList.of((Object) 1, (Object) 2);
        11T.A0A(of);
        A0F = of;
        A0E = AnonymousClass001.A0v();
    }

    public static final File A00(Fcd fcd) {
        C00X c00x = fcd.A00;
        if (c00x != null) {
            return AnonymousClass001.A0E(c00x.A00);
        }
        try {
            File A0E2 = AnonymousClass001.A0E(((1MC) 1Br.A0B(fcd.A01)).AUU(205988221).getCanonicalPath());
            if (!A0E2.isDirectory()) {
                1Br.A04(fcd.A04).D0v(__redex_internal_original_name, "Tried to retrieve text asset dir, but external storage was not mounted");
                return null;
            }
            String path = A0E2.getPath();
            11T.A0A(path);
            fcd.A00 = new C00X(path);
            return A0E2;
        } catch (IOException e) {
            1Br.A04(fcd.A04).D0v(__redex_internal_original_name, AnonymousClass001.A0Z(e, "Tried to retrieve the canonical path of text asset dir, but runs into exception: ", AnonymousClass001.A0k()));
            return null;
        }
    }

    public final C10y A01(2JX r302, int i) {
        String str;
        ImmutableList A0b;
        2JY r0;
        2JY A0L;
        11T.A0F(r302, 0);
        File A00 = A00(this);
        C10y c10y = null;
        if (A00 != null && this.A00 != null) {
            2JY A0B = 1BK.A0B(r302, 2JX.class, -1777944483, -1469394733);
            String A0r = (A0B == null || (A0b = A0B.A0b(-1857425737, 2JX.class)) == null || (r0 = (2JY) 0QD.A0E(A0b)) == null || (A0L = AbM.A0L(r0, 2JX.class, 1866859064)) == null) ? null : A0L.A0r(-1540063109);
            str = "";
            if (A0r == null) {
                A0r = str;
            }
            String A002 = new C04t("\\.").A00(new C04t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A00(new C04t(" ").A00(A0r, str), str), str);
            String A0r2 = r302.A0r(-1318083737);
            String str2 = str;
            if (A0r2 != null) {
                str2 = new C04t("\\.").A00(new C04t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A00(new C04t(" ").A00(A0r2, str), str), str);
            }
            C00X c00x = this.A00;
            if (c00x != null) {
                11I r02 = new 11I();
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(r302.A0k());
                A0k.append('_');
                A0k.append(str2);
                A0k.append(A002.length() != 0 ? 0Pz.A0K(A002, '_') : "");
                A0k.append('_');
                A0k.append(r302.A0r(-2115337775));
                A0k.append('_');
                A0k.append(i);
                11I.A07(r02, c00x, A00, AnonymousClass001.A0d(".png", A0k));
                04J A02 = 1Br.A02(this.A06);
                11T.A0F(A02, 0);
                r02.A00 = A02;
                if (this.A0C.AZk(18311910894687661L)) {
                    DKI.A0e(r02);
                }
                c10y = r02.A08();
            }
        }
        return c10y;
    }
}
