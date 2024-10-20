package com.facebook.omnistore;

import X.AnonymousClass001;
import java.util.List;

/* loaded from: IndexedFields.class */
public class IndexedFields {
    public final List mEntries = AnonymousClass001.A0s();

    /* loaded from: IndexedFields$IndexEntry.class */
    public class IndexEntry {
        public final String key;
        public final String value;

        public IndexEntry(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public void addFieldValue(String str, String str2) {
        this.mEntries.add(new IndexEntry(str, str2));
    }
}
