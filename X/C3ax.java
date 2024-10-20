package X;

import com.facebook.community.mca.MailboxCommunityJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.simplejni.NativeHolder;

/* renamed from: X.3ax, reason: invalid class name */
/* loaded from: 3ax.class */
public final class C3ax implements MailboxCallback {
    public final /* synthetic */ BDi A00;
    public final /* synthetic */ 22I A01;
    public final /* synthetic */ MailboxCallback A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ PrivacyContext A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Number A06;

    public C3ax(BDi bDi, 22I r303, MailboxCallback mailboxCallback, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, Boolean bool, Number number) {
        this.A01 = r303;
        this.A06 = number;
        this.A05 = bool;
        this.A04 = privacyContext;
        this.A00 = bDi;
        this.A02 = mailboxCallback;
        this.A03 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NativeHolder nativeHolder = (NativeHolder) MailboxCommunityJNI.dispatchOOOOOO(10, obj, this.A06, this.A05, this.A04, new LXB(this, 4));
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        BDi bDi = this.A00;
        bDi.A01(nativeHolder);
        mailboxFutureImpl.setResult(bDi);
    }
}
