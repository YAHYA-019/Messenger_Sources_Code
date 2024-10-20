package com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.msg;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private int MEMReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalledJNI(String str, String str2) {
        return MEMReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(str, str2);
    }

    private boolean MEMReinstallDataProviderImpl_MEMReinstallDataProviderIsRegistrationIDChangedJNI(String str, String str2) {
        return false;
    }

    private boolean MEMReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstallJNI(String str, String str2, String str3) {
        return MEMReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(str, str2, str3);
    }

    public abstract int MEMReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(String str, String str2);

    public abstract boolean MEMReinstallDataProviderImpl_MEMReinstallDataProviderIsRegistrationIDChanged(String str, String str2);

    public abstract boolean MEMReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(String str, String str2, String str3);
}
