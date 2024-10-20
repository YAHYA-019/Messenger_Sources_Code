package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.photos.service.MediaMessageItem;

/* renamed from: X.Gfn, reason: case insensitive filesystem */
/* loaded from: Gfn.class */
public final class C2507Gfn extends 2rI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C2507Gfn(int i) {
        this.A00 = i;
    }

    public C2507Gfn(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void A02(1OW r302) {
        switch (this.A00) {
            case 1:
                11T.A0F(r302, 0);
                JJp jJp = (JJp) this.A01;
                Throwable AlY = r302.AlY();
                if (AlY == null) {
                    throw 1BK.A0h();
                }
                jJp.onFailure(AlY);
                return;
            case 2:
                IPt iPt = (IPt) this.A01;
                CallerContext callerContext = IPt.A05;
                if (iPt.A01 != null) {
                    MediaMessageItem mediaMessageItem = (MediaMessageItem) this.A03;
                    0fH.A14("MediaViewFragment", "Download replace image failed MessageId: %s, ImageId: %s", new Object[]{mediaMessageItem.Awv(), mediaMessageItem.AqA()});
                    return;
                }
                return;
            case 3:
                11T.A0F(r302, 0);
                ((JJP) this.A02).BM3(r302.AlY());
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ac, code lost:
    
        if (X.C6tC.A03 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
    
        if (r307 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.1OW r302) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2507Gfn.A03(X.1OW):void");
    }
}
