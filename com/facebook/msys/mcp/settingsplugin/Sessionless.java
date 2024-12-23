package com.facebook.msys.mcp.settingsplugin;

import X.AnonymousClass001;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private String MsysSettingsImpl_MsysCreateCopyOfStringSettingJNI(String str, String str2) {
        if (str2 == null) {
            str2 = null;
        }
        String MsysSettingsImpl_MsysCreateCopyOfStringSetting = MsysSettingsImpl_MsysCreateCopyOfStringSetting(str, str2);
        if (MsysSettingsImpl_MsysCreateCopyOfStringSetting != null) {
            return MsysSettingsImpl_MsysCreateCopyOfStringSetting;
        }
        return null;
    }

    private boolean MsysSettingsImpl_MsysReadBooleanSettingJNI(String str, boolean z) {
        return MsysSettingsImpl_MsysReadBooleanSetting(str, z);
    }

    private double MsysSettingsImpl_MsysReadDoubleSettingJNI(String str, double d) {
        throw AnonymousClass001.A0T("Not implemented");
    }

    private int MsysSettingsImpl_MsysReadInt32SettingJNI(String str, int i) {
        return MsysSettingsImpl_MsysReadInt32Setting(str, i);
    }

    private long MsysSettingsImpl_MsysReadInt64SettingJNI(String str, long j) {
        return MsysSettingsImpl_MsysReadInt64Setting(str, j);
    }

    private boolean MsysSettingsImpl_MsysReadSettingIsNullJNI(String str) {
        return MsysSettingsImpl_MsysReadSettingIsNull(str);
    }

    private void MsysSettingsImpl_MsysRemoveSettingJNI(String str) {
        MsysSettingsImpl_MsysRemoveSetting(str);
    }

    private void MsysSettingsImpl_MsysWriteBooleanSettingJNI(String str, boolean z) {
        MsysSettingsImpl_MsysWriteBooleanSetting(str, z);
    }

    private void MsysSettingsImpl_MsysWriteDoubleSettingJNI(String str, double d) {
        throw AnonymousClass001.A0T("Not implemented");
    }

    private void MsysSettingsImpl_MsysWriteInt32SettingJNI(String str, int i) {
        MsysSettingsImpl_MsysWriteInt32Setting(str, i);
    }

    private void MsysSettingsImpl_MsysWriteInt64SettingJNI(String str, long j) {
        MsysSettingsImpl_MsysWriteInt64Setting(str, j);
    }

    private void MsysSettingsImpl_MsysWriteStringSettingJNI(String str, String str2) {
        if (str2 == null) {
            str2 = null;
        }
        MsysSettingsImpl_MsysWriteStringSetting(str, str2);
    }

    public abstract String MsysSettingsImpl_MsysCreateCopyOfStringSetting(String str, String str2);

    public abstract boolean MsysSettingsImpl_MsysReadBooleanSetting(String str, boolean z);

    public abstract double MsysSettingsImpl_MsysReadDoubleSetting(String str, double d);

    public abstract int MsysSettingsImpl_MsysReadInt32Setting(String str, int i);

    public abstract long MsysSettingsImpl_MsysReadInt64Setting(String str, long j);

    public abstract boolean MsysSettingsImpl_MsysReadSettingIsNull(String str);

    public abstract void MsysSettingsImpl_MsysRemoveSetting(String str);

    public abstract void MsysSettingsImpl_MsysWriteBooleanSetting(String str, boolean z);

    public abstract void MsysSettingsImpl_MsysWriteDoubleSetting(String str, double d);

    public abstract void MsysSettingsImpl_MsysWriteInt32Setting(String str, int i);

    public abstract void MsysSettingsImpl_MsysWriteInt64Setting(String str, long j);

    public abstract void MsysSettingsImpl_MsysWriteStringSetting(String str, String str2);
}
