package X;

import java.lang.ref.WeakReference;

/* loaded from: FxV.class */
public final class FxV implements GJ7 {
    public final FHz A00;

    public FxV(FHz fHz) {
        this.A00 = fHz;
    }

    public static final Object A00(FHh fHh, String str, java.util.Map map) {
        String str2;
        Object obj = map.get(str);
        if (!(obj instanceof String) || (str2 = (String) obj) == null) {
            return null;
        }
        Object A00 = EYt.A00(fHh, DKc.A01, new Fxm(null, str2, fHh.A0D, -1));
        if (A00 != null) {
            return A00;
        }
        return null;
    }

    @Override // X.GJ7
    public /* bridge */ /* synthetic */ GJ6 Aqd(FHh fHh, GDi gDi, Object obj) {
        EIG A00;
        Exl exl = (Exl) obj;
        Ey5 ey5 = exl != null ? exl.A00 : null;
        11T.A0F(gDi, 1);
        FxG fxG = (FxG) gDi;
        java.util.Map map = fxG.A02;
        11T.A0D(map);
        String str = (String) A00(fHh, "app_id", map);
        if (str == null) {
            throw AnonymousClass001.A0L("AsyncComponentQuery data manifest entry must specify a non-null appId.");
        }
        Number number = (Number) A00(fHh, "cache_ttl", map);
        if (number == null) {
            throw AnonymousClass001.A0L("AsyncComponentQuery data manifest entry must specify a non-null cache TTL.");
        }
        long longValue = number.longValue();
        03W r314 = (java.util.Map) A00(fHh, "params", map);
        if (r314 == null) {
            r314 = 04R.A0G();
        }
        03W r315 = (java.util.Map) A00(fHh, "client_params", map);
        if (r315 == null) {
            r315 = 04R.A0G();
        }
        FHz fHz = this.A00;
        EkU ekU = fHz.A02;
        Esi esi = null;
        if (ekU != null) {
            esi = ekU.A00;
        }
        String A002 = FIB.A00(esi, str, r314);
        synchronized (fHz.A09) {
            A00 = FHz.A00(fHz, ey5, str, A002, longValue, false);
        }
        String str2 = fxG.A00;
        11T.A0A(str2);
        Object obj2 = map.get("query_id");
        DKC.A1U(obj2);
        return new FxS(fHz, A00, str2, (String) obj2, str, r314, r315, longValue);
    }

    @Override // X.GJ7
    public Ek8 BBO(FyG fyG, FxZ fxZ) {
        G1V A00;
        Exl exl;
        WeakReference A14 = 7zL.A14(fxZ);
        FHz fHz = this.A00;
        GH9 fxD = new FxD(A14, 2);
        synchronized (fHz.A0A) {
            A00 = fHz.A08.A00(fxD);
            exl = new Exl(fHz.A00);
            11T.A0F(A00, 2);
        }
        return new Ek8(A00, exl);
    }
}
