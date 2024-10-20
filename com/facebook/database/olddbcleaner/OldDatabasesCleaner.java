package com.facebook.database.olddbcleaner;

import X.11T;
import X.1Bq;
import X.1Br;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;

/* loaded from: OldDatabasesCleaner.class */
public final class OldDatabasesCleaner {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public static final ImmutableList A05 = ImmutableList.of("assetdownload_db", "bookmarks.db", "dash_graphql_cache", "disk_cache_image_histories_db", "fb.db", "graphql", "newsfeed_ranking_db", "non_cached_preferences_db", "notifications.db", "pages_db", "pages_db2", "threads_db", "uploadmanager.db", "users_db", "users_db2", "zero_rating_db", "liger_recent_hosts", "composer_shortcuts_db");
    public static final ImmutableList A04 = ImmutableList.of((Object) "", (Object) "-journal", (Object) "-shm", (Object) "-wal", (Object) "-uid");
    public static final ImmutableList A03 = ImmutableList.of((Object) "-corrupted", (Object) ".back", (Object) ".old");

    public OldDatabasesCleaner() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A00 = A00;
        this.A01 = 1Bq.A00(16616);
        this.A02 = 1Bq.A00(16511);
    }
}
