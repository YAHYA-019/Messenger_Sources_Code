package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.3b8, reason: invalid class name */
/* loaded from: 3b8.class */
public final class C3b8 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    public C3b8(22I r302, MailboxFutureImpl mailboxFutureImpl, int i, long j) {
        this.A00 = 0;
        this.A03 = r302;
        this.A04 = mailboxFutureImpl;
        this.A01 = i;
        this.A02 = j;
    }

    public C3b8(MailboxFutureImpl mailboxFutureImpl, 22C r303, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = r303;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
    }

    public static MailboxFutureImpl A00(C3b8 c3b8, String str, int i) {
        4uZ.A06("MailboxTam", str, i);
        return (MailboxFutureImpl) c3b8.A04;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl A00;
        Boolean bool;
        MailboxFeature.DbConnectionResolutionCallback ic0;
        String str;
        String str2;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                Ic0 ic02 = new Ic0(this, 19);
                String A002 = 7zK.A00(64);
                C1qL c1qL = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, false, 0, 1, A002, "GroupChatUpgradeSetPauseState", ic02);
                return;
            case 1:
                A00 = A00(this, "runTamClientMessageUnsend", this.A01);
                bool = false;
                ic0 = new Ic0(this, 150);
                str = "MCAMailboxTam";
                str2 = "TamClientMessageUnsend";
                C1qL c1qL2 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 2:
                A00 = A00(this, "runTamClientThreadMarkRead", this.A01);
                bool = false;
                ic0 = new Ic0(this, ActionId.FUTURE_LISTENERS_COMPLETE);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadMarkRead";
                C1qL c1qL22 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 3:
                A00 = A00(this, "runTamClientTypingIndicatorStart", this.A01);
                bool = false;
                ic0 = new Ic0(this, ActionId.SERVICE_ON_START_COMMAND);
                str = "MCAMailboxTam";
                str2 = "TamClientTypingIndicatorStart";
                C1qL c1qL222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 4:
                A00 = A00(this, "runTamClientTypingIndicatorStop", this.A01);
                bool = false;
                ic0 = new Ic0(this, ActionId.WAIT_FOR_BLOCKERS);
                str = "MCAMailboxTam";
                str2 = "TamClientTypingIndicatorStop";
                C1qL c1qL2222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 5:
                MailboxFutureImpl A003 = A00(this, "runTamClientMessageDelete", this.A01);
                MailboxNullable A0T = 1BL.A0T();
                Ic0 ic03 = new Ic0(this, ActionId.DISPLAYED);
                C1qL c1qL3 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A003, A0T, 0, 1, "MCAMailboxTam", "TamClientMessageDelete", ic03);
                return;
            case 6:
                A00 = A00(this, "runTamClientParticipantLeaveThread", this.A01);
                bool = false;
                ic0 = new Ic0(this, ActionId.DISPLAYED_ON_SCREEN);
                str = "MCAMailboxTam";
                str2 = "TamClientParticipantLeaveThread";
                C1qL c1qL22222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 7:
                A00 = A00(this, "runTamClientThreadBannerDismiss", this.A01);
                bool = false;
                ic0 = new Ibz(this, 0);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadBannerDismiss";
                C1qL c1qL222222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 8:
                A00 = A00(this, "runTamClientThreadMarkUnread", this.A01);
                bool = false;
                ic0 = new Ibz(this, 6);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadMarkUnread";
                C1qL c1qL2222222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 9:
                A00 = A00(this, "runTamClientThreadDelete", this.A01);
                bool = false;
                ic0 = new Ibz(this, 7);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadDelete";
                C1qL c1qL22222222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 10:
                A00 = A00(this, "runTamClientThreadUnmute", this.A01);
                bool = false;
                ic0 = new Ibz(this, 11);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadUnmute";
                C1qL c1qL222222222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            case 11:
                A00 = A00(this, "runTamTransportHybridThreadArchive", this.A01);
                bool = false;
                ic0 = new Ibz(this, 12);
                str = "MCAMailboxTam";
                str2 = "TamTransportHybridThreadArchive";
                C1qL c1qL2222222222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
            default:
                A00 = A00(this, "runTamTransportHybridThreadUnarchive", this.A01);
                bool = false;
                ic0 = new Ibz(this, 13);
                str = "MCAMailboxTam";
                str2 = "TamTransportHybridThreadUnarchive";
                C1qL c1qL22222222222 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, bool, 0, 1, str, str2, ic0);
                return;
        }
    }
}
