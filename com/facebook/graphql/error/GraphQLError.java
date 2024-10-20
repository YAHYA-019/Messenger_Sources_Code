package com.facebook.graphql.error;

import X.4YV;
import X.AbN;
import X.AnonymousClass001;
import X.C5om;
import X.DKG;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.http.protocol.ApiErrorResult;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: GraphQLError.class */
public class GraphQLError extends ApiErrorResult {
    public static final Parcelable.Creator CREATOR = FKX.A00(82);
    public final int apiErrorCode;
    public final int code;
    public final String debugInfo;
    public final String description;
    public final String fbRequestId;
    public final long helpCenterId;
    public final boolean isSilent;
    public final boolean isTransient;
    public final String queryPath;
    public final boolean requiresReauth;
    public final ImmutableMap sentryBlockUserInfo;
    public final String severity;
    public final String summary;

    public GraphQLError() {
        this(null, null, null, null, null, null, -1, -1, -1, false, false, false);
    }

    public GraphQLError(Parcel parcel) {
        super(parcel);
        this.code = parcel.readInt();
        this.apiErrorCode = parcel.readInt();
        this.summary = parcel.readString();
        this.description = parcel.readString();
        this.isSilent = AbN.A1U(parcel);
        this.isTransient = AbN.A1U(parcel);
        this.fbRequestId = parcel.readString();
        this.requiresReauth = AbN.A1U(parcel);
        this.debugInfo = parcel.readString();
        this.queryPath = parcel.readString();
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) AnonymousClass001.A0u());
        this.sentryBlockUserInfo = copyOf;
        parcel.readMap(copyOf, ImmutableMap.class.getClassLoader());
        this.severity = parcel.readString();
        this.helpCenterId = parcel.readLong();
    }

    public GraphQLError(ImmutableMap immutableMap, String str, String str2, String str3, String str4, String str5, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        super(C5om.GRAPHQL_KERROR_DOMAIN, str2, str4, null, null, null, str3, str, i, 0, z2);
        this.code = i;
        this.apiErrorCode = i2;
        this.summary = str;
        this.description = str2;
        this.isSilent = z;
        this.isTransient = z2;
        this.fbRequestId = str3;
        this.requiresReauth = z3;
        this.debugInfo = str4;
        this.queryPath = null;
        this.sentryBlockUserInfo = immutableMap;
        this.severity = str5;
        this.helpCenterId = j;
    }

    @Override // com.facebook.http.protocol.ApiErrorResult
    public int A00() {
        int i = this.code;
        if (i == -1) {
            i = this.mErrorCode;
        }
        return i;
    }

    @Override // com.facebook.http.protocol.ApiErrorResult
    public C5om A01() {
        return C5om.GRAPHQL_KERROR_DOMAIN;
    }

    @Override // com.facebook.http.protocol.ApiErrorResult
    public String A02() {
        String str = this.debugInfo;
        if (str == null) {
            str = this.mErrorData;
        }
        return str;
    }

    @Override // com.facebook.http.protocol.ApiErrorResult
    public String A03() {
        String str = this.description;
        if (str == null) {
            str = this.mErrorMessage;
        }
        return str;
    }

    @Override // com.facebook.http.protocol.ApiErrorResult
    public String A04() {
        return A03();
    }

    @Override // com.facebook.http.protocol.ApiErrorResult
    public String A05() {
        String str = this.fbRequestId;
        if (str == null) {
            str = this.mFbRequestId;
        }
        return str;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof GraphQLError) {
            if (obj == this) {
                return true;
            }
            GraphQLError graphQLError = (GraphQLError) obj;
            if (DKG.A1Z(graphQLError.code, Integer.valueOf(this.code))) {
                if (DKG.A1Z(graphQLError.apiErrorCode, Integer.valueOf(this.apiErrorCode)) && Objects.equal(this.summary, graphQLError.summary) && Objects.equal(this.description, graphQLError.description) && Objects.equal(Boolean.valueOf(this.isSilent), Boolean.valueOf(graphQLError.isSilent)) && Objects.equal(Boolean.valueOf(this.isTransient), Boolean.valueOf(graphQLError.isTransient)) && Objects.equal(this.fbRequestId, graphQLError.fbRequestId) && Objects.equal(Boolean.valueOf(this.requiresReauth), Boolean.valueOf(graphQLError.requiresReauth)) && Objects.equal(this.debugInfo, graphQLError.debugInfo) && Objects.equal(this.queryPath, graphQLError.queryPath) && Objects.equal(this.sentryBlockUserInfo, graphQLError.sentryBlockUserInfo) && Objects.equal(this.severity, graphQLError.severity)) {
                    z = 4YV.A1Z(Long.valueOf(this.helpCenterId), Long.valueOf(graphQLError.helpCenterId));
                }
            }
        }
        return z;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(GraphQLError.class);
        stringHelper.add("code", this.code);
        stringHelper.add("api_error_code", this.apiErrorCode);
        stringHelper.add("summary", this.summary);
        stringHelper.add("description", this.description);
        stringHelper.add("is_silent", this.isSilent);
        stringHelper.add("requires_reauth", this.requiresReauth);
        stringHelper.add("debug_info", this.debugInfo);
        stringHelper.add("query_path", this.queryPath);
        stringHelper.add("sentry_block_user_info", this.sentryBlockUserInfo);
        stringHelper.add("severity", this.severity);
        stringHelper.add("help_center_id", this.helpCenterId);
        return stringHelper.toString();
    }

    @Override // com.facebook.http.protocol.ApiErrorResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.code);
        parcel.writeInt(this.apiErrorCode);
        parcel.writeString(this.summary);
        parcel.writeString(this.description);
        parcel.writeInt(this.isSilent ? 1 : 0);
        parcel.writeInt(this.isTransient ? 1 : 0);
        parcel.writeString(this.fbRequestId);
        parcel.writeInt(this.requiresReauth ? 1 : 0);
        parcel.writeString(this.debugInfo);
        parcel.writeString(this.queryPath);
        parcel.writeMap(this.sentryBlockUserInfo);
        parcel.writeString(this.severity);
        parcel.writeLong(this.helpCenterId);
    }
}
