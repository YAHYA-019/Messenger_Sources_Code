package X;

import android.text.TextUtils;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.prefs.shared.FbSharedPreferences;
import org.json.JSONException;

/* renamed from: X.4qD, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4qD.class */
public final class C09474qD implements InterfaceC09434q3 {
    public C7y6 A00;
    public final C00i A04 = new 1BV(49870);
    public final C00i A03 = new 1BQ(49868);
    public final C00i A06 = new 1BQ(49867);
    public final C00i A02 = new 1BQ(66658);
    public boolean A01 = false;
    public final 2TV A05 = new 4qE(this);

    public C09474qD() {
        D0R d0r = new D0R(this, 2);
        1P9 r0 = new 1P9((1I6) 1Hv.A02(FbInjector.A00(), 16598));
        r0.A05(d0r, "com.facebook.orca.ACTION_SOAP_ACCOUNTS_UPDATED");
        r0.A02().A00();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.5vf, java.lang.Object] */
    public void A00(Integer num) {
        C00i c00i = this.A06;
        if (((2UV) c00i.get()).A00 == null) {
            ((2UV) c00i.get()).CmR(this.A05);
            2UV r0 = (2UV) c00i.get();
            ?? obj = new Object();
            obj.A00 = num;
            r0.D1t((Object) obj);
        }
    }

    @Override // X.InterfaceC09434q3
    public MessengerAccountInfo AVA(String str) {
        C5vj c5vj = (C5vj) this.A04.get();
        C00i c00i = c5vj.A01;
        c00i.get();
        1G2 A0D = C1f0.A0D.A0D(str);
        synchronized (c5vj) {
            String BD0 = ((FbSharedPreferences) c00i.get()).BD0(A0D);
            if (BD0 != null) {
                try {
                    MessengerAccountInfo A02 = AbstractC09454q5.A02(BD0);
                    if (!TextUtils.isEmpty(A02.A05) && !TextUtils.isEmpty(A02.A0A)) {
                        return A02;
                    }
                } catch (JSONException e) {
                    1BK.A09(c5vj.A00).softReport("Corrupt MessengerSOAPAccountInfo Read", BD0, e);
                }
                1Ql A0V = 1BL.A0V(c00i);
                A0V.Cdj(A0D);
                A0V.commit();
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r0.A00().A0L(-816631278, X.2JX.class, 1964783397).A0L(266399994, X.2JX.class, 1822193745) == null) goto L35;
     */
    @Override // X.InterfaceC09434q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List AVB() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09474qD.AVB():java.util.List");
    }

    @Override // X.InterfaceC09434q3
    public int Azj() {
        C5vj c5vj = (C5vj) this.A04.get();
        if (!c5vj.A05 || !c5vj.A04) {
            c5vj.A01.get();
            C5vj.A00(c5vj);
        }
        return c5vj.A03;
    }

    @Override // X.InterfaceC09434q3
    public boolean BNP() {
        return false;
    }

    @Override // X.InterfaceC09434q3
    public MessengerAccountInfo Cby() {
        return null;
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
        C5vg c5vg = (C5vg) this.A03.get();
        synchronized (c5vg) {
            c5vg.A02 = null;
            c5vg.A03 = null;
            c5vg.A00 = 0L;
        }
        ((C5vj) this.A04.get()).A01();
    }
}
