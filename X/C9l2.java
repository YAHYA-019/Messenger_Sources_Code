package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9l2, reason: invalid class name */
/* loaded from: 9l2.class */
public final class C9l2 {
    public C3RG A00;
    public boolean A01;
    public final 2bX A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final Context A0A;

    public C9l2(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A06 = 7zM.A0Z();
        Context A0A = 7zM.A0A();
        this.A0A = A0A;
        this.A07 = 7zM.A0b();
        this.A04 = 1Bu.A00(68882);
        this.A03 = 1Bu.A00(67246);
        this.A05 = 1Lm.A01(fbUserSession, 16874);
        this.A08 = 1Lm.A01(fbUserSession, 68883);
        this.A09 = 7zM.A0V();
        this.A02 = new LiveData(7zN.A0h());
        if (((0BG) 1Br.A0B(this.A03)).A00(A0A)) {
            C3RG c3rg = (C3RG) 1Lo.A08(fbUserSession, 67247);
            this.A00 = c3rg;
            if (c3rg == null) {
                11T.A0L("localStorageManager");
                throw 0Q8.createAndThrow();
            }
            C9un c9un = (C9un) 1Br.A0B(this.A04);
            11T.A0F(c9un, 0);
            c3rg.A00 = c9un;
        }
    }

    public static final void A00(C9l2 c9l2, String str) {
        boolean z = c9l2.A01;
        C00i c00i = c9l2.A07.A00;
        C9up c9up = (C9up) c00i.get();
        if (z) {
            c9up.A02(0S2.A01);
            ((C9up) c00i.get()).A06(str);
        } else {
            c9up.A07(str);
        }
        C9un c9un = (C9un) 1Br.A0B(c9l2.A04);
        c9un.A00 = false;
        4YV.A0Z(c9un.A02).flowEndFail(c9un.A01, str, null);
    }

    public static final void A01(C9l2 c9l2, String str) {
        7zO.A0Z(c9l2.A07).A07(str);
        C9un c9un = (C9un) 1Br.A0B(c9l2.A04);
        4YV.A0Z(c9un.A02).flowMarkPoint(c9un.A01, str);
    }

    public final 1xH A02(C8p c8p) {
        1xH r0 = new 1xH();
        0fH.A0j("BlockStoreRestoreManager", "performRestoreUsingRecoveryCodeForBlockstore");
        String str = c8p.A01;
        if (str != null) {
            C9up A0Z = 7zO.A0Z(this.A07);
            4YV.A0Z(A0Z.A04).flowAnnotate(A0Z.A02, "SHARED_RC_SOURCE", str);
        }
        A01(this, "RESTORE_BACKUP_BLOCK_STORE_RETRIEVE_RC_SUCCESS");
        7zP.A0O(this.A06).A01(this.A02, 1);
        A01(this, "RESTORE_BACKUP_BLOCK_STORE_API_START");
        7zQ.A0M(this.A05).A09(C96p.A04, c8p.A00, 7zS.A11(this.A09)).A03(new 9rY(1, r0, c8p, this));
        return r0;
    }
}
