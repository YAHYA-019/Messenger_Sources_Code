package com.facebook.contacts;

/* loaded from: ContactSurface.class */
public enum ContactSurface {
    GROWTH_CONTACT_IMPORTER,
    MESSENGER,
    OTHERS;

    public static ContactSurface fromString(String str) {
        ContactSurface contactSurface = GROWTH_CONTACT_IMPORTER;
        if (!"GROWTH_CONTACT_IMPORTER".equals(str)) {
            contactSurface = MESSENGER;
            if (!"MESSENGER".equals(str)) {
                contactSurface = OTHERS;
            }
        }
        return contactSurface;
    }
}
