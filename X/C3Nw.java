package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: X.3Nw, reason: invalid class name */
/* loaded from: 3Nw.class */
public final class C3Nw {
    public final 1Fi A00;
    public final 1Br A01;
    public final 1Br A02 = 1BK.A0C();

    public C3Nw() {
        1Br A00 = 1Bq.A00(16496);
        this.A01 = A00;
        1Fi A002 = ((1Fe) 1Br.A0B(A00)).A00("session_validation_result_helper");
        11T.A0A(A002);
        this.A00 = A002;
    }

    public final boolean A00(String str, String str2) {
        if (!1Br.A07(this.A02).AZk(36326141899855152L) || !ConstantsKt.CAMERA_ID_BACK.equals(str)) {
            return false;
        }
        if (str2 == null) {
            str2 = ConstantsKt.CAMERA_ID_FRONT;
        }
        String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        1Fi r0 = this.A00;
        String string = r0.getString(0Pz.A0W(str2, "waiting_room_shown_last_date"), "");
        11T.A0A(string);
        if (string.equals(format)) {
            return r0.getInt(0Pz.A0W(str2, "waiting_room_shown_count_today"), 0) < 10;
        }
        InterfaceC00051a0 AP5 = r0.AP5();
        AP5.CaK(0Pz.A0W(str2, "waiting_room_shown_last_date"), format);
        AP5.commit();
        InterfaceC00051a0 AP52 = r0.AP5();
        AP52.CaD(0Pz.A0W(str2, "waiting_room_shown_count_today"), 0);
        AP52.commit();
        return true;
    }
}
