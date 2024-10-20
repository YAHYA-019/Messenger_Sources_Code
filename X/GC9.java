package X;

import com.facebook.acra.constants.ActionId;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: GC9.class */
public final class GC9 extends C00q implements 0Be {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GC9(int i, Object obj, Object obj2, Object obj3) {
        super(4);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        EN2 en2;
        if (this.A00 != 0) {
            EzU ezU = (EzU) obj;
            9cN r0 = (9cN) obj2;
            int A03 = AnonymousClass001.A03(obj3);
            C00m c00m = (C00m) obj4;
            11T.A0H(ezU, r0);
            11T.A0F(c00m, 3);
            boolean z = false;
            boolean A1Q = AnonymousClass001.A1Q(A03 & ActionId.MISSED_EVENT, 48);
            int i = A03 & 7;
            C2k5 c2k5 = (C2k5) this.A02;
            int i2 = 4;
            if (i == 5) {
                i2 = 2;
            }
            int i3 = -7zS.A01(c2k5, i2);
            int A01 = A1Q ? -7zS.A01(c2k5, 16.0d) : 7zS.A01(c2k5, 8.0d);
            C8hz c8hz = (C8hz) this.A03;
            if (c8hz.A02 && 7zL.A1V(ezU.A04) && (en2 = ezU.A00) != EN2.A04 && en2 != EN2.A06 && en2 != EN2.A05) {
                z = true;
            }
            C8hz.A0L(c2k5, (Esz) this.A01, c8hz, ezU, r0, c00m, c8hz.A01, A03, i3, A01, z);
        } else {
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            Boolean bool = (Boolean) obj4;
            boolean A1W = 1BL.A1W(str, str2);
            11T.A0F(str3, 2);
            DeA deA = (FH1) this.A03;
            EgZ egZ = (EgZ) this.A01;
            11T.A0F(egZ, 0);
            ETO eto = (ETO) 1Br.A0B(deA.A02);
            eto.A00().markerPoint(231933580, 0, "editor_native_launch_data_fetch_end");
            eto.A00().markerEnd(231933580, 0, (short) 2);
            String str4 = ((FH1) deA).A02;
            if (!str2.equals(str4)) {
                ((FH1) deA).A01 = str4 == null ? "cold" : "cache_key_changed";
                String str5 = ((FH1) deA).A03;
                if (str5 != null) {
                    LinkedHashMap A1C = 1BK.A1C();
                    BitSet A18 = 1BK.A18(2);
                    A1C.put("launch_data_serialized", str5);
                    A18.set(0);
                    03W A0G = 04R.A0G();
                    11T.A0F(A0G, 0);
                    A1C.put("logging_parameters", A0G);
                    A18.set(A1W ? 1 : 0);
                    if (A18.nextClearBit(0) < 2) {
                        throw AnonymousClass001.A0N("Missing required params");
                    }
                    new FZb("com.bloks.www.screen_query.AEVTwoScreenQuery", (String) null, 04R.A0D(A1C), 04R.A0G(), 719983200, 86400L, A1W);
                    EYd.A00(egZ).A05("com.bloks.www.screen_query.AEVTwoScreenQuery", 04R.A0G(), ELX.A00);
                }
                ((FH1) deA).A02 = null;
            }
            ((FH1) deA).A02 = str2;
            ((FH1) deA).A03 = str;
            ((FH1) deA).A04 = str3;
            ((FH1) deA).A00 = bool;
            7zL.A1R(this.A02);
        }
        return 04S.A00;
    }
}
