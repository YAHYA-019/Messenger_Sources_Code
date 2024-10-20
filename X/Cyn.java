package X;

import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.broadcastflow.model.ContactShareModel;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.google.common.collect.ImmutableList;

/* loaded from: Cyn.class */
public final class Cyn implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public Cyn(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A05 = obj;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = i;
        this.A08 = str3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                CQT cqt = (CQT) this.A02;
                ContactShareModel contactShareModel = (ContactShareModel) this.A03;
                ImmutableList immutableList = (ImmutableList) this.A04;
                NavigationTrigger navigationTrigger = (NavigationTrigger) this.A05;
                String str = this.A06;
                String str2 = this.A07;
                int i = this.A01;
                String str3 = this.A08;
                Object obj2 = ((MailboxNullable) obj).value;
                if (obj2 != null) {
                    CQT.A04(navigationTrigger, contactShareModel, cqt, immutableList, str, str2, str3, ((1qX) obj2).mResultSet.getString(0, 1), i);
                    return;
                }
                return;
            case 1:
                Mailbox mailbox = (Mailbox) obj;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, (MailboxFutureImpl) this.A03, false, 0, 1, AbM.A0j(2Tk.A00, mailbox, this.A05), null, "MCAMailboxStatus", "FetchMusicPickerItems", Czl.A00(this, 60));
                return;
            default:
                return;
        }
    }
}
