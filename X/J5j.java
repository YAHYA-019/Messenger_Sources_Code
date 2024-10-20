package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: J5j.class */
public final class J5j implements C15h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ IN1 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AtomicReference A06;

    public J5j(IN1 in1, String str, String str2, AtomicReference atomicReference, int i, long j, long j2) {
        this.A03 = in1;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = atomicReference;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        IN1 in1 = this.A03;
        2Jh r0 = (2Jh) in1.A03.get();
        int i = this.A00;
        2Ji r02 = new 2Ji();
        r02.A05 = "<override-ignore>";
        r02.A09 = false;
        long j = this.A02;
        r02.A01 = new C1Z7(j, j, j, false, false);
        r02.A02 = new 1ZA(((int) this.A01) * 86400, false);
        H0F h0f = new H0F(this);
        List list = r02.A08;
        if (list == null) {
            list = AbF.A1F();
            r02.A08 = list;
        }
        list.add(h0f);
        2Jv A01 = 2Jh.A01(r0, 2Jh.A02(new 2Jj(r02), i), i);
        HyL hyL = in1.A02;
        String str = this.A04;
        try {
            JSONObject A1F = DKC.A1F(1BK.A0N(hyL.A01).BCy(36873947798634738L));
            if (A1F.has(str)) {
                int i2 = A1F.getInt(str);
                if (i2 > 0) {
                    C00i c00i = hyL.A00;
                    FbSharedPreferences A0R = 1BK.A0R(c00i);
                    1G2 r03 = HyL.A02;
                    if (A0R.ArU(1G3.A01(r03, str), 0) < i2) {
                        A01.removeAll();
                        1Ql A0V = 1BL.A0V(c00i);
                        A0V.CaE(1G3.A01(r03, str), i2);
                        A0V.commit();
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return new EnH(A01, this.A06, j);
    }
}
