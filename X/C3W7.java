package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3W7, reason: invalid class name */
/* loaded from: 3W7.class */
public final class C3W7 implements 2So {
    public String[] A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 2S4 A04;
    public final 2Si A05;
    public final 2Sk A06;
    public int A00 = -1;
    public final 1YC A07 = 1YC.A03;

    public C3W7(Context context, FbUserSession fbUserSession, 2S4 r304, 2Si r305, 2Sk r306) {
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A04 = r304;
        this.A05 = r305;
        this.A06 = r306;
    }

    public ImmutableList AqP(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A07;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "getInboxItems", A00);
        r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "getInboxItems", A00);
        return null;
    }

    public String[] Ayr() {
        String[] strArr = this.A01;
        if (strArr == null) {
            int i = this.A00;
            if (i == -1) {
                i = 0;
                this.A00 = 0;
            }
            strArr = new String[i];
            this.A01 = strArr;
        }
        return strArr;
    }

    public void B9M(C2g5 c2g5) {
        1BL.A19(this.A07, 1BK.A00());
    }

    public void BYI() {
        1BL.A15(this.A07, 1BK.A00());
    }

    public void BYJ() {
        1BL.A1A(this.A07, 1BK.A00());
    }

    public void BYK(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A07;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "legacyStartLoadMoreThreads", A00);
        r0.A06("messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "legacyStartLoadMoreThreads", A00);
    }

    public void COH() {
        int A00 = 1BK.A00();
        1YC r0 = this.A07;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onSubscribe", A00);
        r0.A06("messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onSubscribe", A00);
    }

    public void CSQ() {
        int A00 = 1BK.A00();
        1YC r0 = this.A07;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onUnsubscribe", A00);
        r0.A06("messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onUnsubscribe", A00);
    }

    public void Cbz() {
        int A00 = 1BK.A00();
        1YC r0 = this.A07;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "refreshOnUserRequest", A00);
        r0.A06("messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "refreshOnUserRequest", A00);
    }

    public boolean[] D0n(2Sk r302, 2Sk r303) {
        int A00 = 1BK.A00();
        1YC r0 = this.A07;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "skipRecreation", A00);
        try {
            int i = this.A00;
            if (i == -1) {
                i = 0;
                this.A00 = 0;
            }
            return new boolean[i];
        } finally {
            r0.A06("messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "skipRecreation", A00);
        }
    }
}
