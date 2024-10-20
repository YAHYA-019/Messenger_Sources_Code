package com.facebook.traffic.knob;

import X.AnonymousClass001;
import java.util.Set;

/* loaded from: HttpHeaderOptions.class */
public final class HttpHeaderOptions {
    public final Set allowListByFieldId;
    public final boolean includeAlternateEstimators;
    public final String prependStr;

    /* loaded from: HttpHeaderOptions$Builder.class */
    public final class Builder {
        public Set allowListByFieldId = AnonymousClass001.A0v();
        public boolean includeAlternateEstimators = false;
        public String prependStr = "";

        public Builder allowListByFieldId(Set set) {
            this.allowListByFieldId = set;
            return this;
        }

        public HttpHeaderOptions build() {
            return new HttpHeaderOptions(this);
        }

        public Builder includeAlternateEstimators(boolean z) {
            this.includeAlternateEstimators = z;
            return this;
        }

        public Builder prependStr(String str) {
            this.prependStr = str;
            return this;
        }
    }

    public HttpHeaderOptions(Builder builder) {
        this.allowListByFieldId = builder.allowListByFieldId;
        this.includeAlternateEstimators = builder.includeAlternateEstimators;
        this.prependStr = builder.prependStr;
    }

    public HttpHeaderOptions(Set set) {
        this.allowListByFieldId = set;
        this.includeAlternateEstimators = false;
        this.prependStr = "x-fb-abr-";
    }

    public Set getAllowListByFieldId() {
        return this.allowListByFieldId;
    }

    public String getPrependStr() {
        return this.prependStr;
    }

    public boolean includeAlternateEstimators() {
        return this.includeAlternateEstimators;
    }
}
