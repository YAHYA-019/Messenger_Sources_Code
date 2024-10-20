package com.facebook.acra.customdata;

import X.AnonymousClass001;
import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: ACRACustomDataStore.class */
public class ACRACustomDataStore implements CustomDataStore {
    public final Map mInstanceCustomParameters = new TreeMap();

    @Override // com.facebook.acra.customdata.CustomDataStore
    public boolean containsKey(String str) {
        return this.mInstanceCustomParameters.containsKey(str);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public String getCustomData(String str) {
        return AnonymousClass001.A0b(str, this.mInstanceCustomParameters);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public Map getSnapshot() {
        return new TreeMap(this.mInstanceCustomParameters);
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public void removeCustomData(String str) {
        if (str != null) {
            this.mInstanceCustomParameters.remove(str);
        }
    }

    @Override // com.facebook.acra.customdata.CustomDataStore
    public void setCustomData(String str, String str2, Object... objArr) {
        if (str != null) {
            if (str2 == null) {
                removeCustomData(str);
                return;
            }
            if (objArr.length > 0) {
                StringBuilder A0k = AnonymousClass001.A0k();
                Formatter formatter = new Formatter(A0k);
                formatter.format(str2, objArr);
                formatter.close();
                str2 = A0k.toString();
            }
            this.mInstanceCustomParameters.put(str, str2);
        }
    }
}
