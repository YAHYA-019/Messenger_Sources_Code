package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4wc.class */
public final class C11384wc {
    public final 1CO A00;

    public C11384wc() {
        this.A00 = (1CO) 1Bi.A03(16385);
    }

    public C11384wc(int i) {
    }

    public String A00() {
        String BDB = this.A00.BDB(1GD.A07, 36874789621334415L);
        11T.A0D(BDB);
        return BDB;
    }

    public String A01(boolean z) {
        1CO r0 = this.A00;
        String BCy = z ? r0.BCy(36874789621137805L) : r0.BDB(1GD.A07, 36874789621137805L);
        11T.A0D(BCy);
        return BCy;
    }

    public List A02(boolean z) {
        1CO r0 = this.A00;
        String BCy = z ? r0.BCy(36874789626511766L) : r0.BDB(1GD.A07, 36874789626511766L);
        11T.A0D(BCy);
        List A19 = 4YU.A19(BCy, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A19.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            Enum[] values = KNI.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Enum r02 = values[i];
                    if (11T.A0O(r02.name(), 4YU.A13(A0i))) {
                        A0s.add(r02);
                        break;
                    }
                    i++;
                }
            }
        }
        return A0s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            r0 = r301
            X.1CO r0 = r0.A00
            r302 = r0
            r0 = r302
            r1 = 36326446843319935(0x810eb6000c567f, double:3.036329486351572E-306)
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = 36326446842599030(0x810eb600015676, double:3.036329485895669E-306)
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = X.2yD.A03(r0, r1)
            r306 = r0
            r0 = r303
            if (r0 != 0) goto L26
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L29
        L26:
            r0 = 1
            r307 = r0
        L29:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11384wc.A03():boolean");
    }

    public boolean A04() {
        boolean z = false;
        if (11T.A0O(A00(), "multi_pills") || 11T.A0O(A01(false), "multi_pills")) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r0.AZr(X.1GD.A07, 36311839668899351L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05() {
        /*
            r301 = this;
            r0 = r301
            X.1CO r0 = r0.A00
            r302 = r0
            r0 = 36311839668833814(0x81016d009a0e16, double:3.027091850388179E-306)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L38
            r0 = 36311839668899351(0x81016d009b0e17, double:3.0270918504296246E-306)
            r306 = r0
            X.1GD r0 = X.1GD.A07
            r308 = r0
            r0 = r302
            r1 = r308
            r2 = r306
            boolean r0 = r0.AZr(r1, r2)
            r309 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = r309
            if (r0 == 0) goto L3b
        L38:
            r0 = 1
            r305 = r0
        L3b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11384wc.A05():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r0.AZr(X.1GD.A07, 36311839669161499L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06() {
        /*
            r301 = this;
            r0 = r301
            X.1CO r0 = r0.A00
            r302 = r0
            r0 = 36311839669095962(0x81016d009e0e1a, double:3.027091850553962E-306)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L38
            r0 = 36311839669161499(0x81016d009f0e1b, double:3.027091850595408E-306)
            r306 = r0
            X.1GD r0 = X.1GD.A07
            r308 = r0
            r0 = r302
            r1 = r308
            r2 = r306
            boolean r0 = r0.AZr(r1, r2)
            r309 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = r309
            if (r0 == 0) goto L3b
        L38:
            r0 = 1
            r305 = r0
        L3b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11384wc.A06():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r0.AZr(X.1GD.A07, 36311839669292573L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07() {
        /*
            r301 = this;
            r0 = r301
            X.1CO r0 = r0.A00
            r302 = r0
            r0 = 36311839669227036(0x81016d00a00e1c, double:3.027091850636854E-306)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L38
            r0 = 36311839669292573(0x81016d00a10e1d, double:3.0270918506783E-306)
            r306 = r0
            X.1GD r0 = X.1GD.A07
            r308 = r0
            r0 = r302
            r1 = r308
            r2 = r306
            boolean r0 = r0.AZr(r1, r2)
            r309 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = r309
            if (r0 == 0) goto L3b
        L38:
            r0 = 1
            r305 = r0
        L3b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11384wc.A07():boolean");
    }

    public boolean A08() {
        boolean z = false;
        if (11T.A0O(A00(), "single_pill") || 11T.A0O(A00(), "multi_pills") || 11T.A0O(A00(), "persistent")) {
            z = true;
        }
        return z;
    }

    public boolean A09() {
        boolean z = false;
        if (11T.A0O(A01(false), "single_pill") || 11T.A0O(A01(false), "multi_pills") || 11T.A0O(A01(false), "persistent")) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r0 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0A(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            X.1CO r0 = r0.A00
            r303 = r0
            r0 = 36326446843319935(0x810eb6000c567f, double:3.036329486351572E-306)
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L34
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
        L16:
            r0 = 36326446842664567(0x810eb600025677, double:3.036329485937115E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.2yD.A03(r0, r1)
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L2e
            r0 = 0
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L31
        L2e:
            r0 = 1
            r308 = r0
        L31:
            r0 = r308
            return r0
        L34:
            r0 = r303
            r1 = r304
            boolean r0 = X.2yD.A03(r0, r1)
            r306 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11384wc.A0A(boolean):boolean");
    }

    public boolean A0B(boolean z) {
        1CO r0 = this.A00;
        return z ? r0.AZk(36311839667588618L) : 2yD.A03(r0, 36311839667588618L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (A0B(r302) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A08()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L15
            r0 = r301
            r1 = r302
            boolean r0 = r0.A0B(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            r303 = r0
        L17:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11384wc.A0C(boolean):boolean");
    }
}
