package X;

import com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector;
import com.facebook.inject.FbInjector;
import com.facebook.mobileconfig.init.MobileConfigSessionlessInit;
import com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos;
import java.util.Set;

/* renamed from: X.5st, reason: invalid class name */
/* loaded from: 5st.class */
public final class C5st {
    public static final Set A03;
    public final 1BP A02 = FbInjector.A00;
    public final 1Br A01 = 1Bq.A00(68750);
    public final 1Br A00 = 1Bq.A00(16385);

    static {
        Integer[] numArr = new Integer[33];
        System.arraycopy(new Integer[]{2000, 2004, 2002, Integer.valueOf(SnAppManagerProtos.SNAPP_START_RESPONSE_MSGTYPE), Integer.valueOf(SnAppManagerProtos.SNAPP_STOP_RESPONSE_MSGTYPE), 2005, 2007, 2009, 2008, Integer.valueOf(MobileConfigSessionlessInit.SYNC_UPDATE_WAIT_TIME_MS), 3007, 3002, 3003, 3006, 3010, 3014, Integer.valueOf(ProcessErrorMonitorANRDetector.START_DELAY_MS), 4001, 3001, 4002, 4003, 4004, 4005, 4006, 4007, 3004, 3005}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{3008, 3009, 3023, 3015, 3016, 3017}, 0, numArr, 27, 6);
        A03 = 02H.A02(numArr);
    }
}
