package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.BitSet;

/* renamed from: X.Au0, reason: case insensitive filesystem */
/* loaded from: Au0.class */
public final class C1827Au0 extends C1rs {
    public 1Iw A00;
    public B0I A01;
    public final BitSet A02;
    public final String[] A03;

    public C1827Au0(1Iw r302, B0I b0i) {
        super(b0i, r302, 0, 0);
        this.A03 = new String[]{ErrorReportingConstants.APP_NAME_KEY, "difficulty", "fbUserSession", "genre", "index", "maxPlayers", "minPlayers", "minRoundLength"};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A01 = b0i;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A17(this, this.A02, this.A03);
        return this.A01;
    }
}
