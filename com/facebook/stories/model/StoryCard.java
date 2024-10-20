package com.facebook.stories.model;

import X.0Q8;
import X.ES1;
import X.HDp;
import X.J4n;
import com.facebook.graphql.enums.GraphQLOptimisticUploadState;
import java.util.Comparator;

/* loaded from: StoryCard.class */
public abstract class StoryCard extends ES1 {
    public static final Comparator A00 = J4n.A00;

    public StoryCard() {
        throw 0Q8.createAndThrow();
    }

    public abstract String getCacheId();

    public abstract String getId();

    public abstract HDp getMedia();

    public abstract String getPreviewUrl();

    public abstract String getStoryCardIdUnencoded();

    public abstract long getTimestamp();

    public abstract GraphQLOptimisticUploadState getUploadState();
}
