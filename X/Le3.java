package X;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: Le3.class */
public final class Le3 implements C4F2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Le3(MIM mim, L2b l2b, String str, List list, int i) {
        this.A00 = i;
        this.A03 = l2b;
        if (i != 0) {
            this.A01 = mim;
            this.A04 = str;
            this.A02 = list;
        } else {
            this.A02 = list;
            this.A01 = mim;
            this.A04 = str;
        }
    }

    @Override // X.C4F2
    public final void onFailure(Exception e) {
        MIM mim;
        String str;
        C1A5 c1a5;
        Collection collection;
        String str2;
        RuntimeException runtimeException;
        C1A5 c1a52;
        if (this.A00 != 0) {
            11T.A0F(e, 0);
            0fH.A0j("BLogPlayIntegrityAttestationPerfLogger", "validateAttestationChallengeEnd");
            0fH.A0j("BLogPlayIntegrityAttestationPerfLogger", "playIntegrityAttestationEndFailure");
            mim = (MIM) this.A01;
            str = this.A04;
            c1a5 = C1A5.A08;
            collection = (Collection) this.A02;
            runtimeException = new RuntimeException("Unable to send token for validation", e);
        } else {
            11T.A0F(e, 0);
            L2b l2b = (L2b) this.A03;
            0fH.A0g("", "BLogPlayIntegrityAttestationPerfLogger", "getPlayIntegrityTokenEnd token: %s");
            L9i l9i = l2b.A02;
            if (e instanceof K2E) {
                Set set = l9i.A00;
                3F8 r0 = (3F8) e;
                if (JQx.A1Y(set, r0.mStatus.A00)) {
                    try {
                        KzB kzB = l2b.A01;
                        int i = kzB.A00;
                        if (i >= 5) {
                            throw AnonymousClass001.A0N("Max retries reached");
                        }
                        int pow = (int) (250.0d * Math.pow(2.0d, i));
                        kzB.A00 = i + 1;
                        int i2 = r0.mStatus.A00;
                        C1A5[] values = C1A5.values();
                        int length = values.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                c1a52 = C1A5.A0Z;
                                break;
                            }
                            c1a52 = values[i3];
                            if (c1a52.errorCode == i2) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        List list = (List) this.A02;
                        list.add(c1a52);
                        l2b.A06.schedule((Runnable) new LqO((MIM) this.A01, l2b, this.A04, list), pow, TimeUnit.MILLISECONDS);
                        return;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        0fH.A0j("BLogPlayIntegrityAttestationPerfLogger", "playIntegrityAttestationEndFailure");
                        mim = (MIM) this.A01;
                        str = this.A04;
                        c1a5 = C1A5.A0W;
                        collection = (Collection) this.A02;
                        str2 = "Token retrieval failed after too many retries";
                    } catch (RejectedExecutionException e3) {
                        e = e3;
                        0fH.A0j("BLogPlayIntegrityAttestationPerfLogger", "playIntegrityAttestationEndFailure");
                        mim = (MIM) this.A01;
                        str = this.A04;
                        c1a5 = C1A5.A0U;
                        collection = (Collection) this.A02;
                        str2 = "Unable to schedule retry for token retrieval";
                    }
                }
            }
            0fH.A0j("BLogPlayIntegrityAttestationPerfLogger", "playIntegrityAttestationEndFailure");
            mim = (MIM) this.A01;
            str = this.A04;
            c1a5 = C1A5.A0V;
            collection = (Collection) this.A02;
            str2 = "Retry not allowed";
            runtimeException = new RuntimeException(str2, e);
        }
        mim.Bxl(str, runtimeException, 0QD.A0O(11T.A03(c1a5), collection));
    }
}
