package com.facebook.quicklog.reliability;

import com.facebook.quicklog.PointEditor;

/* loaded from: UserFlowJSI.class */
public class UserFlowJSI {
    public UserFlowLogger mUserFlowLogger;

    public UserFlowJSI(UserFlowLogger userFlowLogger) {
        this.mUserFlowLogger = userFlowLogger;
    }

    public static int extractInstanceId(long j) {
        return (int) (j >>> 32);
    }

    public void userFlowAddAnnotation(int i, int i2, String str, String str2) {
        this.mUserFlowLogger.flowAnnotate(this.mUserFlowLogger.generateFlowId(i, i2), str, str2);
    }

    public void userFlowAddAnnotation(int i, int i2, String str, boolean z) {
        this.mUserFlowLogger.flowAnnotate(this.mUserFlowLogger.generateFlowId(i, i2), str, z);
    }

    public void userFlowEndCancel(int i, int i2, String str) {
        this.mUserFlowLogger.flowEndCancel(this.mUserFlowLogger.generateFlowId(i, i2), str);
    }

    public void userFlowEndFail(int i, int i2, String str, String str2) {
        this.mUserFlowLogger.flowEndFail(this.mUserFlowLogger.generateFlowId(i, i2), str, str2);
    }

    public void userFlowEndSuccess(int i, int i2) {
        this.mUserFlowLogger.flowEndSuccess(this.mUserFlowLogger.generateFlowId(i, i2));
    }

    public int userFlowGetNextInstanceKey(int i) {
        return (int) (this.mUserFlowLogger.generateNewFlowId(i) >>> 32);
    }

    public void userFlowMarkPoint(int i, int i2, String str) {
        this.mUserFlowLogger.flowMarkPoint(this.mUserFlowLogger.generateFlowId(i, i2), str);
    }

    public PointEditor userFlowPointEditor(int i, int i2, String str) {
        return this.mUserFlowLogger.markPointWithEditor(this.mUserFlowLogger.generateFlowId(i, i2), str);
    }

    public void userFlowStart(int i, int i2, String str, boolean z) {
        this.mUserFlowLogger.flowStart(this.mUserFlowLogger.generateFlowId(i, i2), new UserFlowConfig(str, z));
    }

    public void userFlowStartIfNotOngoing(int i, int i2, String str, boolean z) {
        this.mUserFlowLogger.flowStartIfNotOngoing(this.mUserFlowLogger.generateFlowId(i, i2), new UserFlowConfig(str, z));
    }
}
