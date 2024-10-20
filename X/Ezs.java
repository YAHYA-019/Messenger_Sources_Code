package X;

import android.accounts.Account;
import com.facebook.inject.FbInjector;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: Ezs.class */
public final class Ezs {
    public final 1BP A07 = FbInjector.A00;
    public final 1Br A01 = 1Bu.A00(99454);
    public final 1Br A03 = 1Bu.A00(82596);
    public final 1Br A05 = 1Bq.A00(67262);
    public final 1Br A00 = 1Bu.A00(99448);
    public final 1Br A02 = 1Bq.A00(16483);
    public final HashMap A06 = AnonymousClass001.A0u();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final 1Br A04 = 1Bq.A00(84488);

    public final Account A00(String str) {
        Es2 es2;
        String str2;
        if (((1Rv) 1Br.A0B(this.A05)).A08("android.permission.GET_ACCOUNTS")) {
            Account[] A02 = ((F9J) 1Br.A0B(this.A00)).A02(false);
            11T.A0A(A02);
            for (Account account : A02) {
                if (0CV.A0a(account.name, str, true)) {
                    return account;
                }
            }
            es2 = (Es2) 1Br.A0B(this.A01);
            str2 = "NO_ACCOUNT_IN_DEVICE";
        } else {
            es2 = (Es2) 1Br.A0B(this.A01);
            str2 = "GET_ACCOUNTS_PERMISSION_NOT_AVAILABLE";
        }
        es2.A00(str2);
        return null;
    }

    public final Integer A01(String str) {
        Integer[] A00 = 0S2.A00(1);
        int length = A00.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                ((Es2) 1Br.A0B(this.A01)).A00("NO_OPENID_CONNECT_PROVIDER");
                return null;
            }
            Integer num = A00[i2];
            if ("com.google".equals(str)) {
                return num;
            }
            i = i2 + 1;
        }
    }

    public final String A02(Account account) {
        String A0W = 0Pz.A0W("audience:server:client_id:", "15057814354-80cg059cn49j6kmhhkjam4b00on1gb2n.apps.googleusercontent.com");
        if (account == null) {
            return null;
        }
        try {
            String A03 = LDn.A03(account, FbInjector.A03, A0W);
            11T.A0A(A03);
            LDn.A07(FbInjector.A03, A03);
            return LDn.A03(account, FbInjector.A03, A0W);
        } catch (Exception e) {
            0fH.A0G(Ezs.class, "Exception while trying to get the OpenID connect token", e);
            ((Ewu) 1Br.A0B(this.A03)).A01("token_fetch_exception", e);
            ((Es2) 1Br.A0B(this.A01)).A00(0Pz.A1B("Get ID token method exception: ", e));
            return null;
        }
    }

    public final String A03(String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.A08;
        if (!concurrentHashMap.containsKey(str)) {
            return null;
        }
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str2 = (String) ((0Mu) obj).A00;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (AnonymousClass001.A05(((0Mu) obj2).A01) + TimeUnit.HOURS.toMillis(1L) > 1Br.A01(this.A04)) {
            return str2;
        }
        concurrentHashMap.remove(str);
        return null;
    }

    public final void A04(String str, String str2) {
        11T.A0F(str, 0);
        if (A03(str) == null) {
            this.A08.put(str, new 0Mu(str2, Long.valueOf(1Br.A01(this.A04))));
        }
    }
}
