package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Czg.class */
public final class Czg implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Czg(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public Czg(22I r302, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, int i) {
        this.A00 = i;
        this.A01 = r302;
        this.A02 = mailboxFutureImpl;
        this.A03 = privacyContext;
    }

    public static Czg A00(Object obj, Object obj2, Object obj3, int i) {
        return new Czg(i, obj, obj2, obj3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0552  */
    /* JADX WARN: Type inference failed for: r0v1325, types: [com.facebook.messaging.communitymessaging.communityprofile.CommunityEditingProfileFragment, androidx.fragment.app.Fragment] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 8111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Czg.onCompletion(java.lang.Object):void");
    }
}
