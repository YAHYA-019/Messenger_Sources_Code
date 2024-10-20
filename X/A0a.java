package X;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import com.facebook.advancedcryptotransportdiskmanager.mca.MailboxAdvancedCryptoTransportDiskManagerJNI;
import com.facebook.community.mca.MailboxCommunityJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;
import com.facebook.threadtheme.mca.MailboxThreadThemeJNI;
import com.facebook.xapp.messaging.polls.model.PollDetails;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: A0a.class */
public final class A0a implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public A0a(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj4;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A04 = obj5;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NativeHolder nativeHolder;
        MailboxObservableImpl mailboxObservableImpl;
        Object obj2;
        Mailbox mailbox;
        NotificationScope listenForTaskCompletion;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        PrivacyContext privacyContext;
        A1g A01;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(C2cx.A00, 51);
                NotificationScope A00 = A1k.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 2);
                7zL.A1O(A00, this.A02, A1D);
                MailboxAdvancedCryptoTransportDiskManagerJNI.dispatchVOOOOO(6, accountSession, this.A04, this.A05, this.A03, A00);
                return;
            case 1:
                nativeHolder = (NativeHolder) MailboxCommunityJNI.dispatchOOOOO(28, obj, this.A03, this.A02, A1d.A00(this, 20));
                mailboxObservableImpl = (MailboxObservableImpl) this.A04;
                obj2 = this.A05;
                1XK r0 = (1XK) obj2;
                r0.A01(nativeHolder);
                mailboxObservableImpl.setResult(r0);
                return;
            case 2:
                nativeHolder = (NativeHolder) MailboxCommunityJNI.dispatchOOOOOZ(30, obj, this.A02, this.A05, A1d.A00(this, 21), false);
                mailboxObservableImpl = (MailboxObservableImpl) this.A03;
                obj2 = this.A04;
                1XK r02 = (1XK) obj2;
                r02.A01(nativeHolder);
                mailboxObservableImpl.setResult(r02);
                return;
            case 3:
                mailbox = (Mailbox) obj;
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(1yI.A00, (MailboxFutureImpl) this.A05, mailbox);
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                bool = false;
                privacyContext = (PrivacyContext) this.A03;
                A01 = A1g.A01(this, 61);
                str = "MCAMailboxHighlightsTab";
                str2 = "AddRealtimeSeenState";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, listenForTaskCompletion, privacyContext, str, str2, A01);
                return;
            case 4:
                mailbox = (Mailbox) obj;
                listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(1yI.A00, (MailboxFutureImpl) this.A05, mailbox);
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                bool = false;
                privacyContext = (PrivacyContext) this.A03;
                A01 = A1g.A01(this, 63);
                str = "MCAMailboxHighlightsTab";
                str2 = "MarkHighlightsTabIsSeen";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, listenForTaskCompletion, privacyContext, str, str2, A01);
                return;
            case 5:
                List list = (List) this.A03;
                1qX r03 = (1qX) ((MailboxNullable) obj).value;
                PollDetails pollDetails = (PollDetails) this.A02;
                if (r03 != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    int A002 = 1qX.A00(r03);
                    for (int i = 0; i < A002; i++) {
                        if (r03.mResultSet.getLong(i, 0) == pollDetails.A02) {
                            A0s.add(String.valueOf(7zQ.A0F(r03, i)));
                            A0s2.add(String.valueOf(7zP.A0k(r03, i)));
                            try {
                                Uri A03 = C0A2.A03(String.valueOf(7zP.A0m(r03, i)));
                                if (A03 != null) {
                                    A0s3.add(A03);
                                }
                            } catch (SecurityException unused) {
                            }
                        }
                    }
                    boolean z = pollDetails.A0A;
                    boolean z2 = pollDetails.A0B;
                    long j = pollDetails.A02;
                    String str3 = pollDetails.A08;
                    Long l = pollDetails.A07;
                    String str4 = pollDetails.A09;
                    long j2 = pollDetails.A03;
                    int i2 = pollDetails.A00;
                    int i3 = pollDetails.A01;
                    ImmutableList A003 = 0DW.A00(A0s);
                    C1pq.A08("voterIds", A003);
                    ImmutableList A004 = 0DW.A00(A0s2);
                    C1pq.A08("voterNames", A004);
                    ImmutableList A005 = 0DW.A00(A0s3);
                    C1pq.A08("voterUris", A005);
                    pollDetails = new PollDetails(A003, A004, A005, l, str3, str4, i2, i3, j, j2, z, z2);
                }
                list.add(pollDetails);
                if (list.size() == ((List) this.A04).size()) {
                    ((LiveData) this.A01).postValue(list);
                    return;
                }
                return;
            default:
                Mailbox mailbox2 = (Mailbox) obj;
                String A1D2 = 7zM.A1D(6CT.A00, 2);
                NotificationScope A006 = A1j.A00(mailbox2.getSessionedNotificationCenterCallbackManager(), this, A1D2, 24);
                7zL.A1O(A006, this.A03, A1D2);
                MailboxThreadThemeJNI.dispatchVOOOOOZ(4, mailbox2, this.A04, this.A05, this.A02, A006, true);
                return;
        }
    }
}
