package X;

import android.content.Context;
import com.facebook.zero.common.zerobalance.ZeroBalanceUrlConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Kuc.class */
public abstract class Kuc {
    public final Context A07;
    public final C00i A08 = AbH.A0S();
    public final C00i A0C = 1BQ.A02(131320);
    public final Object A09 = AnonymousClass001.A0R();
    public LZG A03 = null;
    public MIp A02 = null;
    public String A06 = null;
    public final C00i A0A = 1BQ.A01();
    public final C00i A0B = 1BQ.A02(84488);
    public Set A04 = Collections.newSetFromMap(JQx.A13());
    public long A01 = -1;
    public long A00 = 0;
    public boolean A05 = false;

    public Kuc(Context context) {
        this.A07 = context;
    }

    public abstract Integer A00(String str);

    public void A01(2C1 r302) {
        synchronized (this.A09) {
            if (this.A06 == null) {
                1BK.A09(this.A0A).D0v("ZeroBalanceDetectionControllerV3", "Detection Trigger is null");
            } else {
                Iterator it = this.A04.iterator();
                while (it.hasNext()) {
                    ((2C6) it.next()).A00(r302, this.A06);
                }
            }
        }
    }

    public void A02(MIp mIp) {
        synchronized (this.A09) {
            this.A05 = false;
            this.A06 = null;
            LZG lzg = this.A03;
            lzg.getClass();
            if (mIp != null) {
                lzg.A0A.remove(mIp);
            }
            this.A03 = null;
        }
    }

    public void A03(MIp mIp, Integer num, String str) {
        int i;
        boolean z;
        synchronized (this.A09) {
            this.A02 = mIp;
            this.A06 = str;
            this.A05 = true;
            this.A01 = this.A00;
            this.A00 = 1BL.A09(this.A0B);
            LZG lzg = new LZG(this.A07, num);
            lzg.A0A.add(mIp);
            lzg.A03 = ((Kpp) lzg.A05.get()).A00();
            if (((2BQ) lzg.A06.get()).A04("external_zbd")) {
                java.util.Map map = lzg.A09;
                QoS qoS = QoS.A02;
                ZeroBalanceUrlConfig zeroBalanceUrlConfig = lzg.A03;
                Integer num2 = lzg.A07;
                String str2 = zeroBalanceUrlConfig.mTimeoutExternalUrl;
                String str3 = zeroBalanceUrlConfig.mRedirectedExternalUrl;
                if (num2.intValue() != 0) {
                    str2 = str3;
                }
                map.put(qoS, str2);
            }
            java.util.Map map2 = lzg.A09;
            QoS qoS2 = QoS.A01;
            ZeroBalanceUrlConfig zeroBalanceUrlConfig2 = lzg.A03;
            Integer num3 = lzg.A07;
            String str4 = zeroBalanceUrlConfig2.mTimeoutFreeUrl;
            String str5 = zeroBalanceUrlConfig2.mRedirectedFreeUrl;
            int intValue = num3.intValue();
            if (intValue != 0) {
                str4 = str5;
            }
            map2.put(qoS2, str4);
            QoS qoS3 = QoS.A03;
            ZeroBalanceUrlConfig zeroBalanceUrlConfig3 = lzg.A03;
            String str6 = zeroBalanceUrlConfig3.mTimeoutPaidUrl;
            String str7 = zeroBalanceUrlConfig3.mRedirectedPaidUrl;
            if (intValue != 0) {
                str6 = str7;
            }
            map2.put(qoS3, str6);
            Iterator A1B = 1BK.A1B(map2);
            while (A1B.hasNext()) {
                QoS qoS4 = (QoS) A1B.next();
                String A0b = AnonymousClass001.A0b(qoS4, map2);
                A0b.getClass();
                AnonymousClass305 anonymousClass305 = AnonymousClass304.A04;
                if (anonymousClass305.A01() && num3 == 0S2.A01) {
                    if (qoS4 == qoS2) {
                        z = true;
                    } else if (qoS4 == qoS3) {
                        z = false;
                    }
                    if (anonymousClass305.A01()) {
                        A0b = z ? 1BJ.A00(1412) : 1BJ.A00(1407);
                    }
                }
                ZeroBalanceUrlConfig zeroBalanceUrlConfig4 = lzg.A03;
                int i2 = zeroBalanceUrlConfig4.mPingTimeoutSeconds;
                if (num3.equals(0S2.A00)) {
                    int ordinal = qoS4.ordinal();
                    if (ordinal == 0) {
                        i = zeroBalanceUrlConfig4.mTimeoutTotalFreePingsRetries;
                    } else if (ordinal == 1) {
                        i = zeroBalanceUrlConfig4.mTimeoutTotalPaidPingsRetries;
                    } else if (ordinal == 2) {
                        i = zeroBalanceUrlConfig4.mTimeoutTotalExternalPingsRetries;
                    }
                    Rak rak = new Rak(lzg.A04, qoS4, A0b, i2, i);
                    lzg.A08.put(qoS4, rak);
                    rak.A02.add(lzg);
                }
                i = zeroBalanceUrlConfig4.mRedirectTotalPingRetries;
                Rak rak2 = new Rak(lzg.A04, qoS4, A0b, i2, i);
                lzg.A08.put(qoS4, rak2);
                rak2.A02.add(lzg);
            }
            Iterator A1A = 1BK.A1A(lzg.A08);
            while (A1A.hasNext()) {
                ((Rak) A1A.next()).A00();
            }
            this.A03 = lzg;
        }
    }

    public boolean A04() {
        boolean A1U;
        synchronized (this.A09) {
            A1U = DKD.A1U(((1BL.A09(this.A0B) - this.A00) > (((Kpp) this.A0C.get()).A00().mZbDisableInterval * 1000) ? 1 : ((1BL.A09(this.A0B) - this.A00) == (((Kpp) this.A0C.get()).A00().mZbDisableInterval * 1000) ? 0 : -1)));
        }
        return A1U;
    }
}
