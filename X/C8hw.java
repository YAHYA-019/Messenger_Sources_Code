package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* renamed from: X.8hw, reason: invalid class name */
/* loaded from: 8hw.class */
public final class C8hw extends 1LH {
    public final TriState A00;
    public final ThreadCustomization A01;
    public final C9bf A02;
    public final FbUserSession A03;
    public final 1Iw A04;
    public final DGr A05;
    public final MigColorScheme A06;
    public final ThreadThemeInfo A07;
    public final boolean A08;

    public C8hw(FbUserSession fbUserSession, TriState triState, 1Iw r304, DGr dGr, ThreadCustomization threadCustomization, C9bf c9bf, MigColorScheme migColorScheme, ThreadThemeInfo threadThemeInfo, boolean z) {
        7zR.A1N(r304, migColorScheme);
        11T.A0F(triState, 9);
        this.A04 = r304;
        this.A03 = fbUserSession;
        this.A06 = migColorScheme;
        this.A07 = threadThemeInfo;
        this.A01 = threadCustomization;
        this.A02 = c9bf;
        this.A05 = dGr;
        this.A08 = z;
        this.A00 = triState;
    }

    public static final boolean A01(C2lh c2lh, C5yh c5yh, C8hw c8hw) {
        ThreadCustomization threadCustomization;
        if (!c8hw.A08) {
            if (!c5yh.A01() || !c8hw.A00.asBoolean(false)) {
                return false;
            }
            if (!7zP.A1V(c2lh) && ((threadCustomization = c8hw.A01) == null || !11T.A0O(threadCustomization.A02, ThreadCustomization.A03.A02))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0L(C5yh c5yh, C8hw c8hw) {
        boolean z = false;
        if (c5yh.A01()) {
            TriState triState = c8hw.A00;
            if (triState.asBoolean(false) || (1Br.A07(c5yh.A00).AZk(36318033002377207L) && triState.isSet())) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8hw.A0s(X.2k5):X.1LI");
    }
}
