package com.facebookpay.expresscheckout.repositoryimpl;

import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C06014fk;
import X.DSD;
import X.FH8;
import X.FJC;
import X.JQx;
import X.JQz;
import X.KNE;
import X.KNL;
import X.Kfp;
import X.Ksw;
import X.L4l;
import X.LLk;
import X.LZp;
import X.LZq;
import X.LZr;
import X.M2t;
import X.M2u;
import X.M2v;
import X.QmT;
import X.RMB;
import X.RQS;
import X.RY6;
import X.Rb4;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: ECPRepositoryImpl.class */
public final class ECPRepositoryImpl {
    public final LiveData A02;
    public final MediatorLiveData A03;
    public final RQS A04 = new RQS();
    public final ECPCheckoutSetupMutationAPI A0A = new ECPCheckoutSetupMutationAPI();
    public final C01i A09 = C01g.A01(M2v.A00);
    public final C01i A07 = C01g.A01(M2t.A00);
    public final C01i A08 = C01g.A01(M2u.A00);
    public final Kfp A06 = new Kfp();
    public final RY6 A05 = new RY6();
    public ArrayList A01 = AnonymousClass001.A0s();
    public MutableLiveData A00 = JQx.A0a();

    public ECPRepositoryImpl() {
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A03 = mediatorLiveData;
        this.A02 = mediatorLiveData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0365, code lost:
    
        if (r305.length() == 0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r301, java.lang.String r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, X.0DR r306) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A00(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0DR):java.lang.Object");
    }

    public DSD A01(L4l l4l) {
        QmT qmT = new QmT(new LLk(l4l, this, 1), C06014fk.A0F());
        FH8.A02(qmT);
        DSD dsd = ((FH8) qmT).A03;
        11T.A0A(dsd);
        return dsd;
    }

    public boolean A02(String str, Set set, Set set2) {
        FJC A0X;
        Rb4 rb4;
        FJC A0X2;
        RMB rmb;
        11T.A0F(str, 2);
        Ksw ksw = new Ksw(null, str);
        return !((set.contains(KNL.A0D) && (A0X2 = JQz.A0X(((LZp) this.A09.getValue()).A01(ksw))) != null && (rmb = (RMB) A0X2.A01) != null && 1BK.A1Y(rmb.A02)) || (set2.contains(KNE.A04) && ((LZr) this.A07.getValue()).A0B(ksw)) || ((set2.contains(KNE.A03) && ((LZr) this.A07.getValue()).A0A(ksw)) || ((set2.contains(KNE.A05) && ((LZr) this.A07.getValue()).A0C(ksw)) || !((A0X = JQz.A0X(((LZq) this.A08.getValue()).A04(ksw))) == null || (rb4 = (Rb4) A0X.A01) == null || !1BK.A1Y(rb4.A02)))));
    }
}
