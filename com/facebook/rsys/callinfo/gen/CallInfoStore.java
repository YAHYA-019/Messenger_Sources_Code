package com.facebook.rsys.callinfo.gen;

import java.util.ArrayList;

/* loaded from: CallInfoStore.class */
public abstract class CallInfoStore {
    public abstract void readCallInfo(String str, boolean z, CallInfoReadCallback callInfoReadCallback);

    public abstract void readUserProfiles(ArrayList arrayList, String str, UserProfilesReadCallback userProfilesReadCallback);

    public abstract void registerObserver(CallInfoObserver callInfoObserver);

    public abstract void unregisterObserver(CallInfoObserver callInfoObserver);
}
