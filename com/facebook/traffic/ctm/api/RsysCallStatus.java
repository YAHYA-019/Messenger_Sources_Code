package com.facebook.traffic.ctm.api;

/* loaded from: RsysCallStatus.class */
public class RsysCallStatus {
    public final long heartbeatMs;
    public final State state;

    /* loaded from: RsysCallStatus$Builder.class */
    public final class Builder {
        public State state = State.ENDED;
        public long heartbeatMs = 0;

        public RsysCallStatus build() {
            return new RsysCallStatus(this);
        }

        public Builder heartbeatMs(long j) {
            this.heartbeatMs = j;
            return this;
        }

        public Builder state(State state) {
            this.state = state;
            return this;
        }
    }

    /* loaded from: RsysCallStatus$State.class */
    public enum State {
        ONGOING,
        ENDED
    }

    public RsysCallStatus(Builder builder) {
        this.state = builder.state;
        this.heartbeatMs = builder.heartbeatMs;
    }

    public long getHeartbeatMs() {
        return this.heartbeatMs;
    }

    public State getState() {
        return this.state;
    }
}
