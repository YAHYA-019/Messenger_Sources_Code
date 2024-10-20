package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.3Ua, reason: invalid class name */
/* loaded from: 3Ua.class */
public final class C3Ua implements Observer {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ MutableLiveData A02;
    public final /* synthetic */ CQc A03;
    public final /* synthetic */ String A04;

    public C3Ua(Context context, ViewGroup viewGroup, MutableLiveData mutableLiveData, CQc cQc, String str) {
        this.A04 = str;
        this.A03 = cQc;
        this.A01 = viewGroup;
        this.A00 = context;
        this.A02 = mutableLiveData;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        if (AnonymousClass001.A1V(obj) && 11T.A0O(this.A04, "accept_admin_invite")) {
            CQc cQc = this.A03;
            1Bn.A0E((Context) null, cQc.A01.A00, 83105);
            ViewGroup viewGroup = this.A01;
            MigColorScheme migColorScheme = cQc.A0C;
            if (migColorScheme == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            String string = this.A00.getResources().getString(2131952444);
            11T.A0A(string);
            CMk.A01(viewGroup, migColorScheme, string);
        }
        this.A02.removeObserver(this);
    }
}
