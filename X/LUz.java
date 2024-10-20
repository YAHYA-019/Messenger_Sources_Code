package X;

import android.os.Bundle;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: LUz.class */
public final class LUz implements MIK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LE1 A01;
    public final /* synthetic */ KmE A02;
    public final /* synthetic */ List A03;

    public LUz(LE1 le1, KmE kmE, List list, int i) {
        this.A01 = le1;
        this.A03 = list;
        this.A02 = kmE;
        this.A00 = i;
    }

    @Override // X.MIK
    public /* bridge */ /* synthetic */ void COx(Bundle bundle, Object obj) {
        KhA khA = (KhA) obj;
        0fH.A0j("ContinuousContactUploadHelper", "CCU : sendCreateSessionNetworkRequest successful");
        LE1 le1 = this.A01;
        List unmodifiableList = Collections.unmodifiableList(this.A03);
        2JX r0 = khA.A00;
        if (r0.A0r(1661853540) != null) {
            le1.A04 = r0.A0r(1661853540);
            KmP kmP = le1.A0P;
            2JY A0B = 1BK.A0B(khA.A01, 2JX.class, 1333734487, 1921750813);
            TreeJNI A0L = A0B == null ? null : A0B.A0L(1985941072, 2JX.class, 1305285468);
            kmP.A00 = A0L.getIntValue(-268093978);
            kmP.A01 = A0L.getIntValue(-654564965);
            kmP.A02 = A0L.getIntValue(-1148771353);
            kmP.A03 = A0L.getIntValue(248341298);
            A0L.getIntValue(-765311270);
            A0L.getIntValue(-1349186132);
            kmP.A04 = A0L.getIntValue(-698730173);
            boolean booleanValue = r0.getBooleanValue(-614258180);
            if (!le1.A08 && !booleanValue) {
                ArrayList A0s = AnonymousClass001.A0s();
                HashSet A0v = AnonymousClass001.A0v();
                ImmutableList A0c = r0.A0c(-1251596361, 2JX.class, -18982915);
                ArrayList A0s2 = AnonymousClass001.A0s();
                1Du it = A0c.iterator();
                while (it.hasNext()) {
                    2JY r02 = (2JY) it.next();
                    A0s2.add(new KhB(r02.A0r(3195150), r02.A0r(993548233)));
                }
                Iterator it2 = A0s2.iterator();
                while (it2.hasNext()) {
                    KhB khB = (KhB) it2.next();
                    String str = khB.A01;
                    String str2 = khB.A00;
                    if (str != null && !str.isEmpty() && !A0v.contains(str)) {
                        A0v.add(str);
                        Kit kit = new Kit(Long.parseLong(str), str2);
                        kit.A00 = 0S2.A00;
                        A0s.add(kit);
                    }
                }
                Kod kod = le1.A0W;
                kod.A00.AFP();
                kod.A00(A0s);
            }
            Bundle A05 = 1BK.A05();
            if (bundle != null) {
                A05.putParcelable("matched_contact", bundle.getParcelable("matched_contact"));
            }
            A05.putBoolean("in_sync", booleanValue);
            A05.putBoolean("full_upload", le1.A08);
            KuQ kuQ = le1.A0U;
            A05.putString("root_hash", kuQ.A01());
            A05.putInt(DKB.A00(127), le1.A00);
            A05.putLong("last_upload_success_time", kuQ.A00());
            JR1.A1B(A05, le1);
            A05.putInt("num_of_retries", le1.A01);
            A05.putString("ccu_session_id", le1.A04);
            Kob kob = le1.A0Q;
            A05.putString("family_device_id", kob.A00() == null ? kob.A00() : null);
            Iterator it3 = le1.A0R.A01.iterator();
            while (it3.hasNext()) {
                ((ML4) it3.next()).Bry(A05);
            }
            le1.A0W.A00(unmodifiableList);
        } else {
            Bundle A052 = 1BK.A05();
            A052.putString(TraceFieldType.FailureReason, "create_session_fail");
            A052.putInt("num_of_retries", le1.A01);
            A052.putString("failure_message", "create session result is null");
            Ksr ksr = le1.A0R;
            LE1.A02(A052, le1);
            Iterator it4 = ksr.A01.iterator();
            while (it4.hasNext()) {
                ((ML4) it4.next()).Brx(A052);
            }
            le1.A0T.A02(false, "create_session_invalid_response");
        }
        LE1.A05(le1);
    }

    @Override // X.MIK
    public void onFailure(Throwable th) {
        Bundle A05 = 1BK.A05();
        A05.putString(TraceFieldType.FailureReason, "create_session_fail");
        A05.putString("failure_message", th.getMessage());
        LE1 le1 = this.A01;
        A05.putBoolean("full_upload", le1.A08);
        A05.putInt("num_of_retries", le1.A01);
        Kob kob = le1.A0Q;
        A05.putString("family_device_id", kob.A00() != null ? kob.A00() : null);
        Ksr ksr = le1.A0R;
        LE1.A02(A05, le1);
        Iterator it = ksr.A01.iterator();
        while (it.hasNext()) {
            ((ML4) it.next()).Brx(A05);
        }
        int i = le1.A01 - 1;
        le1.A01 = i;
        if (i >= 0) {
            LE1.A06(le1, this.A02, this.A03, this.A00);
        } else {
            le1.A0T.A01(TraceFieldType.FailureReason, 0Pz.A1B("Session create failed with ", th));
            LE1.A05(le1);
        }
    }
}
