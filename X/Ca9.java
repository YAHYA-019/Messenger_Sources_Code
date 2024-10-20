package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.List;

/* loaded from: Ca9.class */
public final class Ca9 implements Observer {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ LiveData A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ CIE A04;
    public final /* synthetic */ 9QW A05;
    public final /* synthetic */ ThreadSummary A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ C00m A09;

    public Ca9(Context context, 06Z r303, LiveData liveData, FbUserSession fbUserSession, CIE cie, 9QW r307, ThreadSummary threadSummary, Integer num, String str, C00m c00m) {
        this.A04 = cie;
        this.A03 = fbUserSession;
        this.A00 = context;
        this.A06 = threadSummary;
        this.A01 = r303;
        this.A07 = num;
        this.A08 = str;
        this.A05 = r307;
        this.A09 = c00m;
        this.A02 = liveData;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        List A13 = 7zO.A13(obj);
        CIE cie = this.A04;
        FbUserSession fbUserSession = this.A03;
        Context context = this.A00;
        ThreadSummary threadSummary = this.A06;
        CIE.A00(context, this.A01, fbUserSession, cie, this.A05, threadSummary, this.A07, this.A08, A13, this.A09);
        this.A02.removeObserver(this);
    }
}
