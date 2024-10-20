package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;

/* loaded from: E3r.class */
public final class E3r extends FIJ {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final GL7 A03;
    public final 1De A04;

    public E3r(1De r302, GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A04 = r302;
        Context A0A = AbK.A0A(r302);
        this.A00 = A0A;
        this.A02 = 1Bq.A00(99554);
        this.A01 = 1HG.A00(A0A, 99435);
        this.A03 = gl7;
    }

    public static final void A00(E3r e3r, String str, String str2, float f, float f2) {
        FEm fEm = (FEm) 1Br.A0B(e3r.A02);
        Context context = e3r.A00;
        fEm.A02 = context;
        fEm.A00 = f;
        fEm.A01 = f2;
        fEm.A04 = str;
        fEm.A06 = str2;
        fEm.A05 = "native_templates";
        if (!1BK.A0N(fEm.A07).AZk(36315773848790534L)) {
            FEm.A01(fEm, (String) null);
            return;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        String string = fEm.A02.getString(2131968005);
        3Eh r0 = 3Eh.AJX;
        ERE ere = ERE.A01;
        builder.m11011add((Object) FEm.A00(r0, ere, fEm, string, "w"));
        builder.m11011add((Object) FEm.A00(3Eh.A4S, ere, fEm, fEm.A02.getString(2131955966), "d"));
        builder.m11011add((Object) FEm.A00(3Eh.A3z, ere, fEm, fEm.A02.getString(2131967422), "r"));
        ImmutableList A0z = AbG.A0z(builder, FEm.A00(3Eh.A3K, ere, fEm, fEm.A02.getString(2131953218), "b"));
        context.getClass();
        A0z.getClass();
        EuX euX = new EuX();
        euX.A00 = context;
        euX.A02 = A0z;
        String string2 = fEm.A02.getString(2131957350);
        AbM.A1T(string2);
        euX.A01 = new Etn(3Eh.A65, R4X.A00, string2);
        FF7 A00 = euX.A00();
        fEm.A03 = A00;
        A00.A01(true);
    }
}
