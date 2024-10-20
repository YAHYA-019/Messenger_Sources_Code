package X;

import android.content.Context;
import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* renamed from: X.3Vs, reason: invalid class name */
/* loaded from: 3Vs.class */
public final class C3Vs implements 1xJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C3Vs(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ void Cit(Object obj) {
        1xH r307;
        1xH A00;
        int i;
        9rX c3Vo;
        switch (this.A00) {
            case 0:
                AnonymousClass999 anonymousClass999 = (AnonymousClass999) obj;
                C3RG c3rg = (C3RG) this.A02;
                C3lt c3lt = c3rg.A00;
                if (c3lt != null) {
                    c3lt.ATN("FETCH_TPID_API_END");
                }
                boolean z = anonymousClass999 instanceof C87e;
                C3lt c3lt2 = c3rg.A00;
                if (!z) {
                    if (c3lt2 != null) {
                        c3lt2.ATN("FETCH_TPID_API_ERROR");
                    }
                    C3RG.A00(anonymousClass999, (1xH) this.A01, "Store recovery code");
                    return;
                }
                if (c3lt2 != null) {
                    c3lt2.ATN("FETCH_TPID_API_SUCCESS");
                }
                String str = (String) ((C87e) anonymousClass999).A00;
                String str2 = this.A03;
                r307 = new 1xH();
                if (c3rg.A06) {
                    0fH.A0j("LocalStorageManager", "use lockbox to store recovery code");
                    if (c3rg.A04 != null) {
                        LockBoxStorageManager.logger = c3rg.A05;
                        A00 = LockBoxStorageManager.lockBoxSaveSecretAsync(str, "rc", str2, new 3JY() { // from class: X.37g
                        });
                        i = 9;
                    }
                    c3Vo = new C3Vo(c3rg, (1xH) this.A01, 8);
                    r307.A03(c3Vo);
                    return;
                }
                0fH.A0j("LocalStorageManager", "use messagingBackupManager to store recovery code");
                C28z c28z = c3rg.A03;
                3Ek r0 = 3Ek.A03;
                3cD r02 = new 3cD(str2);
                11T.A0F(str, 0);
                0fH.A0j("MessagingBackupManager", "backup data to cloud");
                A00 = 0BK.A00(r02, r0, c28z.A00.A00, str);
                i = 10;
                1xH.A00(c3rg, r307, A00, i);
                c3Vo = new C3Vo(c3rg, (1xH) this.A01, 8);
                r307.A03(c3Vo);
                return;
            case 1:
                C2625GjJ c2625GjJ = (C2625GjJ) obj;
                String A002 = GOm.A00(184);
                JJv jJv = (JJv) this.A01;
                if (c2625GjJ != null) {
                    0fH.A0j(A002, "full metadata retrieved");
                    jJv.C6E(c2625GjJ);
                    return;
                } else {
                    String str3 = this.A03;
                    0fH.A0k(A002, "load full metadata, no metadata found!");
                    jJv.Bxe(0Pz.A0W("load full metadata, no metadata found!/", str3));
                    return;
                }
            default:
                boolean z2 = obj instanceof C87e;
                9mT r03 = (9mT) this.A02;
                if (!z2) {
                    9mT.A03((Context) this.A01, "Creating a Block store VD failed", 0);
                    return;
                }
                r307 = ((C3RG) 1Br.A0B(r03.A07)).A03(this.A03);
                c3Vo = new 9rX(this.A01, r03, 0);
                r307.A03(c3Vo);
                return;
        }
    }
}
