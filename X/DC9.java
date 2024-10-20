package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TransportAgnosticLogging;

/* loaded from: DC9.class */
public final /* synthetic */ class DC9 extends 01I implements C0Bo {
    public static final DC9 A00 = new DC9();

    public DC9() {
        super(14, CBk.class, "log", "log(Lcom/facebook/msys/mci/PrivacyContext;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", 0);
    }

    @Override // X.C0Bo
    public /* bridge */ /* synthetic */ Object BQ1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        PrivacyContext privacyContext = (PrivacyContext) obj;
        7zP.A1L(privacyContext, 0, obj7);
        Object[] objArr = new Object[52];
        Integer A12 = AbG.A12();
        Long A0j = 4YV.A0j();
        Integer A11 = AbG.A11();
        System.arraycopy(new Object[]{A12, A0j, (byte) 0, obj2, A11, A0j, (byte) 0, obj3, A12, A0j, (byte) 0, obj4, A11, A0j, (byte) 0, obj5, A12, A0j, (byte) 0, obj6, A11, A0j, (byte) 1, obj7, A12, A0j, (byte) 0}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{obj8, 21, A0j, (byte) 0, obj9, A12, A0j, (byte) 0, obj10, A12, A0j, (byte) 0, obj11, A11, A0j, (byte) 0, obj12, A11, A0j, (byte) 0, obj13, A12, A0j, (byte) 0, obj14}, 0, objArr, 27, 25);
        TransportAgnosticLogging.logTalEventToPipe(privacyContext, 0, false, 13, objArr, CBk.A00);
        return 04S.A00;
    }
}
