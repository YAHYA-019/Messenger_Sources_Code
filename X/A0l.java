package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.sharedalbum.mca.MailboxSharedAlbumJNI;
import java.util.List;

/* loaded from: A0l.class */
public final class A0l implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public A0l(MailboxFutureImpl mailboxFutureImpl, 8yG r303, List list, int i, long j, long j2, long j3) {
        this.A00 = i;
        this.A04 = r303;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = j3;
        this.A06 = list;
        this.A05 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        int i = this.A00;
        MailboxSharedAlbumJNI.dispatchVJJJOO(i != 0 ? 17 : 16, this.A02, this.A03, this.A01, obj, this.A06);
        7zO.A1V(this.A05);
    }
}
