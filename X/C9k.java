package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: C9k.class */
public abstract class C9k {
    public static final int A00(AcW acW) {
        BS3 bs3 = BS3.$redex_init_class;
        switch (acW.ordinal()) {
            case 0:
                return 9;
            case 2:
            case 36:
                return 1;
            case 3:
            case 37:
                return 2;
            case 13:
                return 3;
            case 14:
                return 7;
            case 15:
            case 18:
                return 4;
            case 17:
                return 5;
            case 19:
                return 6;
            case 20:
                return 13;
            case 38:
                return 15;
            case 39:
                return 16;
            case 40:
                return 17;
            default:
                return 8;
        }
    }

    public static final BON A01(DataSourceIdentifier dataSourceIdentifier) {
        BON bon = null;
        if (dataSourceIdentifier != null) {
            String Aus = dataSourceIdentifier.Aus();
            11T.A0D(Aus);
            if (0CU.A0T(Aus, "dsq1", false)) {
                bon = BON.A03;
            } else {
                if (0CU.A0T(Aus, "dsq2", false)) {
                    return BON.A04;
                }
                if (0CU.A0T(Aus, "server", false)) {
                    return BON.A02;
                }
                if (dataSourceIdentifier instanceof ClientDataSourceIdentifier) {
                    return BON.A01;
                }
            }
        }
        return bon;
    }
}
