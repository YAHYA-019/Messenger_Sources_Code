package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Ibv.class */
public final class Ibv implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Ibv(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public Ibv(JOe jOe, LiveLocationSession liveLocationSession, ITQ itq, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = jOe;
            this.A03 = itq;
            this.A01 = liveLocationSession;
        } else {
            this.A01 = jOe;
            this.A03 = itq;
            this.A02 = liveLocationSession;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a1, code lost:
    
        if (r303.longValue() != (-1)) goto L15;
     */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ibv.onCompletion(java.lang.Object):void");
    }
}
