package X;

import android.text.TextUtils;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.accountswitch.model.MessengerAccountType;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;
import org.json.JSONException;

/* renamed from: X.4q9, reason: invalid class name */
/* loaded from: 4q9.class */
public final class C4q9 implements InterfaceC09434q3 {
    public C7y6 A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;

    public C4q9() {
        1BQ r0 = new 1BQ(49281);
        this.A01 = r0;
        this.A03 = new 1BQ(17077);
        1BV r02 = new 1BV(49280);
        this.A02 = r02;
        D0R d0r = new D0R(this, 1);
        1P9 r03 = new 1P9((1I6) 1Hv.A02(FbInjector.A00(), 16598));
        r03.A05(d0r, "com.facebook.orca.ACTION_ADMINED_PAGES_INVALIDATE");
        r03.A05(d0r, "com.facebook.orca.ACTION_ADMINED_PAGES_INVALIDATE_COMPLETED");
        r03.A05(d0r, "com.facebook.orca.ACTION_ADMINED_PAGES_UPDATED");
        r03.A02().A00();
        ((4qA) r02.get()).A02(FbInjector.A00(), ((4qC) r0.get()).A02());
        C7y6 c7y6 = this.A00;
        if (c7y6 != null) {
            c7y6.BhO();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        if (X.09K.A01(r0.A2K(-64262029, 1252421754)) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0122, code lost:
    
        if (r0.A02().A1w().A1n() == null) goto L61;
     */
    @Override // X.InterfaceC09434q3
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList AVB() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4q9.AVB():java.util.ArrayList");
    }

    @Override // X.InterfaceC09434q3
    public MessengerAccountInfo AVA(String str) {
        4qA r0 = (4qA) this.A02.get();
        C00i c00i = r0.A01;
        c00i.get();
        1G2 A0D = C1f0.A0C.A0D(str);
        synchronized (r0) {
            String BD0 = ((FbSharedPreferences) c00i.get()).BD0(A0D);
            if (BD0 != null) {
                try {
                    MessengerAccountInfo A02 = AbstractC09454q5.A02(BD0);
                    if (!TextUtils.isEmpty(A02.A05) && !TextUtils.isEmpty(A02.A0A)) {
                        return A02;
                    }
                } catch (JSONException e) {
                    1BK.A09(r0.A00).softReport("Corrupt MessengerAccountInfo Read", BD0, e);
                }
                1Ql A0V = 1BL.A0V(c00i);
                A0V.Cdj(A0D);
                A0V.commit();
            }
            return null;
        }
    }

    @Override // X.InterfaceC09434q3
    public int Azj() {
        4qA r0 = (4qA) this.A02.get();
        if (!r0.A04 || !r0.A03) {
            r0.A01.get();
            4qA.A00(r0);
        }
        return r0.A02;
    }

    @Override // X.InterfaceC09434q3
    public boolean BNP() {
        return false;
    }

    @Override // X.InterfaceC09434q3
    public MessengerAccountInfo Cby() {
        User user = (User) 1Bn.A0A(83430);
        if (user == null) {
            return null;
        }
        String str = user.A13;
        MessengerAccountInfo AVA = AVA(str);
        if (AVA == null || AVA.A05 == null) {
            MessengerAccountType messengerAccountType = MessengerAccountInfo.A0F;
            String str2 = user.A0X.displayName;
            boolean A0E = user.A0E();
            if (A0E) {
                messengerAccountType = MessengerAccountType.A07;
            }
            AVA = new MessengerAccountInfo(messengerAccountType, null, str2, null, null, null, null, str, 0, -1, 0L, false, false, A0E, false);
        }
        return AVA;
    }

    @Override // X.InterfaceC09434q3
    public void Cdr(String str) {
    }

    @Override // X.InterfaceC09434q3
    public void CjN(MessengerAccountInfo messengerAccountInfo) {
    }

    @Override // X.InterfaceC09434q3
    public void CqZ(C7y6 c7y6) {
        this.A00 = c7y6;
    }

    @Override // X.InterfaceC09434q3
    public void clear() {
    }
}
