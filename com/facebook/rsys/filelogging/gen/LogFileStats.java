package com.facebook.rsys.filelogging.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: LogFileStats.class */
public class LogFileStats {
    public static 2JQ CONVERTER = IR0.A00(ActionId.RTMP_CONNECTION_INTERCEPTED);
    public static long sMcfTypeId;
    public final int droppedLogBytes;
    public final int droppedLogsCount;
    public final int logBytes;
    public final int logsCount;

    public LogFileStats(int i, int i2, int i3, int i4) {
        this.logsCount = i;
        this.logBytes = i2;
        this.droppedLogsCount = i3;
        this.droppedLogBytes = i4;
    }

    public static native LogFileStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LogFileStats)) {
                return false;
            }
            LogFileStats logFileStats = (LogFileStats) obj;
            if (this.logsCount == logFileStats.logsCount && this.logBytes == logFileStats.logBytes && this.droppedLogsCount == logFileStats.droppedLogsCount && this.droppedLogBytes == logFileStats.droppedLogBytes) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A03(this.logsCount) + this.logBytes) * 31) + this.droppedLogsCount) * 31) + this.droppedLogBytes;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LogFileStats{logsCount=");
        A0k.append(this.logsCount);
        A0k.append(",logBytes=");
        A0k.append(this.logBytes);
        A0k.append(",droppedLogsCount=");
        A0k.append(this.droppedLogsCount);
        A0k.append(",droppedLogBytes=");
        return AbstractC2327GOs.A0W(A0k, this.droppedLogBytes);
    }
}
