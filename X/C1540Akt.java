package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.fbui.widget.facepile.FacepileView;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Akt, reason: case insensitive filesystem */
/* loaded from: Akt.class */
public final class C1540Akt extends 1pK {
    public static final String __redex_internal_original_name = "InstallFb4aInterstitialFragment";
    public 2TR A00;
    public 2TR A01;
    public ImmutableList A02;
    public ImmutableList A03;
    public RJ2 A04;
    public final C00i A05 = 1BQ.A02(17024);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(C1540Akt c1540Akt) {
        ImmutableList copyOf;
        int i;
        Object[] objArr;
        if (c1540Akt.A03 == null && c1540Akt.A02 == null) {
            copyOf = ImmutableList.of();
        } else {
            LinkedHashMap A1C = 1BK.A1C();
            ImmutableList immutableList = c1540Akt.A02;
            if (immutableList != null) {
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    User A0t = AbG.A0t(it);
                    A1C.put(A0t.A13, A0t);
                }
            }
            ImmutableList immutableList2 = c1540Akt.A03;
            if (immutableList2 != null) {
                1Du it2 = immutableList2.iterator();
                while (it2.hasNext()) {
                    User A0t2 = AbG.A0t(it2);
                    A1C.put(A0t2.A13, A0t2);
                }
            }
            copyOf = ImmutableList.copyOf(A1C.values());
        }
        ArrayList A01 = 1JW.A01(10);
        1Du it3 = copyOf.iterator();
        int i2 = 0;
        while (it3.hasNext()) {
            User A0t3 = AbG.A0t(it3);
            if (i2 >= 10 || A0t3.A07() == null) {
                break;
            }
            Uri uri = null;
            try {
                uri = C0A2.A03(A0t3.A07());
            } catch (SecurityException unused) {
            }
            A01.add(uri);
            i2++;
        }
        FacepileView facepileView = c1540Akt.A04.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it4 = A01.iterator();
        while (it4.hasNext()) {
            A0s.add(new RYM((Uri) it4.next()));
        }
        FacepileView.A04(facepileView, A0s);
        c1540Akt.A04.A01.setVisibility(0);
        if (copyOf.size() != 0) {
            if (copyOf.size() == 1) {
                i = 2131958382;
                objArr = new Object[]{AbI.A0q(copyOf, 0).firstName};
            } else {
                int size = copyOf.size();
                String str = AbI.A0q(copyOf, 0).firstName;
                Name A0q = AbI.A0q(copyOf, 1);
                if (size == 2) {
                    i = 2131958383;
                    objArr = new Object[]{str, A0q.firstName};
                } else {
                    i = 2131958384;
                    objArr = new Object[]{str, A0q.firstName, AbI.A0q(copyOf, 2).firstName};
                }
            }
            c1540Akt.A04.A00.setText(c1540Akt.getString(i, objArr));
            c1540Akt.A04.A00.setVisibility(0);
        }
    }

    public 1iF A1R() {
        return AbF.A0C(797632700969515L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        String string = bundle2.getString("extra_user_id");
        string.getClass();
        C00i c00i = this.A05;
        c00i.get();
        2TR A00 = 2TN.A00(10);
        this.A01 = A00;
        A00.A01 = new Cbt(this, 6);
        2TR A03 = ((2TN) c00i.get()).A03(ImmutableList.of((Object) string));
        this.A00 = A03;
        A03.A01 = new Cbt(this, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(519009792);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        this.A01.A08();
        this.A00.A08();
        0FI.A08(458868052, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-761199565);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(2132542361, viewGroup, false);
        CZF.A01(inflate.findViewById(2131362679), this, 0);
        ((ImageView) inflate.findViewById(2131366733)).setImageResource(2132345513);
        this.A04 = new RJ2(AbF.A06(inflate, 2131363985), (FacepileView) inflate.findViewById(2131365698));
        0FI.A08(-1123192951, A02);
        return inflate;
    }
}
