package X;

import com.facebook.fbservice.service.ServiceException;
import java.util.Iterator;
import java.util.List;

/* loaded from: DA7.class */
public final class DA7 implements Runnable {
    public static final String __redex_internal_original_name = "MsysThreadViewQuerySubscriber$callbackWithError$1";
    public final /* synthetic */ 5VT A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public DA7(5VT r302, String str, String str2, boolean z, boolean z2) {
        this.A00 = r302;
        this.A02 = str;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A00.A0T;
        String str = this.A02;
        boolean z = this.A03;
        boolean z2 = this.A04;
        String str2 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            6iS r0 = (6iS) ((82Z) it.next()).A01;
            ServiceException A00 = ServiceException.A00(AnonymousClass001.A0T(str2));
            11T.A0A(A00);
            r0.A00(A00, str, z, z2, true);
        }
    }
}
