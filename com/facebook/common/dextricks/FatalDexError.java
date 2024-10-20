package com.facebook.common.dextricks;

/* loaded from: FatalDexError.class */
public final class FatalDexError extends Error {
    public FatalDexError() {
    }

    public FatalDexError(String str) {
        super(str);
    }

    public FatalDexError(String str, Throwable th) {
        super(str, th);
    }

    public FatalDexError(Throwable th) {
        super(th);
    }
}
