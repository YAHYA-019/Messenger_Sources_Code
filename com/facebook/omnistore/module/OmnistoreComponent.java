package com.facebook.omnistore.module;

import X.3qK;
import X.C3qh;
import com.facebook.omnistore.Collection;
import com.facebook.omnistore.Omnistore;

/* loaded from: OmnistoreComponent.class */
public interface OmnistoreComponent extends 3qK {
    String getCollectionLabel();

    void onCollectionAvailable(Collection collection);

    void onCollectionInvalidated();

    C3qh provideSubscriptionInfo(Omnistore omnistore);
}
