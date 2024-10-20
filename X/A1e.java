package X;

import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* loaded from: A1e.class */
public final class A1e implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public A1e(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public A1e(1Br r302, 9Yf r303, 9Tk r304, int i) {
        this.A00 = i;
        if (39 - i != 0) {
            this.A03 = r304;
            this.A01 = r303;
        } else {
            this.A01 = r303;
            this.A03 = r304;
        }
        this.A02 = r302;
    }

    public A1e(C2cx c2cx, MailboxFutureImpl mailboxFutureImpl, List list, int i) {
        this.A00 = i;
        this.A01 = c2cx;
        if (1 - i != 0) {
            this.A03 = mailboxFutureImpl;
            this.A02 = list;
        } else {
            this.A02 = mailboxFutureImpl;
            this.A03 = list;
        }
    }

    public A1e(C8yq c8yq, 2UF r303, MailboxFutureImpl mailboxFutureImpl, int i) {
        this.A00 = i;
        this.A01 = r303;
        if (27 - i != 0) {
            this.A03 = c8yq;
            this.A02 = mailboxFutureImpl;
        } else {
            this.A02 = c8yq;
            this.A03 = mailboxFutureImpl;
        }
    }

    public A1e(C9a8 c9a8, CommunityMessagingInviteLinkData communityMessagingInviteLinkData, C00m c00m, int i) {
        this.A00 = i;
        switch (i) {
            case 33:
            case 34:
                this.A01 = c00m;
                this.A03 = c9a8;
                break;
            default:
                this.A03 = c9a8;
                this.A01 = c00m;
                break;
        }
        this.A02 = communityMessagingInviteLinkData;
    }

    public static A1e A00(Object obj, Object obj2, Object obj3, int i) {
        return new A1e(i, obj, obj2, obj3);
    }

    public static NativeHolder A01(A1e a1e) {
        return ((1XK) a1e.A03).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0337, code lost:
    
        if (r0.length() <= 0) goto L31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v283, types: [X.8yq, com.facebook.msys.mca.MailboxObservable] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 4198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1e.onCompletion(java.lang.Object):void");
    }
}
