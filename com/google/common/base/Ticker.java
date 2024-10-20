package com.google.common.base;

/* loaded from: Ticker.class */
public abstract class Ticker {
    public static final Ticker SYSTEM_TICKER = new Ticker() { // from class: com.google.common.base.Ticker.1
        @Override // com.google.common.base.Ticker
        public long read() {
            return System.nanoTime();
        }
    };

    public abstract long read();
}
