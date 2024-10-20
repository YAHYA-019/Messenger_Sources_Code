package com.facebook.smartcapture.logging;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: InMemoryLogger.class */
public final class InMemoryLogger {
    public JSONArray log;
    public final SmartCaptureLogger logger;
    public final long referenceTime;
    public final TimestampProvider timestamp;

    /* loaded from: InMemoryLogger$LogEntryBuilder.class */
    public final class LogEntryBuilder {
        public final RoundingMode TIMESTAMP_ROUNDING_MODE;
        public final int TIMESTAMP_SCALE;
        public final String event;
        public final JSONObject json;
        public final /* synthetic */ InMemoryLogger this$0;

        public LogEntryBuilder(InMemoryLogger inMemoryLogger, String str, float f) {
            11T.A0F(str, 2);
            this.this$0 = inMemoryLogger;
            this.event = str;
            this.TIMESTAMP_SCALE = 3;
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            this.TIMESTAMP_ROUNDING_MODE = roundingMode;
            JSONObject A12 = AnonymousClass001.A12();
            this.json = A12;
            try {
                A12.put(str, BigDecimal.valueOf(f).setScale(3, roundingMode));
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
            }
        }

        public final LogEntryBuilder put(String str, int i) {
            11T.A0F(str, 0);
            try {
                this.json.put(str, i);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final LogEntryBuilder put(String str, Object obj) {
            11T.A0F(str, 0);
            try {
                this.json.put(str, obj);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final LogEntryBuilder put(String str, String str2) {
            11T.A0F(str, 0);
            try {
                this.json.put(str, str2);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final LogEntryBuilder put(String str, boolean z) {
            11T.A0F(str, 0);
            try {
                this.json.put(str, z);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final void submit() {
            this.this$0.logJson(this.json);
        }
    }

    public InMemoryLogger(SmartCaptureLogger smartCaptureLogger) {
        11T.A0F(smartCaptureLogger, 1);
        this.log = new JSONArray();
        this.timestamp = TimestampProvider.INSTANCE;
        this.logger = smartCaptureLogger;
        this.referenceTime = System.currentTimeMillis();
    }

    public InMemoryLogger(SmartCaptureLogger smartCaptureLogger, TimestampProvider timestampProvider) {
        1BL.A1F(smartCaptureLogger, timestampProvider);
        this.log = new JSONArray();
        this.timestamp = timestampProvider;
        this.logger = smartCaptureLogger;
        this.referenceTime = System.currentTimeMillis();
    }

    public final LogEntryBuilder addEntry(String str) {
        11T.A0F(str, 0);
        return new LogEntryBuilder(this, str, ((float) (System.currentTimeMillis() - this.referenceTime)) / 1000.0f);
    }

    public final void clear() {
        synchronized (this) {
            this.log = new JSONArray();
        }
    }

    public final void logJson(JSONObject jSONObject) {
        synchronized (this) {
            11T.A0F(jSONObject, 0);
            this.log.put(jSONObject);
        }
    }

    public final void logJsonError(String str, JSONException jSONException) {
        11T.A0F(str, 0);
        this.logger.logError(str, jSONException);
    }

    public String toString() {
        String A02;
        synchronized (this) {
            A02 = 11T.A02(this.log);
        }
        return A02;
    }
}
