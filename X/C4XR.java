package X;

import com.facebook.messaging.montage.omnistore.storedprocedures.MontageNonUserRefreshStoredProcedureComponent;
import com.facebook.omnistore.OmnistoreIOException;
import java.util.Set;

/* renamed from: X.4XR, reason: invalid class name */
/* loaded from: 4XR.class */
public final class C4XR implements Runnable {
    public static final String __redex_internal_original_name = "MontageNonUserRefreshStoredProcedureComponent$2";
    public final /* synthetic */ MontageNonUserRefreshStoredProcedureComponent A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C4XR(MontageNonUserRefreshStoredProcedureComponent montageNonUserRefreshStoredProcedureComponent, String str, String str2, String str3, String str4) {
        this.A00 = montageNonUserRefreshStoredProcedureComponent;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageNonUserRefreshStoredProcedureComponent", " sending request");
            MontageNonUserRefreshStoredProcedureComponent montageNonUserRefreshStoredProcedureComponent = this.A00;
            3rP r0 = montageNonUserRefreshStoredProcedureComponent.A00;
            if (r0 != null) {
                byte[] bytes = this.A03.getBytes(MontageNonUserRefreshStoredProcedureComponent.A0A);
                String str = this.A04;
                String str2 = this.A02;
                3rP r02 = r0;
                C1oA c1oA = r02.A02;
                synchronized (c1oA) {
                    C1oA.A01(c1oA).applyStoredProcedure(r02.A00, bytes, str, str2);
                }
                montageNonUserRefreshStoredProcedureComponent.A07.put(str, this.A01);
            }
        } catch (OmnistoreIOException e) {
            0fH.A0s("com.facebook.messaging.montage.omnistore.storedprocedures.MontageNonUserRefreshStoredProcedureComponent", " IO error while sending stored procedure", e);
            MontageNonUserRefreshStoredProcedureComponent montageNonUserRefreshStoredProcedureComponent2 = this.A00;
            Set set = montageNonUserRefreshStoredProcedureComponent2.A08;
            java.util.Map map = montageNonUserRefreshStoredProcedureComponent2.A07;
            String str3 = this.A04;
            set.add(map.get(str3));
            map.remove(str3);
        }
    }
}
