package com.facebook.msys.mcp.settingsplugin;

import X.AnonymousClass001;
import X.C1rm;
import com.facebook.inject.FbInjector;

/* loaded from: MsysSettingsPluginSessionless.class */
public class MsysSettingsPluginSessionless extends Sessionless {
    private C1rm getSharedSettings() {
        if (C1rm.A00() == null) {
            C1rm.A01(FbInjector.A00());
        }
        return C1rm.A00();
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public String MsysSettingsImpl_MsysCreateCopyOfStringSetting(String str, String str2) {
        return getSharedSettings().A00.getString(str, str2);
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public boolean MsysSettingsImpl_MsysReadBooleanSetting(String str, boolean z) {
        return getSharedSettings().A00.getBoolean(str, z);
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public double MsysSettingsImpl_MsysReadDoubleSetting(String str, double d) {
        throw AnonymousClass001.A0T("Not implemented");
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public int MsysSettingsImpl_MsysReadInt32Setting(String str, int i) {
        return (int) getSharedSettings().A00.getLong(str, i);
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public long MsysSettingsImpl_MsysReadInt64Setting(String str, long j) {
        return getSharedSettings().A00.getLong(str, j);
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public boolean MsysSettingsImpl_MsysReadSettingIsNull(String str) {
        return !getSharedSettings().A00.contains(str);
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public void MsysSettingsImpl_MsysRemoveSetting(String str) {
        getSharedSettings().A00.edit().remove(str).apply();
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteBooleanSetting(String str, boolean z) {
        getSharedSettings().A00.edit().putBoolean(str, z).apply();
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteDoubleSetting(String str, double d) {
        throw AnonymousClass001.A0T("Not implemented");
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteInt32Setting(String str, int i) {
        getSharedSettings().A00.edit().putLong(str, i).apply();
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteInt64Setting(String str, long j) {
        getSharedSettings().A00.edit().putLong(str, j).apply();
    }

    @Override // com.facebook.msys.mcp.settingsplugin.Sessionless
    public void MsysSettingsImpl_MsysWriteStringSetting(String str, String str2) {
        getSharedSettings().A00.edit().putString(str, str2).apply();
    }
}
