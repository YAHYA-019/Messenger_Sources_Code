package com.facebook.traffic.knob;

import X.AnonymousClass001;
import java.util.Set;

/* loaded from: DebugStrOptions.class */
public final class DebugStrOptions {
    public final Set allowListByFieldId;

    /* loaded from: DebugStrOptions$Builder.class */
    public final class Builder {
        public Set allowListByFieldId = AnonymousClass001.A0v();

        public Builder allowListByFieldId(Set set) {
            this.allowListByFieldId = set;
            return this;
        }

        public DebugStrOptions build() {
            return new DebugStrOptions(this);
        }
    }

    public DebugStrOptions(Builder builder) {
        this.allowListByFieldId = builder.allowListByFieldId;
    }

    public DebugStrOptions(Set set) {
        this.allowListByFieldId = set;
    }

    public Set getAllowListByFieldId() {
        return this.allowListByFieldId;
    }
}
