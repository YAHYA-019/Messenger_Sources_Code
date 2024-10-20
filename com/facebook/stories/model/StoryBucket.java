package com.facebook.stories.model;

import X.0Q8;
import X.ES1;

/* loaded from: StoryBucket.class */
public abstract class StoryBucket extends ES1 {
    public StoryBucket() {
        throw 0Q8.createAndThrow();
    }

    public abstract int getBucketType();

    public abstract String getId();

    public abstract AudienceControlData getOwner();

    public abstract String getTrackingString();
}
