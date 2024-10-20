package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: F8K.class */
public final class F8K {
    public ImmutableMap A00;
    public Long A01;
    public final C00i A04 = 1Bi.A02(C01s.class, (Class) null);
    public final C00i A05 = 1Bi.A02(FbSharedPreferences.class, (Class) null);
    public final C00i A06 = 1Bi.A02(1CO.class, (Class) null);
    public final C00i A02 = 1Bi.A02(C0dp.class, (Class) null);
    public final C00i A07 = 1Bi.A02(AnonymousClass244.class, (Class) null);
    public final C00i A03 = 1Bn.A06(1Bn.A00(), I9a.class, (Class) null);

    public static void A00(F8K f8k, java.util.Map map) {
        String A06;
        try {
            if (1BK.A0N(f8k.A06).AZk(2342155561837073114L)) {
                ImmutableMap.Builder A0c = 1BK.A0c();
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    A0c.put(A0z.getKey(), A0z.getValue().toString());
                }
                A06 = ((AnonymousClass244) f8k.A07.get()).A0W(A0c.build());
            } else {
                A06 = new Gson().A06(map);
            }
            1Ql A0V = 1BL.A0V(f8k.A05);
            f8k.A03.get();
            A0V.CaL(51K.A0B, A06);
            A0V.commit();
        } catch (2LD e) {
            1BK.A09(f8k.A04).softReport("EffectBadgePersistence", "Error with writing previously badged effects time", e);
        }
    }

    public ImmutableMap A01() {
        java.util.Map map;
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            FbSharedPreferences A0R = 1BK.A0R(this.A05);
            this.A03.get();
            String BD0 = A0R.BD0(51K.A0B);
            ImmutableMap.Builder A0c = 1BK.A0c();
            try {
                if (!1JF.A0A(BD0)) {
                    if (C3o5.A0F(this.A06).AZk(2342155561837073114L)) {
                        C00i c00i = this.A07;
                        map = (java.util.Map) ((AnonymousClass244) c00i.get()).A0R(((AnonymousClass244) c00i.get())._typeFactory.A0C(ImmutableMap.class, String.class, Long.class), BD0);
                    } else {
                        map = (java.util.Map) new Gson().A05(BD0, new EHW(this).type);
                    }
                    if (map != null) {
                        Iterator A0y = AnonymousClass001.A0y(map);
                        while (A0y.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0y);
                            if (C3o5.A08(A0z) > 1BL.A08(this.A02) - 5184000000L || C3o5.A08(A0z) <= 0) {
                                A0c.put(A0z);
                            }
                        }
                    }
                }
            } catch (IOException | RuntimeException e) {
                1BK.A09(this.A04).softReport("EffectBadgePersistence", "Error with parsing previously badged effects time", e);
            }
            immutableMap = A0c.build();
            this.A00 = immutableMap;
        }
        return immutableMap;
    }
}
