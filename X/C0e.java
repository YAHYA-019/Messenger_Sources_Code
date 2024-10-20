package X;

import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.google.common.collect.ImmutableList;

/* loaded from: C0e.class */
public final class C0e {
    public final /* synthetic */ B4e A00;

    public C0e(B4e b4e) {
        this.A00 = b4e;
    }

    /* JADX WARN: Type inference failed for: r0v73, types: [X.B4e, androidx.fragment.app.Fragment] */
    public void A00(String str, boolean z) {
        java.util.Map map;
        String str2;
        if (z) {
            ?? r0 = this.A00;
            FbUserSession fbUserSession = r0.A01;
            if (fbUserSession == null) {
                str2 = "fbUserSession";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            }
            CIe cIe = (CIe) 7zN.A0m((Fragment) r0, fbUserSession, 83623);
            if (cIe.A00 != null && cIe.A01 == null) {
                1UG A08 = 1BK.A08(1Br.A02(cIe.A04), 1BJ.A00(1393));
                String str3 = cIe.A00;
                if (A08.isSampled() && str3 != null) {
                    AbF.A1N(A08, str3);
                    A08.A7R("index_char", str);
                    A08.BZL();
                }
            }
        }
        B4e b4e = this.A00;
        java.util.Map map2 = b4e.A0O;
        if ((map2 == null || !map2.containsKey(str)) && b4e.A0I.size() != 0) {
            int indexOf = b4e.A0N.indexOf(str) + 1;
            Object obj = b4e.A0N.get(indexOf);
            while (indexOf < b4e.A0N.size() && (map = b4e.A0O) != null && !map.containsKey(obj)) {
                indexOf++;
            }
            if (indexOf >= b4e.A0N.size()) {
                ImmutableList immutableList = b4e.A0I;
                Object obj2 = immutableList.get(immutableList.size() - 1);
                11T.A0I(obj2, "null cannot be cast to non-null type com.facebook.messaging.graph.contactmanagement.listitem.ContactListItem");
                String str4 = ((56C) obj2).A01;
                if (str4 != null) {
                    str = str4;
                }
            } else {
                str = 1BK.A14(b4e.A0N, indexOf);
            }
        }
        b4e.A0J = str;
        LithoView lithoView = b4e.A05;
        if (lithoView != null) {
            lithoView.post(b4e.A0d);
        } else {
            str2 = "contactsListView";
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
    }
}
