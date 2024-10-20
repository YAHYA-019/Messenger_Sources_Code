package X;

import android.database.Cursor;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4Uh, reason: invalid class name */
/* loaded from: 4Uh.class */
public abstract class C4Uh {
    public static final String A00;

    static {
        String A01 = 4IS.A01("DiagnosticsWrkr");
        11T.A0A(A01);
        A00 = A01;
    }

    public static final String A00(4JV r301, 4JW r302, 4JU r303, List list) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(0Pz.A0j("\n Id \t Class Name\t ", "Job Id", "\t State\t Unique Name\t Tags\t"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4Kf c4Kf = (C4Kf) it.next();
            C4Kj BE5 = r301.BE5(C4Kh.A00(c4Kf));
            Integer valueOf = BE5 != null ? Integer.valueOf(BE5.A01) : null;
            String str = c4Kf.A0M;
            TreeMap treeMap = 4KC.A08;
            4KE A002 = 4KF.A00("SELECT name FROM workname WHERE work_spec_id=?", 1);
            A002.ACG(1, str);
            C4Il c4Il = ((LRp) r302).A01;
            c4Il.A06();
            Cursor A02 = c4Il.A02(A002);
            try {
                ArrayList A0t = AnonymousClass001.A0t(A02.getCount());
                while (A02.moveToNext()) {
                    A0t.add(A02.isNull(0) ? null : A02.getString(0));
                }
                A02.close();
                A002.A00();
                String A0K = 0QD.A0K(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A0t, (Function1) null, -1);
                String A0K2 = 0QD.A0K(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", r303.BEM(str), (Function1) null, -1);
                StringBuilder A0k2 = AnonymousClass001.A0k();
                A0k2.append('\n');
                A0k2.append(str);
                A0k2.append("\t ");
                A0k2.append(c4Kf.A0I);
                A0k2.append("\t ");
                A0k2.append(valueOf);
                A0k2.append("\t ");
                A0k2.append(c4Kf.A0E.name());
                A0k2.append("\t ");
                A0k2.append(A0K);
                A0k2.append("\t ");
                A0k2.append(A0K2);
                A0k2.append('\t');
                1BK.A1R(A0k, A0k2);
            } catch (Throwable th) {
                A02.close();
                A002.A00();
                throw th;
            }
        }
        return 11T.A02(A0k);
    }
}
