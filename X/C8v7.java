package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8v7, reason: invalid class name */
/* loaded from: 8v7.class */
public final class C8v7 extends BJB {
    public static final String __redex_internal_original_name = "EncryptedBackupsUserKeyManagementFragment";
    public 9ZQ A00;
    public C5ic A01;
    public C1wv A02;
    public final C01i A03;
    public final C01i A04;

    public C8v7() {
        C03i c03i = C03i.A02;
        this.A04 = C01g.A00(c03i, new AKJ(this, 14));
        this.A03 = C01g.A00(c03i, new AKJ(this, 13));
    }

    public 1iF A1R() {
        return 7zR.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A00 = (9ZQ) 7zN.A0n(this, A01, 68378);
        this.A01 = 7zQ.A0l();
        this.A02 = (C1wv) 7zN.A0n(this, A01, 68883);
    }

    public void A1c() {
        String str;
        boolean z;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView != null) {
            9ZQ r0 = this.A00;
            if (r0 == null) {
                str = "viewData";
            } else {
                C87p c87p = new C87p(11T.A0O(r0.A01.getValue(), C8tb.A00), 4);
                RFU rfu = (RFU) this.A04.getValue();
                RFT rft = (RFT) this.A03.getValue();
                9ZQ r02 = this.A00;
                str = "viewData";
                if (r02 != null) {
                    List list = r02.A00;
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = list.iterator();
                    while (true) {
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        C96p c96p = ((C9cd) next).A00;
                        if (c96p == C96p.A08 || c96p == C96p.A0D || c96p == C96p.A0B) {
                            A0s.add(next);
                        }
                    }
                    if (!11T.A0O(r02.A01.getValue(), C8tf.A00) && A0s.size() > 1) {
                        z = true;
                    }
                    8Lr r03 = new 8Lr(list, 3, z);
                    MigColorScheme migColorScheme = ((BJB) this).A01;
                    11T.A0A(migColorScheme);
                    lithoView.A0y(new C8aq(c87p, r03, rft, rfu, migColorScheme));
                    return;
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1193798245);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(532179077, A04);
        return A0J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        String str;
        int A02 = 0FI.A02(533527090);
        super/*androidx.fragment.app.Fragment*/.onResume();
        9ZQ r0 = this.A00;
        if (r0 == null) {
            str = "viewData";
        } else {
            C1wv c1wv = this.A02;
            if (c1wv != null) {
                C1wv.A04(c1wv);
                C9qq.A01(this, c1wv.A02, r0, 63);
                0FI.A08(153331924, A02);
                return;
            }
            str = "backupStatusRepo";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        9ZQ r0 = this.A00;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C9qq.A00(this, r0.A01, 62);
    }
}
