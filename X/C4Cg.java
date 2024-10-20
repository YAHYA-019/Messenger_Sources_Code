package X;

import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.4Cg, reason: invalid class name */
/* loaded from: 4Cg.class */
public final class C4Cg {
    public C4Ci A00;
    public C4Cf A01;
    public C4Ce A02;
    public String A03;
    public String A04;

    /* JADX WARN: Type inference failed for: r0v60, types: [X.4S0, java.lang.Object] */
    public static C4S0 A00(C4Cg c4Cg, C4S2 c4s2, byte[] bArr, int i) {
        if (c4s2 == null) {
            return null;
        }
        if (!c4s2.A00()) {
            throw AnonymousClass001.A0N("Cached token is not redeemable. Neither storage nor ACS should return unredeemable tokens; this should not happen.");
        }
        c4s2.A01++;
        for (Integer num : 0S2.A00(2)) {
            if (i == (1 - num.intValue() != 0 ? 1 : 2)) {
                javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA512");
                if (mac == null) {
                    throw new Exception(0Pz.A0W("Invalid mac instance: ", "HmacSHA512"));
                }
                mac.init(new SecretKeySpec(c4s2.A05, "HmacSHA512"));
                byte[] doFinal = mac.doFinal(bArr);
                if (doFinal == null) {
                    throw new Exception("Generated tag is null.");
                }
                String str = c4Cg.A04;
                String str2 = c4Cg.A03;
                String str3 = c4s2.A03;
                byte[] bArr2 = c4s2.A04;
                byte[] bArr3 = c4s2.A05;
                ?? obj = new Object();
                obj.A01 = str;
                obj.A00 = str2;
                obj.A02 = str3;
                obj.A06 = doFinal;
                obj.A04 = bArr2;
                obj.A05 = bArr;
                obj.A03 = bArr3;
                return obj;
            }
        }
        throw new Exception(0Pz.A0T("Unknown cipher suite: ", i));
    }
}
