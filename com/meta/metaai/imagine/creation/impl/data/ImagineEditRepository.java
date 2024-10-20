package com.meta.metaai.imagine.creation.impl.data;

import X.0Ro;
import X.0Xs;
import X.11T;
import X.2aI;
import X.4YV;
import X.7zL;
import X.AQC;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C15t;
import X.C9fl;
import X.C9hz;
import X.C9i2;
import X.EMg;
import X.ETe;
import X.FHP;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import java.util.List;

/* loaded from: ImagineEditRepository.class */
public final class ImagineEditRepository {
    public final FHP A00;
    public final EMg A01;
    public final ImagineNetworkService A02;
    public final C01i A03;
    public final 2aI A04;
    public final 0Xs A05;
    public final C15t A06;
    public final boolean A07;
    public final boolean A08;

    public ImagineEditRepository(FHP fhp, EMg eMg, ImagineNetworkService imagineNetworkService, 2aI r305, boolean z, boolean z2) {
        C9hz c9hz;
        11T.A0F(eMg, 3);
        this.A02 = imagineNetworkService;
        this.A04 = r305;
        this.A01 = eMg;
        this.A00 = fhp;
        this.A07 = z;
        this.A08 = z2;
        this.A03 = C01g.A00(C03i.A02, AQC.A00);
        0Ro A1A = 7zL.A1A(new C9hz(AnonymousClass001.A0s(), -1));
        this.A05 = A1A;
        this.A06 = A1A;
        if (!this.A08 || (c9hz = ((C9fl) this.A03.getValue()).A00) == null) {
            return;
        }
        this.A05.Cvx(c9hz);
    }

    public static final C9i2 A00(ImagineEditRepository imagineEditRepository) {
        0Xs r0 = imagineEditRepository.A05;
        List list = ((C9hz) r0.getValue()).A01;
        int i = ((C9hz) r0.getValue()).A00;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (C9i2) list.get(i);
    }

    public static final void A01(ImagineEditRepository imagineEditRepository, ETe eTe) {
        imagineEditRepository.A00.A05(4YV.A0u(eTe));
        C9i2 A00 = A00(imagineEditRepository);
        if (A00 != null) {
            imagineEditRepository.A04(new C9i2(eTe, A00.A01, null, null, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(java.lang.String r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository.A02(java.lang.String, X.0DR):java.lang.Object");
    }

    public final void A03() {
        0Xs r0 = this.A05;
        int i = ((C9hz) r0.getValue()).A00;
        if (i > 0) {
            List list = ((C9hz) r0.getValue()).A01;
            if (((C9i2) list.get(i)).A00 != null) {
                list.remove(i);
                r0.getValue();
                r0.Cvx(new C9hz(list, i - 1));
            }
        }
    }

    public final void A04(C9i2 c9i2) {
        A03();
        0Xs r0 = this.A05;
        List list = ((C9hz) r0.getValue()).A01;
        int i = ((C9hz) r0.getValue()).A00 + 1;
        if (i != list.size()) {
            list = list.subList(0, i);
        }
        list.add(c9i2);
        r0.getValue();
        r0.Cvx(new C9hz(list, i));
    }
}
