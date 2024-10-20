package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import org.apache.http.message.BasicHeader;

/* renamed from: X.1m8, reason: invalid class name */
/* loaded from: 1m8.class */
public final class C1m8 {
    public final C00i A02 = new 1BQ(16385);
    public final C0et A01 = (C0et) 1Bi.A03(83604);
    public final C00i A00 = new 1BQ(33013);
    public final C00i A03 = new 1BQ(84488);

    public ImmutableList A00() {
        String A02 = A02();
        if (1JF.A0A(A02)) {
            return null;
        }
        return ImmutableList.of((Object) new BasicHeader(AbE.A00(ActionId.RTMP_CONNECTION_INTERCEPTED), A02));
    }

    public String A01() {
        C0et c0et = this.A01;
        if (c0et != C0et.A0P && c0et != C0et.A0U && c0et != C0et.A0C) {
            return null;
        }
        C00i c00i = this.A02;
        String BCz = ((2yD) c00i.get()).BCz(36873445287460906L, "");
        C0et c0et2 = C0et.A0C;
        if (c0et == c0et2 && 1JF.A0B(BCz)) {
            BCz = null;
        }
        C00i c00i2 = this.A00;
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i2.get();
        1G2 r0 = 1NK.A2D;
        String BD0 = fbSharedPreferences.BD0(r0);
        long now = ((C0dr) this.A03.get()).now();
        FbSharedPreferences fbSharedPreferences2 = (FbSharedPreferences) c00i2.get();
        1G2 r02 = 1NK.A2E;
        long Av1 = now - fbSharedPreferences2.Av1(r02, now);
        if (Av1 != 0) {
            if (Av1 >= 0) {
                long j = 14400000;
                if (c0et == c0et2) {
                    long Auy = 1BK.A0N(c00i).Auy(36600895252796668L);
                    if (Auy >= 0) {
                        j = Auy * 3600000;
                    }
                }
                if (Av1 <= j) {
                    return BD0;
                }
            }
            1Ql edit = ((FbSharedPreferences) c00i2.get()).edit();
            edit.Cdj(r02);
            edit.Cdj(r0);
            edit.commit();
        }
        return BCz;
    }

    public String A02() {
        C0et c0et = this.A01;
        if (c0et == C0et.A0P || c0et == C0et.A0U) {
            return ((2yD) this.A02.get()).BCz(36873445287395369L, (String) null);
        }
        return null;
    }
}
