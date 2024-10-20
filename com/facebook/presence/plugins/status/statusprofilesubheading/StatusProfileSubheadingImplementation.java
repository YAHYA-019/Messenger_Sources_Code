package com.facebook.presence.plugins.status.statusprofilesubheading;

import X.11T;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1Lm;
import X.1Wa;
import X.1pI;
import X.2K3;
import X.2KD;
import X.2KE;
import X.2RH;
import X.2TI;
import X.2Ti;
import X.4YU;
import X.7zM;
import X.7zO;
import X.7zT;
import X.ATp;
import X.AVG;
import X.C1u7;
import X.C2gx;
import X.DFp;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatus;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* loaded from: StatusProfileSubheadingImplementation.class */
public final class StatusProfileSubheadingImplementation {
    public RichStatus A00;
    public 2Ti A01;
    public ListenableFuture A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 1pI A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final DFp A0C;
    public final AtomicBoolean A0D;
    public final Function1 A0E;
    public final Function1 A0F;

    public StatusProfileSubheadingImplementation(Context context, FbUserSession fbUserSession, 1pI r304, DFp dFp) {
        7zT.A1W(context, fbUserSession, dFp, r304);
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A0C = dFp;
        this.A05 = r304;
        this.A0A = 1Lm.A00(context, fbUserSession, 33122);
        this.A0B = 1Bu.A00(66728);
        this.A06 = 7zM.A0d();
        this.A09 = 1Lm.A00(context, fbUserSession, 83643);
        this.A07 = 1Bu.A00(66725);
        this.A08 = 1Lm.A00(context, fbUserSession, 68395);
        this.A0D = new AtomicBoolean();
        this.A0F = AVG.A01(this, 32);
        this.A0E = ATp.A00;
    }

    public static final 2K3 A00(1Iw r301, MigColorScheme migColorScheme, RichStatus richStatus, StatusProfileSubheadingImplementation statusProfileSubheadingImplementation) {
        if (richStatus == null) {
            return null;
        }
        2KD A00 = 2K3.A00(r301);
        A00.A2z(richStatus.A02(4YU.A0C(statusProfileSubheadingImplementation.A03)));
        A00.A2n();
        A00.A2X();
        A00.A2w(C1u7.A0B);
        A00.A2x(migColorScheme);
        7zO.A1G(A00, 2RH.A05);
        4YU.A1L(A00, 2RH.A06);
        return A00.A2W();
    }

    public static final 2K3 A01(1Iw r301, MigColorScheme migColorScheme, StatusProfileSubheadingImplementation statusProfileSubheadingImplementation) {
        Resources resources;
        int i;
        if (((1Wa) 1Bi.A03(66347)).A00() || !1Br.A07(((C2gx) 1Br.A0B(statusProfileSubheadingImplementation.A0B)).A00).AZk(36316559828920596L)) {
            return null;
        }
        if (((2TI) 1Br.A0B(statusProfileSubheadingImplementation.A07)).A03()) {
            resources = statusProfileSubheadingImplementation.A03.getResources();
            i = 2131962223;
        } else {
            RichStatus richStatus = statusProfileSubheadingImplementation.A00;
            resources = statusProfileSubheadingImplementation.A03.getResources();
            i = 2131965766;
            if (richStatus != null) {
                i = 2131956248;
            }
        }
        String string = resources.getString(i);
        11T.A0D(string);
        2KD A00 = 2K3.A00(r301);
        A00.A2z(string);
        A00.A2y(2KE.A0E);
        A00.A2X();
        A00.A2w(C1u7.A06);
        A00.A2x(migColorScheme);
        7zO.A1G(A00, 2RH.A05);
        4YU.A1L(A00, 2RH.A06);
        return A00.A2W();
    }
}
