package X;

import android.content.Context;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.filelogging.gen.LogFile;
import com.facebook.rsys.filelogging.gen.LogFileStats;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: GxL.class */
public final class GxL extends LargeLogUploadProxy {
    public final 04J A00;
    public final Context A01;
    public final C11684xK A02;
    public final ExecutorService A03;

    public GxL(Context context, 04J r303, C11684xK c11684xK, ExecutorService executorService) {
        7zR.A1O(c11684xK, r303);
        this.A01 = context;
        this.A02 = c11684xK;
        this.A00 = r303;
        this.A03 = executorService;
    }

    public static final void A00(GxL gxL, File file, String str, String str2, String str3, int i, int i2) {
        try {
            IE4 ie4 = new IE4(file, str2);
            LinkedHashMap A0A = 04R.A0A(7zQ.A1b("x-rp-rtc-logtype", String.valueOf(i2)));
            ICY icy = new ICY();
            icy.A0C = A0A;
            icy.A02 = EPR.A19;
            HkU hkU = new HkU(icy);
            LogFileStats logFileStats = null;
            if (i == 0) {
                try {
                    Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), C03r.A05);
                    BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    try {
                        String readLine = bufferedReader.readLine();
                        while (true) {
                            String str4 = readLine;
                            if (str4 == null) {
                                bufferedReader.close();
                                break;
                            }
                            LogFileStats createLogFileStats = LogFile.CProxy.createLogFileStats(str4);
                            if (createLogFileStats != null) {
                                bufferedReader.close();
                                logFileStats = createLogFileStats;
                                break;
                            }
                            readLine = bufferedReader.readLine();
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AnonymousClass127.A00(bufferedReader, th);
                            throw th2;
                        }
                    }
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            gxL.A02.A01(hkU, ie4, new ISb(logFileStats, gxL, str, str3, i));
        } catch (5DD unused2) {
            1UG A08 = 1BK.A08(gxL.A00, "rtc_large_log_upload");
            if (A08.isSampled()) {
                4YU.A1I(A08, "log_type", i);
                4YU.A1I(A08, "status", 5);
                A08.A0B("requestor");
                A08.A7R("shared_call_id", str);
                GOo.A1F(A08, str3);
            }
        }
    }

    private final void A01(String str, String str2, String str3, String str4, int i, int i2) {
        StringBuilder A0n = AnonymousClass001.A0n(this.A01.getCacheDir().getAbsolutePath());
        A0n.append("/RsysLogs/");
        A0n.append(str2);
        A0n.append('/');
        File A0E = AnonymousClass001.A0E(AnonymousClass001.A0d(str3, A0n));
        boolean exists = A0E.exists();
        1UG A08 = 1BK.A08(this.A00, "rtc_large_log_upload");
        if (A08.isSampled()) {
            4YU.A1I(A08, "log_type", i);
            int i3 = 3;
            if (exists) {
                i3 = 7;
            }
            4YU.A1I(A08, "status", i3);
            A08.A0B("requestor");
            A08.A7R("shared_call_id", str);
            GOo.A1F(A08, str2);
        }
        if (exists) {
            ExecutorService executorService = this.A03;
            if (executorService != null) {
                executorService.execute(new J3o(this, A0E, str, str4, str2, i, i2));
            } else {
                A00(this, A0E, str, str4, str2, i, i2);
            }
        }
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public void setStructuredLogger(McfReference mcfReference) {
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public void uploadConsoleLog(String str, String str2) {
        A01(str, str2, "ringbuffer.txt", "text/plain", 0, 1BL.A1X(str, str2) ? 1 : 0);
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public void uploadOnDemand(byte[] bArr) {
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public void uploadRtcEventLog(String str, String str2) {
        A01(str, str2, "rtc-event-log.log", AnonymousClass000.A00(2), 1BL.A1W(str, str2) ? 1 : 0, 2);
    }

    @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
    public void uploadSdpLog(String str, String str2) {
        11T.A0H(str, str2);
        A01(str, str2, "sdp.txt", "text/plain", 2, 3);
    }
}
