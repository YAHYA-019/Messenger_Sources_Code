package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.service.model.virtualfolders.FetchVirtualFolderThreadsResult;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* loaded from: Cc6.class */
public final class Cc6 implements 2SQ, CallerContextable {
    public static final String __redex_internal_original_name = "VirtualFolderLoader";
    public 2eS A00;
    public 2eS A01;
    public 2TV A02;
    public 1BY A03;
    public FetchVirtualFolderThreadsResult A04;
    public C9P A05;
    public final C00i A06 = 1BV.A01((1BY) null, 33031);
    public final C00i A08 = 1BQ.A01();
    public final C00i A09 = AbH.A0F();
    public final C00i A07 = 1BQ.A02(17063);

    public Cc6(1BO r302) {
        HashSet A0v = AnonymousClass001.A0v();
        this.A04 = new FetchVirtualFolderThreadsResult(null, null, 1Hk.A09, ImmutableList.of(), A0v, 0L);
        this.A03 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0172, code lost:
    
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x029a, code lost:
    
        if (r0 != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(X.C9P r302) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cc6.A00(X.C9P):void");
    }

    public void AEC() {
        if (this.A01 != null) {
            AbF.A0b(this.A07).A00(this.A05, (Object) null, "cancelLoad", __redex_internal_original_name);
            this.A01.A00(false);
            this.A01 = null;
        }
        if (this.A00 != null) {
            AbF.A0b(this.A07).A00(this.A05, (Object) null, "cancelLoadMore", __redex_internal_original_name);
            this.A00.A00(false);
            this.A00 = null;
        }
    }

    public void CmR(2TV r302) {
        this.A02 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
