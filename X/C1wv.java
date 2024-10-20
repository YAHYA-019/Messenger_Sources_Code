package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.1wv, reason: invalid class name */
/* loaded from: 1wv.class */
public final class C1wv {
    public boolean A00;
    public boolean A01;
    public final MutableLiveData A02;
    public final MutableLiveData A03;
    public final MutableLiveData A04;
    public final MutableLiveData A05;
    public final MutableLiveData A06;
    public final MutableLiveData A07;
    public final FbUserSession A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final Set A0F;
    public final 1Br A0G;
    public final Set A0H;

    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v33, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v37, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v45, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v48, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C1wv(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A08 = fbUserSession;
        this.A0G = 1Bq.A00(66360);
        this.A0A = 1Lm.A01(fbUserSession, 16874);
        this.A0E = 1Bu.A00(66244);
        this.A0D = 1Bu.A00(66524);
        this.A0B = 1Bq.A00(65997);
        this.A09 = 1Bq.A00(68885);
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A0C = 1Lm.A00(A00, fbUserSession, 67220);
        this.A06 = new LiveData(C1wy.A04);
        this.A07 = new LiveData(C1wz.A04);
        this.A05 = new LiveData(C1x0.A04);
        this.A03 = new LiveData(false);
        this.A02 = new LiveData(null);
        this.A04 = new LiveData(null);
        Set singleton = Collections.singleton("NuxLoadingViewData");
        11T.A0A(singleton);
        this.A0F = singleton;
        Set singleton2 = Collections.singleton("NuxLoadingViewData");
        11T.A0A(singleton2);
        this.A0H = singleton2;
        C1wj A002 = ((C1wi) this.A09.A00.get()).A00();
        StringBuilder sb = new StringBuilder();
        sb.append("init with cached status: ");
        sb.append(A002);
        0fH.A0j("EncryptedBackupStatusRepository", sb.toString());
        if (A002 != null) {
            A03(A002, this, false);
        }
    }

    public static final C1x1 A00(C1wv c1wv) {
        return (C1x1) c1wv.A0G.A00.get();
    }

    private final void A01() {
        A00(this).A00(this.A02, C1wj.A05);
        A00(this).A00(this.A06, C1wy.A04);
        A00(this).A00(this.A07, C1wz.A04);
        A00(this).A00(this.A05, C1x0.A02);
        A00(this).A00(this.A03, false);
    }

    public static final void A02(AnonymousClass999 anonymousClass999, C1wv c1wv) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("backup status updated:");
        sb.append(anonymousClass999);
        0fH.A0j("EncryptedBackupStatusRepository", sb.toString());
        if (anonymousClass999 instanceof C87e) {
            A03((C1wj) ((C87e) anonymousClass999).A00, c1wv, true);
            return;
        }
        if (anonymousClass999 instanceof 8EF) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("failed to refresh backup status with exception: ");
            sb2.append(((8EF) anonymousClass999).A00);
            str = sb2.toString();
        } else {
            str = "Unknown error - empty result";
        }
        0fH.A0j("EncryptedBackupStatusRepository", str);
        c1wv.A01();
    }

    public static final void A03(C1wj c1wj, C1wv c1wv, boolean z) {
        1xF r0;
        Integer num;
        int intValue;
        Integer num2;
        int intValue2;
        c1wv.A00 = z;
        A00(c1wv).A00(c1wv.A02, c1wj);
        C1ud c1ud = (C1ud) c1wv.A0B.A00.get();
        if (C1ud.A00(c1ud).AZr(c1ud.A02, 2342159435907672078L)) {
            C00i c00i = c1wv.A0A.A00;
            1xB r02 = ((C1x8) c00i.get()).A01;
            if (r02.A03.A00()) {
                C1x3 c1x3 = r02.A05;
                if (c1x3.A07 && (num2 = c1x3.A03) != null && (intValue2 = num2.intValue()) != 0) {
                    C1wk c1wk = (C1wk) c1wv.A0D.A00.get();
                    FbSharedPreferences A03 = C1wk.A03(c1wk);
                    1G9 r03 = 1NK.A4t;
                    11T.A0F(C1wk.A01(c1wk), 1);
                    if (!A03.BNM(C1wg.A02(r03))) {
                        1Ql edit = C1wk.A03(c1wk).edit();
                        11T.A0F(C1wk.A01(c1wk), 1);
                        edit.CaH(C1wg.A02(r03), intValue2 * 1000);
                        edit.commitImmediately();
                    }
                }
            }
            1xB r04 = ((C1x8) c00i.get()).A01;
            if (r04.A03.A00()) {
                C1x3 c1x32 = r04.A05;
                if (c1x32.A07 && (num = c1x32.A02) != null && (intValue = num.intValue()) != 0) {
                    C1wk c1wk2 = (C1wk) c1wv.A0D.A00.get();
                    FbSharedPreferences A032 = C1wk.A03(c1wk2);
                    1G9 r05 = 1NK.A4l;
                    11T.A0F(C1wk.A01(c1wk2), 1);
                    if (!A032.BNM(C1wg.A02(r05))) {
                        1Ql edit2 = C1wk.A03(c1wk2).edit();
                        11T.A0F(C1wk.A01(c1wk2), 1);
                        edit2.CaH(C1wg.A02(r05), intValue * 1000);
                        edit2.commitImmediately();
                    }
                }
            }
        }
        C1wk c1wk3 = (C1wk) c1wv.A0D.A00.get();
        1xB r06 = ((C1x8) c1wv.A0A.A00.get()).A01;
        Boolean bool = null;
        if (r06.A03.A00()) {
            C1x3 c1x33 = r06.A05;
            if (c1x33.A07) {
                bool = c1x33.A01;
            }
        }
        1Ql.A02(C1wk.A02(c1wk3), C1wg.A01(c1wk3, 1NK.A50, 1), 11T.A0O(bool, true));
        ((C1wi) 1Br.A0B(c1wv.A09)).A02(c1wj);
        int ordinal = c1wj.ordinal();
        if (ordinal == 0) {
            A00(c1wv).A00(c1wv.A06, C1wy.A03);
            A00(c1wv).A00(c1wv.A07, C1wz.A02);
            A00(c1wv).A00(c1wv.A05, C1x0.A03);
            A00(c1wv).A00(c1wv.A03, false);
        } else {
            if (ordinal != 2) {
                if (ordinal == 1) {
                    A00(c1wv).A00(c1wv.A06, C1wy.A02);
                    A00(c1wv).A00(c1wv.A07, C1wz.A03);
                    A00(c1wv).A00(c1wv.A05, C1x0.A03);
                    A00(c1wv).A00(c1wv.A03, false);
                    ((C1we) c1wv.A0E.A00.get()).A00(c1wv.A08, true);
                } else if (ordinal == 3) {
                    c1wv.A01();
                }
                r0 = (1xF) c1wv.A0C.A00.get();
                if (1xG.A00((1xG) r0.A02.A00.get()).AZk(36322293609219365L) || ordinal != 1) {
                }
                C00i c00i2 = r0.A04.A00;
                ((C2cr) c00i2.get()).A04(false);
                ((C2cr) c00i2.get()).A05(false);
                ((C2cs) r0.A00.A00.get()).A00(false);
                ((C2cv) r0.A01.A00.get()).A02(false);
                r0.A05(0S2.A07);
                return;
            }
            A00(c1wv).A00(c1wv.A06, C1wy.A02);
            A00(c1wv).A00(c1wv.A07, C1wz.A02);
            A00(c1wv).A00(c1wv.A05, C1x0.A03);
            A00(c1wv).A00(c1wv.A03, true);
        }
        ((C1we) c1wv.A0E.A00.get()).A00(c1wv.A08, false);
        r0 = (1xF) c1wv.A0C.A00.get();
        if (1xG.A00((1xG) r0.A02.A00.get()).AZk(36322293609219365L)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A04(X.C1wv r301) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1wv.A04(X.1wv):void");
    }

    public final void A05(String str) {
        0fH.A0j("EncryptedBackupStatusRepository", 0Pz.A0W("start to refresh backup status call from:  ", str));
        MutableLiveData mutableLiveData = this.A05;
        Object value = mutableLiveData.getValue();
        C1x0 c1x0 = C1x0.A05;
        if (value == c1x0) {
            0fH.A0j("EncryptedBackupStatusRepository", "There is ongoing refresh");
            return;
        }
        boolean contains = this.A0H.contains(str);
        C1ud c1ud = (C1ud) this.A0B.A00.get();
        boolean AZr = C1ud.A00(c1ud).AZr(c1ud.A02, 2342159435911079983L);
        A00(this).A00(mutableLiveData, c1x0);
        A00(this).A00(this.A03, false);
        ((C1x8) this.A0A.A00.get()).A0D(str, contains, AZr).A03(new C3Vn(str, this, 0));
    }
}
