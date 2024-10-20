package com.facebook.acra.customdata;

import X.AnonymousClass001;
import java.util.Iterator;
import java.util.Map;

/* loaded from: ProxyCustomDataStore.class */
public class ProxyCustomDataStore implements CustomDataStore {
    public static CustomDataStore dataStore = new ACRACustomDataStore();

    /* loaded from: ProxyCustomDataStore$Holder.class */
    public class Holder {
        public static final ProxyCustomDataStore CUSTOM_DATA = new Object();
    }

    public static ProxyCustomDataStore getInstance() {
        return Holder.CUSTOM_DATA;
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public boolean containsKey(String str) {
        boolean containsKey;
        synchronized (this) {
            containsKey = dataStore.containsKey(str);
        }
        return containsKey;
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public String getCustomData(String str) {
        String customData;
        synchronized (this) {
            customData = dataStore.getCustomData(str);
        }
        return customData;
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public Map getSnapshot() {
        Map snapshot;
        synchronized (this) {
            snapshot = dataStore.getSnapshot();
        }
        return snapshot;
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public void removeCustomData(String str) {
        synchronized (this) {
            dataStore.removeCustomData(str);
        }
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public void setCustomData(String str, String str2, Object... objArr) {
        synchronized (this) {
            dataStore.setCustomData(str, str2, objArr);
        }
    }

    public void setDataStore(CustomDataStore customDataStore) {
        synchronized (this) {
            Iterator A0y = AnonymousClass001.A0y(dataStore.getSnapshot());
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                customDataStore.setCustomData(AnonymousClass001.A0j(A0z), (String) A0z.getValue(), AnonymousClass001.A1Z());
            }
            dataStore = customDataStore;
        }
    }
}
