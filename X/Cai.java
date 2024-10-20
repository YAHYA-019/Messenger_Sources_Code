package X;

import android.net.Uri;
import android.text.format.Time;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Cai.class */
public final class Cai implements 2Ad {
    public final C06594hd A00 = (C06594hd) 1Bi.A03(49208);
    public final C00i A02 = 1BQ.A00();
    public final C15h A01 = DBe.A00(this, 35);

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        File file2 = new File(file, "messages_sync.txt");
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file2));
        try {
            CIY A00 = CIY.A00(BLy.A02, C15h.A01(this.A01));
            6EC r0 = (6EC) 1Lo.A06(fbUserSession, 50001);
            6E9 r02 = (6E9) 1Lo.A06(fbUserSession, 49998);
            HashMap hashMap = new HashMap(3);
            hashMap.put("sequence_id", String.valueOf(r0.A00()));
            hashMap.put("sync_token", r02.A01(AbstractC11664x8.A08));
            C06594hd c06594hd = this.A00;
            hashMap.put("SyncConnectionStateManager.isConnectedAndUpToDate", String.valueOf(c06594hd.A03(A00)));
            hashMap.put("SyncConnectionStateManager.isQueueTemporarilyUnavailable", String.valueOf(c06594hd.A04(A00)));
            6E9 r03 = (6E9) 1Lo.A06(fbUserSession, 49998);
            1Du it = 1F9.A01.iterator();
            while (it.hasNext()) {
                1F9 r04 = (1F9) it.next();
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("thread_client_time_ms.%s", r04);
                long A002 = r03.A00(AbstractC11664x8.A01(r04));
                String str = "n/a";
                if (A002 > 0) {
                    Time time = new Time();
                    time.set(A002);
                    if (time.format3339(false) != null) {
                        str = time.format3339(false);
                    }
                }
                hashMap.put(formatStrLocaleSafe, str);
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            Iterator A19 = 1BK.A19(hashMap);
            while (A19.hasNext()) {
                String A0i = AnonymousClass001.A0i(A19);
                A0k.append(A0i);
                A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                A0k.append(4YU.A16(A0i, hashMap));
                A0k.append("\n");
            }
            printWriter.write(A0k.toString());
            Uri fromFile = Uri.fromFile(file2);
            printWriter.close();
            HashMap A0u = AnonymousClass001.A0u();
            AbM.A1S(fromFile, "messages_sync.txt", A0u);
            return A0u;
        } catch (Throwable th) {
            try {
                printWriter.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public String getName() {
        return "MessagesSync";
    }

    public boolean isMemoryIntensive() {
        return false;
    }

    public boolean isUserIdentifiable() {
        return false;
    }

    public void prepareDataForWriting() {
    }

    public boolean shouldSendAsync() {
        return 1BK.A0N(this.A02).AZk(36310624185025058L);
    }
}
