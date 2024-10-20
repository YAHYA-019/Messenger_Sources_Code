package X;

import android.content.Context;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.accountswitch.model.MessengerAccountType;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import org.json.JSONException;

/* renamed from: X.5vj, reason: invalid class name */
/* loaded from: 5vj.class */
public final class C5vj {
    public volatile int A03;
    public volatile boolean A04;
    public volatile boolean A05;
    public final C00i A01 = new 1BQ(33013);
    public final C00i A02 = new 1BQ(66417);
    public final C00i A00 = new 1BQ(16511);

    public C5vj() {
        if (1Bi.A03(83604) == C0et.A0P) {
            Context context = null;
            try {
                context = C0f1.A00();
            } catch (IllegalStateException unused) {
            }
            if (context != null) {
                this.A05 = true;
                ((FbSharedPreferences) this.A01.get()).CcT(new Runnable() { // from class: X.5vk
                    public static final String __redex_internal_original_name = "MessengerSOAPAccountsStorageHandler$1";

                    @Override // java.lang.Runnable
                    public void run() {
                        C5vj c5vj = C5vj.this;
                        if (c5vj.A04) {
                            return;
                        }
                        if (c5vj.A05 && c5vj.A04) {
                            return;
                        }
                        c5vj.A01.get();
                        C5vj.A00(c5vj);
                    }
                });
            }
        }
    }

    public static void A00(C5vj c5vj) {
        int size;
        synchronized (c5vj) {
            C00j.A05("MessengerSOAPAccountsStorageHandler.getAccountEntriesCount", 1852164031);
            try {
                size = ((FbSharedPreferences) c5vj.A01.get()).Ak5(C1f0.A0D).entrySet().size();
                C00j.A01(-1986573579);
            } catch (Throwable th) {
                C00j.A01(1607051896);
                throw th;
            }
        }
        c5vj.A03 = size;
        c5vj.A04 = true;
    }

    public void A01() {
        C00i c00i = this.A01;
        c00i.get();
        synchronized (this) {
            1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
            edit.CfI(C1f0.A0D);
            edit.commitImmediately();
        }
    }

    public void A02(2JX r302) {
        2JY A0L;
        2JY A0L2;
        2JY A0X;
        2JY A0L3;
        String A0r;
        A01();
        if (r302 == null || (A0L = r302.A0L(-816631278, 2JX.class, 1964783397)) == null || (A0L2 = A0L.A0L(266399994, 2JX.class, 1822193745)) == null || (A0X = A0L2.A0X(2JX.class, -1523389916, 2645995, -645286696)) == null || (A0L3 = A0X.A0L(-280769590, 2JX.class, -158614660)) == null) {
            return;
        }
        ImmutableList A0c = A0L3.A0c(104993457, 2JX.class, -319559030);
        if (A0c.isEmpty()) {
            return;
        }
        int size = A0c.size();
        for (int i = 0; i < size; i++) {
            2JX A0K = ((2JY) A0c.get(i)).A0K(-509987806, 2JX.class, 1035810904);
            if (A0K.A1e() != null && A0K.A1e().A0r(-1938933922) != null && !A0K.A1e().A0Z(-1944554010).isEmpty() && A0K.A1d() != null && A0K.A1d().A0r(3355) != null && A0K.A1d().A0r(3373707) != null && (A0r = A0K.A1d().A0r(3355)) != null) {
                String str = null;
                long j = -1;
                MessengerAccountType messengerAccountType = MessengerAccountType.A08;
                2JX A1e = A0K.A1e();
                String A0r2 = A1e.A0r(-1938933922);
                String obj = A1e.A0Z(-1944554010).toString();
                2JX A1d = A0K.A1d();
                String A0r3 = A1d.A0r(-1843381686);
                String A0r4 = A1d.A0r(3373707);
                if (A1d.A0L(1782764648, 2JX.class, 476874762) != null && A0K.A1d().A0L(1782764648, 2JX.class, 476874762).A0r(116076) != null) {
                    str = A0K.A1d().A0L(1782764648, 2JX.class, 476874762).A0r(116076);
                }
                if (A0r.equals(1Bn.A0A(83432))) {
                    MessengerAccountInfo AVA = ((InterfaceC09434q3) this.A02.get()).AVA(A0r);
                    if (AVA != null) {
                        j = AVA.A01;
                    }
                } else {
                    String A0r5 = A0K.A1d().A0r(3355);
                    C00i c00i = this.A01;
                    c00i.get();
                    1G2 A0D = C1f0.A0E.A0D(A0r5);
                    synchronized (this) {
                        j = ((FbSharedPreferences) c00i.get()).Av1(A0D, j);
                    }
                }
                MessengerAccountInfo messengerAccountInfo = new MessengerAccountInfo(messengerAccountType, A0r2, A0r4, str, A0r3, obj, A0r2, A0r, 0, j, 0L, false, false, false, true);
                C00i c00i2 = this.A01;
                c00i2.get();
                String str2 = messengerAccountInfo.A0A;
                if (str2 != null) {
                    1G2 A0D2 = C1f0.A0D.A0D(str2);
                    synchronized (this) {
                        try {
                            String A00 = messengerAccountInfo.A00();
                            1Ql edit = ((FbSharedPreferences) c00i2.get()).edit();
                            edit.CaL(A0D2, A00);
                            edit.commit();
                        } catch (JSONException e) {
                            1BK.A09(this.A00).softReport("Corrupt MessengerSOAPAccountInfo Write", "", e);
                        }
                    }
                    if (this.A05) {
                        A00(this);
                    }
                }
            }
        }
    }

    public void A03(String str) {
        C00i c00i = this.A01;
        c00i.get();
        1G2 A01 = 1G3.A01(C1f0.A08, str);
        synchronized (this) {
            1Ql.A01(1BL.A0V(c00i), A01, true);
        }
    }

    public boolean A04(String str) {
        boolean AZn;
        C00i c00i = this.A01;
        c00i.get();
        1G2 A0D = C1f0.A08.A0D(str);
        synchronized (this) {
            AZn = ((FbSharedPreferences) c00i.get()).AZn(A0D, false);
        }
        return AZn;
    }
}
