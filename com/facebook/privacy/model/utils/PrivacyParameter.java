package com.facebook.privacy.model.utils;

/* loaded from: PrivacyParameter.class */
public final class PrivacyParameter {
    public final String allow;
    public final String deny;
    public final String friends;
    public final Settings settings;
    public final String value;

    /* loaded from: PrivacyParameter$Settings.class */
    public final class Settings {
        public final boolean noTagExpansion = false;

        public Settings() {
        }

        public Settings(boolean z) {
        }
    }

    public PrivacyParameter() {
        this.value = null;
        this.allow = null;
        this.deny = null;
        this.friends = null;
        this.settings = null;
    }

    public PrivacyParameter(String str, String str2, String str3, String str4) {
        this.value = str4;
        this.allow = str;
        this.deny = str2;
        this.settings = new Settings(true);
        this.friends = str3;
    }
}
