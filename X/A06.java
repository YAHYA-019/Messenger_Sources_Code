package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.MailboxCallback;
import java.util.List;

/* loaded from: A06.class */
public final class A06 implements MailboxCallback {
    public final int A00;
    public final C22K A01;
    public final List A02;

    public A06(C22K c22k, List list, int i) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = c22k;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        boolean A1V = AnonymousClass001.A1V(obj);
        StringBuilder A0n = AnonymousClass001.A0n(A1V ? "Successfully synced" : "Failed to sync");
        A0n.append(' ');
        A0n.append(this.A00);
        A0n.append(" threads from filter for modes: ");
        0fH.A0j(1BJ.A00(ActionId.END_START_ACTIVITY), AnonymousClass001.A0a(this.A02, A0n));
        this.A01.A00(A1V ? 0S2.A00 : 0S2.A01);
    }
}
