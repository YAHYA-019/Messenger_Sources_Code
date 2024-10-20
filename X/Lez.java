package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.android.gms.wearable.internal.zzhg;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: Lez.class */
public final class Lez implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Lez(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        SettableFuture A0j;
        1Ql A0V;
        try {
            switch (this.A00) {
                case 0:
                    throw AnonymousClass001.A0Q(1BJ.A00(1871));
                case 1:
                    throw AnonymousClass001.A0Q("onMessageReceived");
                case 2:
                    5rZ r0 = (5rZ) obj;
                    MDA mda = (MDA) this.A02;
                    A0j = 4YU.A0j();
                    String str = ((zzhg) mda).A00;
                    0fH.A07(5rZ.class, str, "Peer connected: %s");
                    C00i c00i = r0.A00;
                    c00i.get();
                    HashSet A0v = AnonymousClass001.A0v();
                    FbSharedPreferences A0R = 1BK.A0R(c00i);
                    1G2 r02 = 1NK.A4G;
                    Collections.addAll(A0v, A0R.A3a(r02, "").split(":"));
                    A0v.add(str);
                    A0V = 1BL.A0V(c00i);
                    A0V.CaL(r02, new Joiner(":").join(A0v));
                    break;
                case 3:
                    5rZ r03 = (5rZ) obj;
                    MDA mda2 = (MDA) this.A02;
                    A0j = 4YU.A0j();
                    String str2 = ((zzhg) mda2).A00;
                    0fH.A07(5rZ.class, str2, "Peer disconnected: %s");
                    C00i c00i2 = r03.A00;
                    c00i2.get();
                    HashSet A0v2 = AnonymousClass001.A0v();
                    FbSharedPreferences A0R2 = 1BK.A0R(c00i2);
                    1G2 r04 = 1NK.A4G;
                    Collections.addAll(A0v2, A0R2.A3a(r04, "").split(":"));
                    A0v2.remove(str2);
                    A0V = 1BL.A0V(c00i2);
                    A0V.CaL(r04, new Joiner(":").join(A0v2));
                    break;
                default:
                    return ((5sD) this.A02).D4z(this.A01, obj);
            }
            A0V.commit();
            A0j.set((Object) null);
            return A0j;
        } catch (InterruptedException e) {
            A0j.setException(e);
            return A0j;
        }
    }
}
