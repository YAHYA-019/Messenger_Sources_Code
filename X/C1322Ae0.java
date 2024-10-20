package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.Ae0, reason: case insensitive filesystem */
/* loaded from: Ae0.class */
public final class C1322Ae0 implements DIV {
    public static final ImmutableSet A03 = ImmutableSet.A04(ClientDataSourceIdentifier.A0l, ClientDataSourceIdentifier.A0y, ClientDataSourceIdentifier.A0p, ClientDataSourceIdentifier.A0i);
    public final DHz A00;
    public final DHz A01;
    public final java.util.Map A02;

    public C1322Ae0(DHz dHz, DHz dHz2, java.util.Map map) {
        this.A01 = dHz;
        this.A00 = dHz2;
        this.A02 = map;
    }

    public void C4B(DIW diw, Exception exc, Object obj) {
    }

    public void CHk(BOx bOx, DIW diw, ByH byH, Integer num, Object obj, String str, int i, boolean z) {
        if (num == 0S2.A01 || num == 0S2.A0j) {
            DataSourceIdentifier dataSourceIdentifier = (DataSourceIdentifier) this.A02.get(diw);
            if (!A03.contains(dataSourceIdentifier)) {
                DHz dHz = this.A01;
                if (dHz != null && obj != null) {
                    dHz.D14(bOx, dataSourceIdentifier, byH, obj instanceof String ? (String) obj : "", str, i, !z);
                }
                DHz dHz2 = this.A00;
                if (obj != null) {
                    dHz2.D14(bOx, dataSourceIdentifier, byH, obj instanceof String ? (String) obj : "", str, i, !z);
                }
            }
        }
    }

    public void CJa(ByH byH, Object obj) {
        DHz dHz = this.A01;
        if (dHz == null || obj == null) {
            return;
        }
        dHz.CJZ(byH, obj instanceof String ? (String) obj : "");
    }

    public void CKt(DIW diw, ByH byH, Object obj) {
        DataSourceIdentifier dataSourceIdentifier = (DataSourceIdentifier) this.A02.get(diw);
        if (!A03.contains(dataSourceIdentifier)) {
            DHz dHz = this.A01;
            if (dHz != null && obj != null) {
                dHz.D15(dataSourceIdentifier, byH, obj instanceof String ? (String) obj : "");
            }
            DHz dHz2 = this.A00;
            if (obj != null) {
                dHz2.D15(dataSourceIdentifier, byH, obj instanceof String ? (String) obj : "");
            }
        }
    }
}
