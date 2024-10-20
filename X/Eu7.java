package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* loaded from: Eu7.class */
public final class Eu7 {
    public final ImmutableMap A00;
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final AbR A01 = DKC.A0U(721);

    public Eu7(Context context) {
        Set<F5t> set = (Set) 1Bn.A0E(context, (1BY) null, 199);
        ImmutableMap.Builder A0c = 1BK.A0c();
        for (F5t f5t : set) {
            A0c.put(f5t.A02, f5t);
        }
        this.A00 = A0c.build();
    }

    public Euz A00(ELw eLw) {
        java.util.Map map = this.A02;
        if (map.containsKey(eLw)) {
            return (Euz) map.get(eLw);
        }
        AbR abR = this.A01;
        ELw eLw2 = eLw;
        ImmutableMap immutableMap = this.A00;
        if (!immutableMap.containsKey(eLw)) {
            eLw2 = ELw.A01;
        }
        ImmutableList immutableList = ((F5t) immutableMap.get(eLw2)).A03;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            Euz euz = new Euz(immutableList);
            1Bn.A0K();
            FbInjector.A04(A01);
            map.put(eLw, euz);
            return euz;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
