package X;

import android.util.Base64;
import com.google.common.collect.ImmutableList;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: Kpo.class */
public final class Kpo {
    public final /* synthetic */ C4Cg A00;
    public final /* synthetic */ MIV A01;
    public final /* synthetic */ byte[] A02;

    public Kpo(C4Cg c4Cg, MIV miv, byte[] bArr) {
        this.A00 = c4Cg;
        this.A02 = bArr;
        this.A01 = miv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.Qxt, java.lang.Object] */
    public void A00(KSz kSz) {
        C4S2 c4s2;
        C4S0 A00;
        C4Cg c4Cg = this.A00;
        byte[] bArr = this.A02;
        MIV miv = this.A01;
        try {
            int i = kSz.A00;
            String str = kSz.A05;
            synchronized (c4Cg) {
                System.currentTimeMillis();
                C4Ce c4Ce = c4Cg.A02;
                synchronized (c4Ce) {
                    11T.A0F(str, 0);
                    c4s2 = null;
                    try {
                        java.util.Map map = (java.util.Map) C4Ce.A01(c4Ce).get(str);
                        if (map != null) {
                            Iterator A1A = 1BK.A1A(map);
                            C4S2 c4s22 = null;
                            while (A1A.hasNext()) {
                                C4S2 c4s23 = (C4S2) A1A.next();
                                if (c4s23.A00() && (c4s22 == null || c4s22.A01 > c4s23.A01)) {
                                    c4s22 = c4s23;
                                }
                            }
                            c4s2 = c4s22;
                        }
                    } catch (IllegalArgumentException unused) {
                        c4Ce.A04();
                    } catch (JSONException unused2) {
                        c4Ce.A04();
                    }
                }
                A00 = C4Cg.A00(c4Cg, c4s2, bArr, i);
                if (c4s2 != null) {
                    boolean A002 = c4s2.A00();
                    C4Ce c4Ce2 = c4Cg.A02;
                    if (A002) {
                        c4Ce2.A06(Arrays.asList(c4s2));
                    } else {
                        c4Ce2.A05(c4s2);
                    }
                }
                System.currentTimeMillis();
            }
            if (A00 != null) {
                miv.COe(A00);
                return;
            }
            int i2 = kSz.A01;
            KkI kkI = new KkI(c4Cg, miv, kSz, bArr);
            System.currentTimeMillis();
            if (i2 <= 0) {
                kkI.A01.onFailure(new Exception(0Pz.A0T("Invalid number of tokens requested: ", i2)));
                return;
            }
            try {
                C4Ci c4Ci = c4Cg.A00;
                ArrayList A0t = AnonymousClass001.A0t(i2);
                SecureRandom secureRandom = new SecureRandom();
                int curveBytes = c4Ci.getCurveBytes();
                int i3 = 0;
                do {
                    byte[] bArr2 = new byte[curveBytes];
                    secureRandom.nextBytes(bArr2);
                    byte[] bArr3 = new byte[curveBytes];
                    byte[] bArr4 = new byte[curveBytes];
                    int blind = c4Ci.blind(bArr2, bArr3, bArr4);
                    if (blind != 0) {
                        throw new Exception(0Pz.A0T("VOPRF blind(...) returned error code: ", blind));
                    }
                    ?? obj = new Object();
                    ((Qxt) obj).A02 = bArr2;
                    ((Qxt) obj).A01 = bArr4;
                    ((Qxt) obj).A00 = bArr3;
                    A0t.add(obj);
                    i3++;
                } while (i3 < i2);
                int size = A0t.size();
                byte[] bArr5 = new byte[size];
                for (int i4 = 0; i4 < A0t.size(); i4++) {
                    byte[] bArr6 = ((Qxt) A0t.get(i4)).A00;
                    bArr5[i4] = Arrays.copyOf(bArr6, bArr6.length);
                }
                C4Cf c4Cf = c4Cg.A01;
                KkJ kkJ = new KkJ(kkI, c4Cg, kSz, A0t);
                C4Cb c4Cb = c4Cf.A00.A01;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (int i5 = 0; i5 < size; i5++) {
                    String encodeToString = Base64.encodeToString(bArr5[i5], 8);
                    if (encodeToString != null) {
                        encodeToString = encodeToString.replace("\n", "");
                    }
                    builder.m11011add((Object) encodeToString);
                }
                c4Cb.A00.ARJ(new LW3(kkJ, 7), new LW5(kkJ, c4Cb, 7), c4Cb.A00(kSz, builder.build()), c4Cb.A01);
            } catch (KPy e) {
                kkI.A01.onFailure(e);
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException | KPx | KPy | IllegalStateException e2) {
            miv.onFailure(e2);
        }
    }
}
