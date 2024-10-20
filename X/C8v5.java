package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8v5, reason: invalid class name */
/* loaded from: 8v5.class */
public final class C8v5 extends BJB {
    public static final String __redex_internal_original_name = "StorageManagementSettingFragment";
    public C9a7 A00;
    public FbUserSession A01;
    public C9aj A02;
    public MigColorScheme A03;
    public final C01i A04 = C01g.A00(C03i.A02, new DCz(this, 11));

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        String str;
        super.A1S(bundle);
        this.A01 = 1BM.A01(this);
        1Bn.A0A(147754);
        requireContext();
        FbUserSession fbUserSession = this.A01;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            this.A00 = new C9a7(fbUserSession);
            C9aj c9aj = (C9aj) 1Bi.A03(68501);
            this.A02 = c9aj;
            if (c9aj != null) {
                C00i c00i = c9aj.A01.A00;
                long generateNewFlowId = 7zN.A0c(c00i).generateNewFlowId(589047881);
                Long valueOf = Long.valueOf(generateNewFlowId);
                c9aj.A00 = valueOf;
                if (valueOf != null) {
                    7zN.A1Z(7zN.A0c(c00i), "SETTING", generateNewFlowId, false);
                }
                this.A03 = 7zS.A0j(this);
                return;
            }
            str = "storageManagementSettingsLogger";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A1c() {
        String str;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView != null) {
            Bi8 bi8 = (Bi8) this.A04.getValue();
            MigColorScheme migColorScheme = this.A03;
            if (migColorScheme == null) {
                str = "colorScheme";
            } else {
                C9a7 c9a7 = this.A00;
                if (c9a7 != null) {
                    lithoView.A0y(new 8Y1(bi8, c9a7, migColorScheme));
                    return;
                }
                str = "viewData";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = 0FI.A02(849811751);
        Context requireContext = requireContext();
        Bi8 bi8 = (Bi8) this.A04.getValue();
        MigColorScheme migColorScheme = this.A03;
        if (migColorScheme == null) {
            str = "colorScheme";
        } else {
            C9a7 c9a7 = this.A00;
            if (c9a7 != null) {
                LithoView A0W = 7zO.A0W(requireContext, this, new 8Y1(bi8, c9a7, migColorScheme));
                0FI.A08(-746894671, A02);
                return A0W;
            }
            str = "viewData";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void onDestroy() {
        String str;
        int A02 = 0FI.A02(1585117320);
        super/*X.DZJ*/.onDestroy();
        C9a7 c9a7 = this.A00;
        if (c9a7 == null) {
            str = "viewData";
        } else {
            C00i c00i = c9a7.A0B.A00;
            C9aj c9aj = (C9aj) c00i.get();
            C00i c00i2 = c9a7.A09.A00;
            c9aj.A01("ENDING_MESSENGER_MEDIA_SIZE", ((9Ag) 1Br.A0B(((9Zn) c00i2.get()).A04)).A00);
            ((C9aj) c00i.get()).A01("ENDING_OTHER_APPS_SIZE", ((9Ag) 1Br.A0B(((9Zn) c00i2.get()).A05)).A00);
            ((C9aj) c00i.get()).A01("ENDING_TOTAL_DEVICE_CAPACITY", ((9Zn) c00i2.get()).A00());
            ((C9aj) c00i.get()).A01("ENDING_TOTAL_MEDIA_COUNT", c9a7.A00);
            C9aj c9aj2 = this.A02;
            if (c9aj2 != null) {
                Long l = c9aj2.A00;
                if (l != null) {
                    4YV.A0Z(c9aj2.A01).flowEndSuccess(l.longValue());
                }
                0FI.A08(-574005528, A02);
                return;
            }
            str = "storageManagementSettingsLogger";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-685591242);
        super/*androidx.fragment.app.Fragment*/.onResume();
        C9a7 c9a7 = this.A00;
        if (c9a7 != null) {
            9Zn r0 = (9Zn) 1Br.A0B(c9a7.A09);
            Iterator it = ((List) r0.A01.getValue()).iterator();
            while (it.hasNext()) {
                ((9Ag) it.next()).A02(new DCz(r0, 13));
            }
            C9a7 c9a72 = this.A00;
            if (c9a72 != null) {
                1FV A00 = 9mQ.A00((9mQ) 1Br.A0B(c9a72.A06), (Long) null, 4);
                1Br.A0D(c9a72.A07, AC8.A00(c9a72, 42), A00);
                C9a7 c9a73 = this.A00;
                if (c9a73 != null) {
                    9mQ r02 = (9mQ) 1Br.A0B(c9a73.A06);
                    1FV A0j = 4YU.A0j();
                    A1f A002 = A1f.A00(A0j, r02, 60);
                    MailboxFeature A0d = 7zP.A0d(r02.A00);
                    1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(2);
                    MailboxFutureImpl A0P = 1BK.A0P(AQV);
                    1Um.A00(AQV, A1e.A00(0L, A0d, A0P, 2), A0P);
                    A0P.addResultCallback(A002);
                    1Br.A0D(c9a73.A07, AC8.A00(c9a73, 43), A0j);
                    C9a7 c9a74 = this.A00;
                    if (c9a74 != null) {
                        c9a74.A00(1Br.A07(((9Kc) 1Br.A0B(c9a74.A0A)).A00).Auy(36607797265309515L));
                        0FI.A08(-602552466, A02);
                        return;
                    }
                }
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }
}
