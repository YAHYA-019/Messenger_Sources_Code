package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Cnz.class */
public final class Cnz implements C5rt {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CQ5 A01;
    public final /* synthetic */ SettableFuture A02;

    public Cnz(Context context, CQ5 cq5, SettableFuture settableFuture) {
        this.A02 = settableFuture;
        this.A01 = cq5;
        this.A00 = context;
    }

    @Override // X.C5rt
    public void Blg() {
        this.A02.setException(AnonymousClass001.A0T("onBitmapFetchFailed"));
    }

    @Override // X.C5rt
    public void BpW(List list) {
        2EY r0;
        Bitmap bitmap;
        CQ5 cq5 = this.A01;
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A09 = ((2EU) it.next()).A09();
            Bitmap bitmap2 = null;
            if ((A09 instanceof 2EY) && (r0 = (2EY) A09) != null && (bitmap = r0.A04) != null) {
                bitmap2 = cq5.A05(bitmap);
            }
            A0z.add(bitmap2);
        }
        2EU.A05(list);
        this.A02.set(A0z);
    }
}
