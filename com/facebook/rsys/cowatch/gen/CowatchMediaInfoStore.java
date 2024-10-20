package com.facebook.rsys.cowatch.gen;

/* loaded from: CowatchMediaInfoStore.class */
public abstract class CowatchMediaInfoStore {
    public abstract void fetchMedia(String str, String str2, CowatchFetchMediaSuccessCallback cowatchFetchMediaSuccessCallback, CowatchFetchMediaFailureCallback cowatchFetchMediaFailureCallback);

    public abstract void updateMediaLikedState(String str, String str2, boolean z);
}
