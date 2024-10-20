package X;

import com.facebook.avatarartifacto.mca.MailboxAvatarArtifactoJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.simplejni.NativeHolder;

/* loaded from: A0f.class */
public final class A0f implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8yj A01;
    public final /* synthetic */ C6ku A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public A0f(C8yj c8yj, C6ku c6ku, MailboxFutureImpl mailboxFutureImpl, String str, String str2, String str3, int i) {
        this.A02 = c6ku;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = c8yj;
        this.A03 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NativeHolder nativeHolder = (NativeHolder) MailboxAvatarArtifactoJNI.dispatchOIIOOOOO(0, this.A00, 0, obj, this.A04, this.A05, this.A06, A1d.A00(this, 14));
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        C8yj c8yj = this.A01;
        c8yj.A01(nativeHolder);
        mailboxFutureImpl.setResult(c8yj);
    }
}
