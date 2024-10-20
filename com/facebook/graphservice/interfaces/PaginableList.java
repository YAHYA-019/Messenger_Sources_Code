package com.facebook.graphservice.interfaces;

import X.Kix;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* loaded from: PaginableList.class */
public class PaginableList {
    public static final String MISSING_PAGINATION_KEY = "MISSING_PAGINATION_KEY";
    public final String mEndCursor;
    public final boolean mFailedLastLoadNext;
    public final boolean mFailedLastLoadPrevious;
    public final boolean mHasNextPage;
    public final boolean mHasPreviousPage;
    public final boolean mIsLoadingNext;
    public final boolean mIsLoadingPrevious;
    public boolean mIsPandoBacked = false;
    public final String mNextPageUUID;
    public final String mPaginationKey;
    public final String mPreviousPageUUID;
    public final ImmutableList mTrees;

    public PaginableList(String str, ImmutableList immutableList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, String str4) {
        this.mTrees = immutableList;
        this.mPaginationKey = str == null ? MISSING_PAGINATION_KEY : str;
        this.mHasPreviousPage = z;
        this.mHasNextPage = z2;
        this.mIsLoadingPrevious = z3;
        this.mIsLoadingNext = z4;
        this.mFailedLastLoadPrevious = z5;
        this.mFailedLastLoadNext = z6;
        this.mNextPageUUID = str2;
        this.mPreviousPageUUID = str3;
        this.mEndCursor = str4;
    }

    public static PaginableList withMetadata(ImmutableList immutableList, PaginableList paginableList) {
        PaginableList paginableList2 = new PaginableList(paginableList.mPaginationKey, immutableList, paginableList.mHasPreviousPage, paginableList.mHasNextPage, paginableList.mIsLoadingPrevious, paginableList.mIsLoadingNext, paginableList.mFailedLastLoadPrevious, paginableList.mFailedLastLoadNext, paginableList.mNextPageUUID, paginableList.mPreviousPageUUID, paginableList.mEndCursor);
        if (paginableList.mIsPandoBacked) {
            paginableList2.mIsPandoBacked = true;
        }
        return paginableList2;
    }

    public static PaginableList withoutPaging(ImmutableList immutableList) {
        return new PaginableList(null, immutableList, false, false, false, false, false, false, null, null, null);
    }

    public void appendEdgeWithService(GraphQLService graphQLService, Tree tree) {
        String str = this.mPaginationKey;
        if (str.equals(MISSING_PAGINATION_KEY)) {
            return;
        }
        if (this.mIsPandoBacked) {
            graphQLService.pandoAppendEdgeForKey(str, tree);
        } else {
            graphQLService.appendEdgeForKey(str, tree);
        }
    }

    public boolean failedLastLoadNext() {
        return this.mFailedLastLoadNext;
    }

    public boolean failedLastLoadPrevious() {
        return this.mFailedLastLoadPrevious;
    }

    public String getEndCursorDO_NOT_USE() {
        return this.mEndCursor;
    }

    public ImmutableList getList() {
        return this.mTrees;
    }

    public String getPaginationKey() {
        return this.mPaginationKey;
    }

    public boolean hasNextPage() {
        return this.mHasNextPage;
    }

    public boolean hasPreviousPage() {
        return this.mHasPreviousPage;
    }

    public boolean isLoadingNext() {
        return this.mIsLoadingNext;
    }

    public boolean isLoadingPrevious() {
        return this.mIsLoadingPrevious;
    }

    public GraphQLService.Token loadNextPageWithService(GraphQLService graphQLService, Kix kix, Executor executor) {
        return loadNextPageWithService(graphQLService, kix, executor, "");
    }

    public GraphQLService.Token loadNextPageWithService(GraphQLService graphQLService, Kix kix, Executor executor, String str) {
        String str2 = this.mPaginationKey;
        if (str2.equals(MISSING_PAGINATION_KEY)) {
            return null;
        }
        return this.mIsPandoBacked ? graphQLService.pandoLoadNextPageForKey(str2, kix.A01, kix.A00, false, Collections.unmodifiableMap(Collections.emptyMap()), kix.A02, str, executor) : graphQLService.loadNextPageForKey(str2, kix.A01, kix.A00, false, Collections.unmodifiableMap(Collections.emptyMap()), kix.A02, executor, str, false);
    }

    public GraphQLService.Token loadPreviousPageWithService(GraphQLService graphQLService, Kix kix, Executor executor) {
        return loadPreviousPageWithService(graphQLService, kix, executor, "");
    }

    public GraphQLService.Token loadPreviousPageWithService(GraphQLService graphQLService, Kix kix, Executor executor, String str) {
        String str2 = this.mPaginationKey;
        if (str2.equals(MISSING_PAGINATION_KEY)) {
            return null;
        }
        return this.mIsPandoBacked ? graphQLService.pandoLoadPreviousPageForKey(str2, kix.A01, str, Collections.unmodifiableMap(Collections.emptyMap()), kix.A02, executor) : graphQLService.loadPreviousPageForKey(str2, kix.A01, Collections.unmodifiableMap(Collections.emptyMap()), kix.A02, executor, str, false);
    }

    public String nextPageUUID() {
        return this.mNextPageUUID;
    }

    public void prependEdgeWithService(GraphQLService graphQLService, Tree tree) {
        String str = this.mPaginationKey;
        if (str.equals(MISSING_PAGINATION_KEY)) {
            return;
        }
        if (this.mIsPandoBacked) {
            graphQLService.pandoPrependEdgeForKey(str, tree);
        } else {
            graphQLService.prependEdgeForKey(str, tree);
        }
    }

    public String previousPageUUID() {
        return this.mPreviousPageUUID;
    }

    public void replaceEdgeWithService(GraphQLService graphQLService, Tree tree, String str) {
        String str2 = this.mPaginationKey;
        if (str2.equals(MISSING_PAGINATION_KEY)) {
            return;
        }
        graphQLService.replaceEdgeForKey(str2, tree, str);
    }

    public PaginableList setIsPandoBacked(boolean z) {
        this.mIsPandoBacked = z;
        return this;
    }
}
