package X;

import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;

/* loaded from: Crr.class */
public final class Crr implements DIp {
    public final int A00;
    public final Object A01;

    public Crr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9J(Btt btt) {
        boolean z;
        switch (this.A00) {
            case 0:
            case 3:
            case 4:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9L(PlatformSearchGameData platformSearchGameData) {
        boolean z;
        switch (this.A00) {
            case 0:
            case 3:
            case 4:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9N(PlatformSearchUserData platformSearchUserData) {
        boolean z;
        switch (this.A00) {
            case 0:
            case 3:
            case 4:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9W(ThreadSummary threadSummary) {
        boolean z;
        switch (this.A00) {
            case 0:
            case 3:
            case 4:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9Y(C1772As6 c1772As6) {
        boolean z;
        switch (this.A00) {
            case 0:
            case 3:
            case 4:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9g(MessageSearchMessageModel messageSearchMessageModel) {
        boolean z;
        switch (this.A00) {
            case 0:
            case 3:
            case 4:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9i(MessageSearchThreadModel messageSearchThreadModel) {
        boolean z;
        switch (this.A00) {
            case 0:
            case 3:
            case 4:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
    
        if (((r0.length() * 100) / X.7zQ.A05(r0)) >= 70) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r303 != false) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.DIp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object D9o(com.facebook.user.model.User r302) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Crr.D9o(com.facebook.user.model.User):java.lang.Object");
    }
}
