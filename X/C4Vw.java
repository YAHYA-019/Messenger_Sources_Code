package X;

import com.facebook.messaging.navigation.plugins.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import java.util.concurrent.Executor;

/* renamed from: X.4Vw, reason: invalid class name */
/* loaded from: 4Vw.class */
public final class C4Vw implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public C4Vw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1qX r0;
        1qX r02;
        switch (this.A00) {
            case 0:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if (mailboxNullable == null || (r0 = (1qX) mailboxNullable.value) == null) {
                    return;
                }
                final int integer = r0.mResultSet.getInteger(0, 4);
                final C4Mn c4Mn = ((C4Mo) this.A01).A00;
                ((1GU) 1Br.A0B(c4Mn.A01)).Ciz(new Runnable() { // from class: X.4X3
                    public static final String __redex_internal_original_name = "ArchivedChatsBadgeController$badgeCountUpdaterCallback$1$onCompletion$1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4Mn.this.A04(new 2QC(integer, "RED_WITH_TEXT"));
                    }
                });
                return;
            case 1:
                BDh bDh = (BDh) obj;
                C4Mx c4Mx = (C4Mx) this.A01;
                BDh bDh2 = c4Mx.A00;
                if (bDh2 != null) {
                    bDh2.D5r();
                }
                c4Mx.A00 = bDh;
                bDh.addResultCallback((Executor) 1Br.A0B(c4Mx.A04), new Czk(c4Mx, 46));
                return;
            default:
                MailboxNullable mailboxNullable2 = (MailboxNullable) obj;
                if (mailboxNullable2 == null || (r02 = (1qX) mailboxNullable2.value) == null) {
                    return;
                }
                int integer2 = r02.mResultSet.getInteger(0, 0);
                for (C4Nh c4Nh : ((C4Tf) this.A01).A03) {
                    boolean z = integer2 > 0;
                    MoreDrawerFolderImplementation moreDrawerFolderImplementation = c4Nh.A00;
                    if (z != moreDrawerFolderImplementation.A00) {
                        moreDrawerFolderImplementation.A00 = z;
                        ((C4Fm) moreDrawerFolderImplementation.A05.A01).A1a();
                    }
                }
                return;
        }
    }
}
