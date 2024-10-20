package X;

import com.facebook.auth.credentials.DBLFacebookCredentials;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4th, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4th.class */
public final class C10454th implements InterfaceC10464ti {
    public final C00i A03 = new 1BQ(33013);
    public final C00i A01 = new 1BV(82326);
    public final C00i A04 = new 1BQ(68335);
    public final C00i A02 = new 1BQ(16511);
    public final C15h A06 = new G7G(this, 1);
    public final C00i A05 = new 1BV(49341);
    public final C00i A00 = FbInjector.A00;

    private ArrayList A00(1G2 r302) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((FbSharedPreferences) this.A03.get()).Ak5(r302).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            if (A0z != null && A0z.getValue() != null) {
                String str = null;
                try {
                    str = 1BK.A16(A0z);
                } catch (ClassCastException e) {
                    1BK.A09(this.A02).softReport("FB4ADBLStoreManager", 0Pz.A0j("retrieveCredentials: Error encountered in casting credential value from Object of type ", AnonymousClass001.A0Y(A0z.getValue()), " to String"), e);
                }
                if (str != null) {
                    try {
                        arrayList.add(((AnonymousClass244) this.A04.get()).A0V(str, DBLFacebookCredentials.class));
                    } catch (IOException e2) {
                        1BK.A09(this.A02).softReport("FB4ADBLStoreManager", 0Pz.A0V("Error encountered in reading the credentials from FbSharedPreferences, prefKey is ", r302), e2);
                    }
                }
            }
        }
        Collections.sort(arrayList, new AHU(this.A05.get(), 1));
        return arrayList;
    }

    public ArrayList A01() {
        C15h c15h = this.A06;
        ((C10474tj) c15h.get()).A00("retrieve_one_tap_login_accounts_start");
        ArrayList A00 = A00(C1mC.A04);
        C10474tj c10474tj = (C10474tj) c15h.get();
        ((QuickPerformanceLogger) c10474tj.A00.get()).markerAnnotate(2298603, "retrieve_one_tap_login_accounts_number_of_accounts_retrieved", A00.size());
        ((C10474tj) c15h.get()).A00("retrieve_one_tap_login_accounts_done");
        return A00;
    }

    public ArrayList A02() {
        C15h c15h = this.A06;
        ((C10474tj) c15h.get()).A00("retrieve_password_accounts_start");
        ArrayList A00 = A00(C1mC.A0N);
        C10474tj c10474tj = (C10474tj) c15h.get();
        ((QuickPerformanceLogger) c10474tj.A00.get()).markerAnnotate(2298603, "retrieve_password_accounts_number_of_accounts_retrieved", A00.size());
        ((C10474tj) c15h.get()).A00("retrieve_password_accounts_done");
        return A00;
    }

    @Override // X.InterfaceC10464ti
    public boolean BS9(String str) {
        if (str == null) {
            return false;
        }
        return ((FbSharedPreferences) this.A03.get()).BNM(C1mC.A04.A0D(str));
    }

    @Override // X.InterfaceC10464ti
    public boolean BUk(String str) {
        if (str == null || str.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            return false;
        }
        return ((FbSharedPreferences) this.A03.get()).BNM(C1mC.A0N.A0D(str));
    }

    @Override // X.InterfaceC10464ti
    public boolean BUr(String str) {
        DBLFacebookCredentials CiT;
        boolean z = false;
        if (BS9(str) && (CiT = CiT(str)) != null && "".equals(CiT.mNonce)) {
            z = true;
        }
        return z;
    }

    @Override // X.InterfaceC10464ti
    public DBLFacebookCredentials CiT(String str) {
        if (str == null) {
            return null;
        }
        String BD0 = ((FbSharedPreferences) this.A03.get()).BD0((BUk(str) ? C1mC.A0N : C1mC.A04).A0D(str));
        if (BD0 == null) {
            return null;
        }
        try {
            return (DBLFacebookCredentials) ((AnonymousClass244) this.A04.get()).A0V(BD0, DBLFacebookCredentials.class);
        } catch (IOException e) {
            1BK.A09(this.A02).softReport("FB4ADBLStoreManager", "Error encountered in reading the DBLcredentials from FbSharedPreferences", e);
            return null;
        }
    }

    @Override // X.InterfaceC10464ti
    public ArrayList CiU() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(A01());
        arrayList.addAll(A02());
        Collections.sort(arrayList, new AHU(this.A05.get(), 1));
        return arrayList;
    }
}
