package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.callmanager.gen.AppModelListener;
import java.util.Iterator;

/* loaded from: GwK.class */
public final class GwK extends AppModelListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ If3 A01;

    public GwK(Context context, If3 if3) {
        this.A00 = context;
        this.A01 = if3;
    }

    @Override // com.facebook.rsys.callmanager.gen.AppModelListener
    public void onModels(java.util.Map map) {
        11T.A0F(map, 0);
        FbUserSession A0F = 4YV.A0F(this.A00);
        If3 if3 = this.A01;
        2JS A00 = ((HmZ) 1Br.A0B(if3.A00)).A00(A0F, map);
        if3.A04 = A00;
        Iterator it = if3.A02.iterator();
        while (it.hasNext()) {
            ((JIr) it.next()).C7M(if3, A00);
        }
    }
}
