package com.meta.metaai.writewithai.creation.impl.viewmodel;

import X.0DE;
import X.0Du;
import X.0QD;
import X.0Ro;
import X.0Xs;
import X.11T;
import X.1BK;
import X.2aK;
import X.AJL;
import X.AnonymousClass001;
import X.C0ty;
import X.C15t;
import X.DKF;
import X.EKP;
import X.EKQ;
import X.EQW;
import X.EQY;
import X.ETQ;
import X.EyK;
import X.Ez9;
import X.EzL;
import X.F9l;
import X.F9m;
import X.F9n;
import X.F9z;
import X.FAD;
import X.FEW;
import X.FIg;
import X.Fyo;
import X.Fyq;
import X.Fys;
import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.foa.session.FbMetaSessionImpl;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import java.util.ArrayList;
import java.util.List;

/* loaded from: WriteWithAICreationViewModel.class */
public final class WriteWithAICreationViewModel extends ViewModel {
    public EyK A00;
    public String A01;
    public final Application A02;
    public final FbMetaSessionImpl A03;
    public final FEW A04;
    public final FIg A05;
    public final WriteSuggestionsRepository A06;
    public final FAD A07;
    public final 0Xs A08;
    public final 0Xs A09;
    public final 0Xs A0A;
    public final C15t A0B;
    public final C15t A0C;
    public final C15t A0D;

    public /* synthetic */ WriteWithAICreationViewModel(Application application, FbMetaSessionImpl fbMetaSessionImpl, FAD fad) {
        FIg fIg = new FIg(fad);
        WriteSuggestionsRepository writeSuggestionsRepository = new WriteSuggestionsRepository(application, fbMetaSessionImpl, fIg);
        FEW few = new FEW(fad);
        11T.A0F(fad, 3);
        this.A02 = application;
        this.A03 = fbMetaSessionImpl;
        this.A07 = fad;
        this.A05 = fIg;
        this.A06 = writeSuggestionsRepository;
        this.A04 = few;
        Ez9 ez9 = fad.A02;
        String str = ez9.A02;
        String str2 = ez9.A04;
        int i = fad.A00;
        boolean z = fad.A0F;
        ArrayList A0t = AnonymousClass001.A0t(i);
        for (int i2 = 0; i2 < i; i2++) {
            A0t.add(new Fyo(i2));
        }
        EKP ekp = new EKP((String) null, (String) null, (String) null, A0t, z);
        F9n f9n = fad.A04;
        0Ro r0 = new 0Ro(new EzL(new F9l(f9n.A00, true), ekp, new F9z(C0ty.A00, f9n.A01, true, true), new F9m(null, true), str2, str, null));
        this.A0A = r0;
        this.A0D = r0;
        0Ro A00 = 0Du.A00(A07());
        this.A09 = A00;
        this.A0C = A00;
        0Ro A002 = 0Du.A00(Fys.A00);
        this.A08 = A002;
        this.A0B = A002;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c3 A[EDGE_INSN: B:21:0x01c3->B:22:0x01c3 BREAK  A[LOOP:0: B:12:0x00b1->B:19:0x00b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(X.EKP r301, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r302, java.lang.String r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A00(X.EKP, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel, java.lang.String, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(X.EKP r301, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r302, java.lang.String r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A01(X.EKP, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel, java.lang.String, java.lang.String, X.0DR):java.lang.Object");
    }

    public static final String A02(WriteWithAICreationViewModel writeWithAICreationViewModel) {
        String A0t;
        if (writeWithAICreationViewModel.A01 == null) {
            A0t = writeWithAICreationViewModel.A07.A02.A03;
            if (A0t == null) {
                A0t = "";
            }
        } else {
            A0t = 1BK.A0t();
            11T.A0D(A0t);
        }
        writeWithAICreationViewModel.A01 = A0t;
        return A0t;
    }

    public static final void A03(WriteWithAICreationViewModel writeWithAICreationViewModel, F9m f9m) {
        0Xs r0 = writeWithAICreationViewModel.A0A;
        EzL ezL = (EzL) r0.getValue();
        String str = ezL.A06;
        String str2 = ezL.A05;
        String str3 = ezL.A04;
        r0.Cvx(new EzL(ezL.A00, ezL.A01, ezL.A02, f9m, str, str2, str3));
    }

    public static final void A04(WriteWithAICreationViewModel writeWithAICreationViewModel, F9m f9m, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        0Xs r321;
        Object ezL;
        if (!z) {
            FIg fIg = writeWithAICreationViewModel.A05;
            FIg.A04(fIg, "error_message", "empty_response");
            FIg.A05(fIg, "error_message", "empty_response");
            FIg.A00(fIg);
            FIg.A01(fIg);
        }
        if (list == null || list.isEmpty()) {
            r321 = writeWithAICreationViewModel.A0A;
            EzL ezL2 = (EzL) r321.getValue();
            EKQ ekq = new EKQ(f9m);
            F9z f9z = DKF.A0k(r321).A02;
            boolean z2 = !f9m.A01;
            ezL = new EzL(new F9l(DKF.A0k(r321).A00.A01, z2), ekq, new F9z(f9z.A00, f9z.A03, f9z.A02, z2), ezL2.A03, str, ezL2.A05, ezL2.A04);
        } else {
            A06(writeWithAICreationViewModel, str, str2, str3, str4, str5, list, !f9m.A01, false);
            r321 = writeWithAICreationViewModel.A08;
            ezL = new Fyq(f9m);
        }
        r321.Cvx(ezL);
    }

    public static final void A05(WriteWithAICreationViewModel writeWithAICreationViewModel, String str, String str2, String str3) {
        0Xs r0 = writeWithAICreationViewModel.A0A;
        ETQ etq = DKF.A0k(r0).A01;
        ETQ etq2 = etq instanceof EKP ? etq : null;
        EzL ezL = (EzL) r0.getValue();
        FAD fad = writeWithAICreationViewModel.A07;
        int i = fad.A00;
        boolean z = fad.A0F;
        ArrayList A0t = AnonymousClass001.A0t(i);
        for (int i2 = 0; i2 < i; i2++) {
            A0t.add(new Fyo(i2));
        }
        EKP ekp = new EKP((String) null, (String) null, (String) null, A0t, z);
        F9z f9z = DKF.A0k(r0).A02;
        r0.Cvx(new EzL(new F9l(DKF.A0k(r0).A00.A01, true), ekp, new F9z(f9z.A00, f9z.A03, f9z.A02, true), ezL.A03, str, ezL.A05, ezL.A04));
        writeWithAICreationViewModel.A09.Cvx(writeWithAICreationViewModel.A07());
        if (str3 != null) {
            EzL ezL2 = (EzL) r0.getValue();
            r0.Cvx(new EzL(ezL2.A00, ezL2.A01, ezL2.A02, ezL2.A03, ezL2.A06, str3, ezL2.A04));
        }
        2aK.A03((Integer) null, (0DE) null, new AJL(writeWithAICreationViewModel, etq2, str2, str, null, 5), ViewModelKt.getViewModelScope(writeWithAICreationViewModel), 3);
    }

    public static final void A06(WriteWithAICreationViewModel writeWithAICreationViewModel, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2) {
        List list2 = list;
        if (z2) {
            int size = list.size();
            int i = writeWithAICreationViewModel.A07.A00;
            if (size < i) {
                int size2 = i - list.size();
                ArrayList A0t = AnonymousClass001.A0t(size2);
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= size2) {
                        break;
                    }
                    A0t.add(new Fyo((list2.size() + i3) - 1));
                    i2 = i3 + 1;
                }
                list2 = 0QD.A0O(A0t, list2);
            }
        }
        EKP ekp = new EKP(str2, str3, str4, list2, writeWithAICreationViewModel.A07.A0F);
        0Xs r0 = writeWithAICreationViewModel.A0A;
        EzL ezL = (EzL) r0.getValue();
        F9z f9z = DKF.A0k(r0).A02;
        r0.Cvx(new EzL(new F9l(DKF.A0k(r0).A00.A01, z), ekp, new F9z(f9z.A00, f9z.A03, f9z.A02, z), ezL.A03, str, ezL.A05, str5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c5, code lost:
    
        if (X.DKF.A0k(r0).A03.A01 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C9i8 A07() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A07():X.9i8");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r0 == r311) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(java.lang.Boolean r302, java.lang.String r303, java.lang.String r304) {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = A02(r0)
            r305 = r0
            r0 = r301
            X.FEW r0 = r0.A04
            r306 = r0
            r0 = r301
            java.lang.String r0 = r0.A01
            r307 = r0
            r0 = r302
            if (r0 == 0) goto L72
            r0 = r302
            boolean r0 = r0.booleanValue()
            r308 = r0
        L1c:
            r0 = r303
            if (r0 == 0) goto L6a
            r0 = r303
            int r0 = r0.length()
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L6a
            r0 = r308
            if (r0 == 0) goto L5d
            r0 = r306
            X.EQW r0 = r0.A00
            r310 = r0
            X.EQW r0 = X.EQW.A02
            r311 = r0
            r0 = r310
            r1 = r311
            if (r0 != r1) goto L5d
        L43:
            X.EQY r0 = X.EQY.A04
            r310 = r0
        L48:
            r0 = r311
            r1 = r310
            r2 = r306
            r3 = r303
            r4 = r307
            X.FEW.A01(r0, r1, r2, r3, r4)
            r0 = r301
            r1 = r303
            r2 = r305
            r3 = r304
            A05(r0, r1, r2, r3)
            return
        L5d:
            X.EQW r0 = X.EQW.A04
            r311 = r0
            X.EQY r0 = X.EQY.A02
            r310 = r0
            goto L48
        L6a:
            X.EQW r0 = X.EQW.A01
            r311 = r0
            goto L43
        L72:
            r0 = 1
            r308 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A08(java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    public final void A09(String str) {
        String A02 = A02(this);
        FEW few = this.A04;
        EQY eqy = EQY.A05;
        FEW.A00((EQW) null, eqy, few, (Long) null, "retry_on_error_click", (String) null, (String) null, few.A03.A02.A03);
        String str2 = this.A01;
        EQW eqw = few.A00;
        if (eqw == null) {
            eqw = EQW.A01;
        }
        FEW.A01(eqw, eqy, few, str, str2);
        A05(this, str, A02, null);
    }
}
