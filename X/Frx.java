package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Frx.class */
public abstract class Frx implements 13P {
    public final 1Ve A00;

    public Frx(1Ve r302) {
        this.A00 = r302;
    }

    public void Asn(Context context, C13b c13b, 13S r304) {
        Ast(context, new Frw(this, c13b, r304), Collections.singleton(r304));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Class, java.lang.Class<X.F19>] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.11g] */
    public void Ast(Context context, C13b c13b, Set set) {
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((13S) it.next()).A02);
        }
        ?? r0 = F19.class;
        try {
            r0 = (C11g) DKF.A0n((Class) r0);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) hashSet);
            Ffx ffx = (Ffx) r0;
            ffx.A01.A06("key_requests", copyOf);
            ffx.A02 = AnonymousClass001.A1T(copyOf);
            C3s4 ACe = ffx.ACe();
            FwH fwH = new FwH(2, hashSet, set, this, c13b);
            FfP.A00(new FfR(fwH, 1), this.A00, ACe, fwH, 7);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public void BYM(Context context, C13b c13b) {
        try {
            C3s4 ACe = ((GEs) DKF.A0n(F18.class)).ACe();
            FfP.A00(new FfR(c13b, 2), this.A00, ACe, c13b, 8);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(F18.class);
        }
    }
}
