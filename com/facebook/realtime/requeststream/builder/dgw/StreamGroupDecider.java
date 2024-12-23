package com.facebook.realtime.requeststream.builder.dgw;

/* loaded from: StreamGroupDecider.class */
public interface StreamGroupDecider {

    /* loaded from: StreamGroupDecider$StreamGroupDecision.class */
    public class StreamGroupDecision {
        public String groupName;
        public boolean removeStreamGroupOnError;
        public final int streamGroupType;

        public StreamGroupDecision() {
            this.groupName = "";
            this.removeStreamGroupOnError = false;
            this.streamGroupType = 1;
        }

        public StreamGroupDecision(String str) {
            this.removeStreamGroupOnError = false;
            this.streamGroupType = 2;
            this.groupName = str;
        }

        public String getGroupName() {
            return this.groupName;
        }

        public int getStreamGroupType() {
            return this.streamGroupType;
        }

        public void setRemoveStreamGroupOnError(boolean z) {
            this.removeStreamGroupOnError = z;
        }
    }

    StreamGroupDecision getStreamGroupDecision(String str);
}
